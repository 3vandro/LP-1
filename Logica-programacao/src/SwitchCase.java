import javax.swing.JOptionPane;

public class SwitchCase {
    public static void main (String[] args){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 0 e 5"));
        switch(numero) {
            case 0:
            JOptionPane.showMessageDialog(null, "zero");
            break;
            case 1:
            JOptionPane.showMessageDialog(null, "um");
            break;
            case 2:
            JOptionPane.showMessageDialog(null, "dois");
            break;
            case 3:
            JOptionPane.showMessageDialog(null, "três");
            break;
            case 4:
            JOptionPane.showMessageDialog(null, "quatro");
            break;
            case 5:
            JOptionPane.showMessageDialog(null, "cinco");
            break;
            default:
            JOptionPane.showMessageDialog(null, "Valor Inválido");

        }
    }
    
}
