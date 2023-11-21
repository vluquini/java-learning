package questions.leetcode;

public class CountNicePairs {
    public static void main(String[] args) {
        int[] nums = {42,11,1,97};
        int pairs = 0;

        for (int i = 0; i < nums.length; i++){
            nums[i] = nums[i] - invertedValue(nums[i]);
        }

        for (int i = 0; i < (nums.length - 1); i++){
            for (int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j])
                    pairs++;
            }
        }
        System.out.println(pairs);
    }

    public static int invertedValue(int value){
        // Converter o número para uma string
        String stringNumber = String.valueOf(value);

        // Inverter a string
        String invertedNumString = new StringBuilder(stringNumber).reverse().toString();

        // Converter a string invertida de volta para um número inteiro
        int invertedNum = Integer.parseInt(invertedNumString);

        return invertedNum;
    }
}
