package Carm�;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Sub extends Super {
	@Override
    public void m1() throws IOException {
        throw new FileNotFoundException();
    }

}
