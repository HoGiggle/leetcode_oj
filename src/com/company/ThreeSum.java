package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jjhu on 2015/1/6.
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] num) {
        if (num == null)
            return null;
        if (num.length == 0)
            return new ArrayList<List<Integer>>();

        Arrays.sort(num);

        int a = 99999;
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        for (int x = 0; x < num.length - 2; x++){
            if (num[x] == a)
                continue;
            int b = 99999;
            for (int y = x + 1; y < num.length - 1; y++){
                if (num[y] == b)
                    continue;
                for (int z = y + 1; z < num.length; z++){
                    int sum = num[x] + num[y] + num[z];
                    if (sum == 0){
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(num[x]);
                        list.add(num[y]);
                        list.add(num[z]);
                        lists.add(list);
                        a = num[x];
                        b = num[y];
                        break;
                    }
                }
            }
        }
        return lists;
    }
}

/*
 吾等凡夫俗子瞻仰
 vector<vector<int> > threeSum(vector<int>& nums) {
    if(nums.size() <=2) return {};
    vector<vector<int> > rtn;
    sort(nums.begin(), nums.end());

    for(int i =0; i < nums.size();){
        int start = i+1, end = nums.size()-1;

        while(start < end){
            if(nums[i]+nums[start]+nums[end] == 0){
                rtn.push_back({nums[i],nums[start],nums[end]});
                start++;
                end--;
                while((start < end) && nums[start] == nums[start-1]) start++;
                while((start < end) && nums[end] == nums[end+1]) end--;

            }else if(nums[i]+nums[start]+nums[end]<0){
                start++;
                while((start < end) && nums[start] == nums[start-1]) start++;
            }else{
                end--;
                while((start < end) && nums[end] == nums[end+1]) end--;
            }
        }

        i++;
        while((i < nums.size()) && nums[i] == nums[i-1])
            i++;

    }
    return rtn;
}


*/