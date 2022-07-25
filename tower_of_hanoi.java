package Recursion;
public class tower_of_hanoi {
    private static void hanoi(int n, char beg, char aux, char end){
        if(n == 1){
            System.out.println("1st Disk moved from "+beg+" to "+end);
            return;
        }
        //Shifting upper 'n-1' disks from A to B using C as auxiliary
        hanoi(n - 1,beg,end,aux);

        //Shift last disk from A to C
        System.out.println("Disk "+n+" moved from "+beg+" to "+end);

        //Shift 'n-1' disks from B to C using A as auxiliary
        hanoi(n - 1,aux,beg,end);

    }
    public static void main(String[] args){
        hanoi(3, 'A', 'B', 'C');
    }
}