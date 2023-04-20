import java.util.HashMap;
import java.util.Map;

public class SimilarWords {
    public static void main(String[] args) {
        String str1 = "codewars";
        String str2 = "hackerrank";
        int result = getRemovedLetters(str1, str2);
        System.out.println(result);
    }
    public static int getRemovedLetters(String str1, String str2) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (char c : str1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : str2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        int result = 0;
        result = getCount(str1, map2, result);
        result = getCount(str2, map1, result);

        return result;
    }

    private static int getCount(String str, Map<Character, Integer> map, int count) {
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) {
                    map.remove(c);
                }
            } else {
                count++;
            }
        }
        return count;
    }
}
