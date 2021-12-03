* Components
    * `Activity` - provides UI
        * Main `Activity` starts on app launch (e.g. tap on icon/notification)
    * `WorkManager` - perform background tasks without UI

### Project structure
* `java/MainActivity.kt` - entry point
* `res/layout/activity_main.xml` - UI structure
* `AndroidManifest.xml` - app info (name, permissions, components, etc)
    * Used by build tools, Android OS ang Google Play
* `build.gradle` - build info (one file in root + one per module)

### Layout (Editor)
* UI in Android is hierarchy of layouts and widgets
    * `Layout` - container, has children and controls their positions
    * `Widget` - component (e.g. button, text box)
* Design surface:
    * `Blueprint` - detailed layout (with borders and other invisible elements)
    * `Design` - simplified layout (how user sees it)
* Layouts:
    * `ConstraintLayout` - each element has horizontal/vertical constraints
        * E.g. Login button 10px below password field, 50px from left side of the screen
    * `LinearLayout` - all elements stack in horizontal/vertical line
        * E.g. Register -> Login -> Help -> Exit
    * `` - 