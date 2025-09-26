public class MiniMethodExercise1 {

        public static void main(String[] args){
            printWelcome();
            displayPlayerName("Najib");
            showLevel(1);
            showLevel(3);
            attack("Thor", "Wolverine");
            attack("Hulk", "Deadpool");
        }

    public static void printWelcome(){
        System.out.println("Welcome to Code Quest!");
        }
    public static void  displayPlayerName(String playerName){
        System.out.println("Player joined: " + playerName);
    }
    public static void showLevel(int level) {
        System.out.println("Level: " + level);
    }
    public static void attack(String attacker, String target){
        System.out.println(attacker + " attacks " + target + "!");
    }


}


