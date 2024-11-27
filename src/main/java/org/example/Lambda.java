package org.example;
public class Lambda {

    public static void main(String[] args) {
//        MyLambda demo = new LambdaImplement();
//        demo.display();
//        LambdaInterface demo = (a,b)-> a+b;
        methodTwo();
        Lambda lambda = new Lambda();
        lambda.methodThree();
        Lambda ld = new Lambda();
        Lambda l = new Lambda();
        LambdaInterfaceTwo lit = ld::reverse;
        lit.display("Razu");


    }

    public void methodOne(){
        LambdaInterface demo = (a,b)-> a+b;
        System.out.println(demo.sum(5,20));
    }

    public static void methodTwo(){
        int count=0;
        LambdaInterface demo = (a,b)->{
            System.out.println(a);
            int number=5;
            System.out.println(b);
            return a+b+number;
        };
        System.out.println(demo.sum(5,4));
    }

    public void methodThree(){
        LambdaUse use1 = new LambdaUse();
        use1.callLambda(()->{
            System.out.println("Pass lambda expression as variable");
        });
    }
    public void reverse(String str)
    {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }


}
