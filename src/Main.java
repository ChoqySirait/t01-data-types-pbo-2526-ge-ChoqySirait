import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNext()) return;
        String soal = sc.next();

        switch (soal) {

            
            // SOAL 1 — Integer Overflow
            case "Soal1": {
                int a = sc.nextInt();
                int b = sc.nextInt();

                // Deteksi overflow TANPA long / try-catch
                if ((b > 0 && a > Integer.MAX_VALUE - b) ||
                    (b < 0 && a < Integer.MIN_VALUE - b)) {
                    System.out.println("OVERFLOW");
                } else {
                    System.out.println(a + b);
                }
                break;
            }

            // SOAL 2 — Float vs Double
            case "Soal2": {
                double x = sc.nextDouble();
                double y = sc.nextDouble();

                float fSum = (float) x + (float) y;
                double dSum = x + y;

                double diff = Math.abs(dSum - fSum);
                System.out.printf("%.6f%n", diff);
                break;
            }
            
            // SOAL 3 — Primitive vs Wrapper
            case "Soal3": {
                int n = sc.nextInt();

                Integer a = n;
                Integer b = a;

                a = a + 1;

                System.out.println("==: " + (a == b));
                System.out.println("equals: " + a.equals(b));
                break;
            }

            // SOAL 4 — String Immutability
            case "Soal4": {
                String s = sc.next();

                String a = s;
                String b = new String(s);

                a = a + "X";

                System.out.println("==: " + (a == b));
                System.out.println("equals: " + a.equals(b));
                break;
            }

            // SOAL 5 — Parsing & Type Safety
            case "Soal5": {
                int i = Integer.parseInt(sc.next());
                double d = Double.parseDouble(sc.next());
                boolean b = Boolean.parseBoolean(sc.next());

                double result = i * d;
                if (!b) result *= -1;

                System.out.printf("%.2f%n", result);
                break;
            }
        }

        sc.close();
    }
}
