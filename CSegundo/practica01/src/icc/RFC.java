import java.util.Scanner;

/**
 Programa para obtener RFC
 Objetivo: Dividir cadenas para generar RFC desde información previa
 Número de Cuenta: 324140561
 @autor: Cassandra Guadalupe Segundo Faustino
 @versión: 1.0
**/

public class RFC{
  public static void main(String []args){
  //Designar elementos y Scanners para interacción con usuario. 
  Scanner in = new Scanner(System.in);
   String nombreCompleto = new String ();
   String fecha = new String ();

  //Solicitar nombre al usuario
  System.out.println("Hola, podría darme su nombre completo?");
    nombreCompleto = in.nextLine();
 
  //Solicitar fecha de nacimiento
  System.out.println("Ingrese su fecha de nacimiento en formato dd/mm/aa");
    fecha = in.nextLine();

  //Designar Strings y métodos para cortarlas en iniciales
  //Cadena inicial
   String apellidos = new String();
   String apellidoMa, apellidoPa;
  //Partida en dos de cadena inicial
  int corte1 = nombreCompleto.indexOf(" ");
  apellidos = (nombreCompleto.substring(corte1+1,nombreCompleto.length())).toUpperCase();
  //Cadena de apellido Materno
   String apellidoMater = new String();
   String inicialAma = new String();
  //Cadena de apellido Paterno
  int corte2 = apellidos.indexOf(" ");
  apellidoMater = (apellidos.substring(corte2+1,apellidos.length()));
 
  //Generar iniciales por cadena con métodos
    inicialAma = (apellidoMater.substring(0,1));
  
   String inicialApa = new String();
   String apellidoPater = new String();

  apellidoPater = (apellidos.substring(0,corte2));
  
    inicialApa = (apellidoPater.substring(0,2));

   String inicial = new String();
   String inicialNombre = new String();

  int corte3 = nombreCompleto.indexOf(" ");
  inicial = (nombreCompleto.substring(0,corte3)).toUpperCase();

    inicialNombre = (inicial.substring(0,1));

  //Designar elementos de fecha
   String fechaPartida = new String();
   String fechaParte2 = new String();
   String fechaParte3 = new String();
  //Iniciales de fecha
  fechaPartida = (fecha.substring(0,2));
  fechaParte2 = (fecha.substring(3,5));
  fechaParte3 = (fecha.substring(8,10));

  //Concatena cadena de fecha
   String cadenaFecha = new String();
  cadenaFecha = fechaParte3+fechaParte2+fechaPartida;
  //Concatena cadena de nombre
   String cadenaNombre = new String();
  cadenaNombre = inicialApa+inicialAma+inicialNombre;
  //Concatena y forma RFC
   String rfc = new String();
    rfc = cadenaNombre+cadenaFecha;
  System.out.println("Su RFC es "+rfc);

  }

}

