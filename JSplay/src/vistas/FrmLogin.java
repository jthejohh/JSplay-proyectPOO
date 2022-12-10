/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import java.awt.Color;
import javax.swing.JOptionPane;
import modelo.DAO.UsuarioDAO;

import modelo.beans.Usuario;
import modelo.logic.UsuarioLogic;
/**
 *
 * @author Familia García Escob
 */
public class FrmLogin extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    static UsuarioDAO registro;

    /**
     * Creates new form login
     */
    public FrmLogin(UsuarioDAO registro) {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public boolean autenticacion(String correo, String contra){
        if (registro.buscar(correo) != -1) {
            Usuario temp = registro.usuarioPorIndex(registro.buscar(correo));
            if (temp.getContraseña()== contra) {
                this.setVisible(false);
            }
          //  mensajes.setText("Contraseña incorrecta");
        }else{
            //mensajes.setText("Correo no encontrado");
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        fondojs = new javax.swing.JPanel();
        JSplayl = new javax.swing.JLabel();
        borempl = new javax.swing.JPanel();
        bntInem = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        iniciose = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        contraseña = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        bexit = new javax.swing.JPanel();
        xexit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        chkContra = new javax.swing.JCheckBox();
        txtContraseña = new javax.swing.JPasswordField();
        btnRegist = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        BG.setBackground(new java.awt.Color(255, 255, 255));

        fondojs.setBackground(new java.awt.Color(102, 51, 0));

        JSplayl.setBackground(new java.awt.Color(102, 51, 0));
        JSplayl.setFont(new java.awt.Font("Script MT Bold", 0, 48)); // NOI18N
        JSplayl.setForeground(new java.awt.Color(255, 255, 255));
        JSplayl.setText("JSplay");

        borempl.setBackground(new java.awt.Color(102, 51, 0));
        borempl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        borempl.setForeground(new java.awt.Color(255, 255, 255));
        borempl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        borempl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boremplMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boremplMouseEntered(evt);
            }
        });

        bntInem.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        bntInem.setForeground(new java.awt.Color(255, 255, 255));
        bntInem.setText("Soy Empleado");
        bntInem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bntInem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntInemMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntInemMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout boremplLayout = new javax.swing.GroupLayout(borempl);
        borempl.setLayout(boremplLayout);
        boremplLayout.setHorizontalGroup(
            boremplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boremplLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bntInem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        boremplLayout.setVerticalGroup(
            boremplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boremplLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bntInem)
                .addGap(14, 14, 14))
        );

        btnInicio.setBackground(new java.awt.Color(102, 51, 0));
        btnInicio.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("Iniciar Sesion");
        btnInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Temporal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondojsLayout = new javax.swing.GroupLayout(fondojs);
        fondojs.setLayout(fondojsLayout);
        fondojsLayout.setHorizontalGroup(
            fondojsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondojsLayout.createSequentialGroup()
                .addGroup(fondojsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondojsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(fondojsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondojsLayout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(borempl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fondojsLayout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(JSplayl, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(fondojsLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jButton1)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        fondojsLayout.setVerticalGroup(
            fondojsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondojsLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(JSplayl, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(34, 34, 34)
                .addComponent(borempl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        iniciose.setFont(new java.awt.Font("Roboto Black", 0, 26)); // NOI18N
        iniciose.setForeground(new java.awt.Color(0, 0, 0));
        iniciose.setText("Iniciar sesion");

        usuario.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        usuario.setText("Usuario");

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        contraseña.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        contraseña.setText("Contraseña");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        bexit.setBackground(new java.awt.Color(255, 255, 255));
        bexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bexitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bexitMouseEntered(evt);
            }
        });

        xexit.setText("X");

        javax.swing.GroupLayout bexitLayout = new javax.swing.GroupLayout(bexit);
        bexit.setLayout(bexitLayout);
        bexitLayout.setHorizontalGroup(
            bexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bexitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xexit)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        bexitLayout.setVerticalGroup(
            bexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bexitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xexit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        chkContra.setBackground(new java.awt.Color(255, 255, 255));
        chkContra.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        chkContra.setText("mostrar contraseña");
        chkContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkContraActionPerformed(evt);
            }
        });

        txtContraseña.setBackground(new java.awt.Color(255, 255, 255));
        txtContraseña.setForeground(new java.awt.Color(0, 0, 0));
        txtContraseña.setBorder(null);

        btnRegist.setBackground(new java.awt.Color(255, 255, 255));
        btnRegist.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnRegist.setForeground(new java.awt.Color(0, 0, 0));
        btnRegist.setText("registrarse");
        btnRegist.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnRegist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BGLayout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usuario)
                                    .addComponent(iniciose)
                                    .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtContraseña, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(contraseña, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(chkContra)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(bexit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BGLayout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegist, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)))
                .addComponent(fondojs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addComponent(bexit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(iniciose)
                .addGap(18, 18, 18)
                .addComponent(usuario)
                .addGap(19, 19, 19)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contraseña)
                .addGap(8, 8, 8)
                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkContra, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(btnRegist, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(9, 9, 9))
            .addComponent(fondojs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void bexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bexitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_bexitMouseClicked

    private void bexitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bexitMouseEntered
        
    }//GEN-LAST:event_bexitMouseEntered

    private void boremplMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boremplMouseEntered
         borempl.setBackground(Color.white);
    }//GEN-LAST:event_boremplMouseEntered

    private void boremplMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boremplMouseExited
           borempl.setBackground(new Color(102,51,0));
    }//GEN-LAST:event_boremplMouseExited

    private void bntInemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntInemMouseEntered
                bntInem.setForeground(Color.black);
    }//GEN-LAST:event_bntInemMouseEntered

    private void bntInemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntInemMouseExited
                 bntInem.setForeground(Color.white);
    }//GEN-LAST:event_bntInemMouseExited

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
           if (String.valueOf( txtUsuario.getText()).equals("ingrese el usuario")) {  
              txtUsuario.setText("");
              txtUsuario.setForeground(Color.black);
           }
           {//           if (String.valueOf(passworusu.getPassword()).isEmpty()) {
//              passworusu.setText("*******");
//              passworusu.setForeground(Color.gray);
           }
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void chkContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkContraActionPerformed
         if(chkContra.isSelected()){
             txtContraseña.setEchoChar((char)0);
             
         }else{
             txtContraseña.setEchoChar('*');
         }
    }//GEN-LAST:event_chkContraActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        
        if(txtUsuario.getText().isEmpty()&&!txtContraseña.getText().isEmpty()){
            if(UsuarioLogic.autenticar(txtUsuario.getText(), txtContraseña.getText())) {
                JOptionPane.showInternalMessageDialog(this, "¡Bienvenido! vamos a apostar!");
                 this.dispose();
                 FrmPaginaPrinc frmPaginaPrincipal=new FrmPaginaPrinc();
                 frmPaginaPrincipal.setVisible(true);
            
            }
        }else{
            JOptionPane.showMessageDialog(this,"Ese no es el usuario o la contraseña");
            
             }
       
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnRegistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistActionPerformed
           FrmRegistrarApost frmRegistrarUsua=new FrmRegistrarApost(this,true);
            frmRegistrarUsua.setVisible(true);
    }//GEN-LAST:event_btnRegistActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         FrmPaginaPrinc frmPaginaPrinc=new FrmPaginaPrinc();  
           frmPaginaPrinc.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin(registro).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JLabel JSplayl;
    private javax.swing.JPanel bexit;
    private javax.swing.JLabel bntInem;
    private javax.swing.JPanel borempl;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnRegist;
    private javax.swing.JCheckBox chkContra;
    private javax.swing.JLabel contraseña;
    private javax.swing.JPanel fondojs;
    private javax.swing.JLabel iniciose;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JLabel usuario;
    private javax.swing.JLabel xexit;
    // End of variables declaration//GEN-END:variables
}
