=======Steps to build test and run android app=========

1. Download android studio from link https://developer.android.com/sdk/index.html
2. Before you set up Android Studio, be sure you have installed JDK 6 or higher (the JRE alone is not sufficient)—JDK 7 is required when developing for Android 5.0 and higher. To check if you have JDK installed (and which version), open a terminal and type javac -version. If the JDK is not available or the version is lower than 6, go download JDK

3. To set up Android Studio on Mac OSX:

    Launch the .dmg file you just downloaded.
    Drag and drop Android Studio into the Applications folder.
    Open Android Studio and follow the setup wizard to install any necessary SDK tools.

    Depending on your security settings, when you attempt to open Android Studio, you might see a warning that says the package is damaged and should be moved to the trash. If this happens, go to System Preferences > Security & Privacy and under Allow applications downloaded from, select Anywhere. Then open Android Studio again.

If you need use the Android SDK tools from a command line, you can access them at: /Users/<user>/Library/Android/sdk/

Android Studio is now ready and loaded with the Android developer tools, but there are still a couple packages you should add to make your Android SDK complete.


4. Adding SDK Packages:

4.1 By default, the Android SDK does not include everything you need to start developing. The SDK separates tools, platforms, and other components into packages you can download as needed using the Android SDK Manager. So before you can start, there are a few packages you should add to your Android SDK.

To start adding packages, launch the Android SDK Manager in one of the following ways:

    In Android Studio, click SDK Manager in the toolbar.
    If you're not using Android Studio:
        Windows: Double-click the SDK Manager.exe file at the root of the Android SDK directory.
        Mac/Linux: Open a terminal and navigate to the tools/ directory in the location where the Android SDK was installed, then execute android sdk.

When you open the SDK Manager for the first time, several packages are selected by default.

4.2 Get the latest SDK tools :

As a minimum when setting up the Android SDK, you should download the latest tools and Android platform:

    Open the Tools directory and select:
        Android SDK Tools
        Android SDK Platform-tools
        Android SDK Build-tools (highest version)
    Open the first Android X.X folder (the latest version) and select:
        SDK Platform
        A system image for the emulator, such as
        ARM EABI v7a System Image


4.3 Get the support library for additional APIs
The Android Support Library provides an extended set of APIs that are compatible with most versions of Android.

Open the Extras directory and select:

    Android Support Repository
    Android Support Library

4.4  Get Google Play services for even more APIs
To develop with Google APIs, you need the Google Play services package:

Open the Extras directory and select:

    Google Repository
    Google Play services

Note: Google Play services APIs are not available on all Android-powered devices, but are available on all devices with Google Play Store. To use these APIs in the Android emulator, you must also install the the Google APIs system image from the latest Android X.X directory in the SDK Manager.

4.5 Install the packages

Once you've selected all the desired packages, continue to install:

    Click Install X packages.
    In the next window, double-click each package name on the left to accept the license agreement for each.
    Click Install.

The download progress is shown at the bottom of the SDK Manager window. Do not exit the SDK Manager or it will cancel the download.

5. Build something!
With the above packages now in your Android SDK, you're ready to build apps for Android. As new tools and other APIs become available, simply launch the SDK Manager to download the new packages for your SDK.

6. Clone the rideDrop2 repo from bitbucket and checkout the master branch.
7. Go to Android Studio -> Select File tab -> Open (Select the project location)
8. Once the project is loaded and compiled in android studio, Click Run tab -> Select Run App
9. Connect the device in usb debugging mode. How to enable Usb debugging mode? Go to settings. If there is Developer Options, then click it and the debugging mode. If Developer Options is not visible, the in settings go to About Phone -> Click Build Number 5-6 times continuosly. The developer mode will be enabled and shown in setting screen. After the go to developer option screen and enable debugging mode.

9. Connect the device and run the project.
