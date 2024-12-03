/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_arreglo;

/**
 *
 * @author lamam
 */
public class Eva3_10_Arreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][][][][] cubo = new int[1][2][3][4][5];
        //Llenado
        //System.out.println(cubo);<------ imprime el primer valor
        
        for(int i = 0; i<cubo.length; i++){
            for(int j = 0; j<cubo[i].length; j++){
                for(int k = 0; k<cubo[i][j].length; k++){
                   for(int l = 0; l<cubo[i][j][k].length; l++){
                    for(int m = 0; m<cubo[i][j][k][l].length; m++){
                    cubo[i][j][k][l][m]= (int)(Math.random()*100);
                    
                }
                    
                } 
                    
                }
            }
        }
        //Imprimir valores
        for(int i = 0; i<cubo.length; i++){
            for(int j = 0; j<cubo[i].length; j++){
                for(int k = 0; k<cubo[i][j].length; k++){
                    for(int l = 0; l<cubo[i][j][k].length; l++){
                    for(int m = 0; m<cubo[i][j][k][l].length; m++){
                    System.out.print(cubo[i][j][k][l][m]+" ");
                    
                }
                    
                }
                    
                }
            }
        }
    }
    }
    
