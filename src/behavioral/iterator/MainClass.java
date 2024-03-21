package behavioral.iterator;

public class MainClass {

    public static void main(String[] args) {

        CustomList<Integer> list = new CustomList<>();
        list.add(2);
        list.add(3);
        list.add(4);

        CustomIterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
