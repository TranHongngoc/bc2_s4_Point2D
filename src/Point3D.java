import java.util.Arrays;

public class Point3D extends Point2D {
    float z;

    public Point3D(){}
    public Point3D(float x, float y,float z){
        super(x, y);
        this.z = z;
    }

    public float getZ(){
        return z;
    }

    public void setZ(){
        this.z = z;
    }

    public void setXYZ(){
        super.setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] arr = new float[3];
        arr[0] = x;
        arr[1] = y;
        arr[2] = z;
        return arr;
    }

    public String toString(){
        return Arrays.toString(getXYZ());
    }
}
