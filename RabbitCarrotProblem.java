public class RabbitCarrotProblem {

    public static int calculateJumps(boolean[][] garden) {
        int n = garden.length;
        int k = garden[0].length;

        int totalCarrots = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                if (garden[i][j]) {
                    totalCarrots++;
                }
            }
        }

        int jumps = (int) Math.ceil((double) totalCarrots / k);

        return jumps;
    }

    public static void main(String[] args) {
        boolean[][] garden = {
                {true, true, false, false, false},
                {true, true, false, false, false},
                {false, false , false, false, false},
                {false, false, false, true, true},
                {false, false, false, true, true}
        };

        int jumps = calculateJumps(garden);
        System.out.println("The rabbit needs to make " + jumps + " jumps to eat all the carrots.");
    }
}

