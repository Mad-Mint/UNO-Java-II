public class Stack {

    private int top;
    private char[] list;

    public Stack(){
        this.top = -1;
        this.list = new char[5];
    }
    public boolean isFull(){
        return (top >= list.length - 1);
    }
    public boolean isEmpty(){
        return (top < 0);
    }
    public boolean push(char item){
        if(!isFull()){
            list[++top] = item;
            return true;
        }else{
            return false;
        }
    }
    public char pop(){
        if(!isEmpty()){
            return list[top--];
        } return '\0';
    }
    public char peek(){
        if(!isEmpty()){
            return list[top];
        }return '\0';
    }
}