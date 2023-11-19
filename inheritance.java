class a{
    void aa(){
        System.out.println("hello");
    }
}
class bb {
    void b(){
        System.out.println("h2");
    }
}
class cc {
    void c(){
        System.out.println("h3");
    }
}

class inheritance{
    public static void main(String[] args) {
        bb obj =new bb();
        obj.aa();
    }
}