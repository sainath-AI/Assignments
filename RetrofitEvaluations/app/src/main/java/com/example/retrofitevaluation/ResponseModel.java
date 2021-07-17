package com.example.retrofitevaluation;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class ResponseModel implements Serializable {

	@SerializedName("coord")
	private CoordModel coord;

	@SerializedName("weather")
	private List<WeatherModel> weather;

	@SerializedName("base")
	private String base;

	@SerializedName("main")
	private MainModel main;

	@SerializedName("visibility")
	private int visibility;

	@SerializedName("wind")
	private WindModel wind;

	@SerializedName("clouds")
	private CloudsModel clouds;

	@SerializedName("dt")
	private int dt;

	@SerializedName("sys")
	private SysModel sys;

	@SerializedName("timezone")
	private int timezone;

	@SerializedName("id")
	private int id;

	@SerializedName("name")
	private String name;

	@SerializedName("cod")
	private int cod;

	public CoordModel getCoord(){
		return coord;
	}




	public String getBase(){
		return base;
	}

	public MainModel getMain(){
		return main;
	}

	public int getVisibility(){
		return visibility;
	}

	public WindModel getWind(){
		return wind;
	}

	public CloudsModel getClouds(){
		return clouds;
	}

	public int getDt(){
		return dt;
	}

	public SysModel getSys(){
		return sys;
	}

	public int getTimezone(){
		return timezone;
	}

	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public int getCod(){
		return cod;
	}
}