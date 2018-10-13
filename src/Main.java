import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Введите количество оценок: ");
        int n = input.nextInt();

        ArrayList arrayList = new ArrayList();
        System.out.println("Случайный список: ");

        for (int i = 0; i < n; i++) {
            int a = (int)(Math.random() * 10 + 1);
            Integer b = new Integer(a);
            arrayList.add(i, b);
        }
        System.out.println(arrayList);

        ArrayList arrayList1 = new ArrayList();

        Iterator iterator = arrayList.iterator();// отбрасываем повторяющиеся числа
        while (iterator.hasNext()) {
            int o = (int) iterator.next();
            if (!arrayList1.contains(o)) arrayList1.add(o);
        }
        System.out.println("Новый список: " + arrayList1);

         Iterator iterator1 = arrayList.iterator();  // отбрасываем плохие отметки
        while (iterator1.hasNext()) {
            int o1 = (int) iterator1.next();
            if (o1 == 1 || o1 ==2 || o1==3 || o1==4)
                iterator1.remove();
        }
            System.out.println("Список хороших оценок: " + arrayList);

        Iterator iterator2 = arrayList1.iterator();  // находим максимальную оценку
        int max = (int) arrayList1.get(0);
        while (iterator2.hasNext()) {
            int o2 = (int) iterator2.next();
            if (o2>max)
                max = o2 ;
        }
        System.out.println("Максимальная оценка = "+ max);
    }

    }







