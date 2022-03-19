import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class 완주하지못한선수 {
	
	완주하지못한선수(){
		String[] participant =  {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		/*HashMap<String,Integer> map = new HashMap<>();
		for(int i=0;i<participant.length;i++) {
			map.put(participant[i],i);
		}
		System.out.println("위의포문: "+map);
		HashMap<String,Integer> map2 = new HashMap<>();
		for(int i=0;i<completion.length;i++) {
			map2.put(participant[i],i);
		}
		System.out.println("위의포문2: "+map2);
		
		Iterator<HashMap.Entry<String,Integer>> entries = map.entrySet().iterator();
		while(entries.hasNext()) {
			HashMap.Entry<String, Integer> entry = entries.next();
		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}

		System.out.println("entries: "+entries.toString());

	}*/
		/*Arrays.sort(participant);
		Arrays.sort(completion);
		int index = 0 ;
		for(int i =0;i<completion.length;i++) {
			if(!participant[i].equals(completion[i])) {
				System.out.println("participant[i]: "+participant[i]);
				System.out.println("completion[i]: "+completion[i]);
				index=i;
			}	
		}
		System.out.println(index);
	}*/
		HashMap<String, Integer> map = new HashMap<>();
        
        for (String name : participant)
        {
            map.put(name, map.getOrDefault(name, 0)+1);
        }
        
        for (String name : completion)
        {
            map.put(name, map.get(name) - 1);
        }
       
        String answer="";
        for (String key : map.keySet())
        {
            // 값이 하나 이상 있을 경우
            if (map.get(key) > 0)
            {
                answer = key;
                break;
            }
        }
        System.out.println(map);
        System.out.println(answer);
	}

	
	public static void main(String[] args) {
		new 완주하지못한선수();
	}
}
