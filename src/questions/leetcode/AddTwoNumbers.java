package questions.leetcode;

public class AddTwoNumbers {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(9, new ListNode(9, new ListNode(9,
                         new ListNode(9, new ListNode(9, new ListNode(9,
                         new ListNode(9)))))));

        ListNode list2 = new ListNode(9, new ListNode(9, new ListNode(9,
                         new ListNode(9))));

        ListNode result = addTwoNumbers(list1, list2);
        while(result != null) {
            System.out.print(result.val);
            result = result.next;
        }
        System.out.println();
        ListNode result2 = addTwoNumbers2(list1, list2);
        while(result2 != null) {
            System.out.print(result2.val);
            result2 = result2.next;
        }

    }
    // Uma abordagem mais elegante
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // Nó inicial (cabeça) para facilitar a manipulação
        ListNode current = dummyHead; // Ponteiro para o nó atual da lista de resultado
        int carry = 0; // Variável para armazenar o "carry" da soma

        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = carry + x + y; // Soma dos valores dos nós atuais e do "carry"
            carry = sum / 10; // Atualiza o "carry"
            current.next = new ListNode(sum % 10); // Cria um novo nó com o dígito da soma e adiciona à lista de resultado
            current = current.next; // Avança o ponteiro para o próximo nó

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry > 0) { // Se ainda houver um "carry" restante, adiciona um nó extra à lista de resultado
            current.next = new ListNode(carry);
        }
        return dummyHead.next; // Retorna a cabeça da lista de resultado (ignorando o nó inicial)
    }

    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2){
        ListNode head = new ListNode(0);
        ListNode temp = head;
        int carry = 0;

        while(l1 != null || l2 != null) {
            int sum = 0;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum / 10;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
        }
        if(carry > 0)
            temp.next = new ListNode(carry);

        return head.next;
    }

}
