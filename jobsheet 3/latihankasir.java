import java.util.ArrayList;
import java.util.Scanner;

class Product {
        String name;
        double price;
        int quantity;

        public Product(String name, double price, int quantity) {
                this.name = name;
                this.price = price;
                this.quantity = quantity;
        }
}
        
public class latihankasir {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                ArrayList<Product> productList = new ArrayList<>();

                System.out.println("Selamat Datang di Mesin Kasir Kami");

                while (true) {
                        System.out.println("Masukkan Nama Produk (selesai untuk mengakhiri): ");
                        String productName = scanner.nextLine();

                        if (productName.equalsIgnoreCase("selesai")) {
                                break;
                        }

                        System.out.print("Masukkan Harga Produk: ");
                        double productPrice = Double.parseDouble(scanner.nextLine());

                        System.out.print("Masukkan Jumlah Produk yang dibeli: ");
                        int productQuantity = Integer.parseInt(scanner.nextLine());
                        
                        productList.add(new Product(productName, productPrice, productQuantity));

                }

                double totalAmount = calculateTotal(productList);

                System.out.println("\n=== Struk Pembayaran ===");
                printReceipt(productList);
                System.out.println("==========================");

                System.out.print("Jumlah uang yang diberikan oleh Pelanggan: $");
                double paymentReceived = Double.parseDouble(scanner.nextLine());

                double changeAmount = paymentReceived - totalAmount;

                System.out.printf("Kembalian: $%.2f%n", changeAmount);
                System.out.println("==========================");

                System.out.println("Terimakasih Atas Pembelian Anda! ");
        }

        public static double calculateTotal(ArrayList<Product> products) {
                double total = 0.0;
                for (Product product : products) {
                        total += product.price * product.quantity;
                }
                return total;
        }
        public static void printReceipt(ArrayList<Product> products) {
                for (Product product : products) {
                        double subtotal = product.price * product.quantity;
                        System.out.printf("%s x%d: $%.2f%n", product.name, product.quantity, subtotal);
                }
                System.out.printf("Total: $%.2f%n", calculateTotal(products));
        }
}
