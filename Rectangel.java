import java.util.Scanner;

public class Rectangel {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.println(" input width : ");
        width = sc.nextFloat();
        System.out.println(" input height : ");
        height = sc.nextFloat();
        float area = width * height;
        System.out.println(" Area is : " + area);
    }
}
