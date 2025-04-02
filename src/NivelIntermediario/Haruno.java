package NivelIntermediario;

public class Haruno extends Ninja{
    public void CuraAtivada(){
        System.out.println("A cura foi ativada");
    }
    @Override
    public String HabilidadeEspecial() {
        return  "Me chamo" + nome + "e essa é minha habilidade especial Haruno, super força";
    }

}



