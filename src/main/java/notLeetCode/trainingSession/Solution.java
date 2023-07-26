package notLeetCode.trainingSession;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

//A one-day-long training session will be conducted twice during the next 10 days. There are N employees (numbered from 0 to N-1) willing to attend it. Each employee has provided a list of which of the next 10 days they are able to participate in the training. The employees' preferences are represented as an array of strings. E[K] is a string consisting of digits ('0'-'9') representing the days the K-th employee is able to attend the training.
//        The dates during which the training will take place are yet to be scheduled. What is the maximum number of employees that can attend during at least one of the two scheduled days?
//
//        Write a function: int solution( vector &E) that, given an array E consisting of N strings denoting the available days for each employee, will return the maximum number of employees that can attend during at least one of the two scheduled days.
//
//        Examples
//
//        Given E = ('039", '4', "14'. "32"," "34", "7"], the answer is 5. It can be achieved for example by running training on days 3 and 4. This way employees number 0, 1,2, 3 and 5 will attend the training.
//
//        Given E = ["801234567", "180234567", "0", "189234567", "891234567", "98", "9"], the answer is 7. It can be achieved by running training on days 0 and 9. Thisallows allemployees to attend the training.
//
//        Given E = ["5421", "245", "1452", "0345", "53", "354"], the answer is 6. It can be achieved just by running training once on day 5, when every employee is available.
//
//        Assume that :
//
//        N is an integer within the range [1..100];
//        each string in array E consists only of digits (0-9)
//        each string in array E has length within the range [0..10]
//        characters in every string in array E are distinct.

class Solution {
    public int solution(String[] E) {
        Map<Integer, Integer> firstMap = new HashMap<>();
        for (String e : E) {
            addDays(e, firstMap);
        }
        Integer firstMax = Collections.max(firstMap.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getValue();

        Map<Integer, Integer> secondMap = new HashMap<>();
        for (String e : E) {
            if (!e.contains(firstMax.toString())) {
                addDays(e, secondMap);
            }
        }

        Integer secondMax = 0;
        if (!secondMap.isEmpty() && !firstMax.equals(E.length)) {
            Integer key = Collections.max(secondMap.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
            secondMax = secondMap.get(key);
        }
        return firstMax + secondMax;
    }

    private void addDays(String e, Map<Integer, Integer> map) {
        Arrays.stream(e.split(""))
                .filter(s -> !"".equals(s))
                .map(Integer::valueOf)
                .forEach(d -> map.put(d, map.getOrDefault(d, 0) + 1));
    }
}
