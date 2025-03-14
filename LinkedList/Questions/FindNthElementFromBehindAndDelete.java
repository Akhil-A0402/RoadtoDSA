package LinkedList.Questions;

import java.util.LinkedList;

import LinkedList.ScratchImpl.LL;

public class FindNthElementFromBehindAndDelete {

    public static LinkedList<String> removeElement(LinkedList<String> list, int n){
        if(list.isEmpty()){
            return list;
        }

        list.remove(list.size()-n);

        return list;
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Mango");
        list.add("Orange");
        list.add("Grapes");
        System.out.println(list);
        removeElement(list, 3);
        System.out.println(list);

    }
}
