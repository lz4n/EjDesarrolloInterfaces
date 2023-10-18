import javax.swing.*;
import java.awt.*;

public class LookAndFeel extends javax.swing.JFrame {
    private javax.swing.JComboBox<String> jComboBox;

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException exception) {
            System.err.println(exception.getMessage());
        }

        java.awt.EventQueue.invokeLater(() -> new LookAndFeel().setVisible(true));
    }

    public LookAndFeel() {
        this.initComponents();
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        for (UIManager.LookAndFeelInfo lookAndFeelInfo: UIManager.getInstalledLookAndFeels()) {
            comboBoxModel.addElement(lookAndFeelInfo.getName());
        }
        this.jComboBox.setModel(comboBoxModel);
    }

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent ignoredEvent) {
        try {
            UIManager.LookAndFeelInfo lookAndFeelInfo = UIManager.getInstalledLookAndFeels()[this.jComboBox.getSelectedIndex()];
            UIManager.setLookAndFeel(lookAndFeelInfo.getClassName());
            SwingUtilities.updateComponentTreeUI(this);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException exception) {
            System.err.println(exception.getMessage());
        }
    }

    private void initComponents() {
        this.jComboBox = new javax.swing.JComboBox<>();
        JLabel jLabel = new JLabel();
        JButton jButton = new JButton();
        JSlider jSlider = new JSlider();
        JSpinner jSpinner = new JSpinner();
        JCheckBox jCheckBox = new JCheckBox();
        JScrollPane jScrollPane = new JScrollPane();
        JList<String> jList = new JList<>();
        JScrollBar jScrollBar = new JScrollBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        this.jComboBox.addActionListener(this::jComboBoxActionPerformed);

        jLabel.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12)); // NOI18N
        jLabel.setText("Look and Feels:");

        jButton.setText("jButton1");

        jCheckBox.setText("jCheckBox1");

        jList.setModel(new javax.swing.AbstractListModel<>() {
            String[] strings = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });
        jScrollPane.setViewportView(jList);

        jScrollBar.setOrientation(javax.swing.JScrollBar.HORIZONTAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(this.jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jCheckBox)
                                                                        .addComponent(jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jButton)
                                                                        .addComponent(jScrollBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel)
                                .addGap(5, 5, 5)
                                .addComponent(this.jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jCheckBox)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(17, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                .addGap(26, 26, 26))))
        );

        pack();
    }
}
