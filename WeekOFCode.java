import java.io.*;
import java.util.*;
class WeekOFCode{
	static int a=-1,b=-1;
	static int x=-1,y=-1;
	static boolean check(int i,int j){
		if((i>=0&&i<=7)&&(j>=0&&j<=7))
				return true;
		else
			return false;
	}
	static boolean bishop(int i,int j,char ch[][]){
		int p=i+1;
		int q=j-1;
		boolean ret=false;
		//left
		while(check(p,q)){
			if(p==a&&q==b){
				ret=true;
				break;
				//return true;
			}
			else if(ch[p][q]!='#'){break;}
			p++;q--;
		}
		//right
		p=i+1;q=j+1;
		if(ret) return ret;
		while(check(p,q)){
			if(p==a&&q==b){
				return true;
			}
			else if(ch[p][q]!='#'){break;}
			p++;q++;
		}
		return ret;
	}
	static int fun(char ch[][]){
		int count=0;
		System.out.println(a+" "+b);
		System.out.println(x+" "+y);
		ch[x][y]='#';
		x=x-1;
		//knight------
		if(check(x+1,y-2)){
			if(x+1==a&&y-2==b)
				count++;
		}
		else if(check(x+1,y+2)){
			if(x+1==a&&y+2==b)
				count++;
		}
		//rook----
		if(x==a||y==b)
			count=count+2;
		//bishop
		if(bishop(x,y,ch)) count+=2;

		return count;
	}
	public static void main(String args[]) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		char[][] ch = new char[8][8];
		while(t-->0){
			a=-1;b=-1;
			x=-1;y=-1;
			for(int i=0;i<8;i++){
				char[] ch1 = br.readLine().toCharArray();
				for(int j=0;j<ch1.length;j++){
					ch[i][j]=ch1[j];
					if(ch[i][j]=='k'){
						a=i;b=j;
					}
					else if(ch[i][j]=='P'){
						x=i;y=j;
					}
				}
			}
			// for(int i=0;i<8;i++){
			// 	for(int j=0;j<8;j++){
			// 		System.out.print(ch[i][j]+" ");
			// 	}
			// 	System.out.println(" ");
			// }
			int value = fun(ch);
			System.out.println(value);
		}
	}
}