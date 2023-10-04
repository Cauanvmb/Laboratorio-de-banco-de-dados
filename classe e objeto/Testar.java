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
        Short meuShort = new Short("douradinho", "Furado", "Jeans");
        meuShort.braguilha();
        meuShort.rasgou();
        meuShort.vestiu();
        Xadrez meuxadrez = new Xadrez("h7", "pretas", "cavalo");
        meuxadrez.passante();
        meuxadrez.gambitoDaRainha();
        meuxadrez.win();
        Pokemon meupokemon = new Pokemon("charmander", "brasa", "fogo");
        meupokemon.skill();
        Cheiro cheiroDaGarotaChamadaAgar = new Cheiro("CC", "Verde", "CC");
        cheiroDaGarotaChamadaAgar.fedendo();
        Moto minhaMoto = new Moto("mitsubish", "preto", 2005 );
        minhaMoto.darGrau();
        Cachorro meuCachorro = new Cachorro("caramelo", "Caramelo", "Vira-lata (Caramelo)");
        meuCachorro.correrAtrasDaMoto();
    }
}