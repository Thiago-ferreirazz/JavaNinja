package NivelIntermediario;

public class Ninja {
    String nome;
    String aldeia;
    int idade;

// Criar um metodo
    public void SharinganAtivado(){
        System.out.println("O Sharingan foi ativado");
    }

    public String EuSouUmNinja(String nome,int idade) {

        return "Eu sou um ninja, me chamo" + nome + " e tenho " + idade + " anos";
    }
}
