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

public class AboutUs extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutUs frame = new AboutUs();
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
	public AboutUs() {
		setTitle("About Us");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 819, 509);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 255));
		panel.setBounds(0, 0, 803, 470);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ABOUT US: ");
		lblNewLabel.setFont(new Font("Franklin Gothic Demi", Font.BOLD, 32));
		lblNewLabel.setForeground(new Color(0, 51, 153));
		lblNewLabel.setBounds(71, 11, 169, 52);
		panel.add(lblNewLabel);
		
		JTextArea txtrInThe = new JTextArea();
		txtrInThe.setWrapStyleWord(true);
		txtrInThe.setForeground(new Color(0, 0, 0));
		txtrInThe.setBackground(Color.WHITE);
		txtrInThe.setFont(new Font("Monospaced", Font.ITALIC, 18));
		txtrInThe.setText("Hufflepuff was dull city when it was build. In 1996, government made a huge transformed "
				+ "to the city including build a water theme park to attract investors and innovators together transform "
				+ "the city to new modern city with various facilities including the theme park. Thanks to new idea from government,"
				+ " Hufflepuff Water Theme Park now has begun operations with such welcome from tourists and peoples all over the state."
				+ " We would like to thank you to all of our visitors that support us and we hope you get pleasant "
				+ "experience while in here.");
		txtrInThe.setLineWrap(true);
		txtrInThe.setRows(10);
		txtrInThe.setEditable(false);
		txtrInThe.setBounds(107, 60, 603, 364);
		panel.add(txtrInThe);
		
		JButton backBtn = new JButton("Back");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Welcome wc = new Welcome();
				setVisible(false);
				wc.setVisible(true);
				
			}
		});
		backBtn.setBounds(10, 436, 89, 23);
		panel.add(backBtn);
	}
}
