public class johnscosimulator {
    public static void main(String[] args){
        Human human = new johnsco();
        human.eyebody();
        human.handbody();

        Human model = new ModelHuman();
        model.eyebody();
        model.seteyebody(new Powereye());
        model.eyebody();
    }
}
