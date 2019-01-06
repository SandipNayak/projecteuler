package codex;


public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=3;a<=1000/2;a++)
		{
			for(int b=a+1;b<1000/2;b++)
			{
				double sum=Math.pow (a,2)+Math.pow(b,2);
                double c=1000-a-b;
                double d=Math.pow (c,2);
                  if (d==sum)
              {
                	  int pro= (int)(a*b*c);
              System.out.println("product="+pro);
               break;
              }
			}
		}

	}

}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
