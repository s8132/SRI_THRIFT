namespace java pl.edu.pjwstk.s8132.thrift

struct Product {
    1: i32 id,
    2: string name
}

struct CartItem{
    1: Product product,
    2: i32 amount=1
}

service ShoppingCart {
    list<CartItem> getMyCart(),
    void addProduct(1: CartItem cartItem),
    void checkOut();
}
service Shop {
    list<Product> getListProducts()
}
