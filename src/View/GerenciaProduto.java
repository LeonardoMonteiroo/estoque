/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @rsrs
 * 
 */
public class GerenciaProduto extends javax.swing.JFrame {

    private Produto objproduto; // cria o v�nculo com o objproduto
    
    public GerenciaProduto() {
        initComponents();
        this.objproduto = new Produto(); // carrega objaluno de produto
        this.carregaTabela();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        b_cancelar = new javax.swing.JButton();
        b_alterar = new javax.swing.JButton();
        b_apagar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        c_nome = new javax.swing.JTextField();
        c_descricao = new javax.swing.JTextField();
        c_preco = new javax.swing.JTextField();
        Estoque = new javax.swing.JLabel();
        c_estoque = new javax.swing.JTextField();

        setTitle("Gerenciamento de Produtos");

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Descrição", "Preço", "Estoque"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProdutos);
        if (jTableProdutos.getColumnModel().getColumnCount() > 0) {
            jTableProdutos.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTableProdutos.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTableProdutos.getColumnModel().getColumn(2).setPreferredWidth(200);
            jTableProdutos.getColumnModel().getColumn(3).setPreferredWidth(15);
            jTableProdutos.getColumnModel().getColumn(4).setPreferredWidth(15);
        }

        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });

        b_alterar.setText("Alterar");
        b_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_alterarActionPerformed(evt);
            }
        });

        b_apagar.setText("Apagar");
        b_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_apagarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Descrição:");

        jLabel3.setText("Preço:");

        c_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_nomeActionPerformed(evt);
            }
        });

        c_descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_descricaoActionPerformed(evt);
            }
        });

        c_preco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_precoActionPerformed(evt);
            }
        });

        Estoque.setText("Estoque");

        c_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_estoqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(b_cancelar)
                                .addGap(18, 18, 18)
                                .addComponent(b_alterar)
                                .addGap(18, 18, 18)
                                .addComponent(b_apagar))
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(c_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Estoque)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(c_estoque, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                .addComponent(c_preco, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c_preco, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Estoque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(c_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_cancelar)
                    .addComponent(b_alterar)
                    .addComponent(b_apagar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void b_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_alterarActionPerformed
        
       
        
    }//GEN-LAST:event_b_alterarActionPerformed

    private void c_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_nomeActionPerformed
        
    }//GEN-LAST:event_c_nomeActionPerformed

    private void c_precoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_precoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_precoActionPerformed

    private void c_descricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_descricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_descricaoActionPerformed

    private void jTableProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutosMouseClicked
        if (this.jTableProdutos.getSelectedRow() != -1) {

            String nome = this.jTableProdutos.getValueAt(this.jTableProdutos.getSelectedRow(), 1).toString();
            String descricao = this.jTableProdutos.getValueAt(this.jTableProdutos.getSelectedRow(), 2).toString();
            String preco = this.jTableProdutos.getValueAt(this.jTableProdutos.getSelectedRow(), 3).toString();
            String estoque = this.jTableProdutos.getValueAt(this.jTableProdutos.getSelectedRow(), 4).toString();
            

            this.c_nome.setText(nome);
            this.c_descricao.setText(descricao);
            this.c_preco.setText(preco);
            this.c_estoque.setText(estoque);
    }//GEN-LAST:event_jTableProdutosMouseClicked
}
    
    private void c_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_estoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_estoqueActionPerformed

    private void b_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_apagarActionPerformed
        try {
        // Validando dados da interface gráfica.
        int id = 0;
        if (this.jTableProdutos.getSelectedRow() == -1) {
            throw new Mensagens("Primeiro, selecione um Produto para APAGAR");
        } else {
            id = Integer.parseInt(this.jTableProdutos.getValueAt(this.jTableProdutos.getSelectedRow(), 0).toString());
        }

        // Retorna 0 -> primeiro botão | 1 -> segundo botão | 2 -> terceiro botão
        int respostaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja APAGAR este Produto ?");

        if (respostaUsuario == 0) {// Clicou em SIM

            // Envia os dados para o Produto processar
            if (this.objproduto.DeleteProdutoBD(id)) {

                // Limpa os campos
                this.c_nome.setText("");
                this.c_descricao.setText("");
                this.c_preco.setText("");
                this.c_estoque.setText("");
                JOptionPane.showMessageDialog(rootPane, "Produto Apagado com Sucesso!");

            }

        }

            System.out.println(this.objproduto.getProdutosList().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            // Atualiza a tabela.
            carregaTabela();
        }
    }//GEN-LAST:event_b_apagarActionPerformed

    public void carregaTabela() {

    DefaultTableModel modelo = (DefaultTableModel) this.jTableProdutos.getModel();
    modelo.setNumRows(0);

    ArrayList<Produto> minhalista = new ArrayList<>();
    minhalista = objproduto.getProdutosList(); // Corrigido de getProdutoList() para getProdutosList()

    for (Produto p : minhalista) {
        modelo.addRow(new Object[]{
            p.getId_produto(), 
            p.getNome_produto(),
            p.getDescricao_produto(), 
            p.getPreco(), 
            p.getQuantidade_estoque() 
        });
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
            java.util.logging.Logger.getLogger(GerenciaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Estoque;
    private javax.swing.JButton b_alterar;
    private javax.swing.JButton b_apagar;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JTextField c_descricao;
    private javax.swing.JTextField c_estoque;
    private javax.swing.JTextField c_nome;
    private javax.swing.JTextField c_preco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProdutos;
    // End of variables declaration//GEN-END:variables
}
