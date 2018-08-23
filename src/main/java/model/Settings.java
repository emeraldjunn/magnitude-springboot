package model;


public class Settings {
	private String color;
	private String image;
	private String alignment;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getAlignment() {
		return alignment;
	}
	public Settings(String color, String image, String alignment) {
		super();
		this.color = color;
		this.image = image;
		this.alignment = alignment;
	}
	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}
}