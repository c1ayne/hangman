public class Field {
    public static void paint(int errors) {
        char head = errors > 0 ? 'o' : ' ';
        char body = errors > 1 ? '|' : ' ';
        String leftHand = errors > 2 ? "--" : "  ";
        String rightHand = errors > 3 ? "--" : "  ";
        char leftLeg = errors > 4 ? '/' : ' ';
        char rightLeg = errors > 5 ? '\\' : ' ';
        System.out.print(
                  "        _____      \n"
                + "        |    |     \n"
                + "        " + head + "    |      \n"
                + "      " + leftHand  + body + rightHand + "  |      \n"
                + "       " + leftLeg + " " + rightLeg + "   |       \n"
                + "             |     \n"
                + "             |     \n"
                + "       ---------   \n"
        );
    }
}
