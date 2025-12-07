public class App {
    public static void main(String[] args) throws Exception {
        int[] num = new int[12];

        System.out.println("Vaya introduciendo números enteros y pulsando INTRO: ");

        for (int i = 0; i < 12; i++) {
            num[i] = Integer.parseInt(System.console().readLine());
        }

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        int ultimo = num[num.length - 1];

        for (int i = num.length - 1; i > 0; i--) {
            num[i] = num[i - 1];
        }

        num[0] = ultimo;

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
