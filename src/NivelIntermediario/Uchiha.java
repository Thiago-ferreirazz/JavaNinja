package NivelIntermediario;

public class Uchiha extends Ninja {
    public void SharinganAtivado(){
        System.out.println("O Sharingan foi ativado");
    }
    @Override
    public String HabilidadeEspecial() {
        return  "Me chamo " + nome + " e essa é minha habilidade especial Uchiha, um ataque de fogo";
    }
}
