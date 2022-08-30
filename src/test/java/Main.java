import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name,surname;
        ArrayList<Employees>list=new ArrayList<>();
        System.out.println("Enter names and surnames");
        while (true){
            System.out.println("Enter name ");
            name= scanner.nextLine();
            System.out.println("Enter surname ");
            surname=scanner.nextLine();
            Employees employe=new Employees(name,surname);
            if (name.equals("")||surname.equals(""))
                break;
            list.add(employe);
        }
        System.out.println(list);
        list.stream()
                .filter(x-> String.valueOf(x.surname.charAt(0)).toLowerCase().equals("j"))
                .forEach(x->System.out.print(x+" "));
    }
}
