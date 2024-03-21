package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class CustomList<T>{
    List<T> list;
    public CustomList(){
        list = new ArrayList<>();
    }

    public void add(T element){
        list.add(element);
    }

    public CustomIterator<T> iterator(){
        CustomIterator<T> iterator = new CustomIterator<>(list);
        return iterator;
    }
}
