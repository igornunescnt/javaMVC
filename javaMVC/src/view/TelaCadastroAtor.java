package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

public class TelaCadastroAtor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroAtor frame = new TelaCadastroAtor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCadastroAtor() {
		setTitle("Cadastro de Ator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nacionaliade");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(0, 131, 114, 36);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setEnabled(false);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Ação");
		btnNewButton.setFont(new Font("SansSerif", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(315, 176, 86, 28);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(113, 92, 292, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Cadastro");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ygorv\\Documents\\workspace\\javaMVC\\img\\icon.png"));
		lblNewLabel_1.setBounds(156, 14, 126, 48);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setSelectedIndex(5);
		comboBox.setBounds(113, 136, 144, 26);
		contentPane.add(comboBox);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNome.setEnabled(false);
		lblNome.setBounds(16, 88, 114, 36);
		contentPane.add(lblNome);
	}
}
