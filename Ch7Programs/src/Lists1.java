import java.util.List;
import java.util.ArrayList;
public class Lists1 {
	public static void main(String[] args) {
List<Integer> mychosenList= new ArrayList <Integer>();
int x=0;
int y=0;
int z=0;
		while(x<=10) {
		mychosenList.add(x,(int)(Math.random()*10));
			x++;
			}
		System.out.println(mychosenList);
	
		while (y<=(mychosenList.size())/2-1) {
		int temp=mychosenList.get(10-y);
		mychosenList.set(10-y, mychosenList.get(y));
		mychosenList.set(y,temp);
		y++;
	}
		System.out.println(mychosenList);
		
		mychosenList.add(0,100);	
		System.out.println(mychosenList);
	
	ArrayList<Integer>copyofmychosenList= new ArrayList<Integer>(mychosenList);
	int h=1;
	while(z<=5){
	
	mychosenList.remove(h);
		h=h+1;
	z++;
	}
	System.out.println(mychosenList);
	System.out.println(copyofmychosenList);
	
	}
	
}