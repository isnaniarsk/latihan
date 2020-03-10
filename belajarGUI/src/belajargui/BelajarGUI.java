/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarGUI;

/**
 *
 * @author ASUS
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class BelajarGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GUI g = new GUI();
    }
    
}
class GUI extends JFrame {
   final JTextField fnama = new JTextField(10);

   JLabel lnama = new JLabel(" Nama Lengkap ");
   JLabel ljeniskelamin = new JLabel(" Jenis Kelamin ");

   JRadioButton rbPria = new JRadioButton(" Laki-Laki ");
   JRadioButton rbWanita = new JRadioButton("Perempuan ");

   JLabel lagama = new JLabel(" Agama ");
   String[] namaAgama =
            {"Islam","Kristen","Katolik","Hindu","Budha"};
   JComboBox cmbAgama = new JComboBox(namaAgama);

   JLabel lhobby = new JLabel(" Hobby ");

   JCheckBox cbSepakbola = new JCheckBox(" Sepakbola ");
   JCheckBox cbBasket = new JCheckBox(" Basket ");

   JButton btnSave = new JButton("OK");
   
   JLabel hasilNama = new JLabel();
   JLabel hasilJenis = new JLabel();
   JLabel hasilAgama = new JLabel();
   JLabel hasilHobi = new JLabel();

   public GUI() {
	setTitle("Mencoba Kombinasi Komponen GUI");
	setDefaultCloseOperation(3);
	setSize(350,500);
        
        btnSave.addActionListener(((e)-> {
            if(fnama.getText().length()==0) {
                JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong");
            }
            else {
                String nama = fnama.getText();
                hasilNama.setText(nama);
            }
            
            if(rbPria.isSelected()) {
                hasilJenis.setText("Laki-Laki");
            }
            else {
                hasilJenis.setText("Perempuan");
            }
            
            String agama = (String) cmbAgama.getSelectedItem();
            hasilAgama.setText(agama);
            
            if(cbSepakbola.isSelected() && cbBasket.isSelected()) {
                hasilHobi.setText("Sepak Bola dan Basket");
            
            }
            else if(cbSepakbola.isSelected()) {
                hasilHobi.setText("Sepakbola");
            }
            else if(cbBasket.isSelected()){
                hasilHobi.setText("Basket");
            }
            
            
        }));

	ButtonGroup group = new ButtonGroup();
	group.add(rbPria);
	group.add(rbWanita);

	setLayout(null);
	add(lnama);
	add(fnama);
	add(ljeniskelamin);
	add(rbPria);
	add(rbWanita);
	add(lagama);
	add(cmbAgama);
	add(lhobby);
	add(cbSepakbola);
	add(cbBasket);
	add(btnSave);
        add(hasilNama);
        add(hasilJenis);
        add(hasilAgama);
        add(hasilHobi);

	// setBounds(m,n,o,p)
	// m = posisi x; n = posisi n
	// o = panjang komponen; p = tinggi komponen
	lnama.setBounds(10,10,120,20);
	fnama.setBounds(130,10,150,20);
	ljeniskelamin.setBounds(10,35,120,20);
	rbPria.setBounds(130,35,100,20);
	rbWanita.setBounds(230,35,100,20);
	lagama.setBounds(10,60,150,20);
	cmbAgama.setBounds(130,60,150,20);
	lhobby.setBounds(10,85,120,20);
	cbSepakbola.setBounds(130,85,100,20);
	cbBasket.setBounds(230,85,150,20);
	btnSave.setBounds(100,130,120,20);
        hasilNama.setBounds(10,150,120,20);
        hasilJenis.setBounds(10,180,150,20);
        hasilAgama.setBounds(10,210,170,20);
        hasilHobi.setBounds(10,240,190,20);
	setVisible(true);
   }

   
}
