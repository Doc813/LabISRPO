
package app;
import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Calculator calc = new Calculator();
    public static void main(String[] args) {
        calc.Set_First_op(getInt());
        calc.Set_Second_op(getInt());

        calc.Set_operation(getOperation());
        double result = calc.Calculate();
        System.out.println("Результат операции: " + result);
    }

    public static int getInt() {
        System.out.println("Введите число:");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();// рекурсия
            num = getInt();
        }
        return num;
    }

    public static char getOperation() {
        System.out.println("Введите операцию:");
        char operation;
        String ops = "+-*/";
        if (scanner.hasNext()) {
            char op = scanner.next().charAt(0);
            if (ops.indexOf(op)!=-1)
            operation = op;
            else
            {
                System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
                operation = getOperation();
            }
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            operation = getOperation();
        }
        return operation;
    }

   
}

