import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class Foo {

    @Test
    public void bar() {
        assertThat(2 + 3).isEqualTo(5);
    }

}
