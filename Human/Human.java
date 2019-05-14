public abstract class Human {
    Eye eye;
    Hand hand;
    public Human(){

    }

    public abstract void disp();

    public void eyebody(){
        eye.body();
    }

    public void handbody(){
        hand.body();
    }

    public void doing(){
        System.out.println("動く");
    }

    public void seteyebody(Eye e){
        eye = e;
    }

    public void setHandbody(Hand h){
        hand = h;
    }
}
