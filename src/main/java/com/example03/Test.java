package com.example03;

public class Test {
    public static void main(String[] args){

        Manager manager1 = new Manager("syl",5000,2);
//        manager1.setLevel(2);
//        manager1.setSalary(5000);
        Seller seller1 = new Seller("ss",3000,20000,0.15);
//        seller1.setSalary(3000);
//        seller1.setCount(20000);
//        seller1.setCommission(0.15);
        System.out.println(manager1.getName());
        manager1.updateName("ssyyll");
        System.out.println("改名为：");
        System.out.println(manager1.getName());
        Employee[] employees = {manager1 , seller1};
       double total = SalaryService.getTotalSalaries(manager1 , seller1);
     //  Employee[] employees = {manager1 , seller1};
        System.out.println("总工资为：");
        System.out.println(total);
    }
}
