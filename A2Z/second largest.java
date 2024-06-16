//optimal solution

class Solution {
    int print2largest(int arr[], int n) {
        //int n = arr.length;
        int largest = arr[0];
        int secondLargest = -1;
        for(int i = 1; i < n; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
            else if(arr[i] == largest) continue;
        }
        return secondLargest ;
    }
}

//brute force

class Solution {
    int print2largest(int arr[], int n) {
        int size = arr.length;
        Arrays.sort(arr);
        
        for (int i = size - 2; i >= 0; i--) {
            if (arr[i] != arr[size - 1]) {
                return arr[i];
            }
        }
        
        return -1;
    }
}
