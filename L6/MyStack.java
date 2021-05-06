import java.util.ArrayList;

public class MyStack<E> {
    private ArrayList<E> list  =new ArrayList<>();
    public int getSize(){
        return list.size();
    }
    public E peek(){
        return list.get(getSize()-1);
    }
    public void push (E o){
        list.add(o);
    }
    public E pop(){
        E o = list.get(getSize() - 1);
        list.remove(getSize() -1);
        return o;
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }

    public boolean search(E o){
        for(int i =0; i < list.size(); i++){
            if(list.get(i).equals(o) == true)
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Stack" + list.toString();
    }

}
