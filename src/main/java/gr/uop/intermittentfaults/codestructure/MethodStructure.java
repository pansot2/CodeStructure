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
public class MethodStructure implements FieldParamMethodStructure,Comparable<MethodStructure>{
    private String methodName;
    private Info methodInfo;
    private ArrayList<ParameterStructure> parameters;
    private ClassStructure parent;

    public MethodStructure() {
        this.methodName = null;
        this.methodInfo = new Info();
        this.parameters = new ArrayList<>();
        this.parent = null;
    }

    public MethodStructure(String methodName, Info methodInfo, ArrayList<ParameterStructure> parameters, ClassStructure parent) {
        this.methodName = methodName;
        this.methodInfo = methodInfo;
        this.parameters = parameters;
        this.parent = parent;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Info getMethodInfo() {
        return methodInfo;
    }

    public void setMethodInfo(Info methodInfo) {
        this.methodInfo = methodInfo;
    }

    public ArrayList<ParameterStructure> getParameters() {
        return parameters;
    }

    public void setParameters(ArrayList<ParameterStructure> parameters) {
        this.parameters = parameters;
    }
    
    public void addParameterStructure(ParameterStructure parameterStructure) {
        this.parameters.add(parameterStructure);
    }

    public void removeParameterStructure(ParameterStructure parameterStructure) {
        this.parameters.remove(parameterStructure);
    }
    
    public ClassStructure getParent() {
        return parent;
    }

    public void setParent(ClassStructure parent) {
        this.parent = parent;
    }

    public void printMethodStructure() {
        System.out.println("----- METHOD STRUCTURE -----");
        System.out.println("Method " + methodName);
        methodInfo.printInfo();
        System.out.println("PARAMETERSTRUCTURE : ");
        for (ParameterStructure parameter : parameters) {
            parameter.printParameterStructure();
        }
    }
    
    @Override
    public int compareTo(MethodStructure mStructure2) {
        int equal = 0;

        if (this.parent != mStructure2.getParent()) {
            equal = -1;
        }else if (!this.methodInfo.equals(mStructure2.getMethodInfo())) {
            equal = -1;
        }else if (this.methodName.compareTo(mStructure2.getMethodName()) != 0) {
            equal = -1;
        }
        
        return equal;
    }
    
}
