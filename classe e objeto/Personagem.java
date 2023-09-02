public class Personagem {
    private String habilidade;
    private String passiva;
    private String suprema;

    public Personagem(String habilidade, String passiva, String suprema){
        this.habilidade = habilidade;
        this.passiva = passiva;
        this.suprema = suprema;

    }
    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }
    public void setpassiva(String passiva) {
        this.passiva = passiva;
    }
    public void setSuprema(String suprema) {
        this.suprema = suprema;
    }
    public String getHabilidade(){
        return habilidade;
    }
    public String getPassiva(){
        return passiva;
    }
    public String getSuprema(){
        return suprema;
    }
    public void usouHabilidade() {
        System.out.println("Usou habilidade");
    }
    
    public void usouPassiva() {
        System.out.println("Ativou a passiva");
    }
    
    public void usouSuprema() {
        System.out.println("Usou a suprema");
    }

}
