
import java.util.*;

public class CollectionsAndLoops {

    public void hashMapCollection(){
        HashMap<String, Object> hashMapItems = new HashMap<>();
        hashMapItems.put("Test", 7);
        hashMapItems.put("Class", 4.5 );
        hashMapItems.put("Cat", true );
        hashMapItems.put("Dog", null );
        hashMapItems.put("Bird", "Cat" );
        hashMapItems.put("Something", new Long(83));
        hashMapItems.put("Mail", new Character('8') );
        hashMapItems.put("Tab", "2" );
        hashMapItems.put("Browser", 22222222222L );
        hashMapItems.put("IDE", (double)489 );
        for (Map.Entry<String,Object> integerStringEntry : hashMapItems.entrySet()) {
            System.out.println("Key - " + integerStringEntry.getKey() + "; value - " + integerStringEntry.getValue());
        }
    }

    public void arrayListReversed_1(List<String> origin){
        System.out.println("Original list - "+origin);
        int revSize = origin.size()-1;
        for (int i = 1; i <= revSize; i++) {
            origin.add(origin.get(revSize-i));
        }
        for (int i = 0; i <=revSize-1; i++) {
            origin.remove(0);
        }
        System.out.println("Reversed list - "+origin);
    }

    public void arrayListReversed_2(List<String> ordinary) {
        System.out.println("Original list - "+ordinary);
        List<String> reverse = new ArrayList();
        int revSize = ordinary.size() - 1;
        for (int i = 0; i < ordinary.size(); i++) {
            reverse.add(i, ordinary.get(revSize));
            revSize--;
        }
        System.out.println("Reversed list - "+reverse);
    }

    public void commonElements (){
//        используя стандартные методы для сет сравнить две коллекции и удалить те элементы из сета которых нет в связанном списке.
//                В консоль с помощью цикла вывести каждый элемент сета ДО обработки, связанный список и сет ПОСЛЕ обработки

        HashSet<String> hashData = new HashSet<>();
        hashData.add("pineapple");
        hashData.add("watermelon");
        hashData.add("apple");
        hashData.add("pear");
        hashData.add("quince");
        hashData.add("lemon");
        hashData.add("kiwi");
        LinkedList<String> linkedlistData = new LinkedList<>();
        linkedlistData.add("plum");
        linkedlistData.add("nut");
        linkedlistData.add("apple");
        linkedlistData.add("grape");
        linkedlistData.add("peach");
        linkedlistData.add("pear");
        linkedlistData.add("cherry");
        linkedlistData.add("orange");
        linkedlistData.add("watermelon");
        linkedlistData.add("apricot");
        linkedlistData.add("pineapple");
        Iterator myIterator = hashData.iterator();
        while (myIterator.hasNext()) {
            System.out.println("This is - " + myIterator.next());
        }
        for (int i = 0; i <linkedlistData.size() ; i++) {
            System.out.println("List element - " + linkedlistData.get(i));
        }
        System.out.println("------After---------");
        myIterator = hashData.iterator();
        while (myIterator.hasNext()) {
            if (!linkedlistData.contains(myIterator.next())) {
                myIterator.remove();
            }
        }
        myIterator = hashData.iterator();
        while (myIterator.hasNext()){
            System.out.println("This is - " + myIterator.next() + " after update");
        }
    }

    public static void main(String[] args) {
        CollectionsAndLoops el = new CollectionsAndLoops();
        List<String> ordinary = new ArrayList();
        ordinary.add("I am vengeance");
        ordinary.add("I am the night");
        ordinary.add("I am Batman");
        ordinary.add("It’s time my enemies shared my dread!");
        el.hashMapCollection();
        System.out.println("---Second task------");
        //el.arrayListReversed_1(ordinary);
        el.arrayListReversed_2(ordinary);
        System.out.println("---Third task------");
        el.commonElements();
    }
}

