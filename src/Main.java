public class Main {
    public static void main(String[] args) {
        int age = 10;
        if (age>=18) {
            System.out.println(" Вы достигли совершенолетия ");
        }else {
            System.out.println("Вы не достигли совершенолетия, нужно немного подождать ");
        }
        {

            int temperature = 7;
            if (temperature<5) {
                System.out.println("На улице " + temperature + " нужно надеть шпапку");
            }else{
                System.out.println("На улице " + temperature + " можно идти без шапки" );



            }

            int speed = 50;
            if (speed>60) {
                System.out.println(" Если скорост " + speed + " придется заплотить штраф ");
            }else {
                System.out.println(" Если скорость " + speed + " можно ездить спокойно ");
            }




        }
        int age1 = 25;
        if (age1 <=2 && age1 >=7) {
            System.out.println(" Если возраст человека равен " + age1 + " то ему нужно ходить в садик ");
        }else if (age1>=7 && age1<=17) {
            System.out.println(" Если возраст человека равен " + age1 + " то ему нужно ходить в школу");
        }else  if (age1 >=18 && age1 <=24) {
            System.out.println(" Если возраст человека равен " + age1 + " то ему нужно ходить в институт");
        }else if (age1 > 24){
            System.out.println(" Если возраст человека равен " + age1 + " то ему нужно ходить на работу");

        }
        int age3 = 18;
        if (age3 < 5) {
            System.out.println("Если возраст ребенка равен " + age3 + " то он не может кататься на атракционе");
        }else if (age3 >5 && age3 < 14) {
            System.out.println("Если возраст ребенка равен " + age3 + " то он может кататься только в сопровожденеие взрослого. Если взрослого нет кататься нельзя.");
        }else if(age3 >14 ){
            System.out.println("Если возраст ребенка равен " + age3 + " то ему можна кататьсяся без сопровождения взрослого");

        }
        int place = 105;
        if (place>=0 && place <=60) {
            System.out.println(" В вагоне есть еще сидячие места ");
        }else  if (place >=60 && place <=102) {
            System.out.println("В вагоне только стоячие места ");
        }else  if (place >102){
            System.out.println("В вагоне больше нету мест ");
        }
        int one = 1;
        int two = 5;
        int three= 3;
        if (one>=two && one>=three ) {
            System.out.println(" Наибольшее чесло " + one);
        }else  if (two>=one && two >=three) {
            System.out.println(" Наибольшее чесло " + two);
        }else  if ( three>=one && three >= one){
            System.out.println("Наибольшее чесло " + three);
        }






    }

}