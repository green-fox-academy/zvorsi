package Counter;

public class Counter {

    private Integer counterValue;
    private Integer initialValue;
    private String counterName;

    public Counter(){
        counterValue = 0;
        initialValue = 0;
    }

    public Counter(Integer counterValue){
        this.counterValue = counterValue;
    }

    public Counter(String counterName, Integer counterValue){
        this.counterName = counterName;
        this.counterValue = counterValue;
        this.initialValue = counterValue;
    }

    public Integer get() {
        return counterValue;
    }

    public Integer getCounterValue() {
        return counterValue;
    }

      public void add(){
        this.counterValue++;
    }

    public void add(Integer number){
        this.counterValue = this.counterValue + number;
    }

    public void reset(){
        this.counterValue = initialValue;
    }

    public void print(){
        /*return "counter is: " + counterValue;*/
        System.out.println("counter " + counterName + " is: " + counterValue);
    }
}