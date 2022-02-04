package Refactorizacion;

import java.util.List;

public class ImprimiTodaInformacion {

    List<Compras> compras;

    public void imprimirTodaLaInformacionCliente(){
        System.out.println("Nombre: " + "Antonio");
        System.out.println("Apellido 1: " + "Zapata");
        System.out.println("Apellido 2: " + "Restrepo");
        System.out.println("Número:" + "123456789");
        

        for(Compras cmpLocal : compras){  
           System.out.println(compras);
        }
    }
    
}
