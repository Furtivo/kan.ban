package Kanban;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Window extends JFrame{
	private JButton btnAdd;
	private JButton btnCan;

	public Window(String title){
		super(title);

		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		gc.gridx=0;
		gc.gridy=0;
		add(new JLabel("Título: "),gc);
		gc.gridx=1;
		gc.gridy=0;
		JTextField txtitle= new JTextField();
		txtitle.setPreferredSize(new Dimension(100,25));
		add(txtitle,gc);

		gc.gridx=0;
		gc.gridy=1;
		add(new JLabel("Descripción: "),gc);
		gc.gridx=1;
		gc.gridy=2;
		JTextField txdesc= new JTextField();
		txdesc.setPreferredSize(new Dimension(100,100));
		add(txdesc,gc);

		gc.gridx=0;
		gc.gridy=3;
		add(new JLabel("Estado: "),gc);
		gc.gridx=1;
		gc.gridy=3;
		String [] categories = {"Elige un estado","BACKLOG", "DO_TO", "IN_PROGRESS", "DONE"};
		JComboBox cbstate= new JComboBox<String>(categories);
		cbstate.setPreferredSize(new Dimension(130,25));
		add(cbstate,gc);

		gc.gridx=0;
		gc.gridy=4;
		add(new JLabel("Categoría: "),gc);
		gc.gridx=1;
		gc.gridy=4;
		JTextField txcatego= new JTextField();
		txcatego.setPreferredSize(new Dimension(100,25));
		add(txcatego,gc);

		gc.gridx=0;
		gc.gridy=5;
		add(new JLabel("Prioridad: "),gc);
		gc.gridx=1;
		gc.gridy=5;
		Integer [] priorities = {0,1,2,3,4,5};
		JComboBox priority= new JComboBox<Integer>(priorities);
		priority.setPreferredSize(new Dimension(100,25));
		add(priority,gc);

		gc.gridx=0;
		gc.gridy=6;
		add(new JLabel("Propietario: "),gc);
		gc.gridx=1;
		gc.gridy=6;
		JTextField txprop= new JTextField();
		txprop.setPreferredSize(new Dimension(100,25));
		add(txprop,gc);

		gc.gridx=0;
		gc.gridy=10;
		btnAdd = new JButton ("Add");
		btnAdd.addActionListener(new ConfirmationAction());
		add(btnAdd,gc);
		gc.gridx=2;
		gc.gridy=10;
		btnCan = new JButton ("Cancel");
		btnCan.addActionListener(new CancelAction());
		add(btnCan,gc);


	}
	private void addListener() {
		btnAdd.addActionListener(new ConfirmationAction());
		btnCan.addActionListener(new CancelAction());
	}
	private class ConfirmationAction implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(null,"Confirmed");
		}
	}
	private class CancelAction implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			dispose();
		}
	}
	public static void main(String[] args){

		JFrame labelFrame2=new Window("Agregar");
		labelFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		labelFrame2.setSize(320,350);
		labelFrame2.setVisible(true);
	}
}
