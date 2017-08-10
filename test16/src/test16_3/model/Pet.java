package test16_3.model;

public class Pet {
	private Integer id;
	private String name;
	private String color;
	private Double price;
	
	
	
	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	public Pet() {
		super();
	}
	public Pet(String name, String color, Double price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
}
