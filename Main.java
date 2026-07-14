class Main {
    public static void main(String[] args){
        System.out.println("Hello world");
        var items = new PrintItems(10);
        System.out.println(items);
        Cookie cookie = new Cookie("green");
        System.out.println(cookie.getColor());
    }
}