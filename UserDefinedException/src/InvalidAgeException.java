import java.util.Arrays;

public class InvalidAgeException  extends Exception{

	@Override
	public String toString() {
		return "Age should be > 18"; 
				/*"InvalidAgeException [getMessage()=" + getMessage() + ", getLocalizedMessage()=" + getLocalizedMessage()
				+ ", getCause()=" + getCause() + ", toString()=" + super.toString() + ", fillInStackTrace()="
				+ fillInStackTrace() + ", getStackTrace()=" + Arrays.toString(getStackTrace()) + ", getSuppressed()="
				+ Arrays.toString(getSuppressed()) + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
				*/
	}

	public String getMessage() {
		return "Age should be > 18";
	}
	
}
