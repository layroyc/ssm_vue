<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/9/21
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加电脑</title>
    <script src="https://unpkg.com/axios/dist/axios.min.js"></script>
    <script src="//cdn.bootcss.com/vue/2.5.2/vue.min.js"></script>
    <script src="https://unpkg.com/axios/dist/axios.min.js"></script>
</head>
<body>
<h3 align="center">添加电脑</h3>
<div id="app">
    <a href="/main">返回主页</a>
    <p></p>
    <form action="" method="post" @Submit="onSubmit" id="myForm">
        电脑型号:<input type="text" name="componentName"><br>
        CPU:
        <select v-model="component.typeId">
            <option :value="item.typeId" v-for="(item,index) in types">{{item.typename}}</option>
        </select><br>
        内存:
        <select>
            <option>1</option>
        </select><br>
        硬盘:
        <select>
            <option>1</option>
        </select><br>
        显卡:
        <select>
            <option>1</option>
        </select><br>
        显示器:
        <select>
            <option>1</option>
        </select><br>
        价格:<input type="text" name="price"><br>
        <input type="submit" value="添加">
    </form>
</div>

<script>
    var vm = new Vue({
        el:'#app',
        data:{
            types:[],
            component:{}
        },
        created:function () {
            axios.get('/component/selectTwoTable').then((response) => {
                this.types = response.data.data;
            console.log(response.data.data)
        })
        }
    });
</script>

</body>
</html>
