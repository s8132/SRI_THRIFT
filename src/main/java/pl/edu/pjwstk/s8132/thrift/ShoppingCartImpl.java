package pl.edu.pjwstk.s8132.thrift;

import org.apache.thrift.TException;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartImpl implements ShoppingCart.Iface{

    List<CartItem> cartItemList = new ArrayList<>();

    @Override
    public List<CartItem> getMyCart() throws TException {
        return this.cartItemList;
    }

    @Override
    public void addProduct(CartItem cartItem) throws TException {
        this.cartItemList.add(cartItem);
    }

    @Override
    public void checkOut() throws TException {
        this.cartItemList.clear();
    }
}
