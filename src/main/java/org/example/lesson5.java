package org.example;

public class lesson5 {


        public static void main(String[] args) {
            //Типы данных
            // логический
            boolean varBoolean = false;// (или true)
            // целочисленный
            byte varByte = 100; // -128..127
            short varShort = 1000; //-32768...32767
            int varInt = 2000000000; // самый частый
            long varLong = 0L;
            var aVar = 10;//сам решает, какой будет тип
            // с плавающей точкой
            float varFloat = 0.0F;//32 бита
            double varDouble = 0.0D;//64 бита, самый частый 95%
            //символ(под капотом число)
            char varChar = 'f';
            String varString0 = "Монетка ";
            String varString1 = "Монетка ";


            //Операторы
            //Математические
            int res = 4 - 3;// + - / (возвращает только целое число) * %(получить остаток от деления)
            int resu = ++varInt; // вернет добавив еденицу
            //Сравнение
            boolean sravni = res == 2; //Равно?
            boolean sravni2 = res != 2; // Не равно?
            boolean eq = varString0.equals(varString1); // сравнение String (адресных)
            //Логические
            int coinNominal = 2;
            String coinCurrency = "RUB";
            // && и || или

            //Тренировка
            byte test01 = 100;
            byte test02 = 100;
            int test03 = 200;
            double test04 = 200.02;
            double test05 = 200.05;
            //byte resByte = test01 + test02; вызывает переполнение
            int res01 = test01 + test02;
            System.out.println("Результат1=" + res01);

            int res02 = test03 + test02;
            System.out.println("Результат2=" + res02);

            double res03 = (double) (test03 + test04); // сложение int и double
            System.out.println("Результат3=" + res03);

            double res04 = test04 + test05;
            System.out.println("Результат4=" + res04);

            if ((test01 == test03) && (test05>200)){
                System.out.println("Uraaaa");
            }
            else if (test03>300)
            {
                System.out.println("Не ура");
            } else {
                System.out.println("Все плохо");
            }


        }
    }


