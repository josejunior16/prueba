package tarea;


import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class Giua1 {
   void guia(){
      
   area Area=new area();
  circunferencia circ= new circunferencia();
        VolumenEsfera volumen= new VolumenEsfera();
        volumenCubo cubo=new volumenCubo();
        promedio prom=new promedio();
       
        int menu;
        do{
        menu=Integer.parseInt(JOptionPane.showInputDialog("Seleccione la opcion que desea realizar:\n1.calcular el area de una figura\n2.calcular la circunferencia de un circulo\n"
                + "3.calcular el volumen de una esfera\n4.calcular el volumen de un cubo\n5.calcular el promedio de 10 datos"));
        
        if(menu==1){
            Area.calcularArea();
        }
        if(menu==2){
            circ.calcularCircunferencia();
        }
        if(menu==3){
            volumen.esfera();
        }
         if(menu==4){
             cubo.cubo();
         }
         if(menu==5){
             prom.promedio();
         }  
        }while(menu<=0 || menu>5);
        
        
    }
    
}
