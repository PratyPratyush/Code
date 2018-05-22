import java.io.*;
import java.util.*;
class Infix_t_Postfix{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		char[] ch = sc.next().toCharArray();
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		hm.put('+',1);hm.put('-',1);hm.put('*',2);hm.put('/',2);hm.put('^',3);hm.put('(',0);hm.put(')',0);
		Stack<Character> s = new Stack<Character>();
		for(int i=0;i<ch.length;i++){
			if(ch[i]>=97&&ch[i]<=122) System.out.print(ch[i]);
			else if(ch[i]=='('||ch[i]==')'){
				if(ch[i]=='(') s.push(ch[i]);
				else{
					while(!s.isEmpty()&&s.peek()!='('){System.out.print(s.pop());}s.pop();}
			}
			else{
				if(s.isEmpty()) s.push(ch[i]);
				else if(hm.get(ch[i])>hm.get(s.peek())) s.push(ch[i]);
				else{
					while(!s.isEmpty()&&hm.get(ch[i])<=hm.get(s.peek())){System.out.print(s.pop());}
					s.push(ch[i]);
				}
			}
		}
		while(!s.isEmpty()) System.out.print(s.pop());
	}
}