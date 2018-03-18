package tarea;

import javax.swing.JOptionPane;

public class VolumenEsfera extends circunferencia {
  void esfera(){
      double resultado,radio;
        
      radio=Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor del radio de la esfera"));
        resultado=(4.18666)*(Math.pow(radio,3));
        
        JOptionPane.showMessageDialog(null,"el volumen de la esfera es: "+resultado);
  }  
}
