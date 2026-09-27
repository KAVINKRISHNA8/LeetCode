
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> m;  
        for (int i = 0; i < nums.size(); i++) {
            int balance = target - nums[i];
            if (m.count(balance)) {
                return {m[balance], i};  
            }
            m[nums[i]] = i;
        }
        return {};  
    }
};