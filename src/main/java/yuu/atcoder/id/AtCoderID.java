package yuu.atcoder.id;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.List;

public class AtCoderID {

    static List<String> list = List.of(
            "0",
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9"
    );


    public static void main(String[] args) throws InterruptedException {
        for (String str : list) {
            for (String str2 : list) {
                for (String str3 : list) {
                    try {
                        Document doc = Jsoup.connect("https://atcoder.jp/users/" + str + str2 + str3).get();
                        System.out.println(str + str2 + str3 + " is free");
                        Thread.sleep(10000);
                    } catch (IOException | InterruptedException ex) {
                        System.out.println(str + str2 + str3 + " is used");
                        Thread.sleep(10000);
                        continue;
                    }
                }
            }
        }
    }

}
