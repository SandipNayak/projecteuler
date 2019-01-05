package codex;

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,prod=0;
int sum=0;
int sum1=0;
for(i=1;i<=100;i++)
{
	sum=sum+i*i;
	sum1=sum1+i;
}
prod=sum1*sum1;
int diff;
diff=prod-sum;
System.out.println("The difference is"+diff);
	}

}
