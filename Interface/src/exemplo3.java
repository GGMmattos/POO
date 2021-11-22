import javax.swing.*;
import java.awt.*;

public class exemplo3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Janela");
        JButton btn = new JButton("Sou um botão JButoon");
        JLabel texto = new JLabel("Numero de cliques no botão");
        JPanel painel = new JPanel(new FlowLayout()); //possibiliata as subregioes
        Container c = frame.getContentPane(); //container para adicionar o que foi criado ate entao
        //c.add(btn);
        //c.add(texto);
        painel.add(btn);
        painel.add(texto);
        c.add(painel);
        frame.pack();
        frame.setVisible(true);


    }
}
