package questions.leetcode;

public class IndexOfFirstOccurrence {
    public static void main(String[] args) {
        String haystack = "ssdbutssdsad";
        String needle = "sad";
        int result = 0;

//        System.out.println(result = firstOccurrence(haystack, needle));
//        System.out.println(result = firstOccurrence2(haystack, needle));
        System.out.println(result = firstOccurrence3(haystack, needle));
    }
    public static int firstOccurrence(String haystack, String needle){
        return haystack.indexOf(needle);
    }

    public static int firstOccurrence2(String haystack, String needle){
        int j = 0;
        int index = 0;

        for (int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(j)){
                j++;
            }else {
                j = 0;
                i = index;
                index = i + 1;
            }
            if (j == needle.length()){
                return index;
            }
        }
        return -1;
    }

    public static int firstOccurrence3(String haystack, String needle){
        int j = 0;
        int start = 0;

        for (int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(j)){
                j++;
                if (j == needle.length()){
                    return start;
                }
            }else {
                i = start;
                start++;
                j = 0;
            }
        }
        return -1;
    }
}
