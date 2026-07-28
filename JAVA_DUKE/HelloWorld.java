package JAVA_DUKE;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class HelloWorld {

    public static void main(String[] args) {

        UnionFind setArray = new UnionFind(10);
        System.out.println(setArray.isConnected(8,2));

        Point p1 = new Point(3, 4);
        Point p2 = new Point(3, 4);



        // System.out.println(p1.distance(p2));

        // System.out.println(g());
        try {
            List<String> allLines = Files.readAllLines(Paths.get("JAVA_DUKE/helloWorld.txt"));

            for (int i = 0; i < allLines.size(); i++) {
                // Crucial part: You must use .get(i) for a List!
                String line = allLines.get(i);
                // System.out.println(line);
            }

        } catch (IOException e) {
        }
    }

    static int myFunction(int x, int y) {
        int z = 2 * x - y;
        return z * x;
    }

    static int f(int n) {
        return 3 + myFunction(n, n + 1);
    }

    static int g() {
        int a;
        a = myFunction(3, 7);
        int b;
        b = f(a * a);

        return b;

    }
}
