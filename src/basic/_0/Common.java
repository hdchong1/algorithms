package basic._0;

public class Common {
	
	private String varName;
	private int value;
	
	public String getVarName() {
		return varName;
	}
	public void setVarName(String varName) {
		this.varName = varName;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public void printNameValue(String varName, int value) {
		
		System.out.println(varName + " is " + value);
		
	}

}
