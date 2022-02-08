import io.javalin.Javalin;
import java.util.*;
import io.javalin.http.Handler;

public class Main {


    public static void main(String[] args) {

        Javalin app = Javalin.create().start(4100);

        app.get("/", ctx -> ctx.render("index.jte"));

        app.get("/getReimbursement", getFormHandler);

        app.post("/wrongRoute", postFormHandler);

    }

    public static Handler getFormHandler = ctx -> {

      ctx.render("form.jte");

    };

    public static Handler postFormHandler = ctx -> {

      String email = ctx.formParam("email");
      String item = ctx.formParam("item");
      String amount = ctx.formParam("amount");

      ctx.result("Your email is " + email + ". You are applying for reimbursement for " + item + " and the amount is $" + amount);

    };

}
