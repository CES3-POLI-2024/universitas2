package co.edu.poli.ces3.universitas2;

import java.util.Random;

public class Arreglos {
    private int [] numAleatorios = new int [15];

    public Arreglos (){
        Random random = new Random();
        System.out.println("El Arreglo es: [ " );
        for (int i =0; i < numAleatorios.length; i++){
            numAleatorios[i] = random.nextInt(100);
            System.out.println(numAleatorios[i]);
        }
        System.out.println(" ] Fin Arreglo ");
    }

    public void imprimir_pares (){
        System.out.println("Posiciones pares" );
        for(int i=0; i < numAleatorios.length; i++){
            if (i%2 == 0){
                System.out.println(numAleatorios[i]);
            }
        }
    }

    public static void main(String[] args) {
        Arreglos arreglo = new Arreglos();
        arreglo.imprimir_pares();
    }
}
