package NivelFacil;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        int numeroDeClones = 1;
        int numeroMaximoDeClones = 40;

//        while (numeroDeClones <= numeroMaximoDeClones) {
//            System.out.println(String.format("O Naruto fez %d clone%s das sombras", numeroDeClones, numeroDeClones == 1 ? "" : "s"));
//            numeroDeClones++;
//        }


        for (int i = 1; i <= 40; i++) {
            System.out.printf("O Naruto fez %d clone%s das sombras%n", i, i == 1 ? "" : "s");
        }
}}
