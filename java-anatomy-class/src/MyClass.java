public class MyClass {
    
    public static void main (String [] args) {
       
        String firstName = "Eduardo";
        String lastName = "Freitas";

        String fullName = fullName (firstName, lastName);

        System.out.println(fullName);

    }

        public static String fullName (String firstName, String lastName) {
            return "Restutado do Método " + firstName.concat(" ").concat(lastName);
        }

}
