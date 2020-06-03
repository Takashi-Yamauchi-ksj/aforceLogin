package jp.co.aforce.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.beans.LoginBean;
import jp.co.aforce.models.LoginModel;

@SuppressWarnings("serial")
//HttpServlet継承してLogin_servletを定義
public class LoginServlet extends HttpServlet{

	//doGet、doPostをOverrideして再定義
	//
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException {

		RequestDispatcher rDispatcher = request.getRequestDispatcher("/views/login.jsp");
		rDispatcher.forward(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {


			request.setCharacterEncoding("UTF-8");
            //ユーザに入力されたusernameとpasswordとってきて
			String username = request.getParameter("username");
			String password = request.getParameter("password");

            //Login_beanに格納
			LoginBean loginBean = new LoginBean();
			loginBean.setUsername(username);
			loginBean.setPassword(password);


			LoginModel loginModel = new LoginModel();
			String forward_jsp = "/views/login.jsp";


			if(loginModel.loginCheck(username, password)) {

				//オリジナル処理


                //request.setAttribute("users", users);

				forward_jsp = "/views/success.jsp";
			}else {

				loginBean.setEmsg("ユーザ名またはパスワードが違います");
				request.setAttribute("loginBean", loginBean);
			}

			RequestDispatcher rDispatcher = request.getRequestDispatcher(forward_jsp);
			rDispatcher.forward(request, response);


	}
}