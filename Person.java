public abstract class Person{
    protected int age;
    protected String name;
    protected boolean isInClass;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        this.isInClass = false;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public boolean getIsInClass(){
        return this.isInClass;
    }

    public void setName(String name){
        this.name = name;
    }

    public void enterClassroom(){
        if(isInClass){
            System.out.println(getName()+" is already in the classroom");
        }else{
            this.isInClass = true;
            System.out.println(getName()+ " has entered the classroom");
        }
    }

    public void leaveClassroom(){
        if(isInClass){
            this.isInClass = false;
            System.out.println(getName()+ " has left the classroom");
        }else{
            System.out.println(getName()+" is not in a classroom");
        }
    }

}