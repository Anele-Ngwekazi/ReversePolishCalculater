import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class CalcGui extends JFrame {

    private static final long serialVersionUID = 1L;
    public JPanel contentPane;
    
    public CalcGui() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(".\\img\\Anezile icon.PNG"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 505);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
}