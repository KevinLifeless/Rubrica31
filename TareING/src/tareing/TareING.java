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
                + "\n\t 1.-  Ingresar notas                                    "
                + "\n\t 2.-  Obtener Promedios                       "
                + "\n\t 4.-  Obtener Resultados              "
                + "\n\t 5.-  Salir                                            "
                + "\n\t_________________________________________");
        System.out.print("\n\t Ingrese la opción a ejecutar: ");      
        int ej = Integer.parseInt(entrada.nextLine());       
        if (ej != 1 && ej != 2 && ej != 3 && ej != 4 && ej != 5) {
            System.out.println("\t¡Opción incorrecta!, Ingrese nuevamente");
            MenuPrincipal();
        } else {
            Opciones1(ej);
        }
    }
    
    public void Opciones1(int ej) {
        switch (ej) {
            case 1:
                System.out.print("\n\t Ingrese el dato: ");
                int valor = Integer.parseInt(entrada.nextLine());
                Ingresar(valor);
                MenuPrincipal();
                break;
            case 2:
                ObtenerPromedios.Avanzar();
                MenuPrincipal();
                break;
            case 3:
                ObtenerResult.Imprimir();
                MenuPrincipal();
                break;
            case 4:

                System.exit(1);
                break;
        }
    }
   
    public void opciones (){
        System.out.println("Ingrese nota de trabajos: ");
        opciones();
        //Integer.parseInt(entrada.nextLine());
    }
    
    public static void main(String[] args) {
        TareING Colitas = new TareING();
        Colitas.MenuPrincipal();
    }
    
    
}
