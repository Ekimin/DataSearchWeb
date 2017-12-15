<html>
<#include  "./common/header.ftl">
    <body>
        <div>客户数据查询</div>
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
                        </tr>
                        </thead>
                        <tbody>
                        <#list customerPage.content as customer>
                        <tr>
                            <td>${customer.getCstName()}</td>
                            <td>${customer.getCardID()}</td>
                            <td>${customer.getMobileTel()}</td>
                            <td>${customer.getEmail()}</td>
                            <td>${customer.getAddress()}</td>
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

            <#list 1..customerPage.getTotalPages() as index>

                <#if currentPage == index>
                    <li class="disabled"> <a >${index}</a></li>
                <#else>
                    <li> <a href="/customer/query?page=${index}&size=${size}">${index}</a></li>
                </#if>

            </#list>

            <#if currentPage gte customerPage.getTotalPages()>
                <li class="disabled"><a href="#">下一页 </a></li>
            <#else>
                <li><a href="/customer/query?page=${currentPage+1}&size=${size}">下一页 </a></li>
            </#if>
            </ul>
        </div>
    </body>
</html>