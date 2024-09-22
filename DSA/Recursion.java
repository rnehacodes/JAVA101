public class Recursion {
    public static void main(String[] args) {
        pattern1(5, 0);
        System.out.print("\n");
        pattern2(5, 0);
    }
    public static void pattern1(int r, int c) {
        if(r == 0) {
            return;
        }
        if(c < r) {
            System.out.print("*");
            c++;
        } else {
            System.out.print("\n");
            r--; c = 0;
        }
        pattern1(r, c);
    }
    
    public static void pattern2(int r, int c) {
        if(r == 0) {
            return;
        }
        if(c < r) {
            System.out.print("*");
            c++;
        } else {
            System.out.print("\n");
            r--; c = 0;
        }
        pattern1(r, c);
    }
}