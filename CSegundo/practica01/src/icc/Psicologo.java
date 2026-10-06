import java.util.Scanner;

/**
* Programa pasivo-agresivo de un psicólogo
* Objetivo: Mostrar interacciones programa-usuario.
* Número de Cuenta: 324140561
* @autor: Cassandra Guadalupe Segundo Faustino
* Versión: 1.0

*/

 public class Psicologo {
   public static void main(String []args){
   //Definición de los elementos que usaremos
    Scanner in = new Scanner(System.in);
    String nombrePaciente = new String ();
    String notmyProblem;
    String blahBlah = new String ();

  //Uso de texto para dar bienvenida
   System.out.println("Bienvenido, ¿cuál es su nombre?");
  //Recibida del nombre del paciente
    nombrePaciente = in.nextLine();
  //Continuación de introducción 
   System.out.println("Buenas tardes, "+ nombrePaciente +".");
   System.out.println("Dígame, ¿cuál es su problema en esta vida?");
  //Recibida del problema del paciente
    notmyProblem = in.nextLine();
  //Continuación de diálogo
   System.out.println("MMM... ya veo");
   System.out.println("Y dígame ...");
   //Concatenamos respuesta con diálogo anterior
   System.out.println("¿Por qué dice \"" +notmyProblem.toLowerCase()+ "\"?");
    blahBlah = in.nextLine(); //El paciente nos indica la razón
   System.out.println("Muy interesante!! Hablaremos de ello con más detalle la próxima sesión."); //Lo ignoramos

   }



}
