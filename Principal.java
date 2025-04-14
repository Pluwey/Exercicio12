package principal;

import model.Triangulo;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
    Triangulo tril = new Triangulo();
    
    tril.setBase(Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo")));
    tril.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo")));

    JOptionPane.showMessageDialog(null, "A área do triângulo é " + tril.getArea());
    }
}
