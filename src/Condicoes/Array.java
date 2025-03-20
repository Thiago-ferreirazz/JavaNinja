package Condicoes;

public class Array {
    public static void main(String[] args) {
        String [] ninjas = new String[4];
        ninjas[0] = "Naruto Uzumaki";
        ninjas[1] = "Sakura Haruno";
        ninjas[2] = "Sasuke Uchiha";
        ninjas[3] = "Hinata Hyuga";

        for (int i = 0; i < ninjas.length; i++) {
            System.out.println(ninjas[i] + "é o " + (i+1)+ "° ninja");
        }
        //Two dimensional Array
        String [][] ninjasEAldeias = new String[3][3];

        ninjasEAldeias[0][0] = "Konoha";
        ninjasEAldeias[0][1] = "Naruto Uzumaki";
        ninjasEAldeias[0][2] = "Sasuke Uchiha";

        ninjasEAldeias[1][0] = "Nevoa";
        ninjasEAldeias[1][1] = "Zabuza";
        ninjasEAldeias[1][2] = "Haku";

        ninjasEAldeias[2][0] = "Deserto";
        ninjasEAldeias[2][1] = "Gaara";
        ninjasEAldeias[2][2] = "Temari";

        for (int y = 0; y < ninjasEAldeias.length; y++) {
            for (int i = 0; i < ninjasEAldeias.length; i++) {
                System.out.println("Aldeia " + ninjasEAldeias[y][i]);
            }
        }
    }
}
