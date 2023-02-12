public class App {
    private static String x = "------------------------";
    public static void main(String[] args) {
        MConditions function1 = new MConditions();
        MWhile function2 = new MWhile();
        MDoWhile function3 = new MDoWhile();
        MFor function4 = new MFor();
        MSwitch function5 = new MSwitch();
        function1.ConditionMethod(0);
        function1.ConditionMethod(1);
        function1.ConditionMethod(-8);
        System.out.println(x);
        function2.WhileMethod(0);
        function2.WhileMethod(1);
        function2.WhileMethod(-8);
        System.out.println(x);
        function3.DoWhileMethod(1);
        function3.DoWhileMethod(0);
        System.out.println(x);
        function4.ForMethod(0);
        System.out.println(x);
        function5.SwitchMethod(1);
        function5.SwitchMethod(3);
        function5.SwitchMethod(2);
        function5.SwitchMethod(0);
        
    }
}
