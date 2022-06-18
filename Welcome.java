import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;

public class Welcome extends JFrame {

	private JPanel contentPane;
	static Welcome frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Welcome();
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
	public Welcome() {
		setTitle("WELCOME TO HUFFLEPUFF WATER THEME PARK");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 959, 521);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(204, 204, 255));
		panel_1.setBounds(0, 0, 949, 489);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(0, 224, 512, 265);
		panel_1.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("HUFFLEPUFF");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 0, 153));
		lblNewLabel.setFont(new Font("Gill Sans MT Condensed", Font.BOLD, 99));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(10, 62, 492, 99);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("WATER THEMEPARK");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_1.setBounds(131, 162, 238, 31);
		panel_2.add(lblNewLabel_1);
		
		JLabel image = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/waterpark.jpg")).getImage();
		image.setIcon(new ImageIcon(img));
		image.setBounds(393, 0, 556, 297);
		panel_1.add(image);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 0, 153));
		panel_3.setBounds(337, 99, 175, 192);
		panel_1.add(panel_3);
		
		JLabel lblNewLabel_2 = new JLabel("HOME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2.setBounds(38, 33, 124, 37);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("ABOUT US");
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AboutUs au = new AboutUs();
				setVisible(false);
				au.setVisible(true);
			}
		});
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_1.setBounds(38, 69, 124, 37);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("CONTACT US");
		lblNewLabel_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ContactUs cu = new ContactUs();
				setVisible(false);
				cu.setVisible(true);
			}
		});
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_1_1.setBounds(38, 107, 124, 37);
		panel_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("BOOK NOW --->");
		lblNewLabel_2_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Booking bk = new Booking();
				setVisible(false);
				bk.setVisible(true);

			}
		});
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblNewLabel_2_1_1_1.setBounds(581, 345, 323, 79);
		panel_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("TICKET PRICE");
		lblNewLabel_2_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TicketPrice tp = new TicketPrice();
				setVisible(false);
				tp.setVisible(true);
			}
		});
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_1_2.setBounds(38, 149, 124, 37);
		panel_1.add(lblNewLabel_2_1_2);
	}

}
