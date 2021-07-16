package com.example.itunes_api.activity;

import java.io.Serializable;
import java.util.List;

public class Responses implements Serializable {
	private List<ResultsItem> results;

	public List<ResultsItem> getResults(){
		return results;
	}

	public void setResults(List<ResultsItem> results) {
		this.results = results;
	}
}