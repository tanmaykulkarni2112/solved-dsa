//g4g ode
// check optimal

class Solution {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < m; i++) {
            set.add(arr2[i]);
        }
        ArrayList<Integer> result = new ArrayList<>(set);
        Collections.sort(result);
        
        return result;
    }
}
