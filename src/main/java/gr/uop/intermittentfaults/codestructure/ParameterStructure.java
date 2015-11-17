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
public class ParameterStructure implements FieldParamMethodStructure,Comparable<ParameterStructure>{
    private String parameterName;
    private Info parameterInfo;
    private MethodStructure parent;

    public ParameterStructure() {
        this.parameterName = null;
        this.parameterInfo = new Info();
        this.parent = null;
    }

    public ParameterStructure(String parameterName, Info parameterInfo, MethodStructure parent) {
        this.parameterName = parameterName;
        this.parameterInfo = parameterInfo;
        this.parent = parent;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public Info getParameterInfo() {
        return parameterInfo;
    }

    public void setParameterInfo(Info parameterInfo) {
        this.parameterInfo = parameterInfo;
    }

    public MethodStructure getParent() {
        return parent;
    }

    public void setParent(MethodStructure parent) {
        this.parent = parent;
    }
    
    public void printParameterStructure() {
        System.out.println("----- PARAMETER STRUCTURE -----");
        System.out.println("Parameter " + parameterName);
        parameterInfo.printInfo();
    }
    
    @Override
    public int compareTo(ParameterStructure pStructure2) {
        int equal = 0;

        if (this.parent != pStructure2.getParent()) {
            equal = -1;
        }else if (!this.parameterInfo.equals(pStructure2.getParameterInfo())) {
            equal = -1;
        }else if (this.parameterName.compareTo(pStructure2.getParameterName()) != 0) {
            equal = -1;
        }
        
        return equal;
    }
}
