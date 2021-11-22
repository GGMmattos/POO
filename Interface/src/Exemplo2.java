import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class Exemplo2 {
    public static void main(String[] args) {

        JFrame janela = new JFrame("Janela com elemementos");
        janela.setBounds(50, 100, 400, 150);
        janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        Container caixa = janela.getContentPane(); //possibilita adicionar elementos em caixa, e assim em janela
        //FlowLayout flow = new FlowLayout(FlowLayout.CENTER,50, 50); //OBS: flow é um layout que mostra todos elementos numa linha
        GridLayout grid = new GridLayout(0,10,20,20);
        //caixa.setLayout(flow);
        caixa.setLayout(grid);


        for(int i=1; i<=8; i++){
            caixa.add(new JButton("Botão" + i));
        }
        janela.pack();
        janela.setVisible(true);

    }
}
