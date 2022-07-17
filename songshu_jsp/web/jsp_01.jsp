<%@ page import="java.io.Writer" %><%--
  User: SongShu
  Date: 2022/7/13
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp学习——20220713</title>
</head>
<body>
<h2>hello jsp</h2>

<pre>
        jsp基础语法---注释
        1.显示注释：能够在客户端查看的注释，继承HTML风格的注释：  &lt;!-- html注释 --&gt;
                    <!--  html的注释风格 -->
        2.隐式注释：不能再客户端查看的注释
                    jsp自己的注释： &lt;%-- jsp自己的注释 --% &gt;
                    <%-- jsp的注释风格 --%>
                    继承java风格的注释
                    //单行注释
                    /* 多行注释*/



<%--jsp scriptlet脚本小程序--%>
<%
    //该标签可以写Java代码，定义局部变量
    String str = "hello jsp";
    System.out.println(str);
    out.println(str);
    out.println(name);
%>


<hr>
<%!
    //该标签可以声明全局变量、方法和类
    String name = "xiaoming";

%>
<hr>
<%=
    name
    //输出表达式，可以输出字面量和变量
%>

</pre>
</body>
</html>
