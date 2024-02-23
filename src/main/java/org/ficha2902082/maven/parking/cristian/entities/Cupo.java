package org.ficha2902082.maven.parking.cristian.entities;

public class Cupo {

    public char letra;
    public Double largo;
    public Double ancho;
    //cosnt
    //constructor por defecro
    public Cupo() {
    }

    //constructor con parametros
    public Cupo(char letra, 
                Double largo, 
                Double ancho) {
        this.letra = letra;
        this.largo = largo;
        this.ancho = ancho;
    }

}
