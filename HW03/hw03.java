package HW03;

import java.util.List;
import java.util.ArrayList;

public class hw03 {
    public class Product {
        private int id;
        private String name;
        private double price;

        public Product(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        public double getPrice() {
            return 0;
        }

        // Геттеры и сеттеры
    }

    public class ShoppingCart {
        private List<Product> products;

        public ShoppingCart() {
            products = new ArrayList<>();
        }

        public void addProduct(Product product) {
            products.add(product);
        }

        public void removeProduct(Product product) throws ProductNotFoundException {
            if (products.contains(product)) {
                products.remove(product);
            } else {
                throw new ProductNotFoundException("Product " +
                        "not found in the shopping cart");
            }
        }

        public double calculateTotal() {
            double total = 0;
            for (Product product : products) {
                total += product.getPrice();
            }
            return total;
        }
    }

    public static class ProductNotFoundException extends Exception {
        public ProductNotFoundException(String message) {
            super(message);
        }
    }

    public class Payment {
        public void processPayment(double amount, boolean paymentFailed) throws PaymentFailedException {
            // Логика обработки платежа
            if (paymentFailed) {
                throw new PaymentFailedException("Payment failed");
            }
        }
    }

    public class PaymentFailedException extends Exception {
        public PaymentFailedException(String message) {
            super(message);
        }
    }

    public class Delivery {
        public void processDelivery(String address, boolean deliveryFailed) throws DeliveryFailedException {
            // Логика обработки доставки
            if (deliveryFailed) {
                throw new DeliveryFailedException("Delivery failed");
            }
        }
    }

    public class DeliveryFailedException extends Exception {
        public DeliveryFailedException(String message) {
            super(message);
        }
    }
}


