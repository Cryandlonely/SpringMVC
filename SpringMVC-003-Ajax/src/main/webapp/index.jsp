<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.3.1.js"></script>
</head>
<script type="text/javascript">
    function showStu() {
        $.ajax({
            url: "list.action",
            /*url: "ac/list.action",*/
            dataType: "json",
            success: function (response) {
                var json = "";
                $.each(response, function (index, element) {
                    json += element.name + "------" + element.age + "<br>";
                });
                $("#lang").html(json);
            }
        });
    }
</script>
<body>
<a href="javascript:showStu()">访问服务器</a>
<div id="lang">html内容</div>
</body>
</html>
