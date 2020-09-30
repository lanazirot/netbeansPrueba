package com.lanazirot.main;

/**
 *
 * @author alanc
 * @see lol
 */

    record Persona(String nombre, int edad){
        public void printSomething(){
            System.out.println("Algo");
        }
    }


public class MainDriver {
    public static void main(String[] args) {
        var per = new Persona("Alan",14);
        System.out.println(per);
        System.out.println("Hola mundo");
    }
}
