import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        JavaDeveloper ivan = new JavaDeveloper();
        PythonDeveloper pesho = new PythonDeveloper();
        FrontEndDeveloper gosho = new FrontEndDeveloper();
        System.out.println(ivan.code());
        System.out.println(ivan.nap());

        System.out.println(pesho.code());
        System.out.println(pesho.nap());

        System.out.println(gosho.code());
        System.out.println(gosho.nap());


    }
}