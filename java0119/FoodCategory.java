package java0119;

enum FoodCategory {
	KAL("칼국수", 7500), CHICKEN("치킨", 18000), PIZZA("피자",20000);

	int price;
	String name;
	
	int a =FoodCategory(String name, int price){
		this.name = name;
		this.price = price;
	}
}
