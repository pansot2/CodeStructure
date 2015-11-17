/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.uop.intermittentfaults.codestructure;

/**
 *
 * @author Panos
 */
class FieldStructure implements FieldParamMethodStructure,Comparable<FieldStructure> {
    private String fieldName;
    private Info fieldInfo;
    private ClassStructure parent;

    public FieldStructure() {
        this.fieldName = null;
        this.fieldInfo = new Info();
        this.parent = null;
    }

    public FieldStructure(String fieldName, Info fieldInfo, ClassStructure parent) {
        this.fieldName = fieldName;
        this.fieldInfo = fieldInfo;
        this.parent = parent;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Info getFieldInfo() {
        return fieldInfo;
    }

    public void setFieldInfo(Info fieldInfo) {
        this.fieldInfo = fieldInfo;
    }

    public ClassStructure getParent() {
        return parent;
    }

    public void setParent(ClassStructure parent) {
        this.parent = parent;
    }
    
    public void printFieldStructure() {
        System.out.println("----- FIELD STRUCTURE -----");
        System.out.println("Field " + fieldName);
        fieldInfo.printInfo();
    }
    
    @Override
    public int compareTo(FieldStructure fStructure2) {
        int equal = 0;

        if (this.parent != fStructure2.getParent()) {
            equal = -1;
        }else if (!this.fieldInfo.equals(fStructure2.getFieldInfo())) {
            equal = -1;
        }else if (this.fieldName.compareTo(fStructure2.getFieldName()) != 0) {
            equal = -1;
        }
        
        return equal;
    }
}
