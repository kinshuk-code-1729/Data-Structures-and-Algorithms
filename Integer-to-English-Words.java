class Solution {
    private final String[] Till_Nineteen = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};

    private final String[] Tens_upto_90 = {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

    public String numberToWords(int num) {
        if (num == 0){
            return "Zero";
        }    
        else{
            return words(num);
        }
    }

    private String words(int x){
        StringBuilder w = new StringBuilder();

        if (x < 20){
            w.append(Till_Nineteen[x]);
        }
        else if(x < 100){
            w.append(Tens_upto_90[x/10]).append(" ").append(Till_Nineteen[x%10]);
        }
        else if(x < 1000){
            w.append(words(x/100)).append(" Hundred ").append(words(x%100));
        }
        else if(x < 1000000){
            w.append(words(x/1000)).append(" Thousand ").append(words(x%1000));
        }
        else if(x < 1000000000){
            w.append(words(x/1000000)).append(" Million ").append(words(x%1000000));
        }
        else {
            w.append(words(x/1000000000)).append(" Billion ").append(words(x%1000000000));
        }

        return w.toString().trim();
    }
}