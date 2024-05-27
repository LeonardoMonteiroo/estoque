package View;

import Model.Produto;
import static Utils.DateSQL.getDataAtual;
import Utils.JustINT;
import Utils.MaxChar;
import Utils.RealFormat;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author gabriel
 */
// Avalia com carinho. ;c
public class CadastroProduto extends javax.swing.JFrame {

    private Produto objProduto;

    public CadastroProduto() {
        initComponents();
        this.objProduto = new Produto();
        Field_Preco.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                SwingUtilities.invokeLater(() -> {
                    Field_Preco.setCaretPosition(Field_Preco.getText().length());
                });
            }
        });
    }

    private void CheckConfirmar() {
        Buttom_Confirmar.setEnabled(!Field_NomeDoProduto.getText().trim().isEmpty()
                && !Field_DescricaoDoProduto.getText().trim().isEmpty()
                && (!AdicionarEstoque.isSelected() || !Field_QuantidadeEmEstoque.getText().trim().isEmpty()));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Field_QuantidadeEmEstoque = new javax.swing.JTextField();
        Scroll_DescricaoDoProduto = new javax.swing.JScrollPane();
        Field_DescricaoDoProduto = new javax.swing.JTextArea();
        Field_NomeDoProduto = new javax.swing.JTextField();
        Field_Preco = new javax.swing.JTextField();
        NomeDoProduto = new javax.swing.JLabel();
        DescricaoDoProduto = new javax.swing.JLabel();
        Preco = new javax.swing.JLabel();
        QuantidadeEmEstoque = new javax.swing.JLabel();
        Buttom_Cancelar = new javax.swing.JButton();
        AdicionarEstoque = new javax.swing.JCheckBox();
        Buttom_Confirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produto");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setMinimumSize(null);
        setResizable(false);

        Field_QuantidadeEmEstoque.setEditable(false);
        Field_QuantidadeEmEstoque.setDocument(new JustINT());
        Field_QuantidadeEmEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Field_QuantidadeEmEstoqueKeyReleased(evt);
            }
        });

        Scroll_DescricaoDoProduto.setMaximumSize(null);
        Scroll_DescricaoDoProduto.setMinimumSize(null);

        Field_DescricaoDoProduto.setColumns(20);
        Field_DescricaoDoProduto.setDocument(new MaxChar(255));
        Field_DescricaoDoProduto.setLineWrap(true);
        Field_DescricaoDoProduto.setRows(5);
        Field_DescricaoDoProduto.setTabSize(0);
        Field_DescricaoDoProduto.setToolTipText("Máximo de 255 caracteres");
        Field_DescricaoDoProduto.setWrapStyleWord(true);
        Field_DescricaoDoProduto.setMaximumSize(null);
        Field_DescricaoDoProduto.setMinimumSize(null);
        Field_DescricaoDoProduto.setName(""); // NOI18N
        Field_DescricaoDoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Field_DescricaoDoProdutoKeyReleased(evt);
            }
        });
        Scroll_DescricaoDoProduto.setViewportView(Field_DescricaoDoProduto);
        Field_DescricaoDoProduto.getAccessibleContext().setAccessibleName("");
        Field_DescricaoDoProduto.getAccessibleContext().setAccessibleDescription("");

        Field_NomeDoProduto.setDocument(new MaxChar(50));
        Field_NomeDoProduto.setToolTipText("Máximo de 50 caracteres");
        Field_NomeDoProduto.setMaximumSize(null);
        Field_NomeDoProduto.setMinimumSize(null);
        Field_NomeDoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field_NomeDoProdutoActionPerformed(evt);
            }
        });
        Field_NomeDoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Field_NomeDoProdutoKeyReleased(evt);
            }
        });

        Field_Preco.setDocument(new RealFormat());
        Field_Preco.setText("R$ 0,00");
        Field_Preco.setMaximumSize(null);
        Field_Preco.setMinimumSize(null);
        Field_Preco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field_PrecoActionPerformed(evt);
            }
        });

        NomeDoProduto.setText("Nome do Produto");

        DescricaoDoProduto.setText("Descrição do Produto");

        Preco.setText("Preço");

        QuantidadeEmEstoque.setText("Quantidade em estoque");

        Buttom_Cancelar.setText("Cancelar");
        Buttom_Cancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Buttom_Cancelar.setMaximumSize(new java.awt.Dimension(83, 23));
        Buttom_Cancelar.setMinimumSize(new java.awt.Dimension(83, 23));
        Buttom_Cancelar.setPreferredSize(new java.awt.Dimension(83, 23));
        Buttom_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buttom_CancelarActionPerformed(evt);
            }
        });

        AdicionarEstoque.setText("Adicionar estoque?");
        AdicionarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarEstoqueActionPerformed(evt);
            }
        });

        Buttom_Confirmar.setText("Confirmar");
        Buttom_Confirmar.setEnabled(false);
        Buttom_Confirmar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Buttom_Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buttom_ConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Buttom_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Buttom_Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Preco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DescricaoDoProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NomeDoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Field_NomeDoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Scroll_DescricaoDoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Field_Preco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Field_QuantidadeEmEstoque)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(QuantidadeEmEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AdicionarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 88, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(NomeDoProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Field_NomeDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DescricaoDoProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Scroll_DescricaoDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Preco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Field_Preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QuantidadeEmEstoque)
                    .addComponent(AdicionarEstoque))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Field_QuantidadeEmEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buttom_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buttom_Confirmar))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        Field_QuantidadeEmEstoque.getAccessibleContext().setAccessibleName("jTextField_QuantidadeEmEstoque");
        Field_QuantidadeEmEstoque.getAccessibleContext().setAccessibleParent(Field_QuantidadeEmEstoque);
        Scroll_DescricaoDoProduto.getAccessibleContext().setAccessibleName("JScrollPane_DescricaoDoProduto");
        Scroll_DescricaoDoProduto.getAccessibleContext().setAccessibleParent(Scroll_DescricaoDoProduto);
        Field_NomeDoProduto.getAccessibleContext().setAccessibleName("");
        Field_NomeDoProduto.getAccessibleContext().setAccessibleDescription("");
        Field_Preco.getAccessibleContext().setAccessibleName("jTextField_Preco");
        Field_Preco.getAccessibleContext().setAccessibleParent(Field_Preco);
        NomeDoProduto.getAccessibleContext().setAccessibleName("jLabel_NomeDoProduto");
        NomeDoProduto.getAccessibleContext().setAccessibleParent(NomeDoProduto);
        DescricaoDoProduto.getAccessibleContext().setAccessibleName("jLabel_DescricaoDoProduto");
        DescricaoDoProduto.getAccessibleContext().setAccessibleParent(DescricaoDoProduto);
        Preco.getAccessibleContext().setAccessibleName("jLabel_Preco");
        Preco.getAccessibleContext().setAccessibleParent(Preco);
        QuantidadeEmEstoque.getAccessibleContext().setAccessibleName("jLabel_QuantidadeEmEstoque");
        QuantidadeEmEstoque.getAccessibleContext().setAccessibleParent(QuantidadeEmEstoque);
        Buttom_Cancelar.getAccessibleContext().setAccessibleName("jButtom_Cancelar");
        Buttom_Cancelar.getAccessibleContext().setAccessibleParent(Buttom_Cancelar);
        AdicionarEstoque.getAccessibleContext().setAccessibleName("JChechBox_AdicionarEstoque");
        AdicionarEstoque.getAccessibleContext().setAccessibleParent(AdicionarEstoque);
        Buttom_Confirmar.getAccessibleContext().setAccessibleParent(Buttom_Confirmar);

        getAccessibleContext().setAccessibleName("CadastroDeProduto");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void Field_NomeDoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field_NomeDoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field_NomeDoProdutoActionPerformed

    private void Buttom_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buttom_CancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_Buttom_CancelarActionPerformed

    private void Field_PrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field_PrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field_PrecoActionPerformed

    private void AdicionarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarEstoqueActionPerformed
        if (!Field_QuantidadeEmEstoque.isEditable()) {
            Field_QuantidadeEmEstoque.setEditable(true);
        } else {
            Field_QuantidadeEmEstoque.setEditable(false);
            Field_QuantidadeEmEstoque.setText(null);
        }
        CheckConfirmar();
    }//GEN-LAST:event_AdicionarEstoqueActionPerformed

    private void Buttom_ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buttom_ConfirmarActionPerformed
        // TODO add your handling code here:

        try {
            int id = 0;
            String nome = "";
            String descricao = "";
            float preco = 0;
            int quantidade = 0;

            nome = this.Field_NomeDoProduto.getText().trim();
            descricao = this.Field_DescricaoDoProduto.getText().trim();
            preco = Integer.parseInt(this.Field_Preco.getText().replaceAll("[^0-9]", ""));
            quantidade = Integer.parseInt(this.Field_QuantidadeEmEstoque.getText());

            this.objProduto.InsertProdutoBD(id, nome, descricao, quantidade, preco, getDataAtual());

            this.Field_NomeDoProduto.setText("");
            this.Field_DescricaoDoProduto.setText("");
            this.Field_Preco.setText("R$ 0,00");
            this.QuantidadeEmEstoque.setText("");

        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(CadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_Buttom_ConfirmarActionPerformed

    private void Field_NomeDoProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Field_NomeDoProdutoKeyReleased
        CheckConfirmar();
    }//GEN-LAST:event_Field_NomeDoProdutoKeyReleased

    private void Field_DescricaoDoProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Field_DescricaoDoProdutoKeyReleased
        CheckConfirmar();
    }//GEN-LAST:event_Field_DescricaoDoProdutoKeyReleased

    private void Field_QuantidadeEmEstoqueKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Field_QuantidadeEmEstoqueKeyReleased
        CheckConfirmar();
    }//GEN-LAST:event_Field_QuantidadeEmEstoqueKeyReleased

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
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AdicionarEstoque;
    private javax.swing.JButton Buttom_Cancelar;
    private javax.swing.JButton Buttom_Confirmar;
    private javax.swing.JLabel DescricaoDoProduto;
    private javax.swing.JTextArea Field_DescricaoDoProduto;
    private javax.swing.JTextField Field_NomeDoProduto;
    private javax.swing.JTextField Field_Preco;
    private javax.swing.JTextField Field_QuantidadeEmEstoque;
    private javax.swing.JLabel NomeDoProduto;
    private javax.swing.JLabel Preco;
    private javax.swing.JLabel QuantidadeEmEstoque;
    private javax.swing.JScrollPane Scroll_DescricaoDoProduto;
    // End of variables declaration//GEN-END:variables
}
