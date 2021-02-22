package helloMock;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;

public class Mock1 {
    public static void main(String[] args) {
        List<Integer> list = mock(LinkedList.class);
        list.add(5);
        System.out.println(list.size());
    }
}
