<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/9/20
  Time: 22:03
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
    <title>添加电脑配件</title>
</head>
<body>
<div id="app">
    <h3>添加电脑配件</h3>
    <form action="/selectAllCom" method="post" @Submit="onSubmit" id="myForm">
        配件名称:<input type="text" v-model="component.componentName"><br>
        配件类型:
        <select v-model="component.typeId">
            <option :value="item.typeId" v-for="(item,index) in types">{{item.typename}}</option>
        </select><br>
        配件容量:<input type="text" v-model="component.capacity">G<br>
        配件价格:<input type="text" v-model="component.price"><br>
        <input type="submit" value="添加">
        <br>
        {{types}}
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
            axios.get('/type/selectAll').then((response) => {
                this.types = response.data.data;
                console.log(response.data.data)
        })
        },
        methods:{
            onSubmit:function (e) {
                //凡是事件都有个e
                console.log(e)
                console.log(e.target)//vue 的事件  可以通过 e.target 拿到标签中的dom元素

                console.log(this.component)

                axios.post('/component/insert',{
                    componentName:this.component.componentName,
                    typeId:this.component.typeId,
                    capacity:this.component.capacity,
                    price:this.component.price
                }).then((response)=>{
                    if(response.data.code==0){
                    alert(response.data.msg)
                }else{
                    alert("添加失败")
                }
            })

                return false;

            }
        }
    });
</script>
</body>
</html>
