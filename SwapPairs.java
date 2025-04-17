
    import java.util.ArrayList;

    public class SwapPairs {
        public static void swapPairs(ArrayList<String> list) {
            for (int i = 0; i < list.size() - 1; i += 2) {
                // Swap elements at index i and i+1
                String temp = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, temp);
            }
        }
    
        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();
            list.add("apple");
            list.add("banana");
            list.add("cherry");
            list.add("date");
            list.add("elderberry");
    
            System.out.println("Before swapping: " + list);
            swapPairs(list);
            System.out.println("After swapping: " + list);
        }
    }
       

