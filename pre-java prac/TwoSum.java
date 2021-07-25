public class TwoSum {
    public static void main(String[] args) {
        int[] num = {2,7,11,15};
        int target = 9;

for(int i = 0; i < num.length; ++i)
{
 for(int j = 1; j < num.length; ++i)
 {
    if(num[i]+num[j] == target)
    {
        System.out.println("\n["+i+","+j+"]");
        System.out.println("Because nums[0] + nums[1] == 9, we return [0, 1].\n");
    }
 }
}


    }
}
