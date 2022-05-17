package Bt1;

public class Cylinder extends Cicrle {
    private double chieuCao = 1.0;

    public Cylinder(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public Cylinder(double radius, String color, double chieuCao) {
        super(radius, color);
        this.chieuCao = chieuCao;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public double getDienTichXungQuanh() {
        return super.getChuVi() * chieuCao;
    }

    @Override
    public String toString() {
        return "Cylinder: " +
                " ChieuCao= " + chieuCao +
                " -Color= " + getColor() +
                " -Diện tích đáy = " + super.getDienTich() +
                " -Diện tích xung quanh= " + getDienTichXungQuanh()
                ;
    }
}
