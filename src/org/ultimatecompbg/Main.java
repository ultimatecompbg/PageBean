package org.ultimatecompbg;

import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Main {


    public static void main(String[] args){


        Page newPage = Page.getInstance();

        // elements parameters
        Scanner numberScanner = new Scanner(System.in);
        int elementNumber = parseInt(numberScanner.nextLine());
        newPage.setTotal(elementNumber);
        Scanner sizeScanner = new Scanner(System.in);
        int pageSize = parseInt(sizeScanner.nextLine());
        newPage.setSize(pageSize);

        for(int i = 0; i < elementNumber; i++){
            Scanner elementScanner = new Scanner(System.in);
            String element = elementScanner.nextLine();
            newPage.addElement(element);
        }


        /*while(true){
f
            ArrayList<String> newPage = new ArrayList<String>();
            for(int y = 1; y <= pageSize; y++){
                Scanner nameScanner = new Scanner(System.in);
                String newName = nameScanner.nextLine();
                newPage.add(newName);
            }
            pageBean.pages.add(newPage);
        }*/
        next(newPage);
        while(true){
            Scanner scanCommands = new Scanner(System.in);
            String input = scanCommands.nextLine();
            if(input.equals("end")){
                break;
            }
            switch(input){
                case "next":
                    next(newPage);
                    break;
                case "previous":
                    previous(newPage);
                    break;
                case "first page":
                    firstPage(newPage);
                    break;
                case "last page":
                    lastPage(newPage);
                    break;
                case "current page":
                    getCurrentPageNumber(newPage);
                    break;

            }
        }


    }
    public static void next(Page newPage){

        if(hasNext(newPage)){
            for(int i = newPage.getCurrent(); i < newPage.getCurrent() + newPage.getSize() && i < newPage.getTotal(); i++){
                System.out.println(newPage.getElement(i));
            }
            newPage.setCurrent(newPage.getCurrent() + newPage.getSize());
        }

    }
    public static void previous(Page newPage) {

        if(hasPrevious(newPage)){
            newPage.setCurrent(newPage.getCurrent() - (newPage.getSize() * 2));
            next(newPage);
        }else{
            System.out.println("There are no previous pages!");
        }

    }
    public static void firstPage(Page newPage) {
        newPage.setCurrent(0);
        next(newPage);
    }
    public static void lastPage(Page newPage) {

        newPage.setCurrent(newPage.getCurrent() - newPage.getSize());
        next(newPage);
    }
    public static void getCurrentPageNumber(Page newPage) {

        System.out.printf("Current page: %s%n", Math.floor(newPage.getCurrent() / newPage.getSize()));
    }
    public static boolean hasNext(Page newPage) {

        return newPage.getCurrent() < newPage.getTotal();
    }
    public static boolean hasPrevious(Page newPage) {

        return newPage.getCurrent() != newPage.getSize();
    }
}
