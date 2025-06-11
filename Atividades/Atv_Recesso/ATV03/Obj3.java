package ATIVIADES_RECESSO.ATV03;

public class Obj3 {

    private double nota01, nota02, nota03;

    public Obj3(double nota01, double nota02, double nota03) {
        this.nota01 = nota01;
        this.nota02 = nota02;
        this.nota03 = nota03;
    }

    public double cnfinal() {
        double resultado = nota01+nota02+nota03;
        return resultado;
    }


    public String Aprovacao(){
        double resultado = cnfinal();
        String r;

        if(resultado > 60.0){
            r = "PASS";
        }else{
            r = "FAILED";
        }
        return r;
    }

    public String quantospontosfaltam(){
        double resultado = cnfinal();
            resultado = 60.0 - resultado;
        String r = "MISSING " + resultado + " POINTS";
        return r;
    }

}