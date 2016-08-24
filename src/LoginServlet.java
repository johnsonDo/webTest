import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jiangdongcheng on 16/8/8.
 */
public class LoginServlet extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String username = req.getParameter("name");
        String password = req.getParameter("password");


        //设置编码格式
        res.setContentType("text/html;charset=utf-8");

        if(username.equals("john") && password.equals("123")){

            res.getWriter().println("欢迎【" + username + "】用户登录成功！！！");

        }

    }
}
