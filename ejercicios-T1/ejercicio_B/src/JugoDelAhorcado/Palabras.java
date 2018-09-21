package JugoDelAhorcado;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Palabras { 
    //ATRIBUTOS
    Scanner entrada = new Scanner(System.in);
    char cadena[];
    char cadenajuego[];
    char intento;
    
    
//METODOS
    
//IMPRIMIR MENSAJE
public void Mensaje(){
    System.out.println("Adivina la palabra tiene 8 intentos"); 
    System.out.println("Consiste en nombre de los colores");
}   

//OPERACION PARA INGRESAR PALABRAS
public void PalabraAleatoria(){
      
       Random r = new Random(); //ESTRUCTURA PARA HACER RANDOM.
       
       String[] palabras = {"azul","rojo","morado","blanco", "negro", "lila", "amarillo", "verde", "violeta","cafe","naranjado"}; //Arreglo de palabras.
     
        int n_azar = r.nextInt(palabras.length); 
         
        //METODO PARA COMVERTIR UNA PALABRA STRING A UNA CHAR OSEA TOMAR UNA LETRA  
        cadena = palabras[n_azar].toCharArray();
        cadenajuego = palabras[n_azar].toCharArray();
     
        for(int i = 0; i< cadenajuego.length; i++){ //CAMBIO DE LA PALABRA POR UN GUION BAJO .
            cadenajuego[i] = '_';
    } 
       System.out.println("Adivina la palabra: " + Arrays.toString(cadenajuego));
    }

//ESTRUCTURA PARA LOS NUMERO DE INTENTOS
public void Intentos(){
    
    for(int i = 1; i <= 8; i++){ //NUMERO DE INTENTOS DEL JUGADOR
            
            System.out.print("Intento "+i+": ");
             intento = entrada.next().charAt(0);
      
                for(int x = 0; x < cadena.length; x++){ //VEREFICACION DEL ENTRADA CON LA PALABRA ESCONDIDA 
                    if(cadena[x]==intento){
                        cadenajuego[x] = intento;
                    }
                } 
                
                if(Arrays.equals(cadena, cadenajuego)){
                    System.out.println("\nFelicidades completaste la palabra");
                    i = 8; //Fin de juego.
                }else if(i==8){
                    System.out.println("\nLo siento se acabo sus intentos");
                    System.exit(0); //FIN DEL PROGRAMA
                }  
            System.out.println(cadenajuego); 
        }
}    
    
}

 
        