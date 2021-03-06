package com.example.itunes_api.activity;

import java.io.Serializable;

public class ResultsItem implements Serializable {
	private String wrapperType;
	private String kind;
	private int artistId;
	private int collectionId;
	private int trackId;
	private String artistName;
	private String collectionName;
	private String trackName;
	private String collectionCensoredName;
	private String trackCensoredName;
	private String artistViewUrl;
	private String collectionViewUrl;
	private String trackViewUrl;
	private String previewUrl;
	private String artworkUrl30;
	private String artworkUrl60;
	private String artworkUrl100;
	private Object collectionPrice;
	private Object trackPrice;
	private String releaseDate;
	private String collectionExplicitness;
	private String trackExplicitness;
	private int discCount;
	private int discNumber;
	private int trackCount;
	private int trackNumber;
	private int trackTimeMillis;
	private String country;
	private String currency;
	private String primaryGenreName;
	private boolean isStreamable;

	public String getWrapperType(){
		return wrapperType;
	}

	public String getKind(){
		return kind;
	}

	public int getArtistId(){
		return artistId;
	}

	public int getCollectionId(){
		return collectionId;
	}

	public int getTrackId(){
		return trackId;
	}

	public String getArtistName(){
		return artistName;
	}

	public String getCollectionName(){
		return collectionName;
	}

	public String getTrackName(){
		return trackName;
	}

	public String getCollectionCensoredName(){
		return collectionCensoredName;
	}

	public String getTrackCensoredName(){
		return trackCensoredName;
	}

	public String getArtistViewUrl(){
		return artistViewUrl;
	}

	public String getCollectionViewUrl(){
		return collectionViewUrl;
	}

	public String getTrackViewUrl(){
		return trackViewUrl;
	}

	public String getPreviewUrl(){
		return previewUrl;
	}

	public String getArtworkUrl30(){
		return artworkUrl30;
	}

	public String getArtworkUrl60(){
		return artworkUrl60;
	}

	public String getArtworkUrl100(){
		return artworkUrl100;
	}

	public Object getCollectionPrice(){
		return collectionPrice;
	}

	public Object getTrackPrice(){
		return trackPrice;
	}

	public String getReleaseDate(){
		return releaseDate;
	}

	public String getCollectionExplicitness(){
		return collectionExplicitness;
	}

	public String getTrackExplicitness(){
		return trackExplicitness;
	}

	public int getDiscCount(){
		return discCount;
	}

	public int getDiscNumber(){
		return discNumber;
	}

	public int getTrackCount(){
		return trackCount;
	}

	public int getTrackNumber(){
		return trackNumber;
	}

	public int getTrackTimeMillis(){
		return trackTimeMillis;
	}

	public String getCountry(){
		return country;
	}

	public String getCurrency(){
		return currency;
	}

	public String getPrimaryGenreName(){
		return primaryGenreName;
	}

	public boolean isIsStreamable(){
		return isStreamable;
	}
}