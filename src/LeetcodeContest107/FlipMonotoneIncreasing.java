package LeetcodeContest107;

public class FlipMonotoneIncreasing {

    public static void main(String ar[]){
        FlipMonotoneIncreasing sl = new FlipMonotoneIncreasing();
        System.out.println(sl.minFlipsMonoIncr("00011000"));
    }

    private int minFlipsMonoIncr(String S) {
        int oneS=0;
        int ret=0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='1'){
                oneS++;
            }else{
                ret = Math.min(ret+1,oneS);
            }
        }
        return ret;
    }
}
