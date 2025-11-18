# 🚀 Live Demo Setup Guide for HealthWave

This guide explains how to create a live demo for your Android app on GitHub.

## 📱 Live Demo Options for Android Apps

GitHub doesn't run Android apps directly in the browser, but here are the best options for creating a "live demo":

---

## ✨ Option 1: GitHub Releases with APK (Recommended)

This allows users to download and install your app directly from GitHub.

### Steps:

1. **Build Your APK**
   - Open project in Android Studio
   - Go to `Build` → `Build Bundle(s) / APK(s)` → `Build APK(s)`
   - Find APK at: `app/build/outputs/apk/debug/app-debug.apk`

2. **Create a GitHub Release**
   - Go to: https://github.com/OfteaHeat1997/Healthwave-doctor-on-demands/releases
   - Click **"Create a new release"**
   - Tag: `v1.0.0`
   - Title: `HealthWave v1.0 - Initial Release`
   - Description:
     ```markdown
     ## 🏥 HealthWave - Doctor on Demand v1.0

     ### 📥 Download & Install
     Download the APK below and install on your Android device (API 21+)

     ### ✨ Features
     - AI-Powered Medical Assistant
     - Virtual Consultations
     - Video/Voice Calling
     - Appointment Booking
     - Doctor Directory

     ### 🎬 Demo
     [Video Demo](https://drive.google.com/file/d/1JaGpyMhlHL99d8MiC5hP43TxXKyg3KQo/view?usp=drive_link)
     [Screenshots](https://ibb.co/album/Wntsnd)
     ```
   - Drag and drop `app-debug.apk` to attach it
   - Click **"Publish release"**

3. **Update README Badge**
   Add to your README:
   ```markdown
   [![Download APK](https://img.shields.io/badge/Download-APK-brightgreen)](https://github.com/OfteaHeat1997/Healthwave-doctor-on-demands/releases/latest)
   ```

---

## 🌐 Option 2: Appetize.io (Browser-Based Demo)

Run your Android app directly in a web browser!

### Steps:

1. **Sign Up for Appetize.io**
   - Go to: https://appetize.io/
   - Create a free account
   - Free tier: 100 minutes/month

2. **Upload Your APK**
   - Click **"Upload App"**
   - Upload `app-debug.apk`
   - Wait for processing (2-3 minutes)

3. **Get Embed Link**
   - Copy the public link (e.g., `https://appetize.io/app/your-app-id`)
   - Add to your README:
     ```markdown
     ## 🎮 Try Live Demo

     [![Run in Browser](https://img.shields.io/badge/Try-Live%20Demo-blue)](https://appetize.io/app/your-app-id)

     <iframe src="https://appetize.io/embed/your-app-id"
             width="378px" height="800px" frameborder="0" scrolling="no"></iframe>
     ```

4. **Embed in GitHub Pages** (Optional)
   - Create `docs/index.html`:
     ```html
     <!DOCTYPE html>
     <html>
     <head>
         <title>HealthWave Live Demo</title>
     </head>
     <body>
         <h1>HealthWave - Live Demo</h1>
         <iframe src="https://appetize.io/embed/your-app-id"
                 width="378px" height="800px" frameborder="0"></iframe>
     </body>
     </html>
     ```
   - Enable GitHub Pages in repository settings
   - Access at: `https://ofteaheat1997.github.io/Healthwave-doctor-on-demands/`

---

## 📹 Option 3: Video Demo (Current Setup - Already Done!)

You already have this set up! ✅

Your README already links to:
- **Video Demo:** https://drive.google.com/file/d/1JaGpyMhlHL99d8MiC5hP43TxXKyg3KQo/view
- **Screenshots:** https://ibb.co/album/Wntsnd
- **Figma Design:** https://www.figma.com/file/yiRaGYam0IdMIutolVoG1t/Doctor-Demand

This is perfect for presentations and portfolios!

---

## 🎯 Option 4: QR Code for Direct Download

Generate a QR code for easy mobile access:

### Steps:

1. **Upload APK to Cloud Storage**
   - Upload to Google Drive, Dropbox, or GitHub Releases
   - Get shareable link

2. **Generate QR Code**
   - Go to: https://www.qr-code-generator.com/
   - Paste your APK download link
   - Download QR code image

3. **Add to README**
   ```markdown
   ## 📱 Quick Install via QR Code

   Scan with your Android device to download:

   ![QR Code](./docs/qr-code.png)
   ```

---

## 🏆 Recommended Setup for Your Project

For the best demo experience, I recommend combining:

### 1. **GitHub Release with APK** (Primary)
   - Easy download for reviewers
   - Professional presentation
   - Version control

### 2. **Video Demo** (Already Done ✅)
   - Shows app in action
   - Great for portfolios
   - No installation required

### 3. **Appetize.io** (Optional - For "Try Now")
   - Interactive browser demo
   - Impressive for live presentations
   - No device needed

---

## 📝 Quick Start Checklist

- [ ] Build APK in Android Studio
- [ ] Create GitHub Release
- [ ] Upload APK to release
- [ ] Test download and installation
- [ ] Add download badge to README
- [ ] (Optional) Set up Appetize.io
- [ ] (Optional) Generate QR code

---

## 🔗 Useful Links

- **Your Repository:** https://github.com/OfteaHeat1997/Healthwave-doctor-on-demands
- **Releases Page:** https://github.com/OfteaHeat1997/Healthwave-doctor-on-demands/releases
- **Appetize.io:** https://appetize.io/
- **QR Code Generator:** https://www.qr-code-generator.com/

---

## 💡 Tips for Presentations

1. **Show the video first** - Gives overview
2. **Show GitHub repo** - Demonstrates code quality
3. **Show live demo** - Interactive experience
4. **Provide APK link** - Let reviewers try it themselves

---

## 🆘 Need Help?

If you need help with any step:
1. Check Android Studio documentation
2. Review Appetize.io guides
3. Ask your instructor or team members

Good luck with your presentation! 🚀
