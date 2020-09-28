
/**
 * MyStack은 Stack<T>를 구현하는 클래스입니다.
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
     * push
     *
     * @param     T obj
     * @return    boolean
     */
    public boolean push(T obj)
    {
        top += 1;
        s[top] = obj;
        return true;
    }
    /**
     * pop
     * 
     * @return    T
     */
    public T pop()
    {
        T result = (T)s[top];
        top -= 1;
        return result;
    }
}
