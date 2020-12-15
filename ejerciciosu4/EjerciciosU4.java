
package ejerciciosu4;

import java.util.Scanner;

 public class EjerciciosU4 {
    
     public static void main(String[] args) {
         // TODO code application logic here
         int opc=0;
         int elemento;
         String nombre;
         Arbol arbol=new Arbol();
         Scanner leer= new Scanner(System.in);
         
         arbol.Agregar(arbol.getRaiz(), "Ana", 1997);
         arbol.Agregar(arbol.getRaiz(), "Roberto", 1982);
         arbol.Agregar(arbol.getRaiz(), "Cristal", 1993);
         arbol.Agregar(arbol.getRaiz(), "Gustavo", 1986);
         arbol.Agregar(arbol.getRaiz(), "Martha", 1990);
         arbol.Agregar(arbol.getRaiz(), "Fernando", 1981);
         arbol.Agregar(arbol.getRaiz(), "Carmen", 1970);
         arbol.Agregar(arbol.getRaiz(), "Joseline", 2003);
         arbol.Agregar(arbol.getRaiz(), "Alicia", 2009);
         arbol.Agregar(arbol.getRaiz(), "Cesar", 2005);
         arbol.Agregar(arbol.getRaiz(), "Ramiro", 2001);
         arbol.Agregar(arbol.getRaiz(), "Lalo", 2002);
         
         do{
             System.out.println("");
             System.out.println("----------------------Menú de Arbol binario----------------------");
             System.out.println("1.- ¿Quién es la persona más pequeña y qué edad tiene?");
             System.out.println("2.- ¿Quién es la persona más grande y qué edad tiene?  ");
             System.out.println("3.- ¿Cuantos años de diferencia tienen la persona más grande y la persona más chica? ");
             System.out.println("4.- ¿Cuantos participantes hay?");
             System.out.println("5.- ¿Cuanto es la suma de las edades de los participantes");
             System.out.println("6.- ¿Cuál es el promedio de edad de los participantes? ");
             System.out.println("7.- Mostrar Altura");
             System.out.println("8.- Mostrar en Pre-Orden");
             System.out.println("9.- Mostrar en In-Orden");
             System.out.println("10.- Mostrar en Pos-Orden");
             System.out.println("11.- Salir");
             System.out.print ("Inserta una opción: ");
             opc=leer.nextInt();
             switch (opc){
                 case 1: 
                      System.out.println("");
                     System.out.print(arbol.MenorEdad());
                     //arbol.EdadMin();
                     System.out.println("");
                     break;
                 case 2: 
                     System.out.println("");
                     System.out.print(arbol.EdadMayor());
                     System.out.println("");
                     break;
                 case 3:
                     System.out.println("");
                     System.out.print(arbol.Resta() + " años");
                     System.out.println("");
                     break;
                 case 4: 
                     System.out.println("");
                     System.out.print(arbol.getcantidadNodos());
                     System.out.println("");
                     break;
                 case 5: 
                     System.out.println("");
                     System.out.print(arbol.getSumaE());
                     System.out.println("");
                     break;
                 case 6:
                     System.out.println("");
                     System.out.print(arbol.getPromedio());
                     System.out.println("");
                     break;
                 case 7:
                     System.out.println("");
                     System.out.print(arbol.Altura(arbol.getRaiz()));
                     System.out.println("");
                     break;
                 case 8:
                     System.out.println("");
                     arbol.PreOrden(arbol.getRaiz());
                     System.out.println("");
                     break;
                 case 9:
                     System.out.println("");
                     arbol.InOrden(arbol.getRaiz());
                     System.out.println("");
                     break;
                 case 10:
                     System.out.println("");
                     arbol.PostOrden(arbol.getRaiz());
                     System.out.println("");
                     break;
                 case 11:
                     System.out.println("");
                     System.out.println("Programa finalizado");
                     System.out.println("");
                     break;    
                 default:
                     System.out.println("Dato incorrecto, intente de nuevo");
                     System.out.println("");
             }
         }while(opc!=11);
     }
    
}
