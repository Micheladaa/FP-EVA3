/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_6_examen_2da;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva3_6_Examen_2da {
    public static final int PIEDRA = 1;
    public static final int PAPEL = 2;
    public static final int TIJERA = 3;
    public static final int EMPATE = 0;
    public static final int GANA = 1;
    public static final int PIERDE = 2;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int jugada;
        int jugadaCom;
        int resuJugada;
        do{
            jugada = capturarJugada("Introduce tu jugada (1-Piedra, (2-Papel, (3-Tijera, (0-Salir: ");
            jugadaCom = generarJugadaCom();
            System.out.println(jugadaCom);
            resuJugada = evaluarJugadas(jugada, jugadaCom);
            System.out.println(resuJugada);
        }while(jugada!=0);
    }
    
    public static int capturarJugada(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        int resu=captu.nextInt();
        return resu;
        
    }
    public static int generarJugadaCom(){
        int resu;
        double valor = Math.random();
        if((valor >= 0) && (valor <0.3))
            resu = 1;
        else if((valor>=0.3)&&(valor<0.6))
            resu = 2;
        else resu = 3;
        return resu;
    }
    
    public static int evaluarJugadas(int jugadaU, int jugadaC){
        int resu;
        if((jugadaU == PIEDRA)&&(jugadaC==PIEDRA))
            resu=EMPATE;
        else if((jugadaU == PIEDRA)&&(jugadaC==PAPEL))
            resu=PIERDE;
        else if((jugadaU == PIEDRA)&&(jugadaC==TIJERA))
            resu=GANA;
        else if((jugadaU == PAPEL)&&(jugadaC==PIEDRA))
            resu=GANA;
        else if((jugadaU == PAPEL)&&(jugadaC==PAPEL))
            resu=EMPATE;
        else if((jugadaU == PAPEL)&&(jugadaC==TIJERA))
            resu=PIERDE;
        else if((jugadaU == TIJERA)&&(jugadaC==PIEDRA))
            resu=PIERDE;
        else if((jugadaU == TIJERA)&&(jugadaC==PAPEL))
            resu=GANA;
        else 
            resu=EMPATE;
        
        return resu;
    }
    
}
