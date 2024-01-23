package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Dimension;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;
import java.awt.Frame;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import java.awt.Insets;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setVisible(true);
		setTitle("Locadora de Video");
		setResizable(false);
		setSize(new Dimension(800, 800));
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu JMenuLocacao = new JMenu("Locação");
		JMenuLocacao.setIcon(new ImageIcon("C:\\Users\\ygorv\\Documents\\workspace\\javaMVC\\img\\icon.png"));
		JMenuLocacao.setFont(new Font("Calibri", Font.PLAIN, 15));
		menuBar.add(JMenuLocacao);
		
		JMenuItem JMenuItemAlugar = new JMenuItem("Alugar");
		JMenuItemAlugar.setMargin(new Insets(6, 2, 2, 2));
		JMenuItemAlugar.setHorizontalTextPosition(SwingConstants.RIGHT);
		JMenuItemAlugar.setHorizontalAlignment(SwingConstants.LEFT);
		JMenuItemAlugar.setIcon(new ImageIcon("C:\\Users\\ygorv\\Documents\\workspace\\javaMVC\\img\\seta.png"));
		JMenuItemAlugar.setFont(new Font("Calibri", Font.PLAIN, 14));
		JMenuLocacao.add(JMenuItemAlugar);
		
		JMenuItem jMenuItemConsultar = new JMenuItem("Consultar");
		jMenuItemConsultar.setIcon(new ImageIcon("C:\\Users\\ygorv\\Documents\\workspace\\javaMVC\\img\\seta.png"));
		jMenuItemConsultar.setFont(new Font("Calibri", Font.PLAIN, 14));
		jMenuItemConsultar.setMargin(new Insets(6, 2, 2, 2));
		JMenuLocacao.add(jMenuItemConsultar);
		
		JMenu JMenuCadastro = new JMenu("Cadastro");
		JMenuCadastro.setFont(new Font("Calibri", Font.PLAIN, 14));
		menuBar.add(JMenuCadastro);
		
		JMenuItem JMenuItemAtor = new JMenuItem("Ator");
		JMenuItemAtor.setIcon(new ImageIcon("C:\\Users\\ygorv\\Documents\\workspace\\javaMVC\\img\\seta.png"));
		JMenuItemAtor.setMargin(new Insets(6, 2, 2, 2));
		JMenuItemAtor.setFont(new Font("Calibri", Font.PLAIN, 14));
		JMenuCadastro.add(JMenuItemAtor);
		
		JMenu JMenuSair = new JMenu("Sair");
		JMenuSair.setFont(new Font("Calibri", Font.PLAIN, 14));
		menuBar.add(JMenuSair);
	}

}
