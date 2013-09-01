class tractor
{
    public static void main(String[] args)
    {
        //String word     = args[0];
        String word     = "tractor";
        String new_word = "";
        char temp;

        for (int i = (word.length() - 1); i >= 0; i--)
        {
            temp = word.charAt(i);
            new_word += temp;
        }
        System.out.println(new_word);
    }
}
