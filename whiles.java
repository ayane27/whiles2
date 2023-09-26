
/**
 * Write a description of class whiles here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class whiles
{
    public void run() {
        int i = 0;
        do {
            System.out.println("i is "+i+" but is less than 15");
            i++;
        } while (i<15);
        int k = 10;
        do {
            System.out.println("k is "+k+" and is greater than 5");
            k=k-1;
        } while (k>5);
        int a = 0;
        int b = 0;
        do {
            System.out.println("a is "+a+" and is less than 10");
            a++;
        } while (a<10);
        do {
            System.out.println("b is "+b+" and is less than or equal to 20");
            b++;
        } while (b<20); 
    }
    public static void main(String[] args)
    {
        whiles hw = new whiles();
        hw.run();
    }
}
