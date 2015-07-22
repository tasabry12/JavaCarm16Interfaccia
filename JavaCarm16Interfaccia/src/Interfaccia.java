/*
 * INTERFACCIA
 * E' una classe che ha 2 caratteristiche fondamentali:
 * 1) Tutte le variabili devono essere dichiarate static e final () se non lo metto lo fa in automatico
 * 2) I metodi di tipo inferfacesono tutti astratti, quindi non hanno codice
 */
public interface Interfaccia {
static final double PI = 3.14;              //posso scrivere anche "double PI =  3.14;"

public abstract double calcolaArea();       //posso scrivere anche "double calcolaArea();" per forza è public abstract

                                            // una classe astratta è estesa un'interfaccia non può essere estesa ma implementata

}
