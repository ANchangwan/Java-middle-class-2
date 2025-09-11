package generic.ex1;

public class StringBox {
    private String value;

    public void getValue() {
        System.out.println("value: " +value+ ", type: "+ value.getClass().getName());
    }

    public void setValue(String value) {
        this.value = value;
    }

   }
