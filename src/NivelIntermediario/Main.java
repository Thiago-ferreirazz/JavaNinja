package NivelIntermediario;

public class Main {

    public static void main(String[] args) {
        Ninja Naruto = new Ninja();

        Naruto.nome = "Naruto uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 15;
        System.out.println(Naruto.HabilidadeEspecial());


        Uchiha Sasuke = new Uchiha();

        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 17;

        Sasuke.SharinganAtivado();
        System.out.println(Sasuke.HabilidadeEspecial());

        Haruno Sakura = new Haruno();

        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 17;

        Sakura.CuraAtivada();
        Sakura.HabilidadeEspecial();

        Sarada Sarada = new Sarada();
        Sarada.nome = "Sarada Haruno Uchiha";
        Sarada.aldeia = "Aldeia da Folha";
        Sarada.idade = 11;



    }
}
