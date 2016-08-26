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
    
    public void MenuPrincipal() {
        System.out.print( "\n\t_________________________________________"
                + "\n\t**************Menú Principal*************        "
                + "\n\t 1.-  Ingresar nota                                    "
                + "\n\t 2.-  Obtener suma                       "
                + "\n\t 3.-  Imprimir Notas              "
                + "\n\t 4.-  Obtener Resultados              "
                + "\n\t 5.-  Salir                                            "
                + "\n\t_________________________________________");
        System.out.print("\n\t Ingrese la opción a ejecutar: ");      
        int ej = Integer.parseInt(entrada.nextLine());       
        
    }
    
    
    public static void main(String[] args) {
        TareING Colitas = new TareING();
        Colitas.MenuPrincipal();
    }
    
}
