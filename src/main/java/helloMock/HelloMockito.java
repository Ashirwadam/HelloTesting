package helloMock;


import org.hamcrest.CoreMatchers;
import org.mockito.ArgumentCaptor;

import java.util.List;

import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.*;


public class HelloMockito {
    public static void main(String[] args) {
        //Given
//        List<Integer> list = mock(List.class);
//        //When-modifications
//        when(list.get(anyInt())).thenReturn(5, 6).thenReturn(10);
//        given(list.get(anyInt())).willReturn(5);
//        verify(list, times(2)).size();
//        then(list).should(atLeast(4)).add(5);
//        //Then-asserts
//        assertThat(2, CoreMatchers.is(2));
        List<String> strings = mock(List.class);
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        strings.add("Added String");
        Ash ash = new Ash(strings);
        ash.add("Hello");
        then(strings).should().add(captor.capture());

        System.out.println(captor.getValue());

        System.out.println(strings.size());


    }
}

class Ash {
    private List<String> list;
    public Ash(List<String> list) {
        this.list = list;
    }
    public void add(String str) {
//        list.add(str);
    }

}
