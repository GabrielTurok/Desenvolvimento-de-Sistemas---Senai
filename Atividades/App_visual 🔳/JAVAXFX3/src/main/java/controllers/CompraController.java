package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CompraController {

    @FXML
    private TextField salarioTextField;

    @FXML
    private TextField valorProdutoTextField;

    @FXML
    private TextField numeroParcelasTextField;

    @FXML
    private Label resultadoLabel;

    @FXML
    protected void calcular() {
        double salarioMensal = Double.parseDouble(salarioTextField.getText());
        double valorProduto = Double.parseDouble(valorProdutoTextField.getText());
        int numeroParcelas = Integer.parseInt(numeroParcelasTextField.getText());
        double valorParcela = (valorProduto / numeroParcelas);

        if (valorParcela <= salarioMensal / 10) {
            resultadoLabel.setText("A compra pode ser feita em " + numeroParcelas + " parcelas de R$ " + valorParcela);
        } else {
            resultadoLabel.setText("A compra não pode ser feita, pois as parcelas excedem o limite de 10% do salário.");
        }
    }
}
