// реализация метода разворота односвязного списка

```java
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
```

// В этом коде мы создаем класс `ListNode`, который представляет узел связного списка. 
// Узел содержит значение `val` и ссылку на следующий узел `next`. Затем мы создаем класс `Solution`, 
// который содержит метод `reverseList`, который принимает голову связного списка и возвращает развернутый 
// список.

// В методе `reverseList` мы создаем две переменные: `prev` и `curr`. `prev` будет использоваться 
// для хранения предыдущего узла, а `curr` - для текущего узла. Затем мы проходимся по списку, пока `curr` 
// не станет равным `null`. В каждой итерации мы сохраняем ссылку на следующий узел в переменную `nextTemp`, 
// затем меняем ссылку на следующий узел у текущего узла на `prev`, обновляем `prev` на текущий узел и `curr` 
// на следующий узел. В конце мы возвращаем `prev`, который теперь является головой развернутого списка.