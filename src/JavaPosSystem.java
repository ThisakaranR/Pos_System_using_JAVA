
import java.text.MessageFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author LENOVA-Thisakaran Rasalingam | University of Kelaniya
 */
public class JavaPosSystem extends javax.swing.JFrame {

    /**
     * Creates new form JavaPosSystem
     */
    public JavaPosSystem() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtChange = new javax.swing.JTextField();
        jtxtDisplay = new javax.swing.JTextField();
        jPayamentMethod = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtTotal = new javax.swing.JTextField();
        jtxtSubTotal = new javax.swing.JTextField();
        jtxtDiscount = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jbtnReset = new javax.swing.JButton();
        jbtnPay = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jbtnRemove = new javax.swing.JButton();
        jbtnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton21.setBackground(new java.awt.Color(255, 204, 204));
        jButton21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton21.setText("Product-02");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 120, 110));

        jButton26.setBackground(new java.awt.Color(0, 255, 204));
        jButton26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton26.setText("Product-01");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 110));

        jButton27.setBackground(new java.awt.Color(255, 255, 204));
        jButton27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton27.setText("Product-03");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 120, 110));

        jButton28.setBackground(new java.awt.Color(204, 255, 102));
        jButton28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton28.setText("Product-04");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 120, 110));

        jButton29.setBackground(new java.awt.Color(102, 102, 255));
        jButton29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton29.setText("Product-06");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 120, 110));

        jButton30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton30.setText("Product-05");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 120, 110));

        jButton31.setBackground(new java.awt.Color(204, 204, 204));
        jButton31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton31.setText("Product-07");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 120, 110));

        jButton32.setBackground(new java.awt.Color(0, 153, 153));
        jButton32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton32.setText("Product-08");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 120, 110));

        jButton33.setBackground(new java.awt.Color(153, 255, 204));
        jButton33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton33.setText("Product-09");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 120, 110));

        jButton34.setBackground(new java.awt.Color(204, 0, 204));
        jButton34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton34.setText("Product-10");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 120, 110));

        jButton35.setBackground(new java.awt.Color(0, 255, 255));
        jButton35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton35.setText("Product-11");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 120, 110));

        jButton36.setBackground(new java.awt.Color(204, 204, 255));
        jButton36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton36.setText("Product-12");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 120, 110));

        jButton37.setBackground(new java.awt.Color(204, 255, 102));
        jButton37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton37.setText("Product-17");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 120, 110));

        jButton38.setBackground(new java.awt.Color(153, 153, 255));
        jButton38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton38.setText("Product-14");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 120, 110));

        jButton39.setBackground(new java.awt.Color(255, 153, 255));
        jButton39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton39.setText("Product-18");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 120, 110));

        jButton40.setBackground(new java.awt.Color(153, 255, 153));
        jButton40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton40.setText("Product-16");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 120, 110));

        jButton41.setBackground(new java.awt.Color(204, 255, 204));
        jButton41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton41.setText("Product-13");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 120, 110));

        jButton42.setBackground(new java.awt.Color(51, 255, 255));
        jButton42.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton42.setText("Product-15");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton42, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 120, 110));

        jButton43.setBackground(new java.awt.Color(204, 255, 204));
        jButton43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton43.setText("Product-21");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton43, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 120, 110));

        jButton44.setBackground(new java.awt.Color(0, 102, 102));
        jButton44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton44.setText("Product-23");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton44, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 120, 110));

        jButton45.setBackground(new java.awt.Color(0, 204, 204));
        jButton45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton45.setText("Product-20");
        jButton45.setToolTipText("");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton45, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 120, 110));

        jButton46.setBackground(new java.awt.Color(255, 51, 102));
        jButton46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton46.setText("Product-22");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton46, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 120, 110));

        jButton47.setBackground(new java.awt.Color(255, 153, 0));
        jButton47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton47.setText("Product-24");
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton47, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 120, 110));

        jButton48.setBackground(new java.awt.Color(153, 153, 0));
        jButton48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton48.setText("Product-19");
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 120, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 750, 490));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jButton1.setText("9");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jButton2.setText("7");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jButton3.setText("8");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jButton4.setText("6");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jButton6.setText("4");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jButton7.setText("2");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jButton8.setText("1");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jButton9.setText("3");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jButton10.setText("0");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jButton11.setText("C");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jButton12.setText(".");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(182, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(367, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 490));

        jTable1.setBackground(new java.awt.Color(0, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Qty", "Amount"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 360, 490));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Cash");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Balance");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Payment Method");

        jtxtChange.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jtxtDisplay.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jtxtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDisplayActionPerformed(evt);
            }
        });

        jPayamentMethod.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPayamentMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Visa Card", "Master Card", "Online" }));
        jPayamentMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPayamentMethodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPayamentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtxtDisplay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtChange, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPayamentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtChange, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Total");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Sub total");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Discount");

        jtxtTotal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jtxtSubTotal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jtxtSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSubTotalActionPerformed(evt);
            }
        });

        jtxtDiscount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(161, Short.MAX_VALUE)
                    .addComponent(jtxtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(27, 27, 27)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(jtxtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(102, Short.MAX_VALUE)))
        );

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jbtnReset.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        jbtnPay.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnPay.setText("Pay");
        jbtnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPayActionPerformed(evt);
            }
        });

        jbtnExit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        jbtnRemove.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnRemove.setText("Remove");
        jbtnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRemoveActionPerformed(evt);
            }
        });

        jbtnPrint.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnPrint.setText("Print");
        jbtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jbtnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jbtnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 1370, 220));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//======================================Funtion made by Thisakaran R==============================================
    
    public void Itemcost()
    {
        double sum = 0;
        for (int i = 0; i< jTable1.getRowCount(); i++)
        {
            sum = sum + Double.parseDouble(jTable1.getValueAt(i, 2).toString());
        }
        
        jtxtSubTotal.setText(Double.toString(sum));
        double cTotal1 = Double.parseDouble(jtxtSubTotal.getText());
        
        double cTax = (cTotal1 * 2.5 / 100);
        String iTaxTotal = String.format("lkr %.2f", cTax); 
        jtxtDiscount.setText(iTaxTotal);
        
        String iSubTotal = String.format("lkr %.2f", cTotal1);
        jtxtSubTotal.setText(iSubTotal);
        
        String iTotal = String.format("lkr %.2f", cTotal1 - cTax);
        jtxtTotal.setText(iTotal);
        
    
    }
    
    
