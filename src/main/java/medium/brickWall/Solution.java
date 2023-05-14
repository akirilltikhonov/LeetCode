package medium.brickWall;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public int leastBricks(List<List<Integer>> wall) {
        List<Integer> firstRow = wall.iterator().next();
        int width = firstRow.stream().reduce(0, Integer::sum);
        Map<Integer, Integer> map = new HashMap<>();
        for (List<Integer> row : wall) {
            if (row.size() == 1) {
                map.put(-1, 0);
            } else {
                int cw = 0;
                for (int brick = 0; brick < row.size() - 1; brick++) {
                    cw += row.get(brick);
                    if (cw != width) {
                        map.put(cw, map.getOrDefault(cw, 0) + 1);
                    }
                }
            }
        }
        return wall.size() - map.values().stream().max(Integer::compareTo).orElseThrow();
    }
}
