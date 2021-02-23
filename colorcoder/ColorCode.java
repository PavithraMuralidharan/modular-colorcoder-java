package colorcoder;

public class ColorCode {
	 public static Color fromIndex(int index, Color[] values) {
	        for(Color color: values) {
	            if(color.getIndex() == index) {
	                return color;
	            }
	        }
	        return null;
	    }
}
