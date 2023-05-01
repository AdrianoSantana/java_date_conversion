import Menu.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        String[] userInput = Menu.Execute().split(" ");
        int[] chooses = new int[userInput.length];  
        for (int index = 0; index < chooses.length; index++) {
            chooses[index] = Integer.parseInt(userInput[index]);
            System.out.println(chooses[index]);
        }
    }
}
