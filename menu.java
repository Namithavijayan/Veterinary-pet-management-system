package com.mycompany.pet;


import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;

import java.util.Vector;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;







/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author swath
 */
public class menu extends javax.swing.JFrame {

    Connection con=null;
    PreparedStatement Save;
    ResultSet rs=null;
    Statement st;
    public menu() {
        initComponents();
        DisplayCustomer();
        saleDisplayCustomer();
        vaccineDisplayCustomer();
    }
private void DisplayCustomer()
{
    try
    {
        con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pet_management","root","Jan06012023");
        Statement t=con.createStatement();
        rs=t.executeQuery("select * from registers");
        register_table.setModel(DbUtils.resultSetToTableModel(rs));
        
        
    }
    catch(Exception e)
    {
    }
    
}
private void saleDisplayCustomer()
{
    try
    {
        con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pet_management","root","Jan06012023");
        Statement t=con.createStatement();
        rs=t.executeQuery("select * from sales");
        sales_table.setModel(DbUtils.resultSetToTableModel(rs));
        
        
    }
    catch(Exception e)
    {
    }
    
}
private void vaccineDisplayCustomer()
{
    try
    {
        con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pet_management","root","Jan06012023");
        Statement t=con.createStatement();
        rs=t.executeQuery("select * from vaccine");
        vaccine_table.setModel(DbUtils.resultSetToTableModel(rs));
        
        
    }
    catch(Exception e)
    {
    }
    
}
void update_table() throws SQLException{
    rs=Save.executeQuery("select * from registers");
    register_table.setModel(DbUtils.resultSetToTableModel(rs));
}
void update_sales_table() throws SQLException{
    rs=Save.executeQuery("select * from sales");
    sales_table.setModel(DbUtils.resultSetToTableModel(rs));
}

void update_vaccine_table() throws SQLException{
    rs=Save.executeQuery("select * from vaccine");
    vaccine_table.setModel(DbUtils.resultSetToTableModel(rs));
}

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        tab4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tab3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tab5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tab2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tab1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jimp = new javax.swing.JPanel();
        jp1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        vaccination = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        vregno = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        vaccine_table = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        status = new javax.swing.JTextField();
        next_date = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        v_edit = new javax.swing.JButton();
        v_save = new javax.swing.JButton();
        manage = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        regno = new javax.swing.JTextField();
        category = new javax.swing.JTextField();
        breed = new javax.swing.JTextField();
        owner = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        register_table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        sale = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        sregno = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        sales_table = new javax.swing.JTable();
        sbreed = new javax.swing.JTextField();
        scategory = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        scontact = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("menu");
        setName("menu"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(32, 82, 92));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tab4.setBackground(new java.awt.Color(153, 153, 153));
        tab4.setPreferredSize(new java.awt.Dimension(158, 43));
        tab4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab4MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tekton Pro", 1, 20)); // NOI18N
        jLabel4.setText("VACCINATION");

