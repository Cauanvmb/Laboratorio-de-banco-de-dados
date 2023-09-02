public class Testar{
    public static void main(String[] args) {
        Casa minhaCasa = new Casa(123, 12211123, "Adriana");
        minhaCasa.entrar();
        minhaCasa.saiu();
        minhaCasa.correio();
        Carro meuCarro = new Carro("29018nsck", 200, "cauan");
        meuCarro.dirigir();
        meuCarro.alarme();
        meuCarro.freiada();
        Personagem meuPersonagem = new Personagem("dash", "cura automática", "Super tiro");
        meuPersonagem.usouHabilidade();
        meuPersonagem.usouPassiva();
        meuPersonagem.usouSuprema();
        Aluno meuAluno = new Aluno("Cauan", "Matemática Discreta", "zero");
        meuAluno.deuPescada();
        meuAluno.foiTomarAgua();
        meuAluno.tirouNota();
    
    
    }


    }