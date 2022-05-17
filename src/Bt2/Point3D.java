package Bt2;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] xy =  super.getXY();
        float[ ] xyz = {xy[0],xy[1],z};
        return xyz;
    }

    @Override
    public String toString() {
        return "Point3D: " +
                "x=" + super.getX() +
                "y=" + super.getY() +
                "z=" + z
                ;
    }
}
