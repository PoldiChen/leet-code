package question146;

import java.util.HashMap;
import java.util.Map;

/**
 * @author poldi.chen
 * @className Solution
 * @description TODO
 * @date 2019/8/5 18:19
 **/
class LRUCache {

    private int capacity;
    private int length;
    private Map<Integer, Node> map = new HashMap<Integer, Node>();
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.length = 0;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node latest = map.get(key);
            removeNode(latest);
            setHead(latest);
            return latest.value;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node oldNode = map.get(key);
            oldNode.value = value;
            removeNode(oldNode);
            setHead(oldNode);
        } else {
            Node newNode = new Node(key, value);
            if (length < capacity) {
                setHead(newNode);
                map.put(key, newNode);
                length ++;
            } else {
                map.remove(tail.key);
                tail = tail.prev;
                if (tail != null) {
                    tail.next = null;
                }
                setHead(newNode);
                map.put(key, newNode);
            }
        }
    }

    public void removeNode(Node node) {
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            this.head = node.next;
        }

        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            this.tail = node.prev;
        }
    }

    public void setHead(Node node) {
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }

        head = node;
        if (this.tail == null) {
            this.tail = node;
        }
    }
}

class Node {
    public int key;
    public int value;
    public Node prev;
    public Node next;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}


/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
