import org.slf4j.Logger;

/**
 * <p>  </p>
 * <p> created at 2022-05-31 13:39 by lesible </p>
 *
 * @author 何嘉豪
 */
public class Main {

    public static void main(String[] args) {
        Logger log = ProductKt.getLog();
        String firstProduct = ProductKt.addProduct("test", 0.1D, null);
        String secondProduct = ProductKt.addProduct("test", 0.2D);
        String thirdProduct = ProductKt.addProduct("test");
        log.info(firstProduct);
        log.info(secondProduct);
        log.info(thirdProduct);
    }

}
