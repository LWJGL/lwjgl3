# PROJECT STRUCTURE
LWJGL is organized in modules, described below:

### Core
The LWJGL core.
* modules/core/src/main/c
* modules/core/src/main/java
* modules/core/src/generated/c
* modules/core/src/generated/java
* modules/core/src/test/java (unit tests and demo/tutorial code)
* modules/core/src/test/resources (images and other resources used in tests)

Dependencies: n/a (but the Generator has to execute successfully first)
Library Dependencies: n/a
Test Library Dependencies: TestNG, JCommander

### Generator
The source code Generator and related tools.
* modules/generator/src/main/java
* modules/generator/src/main/kotlin

Dependencies: n/a
Library Dependencies: Kotlin runtime, JDK tools

### Templates
The templates used to define the native bindings.
* modules/templates/src/main/kotlin

Dependencies: Generator module
Library Dependencies: Kotlin runtime

# INSTALLATION
Requirements:
* JDK 8 or newer
* Ant 1.9.3 or newer

Step-by-step:

* git clone https://github.com/LWJGL/lwjgl3.git
* cd lwjgl3
* ant init
* ant init-generated (optional but highly recommended if you work on bindings)
* ant init-wiki (optional, only required if you work on the wiki)

At this point you're ready to follow the build process explained below.

LWJGL comes with a preconfigured **IntelliJ IDEA** project. You can use the Community Edition with the Kotlin and Ant plugins and, optionally, the TestNG and Copyright plugins.
* File &gt; Open &gt; choose the folder that contains the cloned LWJGL repository
* File &gt; Project Structure &gt; Project &gt; choose or create the Project SDK
* If you haven't used the init-generated and init-wiki targets, either ignore the VCS errors, or go to Settings &gt; Version Control &gt; remove the missing directories from the list of VCS roots.

