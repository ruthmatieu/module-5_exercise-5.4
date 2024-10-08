public class Main {
    public static void main(String[] args) {
       int count = 1;
       double miles = 1.609;

        System.out.println("Miles   " + "Kilometers");

        while (count <= 10) {
            double kilometers = miles * count;
            System.out.println(count + "   " + kilometers);
            count++;
        }
    }
}