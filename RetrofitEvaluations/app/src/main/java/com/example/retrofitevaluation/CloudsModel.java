package com.example.retrofitevaluation;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class CloudsModel implements Serializable {

	@SerializedName("all")
	private int all;

	public int getAll(){
		return all;
	}
}