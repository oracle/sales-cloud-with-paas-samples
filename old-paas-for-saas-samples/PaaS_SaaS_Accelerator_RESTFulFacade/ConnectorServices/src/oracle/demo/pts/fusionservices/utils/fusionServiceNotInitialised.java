

package oracle.demo.pts.fusionservices.utils;


public class fusionServiceNotInitialised extends Exception {
    private static final long serialVersionUID = -3081654542093570933L;

    public fusionServiceNotInitialised(Throwable throwable) {
        super(throwable);
        //test
    }

    public fusionServiceNotInitialised(String string, Throwable throwable) {
        super(string, throwable);
    }

    public fusionServiceNotInitialised(String string) {
        super(string);
    }

    public fusionServiceNotInitialised() {
        super();
    }
}
