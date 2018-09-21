
package operaciones;

import javax.swing.JOptionPane;

public class numero_naturales {
//ATRIBUTO
    int numero;
    int numero2;
    int suc;
    int ant;
    int s;
    int m;
    int r;
    

//METODO
    

//PARA PODER INGRESAR EL DATO    
 public void Ingresar(){
   numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));//iNGRESAMOS ESTE CODIGO PARA QUE PUEDE INFRESAR LOS DATOS
   numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
 }
 
 //OPERACION DE SUCESOR
 public void Sucesor(){
 suc=numero+1; 
 }
 //OPERACION DE ANTECESOR
 public void Antecesor(){
 ant=numero-1;    
 }
 //OPERACION DE IGUAL A CERO
 public void Escero(){
     if (numero<=0){
        System.out.println("El numero es cero");                  
    }   
 }
 //OPERACION DE LA SUMA
 public void Suma(){
     s=numero+numero2;    
 }
 //OPERACION DE LA RESTA
 public void Resta(){
     r=numero-numero2;
 }
 //OPERACION DE LOS NUMEROS IGUALES
 public void Igual(){
     if (numero == numero2){
         System.out.println("Los numero son iguales");
     }     
 }
 //OPERACION DEL NUMERO MENOR
 public void Menor(){
     if (numero <= numero2){
      System.out.println("El numero menor es: "+numero);}else{
      System.out.println("El numero menor es: "+numero2);
 
 }}

 
//IMPRIMIR LOS RESULTADOS         
 public void MostrarResultado(){   
     System.out.println("El sucesor del primer numero es: "+suc);
     System.out.println("El antecesor del primer numero es: "+ant);
     System.out.println("La suma es: "+s);
     System.out.println("La diferencia es: "+r);
 }
         
    
}
