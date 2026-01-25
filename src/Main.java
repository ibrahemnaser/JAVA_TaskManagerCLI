public class Main {
    public static void main(String[] args) {
//        System.out.println("*******************");
//        System.out.println("JAVA DATA STRUCTURE");
//        System.out.println("*******************");

//        LinkedList<Integer> myList = new LinkedList<>(5);
//        System.out.println("====== Display ======");
//        myList.display();
//
//        System.out.println("====== Insert First ======");
//        try {
//            myList.insertFirst(34);
//            myList.insertFirst(3);
//            myList.insertFirst(4);
//            myList.insertFirst(134);
//        }catch (Exception e){
//            System.out.println("Can't insert");
//        }
//
//        System.out.println("====== Display ======");
//        myList.display();
//
//        System.out.println("====== Insert Last ======");
//        try{
//            myList.insertLast(3);
//            myList.insertLast(30);
//            myList.insertLast(233);
//        }catch (Exception e){
//            System.out.println("Can't insert");
//        }
//
//        System.out.println("====== Display ======");
//        myList.display();

        LinkedList<String> myList2 = new LinkedList<>(10);
        System.out.println("====== Display ======");
        myList2.display();

        System.out.println("====== Insert First ======");
        try {
            myList2.insertFirst("Hassan");
            myList2.insertFirst("Ahmed");
            myList2.insertFirst("Mona");
//            myList2.insertFirst("Medhat");
        }catch (Exception e){
            System.out.println("Can't insert");
        }
        System.out.println("====== Display ======");
        myList2.display();
        myList2.reverse();
        System.out.println("====== Display ======");
        myList2.display();

//        System.out.println("====== Insert Last ======");
//        try{
//            myList2.insertLast("Top");
//            myList2.insertLast("Bottom");
//            myList2.insertLast("Left");
//        }catch (Exception e){
//            System.out.println("Can't insert");
//        }
//
//        System.out.println("====== Display ======");
//        myList2.display();
//
//        System.out.println("====== toString ======");
//        System.out.println(myList2);
//
//        System.out.println("====== Reverse ======");
//        myList2.reverse();
//        System.out.println(myList2);
//
//        System.out.println("====== Remove ======");
//        try {
//            System.out.println("Remove Last node: " + myList2.removeLast());
//            System.out.println(myList2);
//            System.out.println("Remove First node: " + myList2.removeFirst());
//            System.out.println(myList2);
//            System.out.println("Remove Hassan node: " + myList2.remove("Hassan"));
//            System.out.println(myList2);
//        }catch (Exception e){
//            System.out.println(e);
//        }
//
//        System.out.println("====== Search ======");
//        try {
//            int foundAt = myList2.search("Bottom");
//            System.out.println("Bottom found at index: " + foundAt);
//            foundAt = myList2.search("Test");
//            System.out.println("Test found at index: " + foundAt);
//        }catch (Exception e){
//            System.out.println(e);
//        }


    }
}