
        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.awt.event.WindowEvent;
        import java.awt.event.WindowListener;


public class Exemplo4 extends JFrame{
    private JPanel pnlPrincipal;
    private JPanel pnlBotoes;
    private JButton btnOk;
    private JButton btnCancelar;
    private JButton btnSavar;
    private BorderLayout brdLayout;
    private JLabel lblTexto;
    private JLabel lblResposta;
    private JTextField tfInsercaoNome;
    private JCheckBox cbMaiorIdade;
    private JRadioButton rbMasculino;
    private JRadioButton rbFeminino;
    private ButtonGroup bgGenero;


    public Exemplo4() {
        super("Teste de Paineis");		//enviando para o construtor de JFrame o título da janela

        brdLayout = new BorderLayout();

        Container c = getContentPane();		//pegando o container de JFrame para construir em cima dele

        pnlPrincipal = new JPanel(new GridLayout(6, 0, 5, 5));	//criando o painel de conteúdo

        c.add(pnlPrincipal, brdLayout.CENTER);				//adicionando o painel principal no centro da tela

        lblTexto = new JLabel("Digite o seu nome");	//criando label
        pnlPrincipal.add(lblTexto);							//adicionando label no painel de conteúdo

        tfInsercaoNome = new JTextField();
        pnlPrincipal.add(tfInsercaoNome);
        tfInsercaoNome.setText("");

        cbMaiorIdade = new JCheckBox("Marque se você é maior de idade");
        pnlPrincipal.add(cbMaiorIdade);

        rbMasculino = new JRadioButton("Masculino");
        rbFeminino = new JRadioButton("Feminino");
        pnlPrincipal.add(rbFeminino);
        pnlPrincipal.add(rbMasculino);
        bgGenero = new ButtonGroup();
        bgGenero.add(rbFeminino);
        bgGenero.add(rbMasculino);

        pnlBotoes = new JPanel(new FlowLayout(FlowLayout.RIGHT));	//criando o painel dos botões
        pnlBotoes.setBackground(Color.orange);						//setando uma cor para painel dos botoes

        btnOk = new JButton("Ok");								//criando os botões
        btnCancelar = new JButton("Cancelar");
        btnSavar = new JButton("Salvar");
        pnlBotoes.add(btnSavar);									//adicionando os botões no painel dos botões
        pnlBotoes.add(btnCancelar);
        pnlBotoes.add(btnOk);

        lblResposta = new JLabel("");							//label de resposta
        pnlPrincipal.add(lblResposta);

        c.add(pnlBotoes, brdLayout.SOUTH);							//adicionando o painel dos botões no container da frame

        btnOk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String dados = tfInsercaoNome.getText();
                if (!tfInsercaoNome.getText().equals("")){
                    if (cbMaiorIdade.isSelected()) {
                        dados += "; Maior de Idade";
                    }
                    else {
                        dados += "; Menor de Idade";
                    }
                    if(rbFeminino.isSelected()) {
                        dados += "; Feminino";
                    }
                    else {
                        if(rbMasculino.isSelected()) {
                            dados += "; Masculino";
                        }
                        else {
                            dados += "; Gênero não informado";
                        }
                    }
                    lblResposta.setText(dados);
                }

            }
        });

        btnCancelar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tfInsercaoNome.setText("");
                cbMaiorIdade.setSelected(false);
                bgGenero.clearSelection();					//limpando a seleção dos radio buttons
                lblResposta.setText("");
            }
        });

        btnSavar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(rootPane, "Dados salvos");
                JOptionPane.showMessageDialog(rootPane, "Dados salvos", "Confirmação de Inserção", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        //setSize(450, 450);
        //pack();							//ajusta a tela para caberem os elementos inseridos
        //setLocationRelativeTo(null);		//seta a localização da tela para o centro (null)
        setVisible(true);					//seta janela como visível
    }


    public static void main(String[] args) {
        Exemplo4 tela = new Exemplo4();

        tela.addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {
                showEvent(e);
                tela.setSize(450, 450);
                tela.setLocationRelativeTo(null);
            }

            @Override
            public void windowIconified(WindowEvent e) {
                showEvent(e);
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                showEvent(e);
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                showEvent(e);
            }

            @Override
            public void windowClosing(WindowEvent e) {
                showEvent(e);
                e.getWindow().dispose();
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {
                showEvent(e);
            }

            @Override
            public void windowActivated(WindowEvent e) {
                showEvent(e);
            }

            private void showEvent(WindowEvent e){
                System.out.println(e + " / " + e.getWindow().getClass());
            }

        });

    }


}
