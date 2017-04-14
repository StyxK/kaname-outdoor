package GUI;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import Model.*;
import defult.ConnectDB;
import static java.awt.event.MouseEvent.MOUSE_CLICKED;
import java.sql.*;
import java.nio.charset.StandardCharsets;
import KanameException.*;
public class map extends javax.swing.JFrame {
    private String localWarn = "กรุณาใส่ชื่อสถานที่ตรงนี้";
    public map() {
        initComponents();
        ImageIcon i= new ImageIcon("D:\\kaname-outdoor\\pic\\iconImage.png");
        setIconImage(i.getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        locaPa1 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        locaPa1_2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        locaPa2 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        locaPa3 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        locaPa4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        locaPa5 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        locaPa6 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        locaPa7 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        locaPa8 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        locaPa9 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        locaPa10 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        locaPa11 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        locaPa12 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        locaPa13 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        locaPa14 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        locaPa15 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        locaPa16 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        locaPa17 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        locaPa18 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        locaPa19 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        locaPa20 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        locaPa21 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        locaPa22 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        locaPa23 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        locaPa24 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        locaPa25 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        locaPa25_2 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        locaPa26 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        locaPa27 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        locaPa28 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        locaPa29 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        locaPa30 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        locaPa31 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        locaPa32 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        locaPa33 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        locaPa34 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        locaPa35 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        locaPa36 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        locaPa37 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        locaPa38 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        locaPa39 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        locaPa40 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        locaPa41 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        locaPa42 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        locaPa43 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        locaPa44 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        locaPa45 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        locaPa45_2 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        locaPa46 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        locaPa47 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        locaPa48 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        locaPa49 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        locaPa50 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        locaPa51 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        locaBtn1 = new javax.swing.JButton();
        locaBtn1_2 = new javax.swing.JButton();
        locaBtn2 = new javax.swing.JButton();
        locaBtn3 = new javax.swing.JButton();
        locaBtn4 = new javax.swing.JButton();
        locaBtn5 = new javax.swing.JButton();
        locaBtn6 = new javax.swing.JButton();
        locaBtn7 = new javax.swing.JButton();
        locaBtn8 = new javax.swing.JButton();
        locaBtn9 = new javax.swing.JButton();
        locaBtn10 = new javax.swing.JButton();
        locaBtn11 = new javax.swing.JButton();
        locaBtn12 = new javax.swing.JButton();
        locaBtn13 = new javax.swing.JButton();
        locaBtn14 = new javax.swing.JButton();
        locaBtn15 = new javax.swing.JButton();
        locaBtn16 = new javax.swing.JButton();
        locaBtn17 = new javax.swing.JButton();
        locaBtn18 = new javax.swing.JButton();
        locaBtn19 = new javax.swing.JButton();
        locaBtn20 = new javax.swing.JButton();
        locaBtn21 = new javax.swing.JButton();
        locaBtn22 = new javax.swing.JButton();
        locaBtn23 = new javax.swing.JButton();
        locaBtn24 = new javax.swing.JButton();
        locaBtn25 = new javax.swing.JButton();
        locaBtn25_2 = new javax.swing.JButton();
        locaBtn26 = new javax.swing.JButton();
        locaBtn27 = new javax.swing.JButton();
        locaBtn28 = new javax.swing.JButton();
        locaBtn29 = new javax.swing.JButton();
        locaBtn30 = new javax.swing.JButton();
        locaBtn31 = new javax.swing.JButton();
        locaBtn32 = new javax.swing.JButton();
        locaBtn33 = new javax.swing.JButton();
        locaBtn34 = new javax.swing.JButton();
        locaBtn35 = new javax.swing.JButton();
        locaBtn36 = new javax.swing.JButton();
        locaBtn37 = new javax.swing.JButton();
        locaBtn38 = new javax.swing.JButton();
        locaBtn39 = new javax.swing.JButton();
        locaBtn40 = new javax.swing.JButton();
        locaBtn41 = new javax.swing.JButton();
        locaBtn42 = new javax.swing.JButton();
        locaBtn43 = new javax.swing.JButton();
        locaBtn44 = new javax.swing.JButton();
        locaBtn45 = new javax.swing.JButton();
        locaBtn45_2 = new javax.swing.JButton();
        locaBtn46 = new javax.swing.JButton();
        locaBtn47 = new javax.swing.JButton();
        locaBtn48 = new javax.swing.JButton();
        locaBtn49 = new javax.swing.JButton();
        locaBtn50 = new javax.swing.JButton();
        locaBtn51 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("map");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(255, 255, 102));
        jTextField1.setText((localWarn));
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 5, true));
        jTextField1.setForeground(Color.GRAY);
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 460, 180, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 102));
        jButton1.setText("Search");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 3, true));
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
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, 80, 30));

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel55.setText("ประตูทางเข้ามหาวิทยาลัย");

        javax.swing.GroupLayout locaPa1Layout = new javax.swing.GroupLayout(locaPa1);
        locaPa1.setLayout(locaPa1Layout);
        locaPa1Layout.setHorizontalGroup(
            locaPa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel55)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa1Layout.setVerticalGroup(
            locaPa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa1Layout.createSequentialGroup()
                .addComponent(jLabel55)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, -1, 30));
        locaPa1.setVisible(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("ประตูทางเข้ามหาวิยาลัย");

        javax.swing.GroupLayout locaPa1_2Layout = new javax.swing.GroupLayout(locaPa1_2);
        locaPa1_2.setLayout(locaPa1_2Layout);
        locaPa1_2Layout.setHorizontalGroup(
            locaPa1_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa1_2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa1_2Layout.setVerticalGroup(
            locaPa1_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa1_2Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa1_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 30));
        locaPa1_2.setVisible(false);

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel36.setText("พระบรมราชานุเสาวรีย์ ร.4");

        javax.swing.GroupLayout locaPa2Layout = new javax.swing.GroupLayout(locaPa2);
        locaPa2.setLayout(locaPa2Layout);
        locaPa2Layout.setHorizontalGroup(
            locaPa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel36)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa2Layout.setVerticalGroup(
            locaPa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa2Layout.createSequentialGroup()
                .addComponent(jLabel36)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, -1, 30));
        locaPa2.setVisible(false);

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel35.setText("สวนเฉลิมพระเกียรติฯ");

        javax.swing.GroupLayout locaPa3Layout = new javax.swing.GroupLayout(locaPa3);
        locaPa3.setLayout(locaPa3Layout);
        locaPa3Layout.setHorizontalGroup(
            locaPa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel35)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa3Layout.setVerticalGroup(
            locaPa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa3Layout.createSequentialGroup()
                .addComponent(jLabel35)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, -1, 30));
        locaPa3.setVisible(false);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("อาคารสัมมนา / โรงเรียนดรุณศึกษาลัย (SN)");

        javax.swing.GroupLayout locaPa4Layout = new javax.swing.GroupLayout(locaPa4);
        locaPa4.setLayout(locaPa4Layout);
        locaPa4Layout.setHorizontalGroup(
            locaPa4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa4Layout.setVerticalGroup(
            locaPa4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa4Layout.createSequentialGroup()
                .addComponent(jLabel22)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, 30));
        locaPa4.setVisible(false);

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel37.setText("สวนสุขภาพ");

        javax.swing.GroupLayout locaPa5Layout = new javax.swing.GroupLayout(locaPa5);
        locaPa5.setLayout(locaPa5Layout);
        locaPa5Layout.setHorizontalGroup(
            locaPa5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel37)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa5Layout.setVerticalGroup(
            locaPa5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa5Layout.createSequentialGroup()
                .addComponent(jLabel37)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, -1));
        locaPa5.setVisible(false);

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel38.setText("ศูนย์ปฏิบัติการพัฒนาหุ่นยนต์ภาคสนาม (FI)");

        javax.swing.GroupLayout locaPa6Layout = new javax.swing.GroupLayout(locaPa6);
        locaPa6.setLayout(locaPa6Layout);
        locaPa6Layout.setHorizontalGroup(
            locaPa6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel38)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa6Layout.setVerticalGroup(
            locaPa6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa6Layout.createSequentialGroup()
                .addComponent(jLabel38)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, -1, -1));
        locaPa6.setVisible(false);

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel39.setText("สำนักงานเทคโนโลยี SMEs");

        javax.swing.GroupLayout locaPa7Layout = new javax.swing.GroupLayout(locaPa7);
        locaPa7.setLayout(locaPa7Layout);
        locaPa7Layout.setHorizontalGroup(
            locaPa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel39)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa7Layout.setVerticalGroup(
            locaPa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa7Layout.createSequentialGroup()
                .addComponent(jLabel39)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, -1));
        locaPa7.setVisible(false);

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel34.setText("อาคารวิศวกรรมเครื่องกล 1 (ME-1)");

        javax.swing.GroupLayout locaPa8Layout = new javax.swing.GroupLayout(locaPa8);
        locaPa8.setLayout(locaPa8Layout);
        locaPa8Layout.setHorizontalGroup(
            locaPa8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa8Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel34)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa8Layout.setVerticalGroup(
            locaPa8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa8Layout.createSequentialGroup()
                .addComponent(jLabel34)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, 30));
        locaPa8.setVisible(false);

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel33.setText("อาคารวิศวกรรมเครื่องกล 2 (ME-2)");

        javax.swing.GroupLayout locaPa9Layout = new javax.swing.GroupLayout(locaPa9);
        locaPa9.setLayout(locaPa9Layout);
        locaPa9Layout.setHorizontalGroup(
            locaPa9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa9Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel33)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa9Layout.setVerticalGroup(
            locaPa9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa9Layout.createSequentialGroup()
                .addComponent(jLabel33)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa9, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 229, -1, 30));
        locaPa9.setVisible(false);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setText("อาคารวิศวกรรมเครื่องมือและวัสดุ (TME)");

        javax.swing.GroupLayout locaPa10Layout = new javax.swing.GroupLayout(locaPa10);
        locaPa10.setLayout(locaPa10Layout);
        locaPa10Layout.setHorizontalGroup(
            locaPa10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa10Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa10Layout.setVerticalGroup(
            locaPa10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa10Layout.createSequentialGroup()
                .addComponent(jLabel25)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa10, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 230, -1, 30));
        locaPa10.setVisible(false);

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel32.setText("อาคารวิศวกรรมเครื่องกล 3 (ME-3)");

        javax.swing.GroupLayout locaPa11Layout = new javax.swing.GroupLayout(locaPa11);
        locaPa11.setLayout(locaPa11Layout);
        locaPa11Layout.setHorizontalGroup(
            locaPa11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa11Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel32)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa11Layout.setVerticalGroup(
            locaPa11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa11Layout.createSequentialGroup()
                .addComponent(jLabel32)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa11, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 250, -1, 30));
        locaPa11.setVisible(false);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setText("อาคารวิศวกรรมเครื่องกล 4 (ME-4)");

        javax.swing.GroupLayout locaPa12Layout = new javax.swing.GroupLayout(locaPa12);
        locaPa12.setLayout(locaPa12Layout);
        locaPa12Layout.setHorizontalGroup(
            locaPa12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa12Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa12Layout.setVerticalGroup(
            locaPa12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa12Layout.createSequentialGroup()
                .addComponent(jLabel23)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa12, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 280, -1, 30));
        locaPa12.setVisible(false);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("อาคารปฐพีกลศาสตร์ (CE-3)");

        javax.swing.GroupLayout locaPa13Layout = new javax.swing.GroupLayout(locaPa13);
        locaPa13.setLayout(locaPa13Layout);
        locaPa13Layout.setHorizontalGroup(
            locaPa13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa13Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa13Layout.setVerticalGroup(
            locaPa13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa13Layout.createSequentialGroup()
                .addComponent(jLabel24)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 263, -1, 30));
        locaPa13.setVisible(false);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("อาคารปฎิบัติการทางวิศวกรรมศาสตร์");

        javax.swing.GroupLayout locaPa14Layout = new javax.swing.GroupLayout(locaPa14);
        locaPa14.setLayout(locaPa14Layout);
        locaPa14Layout.setHorizontalGroup(
            locaPa14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa14Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa14Layout.setVerticalGroup(
            locaPa14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa14Layout.createSequentialGroup()
                .addComponent(jLabel21)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa14, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 280, -1, 30));
        locaPa14.setVisible(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("อาคารชลศาสตร์ (CE-4)");

        javax.swing.GroupLayout locaPa15Layout = new javax.swing.GroupLayout(locaPa15);
        locaPa15.setLayout(locaPa15Layout);
        locaPa15Layout.setHorizontalGroup(
            locaPa15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa15Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa15Layout.setVerticalGroup(
            locaPa15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa15Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa15, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 240, -1, 30));
        locaPa15.setVisible(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("อาคารหอพักนักศึกษา ชาย");

        javax.swing.GroupLayout locaPa16Layout = new javax.swing.GroupLayout(locaPa16);
        locaPa16.setLayout(locaPa16Layout);
        locaPa16Layout.setHorizontalGroup(
            locaPa16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa16Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa16Layout.setVerticalGroup(
            locaPa16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa16Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 272, -1, 30));
        locaPa16.setVisible(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("อาคารหอพักนักศึกษา หญิง");

        javax.swing.GroupLayout locaPa17Layout = new javax.swing.GroupLayout(locaPa17);
        locaPa17.setLayout(locaPa17Layout);
        locaPa17Layout.setHorizontalGroup(
            locaPa17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa17Layout.setVerticalGroup(
            locaPa17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa17Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, 30));
        locaPa17.setVisible(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("อาคารโรงประลองเทคโนโลยีและวัสดุ (EN)");

        javax.swing.GroupLayout locaPa18Layout = new javax.swing.GroupLayout(locaPa18);
        locaPa18.setLayout(locaPa18Layout);
        locaPa18Layout.setHorizontalGroup(
            locaPa18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa18Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa18Layout.setVerticalGroup(
            locaPa18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa18Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, 30));
        locaPa18.setVisible(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("อาคารเรียนและปฏิบัติการคณะพลังงานและวัสดุ (EN)");

        javax.swing.GroupLayout locaPa19Layout = new javax.swing.GroupLayout(locaPa19);
        locaPa19.setLayout(locaPa19Layout);
        locaPa19Layout.setHorizontalGroup(
            locaPa19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa19Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa19Layout.setVerticalGroup(
            locaPa19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa19Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 199, -1, 30));
        locaPa19.setVisible(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("ลานจอดรถนักศึกษา");

        javax.swing.GroupLayout locaPa20Layout = new javax.swing.GroupLayout(locaPa20);
        locaPa20.setLayout(locaPa20Layout);
        locaPa20Layout.setHorizontalGroup(
            locaPa20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa20Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa20Layout.setVerticalGroup(
            locaPa20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa20Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, 30));
        locaPa20.setVisible(false);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("อาคารวิศวกรรมเคมี (CHE)");

        javax.swing.GroupLayout locaPa21Layout = new javax.swing.GroupLayout(locaPa21);
        locaPa21.setLayout(locaPa21Layout);
        locaPa21Layout.setHorizontalGroup(
            locaPa21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa21Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa21Layout.setVerticalGroup(
            locaPa21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa21Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa21, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, 30));
        locaPa21.setVisible(false);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("อาคารปฏิบัติการวิศวกรรมอุตสาหการ 3 (PE-3)");

        javax.swing.GroupLayout locaPa22Layout = new javax.swing.GroupLayout(locaPa22);
        locaPa22.setLayout(locaPa22Layout);
        locaPa22Layout.setHorizontalGroup(
            locaPa22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa22Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa22Layout.setVerticalGroup(
            locaPa22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa22Layout.createSequentialGroup()
                .addComponent(jLabel17)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, 30));
        locaPa22.setVisible(false);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("อาคารปฏิบัติการวิศวกรรมอุตสาหการ 2 (PE-2)");

        javax.swing.GroupLayout locaPa23Layout = new javax.swing.GroupLayout(locaPa23);
        locaPa23.setLayout(locaPa23Layout);
        locaPa23Layout.setHorizontalGroup(
            locaPa23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa23Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa23Layout.setVerticalGroup(
            locaPa23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa23Layout.createSequentialGroup()
                .addComponent(jLabel20)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa23, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, 30));
        locaPa23.setVisible(false);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setText("อาคารเรียนรวม 1 (CB-1)");

        javax.swing.GroupLayout locaPa24Layout = new javax.swing.GroupLayout(locaPa24);
        locaPa24.setLayout(locaPa24Layout);
        locaPa24Layout.setHorizontalGroup(
            locaPa24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa24Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel26)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa24Layout.setVerticalGroup(
            locaPa24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa24Layout.createSequentialGroup()
                .addComponent(jLabel26)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa24, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, 30));
        locaPa24.setVisible(false);

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel30.setText("อาคารเรียนรวม 2 (CB-2)");

        javax.swing.GroupLayout locaPa25Layout = new javax.swing.GroupLayout(locaPa25);
        locaPa25.setLayout(locaPa25Layout);
        locaPa25Layout.setHorizontalGroup(
            locaPa25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa25Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel30)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa25Layout.setVerticalGroup(
            locaPa25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa25Layout.createSequentialGroup()
                .addComponent(jLabel30)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa25, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, 30));
        locaPa25.setVisible(false);

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel31.setText("อาคารเรียนรวม 2 (CB-2)");

        javax.swing.GroupLayout locaPa25_2Layout = new javax.swing.GroupLayout(locaPa25_2);
        locaPa25_2.setLayout(locaPa25_2Layout);
        locaPa25_2Layout.setHorizontalGroup(
            locaPa25_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa25_2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel31)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa25_2Layout.setVerticalGroup(
            locaPa25_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa25_2Layout.createSequentialGroup()
                .addComponent(jLabel31)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa25_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, 30));
        locaPa25_2.setVisible(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("อาคารเรียนรวม 3 (CB-3)");

        javax.swing.GroupLayout locaPa26Layout = new javax.swing.GroupLayout(locaPa26);
        locaPa26.setLayout(locaPa26Layout);
        locaPa26Layout.setHorizontalGroup(
            locaPa26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa26Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa26Layout.setVerticalGroup(
            locaPa26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa26Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 30));
        locaPa26.setVisible(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("อาคารเรียนรวม 4 (CB-4)");

        javax.swing.GroupLayout locaPa27Layout = new javax.swing.GroupLayout(locaPa27);
        locaPa27.setLayout(locaPa27Layout);
        locaPa27Layout.setHorizontalGroup(
            locaPa27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa27Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa27Layout.setVerticalGroup(
            locaPa27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa27Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa27, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, 30));
        locaPa27.setVisible(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("อาคารเรียนรวม 5 (CB-5)");

        javax.swing.GroupLayout locaPa28Layout = new javax.swing.GroupLayout(locaPa28);
        locaPa28.setLayout(locaPa28Layout);
        locaPa28Layout.setHorizontalGroup(
            locaPa28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa28Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa28Layout.setVerticalGroup(
            locaPa28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa28Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa28, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, 30));
        locaPa28.setVisible(false);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("อาคารพระจอมเกล้าราชานุสรณ์ 190 ปี (โรงอาหาร)");

        javax.swing.GroupLayout locaPa29Layout = new javax.swing.GroupLayout(locaPa29);
        locaPa29.setLayout(locaPa29Layout);
        locaPa29Layout.setHorizontalGroup(
            locaPa29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa29Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa29Layout.setVerticalGroup(
            locaPa29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa29Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa29, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 30));
        locaPa29.setVisible(false);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("อาคารไฟฟ้าแรงสูง");

        javax.swing.GroupLayout locaPa30Layout = new javax.swing.GroupLayout(locaPa30);
        locaPa30.setLayout(locaPa30Layout);
        locaPa30Layout.setHorizontalGroup(
            locaPa30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa30Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa30Layout.setVerticalGroup(
            locaPa30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa30Layout.createSequentialGroup()
                .addComponent(jLabel19)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa30, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 110, -1, 30));
        locaPa30.setVisible(false);

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setText("โรงคัดแยกขยะ");

        javax.swing.GroupLayout locaPa31Layout = new javax.swing.GroupLayout(locaPa31);
        locaPa31.setLayout(locaPa31Layout);
        locaPa31Layout.setHorizontalGroup(
            locaPa31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa31Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel29)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa31Layout.setVerticalGroup(
            locaPa31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa31Layout.createSequentialGroup()
                .addComponent(jLabel29)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa31, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, 30));
        locaPa31.setVisible(false);

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel40.setText("ศูนย์ซ่อมบำรุงอาคารสถานที่");

        javax.swing.GroupLayout locaPa32Layout = new javax.swing.GroupLayout(locaPa32);
        locaPa32.setLayout(locaPa32Layout);
        locaPa32Layout.setHorizontalGroup(
            locaPa32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa32Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel40)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa32Layout.setVerticalGroup(
            locaPa32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa32Layout.createSequentialGroup()
                .addComponent(jLabel40)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa32, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));
        locaPa32.setVisible(false);

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setText("อาคารเรียนและปฏิบัติการทางศิลปศาสตร์ (LNG)");

        javax.swing.GroupLayout locaPa33Layout = new javax.swing.GroupLayout(locaPa33);
        locaPa33.setLayout(locaPa33Layout);
        locaPa33Layout.setHorizontalGroup(
            locaPa33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa33Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel28)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa33Layout.setVerticalGroup(
            locaPa33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa33Layout.createSequentialGroup()
                .addComponent(jLabel28)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa33, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, 30));
        locaPa33.setVisible(false);

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel42.setText("สำนักงานส่วนอาคารและสถานที่ (BD)");

        javax.swing.GroupLayout locaPa34Layout = new javax.swing.GroupLayout(locaPa34);
        locaPa34.setLayout(locaPa34Layout);
        locaPa34Layout.setHorizontalGroup(
            locaPa34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa34Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel42)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa34Layout.setVerticalGroup(
            locaPa34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa34Layout.createSequentialGroup()
                .addComponent(jLabel42)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa34, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 110, -1, -1));
        locaPa34.setVisible(false);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setText("อาคารปฏิบัติการทางวิศวกรรมอุตสาหการ 4 (PE-4)");

        javax.swing.GroupLayout locaPa35Layout = new javax.swing.GroupLayout(locaPa35);
        locaPa35.setLayout(locaPa35Layout);
        locaPa35Layout.setHorizontalGroup(
            locaPa35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa35Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel27)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa35Layout.setVerticalGroup(
            locaPa35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa35Layout.createSequentialGroup()
                .addComponent(jLabel27)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa35, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, 30));
        locaPa35.setVisible(false);

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel43.setText("อาคารงานเอกสารและการพิมพ์");

        javax.swing.GroupLayout locaPa36Layout = new javax.swing.GroupLayout(locaPa36);
        locaPa36.setLayout(locaPa36Layout);
        locaPa36Layout.setHorizontalGroup(
            locaPa36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa36Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel43)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa36Layout.setVerticalGroup(
            locaPa36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa36Layout.createSequentialGroup()
                .addComponent(jLabel43)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa36, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));
        locaPa36.setVisible(false);

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel44.setText("อาคารงานบริการข้อมูลเทคนิค (TIS)");

        javax.swing.GroupLayout locaPa37Layout = new javax.swing.GroupLayout(locaPa37);
        locaPa37.setLayout(locaPa37Layout);
        locaPa37Layout.setHorizontalGroup(
            locaPa37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa37Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel44)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa37Layout.setVerticalGroup(
            locaPa37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa37Layout.createSequentialGroup()
                .addComponent(jLabel44)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa37, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));
        locaPa37.setVisible(false);

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel47.setText("ลานเอนกประสงค์");

        javax.swing.GroupLayout locaPa38Layout = new javax.swing.GroupLayout(locaPa38);
        locaPa38.setLayout(locaPa38Layout);
        locaPa38Layout.setHorizontalGroup(
            locaPa38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa38Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel47)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa38Layout.setVerticalGroup(
            locaPa38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa38Layout.createSequentialGroup()
                .addComponent(jLabel47)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa38, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));
        locaPa38.setVisible(false);

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel46.setText("อาคารสำนักงานอธิการบดี (AD)");

        javax.swing.GroupLayout locaPa39Layout = new javax.swing.GroupLayout(locaPa39);
        locaPa39.setLayout(locaPa39Layout);
        locaPa39Layout.setHorizontalGroup(
            locaPa39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa39Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel46)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa39Layout.setVerticalGroup(
            locaPa39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa39Layout.createSequentialGroup()
                .addComponent(jLabel46)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa39, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));
        locaPa39.setVisible(false);

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel50.setText("อาคารภาควิชาเคมี (CH)");

        javax.swing.GroupLayout locaPa40Layout = new javax.swing.GroupLayout(locaPa40);
        locaPa40.setLayout(locaPa40Layout);
        locaPa40Layout.setHorizontalGroup(
            locaPa40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa40Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel50)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa40Layout.setVerticalGroup(
            locaPa40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa40Layout.createSequentialGroup()
                .addComponent(jLabel50)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa40, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 200, -1, -1));
        locaPa40.setVisible(false);

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel49.setText("อาคารคณะวิทยาศาสตร์ (SC)");

        javax.swing.GroupLayout locaPa41Layout = new javax.swing.GroupLayout(locaPa41);
        locaPa41.setLayout(locaPa41Layout);
        locaPa41Layout.setHorizontalGroup(
            locaPa41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa41Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel49)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa41Layout.setVerticalGroup(
            locaPa41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa41Layout.createSequentialGroup()
                .addComponent(jLabel49)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa41, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));
        locaPa41.setVisible(false);

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel48.setText("สำนักหอสมุด (LIB)");

        javax.swing.GroupLayout locaPa42Layout = new javax.swing.GroupLayout(locaPa42);
        locaPa42.setLayout(locaPa42Layout);
        locaPa42Layout.setHorizontalGroup(
            locaPa42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa42Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel48)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa42Layout.setVerticalGroup(
            locaPa42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa42Layout.createSequentialGroup()
                .addComponent(jLabel48)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa42, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 110, -1, -1));
        locaPa42.setVisible(false);

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel51.setText("อาคารศูนย์เครื่องมือวิทยาศาสตร์ฯ (SI)");

        javax.swing.GroupLayout locaPa43Layout = new javax.swing.GroupLayout(locaPa43);
        locaPa43.setLayout(locaPa43Layout);
        locaPa43Layout.setHorizontalGroup(
            locaPa43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa43Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel51)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa43Layout.setVerticalGroup(
            locaPa43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa43Layout.createSequentialGroup()
                .addComponent(jLabel51)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa43, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));
        locaPa43.setVisible(false);

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel52.setText("อาคารจุลชีววิทยา (MI)");

        javax.swing.GroupLayout locaPa44Layout = new javax.swing.GroupLayout(locaPa44);
        locaPa44.setLayout(locaPa44Layout);
        locaPa44Layout.setHorizontalGroup(
            locaPa44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa44Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel52)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa44Layout.setVerticalGroup(
            locaPa44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa44Layout.createSequentialGroup()
                .addComponent(jLabel52)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa44, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, -1, -1));
        locaPa44.setVisible(false);

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel53.setText("อาคารปฏิบัติการพื้นฐานทางวิทยาศาสตร์ (SCL)");

        javax.swing.GroupLayout locaPa45Layout = new javax.swing.GroupLayout(locaPa45);
        locaPa45.setLayout(locaPa45Layout);
        locaPa45Layout.setHorizontalGroup(
            locaPa45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa45Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel53)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa45Layout.setVerticalGroup(
            locaPa45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa45Layout.createSequentialGroup()
                .addComponent(jLabel53)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa45, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));
        locaPa45.setVisible(false);

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel54.setText("อาคารปฏิบัติการพื้นฐานทางวิทยาศาสตร์ (SCL)");

        javax.swing.GroupLayout locaPa45_2Layout = new javax.swing.GroupLayout(locaPa45_2);
        locaPa45_2.setLayout(locaPa45_2Layout);
        locaPa45_2Layout.setHorizontalGroup(
            locaPa45_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa45_2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel54)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa45_2Layout.setVerticalGroup(
            locaPa45_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa45_2Layout.createSequentialGroup()
                .addComponent(jLabel54)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa45_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));
        locaPa45_2.setVisible(false);

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel45.setText("ศาลาวีรชน");

        javax.swing.GroupLayout locaPa46Layout = new javax.swing.GroupLayout(locaPa46);
        locaPa46.setLayout(locaPa46Layout);
        locaPa46Layout.setHorizontalGroup(
            locaPa46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa46Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel45)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa46Layout.setVerticalGroup(
            locaPa46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa46Layout.createSequentialGroup()
                .addComponent(jLabel45)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa46, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));
        locaPa46.setVisible(false);

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel41.setText("อาคารคณะเทคโนโลยีสารสนเทศ (IT)");

        javax.swing.GroupLayout locaPa47Layout = new javax.swing.GroupLayout(locaPa47);
        locaPa47.setLayout(locaPa47Layout);
        locaPa47Layout.setHorizontalGroup(
            locaPa47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa47Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel41)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa47Layout.setVerticalGroup(
            locaPa47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa47Layout.createSequentialGroup()
                .addComponent(jLabel41)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa47, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));
        locaPa47.setVisible(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("อาคารวิศววัฒนะ");

        javax.swing.GroupLayout locaPa48Layout = new javax.swing.GroupLayout(locaPa48);
        locaPa48.setLayout(locaPa48Layout);
        locaPa48Layout.setHorizontalGroup(
            locaPa48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa48Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa48Layout.setVerticalGroup(
            locaPa48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa48Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa48, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, 30));
        locaPa48.setVisible(false);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("อาคารวิศวกรรมเครื่องกล");

        javax.swing.GroupLayout locaPa49Layout = new javax.swing.GroupLayout(locaPa49);
        locaPa49.setLayout(locaPa49Layout);
        locaPa49Layout.setHorizontalGroup(
            locaPa49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa49Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa49Layout.setVerticalGroup(
            locaPa49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa49Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa49, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, 30));
        locaPa49.setVisible(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("สถาบันนวัตกรรมการเรียนรู้เฉลิมพระเกียรติ 80 พรรษา มูลนิธิไทยคม");

        javax.swing.GroupLayout locaPa50Layout = new javax.swing.GroupLayout(locaPa50);
        locaPa50.setLayout(locaPa50Layout);
        locaPa50Layout.setHorizontalGroup(
            locaPa50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa50Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa50Layout.setVerticalGroup(
            locaPa50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa50Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa50, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, 30));
        locaPa50.setVisible(false);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("อาคารปฏิบัติการวิศวกรรมอุตสาหการ 5 (PE-5)");

        javax.swing.GroupLayout locaPa51Layout = new javax.swing.GroupLayout(locaPa51);
        locaPa51.setLayout(locaPa51Layout);
        locaPa51Layout.setHorizontalGroup(
            locaPa51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa51Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        locaPa51Layout.setVerticalGroup(
            locaPa51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locaPa51Layout.createSequentialGroup()
                .addComponent(jLabel18)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(locaPa51, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, 30));
        locaPa51.setVisible(false);

        locaBtn1.setBackground(java.awt.Color.white);
        locaBtn1.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn1.setBorderPainted(false);
        locaBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn1MouseExited(evt);
            }
        });
        locaBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 410, 20, 20));

        locaBtn1_2.setBackground(java.awt.Color.white);
        locaBtn1_2.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn1_2.setBorderPainted(false);
        locaBtn1_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn1_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn1_2MouseExited(evt);
            }
        });
        locaBtn1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn1_2ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn1_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 197, 20, 20));

        locaBtn2.setBackground(java.awt.Color.white);
        locaBtn2.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn2.setBorderPainted(false);
        locaBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn2MouseExited(evt);
            }
        });
        locaBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn2ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 20, 20));

        locaBtn3.setBackground(java.awt.Color.white);
        locaBtn3.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn3.setBorderPainted(false);
        locaBtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn3MouseExited(evt);
            }
        });
        locaBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn3ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 350, 20, 20));

        locaBtn4.setBackground(java.awt.Color.white);
        locaBtn4.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn4.setBorderPainted(false);
        locaBtn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn4MouseExited(evt);
            }
        });
        locaBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn4ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 360, 20, 20));

        locaBtn5.setBackground(java.awt.Color.white);
        locaBtn5.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn5.setBorderPainted(false);
        locaBtn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn5MouseExited(evt);
            }
        });
        locaBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn5ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 275, 20, 20));

        locaBtn6.setBackground(java.awt.Color.white);
        locaBtn6.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn6.setBorderPainted(false);
        locaBtn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn6MouseExited(evt);
            }
        });
        locaBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn6ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 262, 20, 20));

        locaBtn7.setBackground(java.awt.Color.white);
        locaBtn7.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn7.setBorderPainted(false);
        locaBtn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn7MouseExited(evt);
            }
        });
        locaBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn7ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 20, 20));

        locaBtn8.setBackground(java.awt.Color.white);
        locaBtn8.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn8.setBorderPainted(false);
        locaBtn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn8MouseExited(evt);
            }
        });
        locaBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn8ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 267, 20, 20));

        locaBtn9.setBackground(java.awt.Color.white);
        locaBtn9.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn9.setBorderPainted(false);
        locaBtn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn9MouseExited(evt);
            }
        });
        locaBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn9ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 262, 20, 20));

        locaBtn10.setBackground(java.awt.Color.white);
        locaBtn10.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn10.setBorderPainted(false);
        locaBtn10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn10MouseExited(evt);
            }
        });
        locaBtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn10ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 256, 20, 20));

        locaBtn11.setBackground(java.awt.Color.white);
        locaBtn11.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn11.setBorderPainted(false);
        locaBtn11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn11MouseExited(evt);
            }
        });
        locaBtn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn11ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 234, 20, 20));

        locaBtn12.setBackground(java.awt.Color.white);
        locaBtn12.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn12.setBorderPainted(false);
        locaBtn12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn12MouseExited(evt);
            }
        });
        locaBtn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn12ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 309, 20, 20));

        locaBtn13.setBackground(java.awt.Color.white);
        locaBtn13.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn13.setBorderPainted(false);
        locaBtn13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn13MouseExited(evt);
            }
        });
        locaBtn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn13ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn13, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 293, 20, 20));

        locaBtn14.setBackground(java.awt.Color.white);
        locaBtn14.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn14.setBorderPainted(false);
        locaBtn14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn14MouseExited(evt);
            }
        });
        locaBtn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn14ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn14, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 266, 20, 20));

        locaBtn15.setBackground(java.awt.Color.white);
        locaBtn15.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn15.setBorderPainted(false);
        locaBtn15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn15MouseExited(evt);
            }
        });
        locaBtn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn15ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn15, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 274, 20, 20));

        locaBtn16.setBackground(java.awt.Color.white);
        locaBtn16.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn16.setBorderPainted(false);
        locaBtn16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn16MouseExited(evt);
            }
        });
        locaBtn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn16ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn16, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 303, 20, 20));

        locaBtn17.setBackground(java.awt.Color.white);
        locaBtn17.setForeground(new java.awt.Color(255, 153, 153));
        locaBtn17.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn17.setBorderPainted(false);
        locaBtn17.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                locaBtn17FocusGained(evt);
            }
        });
        locaBtn17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn17MouseExited(evt);
            }
        });
        locaBtn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn17ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 20, 20));

        locaBtn18.setBackground(java.awt.Color.white);
        locaBtn18.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn18.setBorderPainted(false);
        locaBtn18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn18MouseExited(evt);
            }
        });
        locaBtn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn18ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn18, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 290, 20, 20));

        locaBtn19.setBackground(java.awt.Color.white);
        locaBtn19.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn19.setBorderPainted(false);
        locaBtn19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn19MouseExited(evt);
            }
        });
        locaBtn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn19ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn19, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 230, 20, 20));

        locaBtn20.setBackground(java.awt.Color.white);
        locaBtn20.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn20.setBorderPainted(false);
        locaBtn20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn20MouseExited(evt);
            }
        });
        locaBtn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn20ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn20, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 20, 20));

        locaBtn21.setBackground(java.awt.Color.white);
        locaBtn21.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn21.setBorderPainted(false);
        locaBtn21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn21MouseExited(evt);
            }
        });
        locaBtn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn21ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn21, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 20, 20));

        locaBtn22.setBackground(java.awt.Color.white);
        locaBtn22.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn22.setBorderPainted(false);
        locaBtn22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn22MouseExited(evt);
            }
        });
        locaBtn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn22ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn22, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 167, 20, 20));

        locaBtn23.setBackground(java.awt.Color.white);
        locaBtn23.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn23.setBorderPainted(false);
        locaBtn23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn23MouseExited(evt);
            }
        });
        locaBtn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn23ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn23, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 200, 20, 20));

        locaBtn24.setBackground(java.awt.Color.white);
        locaBtn24.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn24.setBorderPainted(false);
        locaBtn24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn24MouseExited(evt);
            }
        });
        locaBtn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn24ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn24, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 20, 20));

        locaBtn25.setBackground(java.awt.Color.white);
        locaBtn25.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn25.setBorderPainted(false);
        locaBtn25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn25MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn25MouseExited(evt);
            }
        });
        locaBtn25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn25ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn25, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 20, 20));

        locaBtn25_2.setBackground(java.awt.Color.white);
        locaBtn25_2.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn25_2.setBorderPainted(false);
        locaBtn25_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn25_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn25_2MouseExited(evt);
            }
        });
        locaBtn25_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn25_2ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn25_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 190, 20, 20));

        locaBtn26.setBackground(java.awt.Color.white);
        locaBtn26.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn26.setBorderPainted(false);
        locaBtn26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn26MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn26MouseExited(evt);
            }
        });
        locaBtn26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn26ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn26, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 20, 20));

        locaBtn27.setBackground(java.awt.Color.white);
        locaBtn27.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn27.setBorderPainted(false);
        locaBtn27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn27MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn27MouseExited(evt);
            }
        });
        locaBtn27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn27ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn27, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 153, 20, 20));

        locaBtn28.setBackground(java.awt.Color.white);
        locaBtn28.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn28.setBorderPainted(false);
        locaBtn28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn28MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn28MouseExited(evt);
            }
        });
        locaBtn28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn28ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn28, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 190, 20, 20));

        locaBtn29.setBackground(java.awt.Color.white);
        locaBtn29.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn29.setBorderPainted(false);
        locaBtn29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn29MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn29MouseExited(evt);
            }
        });
        locaBtn29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn29ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn29, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 76, 20, 20));

        locaBtn30.setBackground(java.awt.Color.white);
        locaBtn30.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn30.setBorderPainted(false);
        locaBtn30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn30MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn30MouseExited(evt);
            }
        });
        locaBtn30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn30ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn30, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 20, 20));

        locaBtn31.setBackground(java.awt.Color.white);
        locaBtn31.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn31.setBorderPainted(false);
        locaBtn31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn31MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn31MouseExited(evt);
            }
        });
        locaBtn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn31ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn31, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 20, 20));

        locaBtn32.setBackground(java.awt.Color.white);
        locaBtn32.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn32.setBorderPainted(false);
        locaBtn32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn32MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn32MouseExited(evt);
            }
        });
        locaBtn32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn32ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn32, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 20, 20));

        locaBtn33.setBackground(java.awt.Color.white);
        locaBtn33.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn33.setBorderPainted(false);
        locaBtn33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn33MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn33MouseExited(evt);
            }
        });
        locaBtn33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn33ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn33, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 113, 20, 20));

        locaBtn34.setBackground(java.awt.Color.white);
        locaBtn34.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn34.setBorderPainted(false);
        locaBtn34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn34MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn34MouseExited(evt);
            }
        });
        locaBtn34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn34ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn34, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 20, 20));

        locaBtn35.setBackground(java.awt.Color.white);
        locaBtn35.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn35.setBorderPainted(false);
        locaBtn35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn35MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn35MouseExited(evt);
            }
        });
        locaBtn35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn35ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn35, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 166, 20, 20));

        locaBtn36.setBackground(java.awt.Color.white);
        locaBtn36.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn36.setBorderPainted(false);
        locaBtn36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn36MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn36MouseExited(evt);
            }
        });
        locaBtn36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn36ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn36, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 20, 20));

        locaBtn37.setBackground(java.awt.Color.white);
        locaBtn37.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn37.setBorderPainted(false);
        locaBtn37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn37MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn37MouseExited(evt);
            }
        });
        locaBtn37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn37ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn37, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 20, 20));

        locaBtn38.setBackground(java.awt.Color.white);
        locaBtn38.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn38.setBorderPainted(false);
        locaBtn38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn38MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn38MouseExited(evt);
            }
        });
        locaBtn38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn38ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn38, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 172, 20, 20));

        locaBtn39.setBackground(java.awt.Color.white);
        locaBtn39.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn39.setBorderPainted(false);
        locaBtn39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn39MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn39MouseExited(evt);
            }
        });
        locaBtn39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn39ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn39, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 208, 20, 20));

        locaBtn40.setBackground(java.awt.Color.white);
        locaBtn40.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn40.setBorderPainted(false);
        locaBtn40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn40MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn40MouseExited(evt);
            }
        });
        locaBtn40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn40ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn40, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 176, 20, 20));

        locaBtn41.setBackground(java.awt.Color.white);
        locaBtn41.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn41.setBorderPainted(false);
        locaBtn41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn41MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn41MouseExited(evt);
            }
        });
        locaBtn41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn41ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn41, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 20, 20));

        locaBtn42.setBackground(java.awt.Color.white);
        locaBtn42.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn42.setBorderPainted(false);
        locaBtn42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn42MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn42MouseExited(evt);
            }
        });
        locaBtn42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn42ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn42, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 94, 20, 20));

        locaBtn43.setBackground(java.awt.Color.white);
        locaBtn43.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn43.setBorderPainted(false);
        locaBtn43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn43MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn43MouseExited(evt);
            }
        });
        locaBtn43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn43ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn43, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 20, 20));

        locaBtn44.setBackground(java.awt.Color.white);
        locaBtn44.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn44.setBorderPainted(false);
        locaBtn44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn44MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn44MouseExited(evt);
            }
        });
        locaBtn44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn44ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn44, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 117, 20, 20));

        locaBtn45.setBackground(java.awt.Color.white);
        locaBtn45.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn45.setBorderPainted(false);
        locaBtn45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn45MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn45MouseExited(evt);
            }
        });
        locaBtn45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn45ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn45, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 160, 20, 20));

        locaBtn45_2.setBackground(java.awt.Color.white);
        locaBtn45_2.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn45_2.setBorderPainted(false);
        locaBtn45_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn45_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn45_2MouseExited(evt);
            }
        });
        locaBtn45_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn45_2ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn45_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 105, 20, 20));

        locaBtn46.setBackground(java.awt.Color.white);
        locaBtn46.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn46.setBorderPainted(false);
        locaBtn46.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                locaBtn46MouseDragged(evt);
            }
        });
        locaBtn46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn46MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn46MouseExited(evt);
            }
        });
        locaBtn46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn46ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn46, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 199, 20, 20));

        locaBtn47.setBackground(java.awt.Color.white);
        locaBtn47.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn47.setBorderPainted(false);
        locaBtn47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn47MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn47MouseExited(evt);
            }
        });
        locaBtn47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn47ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn47, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 110, 20, 20));

        locaBtn48.setBackground(java.awt.Color.white);
        locaBtn48.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn48.setBorderPainted(false);
        locaBtn48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn48MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn48MouseExited(evt);
            }
        });
        locaBtn48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn48ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn48, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 198, 20, 20));

        locaBtn49.setBackground(java.awt.Color.white);
        locaBtn49.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn49.setBorderPainted(false);
        locaBtn49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn49MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn49MouseExited(evt);
            }
        });
        locaBtn49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn49ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn49, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 210, 20, 20));

        locaBtn50.setBackground(java.awt.Color.white);
        locaBtn50.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn50.setBorderPainted(false);
        locaBtn50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn50MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn50MouseExited(evt);
            }
        });
        locaBtn50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn50ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn50, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 330, 20, 20));

        locaBtn51.setBackground(java.awt.Color.white);
        locaBtn51.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        locaBtn51.setBorderPainted(false);
        locaBtn51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                locaBtn51MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locaBtn51MouseExited(evt);
            }
        });
        locaBtn51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaBtn51ActionPerformed(evt);
            }
        });
        getContentPane().add(locaBtn51, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 152, 20, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\kaname-outdoor\\pic\\map.gif")); // NOI18N
        jLabel1.setText("สถาบันนวัตกรรมการเรียนรู้เฉลิมพระเกียรติ 80 พรรษา มูลนิธิไทยคม");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 709, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));

        jLabel56.setText("");
        jLabel56.setIcon(new ImageIcon((new ImageIcon("D:\\kaname-outdoor\\pic\\logo.png").getImage().getScaledInstance(200,70,Image.SCALE_DEFAULT))));

        jLabel57.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel57.setText("map");

        jLabel58.setIcon(new ImageIcon((new ImageIcon("D:\\kaname-outdoor\\pic\\close.png").getImage().getScaledInstance(35,35,Image.SCALE_DEFAULT))));
        jLabel58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel58MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(428, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 709, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased

    }//GEN-LAST:event_jTextField1KeyReleased

    private void locaBtn28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn28ActionPerformed
        ModelProblemList.setLocationId(28);
        closePage();
    }//GEN-LAST:event_locaBtn28ActionPerformed

    private void locaBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn9ActionPerformed
        ModelProblemList.setLocationId(9);
        closePage();
    }//GEN-LAST:event_locaBtn9ActionPerformed

    private void locaBtn1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn1_2ActionPerformed
        ModelProblemList.setLocationId(1);
        closePage();
    }//GEN-LAST:event_locaBtn1_2ActionPerformed

    private void locaBtn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn19ActionPerformed
        ModelProblemList.setLocationId(19);
        closePage();
    }//GEN-LAST:event_locaBtn19ActionPerformed

    private void locaBtn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn10ActionPerformed
        ModelProblemList.setLocationId(10);
        closePage();
    }//GEN-LAST:event_locaBtn10ActionPerformed

    private void locaBtn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn20ActionPerformed
        ModelProblemList.setLocationId(20);
        closePage();
    }//GEN-LAST:event_locaBtn20ActionPerformed

    private void locaBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn3ActionPerformed
        ModelProblemList.setLocationId(3);
        closePage();
    }//GEN-LAST:event_locaBtn3ActionPerformed

    private void locaBtn27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn27ActionPerformed
        ModelProblemList.setLocationId(27);
        closePage();
    }//GEN-LAST:event_locaBtn27ActionPerformed

    private void locaBtn26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn26ActionPerformed
        ModelProblemList.setLocationId(26);
        closePage();
    }//GEN-LAST:event_locaBtn26ActionPerformed

    private void locaBtn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn15ActionPerformed
        ModelProblemList.setLocationId(15);
        closePage();
    }//GEN-LAST:event_locaBtn15ActionPerformed

    private void locaBtn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn14ActionPerformed
        ModelProblemList.setLocationId(14);
        closePage();
    }//GEN-LAST:event_locaBtn14ActionPerformed

    private void locaBtn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn12ActionPerformed
        ModelProblemList.setLocationId(12);
        closePage();
    }//GEN-LAST:event_locaBtn12ActionPerformed

    private void locaBtn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn18ActionPerformed
        ModelProblemList.setLocationId(18);
        closePage();
    }//GEN-LAST:event_locaBtn18ActionPerformed

    private void locaBtn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn21ActionPerformed
        ModelProblemList.setLocationId(21);
        closePage();
    }//GEN-LAST:event_locaBtn21ActionPerformed

    private void locaBtn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn13ActionPerformed
        ModelProblemList.setLocationId(13);
        closePage();
    }//GEN-LAST:event_locaBtn13ActionPerformed

    private void locaBtn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn16ActionPerformed
        ModelProblemList.setLocationId(16);
        closePage();
    }//GEN-LAST:event_locaBtn16ActionPerformed

    private void locaBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn4ActionPerformed
        ModelProblemList.setLocationId(4);
        closePage();
    }//GEN-LAST:event_locaBtn4ActionPerformed

    private void locaBtn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn23ActionPerformed
        ModelProblemList.setLocationId(23);
        closePage();
    }//GEN-LAST:event_locaBtn23ActionPerformed

    private void locaBtn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn17ActionPerformed
        ModelProblemList.setLocationId(17);
        closePage();
    }//GEN-LAST:event_locaBtn17ActionPerformed

    private void locaBtn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn24ActionPerformed
        ModelProblemList.setLocationId(24);
        closePage();
    }//GEN-LAST:event_locaBtn24ActionPerformed

    private void locaBtn50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn50ActionPerformed
        ModelProblemList.setLocationId(50);
        closePage();
    }//GEN-LAST:event_locaBtn50ActionPerformed

    private void locaBtn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn11ActionPerformed
        ModelProblemList.setLocationId(11);
        closePage();
    }//GEN-LAST:event_locaBtn11ActionPerformed

    private void locaBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn8ActionPerformed
        ModelProblemList.setLocationId(8);
        closePage();
    }//GEN-LAST:event_locaBtn8ActionPerformed

    private void locaBtn49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn49ActionPerformed
        ModelProblemList.setLocationId(49);
        closePage();
    }//GEN-LAST:event_locaBtn49ActionPerformed

    private void locaBtn48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn48ActionPerformed
        ModelProblemList.setLocationId(48);
        closePage();
    }//GEN-LAST:event_locaBtn48ActionPerformed

    private void locaBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn7ActionPerformed
        ModelProblemList.setLocationId(7);
        closePage();
    }//GEN-LAST:event_locaBtn7ActionPerformed

    private void locaBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn6ActionPerformed
        ModelProblemList.setLocationId(6);
        closePage();
    }//GEN-LAST:event_locaBtn6ActionPerformed

    private void locaBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn1ActionPerformed
        ModelProblemList.setLocationId(1);
        closePage();
    }//GEN-LAST:event_locaBtn1ActionPerformed

    private void locaBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn2ActionPerformed
        ModelProblemList.setLocationId(2);
        closePage();
    }//GEN-LAST:event_locaBtn2ActionPerformed

    private void locaBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn5ActionPerformed
        ModelProblemList.setLocationId(5);
        closePage();
    }//GEN-LAST:event_locaBtn5ActionPerformed

    private void locaBtn39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn39ActionPerformed
        ModelProblemList.setLocationId(39);
        closePage();
    }//GEN-LAST:event_locaBtn39ActionPerformed

    private void locaBtn40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn40ActionPerformed
        ModelProblemList.setLocationId(40);
        closePage();
    }//GEN-LAST:event_locaBtn40ActionPerformed

    private void locaBtn45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn45ActionPerformed
        ModelProblemList.setLocationId(45);
        closePage();
    }//GEN-LAST:event_locaBtn45ActionPerformed

    private void locaBtn45_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn45_2ActionPerformed
        ModelProblemList.setLocationId(45);
        closePage();
    }//GEN-LAST:event_locaBtn45_2ActionPerformed

    private void locaBtn46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn46ActionPerformed
        ModelProblemList.setLocationId(46);
        closePage();
    }//GEN-LAST:event_locaBtn46ActionPerformed

    private void locaBtn41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn41ActionPerformed
        ModelProblemList.setLocationId(41);
        closePage();
    }//GEN-LAST:event_locaBtn41ActionPerformed

    private void locaBtn43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn43ActionPerformed
        ModelProblemList.setLocationId(43);
        closePage();
    }//GEN-LAST:event_locaBtn43ActionPerformed

    private void locaBtn44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn44ActionPerformed
        ModelProblemList.setLocationId(44);
        closePage();
    }//GEN-LAST:event_locaBtn44ActionPerformed

    private void locaBtn25_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn25_2ActionPerformed
        ModelProblemList.setLocationId(25);
        closePage();
    }//GEN-LAST:event_locaBtn25_2ActionPerformed

    private void locaBtn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn22ActionPerformed
        ModelProblemList.setLocationId(22);
        closePage();
    }//GEN-LAST:event_locaBtn22ActionPerformed

    private void locaBtn29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn29ActionPerformed
        ModelProblemList.setLocationId(29);
        closePage();
    }//GEN-LAST:event_locaBtn29ActionPerformed

    private void locaBtn30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn30ActionPerformed
        ModelProblemList.setLocationId(30);
        closePage();
    }//GEN-LAST:event_locaBtn30ActionPerformed

    private void locaBtn42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn42ActionPerformed
        ModelProblemList.setLocationId(42);
        closePage();
    }//GEN-LAST:event_locaBtn42ActionPerformed

    private void locaBtn47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn47ActionPerformed
        ModelProblemList.setLocationId(47);
        closePage();
    }//GEN-LAST:event_locaBtn47ActionPerformed

    private void locaBtn38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn38ActionPerformed
        ModelProblemList.setLocationId(38);
        closePage();
    }//GEN-LAST:event_locaBtn38ActionPerformed

    private void locaBtn32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn32ActionPerformed
        ModelProblemList.setLocationId(32);
        closePage();
    }//GEN-LAST:event_locaBtn32ActionPerformed

    private void locaBtn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn31ActionPerformed
        ModelProblemList.setLocationId(31);
        closePage();
    }//GEN-LAST:event_locaBtn31ActionPerformed

    private void locaBtn35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn35ActionPerformed
        ModelProblemList.setLocationId(35);
        closePage();
    }//GEN-LAST:event_locaBtn35ActionPerformed

    private void locaBtn51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn51ActionPerformed
        ModelProblemList.setLocationId(51);
        closePage();
    }//GEN-LAST:event_locaBtn51ActionPerformed

    private void locaBtn25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn25ActionPerformed
        ModelProblemList.setLocationId(25);
        closePage();
    }//GEN-LAST:event_locaBtn25ActionPerformed

    private void locaBtn36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn36ActionPerformed
        ModelProblemList.setLocationId(36);
        closePage();
    }//GEN-LAST:event_locaBtn36ActionPerformed

    private void locaBtn37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn37ActionPerformed
        ModelProblemList.setLocationId(37);
        closePage();
    }//GEN-LAST:event_locaBtn37ActionPerformed

    private void locaBtn34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn34ActionPerformed
        ModelProblemList.setLocationId(34);
        closePage();
    }//GEN-LAST:event_locaBtn34ActionPerformed

    private void locaBtn33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaBtn33ActionPerformed
        ModelProblemList.setLocationId(33);
        closePage();
    }//GEN-LAST:event_locaBtn33ActionPerformed

    private void locaBtn17FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_locaBtn17FocusGained
     
    }//GEN-LAST:event_locaBtn17FocusGained

    private void locaBtn17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn17MouseEntered
        locaPa17.setVisible(true);
    }//GEN-LAST:event_locaBtn17MouseEntered

    private void locaBtn17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn17MouseExited
        locaPa17.setVisible(false);
    }//GEN-LAST:event_locaBtn17MouseExited

    private void locaBtn18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn18MouseEntered
        locaPa18.setVisible(true);
    }//GEN-LAST:event_locaBtn18MouseEntered

    private void locaBtn18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn18MouseExited
        locaPa18.setVisible(false);
    }//GEN-LAST:event_locaBtn18MouseExited

    private void locaBtn20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn20MouseEntered
        locaPa20.setVisible(true);
    }//GEN-LAST:event_locaBtn20MouseEntered

    private void locaBtn20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn20MouseExited
        locaPa20.setVisible(false);
    }//GEN-LAST:event_locaBtn20MouseExited

    private void locaBtn16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn16MouseEntered
        locaPa16.setVisible(true);
    }//GEN-LAST:event_locaBtn16MouseEntered

    private void locaBtn16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn16MouseExited
        locaPa16.setVisible(false);
    }//GEN-LAST:event_locaBtn16MouseExited

    private void locaBtn50MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn50MouseEntered
        locaPa50.setVisible(true);
    }//GEN-LAST:event_locaBtn50MouseEntered

    private void locaBtn50MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn50MouseExited
        locaPa50.setVisible(false);
    }//GEN-LAST:event_locaBtn50MouseExited

    private void locaBtn15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn15MouseEntered
        locaPa15.setVisible(true);
    }//GEN-LAST:event_locaBtn15MouseEntered

    private void locaBtn15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn15MouseExited
        locaPa15.setVisible(false);
    }//GEN-LAST:event_locaBtn15MouseExited

    private void locaBtn19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn19MouseEntered
        locaPa19.setVisible(true);
    }//GEN-LAST:event_locaBtn19MouseEntered

    private void locaBtn19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn19MouseExited
        locaPa19.setVisible(false);
    }//GEN-LAST:event_locaBtn19MouseExited

    private void locaBtn28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn28MouseEntered
        locaPa28.setVisible(true);
    }//GEN-LAST:event_locaBtn28MouseEntered

    private void locaBtn28MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn28MouseExited
        locaPa28.setVisible(false);
    }//GEN-LAST:event_locaBtn28MouseExited

    private void locaBtn1_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn1_2MouseEntered
        locaPa1_2.setVisible(true);
    }//GEN-LAST:event_locaBtn1_2MouseEntered

    private void locaBtn1_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn1_2MouseExited
        locaPa1_2.setVisible(false);
    }//GEN-LAST:event_locaBtn1_2MouseExited

    private void locaBtn27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn27MouseEntered
        locaPa27.setVisible(true);
    }//GEN-LAST:event_locaBtn27MouseEntered

    private void locaBtn27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn27MouseExited
        locaPa27.setVisible(false);
    }//GEN-LAST:event_locaBtn27MouseExited

    private void locaBtn26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn26MouseEntered
        locaPa26.setVisible(true);
    }//GEN-LAST:event_locaBtn26MouseEntered

    private void locaBtn26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn26MouseExited
        locaPa26.setVisible(false);
    }//GEN-LAST:event_locaBtn26MouseExited

    private void locaBtn29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn29MouseEntered
        locaPa29.setVisible(true);
    }//GEN-LAST:event_locaBtn29MouseEntered

    private void locaBtn29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn29MouseExited
        locaPa29.setVisible(false);
    }//GEN-LAST:event_locaBtn29MouseExited

    private void locaBtn21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn21MouseEntered
        locaPa21.setVisible(true);
    }//GEN-LAST:event_locaBtn21MouseEntered

    private void locaBtn21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn21MouseExited
        locaPa21.setVisible(false);
    }//GEN-LAST:event_locaBtn21MouseExited

    private void locaBtn49MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn49MouseEntered
        locaPa49.setVisible(true);
    }//GEN-LAST:event_locaBtn49MouseEntered

    private void locaBtn49MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn49MouseExited
        locaPa49.setVisible(false);
    }//GEN-LAST:event_locaBtn49MouseExited

    private void locaBtn48MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn48MouseEntered
        locaPa48.setVisible(true);
    }//GEN-LAST:event_locaBtn48MouseEntered

    private void locaBtn48MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn48MouseExited
        locaPa48.setVisible(false);
    }//GEN-LAST:event_locaBtn48MouseExited

    private void locaBtn22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn22MouseEntered
        locaPa22.setVisible(true);
    }//GEN-LAST:event_locaBtn22MouseEntered

    private void locaBtn22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn22MouseExited
        locaPa22.setVisible(false);
    }//GEN-LAST:event_locaBtn22MouseExited

    private void locaBtn51MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn51MouseEntered
        locaPa51.setVisible(true);
    }//GEN-LAST:event_locaBtn51MouseEntered

    private void locaBtn51MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn51MouseExited
        locaPa51.setVisible(false);
    }//GEN-LAST:event_locaBtn51MouseExited

    private void locaBtn24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn24MouseEntered
        locaPa24.setVisible(true);
    }//GEN-LAST:event_locaBtn24MouseEntered

    private void locaBtn24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn24MouseExited
        locaPa24.setVisible(false);
    }//GEN-LAST:event_locaBtn24MouseExited

    private void locaBtn30MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn30MouseEntered
        locaPa30.setVisible(true);
    }//GEN-LAST:event_locaBtn30MouseEntered

    private void locaBtn30MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn30MouseExited
        locaPa30.setVisible(false);
    }//GEN-LAST:event_locaBtn30MouseExited

    private void locaBtn14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn14MouseEntered
        locaPa14.setVisible(true);
    }//GEN-LAST:event_locaBtn14MouseEntered

    private void locaBtn14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn14MouseExited
        locaPa14.setVisible(false);
    }//GEN-LAST:event_locaBtn14MouseExited

    private void locaBtn23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn23MouseEntered
        locaPa23.setVisible(true);
    }//GEN-LAST:event_locaBtn23MouseEntered

    private void locaBtn23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn23MouseExited
        locaPa23.setVisible(false);
    }//GEN-LAST:event_locaBtn23MouseExited

    private void locaBtn4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn4MouseEntered
        locaPa4.setVisible(true);
    }//GEN-LAST:event_locaBtn4MouseEntered

    private void locaBtn4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn4MouseExited
        locaPa4.setVisible(false);
    }//GEN-LAST:event_locaBtn4MouseExited

    private void locaBtn12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn12MouseEntered
        locaPa12.setVisible(true);
    }//GEN-LAST:event_locaBtn12MouseEntered

    private void locaBtn12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn12MouseExited
        locaPa12.setVisible(false);
    }//GEN-LAST:event_locaBtn12MouseExited

    private void locaBtn13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn13MouseEntered
        locaPa13.setVisible(true);
    }//GEN-LAST:event_locaBtn13MouseEntered

    private void locaBtn13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn13MouseExited
        locaPa13.setVisible(false);
    }//GEN-LAST:event_locaBtn13MouseExited

    private void locaBtn10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn10MouseEntered
        locaPa10.setVisible(true);
    }//GEN-LAST:event_locaBtn10MouseEntered

    private void locaBtn10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn10MouseExited
        locaPa10.setVisible(false);
    }//GEN-LAST:event_locaBtn10MouseExited

    private void locaBtn35MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn35MouseEntered
        locaPa35.setVisible(true);
    }//GEN-LAST:event_locaBtn35MouseEntered

    private void locaBtn35MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn35MouseExited
        locaPa35.setVisible(false);
    }//GEN-LAST:event_locaBtn35MouseExited

    private void locaBtn33MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn33MouseEntered
        locaPa33.setVisible(true);
    }//GEN-LAST:event_locaBtn33MouseEntered

    private void locaBtn33MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn33MouseExited
        locaPa33.setVisible(false);
    }//GEN-LAST:event_locaBtn33MouseExited

    private void locaBtn31MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn31MouseEntered
        locaPa31.setVisible(true);
    }//GEN-LAST:event_locaBtn31MouseEntered

    private void locaBtn31MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn31MouseExited
        locaPa31.setVisible(false);
    }//GEN-LAST:event_locaBtn31MouseExited

    private void locaBtn25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn25MouseEntered
        locaPa25.setVisible(true);
    }//GEN-LAST:event_locaBtn25MouseEntered

    private void locaBtn25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn25MouseExited
        locaPa25.setVisible(false);
    }//GEN-LAST:event_locaBtn25MouseExited

    private void locaBtn25_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn25_2MouseEntered
        locaPa25_2.setVisible(true);
    }//GEN-LAST:event_locaBtn25_2MouseEntered

    private void locaBtn25_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn25_2MouseExited
        locaPa25_2.setVisible(false);
    }//GEN-LAST:event_locaBtn25_2MouseExited

    private void locaBtn11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn11MouseEntered
        locaPa11.setVisible(true);
    }//GEN-LAST:event_locaBtn11MouseEntered

    private void locaBtn11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn11MouseExited
        locaPa11.setVisible(false);
    }//GEN-LAST:event_locaBtn11MouseExited

    private void locaBtn9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn9MouseEntered
        locaPa9.setVisible(true);
    }//GEN-LAST:event_locaBtn9MouseEntered

    private void locaBtn9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn9MouseExited
        locaPa9.setVisible(false);
    }//GEN-LAST:event_locaBtn9MouseExited

    private void locaBtn8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn8MouseEntered
        locaPa8.setVisible(true);
    }//GEN-LAST:event_locaBtn8MouseEntered

    private void locaBtn8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn8MouseExited
        locaPa8.setVisible(false);
    }//GEN-LAST:event_locaBtn8MouseExited

    private void locaBtn3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn3MouseEntered
        locaPa3.setVisible(true);
    }//GEN-LAST:event_locaBtn3MouseEntered

    private void locaBtn3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn3MouseExited
        locaPa3.setVisible(false);
    }//GEN-LAST:event_locaBtn3MouseExited

    private void locaBtn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn2MouseEntered
        locaPa2.setVisible(true);
    }//GEN-LAST:event_locaBtn2MouseEntered

    private void locaBtn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn2MouseExited
        locaPa2.setVisible(false);
    }//GEN-LAST:event_locaBtn2MouseExited

    private void locaBtn5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn5MouseEntered
        locaPa5.setVisible(true);
    }//GEN-LAST:event_locaBtn5MouseEntered

    private void locaBtn5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn5MouseExited
        locaPa5.setVisible(false);
    }//GEN-LAST:event_locaBtn5MouseExited

    private void locaBtn6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn6MouseEntered
        locaPa6.setVisible(true);
    }//GEN-LAST:event_locaBtn6MouseEntered

    private void locaBtn6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn6MouseExited
        locaPa6.setVisible(false);
    }//GEN-LAST:event_locaBtn6MouseExited

    private void locaBtn7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn7MouseEntered
        locaPa7.setVisible(true);
    }//GEN-LAST:event_locaBtn7MouseEntered

    private void locaBtn7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn7MouseExited
        locaPa7.setVisible(false);
    }//GEN-LAST:event_locaBtn7MouseExited

    private void locaBtn32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn32MouseEntered
        locaPa32.setVisible(true);
    }//GEN-LAST:event_locaBtn32MouseEntered

    private void locaBtn32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn32MouseExited
        locaPa32.setVisible(false);
    }//GEN-LAST:event_locaBtn32MouseExited

    private void locaBtn47MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn47MouseEntered
        locaPa47.setVisible(true);
    }//GEN-LAST:event_locaBtn47MouseEntered

    private void locaBtn47MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn47MouseExited
        locaPa47.setVisible(false);
    }//GEN-LAST:event_locaBtn47MouseExited

    private void locaBtn34MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn34MouseEntered
        locaPa34.setVisible(true);
    }//GEN-LAST:event_locaBtn34MouseEntered

    private void locaBtn34MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn34MouseExited
        locaPa34.setVisible(false);
    }//GEN-LAST:event_locaBtn34MouseExited

    private void locaBtn36MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn36MouseEntered
        locaPa36.setVisible(true);
    }//GEN-LAST:event_locaBtn36MouseEntered

    private void locaBtn36MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn36MouseExited
        locaPa36.setVisible(false);
    }//GEN-LAST:event_locaBtn36MouseExited

    private void locaBtn37MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn37MouseEntered
        locaPa37.setVisible(true);
    }//GEN-LAST:event_locaBtn37MouseEntered

    private void locaBtn37MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn37MouseExited
        locaPa37.setVisible(false);
    }//GEN-LAST:event_locaBtn37MouseExited

    private void locaBtn46MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn46MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_locaBtn46MouseDragged

    private void locaBtn46MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn46MouseEntered
        locaPa46.setVisible(true);
    }//GEN-LAST:event_locaBtn46MouseEntered

    private void locaBtn46MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn46MouseExited
        locaPa46.setVisible(false);
    }//GEN-LAST:event_locaBtn46MouseExited

    private void locaBtn39MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn39MouseEntered
        locaPa39.setVisible(true);
    }//GEN-LAST:event_locaBtn39MouseEntered

    private void locaBtn39MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn39MouseExited
        locaPa39.setVisible(false);
    }//GEN-LAST:event_locaBtn39MouseExited

    private void locaBtn38MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn38MouseEntered
        locaPa38.setVisible(true);
    }//GEN-LAST:event_locaBtn38MouseEntered

    private void locaBtn38MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn38MouseExited
        locaPa38.setVisible(false);
    }//GEN-LAST:event_locaBtn38MouseExited

    private void locaBtn42MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn42MouseEntered
       locaPa42.setVisible(true);
    }//GEN-LAST:event_locaBtn42MouseEntered

    private void locaBtn42MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn42MouseExited
        locaPa42.setVisible(false);
    }//GEN-LAST:event_locaBtn42MouseExited

    private void locaBtn41MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn41MouseEntered
        locaPa41.setVisible(true);
    }//GEN-LAST:event_locaBtn41MouseEntered

    private void locaBtn41MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn41MouseExited
        locaPa41.setVisible(false);
    }//GEN-LAST:event_locaBtn41MouseExited

    private void locaBtn40MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn40MouseEntered
        locaPa40.setVisible(true);
    }//GEN-LAST:event_locaBtn40MouseEntered

    private void locaBtn40MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn40MouseExited
        locaPa40.setVisible(false);
    }//GEN-LAST:event_locaBtn40MouseExited

    private void locaBtn43MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn43MouseEntered
        locaPa43.setVisible(true);
    }//GEN-LAST:event_locaBtn43MouseEntered

    private void locaBtn43MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn43MouseExited
        locaPa43.setVisible(false);
    }//GEN-LAST:event_locaBtn43MouseExited

    private void locaBtn44MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn44MouseEntered
        locaPa44.setVisible(true);
    }//GEN-LAST:event_locaBtn44MouseEntered

    private void locaBtn44MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn44MouseExited
        locaPa44.setVisible(false);
    }//GEN-LAST:event_locaBtn44MouseExited

    private void locaBtn45MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn45MouseEntered
        locaPa45.setVisible(true);
    }//GEN-LAST:event_locaBtn45MouseEntered

    private void locaBtn45MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn45MouseExited
        locaPa45.setVisible(false);
    }//GEN-LAST:event_locaBtn45MouseExited

    private void locaBtn45_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn45_2MouseEntered
        locaPa45_2.setVisible(true);
    }//GEN-LAST:event_locaBtn45_2MouseEntered

    private void locaBtn45_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn45_2MouseExited
        locaPa45_2.setVisible(false);
    }//GEN-LAST:event_locaBtn45_2MouseExited

    private void locaBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn1MouseEntered
        locaPa1.setVisible(true);
    }//GEN-LAST:event_locaBtn1MouseEntered

    private void locaBtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locaBtn1MouseExited
        locaPa1.setVisible(false);
    }//GEN-LAST:event_locaBtn1MouseExited

    private void setAllButtonWhite(){
        Color w = Color.LIGHT_GRAY;
        locaBtn1.setBackground(w);
        locaBtn1_2.setBackground(w);
        locaBtn2.setBackground(w);
        locaBtn3.setBackground(w);
        locaBtn4.setBackground(w);
        locaBtn5.setBackground(w);
        locaBtn6.setBackground(w);
        locaBtn7.setBackground(w);
        locaBtn8.setBackground(w);
        locaBtn9.setBackground(w);
        locaBtn10.setBackground(w);
        locaBtn11.setBackground(w);
        locaBtn12.setBackground(w);
        locaBtn13.setBackground(w);
        locaBtn14.setBackground(w);
        locaBtn15.setBackground(w);
        locaBtn16.setBackground(w);
        locaBtn17.setBackground(w);
        locaBtn18.setBackground(w);
        locaBtn19.setBackground(w);
        locaBtn20.setBackground(w);
        locaBtn21.setBackground(w);
        locaBtn22.setBackground(w);
        locaBtn23.setBackground(w);
        locaBtn51.setBackground(w);
        locaBtn24.setBackground(w);
        locaBtn25.setBackground(w);
        locaBtn26.setBackground(w);
        locaBtn27.setBackground(w);
        locaBtn28.setBackground(w);
        locaBtn29.setBackground(w);
        locaBtn30.setBackground(w);
        locaBtn31.setBackground(w);
        locaBtn32.setBackground(w);
        locaBtn33.setBackground(w);
        locaBtn34.setBackground(w);
        locaBtn35.setBackground(w);
        locaBtn36.setBackground(w);
        locaBtn37.setBackground(w);
        locaBtn38.setBackground(w);
        locaBtn39.setBackground(w);
        locaBtn40.setBackground(w);
        locaBtn41.setBackground(w);
        locaBtn42.setBackground(w);
        locaBtn43.setBackground(w);
        locaBtn44.setBackground(w);
        locaBtn45.setBackground(w);
        locaBtn45_2.setBackground(w);
        locaBtn46.setBackground(w);
        locaBtn47.setBackground(w);
        locaBtn48.setBackground(w);
        locaBtn49.setBackground(w);
        locaBtn50.setBackground(w);
        locaBtn51.setBackground(w);
    }
