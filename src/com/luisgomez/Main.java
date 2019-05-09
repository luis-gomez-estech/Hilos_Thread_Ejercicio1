package com.luisgomez;

public class Main {

    public static void main(String[] args) {

        // Tiempo inicial de referencia
        long initialTime = System.currentTimeMillis();

        //Una vez creada la class HiloThread, ahora declaramos los hilos para la clase HiloThread,
        // donde le indicamos el nombre y el tiempo (parametros que hemos creado en la class junto a su constructor, y los setter y guetter

        HiloThread Hilo1 = new HiloThread("1",initialTime,1);
        HiloThread Hilo2 = new HiloThread("2",initialTime,2);
        HiloThread Hilo3 = new HiloThread("3",initialTime,3);
        HiloThread Hilo4 = new HiloThread("4",initialTime,4);
        HiloThread Hilo5 = new HiloThread("5",initialTime,5);
        HiloThread Hilo6 = new HiloThread("6",initialTime,6);

        //Hilos que va ir gestionando la class HiloThread
        Hilo1.start();
        Hilo2.start();
        Hilo3.start();
        Hilo4.start();
        Hilo5.start();
        Hilo6.start();


    }
}
