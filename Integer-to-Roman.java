class Solution {
    public String intToRoman(int num) {
       int[] nums = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
       String[] notations = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

       StringBuilder rom_str = new StringBuilder();

       for(int k=0;k < nums.length;k++){
           if(num == 0){
               break;
           }
           while(num >= nums[k]){
               num = num - nums[k];
               rom_str.append(notations[k]);
           }
       } 
       return rom_str.toString();
    }
}
