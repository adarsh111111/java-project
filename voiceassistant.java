import java.util.*;
import java.io.ObjectInputFilter.Config;
import java.net.URI;
import javax.naming.directory.SearchResult;
import java.awt.Desktop;
import edu.cmu.sphinx.api.*;

public class voiceassistant {
    
    public static void main(String[] args) throws Exception {
        Configuration config = new Configuration();
        config.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        config.setDictionaryPath("dic.dic");
        config.setLanguageModelPath("lm.lm");
        try {
            LiveSpeechRecognizer rec = new LiveSpeechRecognizer(config);
            rec.startRecognition(true);
            Desktop desk = Desktop.getDesktop();
            while (rec.getResult() != null) {
                String result = rec.getResult().getHypothesis();
                if (result.toLowerCase().equals("google")){
                    System.out.println("Opening: "+result);
                    URI uri = new URI("http://google.com/");
                    desk.browse(uri);
                }else if(result.toLowerCase().equals("youtube")){
                    System.out.println("Opening: "+result);
                    URI uri = new URI("http://youtube.com/");
                    desk.browse(uri);
                }
                else if(result.toLowerCase().equals("playsong")){
                    System.out.println("Opening"+result);
                    URI uri=new URI("https://open.spotify.com/track/6fW78cd0p3ZDUzoqvx2Xqe");
                    desk.browse(uri);
                }
                else if(result.toLowerCase().equals("amazon")){
                    System.out.println("Opening"+result);
                    URI uri=new URI("https://www.amazon.in/");
                    desk.browse(uri);
                }
                else if(result.toLowerCase().equals("flipkart")){
                    System.out.println("Opening"+result);
                    URI uri=new URI("https://www.flipkart.com/");
                    desk.browse(uri);

                }
                else if(result.toLowerCase().equals("chatgpt")){
                    System.out.println("Opening"+result);
                    URI uri=new URI("https://chat.openai.com/chat");
                    desk.browse(uri);

                }
                else if(result.toLowerCase().equals("facebook")){
                    System.out.println("Opening"+result);
                    URI uri=new URI("https://www.facebook.com/");
                    desk.browse(uri);
                }
                else if(result.toLowerCase().equals("twitter")){
                    System.out.println("Opening"+result);
                    URI uri=new URI("https://twitter.com/i/flow/login");
                    desk.browse(uri);
                }
                else if(result.toLowerCase().equals("instagram")){
                    System.out.println("Opening"+result);
                    URI uri=new URI("https://www.instagram.com/");
                    desk.browse(uri);
                }
                else if(result.toLowerCase().equals("gfg")){
                    System.out.println("Opening"+result);
                    URI uri=new URI("https://www.geeksforgeeks.org/");
                    desk.browse(uri);
                }
                else if(result.toLowerCase().equals("applestore")){
                    System.out.println("Opening"+result);
                    URI uri=new URI("https://www.apple.com/in/");
                    desk.browse(uri);
                }
                else if(result.toLowerCase().equals("bitcoin")){
                    System.out.println("Opening"+result);
                    URI uri=new URI("https://bitcoin.org/en/");
                    desk.browse(uri);
                }
                else if(result.toLowerCase().equals("primeminister")){
                    System.out.println("Opening"+result);
                    URI uri=new URI("https://en.wikipedia.org/wiki/Narendra_Modi");
                    desk.browse(uri);
                }
               
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}