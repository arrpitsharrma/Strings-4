//TC: O(n log n)
//SC: O(1)
class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (a, b)-> {
            String[] split1 = a.split(" ", 2);
            String[] split2 = b.split(" ", 2);
            
            boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
            boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
            
            if(!isDigit1 && !isDigit2){
                int comp = split1[1].compareTo(split2[1]);
                if(comp == 0){
                    return split1[0].compareTo(split2[0]);
                }
                return comp;
            }
            else if(!isDigit1 && isDigit2){
                return -1;
            }
            else if(isDigit1 && !isDigit2){
                return 1;
            }
            else{
                return 0;
            }
        });
        return logs;
    }
}
