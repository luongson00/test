package Helper;

import Dao.BanChiTietDAO;
import Dao.HoaDonDAO;
import Model.HoaDon;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.GroupLayout;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class PrintPDF {

    HoaDonDAO hddao = new HoaDonDAO();
    BanChiTietDAO bctdao = new BanChiTietDAO();

    public void a(DefaultTableModel model, int mahd, int tienkh, int tienthoi) {
        HoaDon hd = hddao.selectById(mahd);
        Document document = new Document(PageSize.A4, 50, 50, 50, 50);
        try {
// anh em khi code muốn chạy được phần in hóa đơn thì đổi source file nơi lưu trữ( cái dưới) và font chữ ( 2 cái dưới, front chữ đã tải và để trong file dự án rồi chỉ việc đổi link đường dẫn tới nó thôi) cre; Phong
            File newFile = new File("C:\\Users\\admin\\Desktop\\Clones_DuAn1\\CloneChinh\\DuAn1-QuanLyUpCofffee\\printhoadon\\Hoadon_" + mahd + ".pdf");
            PdfWriter.getInstance(document, new FileOutputStream(newFile.getAbsoluteFile().getPath()));
            document.open();
            Font f = new Font(BaseFont.createFont("C:\\Users\\admin\\Desktop\\Clones_DuAn1\\CloneChinh\\DuAn1-QuanLyUpCofffee\\FrontChuArialbd.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED));
            f.setSize(16);
            Font f2 = new Font(BaseFont.createFont("C:\\Users\\admin\\Desktop\\Clones_DuAn1\\CloneChinh\\DuAn1-QuanLyUpCofffee\\FrontChuArialbd.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED));
            f2.setSize(14);
            //f.setStyle(Font.NORMAL);
            Paragraph title1 = new Paragraph("UpCoffee", FontFactory.getFont(FontFactory.HELVETICA, 20, Font.BOLDITALIC, new CMYKColor(0, 255, 255, 17)));
            //Chapter chapter1 = new Chapter(title1, 1);
            title1.setAlignment(Element.ALIGN_CENTER);
            document.add(title1);
            PdfPTable a = new PdfPTable(2);
            a.setSpacingBefore(35);

            PdfPCell a1 = new PdfPCell(new Phrase("Mã đơn: " + hd.getIdHoaDon(), f2));
            a.addCell(a1).setBorder(0);
            PdfPCell a2 = new PdfPCell(new Phrase("", f2));
            a.addCell(a2).setBorder(0);

            PdfPCell a3 = new PdfPCell(new Phrase("Ngày tạo: " + bctdao.selectByIdHD(mahd).get(0).getThoidiemCoNguoi(), f2));
            a.addCell(a3).setBorder(0);
            PdfPCell a4 = new PdfPCell(new Phrase(hd.getNgayTao() + "", f2));
            a.addCell(a4).setBorder(0);

            PdfPTable t = new PdfPTable(4);
            t.setSpacingBefore(35);
            t.setSpacingAfter(35);

            PdfPCell c1 = new PdfPCell(new Phrase("Mặt hàng", f));
            t.addCell(c1);
            PdfPCell c2 = new PdfPCell(new Phrase("Số lượng", f));
            t.addCell(c2);
            PdfPCell c3 = new PdfPCell(new Phrase("Giá", f));
            t.addCell(c3);
            PdfPCell c4 = new PdfPCell(new Phrase("Thành tiền", f));
            t.addCell(c4);

            for (int i = 0; i < model.getRowCount(); i++) {
                if (mahd == Integer.parseInt(model.getValueAt(i, 0).toString())) {
                    PdfPCell c5 = new PdfPCell(new Phrase(model.getValueAt(i, 2).toString(), f2));
                    t.addCell(c5);
                    t.addCell(model.getValueAt(i, 3).toString());
                    t.addCell(model.getValueAt(i, 4).toString());
                    t.addCell(model.getValueAt(i, 5).toString());
                }
            }
            document.add(a);
            document.add(t);
            PdfPTable b = new PdfPTable(2);
            PdfPCell b1 = new PdfPCell(new Phrase("Tổng tiền: ", f2));
            b.addCell(b1).setBorder(0);
            PdfPCell b2 = new PdfPCell(new Phrase("" + hd.getThanhTien(), f2));
            b.addCell(b2).setBorder(0);
            PdfPCell b3 = new PdfPCell(new Phrase("Tiền khách trả: ", f2));
            b.addCell(b3).setBorder(0);
            PdfPCell b4 = new PdfPCell(new Phrase("" + tienkh, f2));
            b.addCell(b4).setBorder(0);
//            PdfPCell b5 = new PdfPCell(new Phrase("Tiền thối: ", f2));
//            b.addCell(b5).setBorder(0);
//            PdfPCell b6 = new PdfPCell(new Phrase(""+tienthoi, f2));
//            b.addCell(b6).setBorder(0);
            document.add(b);
//            t.addCell("1.1");
//            t.addCell("1.2");
//            t.addCell("1.3");

            document.close();
            System.out.println("Write file succes!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
