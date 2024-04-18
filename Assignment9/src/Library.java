import java.util.Objects;

public class Library implements Comparable<Library>{
//isbn(string), category(enum), price(double), authorName(string), quantity(int)

	private String isbn;
	private Category category;
	private double price;
	private String authorName;
	private int quantity;

	public Library(String isbn, String category, double price, String authorName, int quantity) {

		this.isbn = isbn;
		this.category = Category.valueOf(category);
		this.price = price + this.category.getCategoryValue();
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Library [isbn=" + isbn + ", category=" + category + ", price=" + price + ", authorName=" + authorName
				+ ", quantity=" + quantity + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.getIsbn().equals(((Library) obj).getIsbn());
	}

	@Override
	public int compareTo(Library o) {
		return this.getIsbn().compareTo(o.getIsbn());
	}

}
