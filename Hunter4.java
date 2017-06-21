import java.util.*;
class Hunter4
{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    System.out.println("ENTER THE SIZE OF ARRAY");
    int n=scan.nextInt();
    int[] no=new int[n];
    System.out.println("ENTER THE NUMBERS FOR ARRAY");
    for(int i=0;i<n;i++)
    {
      no[i]=scan.nextInt();
    }
   for(int j=0;j<n;j++){
       int a=0,b=0;
       int flag=0;
       a=no[j];
       for(int k=0;k<n;k++){
           b=no[k];
           if(a==b){
               flag++;
           }
           
       }
       if(flag==1){
           System.out.println("UNIQUE NO IS:"+a);
           break;
       }
   }
  }
}
