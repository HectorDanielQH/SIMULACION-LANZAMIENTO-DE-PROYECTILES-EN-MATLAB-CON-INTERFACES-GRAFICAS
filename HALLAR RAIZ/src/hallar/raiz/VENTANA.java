/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hallar.raiz;

import java.text.DecimalFormat;

/**
 *
 * @author hdani
 */
public class VENTANA extends javax.swing.JFrame {

    /**
     * Creates new form VENTANA
     */
    public VENTANA() {
        initComponents();
        this.setSize(658, 455);
        this.setLocationRelativeTo(null);
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
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        punto1Y = new javax.swing.JTextField();
        punto1X = new javax.swing.JTextField();
        resultado = new javax.swing.JTextField();
        punto2X = new javax.swing.JTextField();
        punto2Y = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FUNCION LINEAL");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("HALLAR FORMULA");
        jButton3.setToolTipText("PRESIONE DESPUES DE HABER INSERTADO TODOS LOS PUNTOS");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 150, 60));

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(23, 156, 82));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CREADOR DE FORMULA DE LA RECTA");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 620, 60));

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 62, 48));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PUNTO UNO");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 620, 60));

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(247, 181, 41));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Y1=");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 80, 60));

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 62, 48));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("LA FORMULA HALLADA ES:");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 360, 30));

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(23, 107, 239));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("X1=");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 80, 60));

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(247, 181, 41));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Y2=");
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 80, 60));

        jLabel8.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(23, 107, 239));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("X2=");
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 80, 60));

        punto1Y.setToolTipText("INSERTE Y DEL PUNTO 1");
        jPanel1.add(punto1Y, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 150, 40));

        punto1X.setToolTipText("INSERTE X DEL PUNTO 1");
        jPanel1.add(punto1X, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 150, 40));

        resultado.setEditable(false);
        jPanel1.add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 260, 50));

        punto2X.setToolTipText("INSERTE X DEL PUNTO 2");
        jPanel1.add(punto2X, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 150, 40));

        punto2Y.setToolTipText("INSERTE Y DEL PUNTO 2");
        jPanel1.add(punto2Y, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 150, 40));

        jLabel9.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(23, 156, 82));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("PUNTO DOS");
        jLabel9.setToolTipText("");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 640, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        HALLARRAIZ nuevo= new HALLARRAIZ();
	double p1x=Double.parseDouble(punto1X.getText()),p1y=Double.parseDouble(punto1Y.getText()),p2x=Double.parseDouble(punto2X.getText()),p2y=Double.parseDouble(punto2Y.getText());
	double pendiente=(p2y-p1y)/(p2x-p1x);
	String formula="";
	formula=nuevo.fraccion(Double.toString(pendiente))+"*x";
	double total1=(-1*pendiente*p1x)+p1y;
	DecimalFormat formato=new DecimalFormat("#.00");
	if(total1<0)
		formula+="-"+formato.format(total1);
	else
		formula+="+"+formato.format(total1);
	resultado.setText(formula);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(VENTANA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VENTANA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VENTANA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VENTANA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VENTANA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField punto1X;
    private javax.swing.JTextField punto1Y;
    private javax.swing.JTextField punto2X;
    private javax.swing.JTextField punto2Y;
    private javax.swing.JTextField resultado;
    // End of variables declaration//GEN-END:variables
}
