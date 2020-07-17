import java.util.Random;

public class Cat extends Animals {
    public Cat(String name, int age, String color, int size) {
        super(name, age, color, size);
        this.name = name;
        Random random = new Random();
        voice = "Бррр я не плаваю Мяууу";
        fight =  "ударить когтистой лапой";
        maxWright = 12;
        maxAge = 30;
        this.age = random.nextInt(15) - 1;
        this.animalType = "Домашняя кошка";
        this.maxRun = random.nextInt(200);
        this.maxSwim = 0;
        this.maxJump = Math.random() * 0.6 + 1.5;
        this.weight = random.nextInt(10) + 10;
        this.maxLifeTime = random.nextInt(12) + 11;
    }

    @Override
    public void swim(int dist) {
        if(dist >= 0) {
            System.out.println( "Я " + this.name +" " + this.animalType + " я не Фелпс - не плаваю!!" + this.voice);
        }
    }

    @Override
    public void run(int dist) {
        if(dist >= 200){
        } else System.out.println(this.name + "Я " + this.animalType + "а не Конюхов!!!  не могу так далеко , РАНить");
    }

    @Override
    public void jump(double height) {
        if(maxJump >= 2){
        }System.out.println(this.name + " " + this.animalType + "я не Бубка!!! столько прыгать !");
    }

    @Override
    public void info() {
       if ((maxSwim >= 0) && (maxJump <=2) && (maxRun <=200)){
        System.out.println(this.animalType + " " + this.name + " Пробежала: " + this.maxRun + " m.," +  " Прыжок на: " + this.maxJump + " m."
                        + this.voice);
       }  else
           System.out.println(this.animalType + " " + this.name + " Мне: " + this.age + " лет " + " С моим весов   " + this.weight + "кг."
                   + " я могу только: " + this.fight);
}
}

