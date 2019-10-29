import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConverterTester {

    @Test
    public void test(){
        //Control values, used secondary converters to confirm.
        //Run multiple times to confirm accuracy.
        assertEquals("2D", Dec2Hex.convertToHex(new String[]{"45"}));
        assertEquals("80520", Dec2Hex.convertToHex(new String[]{"525600"}));
        assertEquals("1D8B", Dec2Hex.convertToHex(new String[]{"7563"}));
    }
}
