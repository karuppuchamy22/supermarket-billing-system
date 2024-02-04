
import java.sql.PreparedStatement;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class receipt extends javax.swing.JFrame {

    
    public receipt() {
        initComponents();
        
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
    }
        
   public void addtable(int id ,String name,int qty,Double price){
       DefaultTableModel dt=  (DefaultTableModel) jTable1.getModel();
       
         DecimalFormat df=new DecimalFormat("00.00");
           double totprice=price*Double.valueOf(qty);
           String Totalprice=df.format(totprice);
           
       // add check
       for(int row=0; row<jTable1.getRowCount(); row++){
           if(name==jTable1.getValueAt(row, 1)){
               dt.removeRow(jTable1.convertRowIndexToModel(row));
           } 
       }
       
       
       
       Vector v= new Vector();
       
       v.add(id);
        v.add(name);
         v.add(qty);
          v.add(Totalprice);
              dt.addRow(v);
   }
    
       public void calc(){
           int numOfRow=jTable1.getRowCount();
           double tot= 0.0 ;
            
           for (int i = 0; i < numOfRow; i++) {
               double value=Double.valueOf(jTable1.getValueAt(i, 3).toString());
               tot += value;
           }
            DecimalFormat df=new DecimalFormat("00.00");
            b1.setText(df.format(tot));
       }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        peas = new javax.swing.JButton();
        q1 = new javax.swing.JLabel();
        capsium = new javax.swing.JButton();
        carrot = new javax.swing.JButton();
        tomato = new javax.swing.JButton();
        cauliflower = new javax.swing.JButton();
        potato = new javax.swing.JButton();
        q6 = new javax.swing.JLabel();
        q3 = new javax.swing.JLabel();
        q4 = new javax.swing.JLabel();
        q5 = new javax.swing.JLabel();
        q2 = new javax.swing.JLabel();
        kg1 = new javax.swing.JLabel();
        kg2 = new javax.swing.JLabel();
        kg3 = new javax.swing.JLabel();
        kg4 = new javax.swing.JLabel();
        kg5 = new javax.swing.JLabel();
        kg6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        prnt = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        b2 = new javax.swing.JTextField();
        pay = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        finish = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        z1 = new javax.swing.JLabel();
        kg8 = new javax.swing.JLabel();
        mango = new javax.swing.JButton();
        orange = new javax.swing.JButton();
        banana = new javax.swing.JButton();
        apple = new javax.swing.JButton();
        strawberry = new javax.swing.JButton();
        z3 = new javax.swing.JLabel();
        z2 = new javax.swing.JLabel();
        z4 = new javax.swing.JLabel();
        z5 = new javax.swing.JLabel();
        z6 = new javax.swing.JLabel();
        kg9 = new javax.swing.JLabel();
        kg10 = new javax.swing.JLabel();
        kg11 = new javax.swing.JLabel();
        kg12 = new javax.swing.JLabel();
        kg13 = new javax.swing.JLabel();
        grapes = new javax.swing.JButton();
        finish1 = new javax.swing.JButton();
        save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        peas.setIcon(new javax.swing.ImageIcon("D:\\SUPERMART\\PEAS.jpg")); // NOI18N
        peas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peasActionPerformed(evt);
            }
        });

        q1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q1.setText("0");

        capsium.setIcon(new javax.swing.ImageIcon("D:\\SUPERMART\\CAPSICUM.jpg")); // NOI18N
        capsium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capsiumActionPerformed(evt);
            }
        });

        carrot.setIcon(new javax.swing.ImageIcon("D:\\SUPERMART\\CARROT.jpg")); // NOI18N
        carrot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrotActionPerformed(evt);
            }
        });

        tomato.setIcon(new javax.swing.ImageIcon("D:\\SUPERMART\\TOMATO.jpg")); // NOI18N
        tomato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomatoActionPerformed(evt);
            }
        });

        cauliflower.setIcon(new javax.swing.ImageIcon("D:\\SUPERMART\\CAULIFLOWER.jpg")); // NOI18N
        cauliflower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cauliflowerActionPerformed(evt);
            }
        });

        potato.setIcon(new javax.swing.ImageIcon("D:\\SUPERMART\\POTATO.jpg")); // NOI18N
        potato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potatoActionPerformed(evt);
            }
        });

        q6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q6.setText("0");

        q3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q3.setText("0");

        q4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q4.setText("0");

        q5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q5.setText("0");

        q2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q2.setText("0");

        kg1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kg1.setText("kg");

        kg2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kg2.setText("kg");

        kg3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kg3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kg3.setText("kg");

        kg4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kg4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kg4.setText("kg");

        kg5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kg5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kg5.setText("kg");

        kg6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kg6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kg6.setText("kg");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("VEGETABLES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cauliflower, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(capsium, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kg5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kg2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(peas, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(potato, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kg4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(kg1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(141, 141, 141)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kg3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tomato, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carrot, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(q6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kg6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(peas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tomato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(capsium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kg3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kg2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kg1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(potato)
                    .addComponent(carrot, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cauliflower, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kg5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kg4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kg6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(q6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ITEM", "QTY", "PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        prnt.setColumns(20);
        prnt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        prnt.setRows(5);
        prnt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prntMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(prnt);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setText("TOTAL : ");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setText("CASH :");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setText("BALANCE  =");

        b3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        b3.setText("00");

        b1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        b1.setText("00");

        b2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N

        pay.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pay.setText("PAY");
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pay)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(b1)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(pay)))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        finish.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        finish.setText("PRINT");
        finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("FRUITS");

        z1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        z1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        z1.setText("0");

        kg8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kg8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kg8.setText("kg");

        mango.setIcon(new javax.swing.ImageIcon("D:\\SUPERMART\\MANGO.jpg")); // NOI18N
        mango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mangoActionPerformed(evt);
            }
        });

        orange.setIcon(new javax.swing.ImageIcon("D:\\SUPERMART\\ORANGE.jpg")); // NOI18N
        orange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orangeActionPerformed(evt);
            }
        });

        banana.setIcon(new javax.swing.ImageIcon("D:\\SUPERMART\\BANANA.jpg")); // NOI18N
        banana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bananaActionPerformed(evt);
            }
        });

        apple.setIcon(new javax.swing.ImageIcon("D:\\SUPERMART\\APPLE.jpg")); // NOI18N
        apple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appleActionPerformed(evt);
            }
        });

        strawberry.setIcon(new javax.swing.ImageIcon("D:\\SUPERMART\\strawberry.jpg")); // NOI18N
        strawberry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                strawberryActionPerformed(evt);
            }
        });

        z3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        z3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        z3.setText("0");

        z2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        z2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        z2.setText("0");

        z4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        z4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        z4.setText("0");

        z5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        z5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        z5.setText("0");

        z6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        z6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        z6.setText("0");

        kg9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kg9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kg9.setText("kg");

        kg10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kg10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kg10.setText("kg");

        kg11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kg11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kg11.setText("kg");

        kg12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kg12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kg12.setText("kg");

        kg13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kg13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kg13.setText("kg");

        grapes.setIcon(new javax.swing.ImageIcon("D:\\SUPERMART\\GRAPES.jpg")); // NOI18N
        grapes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grapesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(z4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kg12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(z1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(kg10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(apple, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(grapes, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(banana, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(z5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kg13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(mango, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(z6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kg11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(strawberry, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orange, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(z2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kg9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(z3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kg8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGap(133, 133, 133))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(grapes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(z1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kg10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(apple)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(z4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kg12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(orange, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(z2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kg9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(kg8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(z3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(mango, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(strawberry, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(z6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kg11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(banana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(kg13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(z5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11))))))
        );

        finish1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        finish1.setText("EXIT");
        finish1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish1ActionPerformed(evt);
            }
        });

        save.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(finish1)
                                .addGap(68, 68, 68)
                                .addComponent(save)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(finish))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(finish1)
                            .addComponent(save)
                            .addComponent(finish)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void peasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peasActionPerformed
       
         int i=Integer.valueOf(q2.getText());
        ++i;
        q2.setText(String.valueOf(i));
        
        addtable(2,"peas", i,10.00);
        
        calc();
    }//GEN-LAST:event_peasActionPerformed

    private void capsiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capsiumActionPerformed
        
        int i=Integer.valueOf(q1.getText());
        ++i;
        q1.setText(String.valueOf(i));
        
        addtable(1,"capsicum", i,5.00);
        
        calc();
    }//GEN-LAST:event_capsiumActionPerformed

    private void carrotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrotActionPerformed
        int i=Integer.valueOf(q6.getText());
        ++i;
        q6.setText(String.valueOf(i));
        
        addtable(6,"carrot", i,27.00);
        
        calc();
    }//GEN-LAST:event_carrotActionPerformed

    private void tomatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomatoActionPerformed
       int i=Integer.valueOf(q3.getText());
        ++i;
        q3.setText(String.valueOf(i));
        
        addtable(3,"tomato", i,14.00);
        
        calc();
    }//GEN-LAST:event_tomatoActionPerformed

    private void cauliflowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cauliflowerActionPerformed
       int i=Integer.valueOf(q4.getText());
        ++i;
        q4.setText(String.valueOf(i));
        
        addtable(4,"cauliflower", i,18.00);
        
        calc();
    }//GEN-LAST:event_cauliflowerActionPerformed

    private void potatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potatoActionPerformed
        int i=Integer.valueOf(q5.getText());
        ++i;
        q5.setText(String.valueOf(i));
        
        addtable(5,"potato", i,23.00);
        
        calc();
    }//GEN-LAST:event_potatoActionPerformed

    private void finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishActionPerformed
        try{
            prnt.setText("                                    SUPER MARKET \n");
            prnt.setText(prnt.getText()+"                              4/121, 7th CROSS ROAD, \n");
            prnt.setText(prnt.getText()+"                              VEDASANDUR,DINDIGUL, \n");
            prnt.setText(prnt.getText()+"                                   +91 92052 05644 \n");
    prnt.setText(prnt.getText()+"--------------------------------------------------------------------------------------- \n");
            prnt.setText(prnt.getText()+"ITEM \t\tQTY \tPRICE"+"\n");
    prnt.setText(prnt.getText()+"--------------------------------------------------------------------------------------- \n");
                
    
              DefaultTableModel dt=  (DefaultTableModel) jTable1.getModel();
              //get product details
              for(int i=0; i<jTable1.getRowCount(); i++)
              {
                  String name=dt.getValueAt(i, 1).toString();
                  String qty=dt.getValueAt(i, 2).toString();
                  String price=dt.getValueAt(i, 3).toString();
                  
                  prnt.setText(prnt.getText()+" "+name +"\t\t" +qty +"\t"+ price+"\n");
              }  
    prnt.setText(prnt.getText()+"--------------------------------------------------------------------------------------- \n");
                   prnt.setText(prnt.getText()+"\t\t      total  :"+ b1.getText()+"\n");
            prnt.setText(prnt.getText()+"\t\t      cash   :"+ b2.getText()+"\n");
            prnt.setText(prnt.getText()+"\t\t      balance:"+ b3.getText()+"\n");
    prnt.setText(prnt.getText()+"--------------------------------------------------------------------------------------- \n");       
            prnt.setText(prnt.getText()+"\t            thank you !!!"+"\n");
            prnt.setText(prnt.getText()+"\tsoftware by SUPER D MART"+"\n");
    prnt.setText(prnt.getText()+"--------------------------------------------------------------------------------------- \n");      
              }
            
        catch(Exception eco){
            
        }
       
    }//GEN-LAST:event_finishActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        DefaultTableModel dt=  (DefaultTableModel) jTable1.getModel();
        
        String r=dt.getValueAt(jTable1.getSelectedRow(), 0).toString();
        
        int rw=jTable1.getSelectedRow();
        dt.removeRow(rw);
        
        switch(r){
            case "1" :
                q1.setText("0");
                break;
            case "2" :
                q2.setText("0");
                break;
            case "3" :
                q3.setText("0");
                break;
            case "4" :
                q4.setText("0");
                break;
            case "5" :
                q5.setText("0");
                break;
            case "6" :
                q6.setText("0");
                break;
                
                
            case "7" :
                z1.setText("0");
                break;
            case "8" :
                z2.setText("0");
                break;
            case "9" :
                z3.setText("0");
                break;
            case "10" :
                z4.setText("0");
                break;
            case "11" :
                z5.setText("0");
                break;
            case "12" :
                z6.setText("0");
                break;
            default:
                System.out.println("over");
                   
                    
           
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        
        double tot =Double.valueOf(b1.getText());
        double paid=Double.valueOf(b2.getText());
        double balance=paid-tot;
        
         DecimalFormat df=new DecimalFormat("00.00");
        
        b3.setText(String.valueOf(df.format(balance)));
    }//GEN-LAST:event_payActionPerformed

    private void prntMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prntMouseClicked
       
         
    }//GEN-LAST:event_prntMouseClicked

    private void grapesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grapesActionPerformed
       int i=Integer.valueOf(z1.getText());
        ++i;
        z1.setText(String.valueOf(i));
        
        addtable(7,"grapes", i,50.00);
        
        calc();
    }//GEN-LAST:event_grapesActionPerformed

    private void orangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orangeActionPerformed
          int i=Integer.valueOf(z3.getText());
        ++i;
        z3.setText(String.valueOf(i));
        
        addtable(9,"orange", i,68.00);
        
        calc();
        
    }//GEN-LAST:event_orangeActionPerformed

    private void mangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mangoActionPerformed
        int i=Integer.valueOf(z2.getText());
        ++i;
        z2.setText(String.valueOf(i));
        
        addtable(8,"mango", i,60.00);
        
        calc();
    }//GEN-LAST:event_mangoActionPerformed

    private void strawberryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_strawberryActionPerformed
        int i=Integer.valueOf(z6.getText());
        ++i;
        z6.setText(String.valueOf(i));
        
        addtable(12,"strawberry", i,123.00);
        
        calc();
    }//GEN-LAST:event_strawberryActionPerformed

    private void bananaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bananaActionPerformed
       int i=Integer.valueOf(z5.getText());
        ++i;
        z5.setText(String.valueOf(i));
        
        addtable(11,"banana", i,44.00);
        
        calc();
    }//GEN-LAST:event_bananaActionPerformed

    private void appleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appleActionPerformed
        int i=Integer.valueOf(z4.getText());
        ++i;
        z4.setText(String.valueOf(i));
        
        addtable(10,"apple", i,79.00);
        
        calc();
    }//GEN-LAST:event_appleActionPerformed

    private void finish1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_finish1ActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        String name=jTable1.getToolTipText();
        String quantity=jTable1.getToolTipText();
        String price=jTable1.getToolTipText();
        String total=b1.getText();
        String cash=b2.getText();
        String balance=b3.getText();
        
        PreparedStatement dora;
        String query="INSERT INTO `billrcpt`(`name`, `quantity`,`price`,`total`,`cash`,`balance`)VALUES(?,?,?,?,?,?)";
        
         try{
            dora=connectivity.getConnection().prepareStatement(query);
            dora.setString(1, name);
            dora.setString(2,quantity);
            dora.setString(3,price);
            dora.setString(4,total);
            dora.setString(5,cash);
            dora.setString(6,balance);

            if(dora.executeUpdate()>0)
            {
                JOptionPane.showMessageDialog(null, "saved successfully into DATABASE !");
            }
            
        
        }catch( Exception doc){
             System.out.println(doc);
        }
    }//GEN-LAST:event_saveActionPerformed

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
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new receipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apple;
    private javax.swing.JLabel b1;
    private javax.swing.JTextField b2;
    private javax.swing.JLabel b3;
    private javax.swing.JButton banana;
    private javax.swing.JButton capsium;
    private javax.swing.JButton carrot;
    private javax.swing.JButton cauliflower;
    private javax.swing.JButton delete;
    private javax.swing.JButton finish;
    private javax.swing.JButton finish1;
    private javax.swing.JButton grapes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel kg1;
    private javax.swing.JLabel kg10;
    private javax.swing.JLabel kg11;
    private javax.swing.JLabel kg12;
    private javax.swing.JLabel kg13;
    private javax.swing.JLabel kg2;
    private javax.swing.JLabel kg3;
    private javax.swing.JLabel kg4;
    private javax.swing.JLabel kg5;
    private javax.swing.JLabel kg6;
    private javax.swing.JLabel kg8;
    private javax.swing.JLabel kg9;
    private javax.swing.JButton mango;
    private javax.swing.JButton orange;
    private javax.swing.JButton pay;
    private javax.swing.JButton peas;
    private javax.swing.JButton potato;
    private javax.swing.JTextArea prnt;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel q4;
    private javax.swing.JLabel q5;
    private javax.swing.JLabel q6;
    private javax.swing.JButton save;
    private javax.swing.JButton strawberry;
    private javax.swing.JButton tomato;
    private javax.swing.JLabel z1;
    private javax.swing.JLabel z2;
    private javax.swing.JLabel z3;
    private javax.swing.JLabel z4;
    private javax.swing.JLabel z5;
    private javax.swing.JLabel z6;
    // End of variables declaration//GEN-END:variables
}
