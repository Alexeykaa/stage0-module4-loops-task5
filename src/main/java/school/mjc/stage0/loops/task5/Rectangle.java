package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height) {
        for (int row = 1; row <= height ; row++) {
            if (row > 1 && row < height) {
                System.out.println("8".concat(" ".repeat(length - 2)).concat("8"));
            } else {
                System.out.println("8".repeat(length));
            }
        }
    }
}
