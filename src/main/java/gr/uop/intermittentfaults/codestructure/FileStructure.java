/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.uop.intermittentfaults.codestructure;

import java.util.ArrayList;

/**
 *
 * @author Panos
 */
public class FileStructure implements Comparable<FileStructure> {

    private ArrayList<ClassStructure> classes;
    private String fileName;
    private String filePath;
    private FilesToParse parent;

    public FileStructure() {
        this.classes = new  ArrayList<>();
        this.fileName = null;
        this.filePath = null;
        this.parent = null;
    }

    public FileStructure(ArrayList<ClassStructure> classes, String fileName, String filePath, FilesToParse parent) {
        this.classes = classes;
        this.fileName = fileName;
        this.filePath = filePath;
        this.parent = parent;
    }

    public ArrayList<ClassStructure> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<ClassStructure> classes) {
        this.classes = classes;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public FilesToParse getParent() {
        return parent;
    }

    public void setParent(FilesToParse parent) {
        this.parent = parent;
    }

    public void addClassStructure(ClassStructure cStructure) {
        this.classes.add(cStructure);
        cStructure.setParent(this);
    }

    public void removeClassStructure(ClassStructure cStructure) {
        this.classes.remove(cStructure);
    }

    public void printFileStructure() {
        System.out.println("----- FILE STRUCTURE -----");
        System.out.println("CLASSTRUCTURES : ");
        for (ClassStructure myClass : classes) {
            System.out.println("File " + fileName + " , Path : " + filePath);
            myClass.printClassStructure();
        }
    }

    @Override
    public int compareTo(FileStructure fStructure2) {
        int equal = 0;

        if (this.fileName.compareTo(fStructure2.getFileName()) != 0) {
            equal = -1;
        }else if (this.filePath.compareTo(fStructure2.getFilePath()) != 0) {
            equal = -1;
        }else if (this.parent != fStructure2.getParent()) {
            equal = -1;
        }

        return equal;
    }
}
