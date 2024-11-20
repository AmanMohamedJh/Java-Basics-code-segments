package arrayListss;
import java.util.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class mappss {

	public static void main(String[] args) {

		TreeMap<String, Integer> hm = new TreeMap<String, Integer>();

		hm.put(null, null); //can have null for both hashmap and linedhashMap and treeMap
		hm.put("ONE", 1);
		hm.put("two", 2);
		hm.put("three", 3);
		hm.put("four", 4);
		hm.put("five", 5);

		// Get a set of the entries.
		 Set<Entry<String, Integer>> set = hm.entrySet();
		 // Display the set.
		 for (Entry<String, Integer> me : set) {
		 System.out.print(me.getKey() + ": ");
		 System.out.println(me.getValue());
		 }
	}

}
