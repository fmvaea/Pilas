package pilas;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilas {
    public static void main(String[] args) {
    Deque<String> pila = new ArrayDeque<>();

        pila.push("1");
        pila.push("2");
        pila.push("3");

        System.out.println("cima: " + pila.peek()); 
        System.out.println("pop: " + pila.pop());
        System.out.println("Esta vacia? " + pila.isEmpty());
    }
    
}
