package org.ultimatecompbg;

import java.util.ArrayList;

public class Page {
    int currentElement = 0;
    int pageSize;
    int elementNumber;
    ArrayList<String> elements = new ArrayList<>();

    private static Page newPage = null;
    public static Page getInstance(){
        if(newPage == null){
            newPage = new Page();
        }
        return newPage;
    }
    public String getElement(int elementIndex){
        return elements.get(elementIndex);
    }
    public void addElement(String newElement){
        elements.add(newElement);
    }
    public int getCurrent() {
        return currentElement;
    }
    public int getSize(){
        return pageSize;
    }
    public void setCurrent(int newCurrent){
        currentElement = newCurrent;
    }
    public void setSize(int newSize){
        pageSize = newSize;
    }
    public int getTotal(){
        return elementNumber;
    }
    public void setTotal(int newTotal){
        elementNumber = newTotal;
    }

}
