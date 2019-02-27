package DTO;

import java.io.Serializable;

public class NhanVien implements Serializable{

    private int idNV;
    private String tenNV;
    private String hoNv;

    public NhanVien(int idNV, String tenNV, String hoNv) {
        this.idNV = idNV;
        this.tenNV = tenNV;
        this.hoNv = hoNv;
    }

    public int getIdNV() {
        return idNV;
    }

    public void setIdNV(int idNV) {
        this.idNV = idNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getHoNv() {
        return hoNv;
    }

    public void setHoNv(String hoNv) {
        this.hoNv = hoNv;
    }
}
