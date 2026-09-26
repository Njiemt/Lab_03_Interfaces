import  javax.swing.JFileChooser;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

void main() {
    JFileChooser Choose = new JFileChooser("C:/Users/moham/IdeaProjects/Lab_03_Interfaces/src");

    ShortWordFilter filter = new ShortWordFilter();

    int result = Choose.showOpenDialog(null);




    if(result == JFileChooser.APPROVE_OPTION) {
        File file = Choose.getSelectedFile();
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");

                for (String word : words) {
                    if (filter.accept(word)) {
                        System.out.println(word);
                    }
                }
            }



        }catch(IOException e){
            e.printStackTrace();
        }
    }
}