package miniTest;

public class FullTime extends NhanVien {
    private int heSo;

    public FullTime() {
    }

    public FullTime(int heSo) {
        this.heSo = heSo;
    }

    public FullTime(int id, String ten, int tuoi, int heSo) {
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
        return "FullTime" +
                super.toString() +
                "heSo=" + heSo;

    }
}
