package org.ultimatecompbg;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {


    public static void main(String[] args){


        Scanner numberScanner = new Scanner(System.in);
        int elementNumber = parseInt(numberScanner.nextLine());
        Scanner sizeScanner = new Scanner(System.in);
        int pageSize = parseInt(numberScanner.nextLine());
        ArrayList<String> elements = new ArrayList<String>();
        for(int i = 0; i < elementNumber; i++){
            Scanner elementScanner = new Scanner(System.in);
            String element = elementScanner.nextLine();
            elements.add(element);
        }
        int pageNumber = (int) Math.ceil(elements.size() / pageSize);
        for(int i = 0; i < pageNumber; i++){

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
        next();
        Scanner scanCommands = new Scanner(System.in);
        while(true){
            scanCommands = new Scanner(System.in);
            String input = scanCommands.nextLine();
            if(input == "end"){
                break;
            }
            switch(input){
                case "next":
                    next();
                    break;
                case "previous":
                    previous();
                    break;
                case "first page":
                    firstPage();
                    break;
                case "last page":
                    lastPage();
                    break;
                case "current page":
                    getCurrentPageNumber();
                    break;
                case "has next":
                    hasNext();
                    break;
                case "has previous":
                    hasPrevious();
                    break;

            }
        }


    }
    public static void printPage(){
        for(int i = currentElement; i < currentElement + 5; i++){
            System.out.println(currentElement);
        }
    }
    public static void next() {

        ;
        printPage();
    }

    public static void previous() {

        pageBean.currentPage--;
        printPage();
    }
    public static void firstPage() {

        pageBean.currentPage = 0;
        printPage();
    }
    public static void lastPage() {

        pageBean.currentPage = pageBean.pages.size() - 1;
        printPage();
    }
    public static void getCurrentPageNumber() {

        System.out.printf("Current page: %s%n", pageBean.currentPage);
    }
    public static void hasNext() {

        if(pageBean.currentPage == pageBean.pages.size() - 1){
            System.out.println("## There are no elements next ##");
        }else{
            System.out.println("## There are elements next ##");
        }
    }
    public static void hasPrevious(Page pageBean) {

        if(pageBean.currentPage == 0){
            System.out.println("## There are no previous elements ##");
        }else{
            System.out.println("## There are previous elements ##");
        }
    }
}
