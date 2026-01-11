class sample{
    public static void main(String[] args) {
        String word="SAMPLE";
        String reverse="";
        for(int i=word.length()-1;i>=0;i--){
        reverse=reverse+word.charAt(i);
    }
    System.out.println(reverse);
}
}