


import Models.Estacionamento;
import java.time.LocalDateTime;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import views.Alunos;












/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MeuComputador
 */
public class Estacionar extends javax.swing.JInternalFrame {

    /**
     * Creates new form Login
     */
    int identificador = 1;
    
    public Estacionar() {
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

        jPanel1 = new javax.swing.JPanel();
        cpf = new javax.swing.JTextField();
        placa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        estacionar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setToolTipText("Login");
        jPanel1.setInheritsPopupMenu(true);

        cpf.setText("7");

        placa.setText("7");

        jLabel1.setText("CPF :");

        jLabel2.setText("Placa");

        estacionar.setText("Estacionar");
        estacionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estacionarActionPerformed(evt);
            }
        });

        jLabel3.setText("Estacionamento Virtual");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cpf)
                    .addComponent(placa, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                .addGap(63, 63, 63))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 238, Short.MAX_VALUE)
                .addComponent(estacionar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(45, 45, 45)
                .addComponent(estacionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void estacionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estacionarActionPerformed
        // função
        EstacionaVeiculo(cpf.getText(),placa.getText());
        //exit
        this.dispose();       
    }//GEN-LAST:event_estacionarActionPerformed
    private void Login(String cpf, String senha){
         
         
         try{
             
           
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            // transação
          
         //sql
         String select = "select tipo from pessoa where cpf = "+cpf+" and senha ="+senha; 
         Query q = sessao.createSQLQuery(select);
         //retorna o tipo ex : AUX,RH,ADMIN,ETC
         String query = q.list().get(0).toString();     
         //função
         logar(query);
        
         
         //erro
        }catch(HibernateException error){
            //msg erro
             JOptionPane.showInputDialog("erro :"+error);
        }
         
    }

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cpf;
    private javax.swing.JButton estacionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField placa;
    // End of variables declaration//GEN-END:variables
    
    
    //logar no app e opçoes de usuarios
    private void logar(String select) {
        if(select.equals("ADMIN")){
            Administrador adm = new Administrador();
            adm.setVisible(true);
            
            
        }
         else if(select.equals("ALUNO")){
             Alunos aluno = new Alunos();
            aluno.setVisible(true);
                            
                
                 }
         else if(select.equals("RH")){
                 RecusosHumanos rh = new RecusosHumanos();
            rh.setVisible(true);
          
                 }
          else if(select.equals("AUX")){
                 FuncionarioEstacionamento aux = new FuncionarioEstacionamento();
            aux.setVisible(true);
           this.dispose();
           
                 }
         
        else{
            JOptionPane.showMessageDialog(null,"Visitante e alunos ainda nao podem logar no sistema" );
        }
    }
    
    

    private void EstacionaVeiculo(String cpf, String placa) {
        try{
           //sessao
           Session sessao = HibernateUtil.getSessionFactory().openSession();
           //transação
           sessao.beginTransaction();
           //esse numero vai somar as vagas posteriormente
           String um = "1";
           //datatime
           String data = String.valueOf(LocalDateTime.now(ZoneId.of("America/Sao_Paulo")));
           //cria obj
           Estacionamento e = new Estacionamento(cpf,placa,data,um);
           //persiste no banco
           sessao.persist(e); 
           //commit
           sessao.getTransaction().commit();
           
           //cria um novo obj passando dois parametros
           
           // atualização que vai ser implementada junto com o desktop do aluno posteriormente
           //substituir o escolhe vaga para o Jframe Aluno, implementar o escolhe vaga no 
           //desktop e adicionar outras att
           EscolheVaga esc = new EscolheVaga(placa,cpf);
           //torna visivel a interface para escolher o setor
           esc.setVisible(true);
           
        //erro      
        }catch(HibernateException error){
            //msg erro
            JOptionPane.showMessageDialog(null,"Error :"+ error);
        }
        
        
    }
       
    
    
        }//fecha o programa
