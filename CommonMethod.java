package chapter7;

public class CommonMethod {
//section4:����String��ĳ�������
	public static void main(String[] args) {
//length()����
		String name = new String("һ��Ҭ����");
		String address = new String("һ���µ���");
		String message = "��"+address+"��"+name;
		System.out.println("����1��length()����");
		System.out.println("\t�ַ���:"+name+"\t\t�ĳ���Ϊ"+name.length());
		System.out.println("\t�ַ���:"+address+"\t\t�ĳ���Ϊ"+address.length());
		System.out.println("\t�ַ���:"+message+"\t\t�ĳ���Ϊ"+message.length());
		System.out.println("\n");
		
//indexOf("a")������lastIndexOf("a")����
			//indexOf()�����������������ַ������ַ����״γ��ֵ�λ�ã�str.indexOf("a")
			//lastIndexOf()�����������������ַ����ַ������һ�γ��ֵ�λ�ã�str.lastIndexOf("a")
		String str = "We are student   ";
		int index1 = str.indexOf("a");
		int index2 = "We are student".indexOf("a");//����Ҳ����
		int index3 = str.lastIndexOf("e");
		System.out.println("����2��indexOf()��lastIndexOf()����");
		System.out.println("\ta��"+str+"�е�λ����"+index1);
		System.out.println("\ta��"+str+"�е�λ����"+index2);
			//�������indexΪ3����Ϊ��W������e������ ������a������a��Ӧ�����ڵ���λ������
			//String�����ڼ���������������ʾ�ģ��ַ������±��Ǵ�0��length()-1
			//��������ġ�a����index��3
		System.out.println("\te��"+str+"�����һ�γ��ֵ�λ����"+index3);
			//ʹ��lastIndexOf("e")����Ϊ�˴Ӻ���ǰ�ҵڼ�����e������e���һ�γ��ֵ�λ��
			//��� lastIndexOf()�����еĲ����ǿ��ַ���""���򷵻صĽ������ø��ַ���length()�����ķ��ؽ����ͬ��
		System.out.println("\n");
		
//charAt(int index)����
		//��ȡ�ַ���ָ������λ�õ��ַ�
		char Achar = str.charAt(index1);
		System.out.println("����3��charAt()����");
		System.out.println("\t�ַ���str������λ����index���ַ��ǣ�"+Achar);
		System.out.println("\n");
		
//trim()����
		//����һ�����ַ�����������ַ�����ԭ���ַ���������ȥ����ǰ���հ׺�β���հף������ո���Ʊ��tab
		String newStr1 = str.trim();
		System.out.println("����4��trim()����");
		System.out.println("\t�ַ���str�ĳ����ǣ�"+str.length());
		System.out.println("\tȥ�����ҿո��ĳ����ǣ�"+newStr1.length());
		System.out.println("\t���ַ����ǣ�"+str);
		System.out.println("\n");
		
//substring(int beginIndex)��substring(int beginIndex,endIndex)����
		//substring(int beginIndex)�����Ƿ��ش�ָ��������λ�ÿ�ʼ��ȡ��ֱ�����ַ����Ľ�β��һ���ֵ��ַ���
		//substring(int beginIndex,endIndex)�����Ƿ��ش�beginIndex����λ�õ�endIndex����λ��֮����ַ���,������engIndexλ���ϵ��ַ�
		String newStr2 = str.substring(3);
		String newStr3 = str.substring(3, 10);
		System.out.println("����5��substring()����");
		System.out.println("\tԭ�ַ���Ϊ��"+str);
		System.out.println("\t���ַ���1Ϊ��"+newStr2);
		System.out.println("\t���ַ���2Ϊ��"+newStr3);
		System.out.println("\n");
		
//split(String sign)������split(String sign,int limit)����
		//split(String sign)�����ǰ���ָ���ķ�ʽ��ԭ�ַ������зָ�����ָ��Ľ��������ַ���������
		//split(String sign,int limit)��������split(String sign)�����Ļ������޶��˷ָ�Ĵ���
		String split = new String("abc,def,ghi,jkl");
		String[] newSplit1 = split.split(",");
		String[] newSplit2 = split.split(",",2);
		System.out.println("����6��split()����");
		System.out.println("\tԭ�ַ����ǣ�"+split);
		
		System.out.println("\t��\",\"�ָ������������ǣ�");
		for(int i = 0; i<newSplit1.length; i++ ){
			System.out.print("\t");
			System.out.print("  "+newSplit1[i]);
		}
		System.out.println("\n\t�޶��ָ����Ϊ2�����������ǣ�");
		for(int i = 0; i<newSplit2.length; i++ ){
			System.out.print("\t");
			System.out.print("  "+newSplit2[i]);
		}
		System.out.println("\n");
		
//replease(char oldChar��char newChar)����
		//replease�����ɽ�ָ�����ַ������ַ����滻���µ��ַ������ַ���
		//���ַ���oldcharû�г�����ԭ�ַ����У���ֱ�ӷ���ԭ�ַ���
		String replease = str.replace("e","E");
		System.out.println("\n����7��replease()����");
		System.out.println("\t"+replease);
		String replease2 = str.replace("student","STUDENT");
		System.out.println("\t"+replease2);
		System.out.println("\n");
		
//toUpperCase()������toLowerCase()����
		//�����ַ����ǽ��ַ����������ַ���Ϊ��д��ĸ��Сд��ĸ����������ַ�����Ӱ��
		String Mix = new String("Hello Java");
		String Upper = new String("HELLO JAVA");
		String new1 = Mix.toUpperCase();
		String new2 = Upper.toLowerCase();
		System.out.println("����8��toUpperCase()������toLowerCase()����");
		System.out.println("\tԭ�ַ���Mix:"+Mix);
		System.out.println("\tԭ�ַ���UPPER:"+Upper);
		System.out.println("\t�ֱ�任�ɴ�Сд��:");
		System.out.println("\tMix.toUpperCase():"+new1);
		System.out.println("\tUpper.toLowerCase():"+new2);
		System.out.println("\tnew1 equals new2:"+new1.equals(new2));
		String upperMix = Mix.toUpperCase();
		String upperUpper = Upper.toUpperCase();
		System.out.println("\t���Դ�Сд��Mix equals Upper:"+upperMix.equals(upperUpper));
		System.out.println("\n");
		
//startsWith(String prefix)������endsWIth(String suffix)����
		//startsWith(String prefix)���������ж��ַ����Ƿ���ָ�����ݿ�ʼ
		//endsWith(String suffix)���������ж��ַ����Ƿ���ָ�����ݽ���      �����ַ����ķ���ֵ����boolean����
		String num1 = new String("1234567");
		String num2 = new String("7654321");
		boolean b1 = num1.startsWith("12");
		boolean b2 = num1.endsWith("66");
		boolean b3 = num2.startsWith("77");
		boolean b4 = num2.endsWith("21");
		System.out.println("����9:startsWith()������endsWith()����");
		System.out.println("\tnum1����'12'��ʼ����"+b1);
		System.out.println("\tnum1����'66'��������"+b2);
		System.out.println("\tnum2����'77'��ʼ����"+b3);
		System.out.println("\tnum2����'21'��������"+b4);
	}
		
}
