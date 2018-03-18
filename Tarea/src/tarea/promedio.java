package tarea;
// @author jose

import javax.swing.JOptionPane;

public class promedio extends volumenCubo {
 void promedio(){
     int iteracion;
       double vec[]=new double[10];
        double suma=0,promedio;
        for(iteracion=0;iteracion<10;iteracion++){
            vec[iteracion]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el dato "+(iteracion+1)));
            suma=suma+vec[iteracion];
        }
        promedio=suma/10;
        
        JOptionPane.showMessageDialog(null,"el promedio es: "+promedio);
 }   
}
