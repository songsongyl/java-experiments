# 实验三 类的继承与多态实验
## 实验目的
掌握类的继承机制与实现方法<br/>
掌握子类超类构造函数的调用机制<br/>
掌握子类超类的访问方法及访问限制<br/>
掌握接口的声明使用方法<br/>
掌握接口实现类的声明使用方法<br/>
掌握接口默认方法的声明使用方法<br/>
理解接口与抽象类的使用场景及区别<br/>
理解多态的实现机制作用及意义<br/>
## 实验内容
创建实验项目工程java-experiments

设计具有工作能力接口Workable，声明抽象方法updateName()，通过传入的字符串修改姓名；声明抽象方法calculateSalary()，返回计算的薪资

设计员工实体类Employee，公司下所有员工均包含，姓名，基本工资属性；并实现Workable接口，所有公司职员均具有相同的修改姓名行为

设计经理实体类Manager，经理也是一类员工，拥有经理级别；经理薪资 = 基本工资 * 级别 * 80%

设计销售实体类Seller，销售也是一类员工，拥有销售额，销售提成；销售薪资 = 基本工资 + 销售额 * 销售提成

所有员工一定是2种类型之一，即系统种不存在员工，只存在经理和销售

设计薪资业务逻辑操作类SalaryService，提供getTotalSalaries()方法，统计返回，传入的所有工作员工的薪资总额

创建Test类，主函数，创建1个基本工资5000，级别为2的经理；1个基本工资3000，销售额20000，销售提成15%的销售人员

测试薪资计算方法，统计员工工资