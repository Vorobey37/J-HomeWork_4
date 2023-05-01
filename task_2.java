
import java.util.LinkedList;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        /*
         * Реализуйте очередь с помощью LinkedList со следующими методами:
• enqueue() — помещает элемент в конец очереди,
• dequeue() — возвращает первый элемент из очереди и удаляет его,
• first() — возвращает первый элемент из очереди, не удаляя.
         */
        LinkedList<String> text = new LinkedList<>();
        String[] strText = {"first", "second", "third", "fourth", "fifth"};
        for (int i = 0; i < strText.length; i++) {
            text.add(strText[i]);
        }
        System.out.println(text.toString()); //Изначальный список элементов

        Scanner input = new Scanner(System.in);
        System.out.println("Введите элемент для перемещения: ");
        String element = input.nextLine(); 
        
        int count = 0; 
        for (int i = 0; i < text.size(); i++) {
            if (text.get(i).equals(element)){
                //String remove = text.remove(i);
                //text.add(remove);
                text.add(text.remove(i)); //Помещение элемента в конец очереди
                count++;
            }  
        }
        if (count == 0) {
            System.out.println("Таких элементов нет, нечего перемещать.");
        }
        System.out.println(text.toString()); 
        
        String element2 = text.get(0); //Возращаем первый элемент...
        text.remove(element2);               //... и удаляем его
        System.out.println(element2 + text.toString());

        String element3 = text.get(0);
        System.out.println(element3 + text.toString()); //Возвращаем первый элемент, не удаляя его из списка.


        input.close();
        
    }
}
