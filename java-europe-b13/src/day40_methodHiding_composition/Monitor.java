package day40_methodHiding_composition;

public class Monitor {
	
	private String mode;
	private String manufacturer;
	private int size;
	private Resolution nativeResolution; //Resolution class a baglandi. Error geçti.
	
	public void drawPixel(int x, int y, String color) {
		
		System.out.println("Drawing pixel at " +x+","+y+" in color "+ color);
		
	}

	public Monitor(String mode, String manufacturer, int size, Resolution nativeResolution) {
	
		this.mode = mode;
		this.manufacturer = manufacturer;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}

	public String getMode() {
		return mode;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getSize() {
		return size;
	}

	public Resolution getNativeResolution() {
		return nativeResolution;
	}

}
