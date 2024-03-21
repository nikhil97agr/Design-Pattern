package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
    private String name;

    private int size;

    List<FileSystemComponent> childComponents;


    public Directory(String fileName, int size){
        childComponents = new ArrayList<>();
        this.name = fileName;
        this.size = size;
    }
    @Override
    public void setSize(int size) {
        this.size = size;
    }

    public void addChild(FileSystemComponent fileSystemComponent){
        this.childComponents.add(fileSystemComponent);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void display(){
        System.out.println(name+"/");
        for(FileSystemComponent child : childComponents){
            child.display();
        }
    }

    @Override
    public String toString() {
        return "Directory{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", childComponents=" + childComponents +
                '}';
    }
}
