package tarea;

import javax.swing.JOptionPane;

public class circunferencia extends area{
    void calcularCircunferencia(){
        double resultado,radio;
        radio= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del radio"));
        resultado= 3.14*(radio*2);
        JOptionPane.showMessageDialog(null,"La circunferencia del circulo es"+resultado);
    }
}
