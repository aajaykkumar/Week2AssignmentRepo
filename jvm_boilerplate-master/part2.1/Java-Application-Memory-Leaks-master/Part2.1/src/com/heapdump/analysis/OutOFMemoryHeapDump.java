package com.heapdump.analysis;

import java.util.ArrayList;
import java.util.List;

public class OutOFMemoryHeapDump {

	public static void main(String[] args) {
		List<ObjectForLeak> leak = new ArrayList<>();
		int i=0;
		while(true) {
			leak.add(new ObjectForLeak());
			//System.out.println(i);
			i++;
		}
	}

}
