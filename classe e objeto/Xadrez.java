public class Xadrez {
    private String casa;
    private String cor;
    private String peca;
    
    public Xadrez(String casa, String cor, String peca) {
        this.casa = casa;
        this.cor = cor;
        this.peca = peca;
    }
    public String getCasa() {
        return casa;
    }
    public void setCasa(String casa) {
        this.casa = casa;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getPeca() {
        return peca;
    }
    public void setPeca(String peca) {
        this.peca = peca;
    }
    public void win(){
        System.out.println("Checkmate");
    }
    public void gambitoDaRainha(){
        System.out.println("Fez o gambito da rainha");
    }
    public void passante(){
        System.out.println("fez a jogada mais daora do jogo o Passante");
    }
}
