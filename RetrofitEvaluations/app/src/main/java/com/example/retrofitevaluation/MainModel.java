package com.example.retrofitevaluation;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class MainModel implements Serializable {

	@SerializedName("temp")
	private Object temp;

	@SerializedName("feels_like")
	private Object feelsLike;

	@SerializedName("temp_min")
	private Object tempMin;

	@SerializedName("temp_max")
	private Object tempMax;

	@SerializedName("pressure")
	private int pressure;

	@SerializedName("humidity")
	public int humidity;

	public Object getTemp(){
		return temp;
	}

	public Object getFeelsLike(){
		return feelsLike;
	}

	public Object getTempMin(){
		return tempMin;
	}

	public Object getTempMax(){
		return tempMax;
	}

	public int getPressure(){
		return pressure;
	}

	public int getHumidity(){
		return humidity;
	}
}