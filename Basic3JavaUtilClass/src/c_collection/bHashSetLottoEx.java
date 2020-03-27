package c_collection;
import java.util.*;

public class bHashSetLottoEx 
{
	public static void main(String[] args) 
	{
		

		for(int i=0;i<5;i++) {
			HashSet<Integer> lottos = new HashSet<Integer>();
			while(lottos.size()<6) {
				int num= (int)(Math.random()*45)+1;
				lottos.add(num);
			}

			//System.out.println(lottos);
			ArrayList<Integer> list = new ArrayList<Integer> (lottos);
			Collections.sort(list);

			System.out.println(list);
		}
	}

}
