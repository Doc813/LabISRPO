package app;
public class Calculator {
    private Operand first_op = new Operand();
    private Operand second_op = new Operand();
    private char operation;

    public void Set_First_op(int num)
    {
        first_op.Set_value(num);
    }
//  :)  ©KyKyX  
// --> := <=> ~@ #[ #{   +++ ++ *** <| |>  <!--  <<- 
public void Set_Second_op(int num)
    {
        second_op.Set_value(num);
    }

    public int Get_first_op()
    {
        return first_op.Get_value();
    }

    public int Get_second_op()
    {
        return second_op.Get_value();
    }

    public void Set_operation(char op)
    {
        operation = op;
    }

    public double Calculate()
    {
        switch (operation){
            case '+':
                return first_op.Get_value()+second_op.Get_value();
            case '-':
                return first_op.Get_value()-second_op.Get_value();
            case '*':
                return first_op.Get_value()*second_op.Get_value();
            case '/':
                return first_op.Get_value()/second_op.Get_value();
        }
        return -1;
    }
}