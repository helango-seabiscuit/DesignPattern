package EffectiveJava_Item22;

//mostly concrete strategy classes that implement the same interface can be implemented and instanstiated 
//so that it can be used for repeated calls.
//If used only once just make it as ananonymous implementation while calling the function.
public class Host {
	
	private static class StringLenComparator implements Comparator<String>{

		@Override
		public int compare(String arg1, String arg2) {
			// TODO Auto-generated method stub
			return arg1.length()-arg2.length();
		}
		
		
	}
	
	private static class SubStringEndComparator implements Comparator<String>{
		public int compare(String arg1,String arg2){
			System.out.println("s1"+arg1+",s2"+arg2);
			String s1=arg1.substring(4, 6);
			String s2=arg2.substring(4,6);
			System.out.println("s1"+s1+",s2"+s2);
			return s1.charAt(s1.length()-1)-s2.charAt(s2.length()-1);
			
		}
	}
	
	
	
	public static final Comparator<String> STRING_LENGTH_COMPARATOR=new StringLenComparator();
	
	public static final Comparator<String> SUBSTRING_END_COMPARATOR=new SubStringEndComparator();

}
