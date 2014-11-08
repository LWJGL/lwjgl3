PROJECT STRUCTURE
-----------------
LWJGL is organized in modules, described below:

Module: Core
	Description: The LWJGL core.
	Module Dependencies: n/a (but the Generator has to execute successfully first)
	Library Dependencies: disruptor (OSX only, if GLFW is used)
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

CONFIGURATION
-------------
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

	* JAVA7_HOME (required)
		This is used as the "bootclasspath" to ensure that the source code is compatible with Java 7.
	* LWJGL_BUILD_TYPE
		This is used as the source of binary dependencies. Valid values:
        - nightly
            the latest successful build. Dependency repos can be found here: https://github.com/LWJGL-CI
        - stable
            the latest nightly build that has been verified to work with LWJGL. This is the default.
        - release/latest
            the latest stable build that has been promoted to an official LWJGL release.
        - release/{build.version}
            a specific previously released build.
	* LWJGL_BUILD_ARCH
		The target native architecture. Must be either x86 or x64. By default, os.arch of the JVM
		that runs ANT is used, but this can be overriden for cross-compiling to another architecture.
	* LWJGL_BUILD_OFFLINE
		Offline build flag. This is useful when working offline, or when custom binary dependencies
		are used (so they are not overriden). Set to one of true/on/yes to enable.

LIBRARY DEPENDENCIES
--------------------
Kotlin
	* libs/kotlinc

TestNG
	* libs/testng.jar
	* libs/jcommander.jar

Disruptor
	* libs/disruptor.jar

CODE STYLE
----------
Tab-size: 4 spaces
Right margin: 160 chars