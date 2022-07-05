public class Chicken extends Animal implements Edible {
    @Override
    public String sound() {
        return "Chicken: cook-a-doodle-doo";
    }
    @Override
    public String howToEat(){
        return "Chicken: fry it";
    }
}
