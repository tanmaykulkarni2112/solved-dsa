class Solution {
    static ArrayList<Integer> leaders(int n, int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int max = arr[n - 1];
        ans.add(max);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= max){
                max = arr[i];
                ans.add(max);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = ans.size() - 1; i >= 0; i--){
            result.add(ans.get(i));
        }
        return result;
    }
 }
