<%--
  Created by IntelliJ IDEA.
  User: yaromyryaremko
  Date: 16.09.16
  Time: 19:46
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    </head>
    <body>
    <%--<form action="/add/goods" method="post" enctype="multipart/form-data" id ="formForGoods">--%>
        <%--Додати товар--%>
        <%--<input type="text" id="name" name="name">--%>
        <%--<input type="text" id="goodsCode" name="goodsCode">--%>
        <%--&lt;%&ndash;<select id="categoryForSort" >&ndash;%&gt;--%>
            <%--&lt;%&ndash;<option value="${NULL}" > Select Category</option>&ndash;%&gt;--%>
            <%--&lt;%&ndash;<c:forEach var="category" items="${categories}">&ndash;%&gt;--%>
                <%--&lt;%&ndash;<option value="${category.id}" >${category.name}</option>&ndash;%&gt;--%>
            <%--&lt;%&ndash;</c:forEach>&ndash;%&gt;--%>
        <%--&lt;%&ndash;</select>&ndash;%&gt;--%>
        <%--<select id="subCategory" name="idSubCategory">--%>
            <%--<option value="${NULL}" >Select SubCategory</option>--%>
            <%--<c:forEach var="subCategory" items="${subCategory}">--%>
                <%--<option value="${subCategory.id}" >${subCategory.name}</option>--%>
            <%--</c:forEach>--%>
        <%--</select>--%>
        <%--<select id="brand" name="idBrand">--%>
            <%--<option value="${NULL}" >Select Brand</option>--%>
            <%--<c:forEach var="brand" items="${brands}">--%>
                <%--<option value="${brand.id}">${brand.name}</option>--%>
            <%--</c:forEach>--%>
        <%--</select>--%>
        <%--<input type="file" id="img" name="picture" >--%>
        <%--<input type="submit">--%>
        <%--&lt;%&ndash;<input type="button" value="Save goods" onclick="saveGoods()" id="sub">&ndash;%&gt;--%>
    <%--</form>--%>

    <%--<c:forEach var="goods" items="${goods}">--%>
        <%--<table>--%>
            <%--<tr>--%>
                <%--<td>${goods.name}</td>--%>
                <%--<td>${goods.goodsCode}</td>--%>
            <%--</tr>--%>
        <%--</table>--%>
    <%--</c:forEach>--%>

    <form>
        Додати категорію
        <input type="text" id="nameCategory">
        <input type="button" value="Save goods" onclick="saveCategory()" id="sub1">
    </form>
    <form>
        Додати підкатегорію
        <select id="category1">
            <c:forEach var="category" items="${categories}">
                <option value="${category.id}" >${category.name}</option>
            </c:forEach>
        </select>
        <input type="text" id="nameSubCategory">
        <input type="button" value="Save goods" onclick="saveSubCategory()" id="sub2">
    </form>
    <form>
        Додати бренд
        <input type="text" id="nameBrand">
        <input type="button" value="Save goods" onclick="saveBrand()" id="sub3">

    </form>
    <%--<form method="post" action="/add/goods" enctype="multipart/form-data" >--%>
        <%--<input type="text" name="name">--%>
        <%--<input type="text" name="goodsCode">--%>
        <%--<select id="categoryForSort" >--%>
            <%--<option value="${NULL}" > Select Category</option>--%>
            <%--<c:forEach var="category" items="${categories}">--%>
                <%--<option value="${category.id}" >${category.name}</option>--%>
            <%--</c:forEach>--%>
        <%--</select>--%>
        <%--<select  id="subCategory" name="idSubCategory">--%>
            <%--<option value="${NULL}" >Select SubCategory</option>--%>
            <%--<c:forEach var="subCategory" items="${subCategory}">--%>
                <%--<option value="${subCategory.id}" >${subCategory.name}</option>--%>
            <%--</c:forEach>--%>
        <%--</select>--%>
        <%--<select id="brand" name="idBrand">--%>
            <%--<option value="${NULL}" >Select Brand</option>--%>
            <%--<c:forEach var="brand" items="${brands}">--%>
                <%--<option value="${brand.id}">${brand.name}</option>--%>
            <%--</c:forEach>--%>
        <%--</select>--%>
        <%--<input type="file" name="image">--%>
        <%--<input type="submit"  value="test">--%>
    <%--</form>--%>

    <form method="post" id="fuck" enctype="multipart/form-data" >
        <input type="text" name="name" id="name">
        <input type="text" name="goodsCode" id="goodsCode">
        <select id="categoryForSort" >
            <option value="${NULL}" > Select Category</option>
            <c:forEach var="category" items="${categories}">
            <option value="${category.id}" >${category.name}</option>
            </c:forEach>
        </select>
        <select  id="subCategory" name="idSubCategory">
            <option value="${NULL}" >Select SubCategory</option>
            <c:forEach var="subCategory" items="${subCategory}">
            <option value="${subCategory.id}" >${subCategory.name}</option>
            </c:forEach>
        </select>
        <select id="brand" name="idBrand">
            <option value="${NULL}" >Select Brand</option>
            <c:forEach var="brand" items="${brands}">
            <option value="${brand.id}">${brand.name}</option>
            </c:forEach>
        </select>
        <input type="file" name="image" id="image">
        <input type="button" id="fuck1">
    </form>

        <script>
            $('#fuck1').click(function  () {
                var file = document.getElementById("image");
                xhr = new XMLHttpRequest();
                form = new FormData();
                var upload_file=file.files[0];
//                var name = document.getElementById("name");
//                console.log(name);
//                var goods={
//                    name: $('#name').val()
//                };
                form.append("mul",upload_file);
                form.append("name",$('#name').val());
                form.append("code",$('#goodsCode').val());
                form.append("idSubCategory",$('#subCategory').val());
                form.append("idBrand",$('#brand').val());
//                form.append("goods",goods);
                xhr.open("post","/test/img",true);
                xhr.send(form);


                //var reader = new FileReader();
//                var file = document.querySelector('input[type=file]').files[0];
//                reader.onload = function (e) {
////                    var img = document.createElement("img")
////                    img.src=reader.result;
////                    document.body.appendChild(img);
//                    console.log(reader.result);
//
//                };
//
//
//                reader.readAsBinaryString(file);
//                var fb = new FormData('file',$('#image').files);
//                console.log(fb.get().url);
//                $.ajax({
//                    url: '/test/img',
//                    data: fb,
//                    type: 'POST',
//                    processData: false,
//                    contentType: false
//                });


//                var data = $('#fuck').serialize();
//
////                console.log(data);
////                console.log(encodeURIComponent($('#image').val()));
//                $.ajax({
//                    type: 'POST',
//                    data: data+'&image='+encodeURIComponent($('#image').val()),
//                    url: '/add/goods'
//                });
//                return false;
//            })
//            function saveGoods(){
//                var form = $('#formForGoods').serializeArray();
//                $.ajax({
//                    type: 'POST',
//                    data: form,
//                    url: '/add/goods'
//                });
//
////
//                var goods={
//                    name: $('#name').val(),
//                    goodsCode: $('#goodsCode').val(),
//                    idSubCategory :$('#subCategory').val(),
//                    idBrand :$('#brand').val()
//                };
//                $.ajax({
//                    url: '/add/goods',
//                    type: 'POST',
//                    contentType: 'application/json',
//                    data: JSON.stringify(goods),
//                    dataType: 'json'
//                });
            });
            function saveSubCategory() {
                var subCategory={
                    idCategory: $('#category1').val(),
                    name: $('#nameSubCategory').val()
                };

                $.ajax({
                    url: '/add/subcategory',
                    type: 'POST',
                    contentType: 'application/json',
                    data: JSON.stringify(subCategory),
                    dataType: 'json'
                });
                $('#nameSubCategory').val('');

            }

            function saveCategory() {
                var category= {
                    name: $('#nameCategory').val()
                };

                $.ajax({
                    url: '/add/category',
                    type: 'POST',
                    contentType: 'application/json',
                    data: JSON.stringify(category),
                    dataType: 'json'
                });
                $('#nameCategory').val('');
            }
            function saveBrand() {
                var brand={
                    name: $('#nameBrand').val()
                };
                $.ajax({
                    url: '/add/brand',
                    type: 'POST',
                    contentType: 'application/json',
                    data: JSON.stringify(brand),
                    dataType: 'json'
                });
                $('#nameBrand').val('');

            }
            $('#categoryForSort').change(
                    function () {
                        var categoryId = ($(this).val());
                        $.ajax({
                            url: '/subCategory/' + categoryId + ".json",
                            success: function (data) {
                                $('#subCategory').empty()

                                for (var i = 0; i < data.length; i++) {
                                    $('#subCategory').append(
                                            $('<option/>', {
                                                value: data[i].id,
                                                text: data[i].name
                                            }));
                                }
                            }
                        });
                    });


        </script>
    </body>
</html>