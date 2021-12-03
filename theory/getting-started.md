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
        * Example - Login button 10px below password field, 50px from left side of the screen
    * `LinearLayout` - all elements stack in horizontal/vertical line
        * Example - Register -> Login -> Help -> Exit
    * `` - 
    
### Code
* `Intent` - represents intent to do something, provides runtime binding between components
    * Example - clicking button in one activity, starts another activity
* Components
    * `Activity` - represents a thing user can do, provides UI
        * Example - Login page (.xml + code)
    * `WorkManager` - perform background tasks without UI
    
### Android studio
* Don't do stuff manually:
    * Instead of manually writing XML for layout
        * Use GUI editor (Design tab)
    * Instead of manually adding Activity class, related xml and line to AndroidManifest.xml
        * Use (Right-click on package -> New -> Activity)
    