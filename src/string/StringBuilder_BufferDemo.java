package string;

public class StringBuilder_BufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dung de noi chuoi, đỡ tieu ton bo nho va thoi gian hon
		
		//Co tinh thoi gian chay o cuoi chuong trinh
		String s = "hello";
		s += " java";
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("hello");
		stringBuilder.append(" Java");
		String string = stringBuilder.toString();
		
		System.out.println(s);
		System.out.println(string);
		
		
		
		//Co dong bo (synchronized) nen an toan va cham hon
		StringBuffer stringBuffer = new StringBuffer("hello");
		stringBuffer.append(" JAVA");
		string = stringBuffer.toString();
		
		System.out.println(string);
		
		long startTime = System.currentTimeMillis();
		for(int i =0; i< 100000; i++)
			s+="hello";
		long endTime = System.currentTimeMillis();
		System.out.println("Total execution time string: " + (endTime - startTime));
		
		startTime = System.currentTimeMillis();
		for(int i =0; i< 100000; i++)
			stringBuilder.append("hello");
		System.out.println("Total execution time stringBuilder: " + (System.currentTimeMillis() - startTime));
		
		startTime = System.currentTimeMillis();
		for(int i =0; i< 100000; i++)
			stringBuffer.append("hello");
		System.out.println("Total execution time stringBuffer: " + (System.currentTimeMillis() - startTime));

	}

}
