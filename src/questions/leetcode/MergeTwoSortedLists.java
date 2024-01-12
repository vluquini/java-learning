package questions.leetcode;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode sortedList = new ListNode();
        sortedList = mergeTwoLists(list1, list2);

        System.out.println(sortedList);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(-1); // Cabeça fictícia para facilitar a manipulação
        ListNode current = temp;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Se uma das listas chegou ao fim, conecte a outra lista diretamente
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return temp.next; // A lista real começa após o nó fictício
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

}
