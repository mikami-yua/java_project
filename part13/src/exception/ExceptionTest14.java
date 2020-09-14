package exception;

//测试改良后的栈
public class ExceptionTest14 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        //压栈
        try {
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());

        } catch (MyStackOperationException e) {
            //e.printStackTrace();
            //输出异常的简单信息
            System.out.println(e.getMessage());

        }

        try {
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
        } catch (MyStackOperationException e) {
            e.printStackTrace();
        }
    }
}
