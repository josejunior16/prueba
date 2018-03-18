
package tarea;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class guia2 {
  void array(){
        
    
    vec ordenar =new vec();   
      
        
        int menu=0;
     do{   
        menu=Integer.parseInt(JOptionPane.showInputDialog("Elija la opcion que desea realizar\n1.Ingresar Datos\n2.Ordenar Datos\n3.Mostrar Datos"));
     if(menu==1){
       ordenar.llenado();  
       
     }
      if(menu==2){
          ordenar.ordenado();
      }
      if(menu==3){
          ordenar.mostrar();
      }
     
     }while(menu>=1 && menu<=3);
        
        
        
    }
}
    class vec{
        
         String vector[]= new String [10]; 
         boolean ordenado=false;
         
         public void llenado(){
           
        
        for(int iteracion=0;iteracion<10;iteracion++){
            vector[iteracion]=JOptionPane.showInputDialog("Ingrese un caracter");
            
        }
        
        }
        
        public void ordenado(){
           ordenado=true;
            for(int iteracion=0;iteracion<10;iteracion++){
                Arrays.sort(vector);
            }
            
          
           
            
        }
        public void mostrar(){
            if(ordenado==true){
            System.out.println("ORDENADO:");
            }else if(ordenado==false){
                 System.out.println("SIN ORDENAR");
            }
            for(int i=0;i<10;i++){
               System.out.print(vector[i]+" ");
           }
            System.out.println();
        }
} 

