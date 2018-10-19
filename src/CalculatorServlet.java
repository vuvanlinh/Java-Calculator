import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculator")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double result;
        PrintWriter writer = response.getWriter();
        double fistoperant = Double.parseDouble(request.getParameter("fistoperant"));
        double secondoperant = Double.parseDouble(request.getParameter("secondoperant"));
        String operator = request.getParameter("operator");
        switch (operator) {
            case "add":
                result = fistoperant + secondoperant;
                writer.println("<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "    <meta charset=\"UTF-8\">\n" +
                        "    <title>Calculator</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "Result: " + result + "\n" +
                        "</body>\n" +
                        "</html>");
                break;
            case "minus":
                result = fistoperant - secondoperant;
                writer.println("<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "    <meta charset=\"UTF-8\">\n" +
                        "    <title>Calculator</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "Result: " + result + "\n" +
                        "</body>\n" +
                        "</html>");
                break;
            case "multi":
                result = fistoperant * secondoperant;
                writer.println("<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "    <meta charset=\"UTF-8\">\n" +
                        "    <title>Calculator</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "Result: " + result + "\n" +
                        "</body>\n" +
                        "</html>");
                break;
            case "division":
                result = fistoperant / secondoperant;
                writer.println("<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "    <meta charset=\"UTF-8\">\n" +
                        "    <title>Calculator</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "Result: " + result + "\n" +
                        "</body>\n" +
                        "</html>");
                break;
        }
    }
}
