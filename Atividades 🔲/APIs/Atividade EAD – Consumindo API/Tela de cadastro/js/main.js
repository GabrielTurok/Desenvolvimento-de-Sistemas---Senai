'use strict';

const limparFormulario = () => {
    document.getElementById('endereco').value = '';
    document.getElementById('bairro').value = '';
    document.getElementById('cidade').value = '';
    document.getElementById('estado').value = '';
};

const preencherFormulario = (endereco) => {
    document.getElementById('endereco').value = endereco.logradouro;
    document.getElementById('bairro').value = endereco.bairro;
    document.getElementById('cidade').value = endereco.localidade;
    document.getElementById('estado').value = endereco.uf;
};

const eNumero = (numero) => /^[0-9]+$/.test(numero);

const cepValido = (cep) => cep.length === 8 && eNumero(cep);

const pesquisarCep = async () => {
    limparFormulario();

    const cep = document.getElementById('cep').value.replace(/\D/g, '');
    const url = `https://viacep.com.br/ws/${cep}/json/`;

    if (cepValido(cep)) {
        try {
            const resposta = await fetch(url);
            const endereco = await resposta.json();

            if (endereco.hasOwnProperty('erro')) {
                document.getElementById('endereco').value = 'CEP não encontrado!';
            } else {
                preencherFormulario(endereco);
            }
        } catch (erro) {
            document.getElementById('endereco').value = 'Erro ao buscar o CEP!';
            console.error(erro);
        }
    } else {
        document.getElementById('endereco').value = 'CEP incorreto!';
    }
};

document.addEventListener('DOMContentLoaded', () => {
    document.getElementById('cep')
            .addEventListener('focusout', pesquisarCep);
});
