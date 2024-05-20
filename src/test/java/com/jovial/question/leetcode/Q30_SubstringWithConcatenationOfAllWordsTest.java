package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class Q30_SubstringWithConcatenationOfAllWordsTest {

    @Test
    void testExample1(){
        var s = "barfoothefoobarman";
        var words = new String[]{"foo","bar"};

        Q30_SubstringWithConcatenationOfAllWords.Solution solution = new Q30_SubstringWithConcatenationOfAllWords.Solution();
        solution.findSubstring(s, words);
    }


    @Test
    void testExample2(){
        var s = "wordgoodgoodgoodbestword";
        var words = new String[]{"word","good","best","word"};

        Q30_SubstringWithConcatenationOfAllWords.Solution solution = new Q30_SubstringWithConcatenationOfAllWords.Solution();
        solution.findSubstring(s, words);
    }

    @Test
    void testExample3(){
        var s = "barfoofoobarthefoobarman";
        var words = new String[]{"bar","foo","the"};

        Q30_SubstringWithConcatenationOfAllWords.Solution solution = new Q30_SubstringWithConcatenationOfAllWords.Solution();
        solution.findSubstring(s, words);
    }

    @Test
    void testExample4(){
        var s = "a";
        var words = new String[]{"a"};

        Q30_SubstringWithConcatenationOfAllWords.Solution solution = new Q30_SubstringWithConcatenationOfAllWords.Solution();
        solution.findSubstring(s, words);
    }

    @Test
    void testExample5(){
        var s = "cvecqxjemfumiqgppzqadaduhzxwymeahkdzhodtvyhfqouipmitmlpvmmsmayniishpglkbltgbhclxptsdgjzvxrhxpufxmpouaavltdodgaaxvuccdbxauezlbhipwykwahjulxxtzzsvtuzyywasczefgovenfapmjjzjiukhmfchecfcczhedmmsjrhotwdfieqqzaalgeumhzrlzapemewwxfmqerxmwnevoggulbiuczfdbxiodgmaoasssqgqdklrtrnguwaxxfczekphrdjfdczxsfnvrypkscqoasnyaqzeaootrxawbzwtejrykiickbsltgltwmawaqstnsrpsnkyxdwjlhlykfldlwzhibgkryfgqwxkmkjlnhuzohzymkeygffqincznhhgfhqrrbcejyfxfeysoeqwjxornqsazbgfizyzadgjbljhsjzinrfwqtpdmjelkmqvlpumsaxtoicgrbqeuvclrtqdcwopjhkwwekqhklxsofkrvqorvbiornrobgzisxgyiyfskcmahytdphwkkgactrswzthrqnsaoxuychalfvqwdoipujrpclocevvxkpzypuyrdyeiuxhznroiaizftpjakgzvwyvlsuevskgohppvggfjogojwxlgdkdbjzmbvqznbfekwvhcbmlrvbdryozezffigujbkkqnpuylsfqtudnpfqifehjdorlulxvxhmlzilmascwogjdlzlsfvcjjvueitbfbpsayfmayrwmxhskifcocgxmdtslnvtqllsjrglrxifwpxiaflohtnvxgnkvldnwrfhkmsbjcgiugquldiuxvqwdfibqmomfuvpioqtqybkeservomulcsrhbsapgouckjmyzgqzjdgbjxzylvlpoczruzgdnahxjuxkcqjltppcnqcanoqbqpunoasdabdlxcvzsfnlucojsskfgcjzrdohggmgjpshspgkutyrxocrgmxpqiohncqtkdctswcmllzggxzenbvvoukgeaqscgnojpkenmszzrhgqgkfhhbxcleimuaqaqhmhrsvfmufgbnyjxeqgfoissrgotxqjeerxwoelilrlypuxvkecaovuhbibabmgfffetkpdxioyxkvvvbxxqssxwcawdnflskpoweruogslqpinrgnhafgyjhxpucaompcjvwfjcxwumfkfnxmnevmncjeyleoztrkqnpzroyndfziswxfcstsuewurbirwbdnqtohjmxmrwvjvurxmmpirmckpmblohyeanolzlytjveepxedktndhrnwdrirygwavmlxzjqigwpxutaeonjwgwukpcbnlzngnzfmkvxrumoohruvgdtnboxrqaedcumpvrefpbyjppxwirrowldxzcordtvhnjwkaarpdqashxorqifmvlkwnynqtkxitwswyklccoulnlcetjsouckidzaymahfwbbwnpyrdvcqggwbsprmtbwyczxozgwxjztzosqtpvmvbiytzpitsgtufsleahbkgxjxrbsgwedapbtoqdjikdcrxpwywzifwtenuwvrdyrszmgpsszexevutrsstczrvdhsbclgdeycqhukztoyzkstdllwpmqnrxfubqbeuzjmidxjylhyxatbngzcsppjoudsmewigfvoksyjfhjdhcguifzaxqlnnqfzxcidjftuztfebojksphcxgcuwpjlfplctvhcadyzwdfztpmngtpfbtbzillqawuttexthwufbzhvqtizmaentgmcrzut";
        var words = new String[]{"hbkgxjxrbsgwedapbtoqdjikdc","rwbdnqtohjmxmrwvjvurxmmpir","qbeuzjmidxjylhyxatbngzcspp","mckpmblohyeanolzlytjveepxe","dktndhrnwdrirygwavmlxzjqig","abmgfffetkpdxioyxkvvvbxxqs","szexevutrsstczrvdhsbclgdey","wpxutaeonjwgwukpcbnlzngnzf","wumfkfnxmnevmncjeyleoztrkq","dohggmgjpshspgkutyrxocrgmx","lkwnynqtkxitwswyklccoulnlc","rxpwywzifwtenuwvrdyrszmgps","gqgkfhhbxcleimuaqaqhmhrsvf","rgnhafgyjhxpucaompcjvwfjcx","umpvrefpbyjppxwirrowldxzco","rdtvhnjwkaarpdqashxorqifmv","rxwoelilrlypuxvkecaovuhbib","zosqtpvmvbiytzpitsgtufslea","cqhukztoyzkstdllwpmqnrxfub","npzroyndfziswxfcstsuewurbi","bvvoukgeaqscgnojpkenmszzrh","sxwcawdnflskpoweruogslqpin","fzaxqlnnqfzxcidjftuztfeboj","pqiohncqtkdctswcmllzggxzen","mufgbnyjxeqgfoissrgotxqjee","etjsouckidzaymahfwbbwnpyrd","mkvxrumoohruvgdtnboxrqaedc","vcqggwbsprmtbwyczxozgwxjzt","joudsmewigfvoksyjfhjdhcgui"};

        Q30_SubstringWithConcatenationOfAllWords.Solution solution = new Q30_SubstringWithConcatenationOfAllWords.Solution();
        solution.findSubstring(s, words);
    }

    @Test
    void testExample6(){
        var s = "wordgoodgoodgoodbestword";
        var words = new String[]{"word","good","best","good"};

        Q30_SubstringWithConcatenationOfAllWords.Solution solution = new Q30_SubstringWithConcatenationOfAllWords.Solution();
        solution.findSubstring(s, words);
    }

    @Test
    void justTest(){
        var words = new String[]{"hello", "abcde","fghpt"};
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        int [][] table = new int[2][words.length];
        int failures = 0, index = 0;
        for (int i = 0; i < words.length; ++i) {
            Integer mapped = mapping.get(words[i]);
            if (mapped == null) {
                ++failures;
                mapping.put(words[i], index);
                mapped = index++;
            }
            ++table[0][mapped];
        }
        System.out.println(mapping);
    }
}