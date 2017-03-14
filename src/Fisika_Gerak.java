import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ARIFIN
 */


public class Fisika_Gerak
{
	private JButton b1,b12,b13,b2,b3;
	private JTextField ts,tv,tt1,tt2,tt3,tcv,tcs,tct,tvo,ta,th,t3;
	private JPanel p1,p2,p3;
	private JLabel ls,lt1,lt2,lt3,la,lh,lv,lvo;
	private JLabel lcv,lcs,lct,lcvt1,lcvt2;
	private JLabel l3,l33,l333,l3333;
	private JFrame f;
	private double a,b,c,d;
	private String konv1 = "Kecepatan pada GLB adalah. . .";
	private String konv2 = "Kecepatan akhir pada GLBB adalah. . .";
	private String konv3 = "Kecepatan akhir pada GJB adalah. . .";
	
	public Fisika_Gerak()
	{
		f = new JFrame("FISIKA - GERAK");
		b1 = new JButton ("Hitung");
		b2 = new JButton ("Hitung");
		b3 = new JButton ("Hitung");
		ls = new JLabel("Masukan nilai s : ");
		lt1 = new JLabel ("Masukan nilai t : ");
		lt2 = new JLabel ("Masukan nilai t : ");
		lt3 = new JLabel ("Masukan nilai t : ");
		lcv = new JLabel ("Mencari Kecepatan(v) pada GLB");
		lvo = new JLabel ("Masukan nilai vo : ");
		la = new JLabel ("Masukan nilai a  : ");
		lh = new JLabel ("Masukan nilai h : ");
		lcvt1 = new JLabel ("Mencari Kecepatan Akhir(vt) pada GLBB");
		lcvt2 = new JLabel ("Mencari Kecepatan Akhir(vt) pada GJB");
		tv = new JTextField(10);
		ts = new JTextField(10);
		tt1 = new JTextField(10);
		tt2 = new JTextField(10);
		tt3 = new JTextField(10);
		tcv = new JTextField(10);
		tcs = new JTextField(10);
		tct = new JTextField(10);
		tvo = new JTextField(10);
		ta = new JTextField(10);
		th = new JTextField(10);
		//tcvt1 = new JTextField(10);
		//tcvt2 = new JTextField(10);
	}
	
	public void hitungkecepatan()
	{
		p1= new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		b1.addActionListener(new GLB());
		b2.addActionListener(new GLBB());
		b3.addActionListener(new GJB());
		p1.add(lcv);
		p1.add(ls);
		p1.add(ts);
		p1.add(lt1);
		p1.add(tt1);
		p1.add(b1);
		Dimension dim=new Dimension (300,400);
		p1.setPreferredSize(dim);
		p2.add(lcvt1);
		p2.add(lvo);
		p2.add(tvo);
		p2.add(la);
		p2.add(ta);
		p2.add(lt2);
		p2.add(tt2);
		p2.add(b2);
		p3.add(lcvt2);
		p3.add(lt3);
		p3.add(tt3);
		p3.add(b3);
		JTabbedPane tab = new JTabbedPane();
		tab.add(p1,"GLB");
		tab.add(p2,"GLBB");
		tab.add(p3,"GJB");
		f.getContentPane().add(tab,BorderLayout.NORTH);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(275,400);
		f.setVisible(true);
	}
	private class GLB implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{  
			try
			{    
				a = Double.parseDouble(ts.getText()); 
				b = Double.parseDouble(tt1.getText()); 
				c = a/b;         
				JOptionPane.showConfirmDialog(null,konv1+c,"Hasil",                        
				JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);    
			}
			catch(Exception j)
			{    
				JOptionPane.showConfirmDialog(null,"Masukkan Angka!","Error",         
				JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);    
			}
		}				
	}
	private class GLBB implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{  
			try
			{    
				a = Double.parseDouble(tvo.getText()); 
				b = Double.parseDouble(ta.getText());
				c = Double.parseDouble(tt2.getText());
				d = a + (b*c);         
				JOptionPane.showConfirmDialog(null,konv2+d,"Hasil",                        
				JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);    
			}
			catch(Exception j)
			{    
				JOptionPane.showConfirmDialog(null,"Masukkan Angka!","Error",         
				JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);    
			}
		}				
	}
	private class GJB implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{  
			try
			{    
				a = Double.parseDouble(tt3.getText()); 
				b = a*9.8;         
				JOptionPane.showConfirmDialog(null,konv1+b,"Hasil",                        
				JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);    
			}
			catch(Exception j)
			{    
				JOptionPane.showConfirmDialog(null,"Masukkan Angka!","Error",         
				JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);    
			}
		}				
	}
	public static void main(String[]args)
	{
		Fisika_Gerak grk = new Fisika_Gerak();
		grk.hitungkecepatan();
	}
}
