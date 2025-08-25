package br.univille.observer;

import java.util.ArrayList;

public class Publisher {
    private ArrayList<Subscriber> subscribers =
        new ArrayList<>();    
    private String mainState;
    public String getMainState() {
        return mainState;
    }
    public void setMainState(String mainState) {
        this.mainState = mainState;
    }

    public void subscribe(Subscriber assinante){
        subscribers.add(assinante);
    }
    public void notifySubscribers(){
        for(Subscriber umAssinante: subscribers){
            umAssinante.update(mainState);
        }
    }
}

    //variável com o tipo lista
    //private Subscriber[] subscribers =
    //lista estática com 10 posições, já o arraylist tem posições ilimitadas
        //new Subscriber[10];