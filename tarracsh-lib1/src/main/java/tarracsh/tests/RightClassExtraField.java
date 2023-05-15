package tarracsh.tests;


public class RightClassExtraField {

    public void m1() {
        System.out.println("m1");
    }

    public void m1(int arg1) {
        System.out.println("m1");
    }

    private void m2() {
        System.out.println("m2");
    }

    private void m2(int arg1) {
        System.out.println("m2");
    }

    @Deprecated
    public int field1;
    
    public int field2;

    private int field3;
    private int field4;
    private int field5;


}
