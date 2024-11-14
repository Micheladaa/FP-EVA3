/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_matrices;

/**
 *
 * @author lamam
 */
public class Eva3_7_Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] matriz = new int[3][3];//Hoja de excel
        matriz[0][0] = 100;//Primer posicion
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;
        matriz[2][0] = 700;
        matriz[2][1] = 800;
        matriz[2][2] = 900;
        
        for(int i = 0; i<3; i++){//Primer dimension
            for(int j = 0; j<3; j++){//Segunda dimension
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        
        
    }
    
}
