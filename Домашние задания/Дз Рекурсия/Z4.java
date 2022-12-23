public class Z4 {

    public  static int BinarySearch(int[] a, int n, int min , int l){
        if ( min> l){
            return -1;
        }
        int sqrt = (min + l)/2;
        if (n>a[sqrt]){
            return BinarySearch(a,n,sqrt+1,l);
        } else if (a[sqrt]>n) {
            return BinarySearch(a,n,min,sqrt-1);
        }
        return sqrt;
    }
    public static void main(String[] args) {
        int n = 8;
        int[] a = {1, 2, 3, 3, 4, 5, 6, 7, 7, 8, 9, 10};
        System.out.println(BinarySearch(a,n,0,a.length-1));
    }
}
