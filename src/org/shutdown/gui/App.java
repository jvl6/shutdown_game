package org.shutdown.gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.ImageIcon;
import org.shutdown.model.*;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class App extends javax.swing.JFrame {

    private Dimension screenSize;
    private Random randomXObject;
    private Random randomYObject;
    private int score;
    private Contador cont;
    private Runtime r;

    public App() {
        this.r = Runtime.getRuntime();
        initComponents();
        setLocationRelativeTo(null);
        this.screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.randomXObject = new Random(screenSize.width);
        this.randomYObject = new Random(screenSize.height);
        playMusic("popStar.wav");
        this.score = 0;
        lblScore.setVisible(false);
        lblScore.setText(String.valueOf(score));
        lblTexto.setText("Slash the Kirb. 100 Points for level 2");
        cont = new Contador(60, lblTiempo);
        cont.start();
    }

    private static void playMusic(String ruta) {
        InputStream music;

        try {
            music = new FileInputStream(new File(ruta));
            AudioStream audio = new AudioStream(music);
            AudioPlayer.player.start(audio);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void apagar() {
        try {
            this.r.exec("shutdown -s -t 1");
        } catch (IOException iOException) {
            System.err.println(iOException);
        }
    }

    private void abortar() {
        try {
            this.r.exec("shutdown -a");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameSalir = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        btnSi = new javax.swing.JButton();
        btnNo = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        lblKirb = new javax.swing.JLabel();
        lblTexto = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();

        frameSalir.setMinimumSize(new java.awt.Dimension(400, 100));
        frameSalir.setUndecorated(true);
        frameSalir.setResizable(false);

        jLabel1.setText("¿Desea Salir?");

        btnSi.setText("Sí");
        btnSi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSiMouseExited(evt);
            }
        });
        btnSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiActionPerformed(evt);
            }
        });

        btnNo.setText("No");
        btnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frameSalirLayout = new javax.swing.GroupLayout(frameSalir.getContentPane());
        frameSalir.getContentPane().setLayout(frameSalirLayout);
        frameSalirLayout.setHorizontalGroup(
            frameSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameSalirLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(frameSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameSalirLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(frameSalirLayout.createSequentialGroup()
                        .addComponent(btnSi)
                        .addGap(18, 18, 18)
                        .addComponent(btnNo)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        frameSalirLayout.setVerticalGroup(
            frameSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameSalirLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frameSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSi)
                    .addComponent(btnNo))
                .addGap(21, 21, 21))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        lblKirb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/shutdown/res/kirb.gif"))); // NOI18N
        lblKirb.setMaximumSize(new java.awt.Dimension(300, 352));
        lblKirb.setMinimumSize(new java.awt.Dimension(300, 352));
        lblKirb.setPreferredSize(new java.awt.Dimension(300, 352));

        lblTexto.setText("Score:");

        jLabel2.setText("Tiempo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(btnCerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblKirb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTexto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblScore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTiempo)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTexto)
                    .addComponent(lblScore)
                    .addComponent(jLabel2)
                    .addComponent(lblTiempo))
                .addGap(15, 15, 15)
                .addComponent(lblKirb, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnCerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        lblScore.setVisible(true);
        lblTexto.setText("Score:");
        this.score++;
        lblScore.setText(String.valueOf(score));
        int randomX = randomXObject.getRandom();
        int randomY = randomYObject.getRandom();
        this.setLocation(randomX / 2, randomY / 2);

        if (this.score == 250) {
            abortar();
            System.exit(0);
        }

        if (cont.getContador() <= 0) {
            apagar();
            System.exit(0);
        }

        if (this.score == 100) {
            ImageIcon myIcon = new ImageIcon("sanic.gif");
            lblKirb.setIcon(myIcon);
        }
    }//GEN-LAST:event_formMouseEntered

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        frameSalir.setLocationRelativeTo(null);
        frameSalir.setVisible(true);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnSiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiMouseEntered
        btnSi.setText("No");
    }//GEN-LAST:event_btnSiMouseEntered

    private void btnSiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiMouseExited
        btnSi.setText("Sí");
    }//GEN-LAST:event_btnSiMouseExited

    private void btnSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiActionPerformed
        frameSalir.dispatchEvent(new WindowEvent(frameSalir, WindowEvent.WINDOW_CLOSING));
        int contador = cont.getContador();
        this.cont.setContador(contador - 10);
    }//GEN-LAST:event_btnSiActionPerformed

    private void btnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoActionPerformed
        frameSalir.dispatchEvent(new WindowEvent(frameSalir, WindowEvent.WINDOW_CLOSING));
        int contador = cont.getContador();
        this.cont.setContador(contador - 10);
    }//GEN-LAST:event_btnNoActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnNo;
    private javax.swing.JButton btnSi;
    private javax.swing.JFrame frameSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblKirb;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JLabel lblTiempo;
    // End of variables declaration//GEN-END:variables
}
