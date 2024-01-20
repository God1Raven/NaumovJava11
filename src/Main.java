import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = "Вячеслав";
        //1
        int a = sc.nextInt();
        sc.nextLine();
        if(a > 7){
            System.out.println("Привет");
        }
        //2
        String name;
        name = sc.nextLine();
        if(name1.equals(name)) {
            System.out.println("Привет, Вячеслав");
        }else{
            System.out.println("Нет такого имени");
        }
        //3
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        Array(arr);
    }
    public static void Array(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 3 == 0){
                System.out.println(arr[i]);
            }
        }
    }
    //4
    //Нет
    //Не хватает одной квадратной открывающейся скобки и одной
    //закрывающейся круглой скобки, если добавить одну открывающуюся квадратную
    //скобку в начале последовательности и к примеру одну закрывающуюся круглую скобку
    //после третьего знака, считая слева направо, то получится правильная скобочная последовательность
}