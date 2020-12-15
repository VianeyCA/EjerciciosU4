
package ejerciciosu4;

 public class Nodo {
     int Año;
     int Edad;
     String Nombre;
     Nodo hIzquierdo;
     Nodo hDerecho;

     public Nodo(int año, String nombre) {
         this.Año = año;
         this.Edad = (2020 - año);
         this.Nombre = nombre;
         this.hIzquierdo = null;
         this.hDerecho = null;
     }
     
     //Muestra la información del nodo

    @Override
    public String toString() {
        return "Nombre: " + Nombre + " edad: " + Edad + " año: " + Año ;
    }
}
