import java.util.ArrayList;

import DateConv.DateConv;
import Menu.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        DateConv dConv = new DateConv();
        String userInput = Menu.Execute(dConv.getZones());
        int[] chooses = getArrayChooses(userInput);
        ArrayList<String> result = dConv.getDateTimes(chooses);
        clearScreen();
        for (String r : result) {
            System.out.println(r);
        }
    }

    private static int[] getArrayChooses(String userInput) {
        String[] inputArray = userInput.split(" ");
        int[] chooses = new int[inputArray.length];
        for (int index = 0; index < chooses.length; index++) {
            chooses[index] = Integer.parseInt(inputArray[index]);
        }
        return chooses;
    }

    private static void clearScreen() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}
