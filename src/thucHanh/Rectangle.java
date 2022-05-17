package thucHanh;

public class Rectangle extends Shape {
    private double chieuDai = 1.0;
    private double chieuRong = 1.0;

    public Rectangle() {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public Rectangle(String color, boolean filled, double chieuDai, double chieuRong) {
        super(color, filled);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double getDienTich() {
        return chieuDai * chieuRong;
    }

    public double getChuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle: " +
                "chieuDai= " + chieuDai +
                ", chieuRong= " + chieuRong +
                ", Diện tích= " + getDienTich()+
                ", Chu vi= " + getChuVi()
                ;
    }
}
