package RichestCustomerWealth;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts){
        int[] aa = new int[accounts.length];
        for(int i = 0; i< accounts.length; i++){
            int sum = 0;
            for(int j= 0; j<accounts[i].length; j++){
                sum += accounts[i][j];
            }
            aa[i] = sum;
        }
        int max = 0;
        for(int i = 0; i<aa.length; i++){
            if(aa[i]>max){
                max= aa[i];
            }
        }

    return max;
    }
}
