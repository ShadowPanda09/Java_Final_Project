public class property extends square{
    private String type = "Property";
    private player owner;
    private int cost;
    private int curRent;
    private int[] posRent =  new int[7];
    private String color;
    private boolean monopoly;
    private int level;
    private int mortgage;
    private int position;

    public property(int position, int cost, String color, int[] posRent, int curRent, int mortgage){
        this.position = position;
        this.cost = cost;
        this.color = color;
        this.posRent = posRent;
        this.curRent = curRent;
        this.mortgage = mortgage;
    }
}