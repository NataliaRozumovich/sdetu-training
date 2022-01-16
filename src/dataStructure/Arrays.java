package dataStructure;

public class Arrays {
    public static void main(String[] args) {
        String[] alphabet = {"a", "b", "c", "d", "e", "f"};

        for (int i = 0; i < 4; i++) {
            System.out.print(alphabet[i]);
        }
        System.out.println("\n\nUsing length variable");
        int size = alphabet.length;
        for (int n = 0; n < size; n++) {
            System.out.print(alphabet[n]);
        }
        System.out.println("\n\nUsing For-Each method");
        for (String letter : alphabet) {
            System.out.print(letter);
        }

        System.out.println("\n\nDoubleArrays");

        String[][] users = {
                {"John", "Williams", "jw@testemail.com", "14523659841"},
                {"Sara", "Jackson", "sj@testemail.com", "1452321232"},
                {"Rachel", "Wallace", "rw@testemail.com", "145452145452"}
        };
        //Get the size of array
        int numOfUsers = users.length;
        int numOfFields = users[0].length;
        System.out.println("Number of users: " + numOfUsers);
        System.out.println("Number of fields: " + numOfFields);

        //Traverse the double array
        for (int i = 0; i < numOfUsers; i++) {
            System.out.println("-------");
          for (int j = 0; j< numOfFields; j++){
              System.out.println(users[i][j]);
          }
        }

        System.out.println("****************");
        //Traverse the double array
        for (int i = 0; i < numOfUsers; i++) {
            String firstName = users[i][0];
            String lastName = users[i][1];
            String email = users[i][2];
            String phone = users[i][3];
            System.out.println(firstName + " " + lastName + " " + email + " " + phone + " ");
        }
        System.out.println("\n\nUsing For-Each method");
        for (String[] user : users) {
            System.out.print("[ ");
            for (String field : user) {
                System.out.print(field + " ");
            }
            System.out.println(" ]");
        }
    }
}
