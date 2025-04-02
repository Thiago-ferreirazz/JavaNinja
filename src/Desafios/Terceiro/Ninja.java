package Desafios.Terceiro;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String status;

    public Ninja(int idade, String nome, String missao, String status) {
        this.idade = idade;
        this.nome = nome;
        this.missao = missao;
        this.status = status;
    }

    public void mostrarInformacoes(){
        System.out.print(nome);
        System.out.println(idade);
        System.out.println(missao);
        System.out.println(status);
    }




}
