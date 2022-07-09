public class linkedListCycle {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, Integer> map = new HashMap<>();
        int pos = 0;
        ListNode curr = head;
        while(curr != null) {
            if(map.containsKey(curr))
                return true;
            map.put(curr, pos);
            curr = curr.next;
            ++pos;
        }
        return false;
    }
}
