<html>
<#include  "./common/header.ftl">
<style>
    body{ text-align:center}
    .header-title{ margin:0 auto; width:400px; height:100px; border:1px solid }
    .search-region{margin:10 auto}
    /* css注释：为了观察效果设置宽度 边框 高度等样式 */
</style>
<body>
<div class="header-title" style="font-size: 30px; align-content: center">客户数据查询</div>
<div class="search-region" style="margin-bottom: 50px;">
    <label>客户名字</label>
    <input id="name" type="text"/>
    <label>身份证</label>
    <input id="cardNum" type="number"/>
    <label>手机号</label>
    <input id="tel" type="number"/>
    <button type="button" onclick="gotoUrl()">搜索</button>
</div>
<#if show>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-bordered">
                <thead>
                <tr>
                    <th>
                        姓名
                    </th>
                    <th>
                        身份证号
                    </th>
                    <th>
                        手机号
                    </th>
                    <th>
                        邮箱
                    </th>
                    <th>
                        住址
                    </th>
                    <th>
                        性别
                    </th>
                </tr>
                </thead>
                <tbody>
                    <#list customerPage as customer>
                    <tr>
                        <td>${customer.getCstName()}</td>
                        <td>${(customer.getCardID()==null) ? string("",customer.getCardID())}</td>
                        <td>${customer.getMobileTel()}</td>
                        <td>${customer.getEmail()}</td>
                        <td>${customer.getAddress()}</td>
                        <td>${customer.getGender()}</td>
                    </tr>
                    </#list>
                </tbody>
            </table>
        </div>
    </div>
</div>

<#--分页-->
<div class="col-md-12 column">
    <ul class="pagination pull-right">
        <#if currentPage lte 1>
            <li class="disabled"><a href="#">上一页</a></li>
        <#else>
            <li><a href="/customer/query?page=${currentPage-1}&size=${size}"">上一页</a></li>
        </#if>

        <#list 1..page as index>

            <#if currentPage == index>
                <li class="disabled"><a>${index}</a></li>
            <#else>
                <li><a href="/customer/query?page=${index}&size=${size}">${index}</a></li>
            </#if>

        </#list>

        <#if currentPage gte page>
            <li class="disabled"><a href="#">下一页 </a></li>
        <#else>
            <li><a href="/customer/query?page=${currentPage+1}&size=${size}">下一页 </a></li>
        </#if>
    </ul>
</div>
</#if>
</body>

<script>
    function gotoUrl() {
        var name = $('#name').val()
        var cardNum = $('#cardNum').val()
        var tel = $('#tel').val()
        console.log(name + cardNum + tel)

        window.location.href = "/customer/param/?name=" + name + "&cardNum=" + cardNum + "&tel=" + tel;
    }
</script>
</html>