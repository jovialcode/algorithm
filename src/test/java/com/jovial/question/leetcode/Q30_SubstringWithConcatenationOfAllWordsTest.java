package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

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
}