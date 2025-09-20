public class Instructor extends Person{
    private double rateMyProfScore;

    public Instructor(String name, int age){
        super(name, age);
        this.isInClass = false;
        this.rateMyProfScore = 0;
    }

    public double getRateMyProfScore(){
        return this.rateMyProfScore;
    }

    public void teach(){
        if(isInClass){
            System.out.println(getName()+ " taught the class");
            rateMyProfScore++;
        }else{
            System.out.println(getName()+ " must be in class to teach");
            rateMyProfScore--;
        }
    }

    public void teachPoorly(){
        if(isInClass){
            System.out.println(getName()+ " taught the class (poorly)");
            rateMyProfScore--;
        }else{
            System.out.println(getName()+" was talking to a wall");
            rateMyProfScore--;
        }
    }
}
