/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_arreglos_multi;

/**
 *
 * @author lamam
 */
public class Eva3_8_Arreglos_Multi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][][] cubo = new int[2][5][3];
        //Llenado
        for(int i = 0; i<2; i++){
            for(int j = 0; j<5; j++){
                for(int k = 0; k<3; k++){
                    cubo[i][j][k]= (int)(Math.random()*100);
                    
                }
            }
        }
        //Imprimir valores
        for(int i = 0; i<2; i++){
            for(int j = 0; j<5; j++){
                for(int k = 0; k<3; k++){
                    System.out.print("["+cubo[i][j][k]+"]");
                    
                }
            }
        }
    }
    
}
