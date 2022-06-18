import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContactUs extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactUs frame = new ContactUs();
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
	public ContactUs() {
		setTitle("Contact Us");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 813, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(204, 204, 255));
		panel.setBounds(0, 0, 803, 407);
		contentPane.add(panel);
		
		JLabel lblContactUs = new JLabel("CONTACT US: ");
		lblContactUs.setForeground(new Color(0, 51, 153));
		lblContactUs.setFont(new Font("Franklin Gothic Demi", Font.BOLD, 32));
		lblContactUs.setBounds(33, 14, 226, 52);
		panel.add(lblContactUs);
		
		JLabel lblNewLabel_2 = new JLabel("Phone Number: ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2.setBounds(140, 104, 198, 37);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Instagram:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2_1.setBounds(140, 185, 198, 37);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Email:");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2_1_1.setBounds(140, 276, 198, 37);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("011 - 76242536 ");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2_2.setBounds(371, 104, 198, 37);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("@hufflepuff_waterthemepark");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2_2_1.setBounds(371, 185, 304, 37);
		panel.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("hufflepuff@gmail.com");
		lblNewLabel_2_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2_2_1_1.setBounds(371, 276, 304, 37);
		panel.add(lblNewLabel_2_2_1_1);
		
		JButton backBtn = new JButton("Back");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Welcome wc = new Welcome();
				setVisible(false);
				wc.setVisible(true);
				
			}
		});
		backBtn.setBounds(21, 360, 89, 23);
		panel.add(backBtn);
	}

}
