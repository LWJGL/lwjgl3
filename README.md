LWJGL - Lightweight Java Game Library 3.0
===

WORK IN PROGRESS: This repository is **experimental**. Feel free to explore, build and use (or even contribute!), but this is NOT a feature complete version of LWJGL.

**Update 2013-09-24**: Git history has been rewritten again, after removing all binaries off the repo. Cloning the repo has dropped to an 1.31 MiB download. Please rebase or clone your local repos again.

**Update 2013-09-07**: The entire git history has been rewritten, to remove kotlinc's overhead. Please rebase your local repos. Also run these if you'd like to shrink your copy:

    git reflog expire --expire=now --all
    git gc --prune=now --aggressive
---

The Lightweight Java Game Library (LWJGL) is a solution aimed directly at professional and amateur Java programmers alike to enable commercial quality games to be written in Java.
LWJGL provides developers access to high performance crossplatform libraries such as OpenGL (Open Graphics Library), OpenCL (Open Computing Language) and OpenAL (Open Audio Library) allowing for state of the art 3D games and 3D sound.
Additionally LWJGL provides access to controllers such as Gamepads, Steering wheel and Joysticks.
All in a simple and straight forward API.

- Website: [http://lwjgl.org](http://lwjgl.org)
- Forum: [http://lwjgl.org/forum](http://lwjgl.org/forum)
- Bugs/Suggestions: [https://github.com/LWJGL/lwjgl/issues](https://github.com/LWJGL/lwjgl/issues)

Build Process
---

LWJGL requires a JDK and Ant installed to build, as well as your platform's C compiler. Useful Ant targets:

* ant compile-templates
* ant compile
* ant compile-native
* ant tests
* ant demo -Dclass=&lt;classpath to demo&gt;
* ant javadoc

LWJGL has some binary dependencies that are downloaded &amp; updated during the build process. If working offline is required, use:

    ant -f update-dependencies.xml
