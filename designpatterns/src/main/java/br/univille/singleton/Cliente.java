package br.univille.singleton;

public class Cliente {
    public static void main(String[] args) {
        var segredro = "Palmeiras tem mundial";

        var singleton = Singleton.getInstance();
        singleton.setSegredo(segredro);

        //mil linhas de codigo depois...
        System.out.println(
            Singleton.getInstance().getSegredo()
        );
    }
}
