class Product{
    int prd_code;
    String prd_name;
    double prd_price;
    Product (int prd_code,String prd_name,double prd_price){
          this.prd_code=prd_code;
          this.prd_name=prd_name;
          this.prd_price=prd_price;
    }
}
public class LowestpriceProduct{
    public static void main(String[]args){
       Product p1=new Product(101,"Laptop",55000);
       Product p2=new Product(102,"Phone",55000);
       Product p3=new Product(103,"Mouse",500);

       Product lowest=p1;
       if(p2.prd_price<lowest.prd_price){
          lowest=p2;
       }
       if(p3.prd_price<lowest.prd_price){
        lowest=p3;
       }
       System.out.println("Product with lowest price");
       System.out.println("code"+lowest.prd_code);
       System.out.println("name"+lowest.prd_name);
       System.out.println("price"+lowest.prd_price);
    
}
}