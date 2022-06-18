import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicketPrice extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicketPrice frame = new TicketPrice();
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
	public TicketPrice() {
		setTitle("Ticket Price");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(204, 204, 255));
		panel.setBounds(0, 0, 574, 407);
		contentPane.add(panel);
		
		JLabel lblTicketPrice = new JLabel("TICKET PRICE:");
		lblTicketPrice.setForeground(new Color(0, 51, 153));
		lblTicketPrice.setFont(new Font("Franklin Gothic Demi", Font.BOLD, 32));
		lblTicketPrice.setBounds(33, 14, 226, 52);
		panel.add(lblTicketPrice);
		
		JLabel lblNewLabel_2 = new JLabel("Adults(16-60) :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2.setBounds(83, 104, 251, 37);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Childrens(6-15) :");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2_1.setBounds(83, 164, 251, 37);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Senior Citizens(Above 60) :");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2_1_1.setBounds(83, 221, 279, 37);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("RM83");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2_2.setBounds(403, 104, 120, 37);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("RM61");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2_2_1.setBounds(403, 164, 120, 37);
		panel.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("RM53");
		lblNewLabel_2_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2_2_1_1.setBounds(403, 221, 120, 37);
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
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Kids(below 90cm) :");
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2_1_2.setBounds(83, 278, 251, 37);
		panel.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("FREE");
		lblNewLabel_2_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2_2_1_1_1.setBounds(403, 278, 120, 37);
		panel.add(lblNewLabel_2_2_1_1_1);
	}

}
