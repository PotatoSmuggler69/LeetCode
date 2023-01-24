import java.util.ArrayList;

public class Generate_Paranthesis {
    ArrayList<String> fans = new ArrayList<>();
    public static void main(String[] args) {
        Generate_Paranthesis obj = new Generate_Paranthesis();
        int n=4;
        obj.ways(n, n, 0, "",n);
        System.out.println(obj.fans);
    }
    void ways(int o,int c,int stackSum,String ans,int n){
        //base case
        if(o==0 && c==0 && stackSum == 0 ){
            System.out.println(ans+" "+o+" "+c+" "+stackSum);
            fans.add(new String(ans));
            return;
        }

        if(stackSum<0) return;
        //Including (
        if(o>0){
            System.out.println(ans+" "+o+" "+c+" "+stackSum);
            ways(o-1, c, stackSum+1, ans+"(",n);
        }
    
        //Including )
        if(c>0 ){
            System.out.println(ans+" "+o+" "+c+" "+stackSum);
            ways(o, c-1, stackSum-1, ans+")",n);
        }
    }
}
