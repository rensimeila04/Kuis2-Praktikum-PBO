package kuis2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Kuis2 extends javax.swing.JFrame {

    
    public Kuis2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nikField = new javax.swing.JTextField();
        namaField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamatField = new javax.swing.JTextArea();
        lakiRadioButton = new javax.swing.JRadioButton();
        perempuanRadioButton = new javax.swing.JRadioButton();
        memasakCheck = new javax.swing.JCheckBox();
        membacaCheck = new javax.swing.JCheckBox();
        melukisCheck = new javax.swing.JCheckBox();
        tidurCheck = new javax.swing.JCheckBox();
        phoneField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pendidikanCombo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        ipkField = new javax.swing.JFormattedTextField();
        birthDateField = new javax.swing.JFormattedTextField();
        daftarButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NIK");

        jLabel2.setText("Nama");

        jLabel3.setText("Alamat");

        jLabel4.setText("Jenis Kelamin");

        jLabel5.setText("Hobby");

        jLabel6.setText("No Telp");

        jLabel7.setText("Tanggal Lahir (dd/MM/yyyy)");

        alamatField.setColumns(20);
        alamatField.setRows(5);
        jScrollPane1.setViewportView(alamatField);

        genderGroup.add(lakiRadioButton);
        lakiRadioButton.setText("Laki-laki");
        lakiRadioButton.setActionCommand("Laki-laki");

        genderGroup.add(perempuanRadioButton);
        perempuanRadioButton.setText("Perempuan");
        perempuanRadioButton.setActionCommand("Perempuan");

        memasakCheck.setText("Memasak");

        membacaCheck.setText("Membaca");

        melukisCheck.setText("Melukis");

        tidurCheck.setText("Tidur");

        jLabel8.setText("Pendidikan");

        pendidikanCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SD", "SMP", "SMA", "D1", "D2", "D3", "D4/S1", "S2", "S3" }));
        pendidikanCombo.setSelectedIndex(-1);

        jLabel9.setText("IPK");

        birthDateField.setColumns(10);

        daftarButton.setText("Daftar");
        daftarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarButtonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setText("Formulir Lamar Kerja");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(daftarButton)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lakiRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(perempuanRadioButton))
                    .addComponent(memasakCheck)
                    .addComponent(membacaCheck)
                    .addComponent(melukisCheck)
                    .addComponent(tidurCheck)
                    .addComponent(nikField)
                    .addComponent(namaField)
                    .addComponent(phoneField)
                    .addComponent(birthDateField)
                    .addComponent(pendidikanCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ipkField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(129, 129, 129))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nikField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(perempuanRadioButton)
                    .addComponent(lakiRadioButton)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(memasakCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(membacaCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(melukisCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tidurCheck)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(birthDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pendidikanCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ipkField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(20, 20, 20)
                .addComponent(daftarButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void daftarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarButtonActionPerformed
        if (nikField.getText().trim().isEmpty() || 
                namaField.getText().trim().isEmpty()||
                alamatField.getText().trim().isEmpty() ||
                phoneField.getText().trim().isEmpty() ||
                birthDateField.getText().trim().isEmpty()||
                ipkField.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            Date birthDate = sdf.parse(birthDateField.getText());
            Calendar now = Calendar.getInstance();
            Calendar birth = Calendar.getInstance();
            birth.setTime(birthDate);
            int age = now.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
            if (age < 18) {
                JOptionPane.showMessageDialog(this, 
                    "Anda belum cukup umur untuk melamar pekerjaan ini!", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, 
                "Format tanggal lahir tidak valid! Gunakan format dd/MM/yyyy", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String phoneNumber = phoneField.getText().trim();
        if (!isPhoneNumberValid(phoneNumber)) {
            JOptionPane.showMessageDialog(this, 
                "Nomor telepon hanya boleh berisi angka!", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }
 
        String pendidikanDipilih = (String) pendidikanCombo.getSelectedItem();
        if (pendidikanDipilih.equals("SD") ||
            pendidikanDipilih.equals("SMP")||
            pendidikanDipilih.equals("SMA")) {
            JOptionPane.showMessageDialog(this, 
                "Pendidikan minimal D1!", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            double ipk = Double.parseDouble(ipkField.getText());
            if (ipk < 3.01 || ipk > 4.00) {
                JOptionPane.showMessageDialog(this, 
                    "IPK harus antara 3.01 - 4.00!", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, 
                "IPK tidak valid!", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        JOptionPane.showMessageDialog(this, 
            "Anda berhasil mendaftar!", 
            "Success", 
            JOptionPane.INFORMATION_MESSAGE);
        
        clearForm();
    }//GEN-LAST:event_daftarButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kuis2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamatField;
    private javax.swing.JFormattedTextField birthDateField;
    private javax.swing.JButton daftarButton;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JFormattedTextField ipkField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton lakiRadioButton;
    private javax.swing.JCheckBox melukisCheck;
    private javax.swing.JCheckBox memasakCheck;
    private javax.swing.JCheckBox membacaCheck;
    private javax.swing.JTextField namaField;
    private javax.swing.JTextField nikField;
    private javax.swing.JComboBox<String> pendidikanCombo;
    private javax.swing.JRadioButton perempuanRadioButton;
    private javax.swing.JTextField phoneField;
    private javax.swing.JCheckBox tidurCheck;
    // End of variables declaration//GEN-END:variables

    private void clearForm() {
        nikField.setText("");
        namaField.setText("");
        alamatField.setText("");
        genderGroup.clearSelection();
        memasakCheck.setSelected(false);
        membacaCheck.setSelected(false);
        melukisCheck.setSelected(false);
        tidurCheck.setSelected(false);
        phoneField.setText("");
        birthDateField.setText("");
        pendidikanCombo.setSelectedIndex(-1);
        ipkField.setText("");
    }
    
    private boolean isPhoneNumberValid(String phoneNumber) {
        for(char c : phoneNumber.toCharArray()) {
            if(!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
