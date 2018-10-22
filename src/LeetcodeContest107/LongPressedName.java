package LeetcodeContest107;

public class LongPressedName {

    public static void main(String ar[]){
        LongPressedName sl = new LongPressedName();
        System.out.println(sl.isLongPressedName("pyplrz", "ppyypllr"));
    }

    private boolean isLongPressedName(String name, String typed) {

        int n = name.length();
        int t = typed.length();

        if(n == t && name.equals(typed)){
            return true;
        }

        if(t < n){
            return false;
        }

        int l = 0;
        int m = 0;

        int current_count = 0;
        int typed_count = 0;

        char prev = '\0';

        while(l < n){

            char nCh = name.charAt(l);

            // Case when all the typed letters are
            // traveresed and name letters are still not.
            // for example "pyplrz", "ppyypllr"
            // Here z will remain untraversed
            if(m >= t && prev != nCh){
                return false;
            }

            if(prev == 0){
                current_count++;
                prev = nCh;
                l++;
            }else if(prev == nCh){
                current_count++;
                l++;
            }else if(prev == typed.charAt(m)){
                m++;
                typed_count++;
            }else {
                if(typed_count >= current_count){
                    //reset counters and prev
                    typed_count = 0;
                    current_count = 0;
                    prev = '\0';
                }else{ //case when typed_count is less than current
                    return false;
                }
            }
        }
        return true;
    }
}