//======================================Funtion 2 by Thisakaran R==========================
    public void Change()
    {
        double sum = 0;
        double tax = 2.5;
        double cash = Double.parseDouble(jtxtDisplay.getText());
        
        
        for (int i = 0; i< jTable1.getRowCount(); i++)
        {
            sum = sum + Double.parseDouble(jTable1.getValueAt(i, 2).toString());
        }
        
        double cTax = (sum * 2.5 / 100);
        double cChange = (cash - (sum - cTax));
        
        String ChangeGiven = String.format("lkr %.2f", cChange);
        jtxtChange.setText(ChangeGiven);
           
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String Enternumber=jtxtDisplay.getText();
        if (Enternumber == " ")
        {
            jtxtDisplay.setText(jButton1.getText());
        }
        else {
            Enternumber = jtxtDisplay.getText() + jButton1.getText();
            jtxtDisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String Enternumber=jtxtDisplay.getText();
        if (Enternumber == " ")
        {
            jtxtDisplay.setText(jButton2.getText());
        }
        else {
            Enternumber = jtxtDisplay.getText() + jButton2.getText();
            jtxtDisplay.setText(Enternumber);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
          String Enternumber=jtxtDisplay.getText();
        if (Enternumber == " ")
        {
            jtxtDisplay.setText(jButton3.getText());
        }
        else {
            Enternumber = jtxtDisplay.getText() + jButton3.getText();
            jtxtDisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String Enternumber=jtxtDisplay.getText();
        if (Enternumber == " ")
        {
            jtxtDisplay.setText(jButton4.getText());
        }
        else {
            Enternumber = jtxtDisplay.getText() + jButton4.getText();
            jtxtDisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String Enternumber=jtxtDisplay.getText();
        if (Enternumber == " ")
        {
            jtxtDisplay.setText(jButton5.getText());
        }
        else {
            Enternumber = jtxtDisplay.getText() + jButton5.getText();
            jtxtDisplay.setText(Enternumber);
        }        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String Enternumber=jtxtDisplay.getText();
        if (Enternumber == " ")
        {
            jtxtDisplay.setText(jButton6.getText());
        }
        else {
            Enternumber = jtxtDisplay.getText() + jButton6.getText();
            jtxtDisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String Enternumber=jtxtDisplay.getText();
        if (Enternumber == " ")
        {
            jtxtDisplay.setText(jButton7.getText());
        }
        else {
            Enternumber = jtxtDisplay.getText() + jButton7.getText();
            jtxtDisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        String Enternumber=jtxtDisplay.getText();
        if (Enternumber == " ")
        {
            jtxtDisplay.setText(jButton8.getText());
        }
        else {
            Enternumber = jtxtDisplay.getText() + jButton8.getText();
            jtxtDisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        String Enternumber=jtxtDisplay.getText();
        if (Enternumber == " ")
        {
            jtxtDisplay.setText(jButton9.getText());
        }
        else {
            Enternumber = jtxtDisplay.getText() + jButton9.getText();
            jtxtDisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        String Enternumber=jtxtDisplay.getText();
        if (Enternumber == " ")
        {
            jtxtDisplay.setText(jButton10.getText());
        }
        else {
            Enternumber = jtxtDisplay.getText() + jButton10.getText();
            jtxtDisplay.setText(Enternumber);
        } 
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        jtxtDisplay.setText("");
        jtxtChange.setText("");

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        if(! jtxtDisplay.getText().contains("."))
        {
        jtxtDisplay.setText(jtxtDisplay.getText()+ jButton12.getText());
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        double PriceOfItem = 250.00;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow (new Object[]{"Product 2","1",PriceOfItem});
        Itemcost();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        double PriceOfItem = 150.00;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow (new Object[]{"Product 1","1",PriceOfItem});
        Itemcost();
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        double PriceOfItem = 200.00;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow (new Object[]{"Product 3","1",PriceOfItem});
        Itemcost();
        
        
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
        double PriceOfItem = 450.00;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow (new Object[]{"Product 4","1",PriceOfItem});
        Itemcost();
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
        double PriceOfItem = 510.00;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow (new Object[]{"Product 6","1",PriceOfItem});
        Itemcost();
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
        double PriceOfItem = 275.00;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow (new Object[]{"Product 5","1",PriceOfItem});
        Itemcost();
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
        double PriceOfItem = 550.00;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow (new Object[]{"Product 7","1",PriceOfItem});
        Itemcost();
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
        double PriceOfItem = 450.00;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow (new Object[]{"Product 8","1",PriceOfItem});
        Itemcost();
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
        double PriceOfItem = 100.00;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow (new Object[]{"Product 9","1",PriceOfItem});
        Itemcost();
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
        double PriceOfItem = 470.00;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow (new Object[]{"Product 10","1",PriceOfItem});
        Itemcost();
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
        double PriceOfItem = 475.00;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow (new Object[]{"Product 11","1",PriceOfItem});
        Itemcost();
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
         double PriceOfItem = 625.00;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow (new Object[]{"Product 12","1",PriceOfItem});
        Itemcost();
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // TODO add your handling code here:
        double PriceOfItem = 320.00;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow (new Object[]{"Product 17","1",PriceOfItem});
        Itemcost();
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:
        double PriceOfItem = 500.00;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow (new Object[]{"Product 14","1",PriceOfItem});
        Itemcost();
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // TODO add your handling code here:
        double PriceOfItem = 1150.00;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow (new Object[]{"Product 18","1",PriceOfItem});
        Itemcost();
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // TODO add your handling code here:
        double PriceOfItem = 800.00;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow (new Object[]{"Product 16","1",PriceOfItem});
        Itemcost();
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
        double PriceOfItem = 50.00;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow (new Object[]{"Product 13","1",PriceOfItem});
        Itemcost();
      
        
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        // TODO add your handling code here:
        double PriceOfItem = 850.00;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow (new Object[]{"Product 15","1",PriceOfItem});
        Itemcost();
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        // TODO add your handling code here:
        double PriceOfItem = 1200.00;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow (new Object[]{"Product 21","1",PriceOfItem});
        Itemcost();
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        // TODO add your handling code here:
        double PriceOfItem = 180.00;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow (new Object[]{"Product 23","1",PriceOfItem});
        Itemcost();
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        // TODO add your handling code here:
        double PriceOfItem = 670.00;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow (new Object[]{"Product 20","1",PriceOfItem});
        Itemcost();
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        // TODO add your handling code here:
        double PriceOfItem = 900.00;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow (new Object[]{"Product 22","1",PriceOfItem});
        Itemcost();
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        // TODO add your handling code here:
        double PriceOfItem = 220.00;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow (new Object[]{"Product 24","1",PriceOfItem});
        Itemcost();
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        // TODO add your handling code here:
        double PriceOfItem = 120.00;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow (new Object[]{"Product 19","1",PriceOfItem});
        Itemcost();
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jPayamentMethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPayamentMethodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPayamentMethodActionPerformed

    private void jtxtDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDisplayActionPerformed

    private void jtxtSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSubTotalActionPerformed
private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        // TODO add your handling code here:
       frame = new JFrame ("Exit");
       if (JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Point of sale",
               JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
       {
           System.exit(0);
       }
        
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPayActionPerformed
        // TODO add your handling code here:
        if(jPayamentMethod.getSelectedItem().equals("Cash"))
        {
            Change();
        }
        else
        {
                jtxtChange.setText("");
                jtxtDisplay.setText("");
        }
    }//GEN-LAST:event_jbtnPayActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        jtxtChange.setText("");
        jtxtDiscount.setText("");
        jtxtTotal.setText("");
        jtxtSubTotal.setText("");
        jtxtDisplay.setText("");
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrintActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat ("Thisakaran Rasalingam,Dalugama,Kelaniya");
        MessageFormat footer = new MessageFormat ("Page {0,number,integer}");
        
        try 
        {
            jTable1.print(JTable.PrintMode.NORMAL,header,footer);
        }
        
        catch (java.awt.print.PrinterException e)
        {
            System.err.format("No Printer Found", e.getMessage());
        }
        
    }//GEN-LAST:event_jbtnPrintActionPerformed

    private void jbtnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemoveActionPerformed
        // TODO add your handling code here:
        
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    int RemoveItem = jTable1.getSelectedRow();
    if( RemoveItem >= 0)
    {
        model.removeRow(RemoveItem);
    }
    
    Itemcost();
    
    if(jPayamentMethod.getSelectedItem().equals("Cash"))
        {
            Change();
        }
        else
        {
                jtxtChange.setText("");
                jtxtDisplay.setText("");
        }
    }//GEN-LAST:event_jbtnRemoveActionPerformed

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
            java.util.logging.Logger.getLogger(JavaPosSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaPosSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaPosSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaPosSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaPosSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JComboBox<String> jPayamentMethod;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnPay;
    private javax.swing.JButton jbtnPrint;
    private javax.swing.JButton jbtnRemove;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JTextField jtxtChange;
    private javax.swing.JTextField jtxtDiscount;
    private javax.swing.JTextField jtxtDisplay;
    private javax.swing.JTextField jtxtSubTotal;
    private javax.swing.JTextField jtxtTotal;
    // End of variables declaration//GEN-END:variables
}
