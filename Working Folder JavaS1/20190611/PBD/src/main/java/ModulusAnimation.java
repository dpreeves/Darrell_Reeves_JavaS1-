public class ModulusAnimation
{
    public static void main( String[] args ) throws Exception
    {
        for ( int i=0; i<80; i++ )
        {
            if ( i%16 == 0 )
                System.out.print(" |-_____                 \r");
            else if ( i%16 == 1 )
                System.out.print("   -|-____               \r");
            else if ( i%16 == 2 )
                System.out.print("     _-|-___             \r");
            else if ( i%16 == 3 )
                System.out.print("       __-|-__           \r");
            else if ( i%16 == 4 )
                System.out.print("         ___-|-_         \r");
            else if ( i%16 == 5 )
                System.out.print("           ____-|-       \r");
            else if ( i%16 == 6 )
                System.out.print("             _____-|     \r");
            else if ( i%16 == 7 )
                System.out.print("               -_____-   \r");
            else if ( i%16 == 8 )
                System.out.print("                 |-_____ \r");
            else if ( i%16 == 9 )
                System.out.print("               -|-_____   \r");
            else if ( i%16 == 10 )
                System.out.print("             _-|-____     \r");
            else if ( i%16 == 11 )
                System.out.print("           __-|-___       \r");
            else if ( i%16 == 12 )
                System.out.print("         ___-|-__         \r");
            else if ( i%16 == 13 )
                System.out.print("       ____-|-_           \r");
            else if ( i%16 == 14 )
                System.out.print("     _____-|-             \r");
            else if ( i%16 == 15 )
                System.out.print("   ______-|               \r");

            Thread.sleep(200);
        }

    }
}