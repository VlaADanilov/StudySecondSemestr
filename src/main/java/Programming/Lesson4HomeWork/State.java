package Programming.Lesson4HomeWork;

public enum State {
    Open("открыта"), Closed("закрыта");
    private String str;
    State(String str){
        this.str = str;
    }

    @Override
    public String toString() {
        return str;
    }
}
