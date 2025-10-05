package vbn.state.helpers;

import org.junit.jupiter.api.Test;
import vbn.state.constraints.BinaryOperand;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static vbn.state.helpers.ComputeOperand.getBinaryOperand;

class ComputeOperandTest {
    @Test
    public void testGetBinaryOperand() {
        var result = getBinaryOperand("<=");
        var groundTruth = BinaryOperand.LTE;
        assertEquals(result, groundTruth);
    }
}