//แก้การแสดงผล locaBtn ที่ตรงนี้
    private void search(){
        setAllButtonWhite();
        ModelMaps mp = new ModelMaps();
        String temp = jTextField1.getText();
        for (int i = 0; i <temp.length(); i++) {
            if(temp.charAt(i)=='%'||temp.charAt(i)=='_'||temp.charAt(0)==' '||temp.charAt(i)=='\''){
                temp = "ไม่พบ";
            }
        }
        
        ResultSet rs = mp.findByName(temp);
        Color on = Color.GREEN;
        try{
            int i = 0;
            if(jTextField1.getText().equals("") || jTextField1.getText().equals(" ")){
                throw new BlankSearchException();
            }
                while(rs.next()){
                    int id = rs.getInt("locationId");
                    switch(id){
                        case 1:locaBtn1.setBackground(on);++i;locaBtn1_2.setBackground(on);++i;break;
                        case 2:locaBtn2.setBackground(on);++i;break;
                        case 3:locaBtn3.setBackground(on);++i;break;
                        case 4:locaBtn4.setBackground(on);++i;break;
                        case 5:locaBtn5.setBackground(on);++i;break;
                        case 6:locaBtn6.setBackground(on);++i;break;
                        case 7:locaBtn7.setBackground(on);++i;break;
                        case 8:locaBtn8.setBackground(on);++i;break;
                        case 9:locaBtn9.setBackground(on);++i;break;
                        case 10:locaBtn10.setBackground(on);++i;break;
                        case 11:locaBtn11.setBackground(on);++i;break;
                        case 12:locaBtn12.setBackground(on);++i;break;
                        case 13:locaBtn13.setBackground(on);++i;break;
                        case 14:locaBtn14.setBackground(on);++i;break;
                        case 15:locaBtn15.setBackground(on);++i;break;
                        case 16:locaBtn16.setBackground(on);++i;break;
                        case 17:locaBtn17.setBackground(on);++i;break;
                        case 18:locaBtn18.setBackground(on);++i;break;
                        case 19:locaBtn19.setBackground(on);++i;break;
                        case 20:locaBtn20.setBackground(on);++i;break;
                        case 21:locaBtn21.setBackground(on);++i;break;
                        case 22:locaBtn22.setBackground(on);++i;break;
                        case 23:locaBtn23.setBackground(on);++i;break;
                        case 24:locaBtn24.setBackground(on);++i;break;
                        case 25:locaBtn25.setBackground(on);++i;break;
                        case 26:locaBtn26.setBackground(on);++i;break;
                        case 27:locaBtn27.setBackground(on);++i;break;
                        case 28:locaBtn28.setBackground(on);++i;break;
                        case 29:locaBtn29.setBackground(on);++i;break;
                        case 30:locaBtn30.setBackground(on);++i;break;
                        case 31:locaBtn31.setBackground(on);++i;break;
                        case 32:locaBtn32.setBackground(on);++i;break;
                        case 33:locaBtn33.setBackground(on);++i;break;
                        case 34:locaBtn34.setBackground(on);++i;break;
                        case 35:locaBtn35.setBackground(on);++i;break;
                        case 36:locaBtn36.setBackground(on);++i;break;
                        case 37:locaBtn37.setBackground(on);++i;break;
                        case 38:locaBtn38.setBackground(on);++i;break;
                        case 39:locaBtn39.setBackground(on);++i;break;
                        case 40:locaBtn40.setBackground(on);++i;break;
                        case 41:locaBtn41.setBackground(on);++i;break;
                        case 42:locaBtn42.setBackground(on);++i;break;
                        case 43:locaBtn43.setBackground(on);++i;break;
                        case 44:locaBtn44.setBackground(on);++i;break;
                        case 45:locaBtn45.setBackground(on);++i;locaBtn45_2.setBackground(on);++i;break;
                        case 46:locaBtn46.setBackground(on);++i;break;
                        case 47:locaBtn47.setBackground(on);++i;break;
                        case 48:locaBtn46.setBackground(on);++i;break;
                        case 49:locaBtn49.setBackground(on);++i;break;
                        case 50:locaBtn50.setBackground(on);++i;break;
                        case 51:locaBtn51.setBackground(on);++i;break;
                    }
                }
                if(i!=0){
                    JOptionPane.showMessageDialog(null,"พบ "+i+" สถานที่");
                }
                jTextField1.setText("");
                if(i==0){
                    throw new LocationNotMatchException();
                }
        }catch(SQLException e){
//            JOptionPane.showMessageDialog(null,e.getMessage());
        }catch(LocationNotMatchException e){
            Warning.setWarning(e.getMessage());
            new Warning(new JFrame(), true).setVisible(true);
        }catch(BlankSearchException e){
            Warning.setWarning(e.getMessage());
            new Warning(new JFrame(), true).setVisible(true);
        }
    }
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       search();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if(jTextField1.getText().equals("กรุณาใส่ชื่อสถานที่ตรงนี้")){
            localWarn = "";
            jTextField1.setText(localWarn);
            localWarn = "กรุณาใส่ชื่อสถานที่ที่นี่";
            jTextField1.setForeground(Color.black);
        }
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_UNDERSCORE){
            if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
               search();
            }   
        }
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            search();
        }
    }//GEN-LAST:event_jTextField1KeyPressed
    private void clickLocation(){
        this.dispose();
        new ProblemReport().setVisible(true);
    }
    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed

    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        if(jTextField1.getText().equals("กรุณาใส่ชื่อสถานที่ตรงนี้")){
            localWarn = "";
            jTextField1.setText(localWarn);
            localWarn = "กรุณาใส่ชื่อสถานที่ที่นี่";
            jTextField1.setForeground(Color.black);
        }
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jLabel58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel58MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel58MouseClicked
    
    private void closePage(){
        this.dispose();
        new ProblemList().setVisible(true);
    }
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
            java.util.logging.Logger.getLogger(map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        ConnectDB.ConnectDaB();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new map().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton locaBtn1;
    private javax.swing.JButton locaBtn10;
    private javax.swing.JButton locaBtn11;
    private javax.swing.JButton locaBtn12;
    private javax.swing.JButton locaBtn13;
    private javax.swing.JButton locaBtn14;
    private javax.swing.JButton locaBtn15;
    private javax.swing.JButton locaBtn16;
    private javax.swing.JButton locaBtn17;
    private javax.swing.JButton locaBtn18;
    private javax.swing.JButton locaBtn19;
    private javax.swing.JButton locaBtn1_2;
    private javax.swing.JButton locaBtn2;
    private javax.swing.JButton locaBtn20;
    private javax.swing.JButton locaBtn21;
    private javax.swing.JButton locaBtn22;
    private javax.swing.JButton locaBtn23;
    private javax.swing.JButton locaBtn24;
    private javax.swing.JButton locaBtn25;
    private javax.swing.JButton locaBtn25_2;
    private javax.swing.JButton locaBtn26;
    private javax.swing.JButton locaBtn27;
    private javax.swing.JButton locaBtn28;
    private javax.swing.JButton locaBtn29;
    private javax.swing.JButton locaBtn3;
    private javax.swing.JButton locaBtn30;
    private javax.swing.JButton locaBtn31;
    private javax.swing.JButton locaBtn32;
    private javax.swing.JButton locaBtn33;
    private javax.swing.JButton locaBtn34;
    private javax.swing.JButton locaBtn35;
    private javax.swing.JButton locaBtn36;
    private javax.swing.JButton locaBtn37;
    private javax.swing.JButton locaBtn38;
    private javax.swing.JButton locaBtn39;
    private javax.swing.JButton locaBtn4;
    private javax.swing.JButton locaBtn40;
    private javax.swing.JButton locaBtn41;
    private javax.swing.JButton locaBtn42;
    private javax.swing.JButton locaBtn43;
    private javax.swing.JButton locaBtn44;
    private javax.swing.JButton locaBtn45;
    private javax.swing.JButton locaBtn45_2;
    private javax.swing.JButton locaBtn46;
    private javax.swing.JButton locaBtn47;
    private javax.swing.JButton locaBtn48;
    private javax.swing.JButton locaBtn49;
    private javax.swing.JButton locaBtn5;
    private javax.swing.JButton locaBtn50;
    private javax.swing.JButton locaBtn51;
    private javax.swing.JButton locaBtn6;
    private javax.swing.JButton locaBtn7;
    private javax.swing.JButton locaBtn8;
    private javax.swing.JButton locaBtn9;
    private javax.swing.JPanel locaPa1;
    private javax.swing.JPanel locaPa10;
    private javax.swing.JPanel locaPa11;
    private javax.swing.JPanel locaPa12;
    private javax.swing.JPanel locaPa13;
    private javax.swing.JPanel locaPa14;
    private javax.swing.JPanel locaPa15;
    private javax.swing.JPanel locaPa16;
    private javax.swing.JPanel locaPa17;
    private javax.swing.JPanel locaPa18;
    private javax.swing.JPanel locaPa19;
    private javax.swing.JPanel locaPa1_2;
    private javax.swing.JPanel locaPa2;
    private javax.swing.JPanel locaPa20;
    private javax.swing.JPanel locaPa21;
    private javax.swing.JPanel locaPa22;
    private javax.swing.JPanel locaPa23;
    private javax.swing.JPanel locaPa24;
    private javax.swing.JPanel locaPa25;
    private javax.swing.JPanel locaPa25_2;
    private javax.swing.JPanel locaPa26;
    private javax.swing.JPanel locaPa27;
    private javax.swing.JPanel locaPa28;
    private javax.swing.JPanel locaPa29;
    private javax.swing.JPanel locaPa3;
    private javax.swing.JPanel locaPa30;
    private javax.swing.JPanel locaPa31;
    private javax.swing.JPanel locaPa32;
    private javax.swing.JPanel locaPa33;
    private javax.swing.JPanel locaPa34;
    private javax.swing.JPanel locaPa35;
    private javax.swing.JPanel locaPa36;
    private javax.swing.JPanel locaPa37;
    private javax.swing.JPanel locaPa38;
    private javax.swing.JPanel locaPa39;
    private javax.swing.JPanel locaPa4;
    private javax.swing.JPanel locaPa40;
    private javax.swing.JPanel locaPa41;
    private javax.swing.JPanel locaPa42;
    private javax.swing.JPanel locaPa43;
    private javax.swing.JPanel locaPa44;
    private javax.swing.JPanel locaPa45;
    private javax.swing.JPanel locaPa45_2;
    private javax.swing.JPanel locaPa46;
    private javax.swing.JPanel locaPa47;
    private javax.swing.JPanel locaPa48;
    private javax.swing.JPanel locaPa49;
    private javax.swing.JPanel locaPa5;
    private javax.swing.JPanel locaPa50;
    private javax.swing.JPanel locaPa51;
    private javax.swing.JPanel locaPa6;
    private javax.swing.JPanel locaPa7;
    private javax.swing.JPanel locaPa8;
    private javax.swing.JPanel locaPa9;
    // End of variables declaration//GEN-END:variables

}
