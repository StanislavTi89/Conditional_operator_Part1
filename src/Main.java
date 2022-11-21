public class Main {
    public static void main(String[] args) {
        System.out.println("Условный оператор, Чать1");

        //Задание 1
        System.out.println("Задание 1");
        int age = 18;
        if (age >= 18){
            System.out.println("поздравление пользователя с совершеннолетием");
        } else {
            System.out.println("Вы не совершенно летний");
        }


        //Задание 2
        System.out.println("Задание 2");
        int ageChild = 24;
        if (ageChild < 7){
            System.out.println("Еще мал");
        }
        if (ageChild >= 7 && ageChild <= 17) {
            System.out.println("ребенок ходит в школу");
        }
        else if (ageChild >= 18 && ageChild <= 23) {
            System.out.println("человек уже закончил школу и может отправляться в университет");
        } else {
            System.out.println("человек окончил университет и ему пора искать первую работу");
        }


        //Задание 3
        System.out.println("Задание 3");
        int numberPlace = 0;
        if (numberPlace <= 102 && numberPlace >= 42){
            System.out.println("Всего свободных мест в вагоне (стоячих + сидячих) " + numberPlace);
        }
        else if (numberPlace >= 1 && numberPlace <= 41) {
            System.out.println("Осталось стоячих мест " + numberPlace);
        }
        else {
            System.out.println("Нет свободных мест ");
        }


        //Задание 1
        System.out.println("Домашнее задание - 3");
        System.out.println("Задание 1");
        int stepAge = 25;
        if (stepAge >=2 && stepAge <= 6){
            System.out.println("Если возраст человека равен " + stepAge + ", то ему нужно ходить в детский сад.");
        }
        if (stepAge >=7 && stepAge <= 18){
            System.out.println("Если возраст человека равен " + stepAge + ", то ему нужно ходить в школу.");
        }
        if (stepAge > 18 && stepAge <=24){
            System.out.println("Если возраст человека равен " +stepAge + ", то ему нужно ходить в университет.");
        }
        else {
            System.out.println("Если возраст человека равен " + stepAge + ", то ему нужно ходить на работу.");
        }


        //Задание 2
        System.out.println("Задание 2");
        int aegAttractions = 14;
        if (aegAttractions <5){
            System.out.println("Если ребенку меньше 5 лет, то он не может кататься на аттракционе.");
        }
        if (aegAttractions >=5 && aegAttractions <14){
            System.out.println("Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        else {
            System.out.println("Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.");
        }


        //Задание 3
        System.out.println("Задание 3");
        int one = 111;
        int two = 112;
        int three = 123;
        if (one > two) {
            if (one >= three) {
                System.out.println("Первое число " + one + " больше");
            } else {
                System.out.println("Третье Число " + three + " больше");
            }
        }else if (two > one) {
            if (two>= three) {
                System.out.println("Второе число " + two + " больше");
            }else {
                System.out.println("Третье число " + three + " больше");
            }
        }else {
            if (one > three) {
                System.out.println("Первое число " + one + " болше");
            }else if (three > one) {
                System.out.println("Третье число " + three + " больше");
            }else {
                System.out.println("Все числа равны между собой");
            }
        }

    }


}