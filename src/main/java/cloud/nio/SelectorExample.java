package cloud.nio;

import java.io.IOException;
import java.nio.channels.Selector;

public class SelectorExample {

    public static void main(String[] args) throws IOException {

        Selector selector = Selector.open();
        // selector.select(); собирает со всех каналов события в очередь

    }

}
