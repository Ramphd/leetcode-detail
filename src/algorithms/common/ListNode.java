package algorithms.common;

public class ListNode {
    int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(String.valueOf(val));
        ListNode cur = this;
        while (cur.next != null) {
            cur = cur.next;
            sb.append("->").append(cur.val);
        }
        sb.append("->").append("null");
        return sb.toString();
    }

    public static void main(String[] args) {
        ListNode l3 = new ListNode(3);
        ListNode l4 = (l3.next = new ListNode(4));
        ListNode l5 = (l4.next = new ListNode(5));
        System.out.println(l3);
    }
}
