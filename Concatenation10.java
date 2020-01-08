public class TestStringSplit {
 
    public static void main(String[] args)  {
         
        String line = "naresh,savings,1000.50";
        String [] data = line.split(",");
         
        String name = data[0];
        String accountType = data[1];       
        String balance = data[2];
         
        System.out.println(accountType);
        System.out.println(name);
        System.out.println(balance);
         
        Double balanceAmount = Double.valueOf(balance);
        System.out.println(balanceAmount);
         
    }
 
}
