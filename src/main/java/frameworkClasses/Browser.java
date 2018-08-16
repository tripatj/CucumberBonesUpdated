package frameworkClasses;

import java.util.HashMap;
import java.util.Map;

public enum Browser {
	//CHROME,MOZILA,IE
	CHROME("Chrome"),
	MOZILA("Mozila"),
	IE("ie");
	
	private String s;
	
	private static final Map<String, Browser> PROPERTY_STRING_TO_ENUM = new HashMap<String, Browser>();
	
	static {
		for (Browser browser : Browser.values()) {
			
			PROPERTY_STRING_TO_ENUM.put(browser.getName(), browser);
		}
	}
	
	public static Browser fromProperty (String Property) {
		
		return PROPERTY_STRING_TO_ENUM.get(Property);
		
		
	}

	Browser(final String s) {
		this.s = s;
	}

	public String getName() {
	        return s;
	    }
	
	@Override
	public String toString() {
		return this.toString();
	}
	

}
