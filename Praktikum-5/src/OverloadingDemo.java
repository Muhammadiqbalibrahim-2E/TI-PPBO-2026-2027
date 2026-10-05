public class OverloadingDemo {
    static int tambah ( int a , int b) {
        return a + b;
    }
    static int tambah ( int a , int b, int c ) {
        return a + b + c ;
    }
    public static void main ( String [] args ) {
        System . out . println ( tambah ( 2, 3));
        System . out . println ( tambah ( 2, 3, 4));
    }

}
