package quru.qa;

public class HelloWorld {

    public static void main(String[] args) {
        String stringThatBeDysplaedInConsole = null; //строка ограничения

        //можно сперва обьявить переменную, а потом в нее положить
        // String stringThatBeDysplaedInConsole;
        //stringThatBeDysplaedInConsole = "Hello World";

        System.out.println(stringThatBeDysplaedInConsole);

        //Примитивные виды переменных

        // boolean flag0 = false; //ложь
        boolean flag = true; //истина, используется часто

        byte aByte;     //  8 bit (-128 / 127) это -2^7 / 2^7-1
        short aShort;   // 16 bit (-32768 / 32767) это -2^15 / 2^15 - 1

        int aInt;       // 32 bit используемый чаще всего

        long aLong;     // 64 bit

        //числа с плавающей точкой (обычные числа 1.5 и тд)
        float aFloat;
        double aDouble; // 64 bit используемый чаще всего

        char aChar = '1'; //один символ


        //Операторы математические + - * / %

        int a = 10;
        int b = 15; //плохое название переменных
        System.out.println(a - b);
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(b / a);
        System.out.println(b % a);

        //операторы условные > <  <=  >= == != всегда булеан
        System.out.println(2 == 2);
        System.out.println(2 != 3);
        System.out.println(!(2 == 3)); //инвертирует true в false


        //Операторы логические тоже булеан
        // И    &&
        System.out.println(3 > 2 && 1 > 0);

        // ИЛИ  ||
        System.out.println(3 > 2 || 1 > 3);

        if (stringThatBeDysplaedInConsole != null
                && stringThatBeDysplaedInConsole.length() == 3) {
            System.out.println("Строка из трех символов! :" + stringThatBeDysplaedInConsole);
        } else if (stringThatBeDysplaedInConsole == null) {
            System.out.println("Строка null! :" + stringThatBeDysplaedInConsole);
        }else {
            System.out.println("Строка не из трех символов :" + stringThatBeDysplaedInConsole);
        }

        //свитч кейс позволяет описывать большое кол-во иф элсе
        switch (stringThatBeDysplaedInConsole) {
            case "мир": {
                System.out.println("В переменной слово \"Мир\"");
                break;
            }
            case "еще что-то": {
                System.out.println("В переменной слово \"еще что-то\"");
                break;
            }
            default: {
                System.out.println("Ни то ни другое ( ");
            }
        }


        //тернарный оператор
        System.out.println(stringThatBeDysplaedInConsole == null
                        ? "У вас null"
                        : stringThatBeDysplaedInConsole);

        //аналог тернарного оператора выше
        if (stringThatBeDysplaedInConsole == null) {
            System.out.println("У вас null");
        } else {
            System.out.println(stringThatBeDysplaedInConsole);
        }
    }
}
