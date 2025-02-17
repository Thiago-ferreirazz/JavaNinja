package Condicoes;

public class Ternarios {
    public static void main(String[] args) {
            short numeroDeMissoes = 1;
            String nivel = (numeroDeMissoes) >= 10 ?"Esse ninja está com mais de 10 missões" : "Esse ninja está com menos de 10 missões";
            System.out.println(nivel);
            int resultado = (5 > 3) ? 10 : 20;
    }
}
