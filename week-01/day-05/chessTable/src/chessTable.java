public class chessTable {
    public static void main(String[] args) {

        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        //

        String light = "[ ]";
        String dark = "[X]";
        int table = 8;

        for (int i = 0; i < table; i++) {
            if (i % 2 == 0) {
                System.out.println(dark + light + dark + light + dark + light + dark + light);
            } else {
                System.out.println(light + dark + light + dark + light + dark + light + dark);
            }
        }
    }
}


