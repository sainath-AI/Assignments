
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class WindModel implements Serializable {

	@SerializedName("speed")
	private Object speed;

	@SerializedName("deg")
	private int deg;

	public Object getSpeed(){
		return speed;
	}

	public int getDeg(){
		return deg;
	}
}