@REM Step 1: point JAVA_HOME to a GraalVM JDK w/ Native Image
@REM jdk x64 graalvm-17

@REM Step 2: make sure everything is up-to-date
call ant compile-native compile-tests

@REM Step 3: build the native image
call "%JAVA_HOME%\bin\native-image" -cp ^
bin/classes/lwjgl/core;^
bin/classes/lwjgl/assimp;^
bin/classes/lwjgl/bgfx;^
bin/classes/lwjgl/cuda;^
bin/classes/lwjgl/egl;^
bin/classes/lwjgl/fmod;^
bin/classes/lwjgl/freetype;^
bin/classes/lwjgl/glfw;^
bin/classes/lwjgl/harfbuzz;^
bin/classes/lwjgl/hwloc;^
bin/classes/lwjgl/jawt;^
bin/classes/lwjgl/jemalloc;^
bin/classes/lwjgl/ktx;^
bin/classes/lwjgl/libdivide;^
bin/classes/lwjgl/llvm;^
bin/classes/lwjgl/lz4;^
bin/classes/lwjgl/meow;^
bin/classes/lwjgl/meshoptimizer;^
bin/classes/lwjgl/nanovg;^
bin/classes/lwjgl/nfd;^
bin/classes/lwjgl/nuklear;^
bin/classes/lwjgl/odbc;^
bin/classes/lwjgl/openal;^
bin/classes/lwjgl/opencl;^
bin/classes/lwjgl/opengl;^
bin/classes/lwjgl/opengles;^
bin/classes/lwjgl/openvr;^
bin/classes/lwjgl/openxr;^
bin/classes/lwjgl/opus;^
bin/classes/lwjgl/ovr;^
bin/classes/lwjgl/par;^
bin/classes/lwjgl/remotery;^
bin/classes/lwjgl/rpmalloc;^
bin/classes/lwjgl/shaderc;^
bin/classes/lwjgl/spvc;^
bin/classes/lwjgl/sse;^
bin/classes/lwjgl/stb;^
bin/classes/lwjgl/tinyexr;^
bin/classes/lwjgl/tinyfd;^
bin/classes/lwjgl/tootle;^
bin/classes/lwjgl/vma;^
bin/classes/lwjgl/vulkan;^
bin/classes/lwjgl/xxhash;^
bin/classes/lwjgl/yoga;^
bin/classes/lwjgl/zstd;^
bin/classes/samples;^
modules/samples/src/test/resources;^
bin/libs/java/joml.jar;^
bin/libs/native;^
config/native-image ^
%1 --verbose --no-fallback