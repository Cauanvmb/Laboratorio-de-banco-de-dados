public class Casa {
    private int numero;
    private int cep;
    private String dono;

    public Casa(int numero, int cep, String dono){
        this.numero = numero;
        this.cep = cep;
        this.dono = dono;

    }
    public int getnumero(){
        return numero;
    }
    public int cep(){
        return cep;
    }
    public String dono(){
        return dono;
    }
    public void entrar() {
        System.out.println("Entrou na casa.");
    }
    
    public void saiu() {
        System.out.println("Saiu da casa.");
    }
    
    public void correio() {
        System.out.println("Verificou o correio.");
    }
}    

    
