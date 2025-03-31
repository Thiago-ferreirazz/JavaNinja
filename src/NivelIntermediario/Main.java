package NivelIntermediario;

public class Main {

    public static void main(String[] args) {
        Ninja Naruto = new Ninja();

        Naruto.nome = "Naruto uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 15;

        Ninja Sakura = new Ninja();

        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 16;

        Uchiha Sasuke = new Uchiha();

        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 17;

        Sasuke.SharinganAtivado();

        System.out.println( Sasuke.EuSouUmNinja(Sasuke.nome, Sasuke.idade));

    }
}
