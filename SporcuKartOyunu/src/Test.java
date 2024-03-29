
import java.awt.Color;
import java.util.Random;
import oyuncular.Bilgisayar;
import oyuncular.Kullanici;
import sporcular.Sporcu;

public class Test extends javax.swing.JFrame {

    /**
     * Creates new form Game
     */
    Kullanici kullanici;    // Parametre olarak gelen kullanici nesnesini tutar
    Bilgisayar bilgisayar;  // Parametre olarak gelen bilgisayar nesnesini tutar
    String futbolcuArka = "images/futbolcuArka.png";        // Futbolcu kartlarının arka yüz resminin uzantısı
    String basketbolcuArka = "images/basketbolcuArka.png";  // Basketbolcu kartlarının arka yüz resminin uzantısı
    boolean futbolcuMu = true;  // Oyun sırasının hangi tip kartta olduğunu tutar

    public Test(Kullanici kullanici, Bilgisayar bilgisayar) {
        initComponents();
        this.kullanici = kullanici;
        this.bilgisayar = bilgisayar;

        butonResimleriniKur();  // Butonların üzerine kart resimlerini yerleştirir
    }

    private Test() {
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnKullanici6 = new javax.swing.JButton();
        btnKullanici5 = new javax.swing.JButton();
        btnKullanici3 = new javax.swing.JButton();
        btnKullanici2 = new javax.swing.JButton();
        btnKullanici1 = new javax.swing.JButton();
        btnKullanici4 = new javax.swing.JButton();
        btnKullanici7 = new javax.swing.JButton();
        btnKullanici8 = new javax.swing.JButton();
        btnBilgisayar3 = new javax.swing.JButton();
        btnBilgisayar4 = new javax.swing.JButton();
        btnBilgisayar5 = new javax.swing.JButton();
        btnBilgisayar7 = new javax.swing.JButton();
        btnKullaniciKarsilasma = new javax.swing.JButton();
        btnBilgisayar6 = new javax.swing.JButton();
        btnBilgisayar8 = new javax.swing.JButton();
        btnBilgisayar2 = new javax.swing.JButton();
        btnBilgisayarKarsilasma = new javax.swing.JButton();
        btnBilgisayar1 = new javax.swing.JButton();
        lblOzellik = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblBigisayarSkor = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblKullaniciSkor = new javax.swing.JLabel();
        lblUyari = new javax.swing.JLabel();
        lblBilgisayarKarsilasma = new javax.swing.JLabel();
        lblOzellikKarsilasma = new javax.swing.JLabel();
        lblKullaniciKarsilasma = new javax.swing.JLabel();
        lblOzellik1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnKullanici6.setBorder(null);
        btnKullanici6.setContentAreaFilled(false);
        btnKullanici6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKullanici6ActionPerformed(evt);
            }
        });

        btnKullanici5.setBorder(null);
        btnKullanici5.setContentAreaFilled(false);
        btnKullanici5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKullanici5ActionPerformed(evt);
            }
        });

        btnKullanici3.setBorder(null);
        btnKullanici3.setContentAreaFilled(false);
        btnKullanici3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKullanici3ActionPerformed(evt);
            }
        });

        btnKullanici2.setBorder(null);
        btnKullanici2.setContentAreaFilled(false);
        btnKullanici2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKullanici2ActionPerformed(evt);
            }
        });

        btnKullanici1.setBorder(null);
        btnKullanici1.setContentAreaFilled(false);
        btnKullanici1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKullanici1ActionPerformed(evt);
            }
        });

        btnKullanici4.setBorder(null);
        btnKullanici4.setContentAreaFilled(false);
        btnKullanici4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKullanici4ActionPerformed(evt);
            }
        });

        btnKullanici7.setBorder(null);
        btnKullanici7.setContentAreaFilled(false);
        btnKullanici7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKullanici7ActionPerformed(evt);
            }
        });

        btnKullanici8.setBorder(null);
        btnKullanici8.setContentAreaFilled(false);
        btnKullanici8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKullanici8ActionPerformed(evt);
            }
        });

        btnBilgisayar3.setBorder(null);
        btnBilgisayar3.setContentAreaFilled(false);

        btnBilgisayar4.setBorder(null);
        btnBilgisayar4.setContentAreaFilled(false);

        btnBilgisayar5.setBorder(null);
        btnBilgisayar5.setContentAreaFilled(false);

        btnBilgisayar7.setBorder(null);
        btnBilgisayar7.setContentAreaFilled(false);
        btnBilgisayar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBilgisayar7ActionPerformed(evt);
            }
        });

        btnKullaniciKarsilasma.setBorder(null);
        btnKullaniciKarsilasma.setContentAreaFilled(false);

        btnBilgisayar6.setBorder(null);
        btnBilgisayar6.setContentAreaFilled(false);

        btnBilgisayar8.setBorder(null);
        btnBilgisayar8.setContentAreaFilled(false);

        btnBilgisayar2.setBorder(null);
        btnBilgisayar2.setContentAreaFilled(false);

        btnBilgisayarKarsilasma.setBorder(null);
        btnBilgisayarKarsilasma.setContentAreaFilled(false);
        btnBilgisayarKarsilasma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBilgisayarKarsilasmaActionPerformed(evt);
            }
        });

        btnBilgisayar1.setBorder(null);
        btnBilgisayar1.setContentAreaFilled(false);

        lblOzellik.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblOzellik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("VS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("KULLANICI");

        lblBigisayarSkor.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        lblBigisayarSkor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBigisayarSkor.setText("0");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BİLGİSAYAR");

        lblKullaniciSkor.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        lblKullaniciSkor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKullaniciSkor.setText("0");

        lblUyari.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblUyari.setForeground(new java.awt.Color(255, 0, 0));
        lblUyari.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblBilgisayarKarsilasma.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblBilgisayarKarsilasma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblOzellikKarsilasma.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblOzellikKarsilasma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblKullaniciKarsilasma.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblKullaniciKarsilasma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKullaniciKarsilasma.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        lblOzellik1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblOzellik1.setForeground(new java.awt.Color(0, 153, 153));
        lblOzellik1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOzellik1.setText("Seçilen Özellik");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnBilgisayar1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBilgisayar2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBilgisayar3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBilgisayar4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBilgisayar5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBilgisayar6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBilgisayar7, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBilgisayar8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblBigisayarSkor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnBilgisayarKarsilasma, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblOzellikKarsilasma, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblOzellik1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                    .addComponent(lblKullaniciKarsilasma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblBilgisayarKarsilasma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblOzellik, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnKullaniciKarsilasma, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblKullaniciSkor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lblUyari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnKullanici1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(btnKullanici2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnKullanici3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnKullanici4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnKullanici5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnKullanici6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnKullanici7, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnKullanici8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBilgisayar5, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBilgisayar6, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBilgisayar8, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBilgisayar7, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBilgisayar4, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBilgisayar1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBilgisayar3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBilgisayar2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblKullaniciSkor, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblBigisayarSkor, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(lblKullaniciKarsilasma, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblBilgisayarKarsilasma, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lblOzellik1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblOzellik, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblOzellikKarsilasma, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnKullaniciKarsilasma, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBilgisayarKarsilasma, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUyari, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKullanici8, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnKullanici2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnKullanici3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnKullanici5, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnKullanici6, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnKullanici4, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnKullanici1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnKullanici7, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBilgisayarKarsilasmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBilgisayarKarsilasmaActionPerformed

    }//GEN-LAST:event_btnBilgisayarKarsilasmaActionPerformed

    private void btnBilgisayar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBilgisayar7ActionPerformed


    }//GEN-LAST:event_btnBilgisayar7ActionPerformed

    private void btnKullanici3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKullanici3ActionPerformed

        if (futbolcuMu || sonKartMi()) {
            kullanici.KartSec(2);
            kullaniciKartAt(2);
            int i = bilgisayar.KartSec(0);
            bilgisayarKartAt(i);
            int r = new Random().nextInt(3);

            lblOzellik.setText(ozellikSec0(r));
            futbolcuMu = false;
            karsilastir(r, i, 2);
        } else {
            lblUyari.setText("Lütfen bir basketbolcu kartı atınız.");
        }
    }//GEN-LAST:event_btnKullanici3ActionPerformed

    private void btnKullanici1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKullanici1ActionPerformed

        if (futbolcuMu || sonKartMi()) {
            kullanici.KartSec(0);
            kullaniciKartAt(0);

            int i = bilgisayar.KartSec(0);
            bilgisayarKartAt(i);
            int r = new Random().nextInt(3);

            lblOzellik.setText(ozellikSec0(r));
            futbolcuMu = false;
            karsilastir(r, i, 0);
        } else {
            lblUyari.setText("Lütfen bir basketbolcu kartı atınız.");
        }
    }//GEN-LAST:event_btnKullanici1ActionPerformed

    private void btnKullanici2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKullanici2ActionPerformed

        if (futbolcuMu || sonKartMi()) {
            kullanici.KartSec(1);
            kullaniciKartAt(1);

            int i = bilgisayar.KartSec(0);
            bilgisayarKartAt(i);
            int r = new Random().nextInt(3);

            lblOzellik.setText(ozellikSec0(r));
            futbolcuMu = false;
            karsilastir(r, i, 1);
        } else {
            lblUyari.setText("Lütfen bir basketbolcu kartı atınız.");
        }
    }//GEN-LAST:event_btnKullanici2ActionPerformed

    private void btnKullanici4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKullanici4ActionPerformed

        if (futbolcuMu || sonKartMi()) {
            kullanici.KartSec(3);
            kullaniciKartAt(3);
            int i = bilgisayar.KartSec(0);
            bilgisayarKartAt(i);
            int r = new Random().nextInt(3);

            lblOzellik.setText(ozellikSec0(r));
            futbolcuMu = false;
            karsilastir(r, i, 3);
        } else {
            lblUyari.setText("Lütfen bir basketbolcu kartı atınız.");
        }
    }//GEN-LAST:event_btnKullanici4ActionPerformed

    private void btnKullanici5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKullanici5ActionPerformed

        if (!futbolcuMu || sonKartMi()) {
            kullanici.KartSec(4);
            kullaniciKartAt(4);
            int i = bilgisayar.KartSec(1);
            bilgisayarKartAt(i);
            int r = new Random().nextInt(3);

            lblOzellik.setText(ozellikSec1(r));
            futbolcuMu = true;
            karsilastir(r, i, 4);
        } else {
            lblUyari.setText("Lütfen bir futbolcu kartı atınız.");
        }
    }//GEN-LAST:event_btnKullanici5ActionPerformed

    private void btnKullanici6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKullanici6ActionPerformed

        if (!futbolcuMu || sonKartMi()) {
            kullanici.KartSec(5);
            kullaniciKartAt(5);

            int i = bilgisayar.KartSec(1);
            bilgisayarKartAt(i);
            int r = new Random().nextInt(3);

            lblOzellik.setText(ozellikSec1(r));
            futbolcuMu = true;
            karsilastir(r, i, 5);
        } else {
            lblUyari.setText("Lütfen bir futbolcu kartı atınız.");
        }
    }//GEN-LAST:event_btnKullanici6ActionPerformed

    private void btnKullanici7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKullanici7ActionPerformed

        if (!futbolcuMu || sonKartMi()) {
            kullanici.KartSec(6);
            kullaniciKartAt(6);
            int i = bilgisayar.KartSec(1);
            bilgisayarKartAt(i);
            int r = new Random().nextInt(3);

            lblOzellik.setText(ozellikSec1(r));
            futbolcuMu = true;
            karsilastir(r, i, 6);
        } else {
            lblUyari.setText("Lütfen bir futbolcu kartı atınız.");
        }
    }//GEN-LAST:event_btnKullanici7ActionPerformed

    private void btnKullanici8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKullanici8ActionPerformed

        if (!futbolcuMu || sonKartMi()) {
            kullanici.KartSec(7);
            kullaniciKartAt(7);
            int i = bilgisayar.KartSec(1);
            bilgisayarKartAt(i);
            int r = new Random().nextInt(3);

            lblOzellik.setText(ozellikSec1(r));
            futbolcuMu = true;
            karsilastir(r, i, 7);
        } else {
            lblUyari.setText("Lütfen bir futbolcu kartı atınız.");
        }

    }//GEN-LAST:event_btnKullanici8ActionPerformed

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
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    public String ozellikSec0(int i) {  // Futbolcu kartları için rastgele seçilen özelliği string olarak döndürür

        if (i == 0) {
            return "PENALTI";
        } else if (i == 1) {
            return "SERBEST VURUŞ";
        } else {
            return "KARŞI KARŞIYA";
        }

    }

    public String ozellikSec1(int i) {  //  Basketbolcu kartları için rastgele seçilen özelliği string olarak döndürür

        if (i == 0) {
            return "İKİLİK";
        } else if (i == 1) {
            return "ÜÇLÜK";
        } else {
            return "SERBEST ATIŞ";
        }

    }

    public boolean sonKartMi() {    // Farklı tipte kart kalıp kalmadığını kontrol eder
        int sayac1 = 0;
        int sayac2 = 0;
        for (int i = 0; i < 8; i++) {
            if (i < 4) {
                if (bilgisayar.sporcular.get(i).isKartKullanildiMi() == false) {
                    sayac1++;
                }
            } else {
                if (bilgisayar.sporcular.get(i).isKartKullanildiMi() == false) {
                    sayac2++;
                }
            }
        }
        if (sayac1 == 0 || sayac2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean kartlarBittiMi() {   // Kartların bitip bitmediğini kontrol eder
        int sayac = 0;
        for (Sporcu sporcu : bilgisayar.sporcular) {
            if (sporcu.isKartKullanildiMi() == false) {
                sayac++;
            }
        }
        if (sayac == 0) {
            return true;
        }
        return false;
    }

    public void karsilastir(int r, int b, int k) {  // Ortaya atılan kartlar için rastgele seçilen özellikleri karşılaitırır
        lblUyari.setText(null);
        if (kullanici.sporcular.get(k).sporcuPuaniGoster(r) > bilgisayar.sporcular.get(b).sporcuPuaniGoster(r)) {
            kullanici.setSkor(kullanici.getSkor() + 10);
            lblKullaniciKarsilasma.setForeground(Color.green);
            lblBilgisayarKarsilasma.setForeground(Color.red);
        } else if (kullanici.sporcular.get(k).sporcuPuaniGoster(r) < bilgisayar.sporcular.get(b).sporcuPuaniGoster(r)) {
            bilgisayar.setSkor(bilgisayar.getSkor() + 10);
            lblKullaniciKarsilasma.setForeground(Color.red);
            lblBilgisayarKarsilasma.setForeground(Color.green);
        } else {    // eğer kart puanları eşitse kartlar geri alınır
            lblKullaniciKarsilasma.setForeground(Color.orange);
            lblBilgisayarKarsilasma.setForeground(Color.orange);
            lblUyari.setText("Berabere! Kartlar geri alındı.");
            bilgisayarKartTopla(b);
            kullaniciKartTopla(k);
        }
        lblOzellikKarsilasma.setText(bilgisayar.sporcular.get(b).sporcuPuaniGoster(r) + " - " + kullanici.sporcular.get(k).sporcuPuaniGoster(r));
        lblKullaniciSkor.setText(Integer.toString(kullanici.getSkor()));
        lblBigisayarSkor.setText(Integer.toString(bilgisayar.getSkor()));
        
        // Eğer kullanılacak kart kalmamış ve skorlar eşit ise son atılan kartlar üzerinden tekrar karşılaştırma yapılır
        if (kartlarBittiMi() && kullanici.getSkor() == bilgisayar.getSkor()) {
            r = new Random().nextInt(3);
            karsilastir(r, b, k);
            if(!futbolcuMu) {
                lblOzellik.setText(ozellikSec0(r));
            } else {
                lblOzellik.setText(ozellikSec1(r));
            }
        } else if (kartlarBittiMi()) {
            if (kullanici.getSkor() > bilgisayar.getSkor()) {
                lblUyari.setText("Oyun bitti! Kullanıcı kazandı.");
            } else {
                lblUyari.setText("Oyun bitti! Bilgisayar kazandı.");
            }
        }
    }

    // kullanici için ortaya kart atma işlemi yapar
    public void kullaniciKartAt(int i) {
        switch (i) {
            case 0:
                btnKullanici1.setEnabled(false);
                break;
            case 1:
                btnKullanici2.setEnabled(false);
                break;
            case 2:
                btnKullanici3.setEnabled(false);
                break;
            case 3:
                btnKullanici4.setEnabled(false);
                break;
            case 4:
                btnKullanici5.setEnabled(false);
                break;
            case 5:
                btnKullanici6.setEnabled(false);
                break;
            case 6:
                btnKullanici7.setEnabled(false);
                break;
            case 7:
                btnKullanici8.setEnabled(false);
                break;
            default:
                break;
        }
        btnKullaniciKarsilasma.setIcon(new javax.swing.ImageIcon(getClass().getResource(kullanici.sporcular.get(i).getResimYolu())));
        lblKullaniciKarsilasma.setText(kullanici.sporcular.get(i).getSporcuIsim());
    }

    // kullanıcı için ortadaki kartı geri alma işlemi yapar
    public void kullaniciKartTopla(int i) {
        switch (i) {
            case 0:
                btnKullanici1.setEnabled(true);
                break;
            case 1:
                btnKullanici2.setEnabled(true);
                break;
            case 2:
                btnKullanici3.setEnabled(true);
                break;
            case 3:
                btnKullanici4.setEnabled(true);
                break;
            case 4:
                btnKullanici5.setEnabled(true);
                break;
            case 5:
                btnKullanici6.setEnabled(true);
                break;
            case 6:
                btnKullanici7.setEnabled(true);
                break;
            case 7:
                btnKullanici8.setEnabled(true);
                break;
            default:
                break;
        }
        kullanici.sporcular.get(i).setKartKullanildiMi(false);
        btnKullaniciKarsilasma.setIcon(null);
    }

    // bilgisayar için ortaya kart atma işlemi yapar
    public void bilgisayarKartAt(int i) {
        switch (i) {
            case 0:
                btnBilgisayar1.setEnabled(false);
                break;
            case 1:
                btnBilgisayar2.setEnabled(false);
                break;
            case 2:
                btnBilgisayar3.setEnabled(false);
                break;
            case 3:
                btnBilgisayar4.setEnabled(false);
                break;
            case 4:
                btnBilgisayar5.setEnabled(false);
                break;
            case 5:
                btnBilgisayar6.setEnabled(false);
                break;
            case 6:
                btnBilgisayar7.setEnabled(false);
                break;
            case 7:
                btnBilgisayar8.setEnabled(false);
                break;
            default:
                break;
        }
        btnBilgisayarKarsilasma.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayar.sporcular.get(i).getResimYolu())));
        lblBilgisayarKarsilasma.setText(bilgisayar.sporcular.get(i).getSporcuIsim());
    }

    // bilgisayar için ortadaki kartı geri alma işlemi yapar
    public void bilgisayarKartTopla(int i) {
        switch (i) {
            case 0:
                btnBilgisayar1.setEnabled(true);
                break;
            case 1:
                btnBilgisayar2.setEnabled(true);
                break;
            case 2:
                btnBilgisayar3.setEnabled(true);
                break;
            case 3:
                btnBilgisayar4.setEnabled(true);
                break;
            case 4:
                btnBilgisayar5.setEnabled(true);
                break;
            case 5:
                btnBilgisayar6.setEnabled(true);
                break;
            case 6:
                btnBilgisayar7.setEnabled(true);
                break;
            case 7:
                btnBilgisayar8.setEnabled(true);
                break;
            default:
                break;
        }
        bilgisayar.sporcular.get(i).setKartKullanildiMi(false);
        btnBilgisayarKarsilasma.setIcon(null);
    }

    //  butonların üzerine kart resimlerini yerleştirir
    private void butonResimleriniKur() {
        btnKullanici1.setIcon(new javax.swing.ImageIcon(getClass().getResource(kullanici.sporcular.get(0).getResimYolu())));
        btnKullanici2.setIcon(new javax.swing.ImageIcon(getClass().getResource(kullanici.sporcular.get(1).getResimYolu())));
        btnKullanici3.setIcon(new javax.swing.ImageIcon(getClass().getResource(kullanici.sporcular.get(2).getResimYolu())));
        btnKullanici4.setIcon(new javax.swing.ImageIcon(getClass().getResource(kullanici.sporcular.get(3).getResimYolu())));
        btnKullanici5.setIcon(new javax.swing.ImageIcon(getClass().getResource(kullanici.sporcular.get(4).getResimYolu())));
        btnKullanici6.setIcon(new javax.swing.ImageIcon(getClass().getResource(kullanici.sporcular.get(5).getResimYolu())));
        btnKullanici7.setIcon(new javax.swing.ImageIcon(getClass().getResource(kullanici.sporcular.get(6).getResimYolu())));
        btnKullanici8.setIcon(new javax.swing.ImageIcon(getClass().getResource(kullanici.sporcular.get(7).getResimYolu())));

        btnBilgisayar1.setIcon(new javax.swing.ImageIcon(getClass().getResource(basketbolcuArka)));
        btnBilgisayar2.setIcon(new javax.swing.ImageIcon(getClass().getResource(basketbolcuArka)));
        btnBilgisayar3.setIcon(new javax.swing.ImageIcon(getClass().getResource(basketbolcuArka)));
        btnBilgisayar4.setIcon(new javax.swing.ImageIcon(getClass().getResource(basketbolcuArka)));
        btnBilgisayar5.setIcon(new javax.swing.ImageIcon(getClass().getResource(futbolcuArka)));
        btnBilgisayar6.setIcon(new javax.swing.ImageIcon(getClass().getResource(futbolcuArka)));
        btnBilgisayar7.setIcon(new javax.swing.ImageIcon(getClass().getResource(futbolcuArka)));
        btnBilgisayar8.setIcon(new javax.swing.ImageIcon(getClass().getResource(futbolcuArka)));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBilgisayar1;
    private javax.swing.JButton btnBilgisayar2;
    private javax.swing.JButton btnBilgisayar3;
    private javax.swing.JButton btnBilgisayar4;
    private javax.swing.JButton btnBilgisayar5;
    private javax.swing.JButton btnBilgisayar6;
    private javax.swing.JButton btnBilgisayar7;
    private javax.swing.JButton btnBilgisayar8;
    private javax.swing.JButton btnBilgisayarKarsilasma;
    private javax.swing.JButton btnKullanici1;
    private javax.swing.JButton btnKullanici2;
    private javax.swing.JButton btnKullanici3;
    private javax.swing.JButton btnKullanici4;
    private javax.swing.JButton btnKullanici5;
    private javax.swing.JButton btnKullanici6;
    private javax.swing.JButton btnKullanici7;
    private javax.swing.JButton btnKullanici8;
    private javax.swing.JButton btnKullaniciKarsilasma;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblBigisayarSkor;
    private javax.swing.JLabel lblBilgisayarKarsilasma;
    private javax.swing.JLabel lblKullaniciKarsilasma;
    private javax.swing.JLabel lblKullaniciSkor;
    private javax.swing.JLabel lblOzellik;
    private javax.swing.JLabel lblOzellik1;
    private javax.swing.JLabel lblOzellikKarsilasma;
    private javax.swing.JLabel lblUyari;
    // End of variables declaration//GEN-END:variables
}
