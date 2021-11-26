import javax.swing.JOptionPane;

public class Quiz {

    public static void main(String[] args) {

        // initializing the question variable

        String question = "What is UoPeople? \n";
        question += "A. A farm. \n";
        question += "B. An online tuition-free university. \n";
        question += "C. An app. \n";
        question += "D. A media House. \n";
        question += "E. A Museum.";

        // initializing the answer variable

        String answer = JOptionPane.showInputDialog(question);
        answer = answer.toUpperCase();

        // initializing the while loop

        while (answer != "B") {
            if (answer.equals("B")) {
                JOptionPane.showMessageDialog(null, "Correct!");
                break;
            } else if (answer.equals("A") || answer.equals("C") || answer.equals("D") || answer.equals("E")) {

                JOptionPane.showMessageDialog(null, "Incorrect. Please try again.");
                answer = JOptionPane.showInputDialog(question);
                answer = answer.toUpperCase();
            } else {
                JOptionPane.showMessageDialog(null, "Invalid. Please enter A, B, C, D, or E.");
                answer = JOptionPane.showInputDialog(question);
                answer = answer.toUpperCase();
            }

        }
    }

}
