package com.example03;
public class OrderService {
    public static Order addOrder(User user, Item[] items){
    double cost = 0;
    Order order = new Order(null,null,0);
    for(int i = 0;i < items.length;i++){
    cost += items[i].getProduct().getPrice() * items[i].getCount();
    }
    if(cost < user.getBalance()){
     user.setBalance(user.getBalance() - cost);
     order.setCost(cost);
     order.setUser(user);
     order.setItems(items);
      return order;
    }else {
        return null;
    }
    }
}
