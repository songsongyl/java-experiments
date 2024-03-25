package com.example03;

public class Test {
public static void main(String[] args){
    User user1 = new User("syl", "东北林业大学", 100);
    Product product1 = new Product("cake",10);
    Product product2 = new Product("tea", 6);
   Product[] products = {product1, product2};
    Item item1 = new Item(1,product1);
    Item item2 = new Item(2,product2);
    Item[] items = {item1, item2};
    //Order order = new Order(null,null,0);
  Order  order = OrderService.addOrder(user1,items);
    if(order !=null){
        System.out.println("------------------------");
        System.out.println("商品总额 用户余额 快递地址");
        System.out.println("------------------------");
        System.out.println(order.getCost() + " " + user1.getBalance() +  " " + user1.getAddress());
    }else{
        System.out.println("用户余额不足");
    }
}
}
