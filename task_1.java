import java.util.LinkedList;

/**
 * task_1
 */
public class task_1 {

    public static void main(String[] args) {
        /*
         * Пусть дан LinkedList с несколькими элементами. 
         * Реализуйте метод, который вернёет «перевёрнутый» список.
         */
        LinkedList<String> text = new LinkedList<>();
        String[] strText = {"шла", "Саша", "по", "шоссе", "и", "сосала", "сушку"};
        for (int i = 0; i < strText.length; i++) {
            text.add(strText[i]);
        }
        System.out.println(text.toString()); //Изначальный список элементов

        LinkedList<String> newText = new LinkedList<>();
        while (!text.isEmpty()) {
            String remove = text.remove(text.size()-1);
            newText.add(remove);
        }
        System.out.println(newText.toString());//Перевернутый список элементов
        
    }
}