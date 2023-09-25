while loop1
package firstJavaApp;

public class App {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}

