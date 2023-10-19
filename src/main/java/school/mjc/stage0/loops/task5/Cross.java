package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int center = sideLength / 2 + 1;
        String placeholder = " ".repeat(center - 1);
        String crossRow = placeholder.concat("8").concat(placeholder);
        for (int i = 1; i <= sideLength; i++) {
            if (i != center) {
                System.out.println(crossRow);
            } else {
                System.out.println("8".repeat(sideLength));
            }
        }
    }
}
