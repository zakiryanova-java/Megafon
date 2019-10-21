package ru.itpark;

import ru.itpark.model.TarrifSmotri;

public class Main {
    public static void main(String[] args) {
        TarrifSmotri tarrifSmotri = new TarrifSmotri(1,"Включайся Смотри",650, 1200,"Безлимитно","Бесплатно", "Выгода", "Бесплатно", "Бесплатно", "Бесплатно", "Россия", "Безлимитно", 30, "Бесплатно", 300, "Бесплатно");
        System.out.println(tarrifSmotri);
    }


}
