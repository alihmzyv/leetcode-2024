package org.alihmzyv.medium;

import org.alihmzyv.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {
    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    void whenGiven14And41ThenSumShouldBe() {
        ListNode num1 = toLinkedList(14);
        ListNode num2 = toLinkedList(4);
        int sum = toInt(addTwoNumbers.addTwoNumbers(num1, num2));
        assertEquals(18, sum);
    }

    private ListNode toLinkedList(int num) {
        if (num == 0) {
            return new ListNode();
        }
        ListNode node = new ListNode();
        ListNode head = node;
        while (num != 0) {
            node.val = num % 10;
            num /= 10;
            node.next = new ListNode();
            node = node.next;
        }
        return head;
    }

    private int toInt(ListNode listNode) {
        int num = 0;
        int multiplier = 1;
        while (listNode != null) {
            num += listNode.val * multiplier;
            multiplier *= 10;
            listNode = listNode.next;
        }
        return num;
    }
}