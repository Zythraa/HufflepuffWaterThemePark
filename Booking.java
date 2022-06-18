import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Booking extends JFrame {

	private JPanel contentPane;
	private JTextField icTF;
	private JTextField nameTF;
	private JTextField phoneTF;
	private JTextField dateTF;
	private ButtonGroup bg = new ButtonGroup();
	static Booking bookingframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bookingframe = new Booking();
					bookingframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Booking() {
		setTitle("Booking");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 923, 509);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 255));
		panel.setBounds(0, 0, 907, 470);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("IC Number:");
		lblNewLabel.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		lblNewLabel.setBounds(48, 120, 105, 31);
		panel.add(lblNewLabel);

		JLabel lblBooking = new JLabel("Booking:");
		lblBooking.setForeground(new Color(0, 51, 153));
		lblBooking.setFont(new Font("Franklin Gothic Demi", Font.BOLD, 32));
		lblBooking.setBounds(35, 11, 156, 52);
		panel.add(lblBooking);

		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		lblName.setBounds(48, 175, 105, 31);
		panel.add(lblName);

		JLabel lblPhoneNo = new JLabel("Phone No:");
		lblPhoneNo.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		lblPhoneNo.setBounds(48, 229, 105, 31);
		panel.add(lblPhoneNo);

		JLabel lblGender = new JLabel("Gender:");
		lblGender.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		lblGender.setBounds(48, 284, 105, 31);
		panel.add(lblGender);

		JLabel lblAdultTicket = new JLabel("Adults(16-60) RM83 :");
		lblAdultTicket.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		lblAdultTicket.setBounds(417, 117, 197, 31);
		panel.add(lblAdultTicket);

		JComboBox adultCB = new JComboBox();
		adultCB.setModel(new DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
		adultCB.setBounds(722, 122, 112, 22);
		panel.add(adultCB);

		JLabel lblChildrensRm = new JLabel("Childrens(6-15) Rm61:");
		lblChildrensRm.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		lblChildrensRm.setBounds(417, 172, 222, 31);
		panel.add(lblChildrensRm);

		JComboBox childrenCB = new JComboBox();
		childrenCB.setModel(new DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
		childrenCB.setBounds(722, 177, 112, 22);
		panel.add(childrenCB);

		JLabel lblSeniorCitizensabove = new JLabel("Senior Citizens(Above 60) Rm53:");
		lblSeniorCitizensabove.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		lblSeniorCitizensabove.setBounds(417, 226, 295, 31);
		panel.add(lblSeniorCitizensabove);

		JComboBox seniorCB = new JComboBox();
		seniorCB.setModel(new DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
		seniorCB.setBounds(722, 233, 112, 22);
		panel.add(seniorCB);

		JLabel lblKidsbelowcmFree = new JLabel("Kids(below 90cm) Free:");
		lblKidsbelowcmFree.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		lblKidsbelowcmFree.setBounds(417, 281, 222, 31);
		panel.add(lblKidsbelowcmFree);

		JComboBox kidssCB = new JComboBox();
		kidssCB.setModel(new DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
		kidssCB.setBounds(722, 288, 112, 22);
		panel.add(kidssCB);

		icTF = new JTextField();
		icTF.setBounds(206, 123, 156, 25);
		panel.add(icTF);
		icTF.setColumns(10);

		nameTF = new JTextField();
		nameTF.setColumns(10);
		nameTF.setBounds(206, 180, 156, 25);
		panel.add(nameTF);

		phoneTF = new JTextField();
		phoneTF.setColumns(10);
		phoneTF.setBounds(206, 234, 156, 25);
		panel.add(phoneTF);

		JLabel lblDatedmyyyy = new JLabel("Date(D/M/YYYY):");
		lblDatedmyyyy.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 17));
		lblDatedmyyyy.setBounds(48, 341, 147, 31);
		panel.add(lblDatedmyyyy);

		dateTF = new JTextField();
		dateTF.setColumns(10);
		dateTF.setBounds(206, 347, 156, 25);
		panel.add(dateTF);

		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnMale.setBackground(new Color(204, 204, 255));
		rdbtnMale.setBounds(205, 291, 57, 23);
		panel.add(rdbtnMale);

		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnFemale.setBackground(new Color(204, 204, 255));
		rdbtnFemale.setBounds(279, 290, 83, 23);
		panel.add(rdbtnFemale);
		rdbtnMale.setActionCommand("Male");
		rdbtnFemale.setActionCommand("Female");
		bg.add(rdbtnFemale);
		bg.add(rdbtnMale);

		JButton bookBtn = new JButton("BOOK");
		bookBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ic = null;
				String name = null;
				String phone = null;
				String gender = null;
				LocalDate date = null;
				int numAdult = 0;
				int numChild = 0;
				int numSenior = 0;
				int numKid = 0;

				if (icTF.getText().isEmpty() || nameTF.getText().isEmpty() || phoneTF.getText().isEmpty()
						|| !bg.getSelection().isSelected() || dateTF.getText().isEmpty()
						|| (adultCB.getSelectedItem().toString().equals("0")
								&& childrenCB.getSelectedItem().toString().equals("0")
								&& seniorCB.getSelectedItem().toString().equals("0"))) {
					JOptionPane.showMessageDialog(new JFrame(), "Please fill in all the fields!", "Required Field",
							JOptionPane.WARNING_MESSAGE);
				} else {

					boolean isValidIc;
					ic = icTF.getText();
					isValidIc = validICNum(ic);
					if (isValidIc == false) {
						JOptionPane.showMessageDialog(new JFrame(), "Invalid format of IC (xxxxxx-xx-xxxx)!", "Error",
								JOptionPane.ERROR_MESSAGE);
					} else {
						name = nameTF.getText();
						boolean isValidPhone;
						phone = phoneTF.getText();
						isValidPhone = validPhone(phone);
						if (isValidPhone == false) {
							JOptionPane.showMessageDialog(new JFrame(), "Invalid format of Phone No (01234567463)!",
									"Error", JOptionPane.ERROR_MESSAGE);
						} else {
							gender = bg.getSelection().getActionCommand();
							try {
								DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("d/M/yyyy");
								date = LocalDate.parse(dateTF.getText(), dateFormat);
								numAdult = Integer.parseInt(adultCB.getSelectedItem().toString());
								numChild = Integer.parseInt(childrenCB.getSelectedItem().toString());
								numSenior = Integer.parseInt(seniorCB.getSelectedItem().toString());
								numKid = Integer.parseInt(kidssCB.getSelectedItem().toString());
								Receipt rc = new Receipt();
								JOptionPane.showMessageDialog(new JFrame(), "Successfully booked, Thank you !! ", "Successfully booked ",
                                        JOptionPane.INFORMATION_MESSAGE);
								setVisible(false);								
								rc.generateReceipt(ic, name, phone, gender, date, numAdult, numChild, numSenior, numKid);
								rc.setVisible(true);
								
							} catch (DateTimeParseException ex) {
								JOptionPane.showMessageDialog(new JFrame(), "Invalid format of Date (d/M/yyyy) !",
										"Error", JOptionPane.ERROR_MESSAGE);
							}
						}
					}
				}
			}
		});
		bookBtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		bookBtn.setBounds(722, 391, 112, 39);
		panel.add(bookBtn);

		JButton backBtn = new JButton("Back");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Welcome wc = new Welcome();
				setVisible(false);
				wc.setVisible(true);

			}
		});
		backBtn.setBounds(24, 413, 89, 23);
		panel.add(backBtn);
	}

	public boolean validICNum(String ic) {
		String regex = "^\\d{6}\\-\\d{2}\\-\\d{4}$";

		// Compile the ReGex
		Pattern p = Pattern.compile(regex);

		// If the time is empty
		if (ic == null) {
			return false;
		}

		Matcher m = p.matcher(ic);

		return m.matches();
	}

	public boolean validPhone(String phone) {
		String regex = "^(01)[0-46-9]*[0-9]{7,8}$";

		// Compile the ReGex
		Pattern p = Pattern.compile(regex);

		
		if (phone == null) {
			return false;
		}

		
		Matcher m = p.matcher(phone);

		return m.matches();
	}
}
