/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordem_servico;

import java.sql.ResultSet;
import java.text.ParseException;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import ordem_servico.dados;

/**
 *
 * @author Leonardo
 */
public class Frame_cliente extends javax.swing.JFrame {

    /**
     * Creates new form frame_geral
     * @throws java.text.ParseException
     */
    public Frame_cliente() {
       
        initComponents(); 
        
       /*  
        if (status.equals("cadastro")){
            jLabel13.setVisible(false);
            jLabel3.setVisible(false);
            jLabel12.setVisible(false);
            jLabel14.setVisible(false);
            jTextField10.setVisible(false);
            jTextField11.setVisible(false);
            jTextField12.setVisible(false);
            jButton3.setVisible(false);
            jButton2.setVisible(false);
        }
        if (status.equals("atualiza")){
            jButton1.setVisible(false);
            jButton4.setVisible(false);           
        }
        if (status.equals("exclui")){
            jButton1.setVisible(false);
            jButton2.setVisible(false);           
        }
        if (status.equals("consulta")){
           // jButton1.setVisible(false);
            jButton2.setEnabled(false);
            jButton4.setEnabled(false);
            jButton1.setEnabled(false);
            jTextField7.setEnabled(false);
        }
        */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextField9 = new javax.swing.JTextArea();
        jTextField4 = new javax.swing.JFormattedTextField();
        jTextField6 = new javax.swing.JFormattedTextField();
        jTextField5 = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JFormattedTextField();
        jTextField12 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("CPF:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 173, -1, -1));

        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 226, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 223, 220, -1));

        jButton1.setText("Cadastrar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 100, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("CONSULTA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jButton5.setText("Fechar");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 100, -1));

        jLabel4.setText("Endereço:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 255, -1, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 252, 150, -1));

        jLabel5.setText("Telefone:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 172, -1, -1));

        jLabel6.setText("Nascimento:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 227, -1, -1));

        jLabel7.setText("Celular:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 196, -1, -1));

        jLabel8.setText("Cidade:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 284, -1, -1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 281, 150, -1));

        jLabel9.setText("RG:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 203, -1, -1));

        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField8KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 196, 150, -1));

        jLabel10.setText("Observação:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 281, -1, -1));

        jButton2.setText("Alterar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 100, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("FICHA DO CLIENTE");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 133, -1, -1));
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 47, 260, -1));

        jLabel12.setText("Nome:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 75, 150, -1));

        jLabel13.setText("RG:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 78, -1, -1));

        jLabel14.setText("CPF:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 104, -1, -1));

        jButton3.setText("Consultar");
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
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        jLabel15.setText("E-mail:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 256, -1, -1));
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 253, 150, -1));

        jButton4.setText("Excluir");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 100, -1));

        jButton6.setText("Limpar");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 100, -1));

        jTextField9.setColumns(20);
        jTextField9.setRows(5);
        jScrollPane1.setViewportView(jTextField9);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 281, 150, 70));

        try {
            jTextField4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 169, 100, -1));

        try {
            jTextField6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 196, 100, -1));

        try {
            jTextField5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 224, 100, -1));
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 401, -1, -1));
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 191, -1, -1));

        try {
            jTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 170, 150, -1));

        try {
            jTextField12.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 101, 150, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked

        setVisible(false);

    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
         dados d = new dados();
        
         if (d.conecta()){
            System.out.println("Conectado com sucesso!");
        }else {
            System.out.println("Erro ao conectar!");
        }
        
        String cpf = jTextField1.getText();
        String rg = jTextField8.getText();
        String nome = null;
        String endereco = null;
        String cidade = null;
        String nascimento = null;
        String email = null;
        String observacao = null;
        
        if (!jTextField2.getText().isEmpty()){
             nome =(jTextField2.getText().toUpperCase());
        }
        if (!jTextField3.getText().isEmpty()){
             endereco =(jTextField3.getText().toUpperCase());
        }
        if (!jTextField7.getText().isEmpty()){
             cidade =(jTextField7.getText().toUpperCase());
        }
        String telefone = jTextField4.getText();
        String celular = jTextField6.getText();
        if (!jTextField5.getText().isEmpty()){
             nascimento =(jTextField5.getText().toUpperCase());
        }
        if (!jTextField13.getText().isEmpty()){
             email =(jTextField13.getText().toLowerCase());
        }
        if (!jTextField9.getText().isEmpty()){
             observacao =(jTextField9.getText().toUpperCase());
        }
        
        
        
        if (nome != null){
            
            Cliente cli = new Cliente(cpf,nome, rg, endereco, telefone, celular, nascimento, email, observacao);
//            d.insere("cclientes", cpf, rg, nome, endereco, cidade, telefone, celular, nascimento,email, observacao);
//                    jTextField1.setText(null);
//                    jTextField8.setText(null);
//                    jTextField2.setText(null);
//                    jTextField3.setText(null);
//                    jTextField7.setText(null);
//                    jTextField4.setText(null);
//                    jTextField6.setText(null);
//                    jTextField5.setText(null);
//                    jTextField13.setText(null);
//                    jTextField9.setText(null);
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "DIGITE O NOME DO CLIENTE!", "ERRO", WIDTH);
        }
        
