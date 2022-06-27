public class typedata {

    public static void main(String[] args) {
        // number
        byte isByte = 127;
        short isShort = 32767;
        int isInt = 2000000000;
        long isLong = 200000000000000000L;

        // floating number
       float isFloat = 10.20F;
       double isDouble = 100.10;

       // literal number
        int isDecimalInteger = 34;
        int hexDecimal = 0xFFFFF;
        int binaryDecimal = 0b101010;

        // underscore
        long balance = 1_000_000_0000L;
        int amount = 1_000_0000;

        // char
        char e = 'E';

        // boolean
        boolean isActive = false; // true

        // string
        String nasi = "makanan";

        // final
        final  String loked = "locked";

        // non primitif
        Integer isInteger = 100;
        Boolean isBoolean = false;
        Float isFloatP = 10.20F;

        // insert array versi 1
        String[] arrayString = new String[3];
        arrayString[0] = "Eko";
        arrayString[1] = "Wow";
        arrayString[2] = "Namem";

        // insert array versi 2
        int[] arrayInt = new int[] {
                10,11,12,13
        };

        // insert array versi 3
        int[] arrayIntVersion = {
          10,20,30,40
        };

        // array in array
        String[][] members = {
                {"nasi","tumpeng","donat"},
                {"lobak", "bukit"}
        };

        // operasi matematika
        int a = 100;
        int b = 10;


        // switch lamda on java version 14
        var nilai = "A";
        switch (nilai) {
            case  "A" -> System.out.println("Anda lulus dengan baik");
            case "B" -> System.out.println("Anda lulus cukup  baik");
            default -> {
                System.out.println("wow");
                System.out.println("yea");
            }
        }

        // yield on java version 14
        String ucapan;
        ucapan = switch (nilai) {
            case  "A" : yield "Anda lulus dengan baik";
            case "B" : yield "Anda lulus cukup  baik";
            default :
                yield "wow";
        };
    }
}
