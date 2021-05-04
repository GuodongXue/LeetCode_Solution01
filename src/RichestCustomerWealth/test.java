package RichestCustomerWealth;

public class test {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        int[][] accounts2 = {{1,5},{7,3},{3,5}};
        RichestCustomerWealth r = new RichestCustomerWealth();
        int result = r.maximumWealth(accounts2);
        System.out.println(result);
    }
}
