package unidad3_pilas_tarea2;

import java.util.Scanner;

public class Unidad3_Pilas_Tarea2 {
    
    public static void main(String[] args) {
        Unidad3_Pilas_Tarea2 metodo = new Unidad3_Pilas_Tarea2();
        Pila p = new Pila();
        Pila p2 = new Pila();
        Scanner V = new Scanner(System.in);
        boolean salir = false;
        int dato;
        do {
            salir = false;
            System.out.println(
                    "Metodo de una pila"
                    + "\n[1]insertar"
                    + "\n[2]sacar"
                    + "\n[3]mostrar cima"
                    + "\n[4]generar numeros random"
                    + "\n[5]vacia pila"
                    + "\n[6]mostrar si la pila esta vacia"
                    + "\n[7]mostrar pila"
                    + "\n[8]Mostrar tamaño de la pila"
                    + "\n[9]salir");
            int opc = V.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese un numero");
                    dato = V.nextInt();
                    metodo.insertar(p, p2, dato);
                    break;
                case 2:
                    if (!p.isEmpty()) {
                        System.out.println("Numero elimidado: " + p.pop());
                    } else {
                        System.out.println("La pila esta vacia");
                    }
                    break;
                case 3:
                    if (!p.isEmpty()) {
                        System.out.println("Ultimo numero agregado: " + p.peek());
                    } else {
                        System.out.println("La pila esta vacia");
                    }
                    break;
                case 4:
                    metodo.Random(p, p2);
                    System.out.println("Numeros random generados");
                    break;
                case 5:
                    p.Empty();
                    break;
                case 6:
                    if (p.isEmpty()) {
                        System.out.println("La pila esta vacia");
                    } else {
                        System.out.println("La pila tiene " + p.size());
                    }
                    break;
                case 7:
                    if (!p.isEmpty()) {
                        System.out.println("Pila 1: ");
                        p.Mostrar();
                        System.out.println("\nPila 2: ");
                        p2.Mostrar();
                    } else {
                        System.out.println("La pila esta vacia");
                    }
                    break;
                case 8:
                    System.out.println("Tamaño de la pila: " + p.size());
                    break;
                case 9:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            System.out.println("");
        } while (!salir);
    }
    
    public void Random(Pila p, Pila p2) {
        
        for (int i = 0; i < 10; i++) {
            int n = (int) (Math.random() * 500) + 50;
            insertar(p, p2, n);
        }
    }
    
    public void insertar(Pila p, Pila p2, int d) {
        if (p.isEmpty()) {
            p.push(d);
        } else {
            int cima = p.pop();
            if (d >= cima) {
                p.push(cima);
                p.push(d);
            } else {
                p.push(cima);
                p2.push(d);
            }
        }
    }
    
}
