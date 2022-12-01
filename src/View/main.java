package View;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        new DangnhapJDialog(this, true).setVisible(true);
        setExtendedState(this.MAXIMIZED_BOTH);
        setColor(lblTrangchu);
        showPanel(new TrangchuJPanel());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pnTrangChu = new javax.swing.JPanel();
        lblTrangchu = new javax.swing.JLabel();
        pnBanHang = new javax.swing.JPanel();
        lblBanHang = new javax.swing.JLabel();
        pnSanPham = new javax.swing.JPanel();
        lblSanPham = new javax.swing.JLabel();
        pnHoaDon = new javax.swing.JPanel();
        lblHoaDon = new javax.swing.JLabel();
        pnNhanVien = new javax.swing.JPanel();
        lblNhanVien = new javax.swing.JLabel();
        pnThongke = new javax.swing.JPanel();
        lblThongke = new javax.swing.JLabel();
        pnGiagia = new javax.swing.JPanel();
        lblGiamGia = new javax.swing.JLabel();
        pnscrene = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cà Phê Ban Mê");

        jPanel3.setBackground(new java.awt.Color(41, 93, 157));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jPanel4.setBackground(new java.awt.Color(41, 93, 157));
        jPanel4.setToolTipText("");
        jPanel4.setPreferredSize(new java.awt.Dimension(260, 780));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/coffee-and-arrow-up-logo-combination-vector-14355977.jpg"))); // NOI18N

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        pnTrangChu.setBackground(new java.awt.Color(41, 93, 157));
        pnTrangChu.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnTrangChu.setPreferredSize(new java.awt.Dimension(260, 74));
        pnTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnTrangChuMouseClicked(evt);
            }
        });

        lblTrangchu.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lblTrangchu.setForeground(new java.awt.Color(255, 255, 255));
        lblTrangchu.setText("Trang chủ");

        javax.swing.GroupLayout pnTrangChuLayout = new javax.swing.GroupLayout(pnTrangChu);
        pnTrangChu.setLayout(pnTrangChuLayout);
        pnTrangChuLayout.setHorizontalGroup(
            pnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTrangChuLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblTrangchu, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        pnTrangChuLayout.setVerticalGroup(
            pnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTrangChuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTrangchu, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(pnTrangChu);

        pnBanHang.setBackground(new java.awt.Color(41, 93, 157));
        pnBanHang.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnBanHang.setPreferredSize(new java.awt.Dimension(260, 74));
        pnBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnBanHangMouseClicked(evt);
            }
        });

        lblBanHang.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lblBanHang.setForeground(new java.awt.Color(255, 255, 255));
        lblBanHang.setText("Bán hàng");

        javax.swing.GroupLayout pnBanHangLayout = new javax.swing.GroupLayout(pnBanHang);
        pnBanHang.setLayout(pnBanHangLayout);
        pnBanHangLayout.setHorizontalGroup(
            pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBanHangLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        pnBanHangLayout.setVerticalGroup(
            pnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBanHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pnBanHang);

        pnSanPham.setBackground(new java.awt.Color(41, 93, 157));
        pnSanPham.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnSanPham.setPreferredSize(new java.awt.Dimension(260, 74));
        pnSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnSanPhamMouseClicked(evt);
            }
        });

        lblSanPham.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lblSanPham.setForeground(new java.awt.Color(255, 255, 255));
        lblSanPham.setText("Sản Phẩm");

        javax.swing.GroupLayout pnSanPhamLayout = new javax.swing.GroupLayout(pnSanPham);
        pnSanPham.setLayout(pnSanPhamLayout);
        pnSanPhamLayout.setHorizontalGroup(
            pnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSanPhamLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        pnSanPhamLayout.setVerticalGroup(
            pnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pnSanPham);

        pnHoaDon.setBackground(new java.awt.Color(41, 93, 157));
        pnHoaDon.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnHoaDon.setPreferredSize(new java.awt.Dimension(260, 74));
        pnHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnHoaDonMouseClicked(evt);
            }
        });

        lblHoaDon.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lblHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        lblHoaDon.setText("Hóa đơn");

        javax.swing.GroupLayout pnHoaDonLayout = new javax.swing.GroupLayout(pnHoaDon);
        pnHoaDon.setLayout(pnHoaDonLayout);
        pnHoaDonLayout.setHorizontalGroup(
            pnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHoaDonLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        pnHoaDonLayout.setVerticalGroup(
            pnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pnHoaDon);

        pnNhanVien.setBackground(new java.awt.Color(41, 93, 157));
        pnNhanVien.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnNhanVien.setPreferredSize(new java.awt.Dimension(260, 74));
        pnNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnNhanVienMouseClicked(evt);
            }
        });

        lblNhanVien.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lblNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        lblNhanVien.setText("Nhân viên");

        javax.swing.GroupLayout pnNhanVienLayout = new javax.swing.GroupLayout(pnNhanVien);
        pnNhanVien.setLayout(pnNhanVienLayout);
        pnNhanVienLayout.setHorizontalGroup(
            pnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNhanVienLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        pnNhanVienLayout.setVerticalGroup(
            pnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pnNhanVien);

        pnThongke.setBackground(new java.awt.Color(41, 93, 157));
        pnThongke.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnThongke.setPreferredSize(new java.awt.Dimension(260, 74));
        pnThongke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnThongkeMouseClicked(evt);
            }
        });

        lblThongke.setBackground(new java.awt.Color(41, 93, 157));
        lblThongke.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lblThongke.setForeground(new java.awt.Color(255, 255, 255));
        lblThongke.setText("Thống kê");

        javax.swing.GroupLayout pnThongkeLayout = new javax.swing.GroupLayout(pnThongke);
        pnThongke.setLayout(pnThongkeLayout);
        pnThongkeLayout.setHorizontalGroup(
            pnThongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongkeLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblThongke, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        pnThongkeLayout.setVerticalGroup(
            pnThongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongkeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblThongke, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pnThongke);

        pnGiagia.setBackground(new java.awt.Color(41, 93, 157));
        pnGiagia.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnGiagia.setPreferredSize(new java.awt.Dimension(260, 74));
        pnGiagia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnGiagiaMouseClicked(evt);
            }
        });

        lblGiamGia.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lblGiamGia.setForeground(new java.awt.Color(255, 255, 255));
        lblGiamGia.setText("Giảm giá");

        javax.swing.GroupLayout pnGiagiaLayout = new javax.swing.GroupLayout(pnGiagia);
        pnGiagia.setLayout(pnGiagiaLayout);
        pnGiagiaLayout.setHorizontalGroup(
            pnGiagiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGiagiaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        pnGiagiaLayout.setVerticalGroup(
            pnGiagiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnGiagiaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(pnGiagia);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(29, 29, 29))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4);

        pnscrene.setBackground(new java.awt.Color(204, 204, 204));
        pnscrene.setLayout(new java.awt.BorderLayout());
        jPanel3.add(pnscrene);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnTrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnTrangChuMouseClicked
        // TODO add your handling code here:
        setColor(lblTrangchu);
        resetColor(lblHoaDon);
        resetColor(lblBanHang);
        resetColor(lblNhanVien);
        resetColor(lblSanPham);
        resetColor(lblThongke);
        resetColor(lblGiamGia);
        showPanel(new TrangchuJPanel());
    }//GEN-LAST:event_pnTrangChuMouseClicked

    private void pnSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnSanPhamMouseClicked
        // TODO add your handling code here:
        setColor(lblSanPham);
        resetColor(lblHoaDon);
        resetColor(lblBanHang);
        resetColor(lblNhanVien);
        resetColor(lblTrangchu);
        resetColor(lblThongke);
        showPanel(new QuanLySanPhamJPanel());
    }//GEN-LAST:event_pnSanPhamMouseClicked

    private void pnNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnNhanVienMouseClicked
        // TODO add your handling code here:
        setColor(lblNhanVien);
        resetColor(lblHoaDon);
        resetColor(lblBanHang);
        resetColor(lblSanPham);
        resetColor(lblTrangchu);
        resetColor(lblThongke);
        showPanel(new QuanLyNhanvienJPanel());
    }//GEN-LAST:event_pnNhanVienMouseClicked

    private void pnBanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBanHangMouseClicked
        // TODO add your handling code here:
        setColor(lblBanHang);
        resetColor(lblHoaDon);
        resetColor(lblNhanVien);
        resetColor(lblSanPham);
        resetColor(lblTrangchu);
        resetColor(lblThongke);
        resetColor(lblGiamGia);
        showPanel(new QuanLyBanHangJPanel());
    }//GEN-LAST:event_pnBanHangMouseClicked

    private void pnHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnHoaDonMouseClicked
        // TODO add your handling code here:
        setColor(lblHoaDon);
        resetColor(lblBanHang);
        resetColor(lblNhanVien);
        resetColor(lblSanPham);
        resetColor(lblTrangchu);
        resetColor(lblThongke);
        showPanel(new QuanLyHoaDonJPanel());
    }//GEN-LAST:event_pnHoaDonMouseClicked

    private void pnThongkeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnThongkeMouseClicked
        // TODO add your handling code here:
        setColor(lblThongke);
        resetColor(lblBanHang);
        resetColor(lblNhanVien);
        resetColor(lblSanPham);
        resetColor(lblTrangchu);
        resetColor(lblHoaDon);
        resetColor(lblGiamGia);
        showPanel(new MainThongKeJPanel());
    }//GEN-LAST:event_pnThongkeMouseClicked

    private void pnGiagiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnGiagiaMouseClicked
        // TODO add your handling code here:
        setColor(lblGiamGia);
        resetColor(lblBanHang);
        resetColor(lblNhanVien);
        resetColor(lblSanPham);
        resetColor(lblTrangchu);
        resetColor(lblHoaDon);
        resetColor(lblThongke);
        showPanel(new GiamGiaSanPhamJPanel());
    }//GEN-LAST:event_pnGiagiaMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblBanHang;
    private javax.swing.JLabel lblGiamGia;
    private javax.swing.JLabel lblHoaDon;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JLabel lblSanPham;
    private javax.swing.JLabel lblThongke;
    private javax.swing.JLabel lblTrangchu;
    private javax.swing.JPanel pnBanHang;
    private javax.swing.JPanel pnGiagia;
    private javax.swing.JPanel pnHoaDon;
    private javax.swing.JPanel pnNhanVien;
    private javax.swing.JPanel pnSanPham;
    private javax.swing.JPanel pnThongke;
    private javax.swing.JPanel pnTrangChu;
    private javax.swing.JPanel pnscrene;
    // End of variables declaration//GEN-END:variables

    private JPanel chidrenpanel;

    public void showPanel(JPanel panel) {
        chidrenpanel = panel;
        pnscrene.removeAll();
        pnscrene.add(chidrenpanel);
        pnscrene.validate();
    }

    public void setColor(JLabel label) {
        label.setForeground(Color.black);
    }

    public void resetColor(JLabel label) {
        label.setForeground(Color.white);
    }

}
