public class Main {
    public static void main(String[] args) {

        //------------Naruto--------------

        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 18;
        Naruto.aldeia = "Konoha";

        //-----------Sasuke------------------

        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 19;
        Sasuke.aldeia = "Konoha";

        String chamadaSasuke = Sasuke.BoasVindas();
        System.out.println(chamadaSasuke);
        Sasuke.SharinganAtivado();

        int quantoTempo = Sasuke.AnosParaSerHokage(70);
        System.out.println("Você tem " + Sasuke.idade + " Anos," + " falta no minimo " + quantoTempo + " Anos " + "para ser hokage");

        //------------Sakura---------------------

        Ninja Sakura = new Ninja();
        Sasuke.nome = "Sakura Haruno";
        Sasuke.idade = 19;
        Sasuke.nome = "Konoha";

    }
}
