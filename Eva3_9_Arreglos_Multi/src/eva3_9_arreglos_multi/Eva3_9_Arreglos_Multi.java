/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_arreglos_multi;

/**
 *
 * @author lamam
 */
public class Eva3_9_Arreglos_Multi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] billetes = {20, 50, 100, 200,500};
        String[][] ciudades = {{"Aguascalientes","Calvillo","Jesus Maria"},
                                {"Ensenada","Mexicali","Tecate"},
                                {"La paz","Cabo San Lucas","San Jose del Cabo"}};
        for(int i=0; i< ciudades.length; i++){
            for(int j=0; j< ciudades.length; j++){
                System.out.println(ciudades[i][j]);
            }
        }
        
        }
    }
    
