package ru.itpark;

import ru.itpark.model.TariffLook;

public class Main {
    public static void main(String[] args) {
        TariffLook tariffLook = new TariffLook(1,"Включайся Смотри",650, 1200,"Безлимитно","Бесплатно", "Выгода", "Бесплатно", "Бесплатно", "Бесплатно", "Россия", "Безлимитно", 30, "Бесплатно", 300, "Бесплатно");
        System.out.println(tariffLook);
    }


}
