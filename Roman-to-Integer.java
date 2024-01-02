class Solution {
    public int romanToInt(String rmn) {
        int int_val = 0;
        int rom_val [] = new int[200];

        rom_val['I'] = 1;
        rom_val['V'] = 5;
        rom_val['X'] = 10;
        rom_val['L'] = 50;
        rom_val['C'] = 100;
        rom_val['D'] = 500;
        rom_val['M'] = 1000;

        int ch_count = rmn.length();

        for(int i=0;i+1 < ch_count;i++){
            if(rom_val[rmn.charAt(i)] < rom_val[rmn.charAt(i+1)]){
                int_val = int_val - rom_val[rmn.charAt(i)];
            }
            else{
                int_val = int_val + rom_val[rmn.charAt(i)];
            }
        }
        int calc_int_val = rom_val[rmn.charAt(ch_count - 1)];

        return int_val + calc_int_val;
    }
}