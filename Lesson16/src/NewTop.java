import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class NewTop {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> names = new LinkedList<>();
        names.add("Ivan");
        names.add("Kate");
        names.add("Petr");
        names.add(1,"Olga");
        System.out.println(names);
        names.get(1);
        names.indexOf("Petr"); // на каком индексе находится обьект
        String[] mass = {"Misha" , null, "Alex"};
        Arrays.asList(mass);
        names.addAll(Arrays.asList(mass));
        names.stream().sorted();

        //TASK #0
        LinkedList<String> phones = new LinkedList<>();
        phones.add("8029543543");
        phones.add("8033563463");
        phones.add("8025344554");

        System.out.println("Input 3 phone number");
        List<String> newPhones = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            newPhones.add(reader.readLine());
        }
        phones.addAll(newPhones);
        String userPhone = "4444";
        phones.removeIf(x -> x.equals(userPhone));
        System.out.println(phones);
        List<String> ph = new ArrayList<>();
        ph.add("111");
        ph.add("222");
        ph.add("333");
        ph.add("444");
        ph.add("555");

        String result = null;
     do {
         System.out.println("Input index");
         String uIS = reader.readLine();
         Integer number;
         try {
             number = Integer.parseInt(uIS);
             result = ph.get(number);
             System.out.println(ph.get(number));
         } catch (NumberFormatException ex) {
             System.out.println("Your input line!!!");
         } catch (IndexOutOfBoundsException ex) {
             System.out.println("non-existent index");
         } catch (Exception ex) {
             System.out.println("unexpected error!");
         }
     }  while (result == null);
        System.out.println(result);
        // Integer.parseInt()  // из строки в число
        // TASK #1




    }
}
