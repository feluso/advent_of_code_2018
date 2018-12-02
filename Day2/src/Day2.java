
import java.util.Arrays;
import java.util.HashMap;

public class Day2 {

    public static String[] input  = {"ayitmcjvlhedbsyoqfzukjpxwt", "agirmcjvlheybsyogfzuknpxxt", "wgirmcjvlvedbsyoqfzujnpxwt", "agizmcjvlhedbsyoqfzuenlxwt", "aryrmcjvlheebsyoqfzuknpxwt", "agirmcjelhedbsyoqfzukosxwt", "azirmcjvlhedbsooqfzuknpxvt", "agirmcjvffedbsyoqfzudnpxwt", "agilmcjvlhedbsyrqfzuknpxrt", "agirmcjvlhndbsyoofzukcpxwt", "awirmcjvlhedbsyoqfzuknpxlz", "aghrmcjmlhewbsyoqfzuknpxwt", "apirmcjvlmedbsyoqfzcknpxwt", "jgiricjvlhedbsyrqfzuknpxwt", "abirmcjvlbedbsyoqfzuknpxwo", "agirmcjvlhedbsyojfzuknpgkt", "agicmclvlhedbmyoqfzuknpxwt", "aslrzcjvlhedbsyoqfzuknpxwt", "agiqmcjvlhedbsymqfzurnpxwt", "agirmcjvlwedbsyoqfzuknfxmt", "agiumcjvlhedbsyoqfzuknpbyt", "xgirxcjvlwedbsyoqfzuknpxwt", "bgtrvcjvlhedbsyoqfzuknpxwt", "afirmcjvlpedbsyoqvzuknpxwt", "agirmcjjvhedbsyoqfzukmpxwt", "ggirmcjvlhedbsyoqfzukypxvt", "agirmdjulhekbsyoqfzuknpxwt", "agirmcjqlhedbsyoqfztknixwt", "agirmcjvjhedbsyomfduknpxwt", "agirmcjvlhedbgyoqfzuknpxtq", "agirmvjvlhbdbsyfqfzuknpxwt", "agirmcjvlhedbsyatfzbknpxwt", "agirmcjvlrlybsyoqfzuknpxwt", "agirmajvlhedbsqovfzuknpxwt", "abinmcrvlhedbsyoqfzuknpxwt", "agnrmcjvlhedbsyurfzuknpxwt", "agirmpjvlhedbsyoqezuknpxct", "agirmxjvlhedbsgoqjzuknpxwt", "agirmcjvlhehbstoqfzuknpxht", "qgirmcjvlhepcsyoqfzuknpxwt", "tgirmcjvlhkdbsyoqszuknpxwt", "agirmcjvdhedbscoqftuknpxwt", "agbrmcjvlhedbsyoqfzukqpxwj", "agurmcjvlhedbsyaqfzuknpxmt", "agirmcjvohudbsyoqfmuknpxwt", "agirmcjvlhekbsyoqfbuktpxwt", "agirmcjvlhedhsyoqfzugnnxwt", "agirmcjvlhedbsyjqyzuknpxft", "agirmcjvlhedbsymufznknpxwt", "agirmcjhlheubsyoqfzuknpxmt", "agirmcjvlhwdbsywqfzwknpxwt", "agirmcjvljedbsgqqfzuknpxwt", "aglrmcjelhedbsyoqfzuknpxkt", "agxrmcjvlhxdbsyoqfquknpxwt", "agirmcjvnhedbsyoqfzuenfxwt", "agirmcjvlhedbsyoqfzatnqxwt", "agirmcvvlhedbsboqfzuknuxwt", "agirncjvlhezbsyoqfzulnpxwt", "agiamcjvdiedbsyoqfzuknpxwt", "agirmcjvwhedbskoqfzhknpxwt", "agiwmcjflhedbsyoqfzulnpxwt", "agirmcjvlhedboyoqfzuknpjwl", "agivmcjslhedbsyoqfzdknpxwt", "agirmcjvlcedbsyoqfzukepxyt", "akirmcjvlhjdbssoqfzuknpxwt", "agvrmcjvldedmsyoqfzuknpxwt", "agirecjvlhidbsyoqfzukbpxwt", "abirmcjvlhjdbsyoqfkuknpxwt", "agirmcjelhedbfyoqfzuknpxwj", "agirmcjvlhedbbyoqrzukwpxwt", "akirmcjvlhedbsyoyfzuknplwt", "agirmcjvlhedbsydsfzuknpxwq", "agirrcjvlhedbsyoqazuknpmwt", "aeirmcjvlhedbsyoqfvuknpwwt", "akirmcjvlhedbsyoqpzudnpxwt", "agijmcjvlhedbsyuqfzunnpxwt", "agirmcjilhedasyoqizuknpxwt", "agirmczvlhzdbsyoqfzuknpxwx", "agirmcjvlhehbsyoifzuknpxwo", "agirwcjvlhedbsyoqfzuenpxst", "agirmcjvlhedbsyoquzuknhxft", "agirmcqvlkedbsyoqfzrknpxwt", "agirmcqvlhenbsyoqfzuknpuwt", "agirmcjvleedbsyoqfzhhnpxwt", "agirmcjvlhembsyrqfauknpxwt", "agirmcjvlhedbssoqflcknpxwt", "aqirmcjvlnedbsyoqfzuknpxpt", "agirmcjqlhedbxpoqfzuknpxwt", "fgirmcjvlhedbsyoqfzukqpqwt", "aggrmcjvlhpdbsyoqfzuknpxjt", "agirmwjvlhedbsywqfzuknpzwt", "agirmcailhembsyoqfzuknpxwt", "aglrmcjvlhxdbsyoqfzuknpxet", "xgirmcjvlhzdbsyoqfzukrpxwt", "agvrmcjvuhedbsyoqfzuknpxgt", "agikmcjvlhecbsyoqfzuknpxwr", "agyrmcjvlhezbsyoqfouknpxwt", "agirmcjvfhjdbsyokfzuknpxwt", "agkrmjjvlhedtsyoqfzuknpxwt", "agirmgjvlhedbiyoqfzuknpxwv", "wcirmcjvlhedbsyoqfzuknpxwo", "aairmcjvlhedbstoqfguknpxwt", "hgirmcjvlhedwfyoqfzuknpxwt", "agirmcjvmhfdbmyoqfzuknpxwt", "agirmcjvlhvdbsioqfzuanpxwt", "agrrmcjvgsedbsyoqfzuknpxwt", "agirmcjvlqetbsysqfzuknpxwt", "agirccjvlhedbsyoqfzuknkcwt", "agirmqjvlhedbsdoqfzkknpxwt", "agirmcjvlheobsyopfzuknpxwg", "agirmcjolhedbsyofpzuknpxwt", "agirmcjnlhedbsyoqkzukfpxwt", "agiumcjvlheabsyoqfzuknpxbt", "agipmcjvlhedbsyoqfzukupxwz", "atirmcrvlhedbsyoqfnuknpxwt", "agirmcjvnhedfkyoqfzuknpxwt", "agirmrjvlhedboyoqfzvknpxwt", "abhrmcjvlhedbtyoqfzuknpxwt", "cbirmcjvlhedbfyoqfzuknpxwt", "agirmcjvlhedbsyoqfmwknjxwt", "ahirmcjvlhedbsloqfzuknpfwt", "agarmjjvlhedbsyoqfzyknpxwt", "ajirmcjvlhevjsyoqfzuknpxwt", "agirmcjvlhpdbstoqfzuknpewt", "agirmcsvlhedbsyoqfbupnpxwt", "agirmcjvlhexbsyodfzukqpxwt", "auiymcjblhedbsyoqfzuknpxwt", "azirmcjvchedbsyoqfziknpxwt", "aeirmcjvlhedvsyoqfzuonpxwt", "agirmcjvlhedbfyoqfbukjpxwt", "ygirmcjvlhidbsyoqfzukncxwt", "agirmxpvlhedbsyoqffuknpxwt", "ztirmcjvlhedosyoqfzuknpxwt", "agirmcjvlhepbsyoqfzuenppwt", "agirmcjvshedbsyoqnzaknpxwt", "awirmcjvlhydbsyoqfzuknoxwt", "ucirmcjvlhedbsyoqfjuknpxwt", "agirmwjvlhkbbsyoqfzuknpxwt", "agirmcjvldedbsyohfzuknpxzt", "agirmcjvwhedbsyoqfznknpxgt", "agiricjvlhedxqyoqfzuknpxwt", "agirmcjvlhzdbjyoqfzukapxwt", "agirmcgvlhedbsyoqfzuknaowt", "agidmcjvlhedbsyoqayuknpxwt", "agirmcjvlhedisnoqfzuknpxnt", "wkjrmcjvlhedbsyoqfzuknpxwt", "agirmcjvlhedbuyojfzukxpxwt", "agkrmcjvlhedbsybqfzurnpxwt", "agirmcjvghedbsyoqfzuknexwj", "agirmcjvnhedbsyoqfzuznpxit", "agirmcjvlbedbsyoqfiukwpxwt", "agirlctvlheabsyoqfzuknpxwt", "agirmcjzzhedbsyoqfzcknpxwt", "akirmcjvlnedbsyoqfzlknpxwt", "agirmdjvlhedpsyoqfzuknpjwt", "agiyjcuvlhedbsyoqfzuknpxwt", "agirmcbvltedysyoqfzuknpxwt", "agirmcjvlhedfdyoqfzubnpxwt", "agidmcjvlhedesfoqfzuknpxwt", "aeirmcjvlhedqsyoqfxuknpxwt", "agifmcjvlhedbsyoqfquknptwt", "agidmcjvlhedbsyfqfzuknpxwb", "agirvcjvlhedbsroqfzuknjxwt", "agirmcqvlhddbsyoqfzuknpxwj", "agirmcjvlhmdqsyoqizuknpxwt", "atirmcjvltedbsyoqfzuknpxwz", "agirxnjvlhedbsyoqfzuknpxkt", "agihmcjvlhedbsyoqfzukepxqt", "agirmcjvlhedbsmoqzsuknpxwt", "agirycjvlhedbuyoqfwuknpxwt", "agirmcjvlhedbsyoqfzfkrfxwt", "agirzcjvlhedbsyoqfhuknpxnt", "agigmcjvlhedbsqnqfzuknpxwt", "agirmgzvlhedbsyoqfzuonpxwt", "agirmcjvqhedbqyoqfzukqpxwt", "anarmcjvlhedbsyocfzuknpxwt", "agirmcjuihedbshoqfzuknpxwt", "agirdckvlhedbsyoqfzxknpxwt", "ugirmujvlhwdbsyoqfzuknpxwt", "mgirmcjvlheobsyovfzuknpxwt", "agirmcjvghedbsyoqfzufxpxwt", "agirmcjvlhedbsyoinzuknuxwt", "agirmzjvlhbdbsyoqfzlknpxwt", "agivmcjvlhedbsconfzuknpxwt", "agirmwfvlhedtsyoqfzuknpxwt", "agirmcjvlhedbbyoqrzukncxwt", "agirmcjvlhelbsyoqfzupnlxwt", "agirmmjvluedqsyoqfzuknpxwt", "agjrmcjvlhedbsyaqfcuknpxwt", "agiwmcjvlhedbsyoqzzuknpswt", "agirxcjvlhedbsyoqfyvknpxwt", "agirmljvlhedbsyoqkzuknpxjt", "agirmcjvchedbsyoqfzmknyxwt", "agirmcjvlhedbsyovfzuynpxwl", "agtrmcjvlhedysyoqfzuknexwt", "agirmcjvmhedbslonfzuknpxwt", "agirmcjfshedbsyoqfziknpxwt", "agirmcjvlhedbsygqfzkknpbwt", "agyrmcivlhedbsyovfzuknpxwt", "agirmcjvghedbsyoqjzuknkxwt", "agirmcjvlhedqsyoqfzukspxmt", "ayirmcjvhhedbsyomfzuknpxwt", "agirmcjvlnembsypqfzuknpxwt", "agirmcjqlhedbsyuvfzuknpxwt", "agirmcjvlhembsybqfzuknpxwa", "agirjcfvlhedbsyoqfuuknpxwt", "agirmcjvohedbsyowfzuknxxwt", "agirmcjvlhedroyoqfzukncxwt", "agrrmijvlhedbsyoqfnuknpxwt", "agirmjjvlhsdbsyoqfzumnpxwt", "agirrcjvnhedbsyoqfzuktpxwt", "agirmcjvlzedjsyoqfzuknpdwt", "agirmkjvlhedbsyoqfzxinpxwt", "agirmcjvlhedbzyojfzuknpvwt", "arirmcjvlheddsyoqfzuknrxwt", "agirmcjvlhedbsyoqhzuanpxmt", "agirmcjvluedbsyoqozuknwxwt", "afirmcjwlhedxsyoqfzuknpxwt", "agirmcjvlhefbsyoqfkuinpxwt", "agirycjvltedbsypqfzuknpxwt", "agirmrxvlhedbsyoqfzeknpxwt", "agfrmcqvlhedbsyoqxzuknpxwt", "agormcjvuhexbsyoqfzuknpxwt", "agyrmcjvehddbsyoqfzuknpxwt", "agirmcjvlheqbsynqfzgknpxwt", "agirmcjvlhedbsloufwuknpxwt", "tgirmcjvlwedbsyoqfzuknpqwt", "agirmcjvlhesbzyogfzuknpxwt", "agitmdjvlhedpsyoqfzuknpjwt", "bgirmejvlhtdbsyoqfzuknpxwt", "aginmcjvlhedzsyoqfzuknoxwt", "agvrzcjvlhedbsuoqfzuknpxwt", "agormcjvlhedbsyoqfzuknpodt", "agirmcevlhedbgyojfzuknpxwt", "agirmcjblhedboytqfzuknpxwt", "qgibmcjvlhedbsyoqfzuknbxwt", "agirmcjvlhedbsyoafzutnnxwt", "agiamcjvchkdbsyoqfzuknpxwt", "agirmcjvehedblyoqwzuknpxwt", "agirmcpvlhwdbsyoafzuknpxwt", "agirmcjvlhtdbsyoqfzumnpxtt", "agirmcjalhegtsyoqfzuknpxwt", "agirdijvlhedbsyoqfzutnpxwt", "agirmckvlhgdbsyovfzuknpxwt", "qgmrmcjvlkedbsyoqfzuknpxwt", "agirjcjvlhodbsyoqfzuanpxwt", "ajirmcjvlhedbpyoqftuknpxwt", "cgirmcjvlhedbsyoqfiuonpxwt", "ayirmcjvlhedbsyaqfzuknwxwt", "agirmcjvlhedbdyoqbzwknpxwt"};