        javax.swing.GroupLayout tab4Layout = new javax.swing.GroupLayout(tab4);
        tab4.setLayout(tab4Layout);
        tab4Layout.setHorizontalGroup(
            tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tab4Layout.setVerticalGroup(
            tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jPanel1.add(tab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 374, 191, -1));

        tab3.setBackground(new java.awt.Color(153, 153, 153));
        tab3.setPreferredSize(new java.awt.Dimension(158, 43));
        tab3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab3MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tekton Pro", 1, 20)); // NOI18N
        jLabel3.setText("    PET SALE");

        javax.swing.GroupLayout tab3Layout = new javax.swing.GroupLayout(tab3);
        tab3.setLayout(tab3Layout);
        tab3Layout.setHorizontalGroup(
            tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        tab3Layout.setVerticalGroup(
            tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel1.add(tab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 319, 191, -1));

        tab5.setBackground(new java.awt.Color(153, 153, 153));
        tab5.setPreferredSize(new java.awt.Dimension(158, 43));
        tab5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab5MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tekton Pro", 1, 20)); // NOI18N
        jLabel5.setText("LOGOUT");

        javax.swing.GroupLayout tab5Layout = new javax.swing.GroupLayout(tab5);
        tab5.setLayout(tab5Layout);
        tab5Layout.setHorizontalGroup(
            tab5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab5Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tab5Layout.setVerticalGroup(
            tab5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jPanel1.add(tab5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 429, 191, -1));

        tab2.setBackground(new java.awt.Color(153, 153, 153));
        tab2.setPreferredSize(new java.awt.Dimension(158, 43));
        tab2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab2MouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tekton Pro", 1, 20)); // NOI18N
        jLabel2.setText("      PET DETAILS");

        javax.swing.GroupLayout tab2Layout = new javax.swing.GroupLayout(tab2);
        tab2.setLayout(tab2Layout);
        tab2Layout.setHorizontalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tab2Layout.setVerticalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(tab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 258, 191, -1));

        tab1.setBackground(new java.awt.Color(153, 153, 153));
        tab1.setPreferredSize(new java.awt.Dimension(158, 43));
        tab1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tekton Pro", 1, 20)); // NOI18N
        jLabel1.setText("          HOME");

        javax.swing.GroupLayout tab1Layout = new javax.swing.GroupLayout(tab1);
        tab1.setLayout(tab1Layout);
        tab1Layout.setHorizontalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tab1Layout.setVerticalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel1.add(tab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 203, 189, -1));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("    HOSPITAL");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 140, -1));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("VETERINARY");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 140, 29));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 142, 200, 20));

        jimp.setBackground(new java.awt.Color(0, 51, 51));
        jimp.setRequestFocusEnabled(isVisible());
        jimp.setLayout(new java.awt.CardLayout());

        jp1.setBackground(new java.awt.Color(55, 171, 165));
        jp1.setPreferredSize(new java.awt.Dimension(624, 529));

        jLabel8.setFont(new java.awt.Font("Vivaldi", 0, 24)); // NOI18N
        jLabel8.setText("-Anatole France");

        jLabel14.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel14.setText("\"Until one has loved an animal,             ");

        jLabel21.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel21.setText("a part of one's soul remains unawakened\"");

        javax.swing.GroupLayout jp1Layout = new javax.swing.GroupLayout(jp1);
        jp1.setLayout(jp1Layout);
        jp1Layout.setHorizontalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp1Layout.createSequentialGroup()
                .addContainerGap(321, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
            .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp1Layout.createSequentialGroup()
                    .addContainerGap(166, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(104, 104, 104)))
            .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp1Layout.createSequentialGroup()
                    .addContainerGap(254, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(35, 35, 35)))
        );
        jp1Layout.setVerticalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp1Layout.createSequentialGroup()
                .addContainerGap(517, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
            .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp1Layout.createSequentialGroup()
                    .addContainerGap(375, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(218, 218, 218)))
            .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp1Layout.createSequentialGroup()
                    .addContainerGap(440, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(153, 153, 153)))
        );

        jimp.add(jp1, "card2");

        vaccination.setBackground(new java.awt.Color(55, 171, 165));
        vaccination.setPreferredSize(new java.awt.Dimension(600, 460));

        jLabel12.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel12.setText("VACCINATION STATUS");

        jSeparator5.setForeground(new java.awt.Color(51, 0, 51));

        jLabel13.setFont(new java.awt.Font("Tekton Pro", 1, 14)); // NOI18N
        jLabel13.setText("STATUS");

        vregno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vregnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        vaccine_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "REG NO", "STATUS", "NEXT VACCINATION DATE"
            }
        ));
        vaccine_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vaccine_tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(vaccine_table);

        jLabel19.setFont(new java.awt.Font("Tekton Pro", 1, 14)); // NOI18N
        jLabel19.setText("REG NO");

        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });

        next_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_dateActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tekton Pro", 1, 14)); // NOI18N
        jLabel20.setText("NEXT DATE");

        v_edit.setBackground(new java.awt.Color(153, 153, 153));
        v_edit.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        v_edit.setText("EDIT");
        v_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v_editMouseClicked(evt);
            }
        });
        v_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_editActionPerformed(evt);
            }
        });

        v_save.setBackground(new java.awt.Color(153, 153, 153));
        v_save.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        v_save.setText("SAVE");
        v_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout vaccinationLayout = new javax.swing.GroupLayout(vaccination);
        vaccination.setLayout(vaccinationLayout);
        vaccinationLayout.setHorizontalGroup(
            vaccinationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator5)
            .addGroup(vaccinationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vaccinationLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(v_save, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(v_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228))
            .addGroup(vaccinationLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(vaccinationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vregno, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(vaccinationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vaccinationLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(vaccinationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(vaccinationLayout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 45, Short.MAX_VALUE))
                            .addGroup(vaccinationLayout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(vaccinationLayout.createSequentialGroup()
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(next_date, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))))
            .addGroup(vaccinationLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        vaccinationLayout.setVerticalGroup(
            vaccinationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vaccinationLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(vaccinationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel13)
                    .addComponent(jLabel20))
                .addGroup(vaccinationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vaccinationLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(vaccinationLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(vaccinationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vregno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(next_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(vaccinationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vaccinationLayout.createSequentialGroup()
                        .addComponent(v_save, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(v_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jimp.add(vaccination, "card3");

        manage.setBackground(new java.awt.Color(55, 171, 165));
        manage.setPreferredSize(new java.awt.Dimension(624, 529));

        jLabel9.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel9.setText("MANAGE PETS");

        jLabel10.setFont(new java.awt.Font("Tekton Pro", 1, 14)); // NOI18N
        jLabel10.setText("CATEGORY");

        regno.setName("regno"); // NOI18N
        regno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regnoActionPerformed(evt);
            }
        });

        category.setName("category"); // NOI18N
        category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryActionPerformed(evt);
            }
        });

        breed.setName("breed"); // NOI18N
        breed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                breedActionPerformed(evt);
            }
        });

        owner.setName("owner"); // NOI18N

        contact.setName("contact"); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tekton Pro", 1, 14)); // NOI18N
        jLabel15.setText("REG NO");

        jLabel16.setFont(new java.awt.Font("Tekton Pro", 1, 14)); // NOI18N
        jLabel16.setText("OWNER NAME");

        jLabel17.setFont(new java.awt.Font("Tekton Pro", 1, 14)); // NOI18N
        jLabel17.setText("CONTACT");

        jLabel18.setFont(new java.awt.Font("Tekton Pro", 1, 14)); // NOI18N
        jLabel18.setText("BREED");

        jSeparator3.setForeground(new java.awt.Color(0, 0, 51));

        register_table.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 153)));
        register_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "REG NO", "CATEGORY", "BREED", "OWNER NAME", "CONTACT"
            }
        ));
        register_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                register_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(register_table);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tekton Pro", 1, 14)); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Tekton Pro", 1, 14)); // NOI18N
        jButton2.setText("EDIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Tekton Pro", 1, 14)); // NOI18N
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout manageLayout = new javax.swing.GroupLayout(manage);
        manage.setLayout(manageLayout);
        manageLayout.setHorizontalGroup(
            manageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addGroup(manageLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(manageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageLayout.createSequentialGroup()
                        .addGroup(manageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(manageLayout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(manageLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel15)
                                .addGap(67, 67, 67)
                                .addComponent(jLabel10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageLayout.createSequentialGroup()
                                .addComponent(regno, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(manageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(breed, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(manageLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel18))
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(manageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(owner, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(manageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(manageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        manageLayout.setVerticalGroup(
            manageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(manageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel18)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(manageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(breed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(owner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(manageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jimp.add(manage, "card5");

        sale.setBackground(new java.awt.Color(55, 171, 165));
        sale.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sale.setPreferredSize(new java.awt.Dimension(624, 529));

        jLabel11.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel11.setText("PETS  FOR  SALE");

        jSeparator4.setForeground(new java.awt.Color(0, 51, 51));

        jLabel22.setFont(new java.awt.Font("Tekton Pro", 1, 14)); // NOI18N
        jLabel22.setText("REG NO");

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tekton Pro", 1, 14)); // NOI18N
        jLabel23.setText("SEARCH");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(jLabel23))
        );

        sales_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "REG NO", "CATEGORY", "BREED", "CONTACT"
            }
        ));
        sales_table.setName("sales_table"); // NOI18N
        jScrollPane2.setViewportView(sales_table);

        scategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scategoryActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tekton Pro", 1, 14)); // NOI18N
        jLabel24.setText("BREED");

        jLabel25.setFont(new java.awt.Font("Tekton Pro", 1, 14)); // NOI18N
        jLabel25.setText("CONTACT");

        jLabel26.setFont(new java.awt.Font("Tekton Pro", 1, 14)); // NOI18N
        jLabel26.setText("CATEGORY");

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tekton Pro", 1, 14)); // NOI18N
        jLabel27.setText("SAVE");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel27)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel27))
        );

        javax.swing.GroupLayout saleLayout = new javax.swing.GroupLayout(sale);
        sale.setLayout(saleLayout);
        saleLayout.setHorizontalGroup(
            saleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saleLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(saleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(saleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(saleLayout.createSequentialGroup()
                        .addGroup(saleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sregno, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(saleLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel22)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(saleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, saleLayout.createSequentialGroup()
                                .addGroup(saleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(scategory, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26))
                                .addGap(46, 46, 46)
                                .addGroup(saleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sbreed, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24))
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, saleLayout.createSequentialGroup()
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)))
                        .addGroup(saleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scontact, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addGap(39, 39, 39))
                    .addComponent(jSeparator4)
                    .addGroup(saleLayout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );
        saleLayout.setVerticalGroup(
            saleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saleLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(saleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel22)
                    .addComponent(jLabel26))
                .addGap(20, 20, 20)
                .addGroup(saleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sregno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sbreed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(saleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(saleLayout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jimp.add(sale, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jimp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jimp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tab1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab1MouseClicked
      
         jp1.setVisible(true);
         manage.setVisible(false);
         sale.setVisible(false);
         vaccination.setVisible(false);
         tab1.setBackground(Color.WHITE);
         tab2.setBackground(Color.gray);
         tab3.setBackground(Color.gray);
         tab4.setBackground(Color.gray);
         
       // TODO add your handling code here:
    }//GEN-LAST:event_tab1MouseClicked

    private void tab2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab2MouseClicked
       manage.setVisible(true);
         jp1.setVisible(false);
         sale.setVisible(false);
         vaccination.setVisible(false);
         tab2.setBackground(Color.WHITE);
         tab1.setBackground(Color.gray);
         tab3.setBackground(Color.gray);
         tab4.setBackground(Color.gray);
         
         // TODO add your handling code here:
    }//GEN-LAST:event_tab2MouseClicked

    private void tab3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab3MouseClicked
         sale.setVisible(true);
         manage.setVisible(false);
         jp1.setVisible(false);
         vaccination.setVisible(false);    
          tab3.setBackground(Color.WHITE);
         tab2.setBackground(Color.gray);
         tab1.setBackground(Color.gray);
         tab4.setBackground(Color.gray);
         
           



// TODO add your handling code here:
    }//GEN-LAST:event_tab3MouseClicked

    private void tab4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab4MouseClicked
         vaccination.setVisible(true);
         manage.setVisible(false);
         sale.setVisible(false);
         jp1.setVisible(false);
         tab4.setBackground(Color.WHITE);
         tab2.setBackground(Color.gray);
         tab3.setBackground(Color.gray);
         tab1.setBackground(Color.gray);
         
         // TODO add your handling code here:
    }//GEN-LAST:event_tab4MouseClicked

    private void regnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regnoActionPerformed

    private void vregnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vregnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vregnoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     if(regno.getText().isEmpty()||category.getText().isEmpty()||breed.getText().isEmpty()||owner.getText().isEmpty()||contact.getText().isEmpty())
    {
            JOptionPane.showMessageDialog(this, "MIssing information");
    }
     else
     {
         try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pet_management","root","Jan06012023");
            Save=(PreparedStatement)con.prepareStatement("insert into registers values(?,?,?,?,?)");
  
            Save.setString(1, regno.getText());
            Save.setString(2, category.getText());
            Save.setString(3, breed.getText());
            Save.setString(4, owner.getText());
            Save.setString(5, contact.getText());
            int row =Save .executeUpdate();
            update_table();
        
            JOptionPane.showMessageDialog(this, "Customer Added");
            con.close();
            clear();
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(this, e);
             
         }
     }    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void breedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_breedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_breedActionPerformed

    private void categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryActionPerformed
    private void clear()
    {
        regno.setText("");
        category.setText("");
        breed.setText("");
        owner.setText("");
        contact.setText("");
    }
    private void sclear()
    {
        sregno.setText("");
        scategory.setText("");
        sbreed.setText("");
        scontact.setText("");
    }
    private void vclear()
    {
        vregno.setText("");
        status.setText("");
        next_date.setText("");
        
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(regno.getText().isEmpty()||category.getText().isEmpty()||breed.getText().isEmpty()||owner.getText().isEmpty()||contact.getText().isEmpty())
    {
            JOptionPane.showMessageDialog(this, "MIssing information");
    }
     else
     {
         try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pet_management","root","Jan06012023");
            Save=(PreparedStatement)con.prepareStatement("update registers set category=?,breed=?,owner=?,contact=? where regno=?");
  
            Save.setInt(5, key);
            Save.setString(1, category.getText());
            Save.setString(2, breed.getText());
            Save.setString(3, owner.getText());
            Save.setString(4, contact.getText());
            int row =Save .executeUpdate();
            update_table();
            
        
            JOptionPane.showMessageDialog(this, "Customer Updated");
            con.close();
            clear();
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(this, e);
             
         }
     }    
    }//GEN-LAST:event_jButton2ActionPerformed
int key=0;
    private void register_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_tableMouseClicked
        DefaultTableModel model=(DefaultTableModel) register_table.getModel();
        int myIndex=register_table.getSelectedRow();
        key=Integer.valueOf(model.getValueAt(myIndex,0).toString());
        regno.setText(model.getValueAt(myIndex,0).toString());
        category.setText(model.getValueAt(myIndex,1).toString());
        breed.setText(model.getValueAt(myIndex,2).toString());
        owner.setText(model.getValueAt(myIndex,3).toString());
        contact.setText(model.getValueAt(myIndex,4).toString());
        
        
    }//GEN-LAST:event_register_tableMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         if(key==0)
    {
            JOptionPane.showMessageDialog(this, "Select a valid data");
    }
     else
     {
         try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pet_management","root","Jan06012023");
            
            Save=(PreparedStatement)con.prepareStatement("delete from vaccine where regno=?");
  
            Save.setInt(1, key);
            
            int row =Save .executeUpdate();
            update_vaccine_table();
            Save=(PreparedStatement)con.prepareStatement("delete from sales where regno=?");
  
            Save.setInt(1, key);
            
            int row1 =Save .executeUpdate();
            update_sales_table();
            Save=(PreparedStatement)con.prepareStatement("delete from registers where regno=?");
  
            Save.setInt(1, key);
            
            int row2 =Save .executeUpdate();
            update_table();
            
        
            JOptionPane.showMessageDialog(this, "Data Deleted");
            con.close();
            clear();
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(this, e);
             
         }
     }    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void scategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scategoryActionPerformed

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
         if(sregno.getText().isEmpty()||scategory.getText().isEmpty()||sbreed.getText().isEmpty()||scontact.getText().isEmpty())
    {
            JOptionPane.showMessageDialog(this, "Missing information");
    }
     else
     {
         try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pet_management","root","Jan06012023");
            Save=(PreparedStatement)con.prepareStatement("insert into sales values(?,?,?,?)");
  
            Save.setString(1, sregno.getText());
            Save.setString(2, scategory.getText());
            Save.setString(3, sbreed.getText());
            Save.setString(4, scontact.getText());
            int row =Save .executeUpdate();
            update_sales_table();
        
            JOptionPane.showMessageDialog(this, "Sale Added");
            con.close();
            sclear();
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(this, e);
             
         }
     }    
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        try
        {
        if(scategory.getText().isEmpty())
    {
            JOptionPane.showMessageDialog(this, "Enter a category");
    } 
        String tf=scategory.getText();
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pet_management","root","Jan06012023");
        PreparedStatement pst=con.prepareStatement("select * from sales where category like '%"+tf+"%'");
        //pst.setString(1, scategory.getText());
        ResultSet rs=pst.executeQuery();
        
        
    sales_table.setModel(DbUtils.resultSetToTableModel(rs));
    sclear();
        }
      catch(Exception e)
           {
              
            }
    }//GEN-LAST:event_jPanel6MouseClicked

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void next_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_next_dateActionPerformed

    private void v_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_saveActionPerformed
        if(vregno.getText().isEmpty()||status.getText().isEmpty()||next_date.getText().isEmpty())
    {
            JOptionPane.showMessageDialog(this, "Missing information");
    }
     else
     {
         try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pet_management","root","Jan06012023");
            Save=(PreparedStatement)con.prepareStatement("insert into vaccine values(?,?,?)");
  
            Save.setString(1, vregno.getText());
            Save.setString(2, status.getText());
            Save.setString(3, next_date.getText());
            int row =Save .executeUpdate();
            update_vaccine_table();
        
            JOptionPane.showMessageDialog(this, "Sale Added");
            con.close();
            vclear();
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(this, e);
             
         }
     }    
    }//GEN-LAST:event_v_saveActionPerformed

    private void v_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v_editMouseClicked
        if(vregno.getText().isEmpty()||status.getText().isEmpty()||next_date.getText().isEmpty())
    {
            JOptionPane.showMessageDialog(this, "MIssing information");
    }
     else
     {
         try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pet_management","root","Jan06012023");
            Save=(PreparedStatement)con.prepareStatement("update vaccine set status=?,next_date=? where regno=?");
  
            Save.setInt(3, key);
            Save.setString(1, status.getText());
            Save.setString(2, next_date.getText());
            int row =Save .executeUpdate();
            update_vaccine_table();
            
        
            JOptionPane.showMessageDialog(this, "Vaccination Status Updated");
            con.close();
            clear();
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(this, e);
             
         }
     }    
    }//GEN-LAST:event_v_editMouseClicked

    private void tab5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab5MouseClicked
         login m=new login();
                m.show();
                dispose();
    }//GEN-LAST:event_tab5MouseClicked

    private void v_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_editActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v_editActionPerformed

    private void vaccine_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vaccine_tableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) vaccine_table.getModel();
        int myIndex=vaccine_table.getSelectedRow();
        key=Integer.valueOf(model.getValueAt(myIndex,0).toString());
        vregno.setText(model.getValueAt(myIndex,0).toString());
        status.setText(model.getValueAt(myIndex,1).toString());
        next_date.setText(model.getValueAt(myIndex,2).toString());
        
        
    }//GEN-LAST:event_vaccine_tableMouseClicked

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField breed;
    private javax.swing.JTextField category;
    private javax.swing.JTextField contact;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPanel jimp;
    private javax.swing.JPanel jp1;
    private javax.swing.JPanel manage;
    private javax.swing.JTextField next_date;
    private javax.swing.JTextField owner;
    private javax.swing.JTable register_table;
    private javax.swing.JTextField regno;
    private javax.swing.JPanel sale;
    private javax.swing.JTable sales_table;
    private javax.swing.JTextField sbreed;
    private javax.swing.JTextField scategory;
    private javax.swing.JTextField scontact;
    private javax.swing.JTextField sregno;
    private javax.swing.JTextField status;
    private javax.swing.JPanel tab1;
    private javax.swing.JPanel tab2;
    private javax.swing.JPanel tab3;
    private javax.swing.JPanel tab4;
    private javax.swing.JPanel tab5;
    private javax.swing.JButton v_edit;
    private javax.swing.JButton v_save;
    private javax.swing.JPanel vaccination;
    private javax.swing.JTable vaccine_table;
    private javax.swing.JTextField vregno;
    // End of variables declaration//GEN-END:variables

    private static class DbUtils {
        public static TableModel resultSetToTableModel(ResultSet rs) {
        try {
            ResultSetMetaData metaData = rs.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            Vector columnNames = new Vector();

            // Get the column names
            for (int column = 0; column < numberOfColumns; column++) {
                columnNames.addElement(metaData.getColumnLabel(column + 1));
            }

            // Get all rows.
            Vector rows = new Vector();

            while (rs.next()) {
                Vector newRow = new Vector();

                for (int i = 1; i <= numberOfColumns; i++) {
                    newRow.addElement(rs.getObject(i));
                }

                rows.addElement(newRow);
            }

            return new DefaultTableModel(rows, columnNames);
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }

       
    }
}
