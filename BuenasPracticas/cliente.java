public class Cliente {

List<Compras> compras; /* se comidificó cmp por compras, ya que se deben evitar las
abreviaturas porque puede ser ambigua al momento
 en que un desarrollador deba intepertarlo*/

public void imprimirInfomacionPersonal() { /*se modificó el nombre del método debido a que debe 
    describir la función que hará y se deben evitar las abreviaturas*/

    system.out.println("Nombre: " + "Antonio");
    system.out.println("Apellido 1: " + "Zapata");
    system.out.println("Apellido 2: " + "Restrepo");
    system.out.println("Número:" + "123456789");

}

public void imprimirTodaLainformacionPersonal(){  /*se modificó el nombre del método debido a que debe
     describir la función que hará y se deben evitar las abreviaturas*/
     
    system.out.println("Nombre: " + "Antonio");
    system.out.println("Apellido 1: " + "Zapata");
    system.out.println("Apellido 2: " + "Restrepo");
    system.out.println("Número:" + "123456789");

    for(Compras comprasLocal : compras){  /* se comidificó cmpLocal por comprasLocal, ya que se
         deben evitar las abreviaturas porque puede ser ambigua al momento en que
          un desarrollador deba intepertarlo*/
        
        system.out.println(comprasLocal);
     }
}


}