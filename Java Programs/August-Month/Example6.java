class Product {
  // instance variables
  int id;
  String name, type;
  double price;
  int discountPercentage;
  // constructor (parametric)
  Product(int i, String n, String t, double p, int dp) {
    id = i;
    name = n;
    type = t;
    price = p;
    discountPercentage = dp;
  }
  // instance method
  void printProductDetails() {
    System.out.println("ID: " + id);
    System.out.println("Name: " + name);
    System.out.println("Category: " + type);
    System.out.println("Price: " + price);
    System.out.println("Discount Percentage: " + discountPercentage);
  }
  double getDiscountAmount() {
    return price * (discountPercentage / 100.0);
  }
}
public class Example6 {
  public static void main(String[] args) {
    Product p1 = new Product(101, "Laptop", "Electronics", 65000.00, 10);
    p1.printProductDetails();
    System.out.println(p1.getDiscountAmount());
    Product p2 = new Product(102, "Chair", "Furniture", 1000.00, 7);
    p2.printProductDetails();
    System.out.println(p2.getDiscountAmount());
  }
}
