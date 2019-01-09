<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/07
  Time: 04:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>员工列表</title>
    <script src="<%=request.getContextPath()%>/js/jquery-3.3.1.min.js"></script>
    <style>
        table{
            width:1000px;
            min-height:200px;
            list-style: none;
            border-collapse: collapse;
            background-color: aqua;
        }
        td{
            border:1px solid black;
            text-align: center;
            line-height: 40px;
        }
        input[type="text"]{
            height: 30px;
        }
        input[type="button"]{
            height: 30px;
            width:50px;
        }
    </style>
    <script>
        $(function () {
            $.ajax({
                url: "<%=request.getContextPath()%>/list.do",
                type: "post",
                async: "false",
                contentType: "json",
                success: function (data) {
                    if (data != '') {
                        var tr="";
                        for (var i=0;i<data.length;i++){
                            var obj = data[i];
                            tr+="<tr><td>"+obj.dname+"</td><td>"+obj.loc+"</td><td>操作</td></tr>"
                        }
                        console.log(tr);
                        $("#tbd").append(tr);
                    }
                }
            });
        })
    </script>
</head>
<body>
    <center>
        <h3>部门列表ip：192.168.206.103</h3>
        <table>
            <tr>
                <td>名称</td>
                <td>位置</td>
                <td>操作</td>
            </tr>
            <tbody id="tbd"></tbody>
        </table>
    </center>
</body>
</html>
