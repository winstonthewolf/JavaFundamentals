package ObjectsAndClasses;

public class Accounts {
    public static void main(String[] args) {

        Account [] storedAccounts = new Account[10];
        for(int i = 0; i<10; i++){
            storedAccounts[i] =new Account(i,100);
        }

        //TODO method getID == id to retrieve account menu
    }
}
