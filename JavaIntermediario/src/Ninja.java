public class Ninja {

    String nome;
    String aldeia;
    int idade;

    public void SharinganAtivado(){
        System.out.println("O Sharingar Ativou");
    }

    public String BoasVindas(){
        return "Oi, Meu nome é Sasuke e eu sou um Ninja Vingador";
    }

    public int AnosParaSerHokage(int idadeMininaParaSerHokage){
        return idadeMininaParaSerHokage - idade;
    }

}
