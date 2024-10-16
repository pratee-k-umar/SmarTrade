# SmarTrade - Android Application

SmarTrade is an Android application designed for investment enthusiasts, displaying various companies and their current stock prices. Users can browse different companies and view detailed stock information on a dedicated screen.

## Prerequisites

Before setting up the project, ensure you have the following tools installed:

- **Android Studio (latest version recommended)**
- **Java Development Kit (JDK 8 or later)**
- **Gradle**
- **Git**

## Getting Started

### 1. Clone the Repository

First, clone the repository to your local machine:

```bash
git clone https://github.com/yourusername/SmarTrade.git
```

### 2. Open the Project in Android Studio

1. Launch Android Studio.
2. Select **File > Open**.
3. Navigate to the directory where you cloned the project and open it.

### 3. Sync Gradle

Once the project is loaded in Android Studio, Gradle will automatically start syncing the project. If it doesn’t, you can manually sync by clicking on **Sync Project with Gradle Files** in the toolbar.

### 4. Build and Run the App

After the Gradle sync is successful, you can build and run the app:

1. Select an emulator or connected device.
2. Click the **Run** button in Android Studio.

### 5. Troubleshooting

- **Gradle Sync Issues**: If you encounter issues during Gradle sync, try invalidating the cache. Go to **File > Invalidate Caches / Restart**.

## Project Structure

```
├── app/                        # Main application directory
│   ├── src/                    # Source files
│   │   ├── main/               # Main app source files
│   │   │   ├── java/           # Java/Kotlin code
│   │   │   └── res/            # App resources (layouts, drawables, etc.)
│   └── build.gradle            # Module build configuration
├── build.gradle                # Project build configuration
└── README.md                   # Project setup instructions
```

## Features

- **Company Listings**: View a list of various companies.
- **Details Screen**: Tap on a company to view detailed stock information.
- **Search Functionality**: Search functionality to find specific companies.

## Dependencies

Some of the key dependencies used in this project include:

- **Jetpack Compose**: For building UI components.
- **Retrofit**: For making network requests to fetch stock data.
- **Hilt**: For dependency injection.