import javax.swing.JOptionPane;

public class CadastroUsuarios {
    public static void main (String[] args){
        //1 Cadastrar novo usuário com a quantidade de usuarioas a ser cadastrados e verificando se tem espaço para adicionar 
        //2 Listar todos usuários
        //4 busca poor nome - retorna o nome idade e posição
        //5remover usuario - rearrumando
        //3 Sair

        int numero = 1;
        while (numero>0 && numero<6){

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número"));

            switch(numero) {
                case 1:
                JOptionPane.showMessageDialog(null, "Cadastro de Usuário");
                int qtdUsuario = Integer.parseInt(JOptionPane.showInputDialog("Quantos usuário quer Cadastrar?"));
                

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

}