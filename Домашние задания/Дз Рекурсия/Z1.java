public class Z1 {

    public static void Z1(int i,int n){
        if (i == n+1){
            return;
        }
        System.out.println(i);
        i++;
        Z1(i,n);
    }
    public static void main(String[] args) {
        int i = 1;
        int n = 20;
        Z1(i,n);
    }
}