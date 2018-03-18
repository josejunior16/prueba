package tarea;

import javax.swing.JOptionPane;

public class area extends Giua1 {
 void calcularArea(){
  double resultado,diagonal;
  double base=Double.parseDouble(JOptionPane.showInputDialog("ingrese la base"));
  double altura=Double.parseDouble(JOptionPane.showInputDialog("ingrese la altura"));
      resultado= base*altura;      
      diagonal= Math.sqrt(Math.pow(base,2)+ Math.pow(altura,2));

      JOptionPane.showMessageDialog(null, "El Area de la figura es:"+resultado+"\n La Diagonal de la figura es:"+diagonal);
            
    } 
}
