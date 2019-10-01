public class Anagram {
    // isAnagram("abcde", "ceadb");
    public static boolean isAnagram(String original, String jumbled)
    {
        int k=0;
        for (int i = 0; i < 5; i++)
        {
            for(int j=0;j<5;j++)
            {
                if(original.charAt(i)==jumbled.charAt(j))
                {
                    k=k+1;
                }

            }
        }
        if(k==5) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("abcde", "ceadb"));
    }
}
