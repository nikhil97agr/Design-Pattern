package structural.composite;

public class MainClass {

    public static void main(String[] args) {
        File file1 = new File("File1", 32);
        Directory dir1 = new Directory("P1", 34);
        Directory dir2 = new Directory("P2", 45);

        Directory dir3 = new Directory("P3", 45);

        dir1.addChild(file1);
        dir3.addChild(dir1);
        dir3.addChild(dir2);

        dir3.display();
        System.out.println(dir3);
    }

}
