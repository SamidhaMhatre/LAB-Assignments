package com.cg.training.lab6;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class Sortbyval implements Comparator<Map.Entry<String, Integer> > {

	@Override
	public int compare(Entry<String, Integer> a, Entry<String, Integer> b) {
		 return (a.getValue())-(b.getValue()); 
		
	}

}

