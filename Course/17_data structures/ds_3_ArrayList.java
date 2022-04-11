// import java.util.ArrayList;
// import java.util.List;
// import java.util.Arrays;


// public class ds_3_ArrayList{
//     public static void main(String[] args) {

//         List<String> languages = new ArrayList<String>();
//         languages.add("java");
//         languages.add("c");
//         languages.add("python");
//         languages.add("c#");
//         languages.add("JavaScript");

//         ArrayList<String> colors = new ArrayList<String>();
//         colors.add("blue");
//         colors.add("green");
//         colors.add("yellow");

// //        for (int i = 0; i < languages.size(); i++) {
// //            System.out.println(languages.get(i));
// //        }
// //
// //        for (String lang : languages){
// //            System.out.println(lang);
// //        }

// //        System.out.println(languages);
// //        System.out.println(languages.size());
// //        System.out.println(languages.contains(colors.get(0)));
// //        System.out.println(languages.containsAll(colors));


// //        languages.addAll(colors);
// //        System.out.println(languages);

// //        languages.addAll(1,colors);
// //        System.out.println(languages);

// //        languages.clear();
// //        System.out.println(languages);

// //        ArrayList<String> cloneLang =(ArrayList<String>)colors.clone();
// //        System.out.println(cloneLang);

// //        System.out.println(languages.indexOf("python"));
// //        System.out.println(languages.indexOf("ruby"));
// //        System.out.println(languages.indexOf("python")>0);

// //        List<String> names = new ArrayList<String>(Arrays.asList("arry","roy","shivam","lisa","arry","titu"));
// //        System.out.println(names);
// //        System.out.println(names.lastIndexOf("arry"));

// //        languages.remove("python");
// //        languages.remove(1);
// //        System.out.println(languages);

// //        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
// //        numbers.removeIf(num -> num%2==0);
// //        System.out.println(numbers);

// //        List<String> names2 = new ArrayList<String>(Arrays.asList("arry","roy","shivam","lisa","arry","titu"));
// //        names2.retainAll(Collections.singleton("arry"));
// //        System.out.println(names2);
// //        System.out.println(names2.get(1));

// //        List<Integer> num1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
// //        List<Integer> num2 = new ArrayList<Integer>(num1.subList(1,4));
// //        System.out.println(num2);

// //        List<String> fruits = new ArrayList<String>(Arrays.asList("apple","guave","banana","mango","grapes","apple"));
// //        Object [] arr = new Object[fruits.size()];
// //        fruits.toArray(arr);
// //        System.out.println(Arrays.toString(arr));

// //        List<Integer> num = new ArrayList<>();
// //        num.add(1);
// //        num.add(2);
// //        num.add(3);
// //        num.add(4);
// //        num.add(5);
// //        int [] arr = new int[num.size()];
// //        for (int i = 0; i < num.size(); i++) {
// //            arr[i] = num.get(i);
// //        }
// //        System.out.println(Arrays.toString(arr));

// //        List<Integer> num2 = new ArrayList<>();
// //        num2.add(1);
// //        num2.add(2);
// //        num2.add(3);
// //        num2.add(4);
// //        num2.add(5);
// //        Integer [] arr = new Integer[num2.size()];
// //        num2.toArray(arr);
// //        System.out.println(Arrays.toString(arr));

// //        String [] a = {"apple","guave","banana","mango","grapes"};
// //        List<String> l1 = new ArrayList<String>(Arrays.asList(a));
// //        System.out.println(l1);

// //        Character [] a = {'a', 'b', 'c', 'd', 'e'};
// //        List<Character> l1 = new ArrayList<Character>(Arrays.asList(a));
// //        System.out.println(l1);
// //
// //      Integer [] a = {1,2,3,4,5};
// //      List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(a));
// //      System.out.println(l1);

//     }
// }