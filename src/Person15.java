

// обьявим class Person15 (Project (File> new> .....)
public class Person15 {
// обьявим поля переменных ( тип > имя ; )
String name;
        String designation;
// обьявим пустой  конструктор с именем класса  Person15
public Person15() {
        }
// создаем конструктор  с  параметрами, для этого автоматически создается через  клавиша  Alt + insert ->
// c экрана выбирается  conctruktor
public Person15(String name, String designation) {
        this.name = name;
        this.designation = designation;
        }
// вызываем методы  void  c
        void Learn (){
        System.out.println("Уй булоонун  бары окушат");
        }
        void Walk (){
        System.out.println("Чогулуп  шаардын  сыртына  эс алып  келишет");
        }
        void Eat (){System.out.println("Майрамдарда  кафеге  барып тамактанышат");}
}