//            
//        
//        
//            
//            
        
        
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTextField8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8KeyPressed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
////        dados d = new dados();
////        
////        if (d.conecta()){
////            System.out.println("Conectado com sucesso!");
////        }else {
////            System.out.println("Erro ao conectar!");
////        }
////        
////        String cpf = jTextField1.getText();
////        String rg = jTextField8.getText();
////        String nome = null;
////        String endereco = null;
////        String cidade = null;
////        String nascimento = null;
////        String email = null;
////        String observacao = null;
////        
////        if (!jTextField2.getText().isEmpty()){
////             nome =(jTextField2.getText().toUpperCase());
////        }
////        if (!jTextField3.getText().isEmpty()){
////             endereco =(jTextField3.getText().toUpperCase());
////        }
////        if (!jTextField7.getText().isEmpty()){
////             cidade =(jTextField7.getText().toUpperCase());
////        }
////        String telefone = jTextField4.getText();
////        String celular = jTextField6.getText();
////        if (!jTextField5.getText().isEmpty()){
////             nascimento =(jTextField5.getText().toUpperCase());
////        }
////        if (!jTextField13.getText().isEmpty()){
////             email =(jTextField13.getText().toLowerCase());
////        }
////        if (!jTextField9.getText().isEmpty()){
////             observacao =(jTextField9.getText().toUpperCase());
////        }
////        
////        if (nome != null){
////            
////            d.atualiza("cclientes", "cpf = '"+cpf+"', rg = '"+rg+"', nome = '"+nome+"', endereco = '"+endereco+"', "
////                    + "cidade = '"+cidade+"', telefone = '"+telefone+"', celular = '"+celular+"', nascimento = '"+nascimento+"',"
////                    + "email = '"+email+"', observacao = '"+observacao+"'","nome = '"+jTextField10.getText()+"' or "
////                            + "rg = '"+jTextField11.getText()+"' or cpf = '"+jTextField12.getText()+"'");
////
////            
////                    jTextField1.setText(null);
////                    jTextField8.setText(null);
////                    jTextField2.setText(null);
////                    jTextField3.setText(null);
////                    jTextField7.setText(null);
////                    jTextField4.setText(null);
////                    jTextField6.setText(null);
////                    jTextField5.setText(null);
////                    jTextField13.setText(null);
////                    jTextField9.setText(null);
////            
////        }else{
////            JOptionPane.showMessageDialog(rootPane, "NENHUM REGISTRO SELECIONADO!", "ERRO", WIDTH);
////        }
////        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
//       jTextField1.setText(null);
//       jTextField8.setText(null);
//       jTextField2.setText(null);
//       jTextField3.setText(null);
//       jTextField7.setText(null);
//       jTextField4.setText(null);
//       jTextField6.setText(null);
//       jTextField5.setText(null);
//       jTextField13.setText(null);
//       jTextField9.setText(null);      
//       ConectorSqlServer d = new ConectorSqlServer();
//        
//        if (d.Conectar()){
//            System.out.println("Conectado com sucesso!");
//        }else {
//            System.out.println("Erro ao conectar!");
//        };
//        
//        ResultSet rs = null; 
//        
//        
//        if (!jTextField10.getText().isEmpty()){
//               jTextField10.setText(jTextField10.getText().toUpperCase());
//               rs = d.consulta("select * from cclientes where nome = '"+jTextField10.getText()+"'");
//        }
//        if (!jTextField11.getText().isEmpty()){
//               rs = d.consulta("select * from cclientes where rg = '"+jTextField11.getText()+"'");
//        }
//        if (!jTextField12.getText().equals("   .   .   -  ")){
//               rs = d.consulta("select * from cclientes where cpf = '"+jTextField12.getText()+"'");
//        }
//        if (rs != null){
//            
//            try{
//               
//                            while (rs.next()){
//                                jTextField1.setText(rs.getString("cpf"));
//                                jTextField8.setText(rs.getString("rg"));
//                                jTextField2.setText(rs.getString("nome"));
//                                jTextField3.setText(rs.getString("endereco"));
//                                jTextField7.setText(rs.getString("cidade"));
//                                jTextField4.setText(rs.getString("telefone"));
//                                jTextField6.setText(rs.getString("celular"));
//                                jTextField5.setText(rs.getString("nascimento"));
//                                jTextField13.setText(rs.getString("email"));
//                                jTextField9.setText(rs.getString("observacao"));
//                           }
//               
//            }catch(Exception e){
//                System.out.println("Houve um erro: "+e);
//            }
//            
//            if (jTextField2.getText().isEmpty()){
//                JOptionPane.showMessageDialog(rootPane, "NENHUM REGISTRO ENCONTADO", "AVISO", WIDTH);
//            }
//            
//        }else{
//            JOptionPane.showMessageDialog(rootPane, "FAVOR INSERIR VALOR EM ALGUM DOS TRÊS CAMPOS", "AVISO", WIDTH);
//        }
//       
//        
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
//        dados d = new dados();
//        
//        if (d.conecta()){
//            System.out.println("Conectado com sucesso!");
//        }else {
//            System.out.println("Erro ao conectar!");
//        }
//        
//        ResultSet rs = null;
//                
//        if (!jTextField2.getText().isEmpty()){
//            rs = d.consulta("select count(*) from cclientes where nome like '"+jTextField2.getText()+"'"); 
//            
//            try{
//                while(rs.next()){
//                    System.out.print(rs.getString("count(*)"));
//                    if (rs.getString("count(*)").equals("1")){
//                        int resp = 0;
//                        resp = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja excluir?", "Confirmar", resp, WIDTH);
//                         if (resp==JOptionPane.YES_OPTION){
//                             d.exclui("cclientes", "nome = '"+jTextField2.getText()+"'");
//                             JOptionPane.showMessageDialog(rootPane, "EXCLUIDO COM SUCESSO!", "AVISO", resp);
//                                jTextField1.setText(null);
//                                jTextField8.setText(null);
//                                jTextField2.setText(null);
//                                jTextField3.setText(null);
//                                jTextField7.setText(null);
//                                jTextField4.setText(null);
//                                jTextField6.setText(null);
//                                jTextField5.setText(null);
//                                jTextField13.setText(null);
//                                jTextField9.setText(null);
//                         }else{
//                             JOptionPane.showMessageDialog(rootPane, "NENHUM REGISTRO FOI ALTERADO!", "AVISO", resp);
//                         }
//
//
//                    }
//                }
//            
//            }catch(Exception e){
//                System.out.println("Houve um erro: "+e);
//            }
//        }else{
//          JOptionPane.showMessageDialog(rootPane, "NENHUM REGISTRO SELECIONADO!", "AVISO", WIDTH);  
//        }
//            
//        
//        
//        
//        
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
                jTextField1.setText(null);
                jTextField8.setText(null);
                jTextField2.setText(null);
                jTextField3.setText(null);
                jTextField7.setText(null);
                jTextField4.setText(null);
                jTextField6.setText(null);
                jTextField5.setText(null);
                jTextField13.setText(null);
                jTextField9.setText(null);
                jTextField10.setText(null);
                jTextField11.setText(null);
                jTextField12.setText(null);
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Frame_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            //    new Frame_cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JFormattedTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JFormattedTextField jTextField4;
    private javax.swing.JFormattedTextField jTextField5;
    private javax.swing.JFormattedTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextArea jTextField9;
    // End of variables declaration//GEN-END:variables
}
