public class ModelHuman extends Human {
    public ModelHuman(){
        eye = new eyeing();
        hand = new Handing();
    }

    public void disp(){
        System.out.println("モデルによる監視");
    }
}
