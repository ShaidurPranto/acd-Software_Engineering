package displayUnit;

import display.Display;
import microprocessor.Microprocessor;
import subProduct.SubProduct;

public interface DisplayUnit extends SubProduct {
    public Display getDisplay();
    public Microprocessor getMicroprocessor();
}
