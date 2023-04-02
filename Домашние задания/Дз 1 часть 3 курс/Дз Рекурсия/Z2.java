public class Z2 {

    static Integer[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static boolean Z2(int i, int n)
    {
        if (a[i] == n) {
            return true;
        }
        if (i + 1 == a.length) {
            return false;
        }
        i++;
        return Z2(i, n);
    }
    public static void main(String[] args) {
        int i = 1;
        int n = 20;
        System.out.println(Z2(i,n));

    }

}
