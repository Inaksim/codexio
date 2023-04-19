import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> balls = new HashMap<>();

        while (true) {
            String inputStr = scanner.nextLine().trim();
            if (inputStr.equals("End")) {
                break;
            }
            String[] input = inputStr.split(":");
            String color = input[0];
            int count = Integer.parseInt(input[1]);
            balls.put(color, count);
        }

        int minBalls = balls.values().stream().mapToInt(Integer::intValue).sum();
        for (int count : balls.values()) {
            int ballsLeft = minBalls - count;
            minBalls = Math.min(minBalls, ballsLeft);
            break;
        }

        System.out.println(minBalls);
    }
}


