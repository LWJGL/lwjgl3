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
	Description: The source code Generator and the templates it uses to defined the native bindings.
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
5) Create and sign JARs (TBD)

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
		- External annotations in config/kotlin
			Because of Kotlin's built-in null-safety and its current beta status, compiling the
			Generator module requires some external annotations. These are generated through the
			IntelliJ IDEA gui and placed in the config/kotlin for use by the command-line compiler.

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