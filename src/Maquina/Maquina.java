/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maquina;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author -----
 */
public class Maquina extends javax.swing.JFrame {

    /**
     * Creates new form Maquina
     */
    
    private static double PRICE;
    
    private Double cambio;
    private Integer coin1;
    private Integer coin2;
    private Integer coin5;
    private Integer coin10;
    private Integer coin20;
    private Integer coin50;
    private Integer coin100;
    private Integer coin200;
    private Integer coin500;
    private Integer producto;
    private Double monto;
    private Integer carrito;
    Icon foto;
    
    private void setCoinDispoibles () {
        lblExis1.setText(String.format("En existencia: %s", coin1));
        lblExis2.setText(String.format("En existencia: %s", coin2));
        lblExis5.setText(String.format("En existencia: %s", coin5));
        lblExis10.setText(String.format("En existencia: %s", coin10));
        lblExis20.setText(String.format("En existencia: %s", coin20));
        lblExis50.setText(String.format("En existencia: %s", coin50));
        lblExis100.setText(String.format("En existencia: %s", coin100));
        lblExis200.setText(String.format("En existencia: %s", coin200));
        lblExis500.setText(String.format("En existencia: %s", coin500));
    }
    
    
    public Maquina() {
        initComponents();
        PRICE = 17.00;
        cambio = 0.0;
        coin1 = 37;
        coin2 = 0;
        coin5 = 15;
        coin10 = 45;
        coin20 = 0;
        coin50 = 7;
        coin100 = 3;
        coin200 = 0;
        coin500 = 0;
        producto = 27;
        monto = 0.0;
        carrito = 0;
        foto = new ImageIcon("src/Imagenes/CocaCola.png");
        setCoinDispoibles();
    }
    
    private void setProducto () {
        lblCocas.setText(String.format("Cocas disponibles: %s", producto));
    }
    
    private void setMonto () {
        lblMonto.setText(String.format("MONTO: $%s", monto));
    }
    
