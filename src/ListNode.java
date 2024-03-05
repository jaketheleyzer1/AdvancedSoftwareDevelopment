public class ListNode
{
    private Object value;
    private ListNode next;
    private ListNode previous;


    //initializes this node
    public ListNode(Object initialValue, ListNode initialNext, ListNode initialPrevious)
    {
        value =initialValue;
        next=initialNext;
        previous = initialPrevious;
    }

    //returns the value of this node
    public Object getValue()
    {
        return value;
    }

    //returns the next reference in this node
    public ListNode getNext()
    {
        return next;
    }

    //sets the vale of this node
    public void setValue(Object theNewValue)
    {
        value = theNewValue;
    }

    //sets the next reference in this node
    public void setNext(ListNode theNewNext)
    {
        next = theNewNext;
    }

    public ListNode getPrevious() {
        return previous;
    }

    public void setPrevious(ListNode previous) {
        this.previous = previous;
    }
}