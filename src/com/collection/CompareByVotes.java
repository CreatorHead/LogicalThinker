package com.collection;

import java.util.Comparator;

public class CompareByVotes  implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		Integer v1 = o1.votes;
		Integer v2 = o2.votes;
		return v1.compareTo(v2);
	}

}
