package com.example.retrofitevaluation;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class SysModel implements Serializable {

	@SerializedName("type")
	private int type;

	@SerializedName("id")
	private int id;

	@SerializedName("country")
	private String country;

	@SerializedName("sunrise")
	private int sunrise;

	@SerializedName("sunset")
	private int sunset;

	public int getType(){
		return type;
	}

	public int getId(){
		return id;
	}

	public String getCountry(){
		return country;
	}

	public int getSunrise(){
		return sunrise;
	}

	public int getSunset(){
		return sunset;
	}
}