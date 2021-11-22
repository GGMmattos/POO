import javax.swing.*; //necessário
import java.awt.*;

public class Exemplo1 {

    public static void main(String[] args) {
        JFrame janela = new JFrame("Primeira janela");
        janela.setBounds(50,100,1080,720);
        //janela.setBackground(Color.getColor());
        janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); //operação de fechamento, versão básica
        janela.setVisible(true);


    }
}

