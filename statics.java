
    class P4{
        static int i = 4;
    
    //SIB block
    static {
        System.out.println("from SIB start");
        System.out.println(P4.i);
        System.out.println(i);
        i++;
        System.out.println(i);
        System.out.println(P4.j);

    }

    public static void main(String[] args) {
    System.out.println("Main S");
    System.out.println(i);
    System.out.println(P4.i);
    System.out.println(j);
}
static int j = 10;
}
