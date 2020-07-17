/*1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true)
5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
*/

public class Animals {
    public String animalType;
    public String animalVid;
    public String animalClass;
    public String animalFamily;
    public String animalKind;
    public String voice;
    public String fight;
    public String color;
    public String name;
    protected int weight;
    protected int maxWright;
    protected int age;
    protected int maxLifeTime;
    protected int maxAge;
    protected int maxRun;
    protected int maxSwim;
    protected double maxJump;

    public Animals() {

    }

    public Animals(String name, int age, String color, int weight ){
        this.name = name; // при создании объекта нужно ввести имя
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public void run (int dist) { //  дистанция
        if ((this.maxRun >= dist)  && (this.age < maxAge) && (this.weight < maxWright)) {
            System.out.println(this.animalType + " " + this.name + " пробежала " + dist + " m.");
        }
        else System.out.println(this.name + "Я " + this.animalType + "а не Конюхов!!!  не могу так далеко , РАНить");
    }
    public void swim(int dist) {// лавать
        if ((this.maxRun >= dist)  && (this.age < maxAge) && (this.weight < maxWright))  {
            System.out.println(this.animalType + " " + this.name + " преодаленно " + dist + " m.");
        }
        else System.out.println("Я " + this.name +  this.animalType + "я не Фелпс!!! столько плыть не смогу ! ");
    }

    public void jump(double height) {// прыгаем
        if ((this.maxJump >= height) && (this.age < maxAge) && (this.weight < maxWright)){
            System.out.println(this.animalType + " " + this.name + " подпрыгнуто на  " + height + " m.");
        }
        else System.out.println(this.name + " " + this.animalType + "я не Бубка!!! Высоко очень !");
    }

    public void info() { // Итого
        System.out.println(this.animalType + " " + this.name + " Пробежала: " + this.maxRun + " m., Проплыла: " + this.maxSwim + " m., Подпрыгнуто: " + this.maxJump + " m.");
    }
}


