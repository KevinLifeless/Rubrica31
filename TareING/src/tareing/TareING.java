/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tareing;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class TareING {
    
    Scanner entrada = new Scanner(System.in);
    int ej = Integer.parseInt(entrada.nextLine());  
    int trabajos=0, aporte=0, examen=0;
    int notaPUno = 0;
    int notaPDos = 0;
    int promedioUno = 0, PromedioDos = 0;
   
    public void opciones (){
        System.out.println("Ingrese nota de trabajos: ");
        Integer.parseInt(entrada.nextLine());
    }
    
    public static void main(String[] args) {
        TareING opciones = new TareING();
        opciones.opciones();
    }
    
}
