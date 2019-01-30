
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

    public void arrayListReversed(List<String> origin){
        System.out.println("Original list - "+origin);
        Collections.reverse(origin);
        System.out.println("Reversed list - "+origin);
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
        hashData.retainAll(linkedlistData);
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
        ordinary.add("Bats frighten me");
        ordinary.add("It’s time my enemies shared my dread!");
        el.hashMapCollection();
        System.out.println("---Second task------");
        el.arrayListReversed(ordinary);
        System.out.println("---Third task------");
        el.commonElements();
    }
}

