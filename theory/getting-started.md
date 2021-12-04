### Project structure
* `java/MainActivity.kt` - entry point
* `src/androidTest` - instrumented tests (run on an Android device)
* `src/test` - unit tests (without Android device)
* `res/layout/activity_main.xml` - UI structure
* `AndroidManifest.xml` - app info (components, permissions, API level)
    * Used by build tools, Android OS ang Google Play
* `build.gradle` - build info (one file in root + one per module)

### Layout (Editor)
* UI in Android is hierarchy of layouts and widgets
    * `Layout` - container, has children and controls their positions
    * `Widget` - component (e.g. button, text box, toast)
* Design surface:
    * `Blueprint` - detailed layout (with borders and other invisible elements)
    * `Design` - simplified layout (how user sees it)
* Layouts:
    * `ConstraintLayout` - each element has horizontal/vertical constraints
        * Example - Login button 10px below password field, 50px from left side of the screen
    * `LinearLayout` - all elements stack in horizontal/vertical line
        * Example - Register -> Login -> Help -> Exit
    * `` - 
    
### Code
* App components
    * `Activity` - entry point for interacting with user. Represents single screen with UI (.xml + code)
        * Examples - Login page, products list, checkout page
    * `Service` - entry point for keeping an app running in the background (no UI)
        * Examples - fetch big amount of data over network, play music while user in a different app
    * `Broadcast receiver` - OS delivers broadcasts even to apps that aren't currently running
        * Examples - battery is low, screen turned off 
    * `Content provider` - manages persistent data (e.q. database)
* `Intent` - represents intent to do something, provides runtime binding between components
    * Example - clicking button in one activity, starts another activity
* `Fragment` - reusable, modular portion of an activity
    * Examples - activity with two fragments (items list, item detail)
    
### Android studio
* Don't do stuff manually:
    * Instead of manually writing XML for layout
        * Use GUI editor (Design tab)
    * Instead of manually adding Activity class, related xml and line to AndroidManifest.xml
        * Use (Right-click on package -> New -> Activity)
    * Instead of manually rewriting java code as kotlin 
        * Try to paste it in studio, it will convert code automatically
    
### Android OS
* Android OS is Linux in which each app is a different user
    * App files accessible only by one user
* Each process has its own virtual machine (VM), so an app's code runs in isolation from other apps