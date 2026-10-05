public class MethodDemo {
    static void sapa(String nama) {
        System.out.println( "Halo, " + nama + "!" );
    }
    public static void main ( String [] args ) {
        sapa ("Budi");
        sapa ("Siti");
        tampilkanBiodata ( "Budi" , 20 , "Bandung" );
    }
    static void tampilkanBiodata ( String nama, int umur, String kota ) {
        System . out . println ( nama + " (" + umur + " tahun) - " + kota );
    }

}
