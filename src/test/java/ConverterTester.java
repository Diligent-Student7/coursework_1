import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTester {

    @Test
    void testConverter(){
        //Control values, used secondary converters to confirm.
        //Run multiple times to confirm accuracy.
        assertEquals("2D", Dec2Hex.convertToHex(new String[]{"45"}));
        assertEquals("80520", Dec2Hex.convertToHex(new String[]{"525600"}));
        assertEquals("1D8B", Dec2Hex.convertToHex(new String[]{"7563"}));
        System.out.println("Conversion tests successful.");
    }

    @Test
    void testValidator(){
        assertFalse(Dec2Hex.checkInput(new String[]{""}));
        assertFalse(Dec2Hex.checkInput(new String[]{" "}));
        assertFalse(Dec2Hex.checkInput(new String[]{"Pizza"}));
        assertTrue(Dec2Hex.checkInput(new String[]{"12"}));
        System.out.println("Validation tests successful.");
    }
}
