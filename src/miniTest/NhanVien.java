package miniTest;

public class NhanVien {
    private int id;
    private String ten;
    private int tuoi;

    public NhanVien() {
    }

    public NhanVien(int id, String ten, int tuoi) {
        this.id = id;
        this.ten = ten;
        this.tuoi = tuoi;
    }
    public double tinhLuong() {
        if ()
        return 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }


    @Override
    public String toString() {
        return
                "Id=" + id +
                        ", Tên='" + ten + '\'' +
                        ", Tuổi=" + tuoi;

    }
}
