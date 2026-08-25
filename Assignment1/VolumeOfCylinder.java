import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double hight = sc.nextDouble();

        double volume = Math.PI*radius*radius*hight;

        System.out.println(volume);
    }
}
