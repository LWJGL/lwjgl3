## LWJGL - Lightweight Java Game Library 3

This repository hosts **LWJGL 3**, the complete rewrite and next major version of [LWJGL](https://www.lwjgl.org). Everything you need to know about the project can be found in the [Wiki](https://github.com/LWJGL/lwjgl3-wiki/wiki). Other useful links:

- [Release Notes](https://github.com/LWJGL/lwjgl3/tree/master/doc/notes)  
- [Forum](http://forum.lwjgl.org)
- [JavaDoc](http://javadoc.lwjgl.org)
- [Blog](http://blog.lwjgl.org)
- [Twitter](https://twitter.com/LWJGL)

For a quick overview of the project structure, installation instructions and configuration options, see [doc/README](https://github.com/LWJGL/lwjgl3/tree/master/doc).

For migrating LWJGL 2 code to LWJGL 3, see the [Migration Guide](https://github.com/LWJGL/lwjgl3-wiki/wiki/2.6.6-LWJGL3-migration).

LWJGL 3 can be used with **Maven/Gradle/Ivy**, with the following dependencies:

```
org.lwjgl:lwjgl:${version}
org.lwjgl:lwjgl-platform:${version}:natives-windows
org.lwjgl:lwjgl-platform:${version}:natives-linux
org.lwjgl:lwjgl-platform:${version}:natives-osx
```

where `${version}` is a version (e.g. `3.0.0`) released on Maven Central. **Nightly builds** are also available from the *Sonatype Nexus* [repository](https://oss.sonatype.org/content/repositories/snapshots), with a snapshot build version (e.g. `3.0.1-SNAPSHOT`).

LWJGL 3 requires Java 8 or later to build and run and currently supports the following platforms/architectures:

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
|[LibOVR](https://developer.oculus.com/documentation/)|The API of the Oculus SDK.|
|[nfd](https://github.com/mlabbe/nativefiledialog)|A tiny, neat C library that portably invokes native file open and save dialogs.|

#### Audio

|Library|Description|
|-------|-----------|
|[OpenAL](https://www.openal.org/)|A cross-platform 3D audio API appropriate for use with gaming applications and many other types of audio applications.|
|[OpenAL Soft](http://kcat.strangesoft.net/openal.html)|An LGPL-licensed, cross-platform, software implementation of the OpenAL 3D audio API.|

#### Graphics

|Library|Description|
|-------|-----------|
|[NanoVG](https://github.com/memononen/nanovg)|A small antialiased vector graphics rendering library for OpenGL.|
|[par_shapes](https://github.com/prideout/par)|Generate parametric surfaces and other simple shapes.|

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
|[xxHash](https://github.com/Cyan4973/xxHash)|An Extremely fast Hash algorithm, running at RAM speed limits.|

Use of a binding is subject to the terms of the [corresponding license](https://github.com/LWJGL/lwjgl3/tree/master/doc/3rdparty).