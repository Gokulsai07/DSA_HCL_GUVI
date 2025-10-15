public class CoffeeShopOffer{
public static void main(String[] args){
int totalCustomers=30;
for(int customer=1;customer<=totalCustomers;customer++){
if(customer==9){
System.out.println("Customer " + customer + ":offer skipped");
}
else if(customer%3==0){
System.out.println("customer"+customer+":Free coffee");
}
else{
System.out.println("customer"+customer+":Regular coffee");
}
}
}
}
                