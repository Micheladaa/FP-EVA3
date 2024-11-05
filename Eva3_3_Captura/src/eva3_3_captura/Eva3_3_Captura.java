/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_3_captura;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva3_3_Captura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre = capturaTexto("Introduce tu nombre: ");
        String apellido = capturaTexto("Introduce el apellido: ");
        int edad = capturaNum("introduce tu edad: ");
        double salario = capturaDou("introduce tu salario: ");
        
        System.out.println("nombre: " + nombre);
        System.out.println("apellido: " + apellido);  
        System.out.println("edad: " + edad);
        System.out.println("salario: $" + salario);
    }
    
    public static String capturaTexto(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        String texto = captu.nextLine();
        return texto;
    }
    public static int capturaNum(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        
        return captu.nextInt();
    }
    public static double capturaDou(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        
        return captu.nextDouble();
    }
}
