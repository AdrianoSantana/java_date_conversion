package Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
  public static String Execute(ArrayList<String> zones) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite as opções de que fuso horários que deseja consultar separado por espaço");
    for (var index = 0; index < zones.size(); index++) {
      System.out.printf("%d - %s\n", index, zones.get(index));
    }
    var choose = sc.nextLine();
    return choose;
  }
}
