//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Belka b1 = new Belka("хвост пушистый и красивый", 1,"коричневый"); // Создана Белка 1
        Belka b2 = new Belka("хвост пушистый и красивый ", 3,"темно-коричневый"); // создана Белка 2
        Krot k1 = new Krot("Обычный хвост ", 3,"темный");
        //b2.run(); // вызываем на экземляре метод

        b1.run(); // вызываем на экземляре метод
        b2.run1();          // вызываем на экземляре метод
        k1.run();

        System.out.println("окрас белок "+b1.getColor() + " и " +b2.getColor()+ " окрас крота " + k1.getColor()) ;


    }
}


abstract class Animal {

    public abstract void run(); // а тут нужны фигурны скобки ?

}


class Belka extends Animal {
    String hvost;
    int age;
    private String color;

    public void setColor (String color) { // устанавливаем значение приватной перменной колор
        this.color = color; }

    public String getColor () {  // Читаем имя приватной переменной колор
        return color; }




    public Belka(String hvost, int age,String color) {
        this.hvost = hvost;
        this.age = age;
        this.color=color;

        }

    @Override
    public void run() { // метод для 1 белки
        System.out.println("Белка 1  прыгает по деревьям ");
        System.out.println("У нее "+hvost+" Белке " + age+ " год" + " Белка цвета "+ color);
    }
    public void run1(){ // метод для 2 белки
        System.out.println("Белка 2 скачет по веткам  и ест орехи ");
        System.out.println("У нее "+hvost+" Белке " + age+ " год" + " Белка цвета "+ color);
    }

}


    class Krot extends Animal {
        String hvost;
        int age;
        private String color;

        public String getColor () {  // прочитать имя
            return color; }

        public void setColor (String color) {
            this.color = color; }



        public Krot(String hvost, int age,String color) {
            this.hvost = hvost;
            this.age = age;
            this.color=color;

        }


        @Override
        public void run() {
            System.out.println("Крот роется в норе");
            System.out.println(hvost + "кроту " +age+ " года");


        }
    }

