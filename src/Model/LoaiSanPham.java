/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author top1z
 */
public class LoaiSanPham {
    private String ID_LoaiSP ;
    private String TenLoai ;
    public LoaiSanPham(){
        
        
    }

    public LoaiSanPham(String ID_LoaiSP, String TenLoai) {
        this.ID_LoaiSP = ID_LoaiSP;
        this.TenLoai = TenLoai;
    }

    public String getID_LoaiSP() {
        return ID_LoaiSP;
    }

    public void setID_LoaiSP(String ID_LoaiSP) {
        this.ID_LoaiSP = ID_LoaiSP;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }

    @Override
    public String toString() {
        return  TenLoai ;
    }
    
}
