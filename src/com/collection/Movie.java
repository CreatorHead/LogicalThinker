package com.collection;

import java.util.Comparator;

public class Movie implements Comparable<Movie>{
	String name;
	int votes;
	int ratings;
	@Override
	public int compareTo(Movie o) {
		if(this.ratings > o.ratings){
			return 1;
		}else if( this.ratings < o.ratings){
			return -1;
		}else{
			return 0;
		}
	}
}
