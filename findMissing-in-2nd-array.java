//User function Template for Java
class Solution
{
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
        ArrayList<Integer> al = new ArrayList<>();
         Set<Integer> set = new HashSet<>();
         for(int x : b){
             set.add(x);
         }
         for(int x: a){
             if(!set.contains(x))
             al.add(x);
         }
         return al;
    }
}
