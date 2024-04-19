class class30 {
    public void finalize() {
        System.out.println("Child Class Finalize Method()");
    }

    public static void main(String[] args) {
        class30 ob = new class30();
        ob = null;
        System.gc();
    }
}
