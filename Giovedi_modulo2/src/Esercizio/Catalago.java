package Esercizio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Catalago {

	public static void main(String[] args) {

		 List<Product> productList = new ArrayList<>();
	        productList.add(new Product(1L, "Senza famiglia", "Books", 130.0));
	        productList.add(new Product(2L, "ActionMan!!!", "Boys", 20.0));
	        productList.add(new Product(3L, "Filosofare con il martello", "Books", 10.0));
	        productList.add(new Product(4L, "Baby my darling", "Baby", 9.0));
	        productList.add(new Product(5L, "AK-47", "Boys", 600.0));
	        
	        
	        List<Order> orderList = new ArrayList<>();

	        List<Product> ordine1 = new ArrayList<>();
	        ordine1.add(new Product(1L, "Senza famiglia", "Books", 13.0));
	        ordine1.add(new Product(3L, "Filosofare con il martello", "Books", 10.0));
	        orderList.add(new Order(1L, "Pending", LocalDate.now(), LocalDate.now().plusDays(5), ordine1, new Customer(1L, "Customer 1", 1)));

	        List<Product> ordine2 = new ArrayList<>();
	        ordine2.add(new Product(3L, "Filosofare con il martello", "Books", 10.0));
	        ordine2.add(new Product(4L, "Baby my darling", "Baby", 9.0));
	        
	        orderList.add(new Order(2L, "Delivered", LocalDate.now().minusDays(2), LocalDate.now(), ordine2, new Customer(2L, "Customer 2", 2)));


	        //#Esercizio1
	        
	        List<Product> filteredProducts = productList.stream()
	                .filter(product -> product.getCategory().equals("Books"))
	                .filter(product -> product.getPrice() > 100)
	                .collect(Collectors.toList());
	        
	        //#Esercizio2 

	        List<Order> filteredOrders = orderList.stream()
	                .filter(order -> order.getProducts().stream()
	                        .anyMatch(product -> product.getCategory().equals("Baby")))
	                .collect(Collectors.toList());

	        //#Esercizio3
	        
	        List<Product> discountedProducts = productList.stream()
	                .filter(product -> product.getCategory().equals("Boys"))
	                .map(product -> {
	                    double discountedPrice = product.getPrice() * 0.9;
	                    product.setPrice(discountedPrice);
	                    return product;
	                })
	                .collect(Collectors.toList());
	        
	        
	        System.out.println("Filtered Products:");
	        filteredProducts.forEach(System.out::println);

	        System.out.println("\nFiltered Orders:");
	        filteredOrders.forEach(System.out::println);

	        System.out.println("\nDiscounted Products:");
	        discountedProducts.forEach(System.out::println);
	        
	}

}
