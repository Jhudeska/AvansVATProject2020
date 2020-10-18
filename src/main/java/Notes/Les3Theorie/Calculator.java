package Notes.Les3Theorie;

public class Calculator {

    private boolean isUsable = true;

    public int sum(int a, int b){
        if (isUsable){
            isUsable = false;
        }else{
            throw new IllegalStateException("Cannot reuse this Calculator");
        }
        return a + b;
    }

}
