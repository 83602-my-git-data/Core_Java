
public enum Category {
    STORY(500), CODEING(1000),Moives(450);

	private int categoryValue;
	
	private Category(int i) {
		this.categoryValue = i;
	}
	
	
	public int getCategoryValue() {
		return categoryValue;
	}


	@Override
	public String toString() {
		
		return name()+"@"+categoryValue;
	}
	
	
}
