package ntu.MSSV63134085;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;

public class Cau1_AppGiaiPTB3_2_1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtD;
	private JTextArea txtKQ;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cau1_AppGiaiPTB3_2_1 frame = new Cau1_AppGiaiPTB3_2_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Cau1_AppGiaiPTB3_2_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("APP GIẢI PHƯƠNG TRÌNH BẬC 3,2,1");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(34, 10, 374, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ax^3+bx^2+cx+d=0");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 41, 394, 34);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nhập a:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 66, 68, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Nhập b:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(10, 92, 68, 27);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Nhập d:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2.setBounds(10, 142, 68, 27);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Nhập c:");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_3.setBounds(10, 115, 68, 27);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Kết quả:");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_4.setBounds(10, 211, 68, 27);
		contentPane.add(lblNewLabel_2_4);
		
		txtA = new JTextField();
		txtA.setToolTipText("Nhập a=0 để giải phương trình bậc 2");
		txtA.setBounds(70, 66, 319, 25);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setToolTipText("Nhập a,b=0 để giải phương trình bậc 1");
		txtB.setColumns(10);
		txtB.setBounds(70, 92, 319, 25);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setColumns(10);
		txtC.setBounds(70, 118, 319, 25);
		contentPane.add(txtC);
		
		txtD = new JTextField();
		txtD.setColumns(10);
		txtD.setBounds(70, 145, 319, 25);
		contentPane.add(txtD);
		
		txtKQ = new JTextArea();
		txtKQ.setBackground(new Color(0, 0, 0));
		txtKQ.setForeground(new Color(255, 255, 255));
		txtKQ.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtKQ.setEnabled(false);
		txtKQ.setToolTipText("");
		txtKQ.setBounds(73, 198, 316, 65);
		contentPane.add(txtKQ);
		
		JButton btnGiai = new JButton("GIẢI");
		btnGiai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý 
				XuLyDuLieuNhap();
			}
		});
		btnGiai.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnGiai.setBounds(70, 173, 319, 21);
		contentPane.add(btnGiai);
	}
	void XuLyDuLieuNhap(){
		try {
            double a = Double.parseDouble(txtA.getText());
            double b = Double.parseDouble(txtB.getText());
            double c = Double.parseDouble(txtC.getText());
            double d = Double.parseDouble(txtD.getText());
            if (a==0) {
            	if (b==0) {
            		PTB1(c,d); //a,b = 0 giải phương tình bâc 1
            	}
            	else {
            		PTB2(b,c,d); // a=0 giải phương trình bậc 2
            	}
            }
            else {
            	PTB3(a,b,c,d); // giải phương trình bậc 3
            }
        } catch (NumberFormatException ex) {
        	txtKQ.setText("Vui lòng nhập tham số hợp lệ"); // xử lý ngoại lệ
        }
	}
	void PTB3(double a, double b, double c, double d) {
		//hàm xử lý phương trình bậc 3
		//cách giải phương trình bậc 3 tham khảo từ: https://rdsic.edu.vn/blog/toan/giai-phuong-trinh-bac-3-phuong-phap-va-buoc-dau-tien-de-giai-quyet-vi-cb.html
		
		//∆ = b^2c^2 - 4ac^3 - 4b^3d - 27a^2d^2 + 18abcd
		double delta = b * b * c * c - 4 * a * c * c * c - 4 * b * b * b * d - 27 * a * a * d * d + 18 * a * b * c * d;
        if (delta > 0) {
            double deltaCubit = Math.cbrt(delta + Math.sqrt(delta * delta - 4 * Math.pow(c, 3) * delta));
            double x1 = (-1 / (2 * a)) * (b + deltaCubit) + Math.cbrt(deltaCubit);
            double x2 = (-1 / (2 * a)) * (b - 0.5 * deltaCubit + (Math.sqrt(3) / 2) * Math.sqrt(4 * a * c - b * b + deltaCubit));
            double x3 = (-1 / (2 * a)) * (b - 0.5 * deltaCubit - (Math.sqrt(3) / 2) * Math.sqrt(4 * a * c - b * b + deltaCubit));

            txtKQ.setText("Phương trình có 3 nghiệm phân biệt:\n");
            txtKQ.append("x1 = " + x1 + "\n");
            txtKQ.append("x2 = " + x2 + "\n");
            txtKQ.append("x3 = " + x3 + "\n");
        } else if (delta == 0) {
            double nghiemDon = (-1 / (2 * a)) * (b + Math.signum(b) * Math.cbrt(c / Math.pow(Math.abs(b), 3) * 27 * a * a * a));
            double nghiemKep = (-1 / (2 * a)) * (b - Math.signum(b) * Math.cbrt(c / Math.pow(Math.abs(b), 3) * 27 * a * a * a));
            
            txtKQ.setText("Phương trình có 3 nghiệm trong đó có 2 nghiệm kép:\n");
            txtKQ.append("x1 = " + nghiemDon + "\n");
            txtKQ.append("x2 = x3 = " + nghiemKep + "\n");
        } else {
           
        }
	}
	void PTB2(double a, double b, double c) {
		//hàm xử lý phương trình bậc 2
		double delta = b*b - 4*a*c;

    	if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            txtKQ.setText("Phương trình có 2 nghiệm phân biệt:\nx1 = " + x1 + "\nx2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            txtKQ.setText("Phương trình có nghiệm kép:\nx = " + x);
        } else {
        	double phanThat = -b / (2 * a);
            double phanAo = Math.sqrt(Math.abs(delta)) / (2 * a);
            txtKQ.setText("Phương trình có 2 nghiệm ảo:\nx1 = " + phanThat + " + i" + phanAo + "\nx2 = " + phanThat + " - i" + phanAo);
        }
	}
	void PTB1(double a, double b) {
		// hàm xử lý phương trình bậc 1
		if (a == 0) {
            if (b == 0) {
            	txtKQ.setText("Phương trình có vô số nghiệm");
            } else {
            	txtKQ.setText("Phương trình vô nghiệm");
            }
        } else {
            double x = -b / a;
            txtKQ.setText("Phương trình có 1 nghiệm:\n x = " + x);
        }
	}
}
