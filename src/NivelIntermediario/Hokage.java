package NivelIntermediario;

public class Hokage {
    String nome;
    int idade;
    Boolean vivo;


    public Hokage(int idade, String nome, Boolean vivo) {
        this.idade = idade;
        this.nome = nome;
        this.vivo = vivo;
    }
     public void MostrarInfos(){
         System.out.println(nome);
         System.out.println(idade);
         if (vivo){
             System.out.print(nome + " está vivo!");
         } else{
             System.out.println(nome + " está morto!");
         }

     }






}





