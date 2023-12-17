package questions.leetcode;
/*
Para esta questão, é necessário retornar um valor "k"
que corresponde a quantidade de elementos diferentes do
parâmetro "val". Além disso, o array "nums" deve estar
organizado de modo que os elementos que correspondem
ao parâmetro "val" sejam 'removidos' do array.

*Na verdade, estes elementos não precisam ser removidos,
basta que os primeiros elementos do array sejam os elementos
diferentes ao do parâmetro "val".
 */
import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        int k = removeElement(nums, val);

        System.out.println(Arrays.toString(nums));
        System.out.println(k);

    }
    public static int removeElement(int[] nums, int val){
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

}
