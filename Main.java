import linkedList.LinkedList;

class Main {
    public static void main(String[] args){
        int num1 = 11;
        int num2 = num1;
        num1 = 33;
        System.out.println(num1 + "" +num2);
        System.out.println("Hello world");
        var items = new PrintItems(10);
        System.out.println(items);
        Cookie cookie = new Cookie("green");
        System.out.println(cookie.getColor());
       
    }
}