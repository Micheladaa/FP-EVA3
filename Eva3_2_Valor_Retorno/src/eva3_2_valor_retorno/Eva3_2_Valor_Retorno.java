/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_2_valor_retorno;

/**
 *
 * @author invitado
 */
public class Eva3_2_Valor_Retorno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Necesitamos recuérar el valor para hacer algo con el.
        int resu;
        resu = sumarDosNumeros(5, 10);
        System.out.println("resultado: "+ resu);
        //Segunda alternativa
        System.out.println("resultado: "+ sumarDosNumeros(5, 10));
        
        //no les interesa el resultado
        sumarDosNumeros(5, 10);
    }
    
    public static int sumarDosNumeros(int num1, int num2){
        return num1 + num2;
    }
}
