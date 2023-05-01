package Menu;

import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
  public static String Execute() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite as opções de que fuso horários que deseja consultar separado por espaço");
    
    var zonesSet = ZoneId.getAvailableZoneIds();
    ArrayList<String> zones = new ArrayList<>();
    for (String z: zonesSet) {
      zones.add(z);
    }
    for (var index = 0; index < zones.size(); index++) {
      System.out.printf("%d - %s\n", index, zones.get(index));
    }
    var choose = sc.nextLine();
    return choose;
  } 
}
