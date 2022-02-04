package Refactorizacion;

public class ImprimirInformacionPersonal {

    public void imprimirInfomacionPersonal(){
        String nombre = persona.getNombre();
        String apellido1 = persona.getPrimerApellido();
        String apellido2 = persona.getSegundoApellido();
        String numeroDocumento = Integer.toString(persona.getNumeroDeDocumento());
   
        System.out.println("información personal");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido 1: " + apellido1);
        System.out.println("Apellido 2: " + apellido2);
        System.out.println("Número:" + numeroDocumento);
   
   }
    
}
