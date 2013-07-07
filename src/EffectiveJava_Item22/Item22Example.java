package EffectiveJava_Item22;

public class Item22Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1="HelloWorld";
		String s2="Hello World";
		System.out.println(Host.STRING_LENGTH_COMPARATOR.compare(s1, s2));
		System.out.println(Host.SUBSTRING_END_COMPARATOR.compare(s1, s2));
		try{
		throwException(5);
		}catch(IndexOutOfBoundsException e){
			//System.out.println(e);
			e.printStackTrace();
		}

	}
	
	public static  void throwException(int s){
		throw new IndexOutOfBoundsException("LowerBound"+s);
	}

}


