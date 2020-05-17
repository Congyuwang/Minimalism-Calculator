import javax.swing.*;
import java.awt.*;

public class HelpMenu {

    private static JTextPane helpText = new JTextPane() {
        private static final long serialVersionUID = 8773823648370901685L;
        {
            setBackground(Color.WHITE);
            setForeground(Color.BLACK);
            setContentType("text/html");
            setText("<h1><center>Help Menu</center></h1>"
            + "<p>This is a simple calculator program that allows <i>variable definition</i>, and "
            + "supports <i>basic functions</i> like exponential, logarithm, and square root.</p>"
            + "<p><b><font size=\"+0.5\">Variable names</font></b>:"
            +" must start with a latin letter, and follows latin letters or "
            + "numbers and underscores. Examples: <font face=\"Courier\">a1</font>, "
            + "<font face=\"Courier\">number_of_apples</font>, "
            + "<font face=\"Courier\">alpha__</font>.</p>"
            + "<p><b><font size=\"+0.5\">Supported operators (in descending order of priority)</font></b>: <br>"
            + "<ul>"
            + "     <li><font face=\"Courier\">()</font> (parenthesis) </li>"
            + "     <li><font face=\"Courier\">!, +, -</font> (logical_not, unary positive, unary negative) </li>"
            + "     <li><font face=\"Courier\">^</font> (power) </li>"
            + "     <li><font face=\"Courier\">*, /, %</font> (multiply, divide, remainder) </li>"
            + "     <li><font face=\"Courier\">+, -</font> (plus, minus) </li>"
            + "     <li><font face=\"Courier\">&gt; &lt; &gt;= &lt;=</font> (greater, less, greater equal, less equal) </li>"
            + "     <li><font face=\"Courier\">==, !=</font> (equals, not equals) </li>"
            + "     <li><font face=\"Courier\">&</font> (logical_and) </li>"
            + "     <li><font face=\"Courier\">|</font> (logical_or) </li>"
            + "</ul>"
            + "<p><b><font size=\"+0.5\">Supported assignments</font></b>: <font face=\"Courier\">=</font>, "
            + "<font face=\"Courier\">+=</font>,"
            + "<font face=\"Courier\">-=</font>,"
            + "<font face=\"Courier\">*=</font>,"
            + "<font face=\"Courier\">/=</font>,"
            + "%= assignments</p>"
            + "<p><b><font size=\"+0.5\">Supported functions</font></b>: "
            + "<ul>"
            + "<li><font face=\"Courier\">sqrt()</font> (square root)</li>"
            + "<li><font face=\"Courier\">exp()</font> (exponent)</li>"
            + "<li><font face=\"Courier\">log()</font> (natural logarithm)</li>"
            + "<li><font face=\"Courier\">log10()</font> (logarithm base 10)</li>"
            + "</ul>"
            + "<p><b><font size=\"+0.5\">Predefined variables</font></b>: <font face=\"Courier\">e</font>"
            + " and <font face=\"Courier\">pi</font>, which can be reassigned if needed.</p>"
            + "<p><b><font size=\"+0.5\">Keymap</font></b>: "
            + "<ul>"
            + "<li><font face=\"Courier\">ENTER</font> (calculate result)</li>"
            + "<li><font face=\"Courier\">UP_ARROW</font> (previous input)</li>"
            + "<li><font face=\"Courier\">DOWN_ARROW</font> (next input)</li>"
            + "</ul><br>");
            setEditable(false);
        }
    };

    static JScrollPane createHelp() {
        JScrollPane help = new JScrollPane(helpText);
        help.setBackground(Color.WHITE);
        help.setForeground(Color.BLACK);
        return help;
    }
}
