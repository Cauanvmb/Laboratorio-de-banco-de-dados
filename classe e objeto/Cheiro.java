public class Cheiro {
    private String nome;
    private String cor;
    private String odor;
    
    public Cheiro(String nome, String cor, String odor) {
        this.nome = nome;
        this.cor = cor;
        this.odor = odor;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getOdor() {
        return odor;
    }
    public void setOdor(String odor) {
        this.odor = odor;
    }

    public void fedendo(){
        System.out.println("tem um cheiro ruim no ar");
    }
    public void cheiroso(){
        System.out.println("Cauan está deveras cheiroso");
    }
    public void pum(){
        System.out.println("soltaram um fedido, que fedo");
    }
}