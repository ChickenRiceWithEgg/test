package chapter7;
//section2:��equals()��equalsIgnoreCase()�������ַ������бȽϣ��Ƚ������ַ��������Ƿ����
public class Equals {
	
	public static void main(String args[]){
		String s1 = new String ("abc");
		String s2 = new String ("ABC");
		String s3 = new String ("abc");
		boolean b1 = s1.equals(s2);
		boolean b2 = s1.equalsIgnoreCase(s2);
		boolean b3 = s1.equals(s3);
		System.out.println(s1+"equals"+s2+":"+b1);
		System.out.println(s1+"equalsIgnoreCase"+s2+":"+b2);  //���Դ�Сд���Ƚ������ַ����Ƿ����
		System.out.println(s1+"equals"+s3+":"+b3);
	}
}
