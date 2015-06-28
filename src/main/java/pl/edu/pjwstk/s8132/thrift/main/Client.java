package pl.edu.pjwstk.s8132.thrift.main;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TMultiplexedProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import pl.edu.pjwstk.s8132.thrift.CartItem;
import pl.edu.pjwstk.s8132.thrift.Product;
import pl.edu.pjwstk.s8132.thrift.Shop;
import pl.edu.pjwstk.s8132.thrift.ShoppingCart;

import java.util.List;
import java.util.Random;

public class Client {

    public static void main(String[] args) {
        try {
            /*TTransport transport;

            transport = new TSocket("localhost", 9090);
            transport.open();

            TProtocol protocol = new TBinaryProtocol(transport);
            Shop.Client shopClient = new Shop.Client(protocol);
            ShoppingCart.Client shoppingCart = new ShoppingCart.Client(protocol);*/

            TSocket transport = new TSocket("localhost", 9090);
            transport.open();

            TBinaryProtocol protocol = new TBinaryProtocol(transport);

            TMultiplexedProtocol mp = new TMultiplexedProtocol(protocol, "Shop");
            Shop.Client shopClient = new Shop.Client(mp);

            TMultiplexedProtocol mp2 = new TMultiplexedProtocol(protocol, "ShoppingCart");
            ShoppingCart.Client shoppingCart = new ShoppingCart.Client(mp2);


            System.out.println("=== Products");
            List<Product> productList = shopClient.getListProducts();
            Random random = new Random();
            for(int i=0; i<productList.size(); i++){
                System.out.println("\t Product(id: "+productList.get(i).getId()+", name: "+productList.get(i).getName()+")");
                if(i%2==0){
                    shoppingCart.addProduct(new CartItem(productList.get(i), random.nextInt(10)) );
                }
            }

            System.out.println("=== CarItems");
            for(CartItem cartItem: shoppingCart.getMyCart()){
                System.out.println("\tCartItem(product: Product(id: "+cartItem.getProduct().getId()+", name: "+cartItem.getProduct().getName()+"), amount: "+cartItem.getAmount()+")");
            }


            System.out.println("CheckOut");
            shoppingCart.checkOut();

            System.out.println("=== CarItems");
            for(CartItem cartItem: shoppingCart.getMyCart()){
                System.out.println("\tCartItem(product: Product(id: "+cartItem.getProduct().getId()+", name: "+cartItem.getProduct().getName()+"), amount: "+cartItem.getAmount()+")");
            }

            transport.close();
        } catch (TException x) {
            x.printStackTrace();
        }
    }
}
