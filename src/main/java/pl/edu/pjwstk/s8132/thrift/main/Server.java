package pl.edu.pjwstk.s8132.thrift.main;

import org.apache.thrift.TMultiplexedProcessor;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.server.TServer.Args;
import pl.edu.pjwstk.s8132.thrift.Shop;
import pl.edu.pjwstk.s8132.thrift.ShopImpl;
import pl.edu.pjwstk.s8132.thrift.ShoppingCart;
import pl.edu.pjwstk.s8132.thrift.ShoppingCartImpl;

public class Server {

    public static void main(String[] args) {
        try {
            ShopImpl handler = new ShopImpl();
            Shop.Processor processor = new Shop.Processor(handler);

            ShoppingCartImpl handlerShoppingCart = new ShoppingCartImpl();
            ShoppingCart.Processor processorShoppingCart = new ShoppingCart.Processor(handlerShoppingCart);

            Runnable simple = new Runnable() {
                public void run() {
                    shop(processor, processorShoppingCart);
                }
            };

            new Thread(simple).start();
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public static void shop(Shop.Processor processor, ShoppingCart.Processor processor2) {
        try {
            TMultiplexedProcessor processorMulti = new TMultiplexedProcessor();
            processorMulti.registerProcessor("Shop", processor);
            processorMulti.registerProcessor("ShoppingCart",processor2);

            TServerTransport serverTransport = new TServerSocket(9090);
            TServer server = new TSimpleServer(new Args(serverTransport).processor(processorMulti));

            System.out.println("Starting the shop server...");
            server.serve();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
