package brzezinskiObiektowosc.Pliki.imageFile;

import brzezinskiObiektowosc.Pliki.FileType;
import brzezinskiObiektowosc.Pliki.Pliki;

public class GIFImageFile implements Pliki {

    String name;
    int size;

    FileType fileType;

    public GIFImageFile(String name, int size, FileType fileType) {
        this.name = name;
        this.size = size;
        this.fileType=fileType;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public FileType getType() {
        return null;
    }
    public void showAnimation(){
        System.out.println("showing funny gif");
    }
}
