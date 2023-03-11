import java.io.*;
import java.util.*;

class WebSite {
    int content;
    int images;
    int forms;

    WebSite(int c, int i, int f) {
        this.content = c;
        this.images = i;
        this.forms = f;
    }
}

public class Solution {

    List<WebSite> websites;

    Solution() {
        this.websites = new ArrayList<>();
    }

    void addWebSite(WebSite w) {
        websites.add(w);
    }

    public static void main(String[] args) throws IOException {

        File inputFile = new File("Small_input.txt");

        File outputFile = new File("Small_output.txt");
        FileInputStream inputStream = new FileInputStream(inputFile);
        FileOutputStream outputStream = new FileOutputStream(outputFile);
        PrintWriter writer = new PrintWriter(outputStream);

        Solution sol = new Solution();
        Scanner sc = new Scanner(inputStream);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            WebSite website = new WebSite(sc.nextInt(), sc.nextInt(), sc.nextInt());
            sol.addWebSite(website);
        }
        sol.websites
                .sort(Comparator.comparing((WebSite w) -> w.content)
                        .thenComparing((WebSite a, WebSite b) -> b.images - a.images));
        for (int i = 0; i < sol.websites.size(); i++) {
            WebSite w = sol.websites.get(i);
            if (i == sol.websites.size() - 1)
                writer.print(w.content + " " + w.images + " " + w.forms);
            else
                writer.println(w.content + " " + w.images + " " + w.forms);
        }
        sc.close();
        writer.close();
        inputStream.close();
        outputStream.close();
    }
}
