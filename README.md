[![Maven Central](https://img.shields.io/maven-central/v/org.lwjgl/lwjgl.svg?label=maven%20central)](https://search.maven.org/search?q=g:org.lwjgl)
[![API Javadoc](https://img.shields.io/badge/API-docs-blue.svg)](https://javadoc.lwjgl.org/)
[![License](https://img.shields.io/badge/license-BSD-blue.svg?colorB=lightgray)](https://github.com/LWJGL/lwjgl3/blob/master/LICENSE.md)

[![Backers on Open Collective](https://opencollective.com/lwjgl/backers/badge.svg)](#backers)
[![Sponsors on Open Collective](https://opencollective.com/lwjgl/sponsors/badge.svg)](#sponsors)
![Size](https://img.shields.io/github/repo-size/LWJGL/lwjgl3.svg?label=size&colorB=lightgray)
[![Build Status](https://img.shields.io/github/workflow/status/LWJGL-CI/glfw/LWJGL%20Build?logo=github)](https://github.com/LWJGL-CI/lwjgl3/actions/workflows/CI.yml)

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
- [JavaDoc](http://javadoc.lwjgl.org)
- [Blog](http://blog.lwjgl.org)

Contact:

- [Forum](http://forum.lwjgl.org)
- [Slack](https://lwjgl.slack.com/) (click [this](http://slack.lwjgl.org/) to join)
- [Discord](https://discord.gg/6CywMCs)
- [![Twitter Follow](https://img.shields.io/twitter/follow/LWJGL?style=social)](https://twitter.com/LWJGL)

If you'd like to contribute, see [doc/README](https://github.com/LWJGL/lwjgl3/tree/master/doc)
for a quick overview of the project structure, installation instructions and
configuration options.

### Getting Started

As of version `3.1.0`, LWJGL is distributed as a set of modules. Only the
core module is required and all bindings are optional (but some bindings
depend on other bindings). The easiest way to download LWJGL is to use the
[build configurator](https://www.lwjgl.org/customize) on the website.

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
extracted manually and loaded via `java.library.path`. See the [Configuration](https://github.com/LWJGL/lwjgl3/blob/master/modules/lwjgl/core/src/main/java/org/lwjgl/system/Configuration.java)
class for more options.

LWJGL 3 requires Java 8 or later to build and run and currently supports the
following platforms/architectures:

- Linux x64
- Linux arm64 (ARMv8/AArch64)
- Linux arm32 (ARMv7/armhf)
- macOS x64
- macOS arm64
- Windows x64
- Windows x86
- Windows arm64

Example code:

- [Samples](https://github.com/LWJGL/lwjgl3/tree/master/modules/samples/src/test/java/org/lwjgl/demo) (simple samples covering basic usage of LWJGL bindings)
- [Demo suite](https://github.com/LWJGL/lwjgl3-demos) (includes advanced OpenGL and Vulkan demos)
- [Wiki tutorials](https://github.com/LWJGL/lwjgl3-wiki/wiki/2.6.-Tutorial-Index)

For migrating LWJGL 2 code to LWJGL 3, see the [Migration Guide](https://github.com/LWJGL/lwjgl3-wiki/wiki/2.6.6-LWJGL3-migration).

### Troubleshooting

Most common issues faced by LWJGL users are trivially addressed with the
following:

- [Installation guide](https://github.com/LWJGL/lwjgl3-wiki/wiki/1.2.-Install) (lwjgl3-wiki)
- [Troubleshooting guide](https://github.com/LWJGL/lwjgl3-wiki/wiki/2.5.-Troubleshooting) (lwjgl3-wiki)
- [Memory FAQ](https://github.com/LWJGL/lwjgl3-wiki/wiki/1.3.-Memory-FAQ) (lwjgl3-wiki)

[LWJGLX/debug](https://github.com/LWJGLX/debug) is a Java Agent that will
automatically detect a lot of these issues. It can also generate a trace log
that's useful when reporting issues to LWJGL.

When asking for help or when you suspect a bug in LWJGL, preparing an [MVCE](https://stackoverflow.com/help/mcve)
(Minimal, Complete, and Verifiable example) that reproduces the issue will
improve the chances of a quick and useful response.

## List of Supported Bindings

#### Khronos APIs

|Library|Description|
|-------|-----------|
|[EGL](https://www.khronos.org/egl)|An interface between Khronos rendering APIs such as OpenGL ES or OpenVG and the underlying native platform window system.|
|[KTX (Khronos Texture)](https://www.khronos.org/ktx/)|A lightweight container for textures for OpenGL®, Vulkan® and other GPU APIs.|
|[OpenCL](https://www.khronos.org/opencl/)|An open, royalty-free standard for cross-platform, parallel programming of diverse processors found in personal computers, servers, mobile devices and embedded platforms.|
|[OpenGL](https://www.khronos.org/opengl/)|The most widely adopted 2D and 3D graphics API in the industry, bringing thousands of applications to a wide variety of computer platforms.|
|[OpenGL ES](https://www.khronos.org/opengles/)|A royalty-free, cross-platform API for full-function 2D and 3D graphics on embedded systems - including consoles, phones, appliances and vehicles.|
|[OpenXR](https://www.khronos.org/openxr/)|A royalty-free, open standard that provides high-performance access to Augmented Reality (AR) and Virtual Reality (VR)—collectively known as XR—platforms and devices.|
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
|[FMOD](https://www.fmod.com)|An end-to-end solution for adding sound and music to any game.|
|[OpenAL](https://www.openal.org/)|A cross-platform 3D audio API appropriate for use with gaming applications and many other types of audio applications.|
|[OpenAL Soft](http://kcat.strangesoft.net/openal.html)|An LGPL-licensed, cross-platform, software implementation of the OpenAL 3D audio API.|
|[Opus](https://opus-codec.org/)|A totally open, royalty-free, highly versatile audio codec.|

#### Graphics

|Library|Description|
|-------|-----------|
|[Assimp](http://www.assimp.org/)|A portable Open Source library to import various well-known 3D model formats in a uniform manner.|
|[bgfx](https://bkaradzic.github.io/bgfx/)|Cross-platform, graphics API agnostic, “Bring Your Own Engine/Framework” style rendering library, licensed under permissive BSD-2 clause open source license.|
|[meshoptimizer](https://github.com/zeux/meshoptimizer)|A mesh optimization library that makes meshes smaller and faster to render.|
|[NanoSVG](https://github.com/memononen/nanosvg)|A simple stupid SVG parser.|
|[NanoVG](https://github.com/memononen/nanovg)|A small antialiased vector graphics rendering library for OpenGL.|
|[Nuklear](https://github.com/vurtun/nuklear)|A minimal state immediate mode graphical user interface toolkit written in ANSI C and licensed under public domain.|
|[par_octasphere](https://prideout.net/blog/octasphere)|Generates triangle meshes for spheres, rounded boxes, and capsules.|
|[par_shapes](https://prideout.net/shapes)|Generate parametric surfaces and other simple shapes.|
|[par_streamlines](https://prideout.net/blog/par_streamlines/)|Triangulate wide lines and curves.|
|[Shaderc](https://github.com/google/shaderc)|A collection of libraries for shader compilation.|
|[SPIRV-Cross](https://github.com/KhronosGroup/SPIRV-Cross)|A library for performing reflection on SPIR-V and disassembling SPIR-V back to high level languages.|
|[Tiny OpenEXR](https://github.com/syoyo/tinyexr)|A small, single header-only library to load and save OpenEXR(.exr) images.|
|[Tootle (AMD)](https://github.com/GPUOpen-Tools/amd-tootle)|A 3D triangle mesh optimization library that improves on existing mesh preprocessing techniques.|
|[Vulkan Memory Allocator](https://github.com/GPUOpen-LibrariesAndSDKs/VulkanMemoryAllocator)|An easy to integrate Vulkan memory allocation library.|
|[Yoga](https://facebook.github.io/yoga/)|An open-source, cross-platform layout library that implements Flexbox.|

#### AR/VR

|Library|Description|
|-------|-----------|
|[LibOVR](https://developer.oculus.com/documentation/)|The API of the Oculus SDK.|
|[OpenVR](https://github.com/ValveSoftware/openvr)|An API and runtime that allows access to VR hardware from multiple vendors without requiring that applications have specific knowledge of the hardware they are targeting.|

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
|[CUDA](https://developer.nvidia.com/cuda-zone/)|A parallel computing platform and programming model developed by NVIDIA for general computing on GPUs.|
|[jemalloc](http://jemalloc.net/)|A general purpose malloc implementation that emphasizes fragmentation avoidance and scalable concurrency support.|
|[libffi](https://sourceware.org)|A portable, high level programming interface to various calling conventions.|
|[libdivide](https://libdivide.com/)|A library that replaces expensive integer divides with comparatively cheap multiplication and bitshifts.|
|[LLVM](https://llvm.org/)|A collection of modular and reusable compiler and toolchain technologies.|
|[LMDB](https://symas.com/products/lightning-memory-mapped-database/)|An extraordinarily fast, memory-efficient database. With memory-mapped files, it has the read performance of a pure in-memory database while retaining the persistence of standard disk-based databases.|
|[LZ4](http://lz4.github.io/lz4/)|A lossless data compression algorithm that is focused on compression and decompression speed.|
|[Meow hash](https://github.com/cmuratori/meow_hash)|An extremely fast non-cryptographic hash.|
|[ODBC](https://docs.microsoft.com/en-us/sql/odbc/microsoft-open-database-connectivity-odbc)|A C programming language interface that makes it possible for applications to access data from a variety of database management systems (DBMSs).|
|[Remotery](https://github.com/Celtoys/Remotery)|A realtime CPU/GPU profiler hosted in a single C file with a viewer that runs in a web browser.|
|[rpmalloc](https://github.com/mjansson/rpmalloc)|A public domain cross platform lock free thread caching 16-byte aligned memory allocator implemented in C.|
|[xxHash](https://github.com/Cyan4973/xxHash)|An Extremely fast Hash algorithm, running at RAM speed limits.|
|[Zstandard](http://facebook.github.io/zstd/) (zstd)|A fast lossless compression algorithm, targeting real-time compression scenarios at zlib-level and better compression ratios.|

Use of a binding is subject to the terms of the [corresponding license](https://github.com/LWJGL/lwjgl3/tree/master/doc/3rdparty).

## Supporting this project

LWJGL exists thanks to [all the people](https://github.com/LWJGL/lwjgl3/blob/master/BACKERS.md) who [contribute](https://github.com/LWJGL/lwjgl3/blob/master/.github/CONTRIBUTING.md) and back/sponsor our collective.

<a href="https://opencollective.com/lwjgl/donate" target="_blank">
    <img src="https://opencollective.com/lwjgl/donate/button@2x.png?color=white" width=300 />
</a>

Our gold sponsors:

<a href="https://opencollective.com/lwjgl/tiers/gold-sponsor/0/website" target="_blank"><img src="https://opencollective.com/lwjgl/tiers/gold-sponsor/0/avatar.svg"></a>
<a href="https://opencollective.com/lwjgl/tiers/gold-sponsor/1/website" target="_blank"><img src="https://opencollective.com/lwjgl/tiers/gold-sponsor/1/avatar.svg"></a>
<a href="https://opencollective.com/lwjgl/tiers/gold-sponsor/2/website" target="_blank"><img src="https://opencollective.com/lwjgl/tiers/gold-sponsor/2/avatar.svg"></a>
<a href="https://opencollective.com/lwjgl/tiers/gold-sponsor/3/website" target="_blank"><img src="https://opencollective.com/lwjgl/tiers/gold-sponsor/3/avatar.svg"></a>
<a href="https://opencollective.com/lwjgl/tiers/gold-sponsor/4/website" target="_blank"><img src="https://opencollective.com/lwjgl/tiers/gold-sponsor/4/avatar.svg"></a>
<a href="https://opencollective.com/lwjgl/tiers/gold-sponsor/5/website" target="_blank"><img src="https://opencollective.com/lwjgl/tiers/gold-sponsor/5/avatar.svg"></a>
<a href="https://opencollective.com/lwjgl/tiers/gold-sponsor/6/website" target="_blank"><img src="https://opencollective.com/lwjgl/tiers/gold-sponsor/6/avatar.svg"></a>
<a href="https://opencollective.com/lwjgl/tiers/gold-sponsor/7/website" target="_blank"><img src="https://opencollective.com/lwjgl/tiers/gold-sponsor/7/avatar.svg"></a>
<a href="https://opencollective.com/lwjgl/tiers/gold-sponsor/8/website" target="_blank"><img src="https://opencollective.com/lwjgl/tiers/gold-sponsor/8/avatar.svg"></a>
<a href="https://opencollective.com/lwjgl/tiers/gold-sponsor/9/website" target="_blank"><img src="https://opencollective.com/lwjgl/tiers/gold-sponsor/9/avatar.svg"></a>
<a href="https://opencollective.com/lwjgl/tiers/gold-sponsor/10/website" target="_blank"><img src="https://opencollective.com/lwjgl/tiers/gold-sponsor/10/avatar.svg"></a>
<a href="https://opencollective.com/lwjgl/tiers/gold-sponsor/11/website" target="_blank"><img src="https://opencollective.com/lwjgl/tiers/gold-sponsor/11/avatar.svg"></a>
<a href="https://opencollective.com/lwjgl/tiers/gold-sponsor/12/website" target="_blank"><img src="https://opencollective.com/lwjgl/tiers/gold-sponsor/12/avatar.svg"></a>
<a href="https://opencollective.com/lwjgl/tiers/gold-sponsor/13/website" target="_blank"><img src="https://opencollective.com/lwjgl/tiers/gold-sponsor/13/avatar.svg"></a>
<a href="https://opencollective.com/lwjgl/tiers/gold-sponsor/14/website" target="_blank"><img src="https://opencollective.com/lwjgl/tiers/gold-sponsor/14/avatar.svg"></a>
<a href="https://opencollective.com/lwjgl/tiers/gold-sponsor/15/website" target="_blank"><img src="https://opencollective.com/lwjgl/tiers/gold-sponsor/15/avatar.svg"></a>
<a href="https://opencollective.com/lwjgl/tiers/gold-sponsor/16/website" target="_blank"><img src="https://opencollective.com/lwjgl/tiers/gold-sponsor/16/avatar.svg"></a>
<a href="https://opencollective.com/lwjgl/tiers/gold-sponsor/17/website" target="_blank"><img src="https://opencollective.com/lwjgl/tiers/gold-sponsor/17/avatar.svg"></a>
<a href="https://opencollective.com/lwjgl/tiers/gold-sponsor/18/website" target="_blank"><img src="https://opencollective.com/lwjgl/tiers/gold-sponsor/18/avatar.svg"></a>
<a href="https://opencollective.com/lwjgl/tiers/gold-sponsor/19/website" target="_blank"><img src="https://opencollective.com/lwjgl/tiers/gold-sponsor/19/avatar.svg"></a>
