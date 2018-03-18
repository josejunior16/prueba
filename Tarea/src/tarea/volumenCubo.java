package tarea;
//@author jose

import javax.swing.JOptionPane;

public class volumenCubo extends VolumenEsfera {
  void cubo(){
      double resultado,areaCubo;
         areaCubo=Double.parseDouble(JOptionPane.showInputDialog("ingrese el area del cubo"));
         resultado=(Math.pow(areaCubo,3));
        
         JOptionPane.showMessageDialog(null,"el volumen del cubo es: "+resultado);
  }
          
}
