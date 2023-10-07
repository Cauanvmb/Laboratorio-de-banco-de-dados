public class Cachorro {
    private String nome;
    private String cor;
    private String raca;

    public Cachorro(String nome, String cor, String raca){
        this.nome = nome;
        this.cor = cor;
        this.raca = raca;

    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getRaca() {
        return raca;
    }

    public void correrAtrasDaMoto(){
        System.out.println("O caramelo saiu correndo atrás da moto");
    }
    public void darPatinha(){
        System.out.println("deu a patinha, que belezinha");
    }
        public void sentar(){
        System.out.println("sentou, que belezinha");
    }

}