import javax.swing.*;
import  java.awt.*;

public class Exemplo4  extends JFrame {
    private JPanel pnlPrincipal;
    private JPanel pnlBotoes;
    private JButton bntOk;
    private JButton bntCancelar;
    private JButton bntSalvar;
    private BorderLayout brdLayout;

    public Exemplo4(){
        super("Teste de Paineis");

        brdLayout = new BorderLayout();

        Container c  = this.getContentPane();  //Pegando o container de Jframe para contruir em cima dele

        pnlPrincipal = new JPanel(); //Criação Painel de conteudo

        pnlBotoes = new JPanel();

        c.add(pnlPrincipal, brdLayout.CENTER); //Adicionando o painel principal ao centro da tela

        setVisible(true);
    }

    public static void main(String[] args) {

    }
}
