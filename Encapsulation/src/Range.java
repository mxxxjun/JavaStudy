public class Range {
    private int from;
    private int to;

    Range(int from, int to){
        setFrom(from);
        setTo(to);
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
        if(from > to){
            this.to = this.from;
            System.out.println("setForm 호출");
        }
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
        if(this.from > to){
            this.to = this.from;
            System.out.println("setTo 호출");
        }
    }

    public void outRange(){
        System.out.println(from + " ~ " + to);
    }
}
