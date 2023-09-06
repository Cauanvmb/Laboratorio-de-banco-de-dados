public class Short{
    private String ziper;
    private String bolso;
    private String tecido;

    public Short(String ziper, String bolso, String tecido){
        this.ziper = ziper;
        this.bolso = bolso;
        this.tecido = tecido;

    }
    public void setZiper(String ziper) {
        this.ziper = ziper;
    }
    public void setBolso(String bolso) {
        this.bolso = bolso;
    }
    public void setTecido(String tecido) {
        this.tecido = tecido;
    }
    public String getZiper(){
        return ziper;
    }
    public String getBolso(){
        return bolso;
    }
    public String getTecido(){
        return tecido;
    }
    public void braguilha() {
        System.out.println("você ouve do seu colega que seu zíper está aberto fica com vergonha e fecha");
    }
    
    public void rasgou() {
        System.out.println("foi abaixar para pegar algo no chão e ouviu sua calça rasgando");
    }
    
    public void vestiu() {
        System.out.println("Vestiu a calça");
    }


}