    private void contarBilletes () {
        Double salvar = monto;
        int cargar = 0;
        while (monto != 0) {
            if ((monto >= 500) && (coin500 > 0)) {
                monto -= 500;
                coin500 -= 1;
            } else if ((monto >= 200) && (coin200 > 0)) {
                monto -= 200;
                coin200 -= 1;
            } else if ((monto >= 100) && (coin100 > 0)) {
                monto -= 100;
                coin100 -= 1;
            } else if ((monto >= 50) && (coin50 > 0)) {
                monto -= 50;
                coin50 -= 1;
            } else if ((monto >= 20) && (coin20 > 0)) {
                monto -= 20;
                coin20 -= 1;
            } else if ((monto >= 10) && (coin10 > 0)) {
                monto -= 10;
                coin10 -= 1;
            } else if ((monto >= 5) && (coin5 > 0)) {
                monto -= 5;
                coin5 -= 1;
            } else if ((monto >= 2) && (coin2 > 0)) {
                monto -= 2;
                coin2 -= 1;
            } else if ((monto >= 1) && (coin1 > 0)) {
                monto -= 1;
                coin1 -= 1;
            } else {
                JOptionPane.showMessageDialog(this, "Monedas y/o billetes insuficientes para dar cambio", "SIN CAMBIO", JOptionPane.ERROR_MESSAGE);
                monto = 0.0;
                cargar = 1;
            }
        }
        if (cargar != 0) {
            monto = salvar;
            cambio = salvar;
            lblCambio.setText("");
        }
        setCoinDispoibles();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnComprar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn50 = new javax.swing.JButton();
        btn100 = new javax.swing.JButton();
        btn200 = new javax.swing.JButton();
        btn500 = new javax.swing.JButton();
        lblMonto = new javax.swing.JLabel();
        lblExis20 = new javax.swing.JLabel();
        lblExis1 = new javax.swing.JLabel();
        lblExis2 = new javax.swing.JLabel();
        lblExis5 = new javax.swing.JLabel();
        lblExis10 = new javax.swing.JLabel();
        lblExis100 = new javax.swing.JLabel();
        lblExis500 = new javax.swing.JLabel();
        lblExis50 = new javax.swing.JLabel();
        lblExis200 = new javax.swing.JLabel();
        btnMasRefresco = new javax.swing.JButton();
        lblCocas = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblCambio = new javax.swing.JLabel();
        lblTomar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Selecciona tu dinero:");

        btnComprar.setBackground(new java.awt.Color(255, 0, 51));
        btnComprar.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        btnComprar.setForeground(new java.awt.Color(255, 255, 255));
        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Precio: $17");

        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/peso.png"))); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2pesos.png"))); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5pesos.png"))); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/10pesos.png"))); // NOI18N
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/20pesos.png"))); // NOI18N
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });

        btn50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/50pesos.png"))); // NOI18N
        btn50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn50ActionPerformed(evt);
            }
        });

        btn100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/100pesos.png"))); // NOI18N
        btn100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn100ActionPerformed(evt);
            }
        });

        btn200.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/200pesos.png"))); // NOI18N
        btn200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn200ActionPerformed(evt);
            }
        });

        btn500.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/500pesos.png"))); // NOI18N
        btn500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn500ActionPerformed(evt);
            }
        });

        lblMonto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMonto.setText("MONTO:");

        btnMasRefresco.setBackground(new java.awt.Color(255, 255, 255));
        btnMasRefresco.setForeground(new java.awt.Color(204, 0, 0));
        btnMasRefresco.setText("Añadir refresco");
        btnMasRefresco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasRefrescoActionPerformed(evt);
            }
        });

        lblCocas.setText("Cocas disponibles: 27");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblExis20))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn100, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblExis100))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn500, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblExis500))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn1)
                                    .addComponent(lblExis1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn2)
                                    .addComponent(lblExis2))))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblExis50)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn50, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnMasRefresco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnComprar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblExis5)
                                    .addComponent(btn5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblExis10)
                                    .addComponent(btn10)
                                    .addComponent(lblCocas)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblExis200)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMonto)
                                    .addComponent(btn200, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel2))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblCocas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn10, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblExis1)
                            .addComponent(lblExis2)
                            .addComponent(lblExis5)
                            .addComponent(lblExis10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn20)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblExis20)
                                .addComponent(lblExis50))))
                    .addComponent(btn50, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn200, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblExis200, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnComprar)
                            .addComponent(btnMasRefresco))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn100)
                            .addComponent(lblExis100))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn500)
                            .addComponent(lblExis500))
                        .addContainerGap(22, Short.MAX_VALUE))))
        );

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("CAMBIO:");

        lblCambio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblTomar.setText("Tomar");
        lblTomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblTomarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(136, 136, 136)
                        .addComponent(lblTomar))
                    .addComponent(lblCambio))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblTomar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCambio)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn500ActionPerformed
        monto += 500;
        coin500 ++;
        setMonto();
        setCoinDispoibles();
    }//GEN-LAST:event_btn500ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        monto += 1;
        coin1 ++;
        setMonto();
        setCoinDispoibles();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        monto += 2;
        coin2 ++;
        setMonto();
        setCoinDispoibles();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        monto += 5;
        coin5 ++;
        setMonto();
        setCoinDispoibles();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        monto += 10;
        coin10 ++;
        setMonto();
        setCoinDispoibles();
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        monto += 20;
        coin20 ++;
        setMonto();
        setCoinDispoibles();
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn50ActionPerformed
        monto += 50;
        coin50 ++;
        setMonto();
        setCoinDispoibles();
    }//GEN-LAST:event_btn50ActionPerformed

    private void btn100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn100ActionPerformed
        monto += 100;
        coin100 ++;
        setMonto();
        setCoinDispoibles();
    }//GEN-LAST:event_btn100ActionPerformed

    private void btn200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn200ActionPerformed
        monto += 200;
        coin200 ++;
        setMonto();
        setCoinDispoibles();
    }//GEN-LAST:event_btn200ActionPerformed

    private void btnMasRefrescoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasRefrescoActionPerformed
        if (producto - 1 >= 0) {
            producto --;
            if (monto - 17 >= 0) {
                monto -= 17;
                carrito ++;
                setMonto();
            }else {
                JOptionPane.showMessageDialog(this, "Dinero insuficiente", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "El producto de la máquina se ha terminado", "Sin producto", JOptionPane.ERROR_MESSAGE);
        }
        setProducto();
    }//GEN-LAST:event_btnMasRefrescoActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        cambio += monto; 
        lblCambio.setText(String.format("$%s", cambio));
        contarBilletes();
        setMonto();
        JOptionPane.showMessageDialog(this, String.format("Cantidad de cocas compradas: %s", carrito),
                "COMPRA", 0, foto);
        carrito = 0;
        cambio = 0.0;
    }//GEN-LAST:event_btnComprarActionPerformed

    private void lblTomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblTomarActionPerformed
        lblCambio.setText("");
    }//GEN-LAST:event_lblTomarActionPerformed

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
            java.util.logging.Logger.getLogger(Maquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Maquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Maquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Maquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Maquina().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn100;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn200;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn50;
    private javax.swing.JButton btn500;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnMasRefresco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCambio;
    private javax.swing.JLabel lblCocas;
    private javax.swing.JLabel lblExis1;
    private javax.swing.JLabel lblExis10;
    private javax.swing.JLabel lblExis100;
    private javax.swing.JLabel lblExis2;
    private javax.swing.JLabel lblExis20;
    private javax.swing.JLabel lblExis200;
    private javax.swing.JLabel lblExis5;
    private javax.swing.JLabel lblExis50;
    private javax.swing.JLabel lblExis500;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JButton lblTomar;
    // End of variables declaration//GEN-END:variables
}
