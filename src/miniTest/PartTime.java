package miniTest;

public class PartTime extends NhanVien {
    private int heSo;

    public PartTime() {
    }

    public PartTime(int heSo) {
        this.heSo = heSo;
    }

    public PartTime(int id, String ten, int tuoi, int heSo) {
        super(id, ten, tuoi);
        this.heSo = heSo;
    }

    public int getHeSo() {
        return heSo;
    }

    public void setHeSo(int heSo) {
        this.heSo = heSo;
    }

    @Override
    public String toString() {
        return "PartTime" +
                super.toString()+

        " heSo=" + heSo
                ;
    }
}
