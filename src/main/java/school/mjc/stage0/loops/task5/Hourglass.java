package school.mjc.stage0.loops.task5;

public class Hourglass {
    private String makeRow(int height, int width) {
        String figure = "8".repeat(width);
        String placeholder = " ".repeat((height - width) / 2);
        return placeholder.concat(figure).concat(placeholder);
    }

    public void printHourglassOfGivenSize(int height) {
        int width;
        // top & middle
        for (width = height; width > 0; width -= 2) {
            System.out.println(makeRow(height, width));
        }
        // middle & bottom
        if (height % 2 != 0) {
            width += 2;
        }
        for (width += 2; width <= height; width += 2) {
            System.out.println(makeRow(height, width));
        }
    }
}
