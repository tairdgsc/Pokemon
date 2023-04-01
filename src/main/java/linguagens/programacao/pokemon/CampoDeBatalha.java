/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package linguagens.programacao.pokemon;

/**
 *
 * @author Taila
 */
public class CampoDeBatalha extends javax.swing.JFrame {

    /**
     * Creates new form CampoDeBatalha
     */
    public CampoDeBatalha() {
        initComponents();
        
        painelBatalhaEmAndamento.setVisible(false);
        dadosPrimeiroPokemon.setEnabled(false);
        dadosSegundoPokemon.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textNome1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textTipo1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textLevel1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textVida1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textLevel2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textVida2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        textNome2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        textTipo2 = new javax.swing.JTextField();
        buttonIniciarBatalha = new javax.swing.JButton();
        painelBatalhaEmAndamento = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dadosSegundoPokemon = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        dadosPrimeiroPokemon = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Campo de Batalha de Pokemons");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Dados do segundo pokemon");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Dados do primeiro pokemon");

        jLabel4.setText("Nome");

        textNome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNome1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Tipo");

        textTipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTipo1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Level");

        textLevel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textLevel1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Vida");

        textVida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textVida1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Level");

        textLevel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textLevel2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Vida");

        textVida2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textVida2ActionPerformed(evt);
            }
        });

        jLabel10.setText("Nome");

        textNome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNome2ActionPerformed(evt);
            }
        });

        jLabel11.setText("Tipo");

        textTipo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTipo2ActionPerformed(evt);
            }
        });

        buttonIniciarBatalha.setText("Iniciar Batalha");
        buttonIniciarBatalha.setAlignmentY(0.0F);
        buttonIniciarBatalha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIniciarBatalhaActionPerformed(evt);
            }
        });

        painelBatalhaEmAndamento.setEnabled(false);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Batalha em Andamento");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel21.setText("VS");

        dadosSegundoPokemon.setColumns(20);
        dadosSegundoPokemon.setRows(5);
        jScrollPane1.setViewportView(dadosSegundoPokemon);

        dadosPrimeiroPokemon.setColumns(20);
        dadosPrimeiroPokemon.setRows(5);
        jScrollPane2.setViewportView(dadosPrimeiroPokemon);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Resultado");

        javax.swing.GroupLayout painelBatalhaEmAndamentoLayout = new javax.swing.GroupLayout(painelBatalhaEmAndamento);
        painelBatalhaEmAndamento.setLayout(painelBatalhaEmAndamentoLayout);
        painelBatalhaEmAndamentoLayout.setHorizontalGroup(
            painelBatalhaEmAndamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBatalhaEmAndamentoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(painelBatalhaEmAndamentoLayout.createSequentialGroup()
                .addGroup(painelBatalhaEmAndamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBatalhaEmAndamentoLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelBatalhaEmAndamentoLayout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addGroup(painelBatalhaEmAndamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addGap(203, 203, 203))
            .addGroup(painelBatalhaEmAndamentoLayout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelBatalhaEmAndamentoLayout.setVerticalGroup(
            painelBatalhaEmAndamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBatalhaEmAndamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGroup(painelBatalhaEmAndamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBatalhaEmAndamentoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelBatalhaEmAndamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelBatalhaEmAndamentoLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel21)))
                .addGap(32, 32, 32)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(122, 122, 122))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textLevel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textNome1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(textTipo1, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textVida1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(55, 55, 55)
                .addComponent(buttonIniciarBatalha, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textVida2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(textNome2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textTipo2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textLevel2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBatalhaEmAndamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textLevel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textVida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNome2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonIniciarBatalha)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textLevel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textVida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(painelBatalhaEmAndamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNome1ActionPerformed

    private void textTipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTipo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTipo1ActionPerformed

    private void textLevel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textLevel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textLevel1ActionPerformed

    private void textVida1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textVida1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textVida1ActionPerformed

    private void textLevel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textLevel2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textLevel2ActionPerformed

    private void textVida2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textVida2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textVida2ActionPerformed

    private void textNome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNome2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNome2ActionPerformed

    private void textTipo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTipo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTipo2ActionPerformed

    private void buttonIniciarBatalhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIniciarBatalhaActionPerformed
        painelBatalhaEmAndamento.setVisible(true);
        String nomePrimeiro = textNome1.getText();
        String tipoPrimeiro = textTipo1.getText();
        double vidaPrimeiro = Float.parseFloat(textVida1.getText());
        double levelPrimeiro = Float.parseFloat(textLevel1.getText());
        
        String nomeSegundo = textNome2.getText();
        String tipoSegundo = textTipo2.getText();
        double vidaSegundo = Float.parseFloat(textVida2.getText());
        double levelSegundo = Float.parseFloat(textLevel2.getText());
        
        Pokemon primeiro = new Pokemon(nomePrimeiro, tipoPrimeiro, vidaPrimeiro, levelPrimeiro);
        Pokemon segundo = new Pokemon(nomeSegundo, tipoSegundo, vidaSegundo, levelSegundo);
        
        primeiro.CalculaAtributos();
        primeiro.CalculaLevel();
        
        segundo.CalculaAtributos();
        segundo.CalculaLevel();
        
        dadosPrimeiroPokemon.setText(primeiro.Imprimir());
        dadosSegundoPokemon.setText(segundo.Imprimir());
        
        Batalha batalha = new Batalha();

        lblResultado.setText( batalha.IniciarBatalha(primeiro, segundo));

    }//GEN-LAST:event_buttonIniciarBatalhaActionPerformed

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
            java.util.logging.Logger.getLogger(CampoDeBatalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CampoDeBatalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CampoDeBatalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CampoDeBatalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CampoDeBatalha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonIniciarBatalha;
    private javax.swing.JTextArea dadosPrimeiroPokemon;
    private javax.swing.JTextArea dadosSegundoPokemon;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JPanel painelBatalhaEmAndamento;
    private javax.swing.JTextField textLevel1;
    private javax.swing.JTextField textLevel2;
    private javax.swing.JTextField textNome1;
    private javax.swing.JTextField textNome2;
    private javax.swing.JTextField textTipo1;
    private javax.swing.JTextField textTipo2;
    private javax.swing.JTextField textVida1;
    private javax.swing.JTextField textVida2;
    // End of variables declaration//GEN-END:variables
}