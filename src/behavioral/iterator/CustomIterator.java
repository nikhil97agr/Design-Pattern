package behavioral.iterator;

import java.util.List;

public class CustomIterator<T>{

    List<T> list;
    int currIndex;

    public CustomIterator(List<T> list){
        this.list = list;
        this.currIndex =0;
    }

    public boolean hasNext(){
        if(currIndex >= list.size() || list.get(currIndex)==null){
            return false;
        }else{
            return true;
        }
    }

    public T next(){
        if(hasNext()){
            T element = list.get(currIndex);
            currIndex++;
            return element;
        }
        else{
            return null;
        }
    }
}
