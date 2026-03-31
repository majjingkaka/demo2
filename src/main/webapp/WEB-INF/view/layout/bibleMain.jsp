<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Soulinku 성경 사이트</title>

<style>
    body {
        margin: 0;
        font-family: 'Noto Sans KR', sans-serif;
        background: #f5f7fb;
        text-align: center;
    }

    .container {
        max-width: 800px;
        margin: 0 auto;
        padding: 20px;
    }

    /* 상단 비주얼 */
    .hero {
        margin-top: 20px;
    }

    .hero img {
        width: 100%;
        max-width: 500px;
    }

    .title {
        font-size: 24px;
        margin: 20px 0;
        font-weight: bold;
    }

    /* 메뉴 */
    .menu {
        display: flex;
        flex-direction: column;
        gap: 15px;
        margin-top: 20px;
    }

    .menu-item {
        background: white;
        padding: 15px;
        border-radius: 15px;
        font-size: 18px;
        font-weight: 500;
        border: 2px solid #ddd;
        cursor: pointer;
        transition: all 0.2s ease;
    }

    .menu-item:hover {
        background: #fffae6;
        transform: translateY(-3px);
        border-color: #ffd54f;
    }

    /* 아이콘 */
    .menu-item span {
        margin-right: 8px;
    }

</style>
</head>

<body>

<div class="container">

    <!-- 귀여운 메인 이미지 -->
    <!-- <div class="hero">
        <img src="https://cdn-icons-png.flaticon.com/512/3135/3135715.png" alt="귀여운 성경 이미지">
    </div> -->

    <div class="title">📖 말씀과 함께하는 하루</div>

    <!-- 메뉴 -->
    <div class="menu">
        <div class="menu-item">🔍 말씀 찾기</div>
        <div class="menu-item">🎵 찬송가</div>
        <div class="menu-item">📢 광고</div>
        <div class="menu-item">🙏 오늘의 말씀</div>
        <div class="menu-item">❤️ 즐겨찾기</div>
        <div class="menu-item">⚙ 설정</div>
    </div>

</div>

</body>
</html>











