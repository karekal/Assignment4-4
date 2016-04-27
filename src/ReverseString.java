
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="acadgild";
System.out.println("given string:"+str);
StringBuffer input= new StringBuffer();
input.append(str);
input=input.reverse();
int len=input.length();
System.out.println("reversed string:");
for(int i=0;i < len;i++){
System.out.print(input.charAt(i));	
}
	}

}
