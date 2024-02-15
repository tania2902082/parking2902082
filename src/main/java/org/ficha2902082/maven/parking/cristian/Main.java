package org.ficha2902082.maven.parking.cristian;
//importar dependencias
import org.ficha2902082.maven.parking.cristian.entities.Carro;
import org.ficha2902082.maven.parking.cristian.entities.Cliente;
import org.ficha2902082.maven.parking.cristian.entities.TipoVehiculo;
import org.ficha2902082.maven.parking.cristian.entities.TipoDocumento;

public class Main {
    public static void main(String[] args) {
        //Crear dos instancias
        // de la clase carro
        Carro carrito1 = new Carro();
        carrito1.placa = "ASB 345";
        carrito1.tipoVehiculo = TipoVehiculo.CAMIONETA;

        Carro carrito2 = new Carro();
        carrito2.placa = "JKF 234";
        carrito2.tipoVehiculo = TipoVehiculo.TAXI;

        Cliente clientecito = new Cliente();
        clientecito.nombre= "Cristian";
        clientecito.apellidos = "Buitrago";
        clientecito.tipoDocumento
                 = TipoDocumento.CC;
        clientecito.numeroDocumento = 1021687740L;
        clientecito.celular = 3555555555L;  
        
        //añadir carros al cliente
        //invocar, llamar , ejecutar 
        //el metodo addCar
        clientecito.addCar(carrito1);
        clientecito.addCar(carrito2);
        clientecito.addCar("ASD 456" , TipoVehiculo.TAXI);
 
        
        System.out.println("Cliente:");
        System.out.println("documento:" + clientecito.numeroDocumento);
        System.out.println("Vehiculos:");
        for( Carro c : clientecito.misCarros){
            System.out.println("placa:" + c.placa);
            System.out.println("tipo:" + c.tipoVehiculo );
            System.out.println("_________________");
        }




    }
}