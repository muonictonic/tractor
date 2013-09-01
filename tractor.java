class tractor
{
    public static void main(String[] args)
    {
        //String word     = args[0];
        String word     = "tractor";
        String new_word = "";

        for (int i = (word.length() - 1); i >= 0; i--)
        {
            
            new_word += word.charAt(i);
        }
        System.out.println(new_word);
    }
}
