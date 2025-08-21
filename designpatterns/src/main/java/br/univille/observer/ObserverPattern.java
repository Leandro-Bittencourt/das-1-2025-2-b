package br.univille.observer;

import java.util.ArrayList;
import java.util.List;

// Interface Observer
interface Observer {
    /**
     * Método chamado quando o sujeito (Subject) notifica os observadores.
     * 
     * @param subject O sujeito que notificou os observadores.
     */
    void update(Subject subject);
}

// Classe abstrata Subject
abstract class Subject {
    private final List<Observer> observers = new ArrayList<>();

    /**
     * Adiciona um observador à lista.
     * 
     * @param observer O observador a ser adicionado.
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * Remove um observador da lista.
     * 
     * @param observer O observador a ser removido.
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifica todos os observadores sobre uma mudança de estado.
     */
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}

// Implementação concreta do Subject
class ConcreteSubject extends Subject {
    private int state;

    /**
     * Obtém o estado atual do sujeito.
     * 
     * @return O estado atual.
     */
    public int getState() {
        return state;
    }

    /**
     * Define um novo estado e notifica os observadores.
     * 
     * @param state O novo estado.
     */
    public void setState(int state) {
        this.state = state;
        System.out.println("ConcreteSubject: Estado alterado para " + state);
        notifyObservers();
    }
}

// Implementação concreta do Observer A
class ConcreteObserverA implements Observer {
    @Override
    public void update(Subject subject) {
        if (subject instanceof ConcreteSubject) {
            ConcreteSubject concreteSubject = (ConcreteSubject) subject;
            if (concreteSubject.getState() < 3) {
                System.out.println("ConcreteObserverA: Reagindo ao evento. Estado: " + concreteSubject.getState());
            }
        }
    }
}

// Implementação concreta do Observer B
class ConcreteObserverB implements Observer {
    @Override
    public void update(Subject subject) {
        if (subject instanceof ConcreteSubject) {
            ConcreteSubject concreteSubject = (ConcreteSubject) subject;
            if (concreteSubject.getState() >= 3) {
                System.out.println("ConcreteObserverB: Reagindo ao evento. Estado: " + concreteSubject.getState());
            }
        }
    }
}

// Classe principal para testar o padrão Observer
public class ObserverPattern {
    public static void main(String[] args) {
        // Cria o sujeito concreto
        ConcreteSubject subject = new ConcreteSubject();

        // Cria os observadores concretos
        ConcreteObserverA observerA = new ConcreteObserverA();
        ConcreteObserverB observerB = new ConcreteObserverB();

        // Anexa os observadores ao sujeito
        subject.attach(observerA);
        subject.attach(observerB);

        // Altera o estado do sujeito
        System.out.println("\nAlterando estado para 2...");
        subject.setState(2);

        System.out.println("\nAlterando estado para 3...");
        subject.setState(3);

        System.out.println("\nRemovendo ConcreteObserverA e alterando estado para 4...");
        subject.detach(observerA);
        subject.setState(4);
    }
}