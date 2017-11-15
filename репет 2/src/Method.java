import java.util.Scanner;

public class Method { //Кдасс в котором находятся методы
    //поле класс (описываются все переменные, которые нужны в нескольких методах)
    Scanner in = new Scanner(System.in);
    // методы которые он использует.
    // 1) открытость метода паблик или приват ,
    // 2)дальше тип возвращаемых данных (например int String char) или void
    // 3)название метода (пишутся с маленькой буквы)
    // 4) в скобках указываются или не указываются парметры, У каждого параметра должен быть тип данных (указ. чере запятую) 5
    // 5) Тело метода пишется в фигурных скобках  {}


    public int input (/*здесь параметра нет */){
        int a = in.nextInt();
        return a;
    }
    public String inputs(){
        String a1 = in.next();
        return a1;

    }
    public void plus(int a, int b) {// МЕтод с парметрами
        System.out.println("Сумма = " + ( a + b));
    }

    public void hello(){
        System.out.println("Здравствуйте ");
    }

    private static void massiv(int[] x) {
        for (int i = 0; i < x.length; i++) {
            if (i % 2 == 0) {
                x[i] = 1;
            }
            else {
                x[i] = i % 5;
            }
        }
    }
    private static void output(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }
    //компилирующая часть (запуск программы начинается с нее )
    public static void main(String[] args) {
        // создается ссылка на клас
        // 1) Название класса , к котрому ты обращаешься
        // 2) Имя которым ты его называешь (любое)
        // 3) = new Method - создание новой ссылки на класс
        Method method = new Method(); // Название класса
        method.hello();//Вызов метода через точку

        System.out.println("Вы ввели число: " + method.input() );
        System.out.println("Ввы ввели строку:" + method.inputs());
        int sum = 0 ;
        int a = 5, b = 6;
        method.plus(a,b); // Вызов метода с парметрами
        //System.out.println("Сумма = " + sum );
        int n = 10;
        int x[] = new int[n];
        massiv(x);
        output(x);
    }
//25 (массив) 38 (массив) 47



}
