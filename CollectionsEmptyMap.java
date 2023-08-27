package com.bean;

import java.util.Collections;
import java.util.Map;

public class CollectionsEmptyMap {

	public static void main(String[] args) {
		
		/*
		 * Collections.emptyList(), the Collections class in Java also provides an emptyMap() method to obtain an immutable empty Map
		 */
		Map<String> emptyMap = Collections.emptyMap();

	        System.out.println("Empty Map: " + emptyMap);
	        System.out.println("Size of Empty Map: " + emptyMap.size());
	}
/*
* we use Collections.emptyMap() to obtain an immutable empty Map. Just like with the empty list example,
* attempting to add elements to this Map will result in an UnsupportedOperationException since the Map is designed to be read-only.

*This method is useful in scenarios where you need to pass an empty Map to methods, return an empty Map from methods,
*or assign an empty Map to a variable without creating a new instance each time.
*/
}
