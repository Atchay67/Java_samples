package Day2;

public class ForEachLoopDemo {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
//for integer array
		for(int i:a)
		{
			System.out.println(i);
		}
//for character array
		char ch[] = {'j','a','v','a'};
		for (char c:ch)
		{
			System.out.print(c);
		}
		System.out.println(" ");
		String s1[] = {"Java is","programming","learning"};
//for string array
		for (String s:s1)
		{
			System.out.println(s+"  ");
		}

	}

}
