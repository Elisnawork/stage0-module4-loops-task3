package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {

        int sum = firstBoarder;

        while (firstBoarder < secondBoarder) {
            firstBoarder++;
            sum = sum + firstBoarder;
        }
        System.out.println(sum);
    }
}
