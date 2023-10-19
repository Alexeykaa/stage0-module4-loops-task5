package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            System.out.println("8".repeat(i).concat(" ".repeat(cathetusLength - i)));
        }
    }
}
