import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.time.LocalDate;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Receipt extends JFrame {

	private JPanel contentPane;
	private JLabel dateLabel;
	private JLabel genderLabel;
	private JLabel icLabel;
	private JLabel nameLabel;
	private JLabel phoneLabel;
	private JLabel adultLabel;
	private JLabel childrenLabel;
	private JLabel seniorLabel;
	private JLabel kidLabel;
	private JLabel totalLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Receipt frame = new Receipt();
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
	public Receipt() {
		setTitle("Receipt");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 886, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 255));
		panel.setBounds(0, 0, 870, 485);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblReceipt = new JLabel("RECEIPT");
		lblReceipt.setHorizontalAlignment(SwingConstants.CENTER);
		lblReceipt.setForeground(new Color(0, 51, 153));
		lblReceipt.setFont(new Font("Franklin Gothic Demi", Font.BOLD, 39));
		lblReceipt.setBounds(319, 11, 192, 52);
		panel.add(lblReceipt);

		JLabel lblBookerDetails = new JLabel("Booker Details:");
		lblBookerDetails.setForeground(new Color(0, 51, 153));
		lblBookerDetails.setFont(new Font("Franklin Gothic Demi", Font.BOLD, 32));
		lblBookerDetails.setBounds(32, 92, 248, 52);
		panel.add(lblBookerDetails);

		JLabel lblBookerTicket = new JLabel("Booked Ticket:");
		lblBookerTicket.setForeground(new Color(0, 51, 153));
		lblBookerTicket.setFont(new Font("Franklin Gothic Demi", Font.BOLD, 32));
		lblBookerTicket.setBounds(433, 92, 248, 52);
		panel.add(lblBookerTicket);

		JLabel lblNewLabel = new JLabel("IC Number:");
		lblNewLabel.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		lblNewLabel.setBounds(46, 155, 105, 31);
		panel.add(lblNewLabel);

		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		lblName.setBounds(46, 210, 105, 31);
		panel.add(lblName);

		JLabel lblPhoneNo = new JLabel("Phone No:");
		lblPhoneNo.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		lblPhoneNo.setBounds(46, 264, 105, 31);
		panel.add(lblPhoneNo);

		JLabel lblGender = new JLabel("Gender:");
		lblGender.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		lblGender.setBounds(46, 319, 105, 31);
		panel.add(lblGender);

		JLabel lblDatedmyyyy = new JLabel("Date:");
		lblDatedmyyyy.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		lblDatedmyyyy.setBounds(46, 376, 147, 31);
		panel.add(lblDatedmyyyy);

		

		dateLabel = new JLabel("");
		dateLabel.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		dateLabel.setBounds(212, 376, 139, 31);
		panel.add(dateLabel);

		genderLabel = new JLabel("");
		genderLabel.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		genderLabel.setBounds(212, 319, 139, 31);
		panel.add(genderLabel);

		phoneLabel = new JLabel("");
		phoneLabel.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		phoneLabel.setBounds(212, 264, 139, 31);
		panel.add(phoneLabel);

		nameLabel = new JLabel("");
		nameLabel.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		nameLabel.setBounds(212, 210, 139, 31);
		panel.add(nameLabel);

		icLabel = new JLabel("");
		icLabel.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		icLabel.setBounds(212, 155, 178, 31);
		panel.add(icLabel);

		JLabel lblAdultTicket = new JLabel("Adults(16-60) RM83 :");
		lblAdultTicket.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		lblAdultTicket.setBounds(452, 155, 197, 31);
		panel.add(lblAdultTicket);

		JLabel lblChildrensRm = new JLabel("Childrens(6-15) Rm61:");
		lblChildrensRm.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		lblChildrensRm.setBounds(452, 210, 222, 31);
		panel.add(lblChildrensRm);

		JLabel lblSeniorCitizensabove = new JLabel("Senior Citizens(Above 60) Rm53:");
		lblSeniorCitizensabove.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		lblSeniorCitizensabove.setBounds(452, 264, 295, 31);
		panel.add(lblSeniorCitizensabove);

		JLabel lblKidsbelowcmFree = new JLabel("Kids(below 90cm) Free:");
		lblKidsbelowcmFree.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		lblKidsbelowcmFree.setBounds(452, 319, 222, 31);
		panel.add(lblKidsbelowcmFree);

		JLabel lblTotalPrice = new JLabel("Total Price:");
		lblTotalPrice.setForeground(new Color(0, 51, 153));
		lblTotalPrice.setFont(new Font("Franklin Gothic Demi", Font.BOLD, 32));
		lblTotalPrice.setBounds(433, 376, 178, 52);
		panel.add(lblTotalPrice);

		adultLabel = new JLabel("");
		adultLabel.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		adultLabel.setBounds(754, 155, 99, 31);
		panel.add(adultLabel);

		childrenLabel = new JLabel("");
		childrenLabel.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		childrenLabel.setBounds(754, 210, 99, 31);
		panel.add(childrenLabel);

		seniorLabel = new JLabel("");
		seniorLabel.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		seniorLabel.setBounds(754, 264, 99, 31);
		panel.add(seniorLabel);

		kidLabel = new JLabel("");
		kidLabel.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		kidLabel.setBounds(754, 319, 99, 31);
		panel.add(kidLabel);

		totalLabel = new JLabel("");
		totalLabel.setForeground(new Color(0, 51, 153));
		totalLabel.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 32));
		totalLabel.setBounds(613, 383, 125, 42);
		panel.add(totalLabel);

		JButton btnDone = new JButton("DONE");
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Welcome wc = new Welcome();
				setVisible(false);
				wc.setVisible(true);
			}
		});
		btnDone.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDone.setBounds(748, 421, 105, 38);
		panel.add(btnDone);
	}

	public void generateReceipt(String ic, String name, String phone, String gender, LocalDate date, int numAdult,
			int numChild, int numSenior, int numKid) {
		// icLabel.setText();
		int totalPrice = (numAdult * 83) + (numChild * 61) + (numSenior * 53);
		icLabel.setText(ic);
		nameLabel.setText(name);
		phoneLabel.setText(phone);
		genderLabel.setText(gender);
		dateLabel.setText(date.toString());
		adultLabel.setText(String.valueOf(numAdult));
		childrenLabel.setText(String.valueOf(numChild));
		seniorLabel.setText(String.valueOf(numSenior));
		kidLabel.setText(String.valueOf(numKid));
		totalLabel.setText("RM" + String.valueOf(totalPrice));
		
	}
}
