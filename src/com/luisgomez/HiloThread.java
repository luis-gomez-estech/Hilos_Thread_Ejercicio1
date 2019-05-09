package com.luisgomez;

public class HiloThread extends Thread {



    private String nombreHilo;

    private int tiempoEntreHilos;

    private long initialTime;


    public HiloThread(){

    }

    // Construtor

    public HiloThread(String nombre, long initialTime, int tiempoEntreHilos){
        this.nombreHilo = nombre;
        this.initialTime = initialTime;
        this.tiempoEntreHilos = tiempoEntreHilos;
    }


    public String getNombreHilo() {
        return nombreHilo;
    }

    public void setNombreHilo(String nombreHilo) {
        this.nombreHilo = nombreHilo;
    }

    public long getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(long initialTime) {
        this.initialTime = initialTime;
    }

    public int getTiempoEntreHilos() {
        return tiempoEntreHilos;
    }

    public void setTiempoEntreHilos(int tiempoEntreHilos) {
        this.tiempoEntreHilos = tiempoEntreHilos;
    }

    @Override
    public void run() {


        // Llamamos al metodo esperarXsegundos el cual va va a recibir el tiempo fijado en  el Main para la ejecucion de cada hilo
        // y lo va a devolver aqui de nuevo para ir imprimiendo cada hilo

        esperarXsegundos(tiempoEntreHilos);

        System.out.println("Hola Mundo, imprimido desde el hilo " + this.nombreHilo + " y ha tardardo en PROCESAR: "
                + (System.currentTimeMillis() - this.initialTime) / 1000 + " seg");


    }

    private void esperarXsegundos(int segundos){
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
}
