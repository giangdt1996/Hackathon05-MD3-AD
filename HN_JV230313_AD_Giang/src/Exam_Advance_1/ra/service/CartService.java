package Exam_Advance_1.ra.service;

import Exam_Advance_1.ra.model.CartItem;

import java.util.ArrayList;
import java.util.List;

public class CartService implements IService {
    static List<CartItem> cartItems;
    public CartService(){

        cartItems = new ArrayList<>();
    }
    @Override
    public List getAll() {
        return null;
    }

    @Override
    public void save(Object o) {

    }

    @Override
    public Object findById(Object o) {
        return null;
    }



    @Override
    public void delete(Object o) {

    }
    public CartItem findById(int id) {
        for (CartItem item: cartItems) {
            if(item.getCartItemId() == id ){
                // tìm thấy
                return item;
            }
        }
        // không tìm thấy
        return null;
    }
    public List<CartItem> getAllCartItems() {
        return cartItems;
    }
    public int getSize() {
        return cartItems.size();
    }
    public void save(CartItem cartItem){
        if(findById(cartItem.getCartItemId())==null){

            cartItems.add(cartItem);
        }else {
            // update
            cartItems.set(cartItems.indexOf(findById(cartItem.getCartItemId())),cartItem);
        }
    }
    public  void deleteCart(int idDel){
        if(findById(idDel) == null){
            // không ton tại
            System.err.println("ID không tồn tại");
            return;
        }
        // cho phép xóa
        cartItems.remove(findById(idDel));
    }

    public int getNewId(){
        // id tự tăng
        int max=0;
        for (CartItem cart : cartItems) {
            if(cart.getCartItemId()> max){
                max = cart.getCartItemId();
            }
        }
        return max+1;
    }
}
