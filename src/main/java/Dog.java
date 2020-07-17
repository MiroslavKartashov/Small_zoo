import java.util.Random;

public class Dog extends Animals {
    public Dog(String name, int age, String color, int size) {
        super(name, age, color, size);
        Random random = new Random();
        this.voice = "Гаф-гаф ффсе ";
        maxWright = 10;
        maxAge = 30;
        this.age = random.nextInt(20) - 1;
        this.animalType = "Собака";
        this.maxRun = random.nextInt(500);
        this.maxSwim = random.nextInt(10);
        this.maxJump = Math.random() * 0.9 + 0.1;
        this.weight = random.nextInt(15) + 15;
        this.maxLifeTime = random.nextInt(12) + 12;
    }

    @Override
    public void info() {
        if ((maxSwim <= 10) && (maxJump <= 0.5) && (maxRun <= 500)) {
            System.out.println(this.animalType + " " + this.name + " Пробежала: " + this.maxRun + " m.," + " Прыжок на: " + this.maxJump + " m."
                    + " Проплыла: " + this.maxSwim + " m. ");
        } else
            System.out.println(this.animalType + " " + this.name + " Мне: " + this.age + " лет " + " С моим весов   " + this.weight + "кг."
                    + " я могу только: " + this.voice);
    }
}






