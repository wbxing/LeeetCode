package leet.code.problem0040;

import java.util.*;

/**
 * 39. 组合总和
 *
 * @author wbxing
 * @date 2020/12/11
 */
public class Problem39 {

    public static void main(String[] args) {
        Problem39 problem39 = new Problem39();
        int[] candidates = new int[]{2, 3, 6, 7};
        int target = 7;
        System.out.println(problem39.combinationSum(candidates, target));
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        Map<Integer, Set<List<Integer>>> map = new HashMap<>(candidates.length);
        Arrays.sort(candidates);
        for (int i = 1; i <= target; i++) {
            map.put(i, new HashSet<>());
            for (int j = 0; j < candidates.length && candidates[j] <= target; j++) {
                if (i == candidates[j]) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    map.get(i).add(temp);
                } else if (i > candidates[j]) {
                    int key = i - candidates[j];
                    for (List<Integer> integers : map.get(key)) {
                        List<Integer> tempList = new ArrayList<>(integers);
                        tempList.add(candidates[j]);
                        Collections.sort(tempList);
                        map.get(i).add(tempList);
                    }
                }
            }
        }
        return new ArrayList<>(map.get(target));
    }

}
