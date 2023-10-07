public class Pokemon {
    private String nome;
    private String habilidade;
    private String tipo;

    public Pokemon(String nome, String habilidade, String tipo) {
        this.nome = nome;
        this.habilidade = habilidade;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void skill(){
        System.out.println("usando ataque");
    }
    public void evoluiu(){
        System.out.println("seu pokemon evoluiu");
    }
    public void perdeu(){
        System.out.println("seu pokemon foi derrotado");
    }
}