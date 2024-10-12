import javax.swing.JOptionPane;

/*
Descrição : Coletar o valor de um quadrado
Versão 01
*/

public class Exemplo04
   {
    public static void main (String args [ ] )
    {
     int Lado, Quadrado;
     Lado = Integer.parseInt(JOptionPane.showInputDialog( "Digite o lado do quadrado: " ));
     Quadrado = (Lado * Lado) ; 
     JOptionPane.showMessageDialog(null," area é " + Quadrado) ;
    }


        }