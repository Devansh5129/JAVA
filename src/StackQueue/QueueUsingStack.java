package StackQueue;
import java.util.Stack;
class QueueUsingStacks1 {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    // enqueue
    //stack 1 ko apan main maan le toh pehle ussi ko bhar lenge ..
    public void enqueue(int x) {
        stack1.push(x);
    }
    // dequeue
    public int dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }//jab tak bhari hui stack 1 khali nahi ho jati hai tab tak uske elements stack2 me push karte jayege..
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        } //jo push hua hai vo s2 me hi hai , usko return .
        return stack2.pop();
    }
    // peek front
    public int peek() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }//jo elements the wo s2 me transferred hai isliye peek function unko dekhne
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }
}
public class QueueUsingStack {
    public static void main(String[] args) {
        QueueUsingStacks1 q = new QueueUsingStacks1();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("Front: " + q.peek());
        System.out.println("Removed: " + q.dequeue());
        System.out.println("Removed: " + q.dequeue());
        q.enqueue(40);
        System.out.println("Front: " + q.peek());
        System.out.println("Removed: " + q.dequeue());
        System.out.println("Removed: " + q.dequeue());
    }
}
