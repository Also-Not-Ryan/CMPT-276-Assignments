public class Student extends Person{
    
    private int intelligence;
    private int studentID;

    public Student(String name, int age){
        super(name, age);
        intelligence = 0;
        studentID = (int)(Math.random() * 100001);
        isInClass = false;
    }

    public int getIntelligence(){
        return this.intelligence;
    }

    public int getStudentID(){
        return this.studentID;
    }

    public void doomscroll_TikTok(){
        if(isInClass){
           this.intelligence = getIntelligence() - 20;
           System.out.println(getName()+ " is doom scrolling tiktok in the middle of class :/");
        }else{
            this.intelligence = getIntelligence() - 10;
            System.out.println(getName()+ " is doom scrolling tiktok at home instead of studying :/");
        }
    }

    public void study(){
        this.intelligence = getIntelligence() + 10;
        System.out.println(getName()+" is studying hard!");
    }

}
