package Tries;

import java.util.*;

public class Top_K_Frequent_Words {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i <n ; i++) {
            str[i] = sc.next();
        }
        int k  = sc.nextInt();
        System.out.println(topKFrequent(str , k));
    }

    private static List<String> topKFrequent(String[] words, int k) {

        HashMap<String , Integer> map = new HashMap<>();

        for (int i = 0; i < words.length ; i++) {
            String s = words[i];
            if(map.containsKey(s)){
                map.put(s , map.get(s)+1);
            }else {
                map.put(s , 1);

            }
        }

        List<String> list = new LinkedList<>(map.keySet());

        //sort in descending order by values
        Collections.sort(list , (word1 ,word2)->{
            int comparision = map.get(word2).compareTo(map.get(word1));
            if(comparision == 0){
                return word1.compareTo(word2);
            }
            return comparision;

        });
        return list.subList(0 ,k);

//        List<Map.Entry<String, Integer> > list = new LinkedList<Map.Entry<String, Integer> >(map.entrySet());
//
//






//        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
//            public int compare(Map.Entry<String, Integer> o1,
//                               Map.Entry<String, Integer> o2)
//            {
//                return (o2.getValue()).compareTo(o1.getValue());
//            }
//        });
//
////        // put data from sorted list to hashmap
//        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
//        for (Map.Entry<String, Integer> aa : list) {
//            temp.put(aa.getKey(), aa.getValue());
//        }


//        for (Map.Entry<String, Integer> en :temp.entrySet()) {
//            System.out.println("Key = " + en.getKey() +
//                    ", Value = " + en.getValue());
//        }



//        //Collection<String> values = temp.keySet();
//        //System.out.println(values);
//        ArrayList<String>  list1 = new ArrayList<>();
//
//        //Collections.sort(list1);
//        System.out.println(list1);

    }










}
