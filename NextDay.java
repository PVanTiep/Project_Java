package Cau1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.sound.sampled.AudioFileFormat;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NextDay extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblThng;
	private JLabel lblNm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NextDay frame = new NextDay();
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
	public NextDay() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField.setBounds(235, 40, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField_1.setColumns(10);
		textField_1.setBounds(235, 89, 96, 19);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField_2.setColumns(10);
		textField_2.setBounds(235, 136, 96, 19);
		contentPane.add(textField_2);
		
		final JLabel lblNewLabel = new JLabel("Ng\u00E0y:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(92, 28, 120, 37);
		contentPane.add(lblNewLabel);
		
		lblThng = new JLabel("Th\u00E1ng:");
		lblThng.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblThng.setBounds(92, 80, 120, 37);
		contentPane.add(lblThng);
		
		lblNm = new JLabel("N\u0103m:");
		lblNm.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNm.setBounds(92, 124, 120, 37);
		contentPane.add(lblNm);
		final JLabel lblNewLabel_1 = new JLabel("");
		JButton btnNewButton = new JButton("Ng\u00E0y k\u1EBF ti\u1EBFp");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textField.getText());
				int b = Integer.parseInt(textField_1.getText());
				int c = Integer.parseInt(textField_2.getText());
				Ngay dateNgay = new Ngay(a,b,c);
				if (dateNgay.checkDay()==false)
				{
					JOptionPane.showMessageDialog(null, "Ngày tháng năm không đúng");
				}
				else {
					Ngay nextNgay=dateNgay.nextNgay();
					lblNewLabel_1.setText("Ngày kế tiếp là: Ngày "+nextNgay.getDD()+" tháng "+nextNgay.getMM()+" năm "+nextNgay.getYY() );
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(139, 173, 146, 37);
		contentPane.add(btnNewButton);
		
		
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(52, 220, 374, 33);
		contentPane.add(lblNewLabel_1);
	}

	
}
