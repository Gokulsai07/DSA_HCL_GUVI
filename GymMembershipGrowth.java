public class GymMembershipGrowth{
public static void main(String[]args){
int member=5;
for(int month=1;month<=12;month++){
member+=2;
if(month%4==0)
member-=1;
System.out.println("Month"+month+":Total members"+member);
}

}
}