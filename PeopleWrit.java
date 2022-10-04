import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PeopleWrit {
  public static void PWrite(String text, ArrayList<Surname> people) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.printf("Записать список людей в файл? (0-да, 1-нет):");
        int a = input.nextInt();
        if (a == 0) {
          FileWriter pw = new FileWriter(text, false);
          for (Surname human : people) {
            pw.write(human.getFullName() + "\n");
            // System.out.println(human);
          }
          pw.flush();
          pw.close();
        }
        //  input.close();
      }
}