LWJGL also comes with an **Eclipse** project. Copy the project files from the [eclipse](https://github.com/LWJGL/lwjgl3/tree/master/config/ide/eclipse) folder into the root directory and open it as an Eclipse file. There's also a Kotlin plugin for Eclipse available now, see [Getting Started with Eclipse](http://kotlinlang.org/docs/tutorials/getting-started-eclipse.html).

LWJGL does also provide a project for **Netbeans**. You have to copy the *nbproject* folder into the root directory. Afterwards you can open it as NetBeans project.

# BUILD PROCESS
LWJGL uses Ant for the build process, which goes like so:
* ant compile-templates (compiles the Generator and Template modules)
* ant generate (runs the Generator)
* ant compile (compiles the Java source code)
* ant compile-native (compiles the native code for the target platform)
* ant tests (runs the test suite)
* ant demo -Dclass=&lt;*classpath to demo*&gt; (runs the demo specified by the *class* property)

# GENERATOR
LWJGL uses the **Generator** to automatically generate native code bindings. The Generator uses template files as input. Both the Generator itself and the template files are written in Kotlin, which is a new JVM-based language, more info [here](http://kotlinlang.org/). The Generator defines a handy DSL that the templates use to define the native code structure.

* Generator source: modules/generator/src/main/kotlin/org/lwjgl/generator
* Template configuration: modules/templates/src/main/kotlin/org/lwjgl/&lt;**PACKAGE**&gt;
* Template source: modules/templates/src/main/kotlin/org/lwjgl/&lt;**PACKAGE**&gt;/templates

The Generator is very aggressive with skipping work during the generation process. It does that by comparing timestamps of the input template source and the output Java source files. The output file timestamp is also compared against the timestamp of the latest change in the Generator source. Even when all attemps to skip generation fail, the generation happens in-memory and the output file contents are compared against the new content. Only when something has changed is the file overwritten.

The benefit of all that is reduced native code compilation times. If, for any reason, the incremental generation causes problems, use one or more of the ant clean-* targets.

# BUILD CONFIGURATION
The config folder contains the LWJGL configuration.
* ANT
	- config/build-assets.xml: Demo assets
	- config/build-bindings.xml: Bindings configuration
	- config/build-definitions.xml: Reusable definitions and utilities
	- config/<platform>/build.xml: Platform-specific definitions
* TestNG
	- config/tests.xml
	- a config/tests_<platform>.xml per platform

The ANT build can be configured with the following environment variables:
* LWJGL_BUILD_TYPE (optional)
	This is used as the source of binary dependencies. Valid values:
   - *nightly*
       the latest successful build. Dependency repos can be found [here](https://github.com/LWJGL-CI). This is the default.
   - *stable*
       the latest nightly build that has been verified to work with LWJGL.
   - *release/latest*
       the latest stable build that has been promoted to an official LWJGL release.
   - *release/{build.version}*
       a specific previously released build.
* LWJGL_BUILD_ARCH (optional)
	The target native architecture. Must be either x86 or x64. By default, os.arch of the JVM that runs ANT is used, but this can be overriden for cross-compiling to another architecture.
* LWJGL_BUILD_OFFLINE (optional)
	Offline build flag. This is useful when working offline, or when custom binary dependencies are used (so they are not overriden). Set to one of true/on/yes to enable.
* LWJGL_BUILD_OUTPUT (optional)
	Overrides the default output directory. By default, the directories /bin, /generated and /release will be created in the same directory as the main build script. These 3 directories will contain thousands of tiny files, so you may want to override their location due to performance characteristics of the storage hardware.
Note that when this property is set, the directories /bin, /generated and /release will be symlinks to the corresponding directories in LWJGL_BUILD_OUTPUT. The ant scripts and IDE projects always work with paths relative to the project root.

# RUNTIME CONFIGURATION
LWJGL can be configured at runtime with system properties. There are two types of properties:
* STATIC
    They are read once per JVM process, usually during class initialization. Their values are stored in "static final" variables and usually related to statically turn features on or off.
* DYNAMIC
    These may be read once or more times, changing LWJGL's behavior dynamically.

The supported options can be found in the [Configuration](https://github.com/LWJGL/lwjgl3/blob/master/modules/core/src/main/java/org/lwjgl/system/Configuration.java) class. This class can also be used to set the option values programmatically.

# LIBRARY DEPENDENCIES
* Kotlin
    - libs/kotlinc
* TestNG
    - libs/testng.jar
    - libs/jcommander.jar

# CODE STYLE
Tab-size: 4 spaces
Right margin: 160 chars

# COMMIT STYLE
As of May 2017, LWJGL commit messages loosely follow the [Conventional Commits](http://conventionalcommits.org/) structure.

A commit should have a type prefix and an appropriate scope. The scope in particular is especially helpful when browsing LWJGL's commit history, given the variety of modules and library bindings in the repository.

Other than that, there's no intention to be overly strict about this. There will be a lot of flexibility on the allowed types and scopes, as well as the exact message formatting.

Contributors are encouraged but not required to submit PRs using these guidelines. Commit messages will be changed during review or when a patch is rebased, as needed.

# ADDING A NEW BINDING

Changes to several different places are required in order to add a new binding to LWJGL. These are listed below.

In the `lwjgl3` repository:

- `build.xml`
    * `compile-templates`: add path to binding templates
    * `-init-compile`: add binding package
    * `compile-tests`: add demo & test packages (if applicable)
    * `release`: add `release-module` definition for the binding
- `config/build-bindings.xml`
    * Add `binding.<name>` property so that the binding can be conditionally enabled.
- `config/<platform>/build.xml`
    * Add `build` definition to the applicable platforms. 
- `modules/generator/src/main/kotlin/org/lwjgl/generator/Generator.kt`
    * Add to the `Binding` enum.
- `modules/module-info-gen/src/main/resources/`
    * Add module definition for the binding.
- `README.MD`
    * Add to the `List of Supported Bindings`.
- `doc/3rdparty/`
    * Add license file for the binding.
- `doc/notes/<version>.md`
    * Add to the next version release notes.
- `build.gradle`
    * Add to the `Artifacts` enum.
    
In the `lwjgl3-www` repository:

- `client/routes/customize/BuildConfigurator/lwjgl/nightly.js` (`lwjgl3-www` repository)
    * Add definition for the binding.