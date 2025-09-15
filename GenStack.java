import java.util.ArrayList;
public class GenStack<T>
{
    private int top;
    private ArrayList<T> el;
    public GenStack()
    {
        el = new ArrayList<T>();
        top = -1;
    }
    public void push(T ch)
    {
        el.add(ch);
    }
    public T pop()
    {
        if (el.size() != 0)
        {
            T myElement = el.remove(el.size()-1);
            return myElement;
        }
        return null;
    }
    public boolean empty()
    {
        return el.size() == 0;
    }
}
