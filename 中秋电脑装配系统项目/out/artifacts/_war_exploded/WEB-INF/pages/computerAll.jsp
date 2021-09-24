<%--
  Created by IntelliJ IDEA.
  User: TJYSB
  Date: 2021/9/21
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>电脑列表</title>
    <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
    <script src="//cdn.bootcss.com/vue/2.5.2/vue.min.js"></script>
    <script src="//cdn.bootcss.com/vue-router/3.0.1/vue-router.min.js"></script>
    <script src="//cdn.bootcss.com/vuex/3.0.1/vuex.min.js"></script>
    <script src="//cdn.bootcss.com/axios/0.17.1/axios.min.js"></script>
    <script src="https://unpkg.com/axios/dist/axios.min.js"></script>

    <style>
        #app{
            width: 800px;
            height: 600px;
           /* border: greenyellow 2px solid;*/
            margin: 0 auto;
        }
        #wy{
            border: 2px solid black;
            border-collapse: collapse;
            margin: 0 auto;
            margin-top: 18px;
        }
        table th {
            padding: 8px;
            border: 2px solid black;
            background: #666666;
        }
        table td {
            padding: 8px;
            border: 2px solid black;
        }
    </style>
</head>
<body>

    <%--https://blog.csdn.net/qq_42238554/article/details/95167858--%>
    <h3 align="center">机型列表</h3>
    <div id="app">
    <a href="/main">返回主页</a>
    <table id="wy">
        <thead>
        <tr>
            <th>序号</th>
            <th>电脑名称</th>
            <th>CPU</th>
            <th>内存</th>
            <th>显卡</th>
            <th>硬盘</th>
            <th>显示器</th>
            <th>价格</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody id="queryAll" v-for="(item,index) in messages">
        <%--<tr class="text-x">
            <td>{{item.computerId}}</td>
            <td>{{item.computerName}}</td>
            <td>{{item.memory}}</td>
            <td>{{item.cup}}</td>
            <td>{{item.videocard}}</td>
            <td>{{item.display}}</td>
            <td>{{item.hdd}}</td>
            <td>{{item.price}}</td>
            <td>
                <a href="#" @:click="getUpdate(item.computerId)">修改</a>&nbsp;&nbsp;&nbsp;
                <a href="#" data-toggle="modal" @:click="del(item.computerId)">删除</a>&nbsp;&nbsp;&nbsp;
            <td>
        </tr>--%>
        </tbody>
    </table>
    </div>
    <script>
        $.ajax({      //axios是ajax的大哥
            url:'/computer/queryAll',
            type:'post',
            dataType:'json',
            success:function (res) {
                console.log(res.data)

                //给id为 typeSelect 渲染数据
                $.each(res.data,function (index,item) {
                    var queryDom = $("<tr>" +
                        "<td>"+item.computerId+"</td>" +
                        "<td>"+item.computerName+"</td>" +
                        "<td>"+item.cup+"</td>" +
                        "<td>"+item.memory+"</td>" +
                        "<td>"+item.videocard+"</td>" +
                        "<td>"+item.hdd+"</td>" +
                        "<td>"+item.display+"</td>" +
                        "<td>"+item.price+"</td>" +
                        "<td>"+"<a href='#'  @click='deleteComputer(item.computerId)'>删除</a>"+"  " +
                        "<a href='#' @click='editComputer(item.computerId)'>修改</a>"+"</td>" +
                        "</tr>")
                    $("#queryAll").append(queryDom);//ajax异步下拉框

                });
            }
        });
        /*var vm = new Vue({
            el:'#app',
            data:{
                messages:[] //设置空的集合
            },
            mounted:function () {
                this.getDate()    //预加载事件，无需放置预加载函数中
            },
            methods:{    //这里是显示方法
                getDate: function () {                        //获取axios方法（等同于ajax使用）
                    axios.get("/computer/queryAll").then((response) => {       //api地址
                        this.messages = [];
                    response.data = JSON.parse(response.data);
                    for (var i in response.data) {
                        this.messages.push(response.data[i]);
                    },
                    del: function (computerId) {
                        if (confirm("确定要删除吗？")) {
                            axios.get("/computer/delete?computerId=" + computerId).then((response) => {
                                if (response.data > 0) {
                                alert("删除成功");
                                location.reload();
                            }
                                else {
                                alert("删除失败");
                            }
                        })
                        }
                    }
                }
                }
            }
        });*/

    </script>




</body>
</html>
