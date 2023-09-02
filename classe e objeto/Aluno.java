public class Aluno {
    private String nome;
    private String materia;
    private String nota;

    public Aluno(String nome, String materia, String nota){
        this.nome = nome;
        this.materia = materia;
        this.nota = nota;

    }
    public void setnome(String nome) {
        this.nome = nome;
    }
    public void setmateria(String materia) {
        this.materia = materia;
    }
    public void setnota(String nota) {
        this.nota = nota;
    }
    public String getnome(){
        return nome;
    }
    public String getmateria(){
        return materia;
    }
    public String getnota(){
        return nota;
    }
    public void deuPescada() {
        System.out.println("Quase dormiu na aula");
    }
    
    public void foiTomarAgua() {
        System.out.println("aluno deu uma levantada pra tomar agua porque tava quase dormindo");
    }
    
    public void tirouNota() {
        System.out.println("Aluno está chorando nota porque deu ruim");
    }


}
