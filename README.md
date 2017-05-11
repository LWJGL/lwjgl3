[![License](https://img.shields.io/badge/license-BSD-blue.svg)](https://github.com/LWJGL/lwjgl3/blob/master/LICENSE.md)
![Size](https://reposs.herokuapp.com/?path=lwjgl/lwjgl3)
[![Build Status](https://travis-ci.org/LWJGL-CI/lwjgl3.svg?branch=master-linux64)](https://travis-ci.org/LWJGL-CI/lwjgl3)
[![Slack Status](https://slack.lwjgl.org/badge.svg)](https://slack.lwjgl.org/)

## LWJGL - Lightweight Java Game Library 3

LWJGL (https://www.lwjgl.org) is a Java library that enables cross-platform
access to popular native APIs useful in the development of graphics
(OpenGL/Vulkan), audio (OpenAL) and parallel computing (OpenCL) applications.
This access is direct and high-performance, yet also wrapped in a type-safe
and user-friendly layer, appropriate for the Java ecosystem.

LWJGL is an enabling technology and provides low-level access. It is not a
framework and does not provide higher-level utilities than what the native
libraries expose. As such, novice programmers are encouraged to try one of
the frameworks or game engines that make use of LWJGL, before working
directly with the library.

LWJGL is open source software and freely available at no charge.

Useful links:

- [Wiki](https://github.com/LWJGL/lwjgl3-wiki/wiki)
- [Release Notes](https://github.com/LWJGL/lwjgl3/tree/master/doc/notes)  
- [Forum](http://forum.lwjgl.org)
- [JavaDoc](http://javadoc.lwjgl.org)
- [Blog](http://blog.lwjgl.org)
- [Twitter](https://twitter.com/LWJGL)

For a quick overview of the project structure, installation instructions and
configuration options, see [doc/README](https://github.com/LWJGL/lwjgl3/tree/master/doc).

For migrating LWJGL 2 code to LWJGL 3, see the [Migration Guide](https://github.com/LWJGL/lwjgl3-wiki/wiki/2.6.6-LWJGL3-migration).

As of version `3.1.0`, LWJGL is distributed as a set of modules. Only the
core module is required and all bindings are optional (but some bindings
depend on other bindings). The easiest way to download LWJGL is to use the
[build configurator](https://www.lwjgl.org/download) on the website.

The build configurator generates **Maven & Gradle** declarations that can be
added to existing projects. This is the easiest way to use LWJGL while
developing.

LWJGL can also be downloaded as a simple set of JAR files. Each module
consists of the following files:

* lwjgl-&lt;module&gt;.jar
* lwjgl-&lt;module&gt;-sources.jar
* lwjgl-&lt;module&gt;-javadoc.jar
* lwjgl-&lt;module&gt;-natives-&lt;platform&gt;.jar (for some bindings)

To compile and run an LWJGL application, the base and natives JAR files of
the core module and each binding used should be added to the classpath. LWJGL
extracts the natives to a temporary folder and loads them automatically, so
no further configuration is necessary. If more customization is required
(e.g. when creating a platform-specific installer) the natives may be
extracted manually and loaded via `java.library.path`. See the [Configuration](https://github.com/LWJGL/lwjgl3/blob/master/modules/core/src/main/java/org/lwjgl/system/Configuration.java)
class for more options.

LWJGL 3 requires Java 8 or later to build and run and currently supports the
following platforms/architectures:

- Linux x64
- MacOS X x64
- Windows x86
- Windows x64

Example code:

- [Test suite](https://github.com/LWJGL/lwjgl3/tree/master/modules/core/src/test/java/org/lwjgl/demo) (simple samples covering basic usage of LWJGL bindings)
- [Demo suite](https://github.com/LWJGL/lwjgl3-demos) (includes advanced OpenGL and Vulkan demos)
- [Wiki tutorials](https://github.com/LWJGL/lwjgl3-wiki/wiki/2.6.-Tutorial-Index)

LWJGL 3 includes the following bindings:

#### Khronos APIs

|Library|Description|
|-------|-----------|
|[EGL](https://www.khronos.org/egl)|An interface between Khronos rendering APIs such as OpenGL ES or OpenVG and the underlying native platform window system.|
|[OpenCL](https://www.khronos.org/opencl/)|An open, royalty-free standard for cross-platform, parallel programming of diverse processors found in personal computers, servers, mobile devices and embedded platforms.|
|[OpenGL](https://www.khronos.org/opengl/)|The most widely adopted 2D and 3D graphics API in the industry, bringing thousands of applications to a wide variety of computer platforms.|
|[OpenGL ES](https://www.khronos.org/opengles/)|A royalty-free, cross-platform API for full-function 2D and 3D graphics on embedded systems - including consoles, phones, appliances and vehicles.|
|[Vulkan](https://www.khronos.org/vulkan/)|A new generation graphics and compute API that provides high-efficiency, cross-platform access to modern GPUs used in a wide variety of devices from PCs and consoles to mobile phones and embedded platforms.|

#### Display and Input

|Library|Description|
|-------|-----------|
|[GLFW](http://www.glfw.org/)|Create multiple windows, handle user input (keyboard, mouse, gaming peripherals) and manage contexts. Also features multi-monitor support, clipboard access, file drag-n-drop, and [much more](http://www.glfw.org/docs/latest/news.html).|
|[JAWT](http://docs.oracle.com/javase/8/docs/technotes/guides/awt/AWT_Native_Interface.html)|The AWT native interface.|
|[nfd](https://github.com/mlabbe/nativefiledialog)|A tiny, neat C library that portably invokes native file open and save dialogs.|
|[tinyfd](https://sourceforge.net/projects/tinyfiledialogs/)|A native dialog library.|

#### Audio

|Library|Description|
|-------|-----------|
|[OpenAL](https://www.openal.org/)|A cross-platform 3D audio API appropriate for use with gaming applications and many other types of audio applications.|
|[OpenAL Soft](http://kcat.strangesoft.net/openal.html)|An LGPL-licensed, cross-platform, software implementation of the OpenAL 3D audio API.|

#### Graphics

|Library|Description|
|-------|-----------|
|[Assimp](http://www.assimp.org/)|A portable Open Source library to import various well-known 3D model formats in a uniform manner.|
|[bgfx](https://bkaradzic.github.io/bgfx/)|Cross-platform, graphics API agnostic, “Bring Your Own Engine/Framework” style rendering library, licensed under permissive BSD-2 clause open source license.|
|[LibOVR](https://developer.oculus.com/documentation/)|The API of the Oculus SDK.|
|[NanoVG](https://github.com/memononen/nanovg)|A small antialiased vector graphics rendering library for OpenGL.|
|[Nuklear](https://github.com/vurtun/nuklear)|A minimal state immediate mode graphical user interface toolkit written in ANSI C and licensed under public domain.|
|[par_shapes](https://github.com/prideout/par)|Generate parametric surfaces and other simple shapes.|
|[OpenVR](https://github.com/ValveSoftware/openvr)|An API and runtime that allows access to VR hardware from multiple vendors without requiring that applications have specific knowledge of the hardware they are targeting.|
|[Tiny OpenEXR](https://github.com/syoyo/tinyexr)|A small, single header-only library to load and save OpenEXR(.exr) images.|
|[Yoga](https://facebook.github.io/yoga/)|An open-source, cross-platform layout library that implements Flexbox.|

#### [stb](https://github.com/nothings/stb) - single-file public domain libraries for C/C++

|Library|Description|
|-------|-----------|
|stb_easy_font|Quick-and-dirty easy-to-deploy bitmap font for printing frame rate, etc.|
|stb_image|Image loading/decoding from file/memory: JPG, PNG, TGA, BMP, PSD, GIF, HDR, PIC|
|stb_image_resize|Resize images larger/smaller with good quality.|
|stb_image_write|Image writing to disk: PNG, TGA, BMP|
|stb_perlin|Revised Perlin noise (3D input, 1D output).|
|stb_rect_pack|Simple 2D rectangle packer with decent quality.|
|stb_truetype|Parse, decode, and rasterize characters from truetype fonts.|
|stb_vorbis|Decode ogg vorbis files from file/memory to float/16-bit signed output.|

#### Other

|Library|Description|
|-------|-----------|
|[dyncall](http://www.dyncall.org/)|Encapsulates architecture-, OS- and compiler-specific function call semantics in a virtual bind argument parameters from left to right and then call interface allowing programmers to call C functions in a completely dynamic manner.|
|[jemalloc](http://www.canonware.com/jemalloc/)|A general purpose malloc implementation that emphasizes fragmentation avoidance and scalable concurrency support.|
|[LMDB](https://symas.com/products/lightning-memory-mapped-database/)|An extraordinarily fast, memory-efficient database. With memory-mapped files, it has the read performance of a pure in-memory database while retaining the persistence of standard disk-based databases.|
|[xxHash](https://github.com/Cyan4973/xxHash)|An Extremely fast Hash algorithm, running at RAM speed limits.|

Use of a binding is subject to the terms of the [corresponding license](https://github.com/LWJGL/lwjgl3/tree/master/doc/3rdparty).
