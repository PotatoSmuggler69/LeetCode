class Optimal_Partition {
    public int partitionString(String s) {
        return ways(s)+1;
    }
    int ways(String s){
        HashMap<Character,Integer> obj = new HashMap<>();
        int left =0,cnt=0;
        for(int i=0;i<s.length();i++){
            if(obj.containsKey(s.charAt(i)) && left<=obj.get(s.charAt(i))){
                left = i;
                cnt++;
            }
            obj.put(s.charAt(i),i);
        }
        return cnt++;
    }
}