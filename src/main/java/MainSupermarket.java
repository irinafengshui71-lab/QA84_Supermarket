import com.aittr.supermarket.supermarket.ISortingCriteria;
import com.aittr.supermarket.supermarket.Product;
import com.aittr.supermarket.supermarket.Supermarket;

public class MainSupermarket {
    public static void main(String[] args){
        Product p1 = new Product("Milk ", 101, "liter", 5.50);
        Product p2 = new Product("Bread ", 102, "piece", 3.20);
        Product p3 = new Product("Rice " , 103, "kg", 8.90);
        Product p4 = new Product("Sugar ", 104, "kg", 4.70);
        Product p5 = new Product("Coffee ", 105, "pack", 18.00);
        Product p6 = new Product("Tea ", 106, "box", 12.50);
        Product p7 = new Product("Cheese ", 107, "kg", 32.00);
        Product p8 = new Product("Butter ", 108, "piece", 9.40);
        Product p9 = new Product("Eggs ", 109, "box", 14.90);
        Product p10 = new Product("Juice ", 110, "liter", 6.80);
        Product p11 = new Product("Potato ", 111, "kg", 6.80);
        Product p12 = new Product( "Potato ", 111, "kg", 7.80 );

        Supermarket lidl = new Supermarket("WalMart", "Burger 10, Schwaebisch Hall");
        lidl.addProduct(p10, 24);
        lidl.addProduct(p9, 48);
        lidl.addProduct(p8,30);
        lidl.addProduct(p7, 12);
        lidl.addProduct(p6, 5);
        lidl.addProduct(p5, 134);
        lidl.addProduct(p4, 200);
        lidl.addProduct(p3, 70);
        lidl.addProduct(p2,60);
        lidl.addProduct(p1,15);
        lidl.addProduct(p11, 100);
        lidl.addProduct(p12, 20);
//        lidl.printProducts();
//        lidl.printProducts();
//        lidl.removeProduct(111,8);
//        lidl.printProducts();
//        lidl.reducePrice(111, 50);
//        lidl.sortProductsBy(ISortingCriteria.SORT_BY_PRICE);
//        lidl.printProducts();
//        lidl.sortProductsBy(ISortingCriteria.SORT_BY_CODE_REVERSE);
//        lidl.printProducts();
//        lidl.sortProductsBy(ISortingCriteria.SORT_BY_NAME_REVERSE);
//        lidl.printProducts();
        lidl.findProduct(106);
        lidl.printProducts();
        lidl.removeProductFromStock(106);
        lidl.reducePriceForAll(20);
        lidl.printProducts();


    }
}

/*
product
----------
name(String)         Yogurt
code(int)            1234
unit(String)         200ml
price(double)        6.70
quantity(double)     30


set/get
toString()
constructor


Supermarket
-------------
name(String)
address(String)
products(ArrayList<product>)
++++++++++++++++++++++++++++
constructor
set/get
addProduct(product,quantity)
printProductsList()
removeProduct(code, Quantity)   VVVVVV
sortProductsBy(criteria)
findProduct(code)               VVVVVV
reducePrice(code, percent)
totalCost()                     VVVVVV
reducePriceAll(percent)










HW* 14
1. public void findProduct(int code)

 2.public void removeProductFromStock(int code)

3.public void reducePriceForAll(percent)











  4.advanced *****
   public double totalCost()




 */