/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tarracsh.tests;

public class Library {
    public boolean someLibraryMethod() {
       boolean result = method2() && method3() && methodX();
       return result;
    }

    public boolean someLibraryMethod2() {
        boolean result = method2() && method3() && methodX();
        return result;
    }

    private boolean method2() {
        System.out.println("m2");
        System.out.println("m2");
        System.out.println("m3");
        System.out.println("m4");

        return method3();
    }

    private boolean method3() {
        methodX();
        System.out.println("m3");
        System.out.println("m3");
        System.out.println("m3");
        return true;
    }

    private boolean methodX() {
        System.out.println("m3");
        return true;
    }
}