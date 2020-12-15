package ejerciciosu4;

public class Arbol {
     int cantidadNodos;
     int sumaEdad;
     int promEdad;
     Nodo Raiz;

     public Arbol() {
         this.cantidadNodos = 0;
         this.sumaEdad = 0;
         this.promEdad = 0;
         this.Raiz = null;
     }

     public boolean estaVacio() {
          if (Raiz==null){
              return true;
          }else{
              return false;
          }
     }

     public Nodo getRaiz() {
         return Raiz;
     }

     public void Agregar(Nodo n, String nombre, int año) {
         Nodo nue = new Nodo(año, nombre);
         if (estaVacio()) {
             Raiz = nue;
             cantidadNodos++;
         } else if (año <= n.Año) {
             if (n.hIzquierdo == null) {
                 n.hIzquierdo = nue;
                 cantidadNodos++;
             } else {
                 Agregar(n.hIzquierdo, nombre, año);
             }
         } else {
             if (n.hDerecho == null) {
                 n.hDerecho = nue;
                 cantidadNodos++;
             } else {
                 Agregar(n.hDerecho, nombre, año);
             }
         }
     }


     public void PreOrden(Nodo n) {
         if (n != null) {
             System.out.println(n);
             PreOrden(n.hIzquierdo);
             PreOrden(n.hDerecho);
         }
     }

    
     public void InOrden(Nodo n) {
         if (n != null) {
             InOrden(n.hIzquierdo);
             System.out.println(n);
             InOrden(n.hDerecho);
         } 
     }

     public void PostOrden(Nodo n) {
         if (n != null) {
             PostOrden(n.hIzquierdo);
             PostOrden(n.hDerecho);
             System.out.println(n);
         }
     }


     public Nodo MenorEdad() {
         Nodo min = BuscarMayor(Raiz);
         return min;
     } 

     private Nodo BuscarMayor(Nodo n) {
         if (n.hDerecho != null) {
             n = BuscarMayor(n.hDerecho);
         } else if (n == null) {
             return null;
         }
         return n;
    }

    public Nodo EdadMayor() {
        Nodo mayor = BuscarMenor(Raiz);
        return mayor;
    }

    private Nodo BuscarMenor(Nodo n) {
        if (n.hIzquierdo != null) {
            n = BuscarMenor(n.hIzquierdo);
        } else if (n == null) {
            return null;
        }
        return n;
    }


    public int Resta() {
        Nodo edadJoven = BuscarMayor(Raiz);
        Nodo edadAdulta = BuscarMenor(Raiz);
        int resta = edadAdulta.Edad - edadJoven.Edad;
        return resta;
    }


    public int getcantidadNodos() {
        return cantidadNodos;
    }


    public int getSumaE() {
        return sumaEdad = edades(Raiz);
    }

    private int edades(Nodo n) {
        if (n != null) {
            return n.Edad + (edades(n.hIzquierdo) + edades(n.hDerecho));
        } else {
            return 0;
        }
    }


    public int getPromedio() {
        return promEdad = sumaEdad / cantidadNodos;
    }


    public int Altura(Nodo n) {
        if (n != null) {
            return 1 + (Math.max(Altura(n.hIzquierdo), Altura(n.hDerecho)));
        } else {
            return 1;
        }
    }
     
}
