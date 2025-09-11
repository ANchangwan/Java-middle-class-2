package generic.ex1;

public class IntegerBox {
    private Integer value;

    public void getValue() {
        System.out.println("value: " +value+ ", type: "+ value.getClass().getName());
    }

    public void setValue(Integer value) {
        this.value = value;
    }

   }
