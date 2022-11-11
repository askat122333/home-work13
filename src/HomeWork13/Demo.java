package HomeWork13;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        City city1 = new City("Bishkek","Айбек",160d,"Ущелье Ала Арча");
        City city2 = new City("London","Садик Хан",1572d,"Биг-Бен");
        City city3 = new City("Paris","Анн Идальго",105.4d,"Лувр");


        Village village1 = new Village("Беловодск","Айдар",16d);
        Village village2 = new Village("Сосновка","Малик",20d);
        Village village3 = new Village("Озерное","Хантемир",12d);

       Locality[] localities = {city1,city2,city3,village1,village2,village3};
        Scanner sc = new Scanner(System.in);
        System.out.println("Имя руководителя : ");
        String name = sc.nextLine();
       Locality.search(localities,name);

    }
}
