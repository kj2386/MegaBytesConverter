// Write a method called printMegaBytesAndKiloBytes that has 1 parameter
// of type int with the name kiloBytes.
// The method should not return anything and it needs to calculate the megabytes
// and remaining kilobytes from the kilobytes parameter.
// Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
// XX represents the original value kiloBytes.
// YY represents the calculated megabytes.
// ZZ represents the calculated remaining kilobytes

public class MegaBytesConverter {

    public static void main(String[] args) {
       printMegaBytesAndKiloBytes(35486);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes >= 0) {
            int Mb = kiloBytes / 1024;
            int Kb = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + Mb + " MB and " + Kb + " KB");
        } else {
            System.out.println("Invalid Value");
        }

    }
}
