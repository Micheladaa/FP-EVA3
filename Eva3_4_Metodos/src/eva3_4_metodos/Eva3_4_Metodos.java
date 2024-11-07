/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_4_metodos;

/**
 *
 * @author invitado
 */
public class Eva3_4_Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(encontrarMayor(10, 10));
        System.out.println(diaSem(7));
    }
    
    public static int encontrarMayor(int num1,int num2){
        int resu;
        if(num1 > num2)
            resu = num1;
        else 
            resu = num2;
        return resu;
        /*if(num1 > num2)
         return num1;
        else 
        return num2;
        */
    }
    
    //metodo que regrese el dia de la semana en texto.
    //Pide el numero (1-7)
    public static String diaSem(int num1){
        
        switch(num1){
             case 1: 
                 return "Lunes";
                
             case 2: 
                 return "Martes";
             case 3: 
                 return "Miercoles";
             case 4: 
                return "Jueves";
             case 5: 
                 return "Viernes";
             case 6: 
                 return "Sabado";
             case 7: 
                 return "Domingo";
             default:
                 return "Numero invalido";
         }
      
    }
    
}
