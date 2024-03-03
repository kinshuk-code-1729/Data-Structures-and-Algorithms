//User function Template for Java

class Solution {
    String printLargest(int n, String[] arr) {
        Arrays.sort(arr, (x,y) -> (y + x).compareTo(x + y));

        return String.join("", arr);
    }
}
