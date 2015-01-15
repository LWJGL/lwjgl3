PROJECT STRUCTURE
-----------------
LWJGL is organized in modules, described below:

Module: Core
	Description: The LWJGL core.
	Module Dependencies: n/a (but the Generator has to execute successfully first)
	Structure:
		* src/core
		* src/native
		* generated/java
		* generated/native

Module: Utilities
	Description: Optional LWJGL components and helper functionality.
	Module Dependencies: Core
	Structure:
		* src/util

Module: Templates
	Description: The source code Generator and the templates it uses to define the native bindings.
	Module Dependencies: Core
	Library Dependencies: Kotlin runtime
	Structure:
		* src/templates

Module: Tests
	Description: Unit tests and demo/tutorial code.
	Module Dependencies: Core, Util, Templates
	Library Dependencies: TestNG, JCommander
	Structure:
		* src/tests

BUILD PROCESS
-------------
LWJGL uses Ant for the build process, which goes like so:

1) Compile the Generator (ant compile-templates)
2) Run the Generator (ant generate)
3) Compile Java code (ant compile)
4) Compile native code for the target platform (ant compile-native)
5) Run tests or demos (ant tests | ant demo -Dclass=<classpath to demo>)

GENERATOR
---------
LWJGL uses the Generator in the Templates module to automatically generate native code bindings.
The Generator uses template files as input. Both the Generator itself and the template files are
written in Kotlin, which is a new JVM-based language, more info here: kotlin.jetbrains.org. The
Generator defines a handy DSL that the templates use to define the native code structure.

	* Generator source: src/templates/org/lwjgl/generator
	* Template configuration: src/templates/org/lwjgl/<PACKAGE>
	* Template source: src/templates/org.lwjgl/<PACKAGE>/templates

The Generator is very aggressive with skipping work during the generation process. It does that by
comparing timestamps of the input template source and the output Java source files. The output file
timestamp is also compared against the timestamp of the latest change in the Generator source. Even
when all attemps to skip generation fail, the generation happens in-memory and the output file contents
are compared against the new content. Only when something has changed is the file overwritten.

The benefit of all that is reduced native code compilation times.

BUILD CONFIGURATION
-------------------
The config folder contains the LWJGL configuration.

	* ANT
		- Basic definitions: config/build-definitions.xml
		- Platform-specific definitions: A folder per platform

	* TestNG
		- config/tests.xml
		- a config/tests_<platform>.xml per platform

	* Kotlin
		- config/Templates.kts is the build script used by the Kotlin compiler

The ANT build can be configured with the following environment variables:

	* JAVA6_HOME (optional, recommended)
		This is used as the "bootclasspath" to ensure that the source code is compatible with Java 6.
	* LWJGL_BUILD_TYPE (optional)
		This is used as the source of binary dependencies. Valid values:
        - nightly
            the latest successful build. Dependency repos can be found here: https://github.com/LWJGL-CI
        - stable
            the latest nightly build that has been verified to work with LWJGL. This is the default.
        - release/latest
            the latest stable build that has been promoted to an official LWJGL release.
        - release/{build.version}
            a specific previously released build.
	* LWJGL_BUILD_ARCH (optional)
		The target native architecture. Must be either x86 or x64. By default, os.arch of the JVM
		that runs ANT is used, but this can be overriden for cross-compiling to another architecture.
	* LWJGL_BUILD_OFFLINE (optional)
		Offline build flag. This is useful when working offline, or when custom binary dependencies
		are used (so they are not overriden). Set to one of true/on/yes to enable.

RUNTIME CONFIGURATION
-------------------
LWJGL can be configured at runtime with system properties. There are two types of properties:

    * STATIC
        They are read once per JVM process, usually during class initialization. Their values are
        stored in "static final" variables and usually related to statically turn features on or off.
	* DYNAMIC
		These may be read once or more times, changing LWJGL's behavior dynamically.

The supported properties are:

	* org.lwjgl.libname [STATIC]
		Can be used to override the LWJGL library name. It can also be an absolute path.

	* org.lwjgl.librarypath [DYNAMIC]
	    Takes priority over java.library.path. It may contain one or more directory paths, separated by the
	    platform path separator (: or ;).

	* org.lwjgl.util.Debug [STATIC]
		Set to true to enable LWJGL's debug mode. There will be logged messages on stderr and extra runtime
		checks (some potentially expensive, performance-wise).
	* org.lwjgl.util.NoChecks [STATIC]
		Set to true to disable LWJGL's basic checks. These are trivial checks that LWJGL performs to avoid
		JVM crashes, very useful during development. Their performance impact is usually minimal, but may
		they be disabled for released applications.
	* org.lwjgl.util.BufferAlign [STATIC]
		Sets the alignment of buffers allocated by BufferUtils. By default, buffer allocations will be
		unaligned (whatever ByteBuffer.allocateDirect returns). Supported values:
		- page
			Page alignment (usually 4 kilobytes)
		- cache-line
			Cache-line alignment (usually 64 bytes)
		- default
			Default alignment. The JDK uses 8 byte alignment for all direct ByteBuffers.
		- <number>
			Custom alignment. Must be a power-of-two integer, greater than 8.

	* org.lwjgl.openal.libname [DYNAMIC]
	* org.lwjgl.opencl.libname [DYNAMIC]
	* org.lwjgl.opengl.libname [DYNAMIC]
		Can be used to override the library name of the corresponding library. It can also be an absolute path.
	* org.lwjgl.opengl.maxVersion [STATIC]
		Can be used to limit the maximum available OpenGL version. This can be useful to ensure
		that an application has not accidentally used features only available in a higher OpenGL
		version.

	* org.lwjgl.openal.explicitInit [STATIC]
	* org.lwjgl.opencl.explicitInit [STATIC]
	* org.lwjgl.opengl.explicitInit [STATIC]
		By default, LWJGL will automatically initialize the corresponding library, when it is first
		accessed. Set this property to disable this behavior.

	* org.lwjgl.macosx.nsloop [STATIC]
		WIP

LIBRARY DEPENDENCIES
--------------------
Kotlin
	* libs/kotlinc

TestNG
	* libs/testng.jar
	* libs/jcommander.jar

CODE STYLE
----------
Tab-size: 4 spaces
Right margin: 160 chars