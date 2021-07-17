
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class CoordModel implements Serializable {

	@SerializedName("lon")
	private Object lon;

	@SerializedName("lat")
	private Object lat;

	public Object getLon(){
		return lon;
	}

	public Object getLat(){
		return lat;
	}
}