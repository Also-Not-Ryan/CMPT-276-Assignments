import java.util.ArrayList;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;

public class main {
    
    public static void main(String args[]){
        Person John = new Student("John Doe", 67);
        Person Jane = new Student("Jane Doe", 19);

        Person Tyler = new Instructor("Tyler, the creator", 27);
        Person DONR = new Instructor("Destoryer Of Nine Realms", 99999);

        ArrayList<Person> individuals = new ArrayList<Person>();
        individuals.add(John);
        individuals.add(Jane);
        individuals.add(Tyler);
        individuals.add(DONR);

        try{
            FileWriter myFile = new FileWriter("Output.txt");
            for(int i = 0; i < individuals.size(); i ++){
                System.out.println("Name: " + individuals.get(i).getName() + "\tAge: " + individuals.get(i).getName());
                myFile.close();
            }
        }catch(IOException e){
            System.out.println("writing to the file didn't work");
        }
    }
}
