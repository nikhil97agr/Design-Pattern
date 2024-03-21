package structural.composite;

public class File implements FileSystemComponent {
    String name;
    int size;


    public File(String name, int size){
        this.name = name;
        this.size = size;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void display(){
        System.out.println(this.name);
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
