
/**
 * Write a description of class MyStack here.
 *
 * @author (2019315026 전유정)
 * @version (2020.09.28)
 */
public class MyStack<T> implements Stack<T>
{
    private int top;
    Object[] s;
    
    /**
     * Constructor for objects of class MyStack
     */
    public MyStack()
    {
        top = -1;
        s = new Object[3];
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean push(T obj)
    {
        top += 1;
        s[top] = obj;
        return true;
    }
    
    public T pop()
    {
        T result = (T)s[top];
        top -= 1;
        return ;
    }
}
