import java.io.File;
import java.io.IOException;

public class Vedios implements Lendable{

    private String vName;
    private double duration;
    private int quatity;

    public Vedios(String vName, double duration, int quatity) {
        this.vName = vName;
        this.duration = duration;
        this.quatity = quatity;
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Vedios{" +
                "vName='" + vName + '\'' +
                ", duration=" + duration +
                ", quatity=" + quatity +
                '}';
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    @Override
    public boolean isLendable() {
        System.out.println("Vedios Are not Lendable!");
        return false;
    }
}
