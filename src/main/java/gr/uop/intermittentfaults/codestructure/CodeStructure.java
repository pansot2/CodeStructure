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
public class CodeStructure {
    private ArrayList<FileStructure> files;
    
    public void printCodeStructure() {
        System.out.println("----- CODE STRUCTURE -----");
        System.out.println("FILESTRUCTURES : ");
        for (FileStructure myFile : files) {
            myFile.printFileStructure();
        }
    }
}
