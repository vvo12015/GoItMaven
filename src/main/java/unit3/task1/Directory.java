package src.unit3.task1;

import java.util.List;

public class Directory {
    private List<File> list;

    public void addFile(File f) {
        list.add(f);
    }

    public List<File> getList() {
        return list;
    }

    public void setList(List<File> list) {
        this.list = list;
    }
}
