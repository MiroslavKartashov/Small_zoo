public class ZooApp {
    public static void main(String[] args) {

        Cat[] cat = new Cat[5];
        Dog[] dog = new Dog[5];
        cat[0] = new Cat("FatCat", 5, "Черный", 12);
        cat[1] = new Cat("Барсио", 11, "Рыжий", 9);
        cat[2] = new Cat("Васико", 3, "Серый", 7);
        cat[3] = new Cat("Пёс", 8, "Коричневый", 5);
        cat[4] = new Cat("Гудрон", 2, "Черный", 5);

        dog[0] = new Dog("Шарик", 4, "Серый", 12);
        dog[1] = new Dog("Боров", 3, "Рыжий", 15);
        dog[2] = new Dog("Котяра", 1, "Черно-белый", 1);
        dog[3] = new Dog("Бобик", 15, "Зеленый", 5);
        dog[4] = new Dog("Жучка", 6, "Ржавый", 2);
        System.out.println();

        for (int i = 0; i < cat.length; i++) {
            if(cat[i].age > 0){
                  cat[i].info();}
        }System.out.println();

        int i;
        for (i = 0; i < dog.length; i++) {
                if (dog[i].age > 0) {
                    dog[i].info();
                }
        }
    }
}
