package org.ficha2902082.maven.parking.cristian;

import org.ficha2902082.maven.parking.cristian.entities.Carro;
import org.ficha2902082.maven.parking.cristian.entities.Cliente;
import org.ficha2902082.maven.parking.cristian.entities.Cupo;
import org.ficha2902082.maven.parking.cristian.entities.TipoDocumento;
import org.ficha2902082.maven.parking.cristian.entities.TipoVehiculo;
import java.util.List;
import java.util.ArrayList;
import org.ficha2902082.maven.parking.cristian.entities.Registro;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
     
        //Crear dos cupos
        //Instanciar des cupos
        Cupo cupito1 = new Cupo();
        cupito1.ancho = 1.0;
        cupito1.largo = 4.5;
        cupito1.letra = 'A';

        Cupo cupito2 = new Cupo('B', 
                                   5.0, 
                                      2.5);
        
        // Instanciar dos carritos
        Carro carrito1 = new Carro("ASJ 456", 
                                   TipoVehiculo.MOTO);     
                                   
       Carro carrito2 = new Carro("DFR 132", 
                                  TipoVehiculo.BUS);
                                  
        // instanciar un cliente
        Cliente cli = new Cliente("Alejandro",
                                         "Galicia", 
                                         TipoDocumento.TI, 
                                         132165132165L, 
                                         31465824264L);
        //vincular carros al cliente
        cli.addCar(carrito1);
        cli.addCar(carrito2);
        cli.addCar("LKJ 456",TipoVehiculo.MOTO);
        
        //Declarar una lista de registros
        List<Registro> misRegistros = new ArrayList<>();

        //Instanciar dos registros E/S
        Registro registro1 = new Registro(
            LocalDate.of(2024,Month.JANUARY, 23), 
            LocalTime.of(16, 41, 12),
            LocalDate.of(2024,Month.JANUARY, 24), 
            LocalTime.of(16, 31, 14),
            50000.00,
            cli.misCarros.get(0),
            cupito1
        );

        Registro registro2 = new Registro(
            LocalDate.of(2022, Month.AUGUST, 17),
            LocalTime.of(12, 30, 00),
            LocalDate.of(2024, Month.DECEMBER, 31),
            LocalTime.of(5, 30, 12),
            100000.00,
            cli.misCarros.get(1),
            cupito2
        );

        misRegistros.add(registro1);

       //recorrer la lista de registros
       for( Registro r : misRegistros ){
               System.out.println("Placa: " +
               r.carro.placa + "|" + 
               "Cupo: " + 
               r.cupo.letra +"|" + 
               "Valor: " +
               r.valor + "|" +
               "Fecha Inicio: " +
               r.fechaInicio.toString() + "|" +
               "Hora Inicio: " +
               r.horaInicio + "|" +
               "Fecha Fin: " +
               r.fechaFin.toString() +"|"
               

               );

       }
}
}