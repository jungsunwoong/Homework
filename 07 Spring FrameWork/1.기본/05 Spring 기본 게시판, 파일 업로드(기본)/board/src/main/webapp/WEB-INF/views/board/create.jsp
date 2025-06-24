<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<%@include file="../layouts/header.jsp"%>
    <form method="post" enctype="multipart/form-data">
        <div>
            <label>제목</label>
            <input name="title" class="form-control">
        </div>
        <div>
            <label>작성자</label>
            <input name="writer" class="form-control">
        </div>
        <div>
            <label>첨부파일</label>
            <input type="file" class="form-control-file border" multiple name="files"/>
        </div>
        <div>
            <label>내용</label>
            <textarea class="form-control" name="content" rows="10"></textarea>
        </div>

<%@include file="../layouts/footer.jsp"%>