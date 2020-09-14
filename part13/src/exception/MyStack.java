package exception;

public class MyStack {
    private Object[] elements;

    private int index;

    public MyStack(){
        this.elements =new Object[10];
        this.index=-1;
    }

    public void push(Object obj) throws MyStackOperationException{
        if(index>=elements.length-1){
            /*
            //创建异常对象
            MyStackOperationException e=new MyStackOperationException("栈已满");
            //手动抛
            throw e;//try...catch没有意义，需要传递栈已满

             */
            //合并写法
            throw new MyStackOperationException("栈已满");
        }
        index++;
        elements[index]=obj;
        System.out.println("压栈"+obj+"元素成功，栈帧指向"+index);
    }
    public void pop() throws MyStackOperationException {
        if(index<0){
            throw new MyStackOperationException("栈已空");
        }
        System.out.println("弹栈"+elements[index]+"元素成功");;
        index--;
        System.out.println("栈帧指向"+index);
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
