package com.tester.project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
    @RequestMapping("/")
    public String hello() {
        return """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>Portofolio</title>
                    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
                    <!-- CSS terintegrasi COPYan dari file style2.css -->
                    <style>
                        *{
                            margin: 0;
                            padding: 0;
                            box-sizing: border-box;
                            font-family: Arial, Helvetica, sans-serif;
                        }

                        html{
                            scroll-behavior: smooth;
                        }

                        body{
                            background-color: #0d1117;
                            color: aliceblue;
                        }

                        nav{
                            background-color: #161b22;
                            padding: 1.5rem 3.5rem;
                            display: flex;
                            justify-content: space-between;
                            align-items: center;
                            position: sticky;
                            top: 0;
                            z-index: 0;
                        }

                        .nav-left .logo{
                            font-size: 1.7rem;
                            color: #58a6ff;
                            font-weight: bold;
                            text-transform: uppercase;
                        }

                        .nav-right{
                            display: flex;
                            gap: 1.7rem;
                        }

                        .nav-right li{
                            list-style: none;
                        }

                        .nav-right li a{
                            color: #f0f6fc;
                            text-decoration: none;
                            font-size: 1.2rem;
                            transition: color 0.5s;
                        }

                        .nav-right li a:hover{
                            color: #58a6ff;
                        }

                        .hero{
                            display: flex;
                            align-items: center;
                            justify-content: center;
                            padding: 6rem 2rem;
                            min-height: 90vh;
                            background: linear-gradient(135deg, #1f2a48 0%, #0d1117 100%);
                        }

                        .hero-content{
                            display: flex;
                            align-items: center;
                            justify-content: space-between;
                            max-width: 1200px;
                            width: 100%;
                            flex-wrap: wrap;
                        }

                        .hero-text{
                            flex: 1;
                            max-width: 50%;
                            padding-right: 3rem;
                            animation: fadeIn 1s ease-in-out;
                        }

                        .hero-image{
                            flex: 1;
                            display: flex;
                            justify-content: center;
                            animation: fadeIn 1s ease-in-out;
                        }

                        .profile-img{
                            width: 280px;
                            height: 280px;
                            border-radius: 50%;
                            object-fit: cover;
                            box-shadow: 0 10px 30 px rgba(0, 0, 0, 5);
                            transition: transform 0.3s ease;
                        }

                        .profile-img:hover{
                            transform: scale(1.1);
                        }

                        .hero h1{
                            font-size: 3rem;
                            color: #58a6ff;
                            margin-bottom: 0.5rem;
                            text-shadow: 2px 2px 5px rgba(0, 0, 0, 5);
                        }

                        .hero h2{
                            font-size: 1.8rem;
                            color: #f0f6fc;
                            font-weight: 300;
                            text-shadow: 2px 2px 3px rgba(0, 0, 0, 3);
                        }

                        .description{
                            margin-top: 1rem;
                            font-size: 1.2rem;
                            color: #b0c4de;
                            text-shadow: 1px 1px 3px rgba(0, 0, 0, 3);
                        }

                        .typing-animation{
                            display: inline-block;
                            border-right: 2px solid #58a6ff;
                            white-space: nowrap;
                            overflow: hidden;
                            animation: typing 4s steps(40, end), blink-caret 0.75s step-end infinite;
                        }

                        @keyframes typing{
                            0% {width: 0;}
                            100% {width: 100%;}
                        }

                        @keyframes blink-caret{
                            50% {border-color: transparent;}
                        }

                        .social-media{
                            margin-top: 1.5rem;
                            display: flex;
                            gap: 1.2rem;
                        }

                        .social-icon{
                            font-size: 2rem;
                            color: #58a6ff;
                            text-decoration: none;
                            transition: color 0.5s;
                        }

                        .social-icon:hover{
                            color: #1f6feb;
                        }

                        .vertical-divider{
                            width: 1px;
                            height: 300px;
                            background-color: #58a6ff;
                            opacity: 0.5;
                            margin: 0 2rem;
                        }

                        @keyframes fadeIn{
                            0% {opacity: 0; transform: translateY(20px);}
                            100% {opacity: 1; transform: translateY(0);}
                        }

                        @media (max-width: 768px){
                            .nav-right{
                                display: none;
                            }

                            .hero-text{
                                max-width: 100%;
                                padding-right: 0;
                            }

                            .vertical-divider{
                                display: none;
                            }

                            .hero-image{
                                margin-top: 1rem;
                            }

                            .profile-img{
                                width: 200px;
                                height: 200px;
                            }

                            .social-media{
                                justify-content: center;
                            }

                            .hero h1{
                                font-size: 2.5rem;
                            }

                            .hero h2{
                                font-size: 1.5rem;
                            }

                            .description{
                                font-size: 1rem;
                            }
                        }
                            .portfolio {
                            background-color: #161b22;
                            color: #f0f6fc;
                            padding: 3rem 2rem;
                            margin: 2rem auto;
                            border-radius: 10px;
                            max-width: 900px;
                            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.5);
                        }

                        .portfolio-container {
                            text-align: center;
                        }

                        .portfolio-header {
                            margin-bottom: 2rem;
                        }

                        .portfolio-header h2 {
                            font-size: 1.8rem;
                            color: #58a6ff;
                            margin-bottom: 0.5rem;
                        }

                        .portfolio-header p {
                            font-size: 1rem;
                            color: #b0c4de;
                        }

                        .portfolio-body {
                            text-align: left;
                            padding: 1rem 2rem;
                        }

                        .portfolio-body h3 {
                            font-size: 1.5rem;
                            color: #58a6ff;
                            margin-bottom: 1rem;
                        }

                        .portfolio-body ul {
                            list-style: none;
                            padding-left: 0;
                            margin-bottom: 1.5rem;
                        }

                        .portfolio-body ul li {
                            font-size: 1rem;
                            color: #b0c4de;
                            margin-bottom: 0.5rem;
                        }

                        .portfolio-body ul li strong {
                            color: #f0f6fc;
                        }

                        @media (max-width: 768px) {
                            .portfolio-body {
                                padding: 1rem;
                            }
                        }
                        .contact-section {
                            padding: 4rem 2rem;
                            text-align: center;
                            background: linear-gradient(135deg, #0d1117 0%, #161b22 100%);
                            color: aliceblue;
                            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
                            margin-top: 2rem;
                        }

                        .contact-section h2 {
                            font-size: 2.5rem;
                            color: #58a6ff;
                            margin-bottom: 1rem;
                        }

                        .contact-section p {
                            font-size: 1.2rem;
                            margin-bottom: 2rem;
                            color: #b0c4de;
                        }

                        .contact-buttons {
                            display: flex;
                            justify-content: center;
                            gap: 1.5rem;
                            flex-wrap: wrap;
                        }

                        .contact-button {
                            display: inline-flex;
                            align-items: center;
                            gap: 0.5rem;
                            font-size: 1.2rem;
                            color: #f0f6fc;
                            text-decoration: none;
                            padding: 0.8rem 1.5rem;
                            border-radius: 5px;
                            transition: background-color 0.3s ease, transform 0.2s ease;
                            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.2);
                        }

                        .contact-button.whatsapp {
                            background-color: #25D366; /* Warna khas WhatsApp */
                        }

                        .contact-button.email {
                            background-color: #0078D4; /* Warna khas email */
                        }

                        .contact-button:hover {
                            transform: scale(1.05);
                            background-color: #1f6feb;
                        }

                    </style>
                </head>
                <body>
                    <!-- Navbar -->
                    <nav>
                        <div class="nav-left">
                            <span class="logo">My Personal Website</span>
                        </div>
                        <ul class="nav-right">
                            <li><a href="#">Home</a></li>
                            <li><a href="#social-media">Portofolio</a></li>
                            <li><a href="#contact">Contact</a></li>
                        </ul>
                    </nav>

                    <section id="home" class="hero">
                        <div class="hero-content">
                            <div class="hero-text">
                                <h1>Hello, I'm <span class="name">Rei Raka</span></h1>
                                <h2 class="typing-animation">A Web developer</h2>
                                <p class="description">Saya adalah seorang pemula di bidang web development yang sedang mempelajari dan mengembangkan keterampilan dalam membangun website modern dan responsif. Saat ini, saya fokus untuk memahami teknologi dasar seperti HTML dan CSS serta terus mengeksplorasi cara terbaik untuk menciptakan antarmuka pengguna yang menarik.</p>
                                <div class="social-media" id="social-media">
                                    </a>
                                    <a href="https://www.instagram.com/coyoteloveux_r/profilecard/?igsh=N2ltcm11MWxheW9v" class="social-icon">
                                        <i class="fab fa-instagram"></i>
                                    </a>
                                    <a href="https://github.com/reiraka" class="social-icon">
                                        <i class="fab fa-github"></i>
                                    </a>
                                </div>
                            </div>
                            <div class="vertical-divider"></div>
                            <div class="hero-image">
                                <img src="rey1.jpeg" alt="profile image" class="profile-img">
                            </div>
                        </div>
                    </section>
                    <section id="portfolio" class="portfolio">
                        <div class="portfolio-container">
                            <div class="portfolio-header">
                                <h2>Rei Raka</h2>
                            </div>
                            <div class="portfolio-body">
                                <h3>Informasi Pribadi</h3>
                                <ul>
                                    <li><strong>Nama Lengkap:</strong>Rei Raka/li>
                                    <li><strong>Tempat, Tanggal Lahir:</strong> Banyumas, 09 Desember 2001</li>
                                    <li><strong>Alamat:</strong>kab.Banyumas,Kec.Patikraja,Desa,Karangandep</li>
                                    <li><strong>Email:</strong> reiraka4@gmail.com</li>
                                    <li><strong>No. Telepon:</strong> +62 895 2624 4366</li>
                                </ul>
                                <h3>Riwayat Pendidikan</h3>
                                <ul>
                                    <li><strong>2023 - Sekarang:</strong> Teknik Informatika, Universitas Nahdlatul Ulama Indonesia</li>
                                    <li><strong>2019 - 2022:</strong> MA AL IKHSAN</li>
                                    <li><strong>2016 - 2019:</strong> SMP MA Arief NU 1 Patikraja</li>
                                </ul>
                                <h3>Keahlian</h3>
                                <ul>
                                    <li><strong>Programming:</strong> Java, Python, JavaScript</li>
                                </ul>
                            </div>
                        </div>
                    </section>
                    <!-- Bagian Contact -->
                    <section id="contact" class="contact-section">
                        <h2>Contact Me</h2>
                        <p>Ingin terhubung dengan saya? Klik tombol di bawah untuk mengirim pesan via WhatsApp atau email.</p>
                        
                        <div class="contact-buttons">
                            <a href="https://wa.me/qr/HRQHQZFVKK6MB1" target="_blank" class="contact-button whatsapp">
                                <i class="fab fa-whatsapp"></i> Hubungi via WhatsApp
                            </a>
                            <a href="mailto:reiraka4@gmail.com" target="_blank" class="contact-button email">
                                <i class="fas fa-envelope"></i> Hubungi via Email
                            </a>
                        </div>
                    </section>
                </body>
                </html>
                """;
    }
}