    public static void main(String[] args) {
        System.out.println(checksum(input));
    }

    public static int checksum(String[] input) {
        int[] reduce = Arrays.stream(input).map(
                id -> {
                    HashMap<Character, Integer> frequencyMap = new HashMap<>();
                    int twoFrequency = 0, threeFrequency = 0;
                    for (int charIndex = 0; charIndex < id.length(); charIndex++) {
                        Character letter = id.charAt(charIndex);
                        Integer letterFrequency = frequencyMap.get(letter);
                        if (letterFrequency == null) {
                            frequencyMap.put(letter, 0);
                            letterFrequency = frequencyMap.get(letter);
                        }
                        letterFrequency++;
                        frequencyMap.put(letter, letterFrequency);
                        if (letterFrequency == 2) {
                            twoFrequency++;
                        } else if (letterFrequency == 3) {
                            twoFrequency--;
                            threeFrequency++;
                        } else if (letterFrequency == 4) {
                            threeFrequency--;
                        }
                    }
                    int[] pair = {twoFrequency > 0 ? 1 : 0, threeFrequency > 0 ? 1 : 0};
                    return pair;
                }
        ).reduce(new int[]{0, 0}, (a, b) -> {
            int twoAccumulatedFrequency = a[0] + b[0];
            int threeAccumulatedFrequency = a[1] + b[1];
            return new int[]{twoAccumulatedFrequency, threeAccumulatedFrequency};
        });

        return reduce[0] * reduce[1];
    }
}