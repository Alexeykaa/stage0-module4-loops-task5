package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        for (int row = 1; row <= sideLength ; row++) {
            if (row > 1 && row < sideLength) {
                System.out.println("8".concat(" ".repeat(sideLength - 2)).concat("8"));
            } else {
                System.out.println("8".repeat(sideLength));
            }
        }

    }
}
