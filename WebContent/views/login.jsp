<%@ page language="java" contentType="text/html; charset=UTF-8" %>


<!-- タグライブラリの使用を宣言する（必要に応じて） -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html>
    <head>
        <!-- 文字エンコーディングの指定 -->
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  		<link rel="stylesheet" type="text/css" href="login.css">
        <title>ログイン</title>
    </head>
    <body>

    <main>
		<h1>ログイン</h1>
		<h2>${loginBean.getEmsg()}</h2>

		<div>
			<table>
			<form action="/LoginPractice/Login_servlet" method="post">
				<tr>
					<th>名前</th>
					<td>
						<input type="text" name="username" value="">
					</td>
				</tr>
				<tr>
					<th>パスワード</th>
					<td>
						<input type="text" name="password" value="">
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="ログイン">
					</td>
				</tr>
			</form>
			</table>

		</div>
	</main>

    </body>
</html>