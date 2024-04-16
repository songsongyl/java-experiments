package com.example03;

public  class SalaryService {
    public static  double getTotalSalaries(Employee... employees){
     double total = 0;
      for(int i = 0;i < employees.length;i++){
          total += employees[i].calculateSalary(employees[i].getSalary());
      }
        return total;
    }
}
