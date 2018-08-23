package model;

public class PageData {
	private String section;
	private String bgCcolor;
	private int class_id;
	private String text_align;
	private String description;
	private String text_big;
	private int column1;
	private boolean start_bold;
	private String header_class;
	private String image;
	private String add_on;
	public String getSection() {
		return section;
	}
	public PageData(String section, String bgCcolor, int class_id, String text_align, String description,
			String text_big, int column1, boolean start_bold, String image, String header_class,  String add_on) {
		super();
		this.section = section;
		this.bgCcolor = bgCcolor;
		this.class_id = class_id;
		this.text_align = text_align;
		this.description = description;
		this.text_big = text_big;
		this.column1 = column1;
		this.start_bold = start_bold;
		this.header_class = header_class;
		this.image = image;
		this.add_on = add_on;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getBgCcolor() {
		return bgCcolor;
	}
	public void setBgCcolor(String bgCcolor) {
		this.bgCcolor = bgCcolor;
	}
	public int getClass_id() {
		return class_id;
	}
	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}
	public String getText_align() {
		return text_align;
	}
	public void setText_align(String text_align) {
		this.text_align = text_align;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getText_big() {
		return text_big;
	}
	public void setText_big(String text_big) {
		this.text_big = text_big;
	}
	public int getColumn1() {
		return column1;
	}
	public void setColumn1(int column1) {
		this.column1 = column1;
	}
	public boolean isStart_bold() {
		return start_bold;
	}
	public void setStart_bold(boolean start_bold) {
		this.start_bold = start_bold;
	}
	public String getHeader_class() {
		return header_class;
	}
	public void setHeader_class(String header_class) {
		this.header_class = header_class;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getAdd_on() {
		return add_on;
	}
	public void setAdd_on(String add_on) {
		this.add_on = add_on;
	}
}
