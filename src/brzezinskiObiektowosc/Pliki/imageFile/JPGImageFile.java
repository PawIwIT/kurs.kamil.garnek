package brzezinskiObiektowosc.Pliki.imageFile;

import brzezinskiObiektowosc.Pliki.FileType;
import brzezinskiObiektowosc.Pliki.Pliki;

public class JPGImageFile implements Pliki {
    String name;
    int size;
    int compresion;
    FileType fileType;


    public JPGImageFile(String name, int size, FileType fileType, int compresion) {
        this.name = name;
        this.size = size;
        this.fileType = fileType;
        this.compresion = compresion;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public FileType getType() {
        return this.fileType;
    }

    public int getCompresion() {
        return compresion;
    }

    public void displayImage() {
        System.out.println("displaying JPG");

    }
}
