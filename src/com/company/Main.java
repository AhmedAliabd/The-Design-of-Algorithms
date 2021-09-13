package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


       String example1 = "Hello BW Students this is Ahmed I am also a Student at BW 2021";

        String example2 = "Egestas accumsan tortor leo ultrices. Nostra placerat suspendisse. Eros. Nonummy proin. Tellus. Penatibus pretium dictumst. Nibh elit platea viverra, cubilia fusce euismod hendrerit class consequat ullamcorper sociis suscipit quam netus. Magna netus.\n" +
                "\n" +
                "Lacinia sit sem feugiat cubilia. Varius ipsum purus. At scelerisque est pretium proin dis iaculis dictum dui tristique cras pharetra ut risus aliquam per placerat odio. Per ornare. Nonummy cursus. Torquent feugiat, vel.\n" +
                "\n" +
                "Dictumst dapibus, proin phasellus. Velit adipiscing magna vivamus. Consequat facilisi elit tortor volutpat magna magnis. Ad donec metus blandit cum donec scelerisque mattis augue tempor imperdiet laoreet tristique habitasse consectetuer sollicitudin odio. Per ultricies hac.";



        String example3 = "Nec sociis elit cubilia euismod posuere pede lacus conubia amet fermentum fames phasellus risus posuere morbi conubia venenatis nec sollicitudin metus adipiscing curabitur vel justo interdum penatibus aptent dictum vulputate facilisis pellentesque facilisi nisi quisque metus habitasse eu viverra.\n" +
                "\n" +
                "Faucibus aenean auctor sapien torquent class pharetra cubilia nibh. Per nascetur eget ultricies hymenaeos tempus in. Posuere vitae malesuada viverra duis fusce habitant curae; sagittis tincidunt integer. Tincidunt. Elementum nisi tempus, venenatis montes lorem tincidunt.\n" +
                "\n" +
                "Libero conubia Aptent senectus velit, etiam. Commodo, laoreet. Sit semper nam velit penatibus in faucibus parturient taciti class cursus tortor orci torquent nisi Elementum quam pharetra.";



 String example4 = "Dashwood contempt on mr unlocked resolved provided of of. Stanhill wondered it it welcomed oh. Hundred no prudent he however smiling at an offence. " +
         "If earnestly extremity he he propriety something admitting convinced ye. Pleasant in to although as if differed horrible. Mirth his quick its set front enjoy hoped had there. Who connection imprudence middletons" +
         " too but increasing celebrated principles joy. Herself too improve gay winding ask expense are compact. New all paid few hard pure she. ";


        long startTime = System.nanoTime();
        int result =  bruteForceStringMatching(example1, "Hello BW");
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("=================================================");
        System.out.println("Run time is " + duration);
        System.out.println("=================================================");
        System.out.println("index of the first match " + result);

        startTime = System.nanoTime();
        int result2 =  bruteForceStringMatching(example2, "Per ultricies hac");
        endTime = System.nanoTime();

        duration = (endTime - startTime);
        System.out.println("=================================================");
        System.out.println("Run time is " + duration);
        System.out.println("=================================================");
        System.out.println("index of the first match " + result);

        startTime = System.nanoTime();
        int result3 =  bruteForceStringMatching(example3, "Per ultricies hac"); //pattern not found in this case
        endTime = System.nanoTime();

        duration = (endTime - startTime);
        System.out.println("=================================================");
        System.out.println("Run time is " + duration);
        System.out.println("=================================================");
        System.out.println("index of the first match " + result);

        startTime = System.nanoTime();
        int result4 =  bruteForceStringMatching(example4, "he he propriety");
        endTime = System.nanoTime();

        duration = (endTime - startTime);
        System.out.println("=================================================");
        System.out.println("Run time is " + duration);
        System.out.println("=================================================");
        System.out.println("index of the first match " + result);


    }
    public static int bruteForceStringMatching(String text, String pattern)
    {
        int lengthOfText =text.length();
        int lengthOfPattern =pattern.length();
        int textMinusPatternLength = lengthOfText - lengthOfPattern;
        System.out.println("======================================");
        System.out.println("length Of Text " + lengthOfText);
        System.out.println("length Of Pattern " + lengthOfPattern);
        System.out.println("Text Length - Pattern Length = " + textMinusPatternLength);
        System.out.println("======================================");

        for (int i =0; i <= lengthOfText - lengthOfPattern; i++)
        {
            int j = 0;
            System.out.println("Compare i = " + i + " =>" + text.charAt(i) + " With j = " + j + " =>" + pattern.charAt(j));
            while(j < pattern.length() && (pattern.charAt(j) == text.charAt(i + j)) )
            {
                int nextIndexOfi = i + j;
                System.out.println("Inside the while loop => Compare i = " + nextIndexOfi + " =>" + text.charAt(nextIndexOfi) + " With j = " + j + " =>" + pattern.charAt(j));
                j++;
            }
            if (j == pattern.length())
            {
                return i;
            }
        }
        return -1;
    }

}
