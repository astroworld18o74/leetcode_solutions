class Solution {
    public String largestNumber(int[] nums) {
        String[] temp=new String[nums.length];
        for(int i=0;i<nums.length;i++)
            temp[i]=String.valueOf(nums[i]);
        Arrays.sort(temp,new fn());
        if(temp[0].equals("0"))return "0";
        StringBuilder sb = new StringBuilder();
		for(String s: temp)
	        sb.append(s);
		
		return sb.toString();
    }
    public class fn implements Comparator<String>{
        public int compare(String a,String b){
            String m=a+b;
            String n=b+a;
            return  n.compareTo(m);
        }
    }
}
