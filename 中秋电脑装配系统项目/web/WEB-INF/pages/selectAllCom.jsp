<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/9/20
  Time: 23:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<script src="//cdn.bootcss.com/vue/2.5.2/vue.min.js"></script>
<script src="//cdn.bootcss.com/vue-router/3.0.1/vue-router.min.js"></script>
<script src="//cdn.bootcss.com/vuex/3.0.1/vuex.min.js"></script>
<script src="//cdn.bootcss.com/axios/0.17.1/axios.min.js"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>

<html>
<head>
    <title>电脑配件列表</title>
    <style>
        #app{
            width: 800px;
            height: 300px;
            /* border: greenyellow 2px solid;*/
            margin: 0 auto;
        }
        #wy{
            width: 700px;
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
    <h3 align="center">电脑配件列表</h3>

    <div id="app">
        <a href="/main">返回主页</a>
        <table id="wy">
            <thead>
                <tr>
                    <th>序号</th>
                    <th>配件名称</th>
                    <th>配件类型</th>
                    <th>容量</th>
                    <th>价格</th>
                </tr>
            </thead>
            <tbody  id="queryAll">
                <tr>

                </tr>
                <%--<tr v-for="(item,index) in list" :value="index">
                    <td :value="component.componentId" v-for="(item,index) in componentId">{{component.componentId}}</td>
                    <td :value="component.typeId" v-for="(item,index) in typeId">{{component.typeId}}</td>
                    <td :value="component.componentName" v-for="(item,index) in componentName">{{component.componentName}}</td>
                    <td :value="component.capacity" v-for="(item,index) in capacity">{{component.capacity}}</td>
                    <td :value="component.price" v-for="(item,index) in price">{{component.price}}</td>
                    &lt;%&ndash;<td>{{item.componentId}}</td>
                    <td>{{item.componentName}}</td>
                    <td>{{item.typeId}}</td>
                    <td>{{item.capacity}}</td>
                    <td>{{item.price}}</td>&ndash;%&gt;
                </tr>--%>
            </tbody>

        </table>
    </div>
    <p style="text-align: center">
        共11条记录，当前是1页/共3页
        <a href="#">首页</a>
        <a href="#">上一页</a>
        <a href="#">下一页</a>
        <a href="#">尾页</a>
    </p>

<script>
    $.ajax({
        url:'/component/selectByPage',
        type:'post',
        dataType:'json',
        success:function (res) {
            console.log(res.data.list)

            //给id为 typeSelect 渲染数据
            $.each(res.data.list,function (index,item) {
                var queryDom = $("<tr>" +
                    "<td>"+item.componentId+"</td>" +
                    "<td>"+item.componentName+"</td>" +
                    "<td>"+item.typeId+"</td>" +
                    "<td>"+item.capacity+"</td>" +
                    "<td>"+item.price+"</td>" +
                    "</tr>")
                $("#queryAll").append(queryDom);//ajax异步下拉框

            });
        }
    });
   /*/!* var vm = new Vue({
        el:'#app',
        data:{
            types:[],
            list:[{
                component:{}
            }
            ]
        },
       /!* created:function () {
            // 调用axios的get方法，获取数据
            axios.get('/component/selectAllCom').then((response) => {
                console.log(response)
                this.types = response.data.component;

            // 将获取回来的数据赋值给list
            this.component = response.data
        })
        },*!/
        method: {
            // 调用axios的get方法，获取数据
            axios.post('/component/selectAllCom').then((response) => {
                console.log(response);
                this.types = response.data.component;

             // 将获取回来的数据赋值给list
             this.component = response.data
             })*!/
        }
    });*/
</script>
</body>
</html>
