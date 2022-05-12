package Tries;

public class DictionaryMain {
    public static void main(String[] args){
        DictionaryMethods dm = new DictionaryMethods();
        dm.insert("book","to read and get some knowledge");
        dm.insert("breath","the air that goes into and out of your lungs");
        dm.insert("change","to change one thing to another thing");
        dm.insert("company","a organization sell goods and services ");
        dm.insert("brother","a man or boy as parent");
        dm.insert("pen","we can writhe any thing");
        dm.insert("computer","we can store too long data and play game");

        System.out.println(dm.search("book"));
    }
}
