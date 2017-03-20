package Question_40_CombinationSumII;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    private List<List<Integer>> lists;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        lists = new LinkedList<>();
        Arrays.sort(candidates);
        slove(candidates, target, 0, new LinkedList<Integer>());
        return lists;
    }

    public void slove(int[] candidates, int target, int start, List<Integer> data) {
        if (target == 0) {
            lists.add(new LinkedList<>(data));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if(i>start&&candidates[i-1]==candidates[i]){continue;}
            data.add(candidates[i]);
            if (candidates[i] <= target) {
                slove(candidates, target - candidates[i], i + 1, data);
            }
            data.remove(data.size() - 1);
        }

    }
}
