/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvmovieguide;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author natha
 */
public class TVMovieGUI extends javax.swing.JFrame {

    /**
     * Creates new form TVMovieGUI
     */
    private Programmes programmes[];
    private int count;
    
    public TVMovieGUI() {
        initComponents();
        programmes = new Programmes[10];
        count = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        timeLbl = new javax.swing.JLabel();
        NameTf = new javax.swing.JTextField();
        TimeTf = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        disBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        TypeLbl = new javax.swing.JLabel();
        PriceTf = new javax.swing.JTextField();
        timeLbl1 = new javax.swing.JLabel();
        TypeTf = new javax.swing.JTextField();
        clearBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        headLbl.setText("TV and Movie Catalogue");

        nameLbl.setText("What is the name:");

        timeLbl.setText("What time is it on at:");

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        disBtn.setText("Display");
        disBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disBtnActionPerformed(evt);
            }
        });

        delBtn.setText("Delete");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        TypeLbl.setText("Is it a 'Movie' or 'Show':");

        timeLbl1.setText("What price is it without extra charge:");

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(nameLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(timeLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(timeLbl1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NameTf, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TimeTf)
                                    .addComponent(PriceTf)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(disBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TypeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addComponent(TypeTf)))
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(headLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl)
                    .addComponent(NameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeLbl)
                    .addComponent(TimeTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PriceTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeLbl1))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TypeLbl)
                    .addComponent(TypeTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(saveBtn)
                    .addComponent(disBtn)
                    .addComponent(delBtn)
                    .addComponent(clearBtn))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        for(int i = 0; i < count;i++){
            Programmes p = programmes[i];
            if(TypeTf.getText() == "Show"){
                TV t = new TV();
                t.setName(NameTf.getText());
                t.setTime(TimeTf.getText());
                t.setType(TypeTf.getText());
                t.setPrice(Double.parseDouble(PriceTf.getText()));
                programmes[count] = t;
                count++;
                
                JOptionPane.showMessageDialog(null,"Items added.");
                
            } else if(TypeTf.getText() == "Movie"){
                Movie m = new Movie();
                m.setName(NameTf.getText());
                m.setTime(TimeTf.getText());
                m.setType(TypeTf.getText());
                m.setPrice(Double.parseDouble(PriceTf.getText()));
                programmes[count] = m;
                count++;
                
                JOptionPane.showMessageDialog(null,"Items added.");
                
            } else {
                JOptionPane.showMessageDialog(null,"Items could not be added.");
            }
         }
    }//GEN-LAST:event_addBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        File f;
        FileOutputStream fStream;
        ObjectOutputStream oStream;
        
        try{
            f = new File("output.txt");
            fStream = new FileOutputStream(f);
            oStream = new ObjectOutputStream(fStream);
            
            oStream.writeObject(programmes);
            oStream.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
        JOptionPane.showMessageDialog(null,"Items saved to file 'output.txt'");
    }//GEN-LAST:event_saveBtnActionPerformed

    private void disBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disBtnActionPerformed
        // TODO add your handling code here:
        for(int i = 0; i < count;i++){
            Programmes p = programmes[i];
            if (p.type == "Show") {
                JOptionPane.showMessageDialog(null,"Name: "+p.getName()+"\n Time: "+p.getTime()+"\n Price:"+p.getPrice()+"\n Total Price:"+((TV) p).getTPrice()+"\n Type:"+p.getType());
            } else if (p.type == "Movie") {
                JOptionPane.showMessageDialog(null,"Name: "+p.getName()+"\n Time: "+p.getTime()+"\n Price:"+p.getPrice()+"\n Total Price:"+((Movie) p).getTPrice()+"\n Type:"+p.getType());
            } else{
                JOptionPane.showMessageDialog(null,"No movies or shows catalogued.");
            }
        }
    }//GEN-LAST:event_disBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        // TODO add your handling code here:
        String searchTerm = JOptionPane.showInputDialog(null,"Enter a name to delete");
        for(int i = 0; i < count;i++){
            Programmes p = programmes[i];
            if(p.getName().equals(searchTerm)){
               programmes[i]=programmes[count-1];
               count--;
            }
            break;
        }
        JOptionPane.showMessageDialog(null,"Items deleted");
    }//GEN-LAST:event_delBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        NameTf.setText("");
        TimeTf.setText("");
        TypeTf.setText("");
        PriceTf.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

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
            java.util.logging.Logger.getLogger(TVMovieGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TVMovieGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TVMovieGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TVMovieGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TVMovieGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NameTf;
    private javax.swing.JTextField PriceTf;
    private javax.swing.JTextField TimeTf;
    private javax.swing.JLabel TypeLbl;
    private javax.swing.JTextField TypeTf;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton delBtn;
    private javax.swing.JButton disBtn;
    private javax.swing.JLabel headLbl;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel timeLbl;
    private javax.swing.JLabel timeLbl1;
    // End of variables declaration//GEN-END:variables
}
