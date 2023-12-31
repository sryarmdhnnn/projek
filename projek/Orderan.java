/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author SRD
 */
public class Orderan extends javax.swing.JFrame {

    /**
     * Creates new form Orderan
     */
    public Orderan() {
        initComponents();
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
    }
    
    public void addtable(int id ,String Name, int Qty ,Double Price){
  
        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        Vector v = new Vector() ;
        v.add(id);
        v.add(Name);
        v.add(Qty);
        v.add(Price);
        dt.addRow(v);
    }
    
    public void addtables(int id ,String Name,int Qty ,Double Price){
        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        DecimalFormat df = new DecimalFormat("00.00") ;
        double totPrice = Price * Double.valueOf(Qty) ;
        String TotalPrice = df.format(totPrice);
        
        // product allready add chk
        for (int row = 0; row < jTable1.getRowCount(); row++) {
            if (Name == jTable1.getValueAt(row, 1)) {
                dt.removeRow(jTable1.convertRowIndexToModel(row));
            } 
        }
        Vector v = new Vector();
        v.add(id);
        v.add(Name);
        v.add(Qty);
        v.add(TotalPrice); // total price
        dt.addRow(v);
    }
    
    public void cal(){
    //cal total table values
    int numOfRow = jTable1.getRowCount() ;
    double tot = 0.0 ;
        for (int i = 0; i < numOfRow; i++) {
           double value = Double.valueOf(jTable1.getValueAt(i, 3).toString());
           tot += value ;
        }
        DecimalFormat df = new DecimalFormat("00.00") ;
        total.setText(df.format(tot));
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        q1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        q2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        q3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        q6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        q5 = new javax.swing.JLabel();
        q4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        q9 = new javax.swing.JLabel();
        q8 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        q7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        b = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bal = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        pay = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 205));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Screenshot_20230721-074928.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 16, 190, 155));

        q1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q1.setForeground(new java.awt.Color(255, 255, 255));
        q1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q1.setText("0");
        jPanel1.add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 177, 190, 52));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Screenshot_20230721-074948.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 16, 190, 155));

        q2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q2.setForeground(new java.awt.Color(255, 255, 255));
        q2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q2.setText("0");
        jPanel1.add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 177, 190, 52));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Screenshot_20230721-075005.jpg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 16, 190, 155));

        q3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q3.setForeground(new java.awt.Color(255, 255, 255));
        q3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q3.setText("0");
        jPanel1.add(q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 177, 190, 52));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Screenshot_20230721-075032.jpg"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 235, 190, 155));

        q6.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q6.setForeground(new java.awt.Color(255, 255, 255));
        q6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q6.setText("0");
        jPanel1.add(q6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 396, 190, 52));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Screenshot_20230721-075023.jpg"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 235, 190, 155));

        q5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q5.setForeground(new java.awt.Color(255, 255, 255));
        q5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q5.setText("0");
        jPanel1.add(q5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 396, 190, 52));

        q4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q4.setForeground(new java.awt.Color(255, 255, 255));
        q4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q4.setText("0");
        jPanel1.add(q4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 396, 190, 52));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Screenshot_20230721-075015.jpg"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 235, 190, 155));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Screenshot_20230721-075052.jpg"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 454, 190, 155));

        q9.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q9.setForeground(new java.awt.Color(255, 255, 255));
        q9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q9.setText("0");
        jPanel1.add(q9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 627, 190, 52));

        q8.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q8.setForeground(new java.awt.Color(255, 255, 255));
        q8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q8.setText("0");
        jPanel1.add(q8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 627, 190, 52));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Screenshot_20230721-075046.jpg"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 454, 190, 155));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Screenshot_20230721-075039.jpg"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 454, 190, 155));

        q7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q7.setForeground(new java.awt.Color(255, 255, 255));
        q7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q7.setText("0");
        jPanel1.add(q7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 627, 190, 52));

        jPanel2.setMaximumSize(new java.awt.Dimension(670, 734));
        jPanel2.setMinimumSize(new java.awt.Dimension(670, 734));
        jPanel2.setPreferredSize(new java.awt.Dimension(670, 734));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Menu", "Qty", "Harga"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 300, 461));

        b.setColumns(20);
        b.setRows(5);
        jScrollPane2.setViewportView(b);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 11, 331, 461));

        jPanel3.setMinimumSize(new java.awt.Dimension(717, 174));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel1.setText("Total :");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel2.setText("Cash :");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 61, -1, 45));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel3.setText("Balance :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 112, -1, -1));

        bal.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        bal.setText("00");
        jPanel3.add(bal, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 112, 210, -1));

        total.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        total.setText("00");
        jPanel3.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 11, 210, -1));

        pay.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        jPanel3.add(pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 61, 210, -1));

        jButton11.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jButton11.setText("Pay");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 11, 258, -1));

        jButton12.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jButton12.setText("Print");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 84, 260, -1));

        jButton10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jButton10.setText("X");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 169, 50, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/3bd5bc3116e0452f049dc73260ebae74.jpg"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 210));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 526, -1, -1));

        jButton13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton13.setText("Delete");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 478, -1, 42));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/00d48818f5d913237d8ee596dbcd144c.jpg"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 520));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/00d48818f5d913237d8ee596dbcd144c.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 740));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // btn code
        int i = Integer.valueOf(q1.getText());
        ++i;
        q1.setText(String.valueOf(i));

        addtables(1, "Cappucino  ", i, 5.00);

        cal();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // btn code
        int i = Integer.valueOf(q2.getText());
        ++i;
        q2.setText(String.valueOf(i));

        addtables(2, "Cappucino Cincau  ", i, 7.00);

        cal();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // btn code
        int i = Integer.valueOf(q3.getText());
        ++i;
        q3.setText(String.valueOf(i));

        addtables(3, "Mochaccino  ", i, 10.00);

        cal();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // btn code
        int i = Integer.valueOf(q6.getText());
        ++i;
        q6.setText(String.valueOf(i));

        addtables(6, "Black Coffe", i, 3.00);

        cal();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // btn code
        int i = Integer.valueOf(q5.getText());
        ++i;
        q5.setText(String.valueOf(i));

        addtables(5, "White Coffee  ", i, 6.00);

        cal();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // btn code
        int i = Integer.valueOf(q4.getText());
        ++i;
        q4.setText(String.valueOf(i));

        addtables(4, "Mocha Latte  ", i, 18.00);

        cal();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // btn code
        int i = Integer.valueOf(q9.getText());
        ++i;
        q9.setText(String.valueOf(i));

        addtables(9, "Coffee Milk  ", i, 8.00);

        cal();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // btn code
        int i = Integer.valueOf(q8.getText());
        ++i;
        q8.setText(String.valueOf(i));

        addtables(8, "Cappucino Caramel  ", i, 25.00);

        cal();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // btn code
        int i = Integer.valueOf(q7.getText());
        ++i;
        q7.setText(String.valueOf(i));

        addtables(7, "Ice Cube", i, 1.00);

        cal();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // pat btn

        double tot = Double.valueOf(total.getText());
        double paid = Double.valueOf(pay.getText());
        double balance = paid - tot ;

        DecimalFormat df = new DecimalFormat("00.00") ;

        bal.setText(String.valueOf(df.format(balance)));
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // bill print

        try {

            b.setText("                         Eydith Coffee Shop \n");
            b.setText(b.getText() + "           No 23/ Cimanggis, \n");
            b.setText(b.getText() + "           Jawa Barat, Depok, \n");
            b.setText(b.getText() + "           +62 857-7785-0582, \n");
            b.setText(b.getText() + "---------------------------------------------------------------------\n");
            b.setText(b.getText() + "  Menu \t\tQty \tHarga" +"\n");
            b.setText(b.getText() + "---------------------------------------------------------------------\n");

            DefaultTableModel df = (DefaultTableModel) jTable1.getModel();

            // get table Product details

            for (int i = 0; i < jTable1.getRowCount(); i++) {

                String Menu = df.getValueAt(i, 1).toString();
                String Qty = df.getValueAt(i, 2).toString();
                String Harga = df.getValueAt(i, 3).toString();

                b.setText(b.getText() +"  "+ Menu+"\t\t"+Qty +"\t"+Harga + "\n");
            }

            b.setText(b.getText() + "---------------------------------------------------------------------\n");
            b.setText(b.getText() + "Sub Total : " + total.getText() +"\n");
            b.setText(b.getText() + "Cash      : " + pay.getText() +"\n");
            b.setText(b.getText() + "Balance   : " + bal.getText() +"\n");
            b.setText(b.getText() + "---------------------------------------------------------------------\n");
            b.setText(b.getText() + "                     Terimakasih Atas Kunjungannya...!"+"\n");
            b.setText(b.getText() + "---------------------------------------------------------------------\n");
            b.setText(b.getText() + "                     Ditunggu kedatangan berikutnya"+"\n");

            b.print(); //print

        } catch (Exception e) {

            System.out.println(e);

        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // delete some iteam

        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();

        String r = dt.getValueAt(jTable1.getSelectedRow(), 0).toString();

        //remove product
        int rw = jTable1.getSelectedRow();
        dt.removeRow(rw);

        //remove Qty Lable
        System.out.println(r);
        switch (r) {

            case "1":
            q1.setText("0");
            break;

            case "2":
            q2.setText("0");
            break;

            case "3":
            q3.setText("0");
            break;

            case "4":
            q4.setText("0");
            break;

            case "5":
            q5.setText("0");
            break;

            case "6":
            q6.setText("0");

            case "7":
            q7.setText("0");
            break;

            case "8":
            q8.setText("0");
            break;

            case "9":
            q9.setText("0");
            break;

            default:
            System.out.println("over");
        }

        cal(); // after iteam delete calculate total
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        login l = new login();
        l.show();
        this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(Orderan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Orderan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Orderan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Orderan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Orderan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea b;
    private javax.swing.JLabel bal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField pay;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel q4;
    private javax.swing.JLabel q5;
    private javax.swing.JLabel q6;
    private javax.swing.JLabel q7;
    private javax.swing.JLabel q8;
    private javax.swing.JLabel q9;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
