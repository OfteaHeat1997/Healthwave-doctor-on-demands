# 🏥 HealthWave - Doctor on Demand

<div align="center">

**Bridging Healthcare Accessibility in Developing Countries**

[![Android](https://img.shields.io/badge/Platform-Android-green.svg)](https://developer.android.com/)
[![Kotlin](https://img.shields.io/badge/Language-Kotlin-blue.svg)](https://kotlinlang.org/)
[![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg)](https://android-arsenal.com/api?level=21)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

</div>

---

## 📖 About The Project

HealthWave is a mobile healthcare platform designed to provide accessible medical care to people in developing countries. The application combines telemedicine capabilities with AI-powered medical assistance to bridge the gap between patients and healthcare professionals in underserved communities.

In many parts of the world, accessing quality healthcare is challenging due to limited medical resources, long travel distances, and lack of infrastructure. HealthWave addresses these challenges by offering:

- **Virtual Consultations** - Connect with doctors remotely through video/voice calls
- **AI Medical Assistant** - Get instant answers to basic medical questions using OpenAI's GPT technology
- **Smart Appointment Booking** - Schedule consultations with specialists at your convenience
- **Doctor Directory** - Browse doctors by specialty (Cardiology, Pulmonology, Gynecology, etc.)
- **Symptom Analysis** - Preliminary diagnosis assistance through AI-powered symptom checker

---

## ✨ Features

### 🏠 Home Dashboard
- Intuitive interface with quick access buttons
- Bottom navigation for seamless app navigation
- Real-time notifications and alerts

### 🤖 AI-Powered Medical Bot
- Natural language understanding for health questions
- Powered by OpenAI's GPT-3.5 (text-davinci-003)
- Provides informative responses to common medical queries
- Instant medical guidance 24/7

### 👨‍⚕️ Virtual Consultations
- Browse doctors by medical specialty
- View doctor profiles and availability
- Specialty categories:
  - Cardiology (Heart specialists)
  - Pulmonology (Lung specialists)
  - Gynecology (Women's health)
  - And more...

### 📅 Smart Appointment Booking
- Interactive date and time picker
- Instant booking confirmation
- Appointment management system

### 📞 Video/Voice Calling
- High-quality video consultations powered by Zego Cloud
- Voice call option for limited bandwidth
- Real-time communication with medical professionals

### 🩺 Disease Diagnosis Assistant
- Symptom-based preliminary diagnosis
- Links directly to appointment booking
- Educational health information

### 👤 User Profile Management
- Personal health records
- Appointment history
- Profile customization

---

## 🛠️ Technology Stack

### Core Technologies
- **Language:** Kotlin 1.9.0
- **Platform:** Android (minSdk: 21, targetSdk: 34)
- **Build System:** Gradle 8.0

### Frameworks & Libraries

| Category | Technology | Version |
|----------|-----------|---------|
| **UI Framework** | AndroidX Core | 1.12.0 |
| **UI Components** | Material Design | 1.9.0 |
| **Layout** | ConstraintLayout | 2.1.4 |
| **Video/Voice Calls** | Zego Cloud UIKit | Latest |
| **Call Signaling** | Zego Signaling Plugin | Latest |
| **HTTP Client** | OkHttp3 | 4.10.0 |
| **AI Integration** | OpenAI GPT-3.5 API | text-davinci-003 |
| **Testing** | JUnit | 4.13.2 |
| **UI Testing** | Espresso | 3.5.1 |

---

## 🎬 Live Demo

### 📱 Download & Try the App

Want to try HealthWave on your Android device?

**[📥 Download APK from Releases](https://github.com/OfteaHeat1997/Healthwave-doctor-on-demands/releases)**

**Installation Instructions:**
1. Download the latest APK from the releases page
2. Enable "Install from Unknown Sources" on your Android device
3. Open the APK file and tap "Install"
4. Launch HealthWave and explore!

**Minimum Requirements:** Android 5.0 (API 21) or higher

---

### 📹 Video Demo
Watch the full application walkthrough and features demonstration:

**[🎥 View Video Demo](https://drive.google.com/file/d/1JaGpyMhlHL99d8MiC5hP43TxXKyg3KQo/view?usp=drive_link)**

### 📸 Screenshots
Explore the application interface and features:

**[🖼️ View Screenshots Gallery](https://ibb.co/album/Wntsnd)**

### 🎨 Design Files
View the complete UI/UX design on Figma:

**[🎨 Figma Design](https://www.figma.com/file/yiRaGYam0IdMIutolVoG1t/Doctor-Demand?type=design&node-id=0-1&mode=design&t=x8ZkPhoTwRBLmb1R-0)**

### 🌐 Interactive Demo (Coming Soon)
We're working on a browser-based demo using Appetize.io. Stay tuned!

---

## 📱 Installation & Setup

### Prerequisites

Before you begin, ensure you have the following installed:

1. **Android Studio** (Arctic Fox or later)
   - Download from [developer.android.com](https://developer.android.com/studio)

2. **Java Development Kit (JDK) 8 or higher**
   - Download from [Oracle](https://www.oracle.com/java/technologies/javase-downloads.html) or use [OpenJDK](https://openjdk.org/)

3. **Android SDK**
   - API Level 21-34
   - Build Tools 34.0.0
   - Installed via Android Studio SDK Manager

4. **Git**
   - Download from [git-scm.com](https://git-scm.com/)

### Step-by-Step Installation

1. **Clone the Repository**
   ```bash
   git clone https://github.com/OfteaHeat1997/Healthwave-doctor-on-demands.git
   cd Healthwave-doctor-on-demands
   ```

2. **Configure Android SDK**

   Create a `local.properties` file in the root directory:
   ```properties
   sdk.dir=/path/to/your/Android/Sdk
   ```

   **Example paths:**
   - **Windows:** `C:\\Users\\YourName\\AppData\\Local\\Android\\Sdk`
   - **Mac:** `/Users/YourName/Library/Android/sdk`
   - **Linux:** `/home/YourName/Android/Sdk`

3. **Set JAVA_HOME Environment Variable**

   **Windows:**
   ```cmd
   set JAVA_HOME=C:\Program Files\Java\jdk-11.0.x
   set PATH=%JAVA_HOME%\bin;%PATH%
   ```

   **Mac/Linux:**
   ```bash
   export JAVA_HOME=/path/to/jdk
   export PATH=$JAVA_HOME/bin:$PATH
   ```

4. **Sync Gradle Dependencies**

   Open the project in Android Studio and let it sync automatically, or run:
   ```bash
   ./gradlew build
   ```

5. **Run the Application**

   **Option A: Using Android Studio**
   - Click the "Run" button (green triangle)
   - Select your device/emulator

   **Option B: Using Command Line**
   ```bash
   ./gradlew installDebug
   ```

---

## 🚀 Usage

### Running on Emulator

1. Open Android Studio
2. Go to `Tools > Device Manager`
3. Create a new Virtual Device (recommended: Pixel 5, API 30+)
4. Click `Run 'app'` from the toolbar
5. Select your emulator from the device list

### Running on Physical Device

1. Enable **Developer Options** on your Android device:
   - Go to `Settings > About Phone`
   - Tap `Build Number` 7 times

2. Enable **USB Debugging**:
   - Go to `Settings > Developer Options`
   - Toggle on "USB Debugging"

3. Connect device via USB
4. Click `Run 'app'` in Android Studio
5. Select your device from the list

### Building Release APK

To create a production-ready APK:

```bash
./gradlew assembleRelease
```

The APK will be generated at:
```
app/build/outputs/apk/release/app-release.apk
```

---

## 📋 Key Activities & Screens

| Activity | File Path | Purpose |
|----------|-----------|---------|
| **Splash Screen** | `MainActivity.kt` | App entry point with branding |
| **Home Dashboard** | `ActivityHome.kt` | Main navigation hub |
| **AI Medical Bot** | `BotActivity.kt` | Chat interface for medical Q&A |
| **Virtual Consult** | `VirtualConsultActivity.kt` | Browse doctors by specialty |
| **Appointment Booking** | `BookActivity.kt` | Schedule appointments |
| **Video Call** | `VideoActivity.kt` | Video/voice consultations |
| **Disease Diagnosis** | `DeseaseDiagnosisActivity.kt` | Symptom checker |
| **User Profile** | `ProfileActivity.kt` | Profile management |
| **Notifications** | `NotificationActivity.kt` | Alerts and updates |
| **Booking Confirmation** | `BookingcompleteActivity.kt` | Appointment confirmation |

---

## 🔑 API Configuration

### OpenAI API Setup

The AI medical bot uses OpenAI's GPT-3.5 API. To configure:

1. Get an API key from [OpenAI Platform](https://platform.openai.com/)
2. Update `BotActivity.kt` (line ~50):
   ```kotlin
   private const val API_KEY = "your-openai-api-key-here"
   ```

### Zego Cloud Setup

Video/voice calling uses Zego Cloud. To configure:

1. Create account at [Zego Cloud Console](https://console.zegocloud.com/)
2. Create a new project
3. Update `VideoActivity.kt` with your credentials:
   ```kotlin
   val appID: Long = your_app_id
   val appSign: String = "your_app_sign"
   ```

**⚠️ Security Note:** For production, move API keys to environment variables or a secure backend.

---

## 🏗️ Project Structure

```
Healthwave-doctor-on-demands/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/healthwave/
│   │   │   │   ├── MainActivity.kt
│   │   │   │   ├── ActivityHome.kt
│   │   │   │   ├── BotActivity.kt
│   │   │   │   ├── VirtualConsultActivity.kt
│   │   │   │   ├── BookActivity.kt
│   │   │   │   ├── VideoActivity.kt
│   │   │   │   └── [other activities...]
│   │   │   ├── res/
│   │   │   │   ├── layout/          # XML layouts
│   │   │   │   ├── drawable/        # Images and icons
│   │   │   │   ├── values/          # Strings, colors, themes
│   │   │   │   └── menu/            # Bottom navigation menu
│   │   │   └── AndroidManifest.xml
│   │   └── test/                    # Unit tests
│   └── build.gradle.kts             # App-level Gradle config
├── gradle/
├── build.gradle.kts                 # Project-level Gradle config
├── settings.gradle.kts
└── README.md
```

---

## 👥 Team Members

This project was developed as a collaborative effort by **2 team members**:

### Development Team

1. **[OfteaHeat1997](https://github.com/OfteaHeat1997)** - Project Lead & Frontend Developer
   - Repository owner and maintainer
   - UI/UX Design (Figma)
   - Frontend development
   - User interface implementation
   - Design consistency

2. **[Gendrik Victoria (GLVictoria)](https://github.com/GLVictoria)** - Backend Developer & Core Architecture
   - Core Android development
   - API integration (OpenAI, Zego Cloud)
   - Backend implementation
   - Project architecture
   - Video/voice calling functionality

---

## 🎯 Use Cases

### Primary Users
- **Patients in rural/underserved areas** seeking medical advice
- **People with limited access** to healthcare facilities
- **Individuals seeking quick answers** to basic health questions
- **Patients requiring remote consultations** for follow-ups

### Healthcare Providers
- **Doctors willing to provide** remote consultations
- **Medical professionals** expanding their reach to underserved communities
- **Healthcare organizations** looking to implement telemedicine

---

## 🚧 Roadmap

### Planned Features
- [ ] User authentication and login system
- [ ] Prescription management
- [ ] Medical history tracking
- [ ] Payment integration for consultations
- [ ] Multi-language support
- [ ] Offline mode for basic features
- [ ] Push notifications for appointment reminders
- [ ] Doctor rating and review system
- [ ] Integration with electronic health records (EHR)
- [ ] Pharmacy locator and medicine delivery

---

## 🤝 Contributing

We welcome contributions to improve HealthWave! Here's how you can help:

1. **Fork the repository**
2. **Create a feature branch**
   ```bash
   git checkout -b feature/AmazingFeature
   ```
3. **Commit your changes**
   ```bash
   git commit -m "Add some AmazingFeature"
   ```
4. **Push to the branch**
   ```bash
   git push origin feature/AmazingFeature
   ```
5. **Open a Pull Request**

### Code Style Guidelines
- Follow [Kotlin coding conventions](https://kotlinlang.org/docs/coding-conventions.html)
- Use meaningful variable and function names
- Add comments for complex logic
- Write unit tests for new features

---

## 🐛 Known Issues

- API keys are currently hardcoded (security concern - needs environment configuration)
- No user authentication system implemented yet
- Internet connection required for all features (no offline mode)
- Limited error handling for network failures

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## 📞 Support

For questions, issues, or support:

- **GitHub Issues:** [Create an issue](https://github.com/OfteaHeat1997/Healthwave-doctor-on-demands/issues)
- **Project Repository:** [OfteaHeat1997/Healthwave-doctor-on-demands](https://github.com/OfteaHeat1997/Healthwave-doctor-on-demands)

---

## 🙏 Acknowledgments

- **OpenAI** for providing the GPT-3.5 API for AI medical assistance
- **Zego Cloud** for video/voice calling infrastructure
- **Android Development Community** for excellent documentation and resources
- **All contributors** who have helped improve this project

---

## 📊 Project Status

**Status:** ✅ Active Development

This project is currently in active development as a university/educational project. The core features are functional and ready for demonstration. Future updates will focus on production-readiness, security enhancements, and additional features.

---

## 🌟 Star This Repo

If you find HealthWave useful or interesting, please consider giving it a ⭐ on GitHub!

---

<div align="center">

**Made with ❤️ for improving healthcare accessibility worldwide**

[Report Bug](https://github.com/OfteaHeat1997/Healthwave-doctor-on-demands/issues) · [Request Feature](https://github.com/OfteaHeat1997/Healthwave-doctor-on-demands/issues) · [View Repository](https://github.com/OfteaHeat1997/Healthwave-doctor-on-demands)

</div>
