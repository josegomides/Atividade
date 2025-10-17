package atividadegit1;

public class VerificadorVoto {
    private int idade;
    
    //construtor
    public VerificadorVoto(int idade) {
    this.idade = idade;
}
    public void podeVotar (){
        
        if (idade >= 16) {
            System.out.println("PODE VOTAR");
        } else {
            System.out.println("NAO PODE VOTAR");
        }
        
    }
}
