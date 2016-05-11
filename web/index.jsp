<%@ page import="java.util.List" %>
<%@ page import="ma.ensa.Model.Entity.Category" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="ma.ensa.Model.Dao.CategoryDao" %><%--
  Created by IntelliJ IDEA.
  User: Azedine
  Date: 25/04/2016
  Time: 12:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html>
<head>
    <title>Mes Cours </title>

    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
    <link rel="stylesheet" href="assets/css/main.css" />
    <!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
    <!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
</head>
<body>

<!-- Wrapper -->
<div id="wrapper">

    <!-- Header -->
    <header id="header">
        <div class="inner">

            <!-- Logo -->
            <!--<a href="index.html" class="logo">
                <span class="symbol"><img src="images/logo.svg" alt="" /></span><span class="title">Phantom</span>
            </a> -->

            <!-- Nav -->
            <nav>
                <ul>
                    <li><a href="#menu">Category</a></li>
                </ul>
            </nav>

        </div>
    </header>

    <!-- Menu -->
    <nav id="menu">
        <h2>Category</h2>
        <ul>
            <%
                List<Category> cat=new ArrayList<>();
                CategoryDao catdao= new CategoryDao();
                cat=catdao.findAll();
                for (int i=0 ;i<cat.size() ;i++){
                    out.println("<li><a href=\"index.html\">" +cat.get(i).getNom()+"</a></li>");
                }

          %>

        </ul>
    </nav>

    <!-- Main -->
    <div id="main">
        <div class="inner">
            <header>
                <!--<h1>This is Phantom, a free, fully responsive site<br />
                template designed by <a href="http://html5up.net">HTML5 UP</a>.</h1>
                <p>Etiam quis viverra lorem, in semper lorem. Sed nisl arcu euismod sit amet nisi euismod sed cursus arcu elementum ipsum arcu vivamus quis venenatis orci lorem ipsum et magna feugiat veroeros aliquam. Lorem ipsum dolor sit amet nullam dolore.</p> -->
            </header>
            <section class="tiles">
                <article class="style1">
									<span class="image">
										<img src="images/html-css.jpg" alt="" />
									</span>
                    <a href="generic.html">
                        <h2>HTML & CSS </h2>
                        <div class="content">
                            <p>Apprendre a codé HTML et CSS
                            </p> </br>
                            <p color:"green"> 5.00$</p>
                        </div>
                    </a>
                </article>
                <article class="style2">
									<span class="image">
										<img src="images/pic02.jpg" alt="" />
									</span>
                    <a href="generic.html">
                        <h2>Lorem</h2>
                        <div class="content">
                            <p>Sed nisl arcu euismod sit amet nisi lorem etiam dolor veroeros et feugiat.</p>
                        </div>
                    </a>
                </article>
                <article class="style3">
									<span class="image">
										<img src="images/pic03.jpg" alt="" />
									</span>
                    <a href="generic.html">
                        <h2>Feugiat</h2>
                        <div class="content">
                            <p>Sed nisl arcu euismod sit amet nisi lorem etiam dolor veroeros et feugiat.</p>
                        </div>
                    </a>
                </article>
                <article class="style4">
									<span class="image">
										<img src="images/pic04.jpg" alt="" />
									</span>
                    <a href="generic.html">
                        <h2>Tempus</h2>
                        <div class="content">
                            <p>Sed nisl arcu euismod sit amet nisi lorem etiam dolor veroeros et feugiat.</p>
                        </div>
                    </a>
                </article>
                <article class="style5">
									<span class="image">
										<img src="images/pic05.jpg" alt="" />
									</span>
                    <a href="generic.html">
                        <h2>Aliquam</h2>
                        <div class="content">
                            <p>Sed nisl arcu euismod sit amet nisi lorem etiam dolor veroeros et feugiat.</p>
                        </div>
                    </a>
                </article>
                <article class="style6">
									<span class="image">
										<img src="images/pic06.jpg" alt="" />
									</span>
                    <a href="generic.html">
                        <h2>Veroeros</h2>
                        <div class="content">
                            <p>Sed nisl arcu euismod sit amet nisi lorem etiam dolor veroeros et feugiat.</p>
                        </div>
                    </a>
                </article>
                <article class="style2">
									<span class="image">
										<img src="images/pic07.jpg" alt="" />
									</span>
                    <a href="generic.html">
                        <h2>Ipsum</h2>
                        <div class="content">
                            <p>Sed nisl arcu euismod sit amet nisi lorem etiam dolor veroeros et feugiat.</p>
                        </div>
                    </a>
                </article>
                <article class="style3">
									<span class="image">
										<img src="images/pic08.jpg" alt="" />
									</span>
                    <a href="generic.html">
                        <h2>Dolor</h2>
                        <div class="content">
                            <p>Sed nisl arcu euismod sit amet nisi lorem etiam dolor veroeros et feugiat.</p>
                        </div>
                    </a>
                </article>
                <article class="style1">
									<span class="image">
										<img src="images/pic09.jpg" alt="" />
									</span>
                    <a href="generic.html">
                        <h2>Nullam</h2>
                        <div class="content">
                            <p>Sed nisl arcu euismod sit amet nisi lorem etiam dolor veroeros et feugiat.</p>
                        </div>
                    </a>
                </article>
                <article class="style5">
									<span class="image">
										<img src="images/pic10.jpg" alt="" />
									</span>
                    <a href="generic.html">
                        <h2>Ultricies</h2>
                        <div class="content">
                            <p>Sed nisl arcu euismod sit amet nisi lorem etiam dolor veroeros et feugiat.</p>
                        </div>
                    </a>
                </article>
                <article class="style6">
									<span class="image">
										<img src="images/pic11.jpg" alt="" />
									</span>
                    <a href="generic.html">
                        <h2>Dictum</h2>
                        <div class="content">
                            <p>Sed nisl arcu euismod sit amet nisi lorem etiam dolor veroeros et feugiat.</p>
                        </div>
                    </a>
                </article>
                <article class="style4">
									<span class="image">
										<img src="images/pic12.jpg" alt="" />
									</span>
                    <a href="generic.html">
                        <h2>Pretium</h2>
                        <div class="content">
                            <p>Sed nisl arcu euismod sit amet nisi lorem etiam dolor veroeros et feugiat.</p>
                        </div>
                    </a>
                </article>
            </section>
        </div>
    </div>

    <!-- Footer -->
    <!--<footer id="footer">
        <div class="inner">
            <section>
                <h2>Get in touch</h2>
                <form method="post" action="#">
                    <div class="field half first">
                        <input type="text" name="name" id="name" placeholder="Name" />
                    </div>
                    <div class="field half">
                        <input type="email" name="email" id="email" placeholder="Email" />
                    </div>
                    <div class="field">
                        <textarea name="message" id="message" placeholder="Message"></textarea>
                    </div>
                    <ul class="actions">
                        <li><input type="submit" value="Send" class="special" /></li>
                    </ul>
                </form>
            </section>
            <section>
                <h2>Follow</h2>
                <ul class="icons">
                    <li><a href="#" class="icon style2 fa-twitter"><span class="label">Twitter</span></a></li>
                    <li><a href="#" class="icon style2 fa-facebook"><span class="label">Facebook</span></a></li>
                    <li><a href="#" class="icon style2 fa-instagram"><span class="label">Instagram</span></a></li>
                    <li><a href="#" class="icon style2 fa-dribbble"><span class="label">Dribbble</span></a></li>
                    <li><a href="#" class="icon style2 fa-github"><span class="label">GitHub</span></a></li>
                    <li><a href="#" class="icon style2 fa-500px"><span class="label">500px</span></a></li>
                    <li><a href="#" class="icon style2 fa-phone"><span class="label">Phone</span></a></li>
                    <li><a href="#" class="icon style2 fa-envelope-o"><span class="label">Email</span></a></li>
                </ul>
            </section>
            <ul class="copyright">
                <li>&copy;All rights reserved</li><li>Azedine_Berramou</li>
            </ul>
        </div>
    </footer>

</div>-->

    <!-- Scripts -->
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/js/skel.min.js"></script>
    <script src="assets/js/util.js"></script>
    <!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
    <script src="assets/js/main.js"></script>


</body>
</html>
