import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
        //Первое задание;
        int[] taskOne = {0, 1, 1, 1, 1, 1, 1, 1, 1, 0};
        for (int x = 0; x < taskOne.length; ++x) {
            if (taskOne[x] == 0) taskOne[x] = 1;
            else if (taskOne[x] == 1) taskOne[x] = 0;
        }
        //Второе задание;
        int[] taskTwo = new int[8];
        int count = 0;
        for (int y = 0; y < taskTwo.length; ++y) {
            taskTwo[y] = count;
            count += 3;
        }
        //Третье задание
        int[] taskThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int z = 0; z < taskThree.length; ++z) {
            if (taskThree[z] < 6) taskThree[z] *= 2;
        }
        //Четвертое задание
        int[][] taskFour = new int[3][3];
        for (int a = 0; a < taskFour.length; ++a) {
            for (int b = 0; b < taskFour.length; ++b) {
                if (a == b) {
                    taskFour[a][b] = 1;
                }
                taskFour[a][taskFour.length - a - 1] = 1;
            }
        }
        System.out.println(Arrays.toString(taskOne));
        System.out.println(Arrays.toString(taskTwo));
        System.out.println(Arrays.toString(taskThree));
        System.out.println(Arrays.deepToString(taskFour));

    }
}