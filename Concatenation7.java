StringBuffer -> Thread Safe

StringBuilder => Not Thread Safe


public class StringBuilderExample  {
 
    public static void main(String[] args) {
 
        String contentStr = "Chennai" + "," + "Bangalore";
        System.out.println("Using String:" + contentStr);
 
        StringBuffer content = new StringBuffer();
        content.append("Chennai").append(",").append("Bangalore");
        System.out.println("Using StringBuffer:" + content);
         
        StringBuilder content2 = new StringBuilder();
        content2.append("Chennai");
        content2.append(",");
        content2.append("Bangalore");
        System.out.println("Using StringBuilder:"+ content2);
    }
}


