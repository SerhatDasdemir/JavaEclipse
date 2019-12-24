package day40_methodHiding_composition;

public class Bed {
	
	private String style;
	private int pillow;
	private int weight;
	private int sheets;
	private int quilts;
	
	public void make() {
		System.out.println("MakeClass is a Bed");
	}

	public String getStyle() {
		return style;
	}

	public int getPillow() {
		return pillow;
	}

	public int getWeight() {
		return weight;
	}

	public int  getSheets() {
		return sheets;
	}

	public int getQuilts() {
		return quilts;
	}

	public Bed(String style, int pillow, int weight, int sheets, int quilts) {
		this.style = style;
		this.pillow = pillow;
		this.weight = weight;
		this.sheets = sheets;
		this.quilts = quilts;
	}
	
}
