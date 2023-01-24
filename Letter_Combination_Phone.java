import java.util.HashMap;
import java.util.*;
public class Letter_Combination_Phone {
    HashMap<Character,ArrayList<String>> info = new HashMap<>();
    ArrayList<String> ans = new ArrayList<>();
    
    public static void main(String[] args) {
        Letter_Combination_Phone obj = new Letter_Combination_Phone();
        obj.info.put('2',new ArrayList<String>(Arrays.asList("a","b","c")));
        obj.info.put('3',new ArrayList<String>(Arrays.asList("d","e","f")));
        obj.info.put('4',new ArrayList<String>(Arrays.asList("g","h","i")));
        obj.info.put('5',new ArrayList<String>(Arrays.asList("j","k","l")));
        obj.info.put('6',new ArrayList<String>(Arrays.asList("m","n","o")));
        obj.info.put('7',new ArrayList<String>(Arrays.asList("p","q","r","s")));
        obj.info.put('8',new ArrayList<String>(Arrays.asList("t","u","v")));
        obj.info.put('9',new ArrayList<String>(Arrays.asList("w","x","y","z")));
        obj.ways("", "", 0);
        System.out.println(obj.ans);
    }
    void ways(String input,String output,int index){
        //base case
        if(index==input.length()){
            ans.add(output);
            return;
        }

        for(String i : info.get(input.charAt(index)) ){
            ways(input, output+i, index+1);
        }
    }
}
