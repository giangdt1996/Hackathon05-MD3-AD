package Exam_Advance_1.ra.model;

public class CartItem {
    private int cartItemId;
    private Product product;
    private double price;
    private int quantity;

    public CartItem() {

    }

    public CartItem(int cartItemId, Product product, double price, int quantity) {
        this.cartItemId = cartItemId +1 ;
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public CartItem(int cartItemId,Product product, int quantity) {
        this.cartItemId = cartItemId;
       this.product = product;
       this.quantity = quantity;
    }

    public int getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(int cartItemId) {
        this.cartItemId = cartItemId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "cartItemId: " + cartItemId +
                ", San pham:" + product.toString2() +
                ", quantity: " + quantity +
                ", Thanh tien " + (price=product.getProductPrice()*quantity) +
                '}';
    }
}
