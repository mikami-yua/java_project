public class RecursionTest02
{
	//¼ÆËã1-nµÄºÍ
	public static void main(String[] args){
		int n=4,retValue,retValue1;
		retValue=sum(n);
		retValue1=resum(n);
		System.out.println(retValue);
		System.out.println(retValue1);

		//¼ÆËãnµÄ½×³Ë
		System.out.println(method(6));
		System.out.println(remethod(6));
	}
	
	//·ÇµÝ¹é
	public static int sum(int n){
		int result=0;
		for(int i=0;i<=n;i++){
			result+=i;
		}
		return result;
	}
	//µÝ¹é
	public static int resum(int n){
		if (n==1)
		{
			return 1;
		}
		return n+resum(n-1);
	}


	//·ÇµÝ¹é
	public static int method(int n){
		int result=1;
		for(int i=1;i<=n;i++){
			result*=i;
		}
		return result;
	}

	//µÝ¹é
	public static int remethod(int n){
		if (n==1)
		{
			return 1;
		}
		return n*remethod(n-1);
	}

}