package digital.innovation.one.utils;

import digital.innovation.one.utils.Internal.DivHelper;
import digital.innovation.one.utils.Internal.MultHelper;
import digital.innovation.one.utils.Internal.SubHelper;
import digital.innovation.one.utils.Internal.SumHelper;

public class Calc {

    private DivHelper divHelper;
    private MultHelper multHelper;
    private SubHelper subHelper;
    private SumHelper sumHelper;

    public Calc() {
        divHelper = new DivHelper();
        multHelper = new MultHelper();
        subHelper = new SubHelper();
        sumHelper = new SumHelper();

    }

    public int div(int a, int b) {
        return divHelper.execute(a, b);
    }

    public int mult(int a, int b) {
        return multHelper.execute(a, b);
    }

    public int sub(int a, int b) {
        return subHelper.execute(a, b);
    }

    public int sum(int a, int b) {
        return sumHelper.execute(a, b);
    }
}
