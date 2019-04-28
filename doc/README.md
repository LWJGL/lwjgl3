# PROJECT STRUCTURE
LWJGL is organized in modules, described below:

### Core
The LWJGL core.
* `modules/lwjgl/core/src/main/c`
* `modules/lwjgl/core/src/main/java`
* `modules/lwjgl/core/src/main/java9` (multi-release)
* `modules/lwjgl/core/src/main/java10` (multi-release)
* `modules/lwjgl/core/src/main/resources` (module-info)
* `modules/lwjgl/core/src/templates/kotlin` (native binding templates)
* `modules/lwjgl/core/src/generated/c`
* `modules/lwjgl/core/src/generated/java`
* `modules/lwjgl/core/src/test/java`

Module dependencies: n/a (but the Generator has to execute successfully first)  
Compile dependencies: n/a  
Test dependencies: TestNG, JCommander

### Bindings
A module per LWJGL binding.
* `modules/lwjgl/<binding>/src/main/c` (optional)
* `modules/lwjgl/<binding>/src/main/java` (optional)
* `modules/lwjgl/<binding>/src/main/resources` (module-info)
* `modules/lwjgl/<binding>/src/templates/kotlin`
* `modules/lwjgl/<binding>/src/generated/c` (optional)
* `modules/lwjgl/<binding>/src/generated/java`
* `modules/lwjgl/<binding>/src/test/java` (optional)

Module dependencies: the core module

### Samples
The LWJGL demo & benchmarking suite.
* `modules/samples/src/test/java/org/lwjgl/demo` (demo/tutorial code)
* `modules/samples/src/test/java/org/lwjgl/jmh` (JMH benchmarks)
* `modules/samples/src/test/resources` (images and other resources used in demos)

Module dependencies: all core and binding modules

### Generator
The source code Generator and related tools.
* `modules/generator/src/main/java`
* `modules/generator/src/main/kotlin`

Module dependencies: n/a  
Compile dependencies: Kotlin runtime, JDK tools

### Extract
A tool that extracts generator templates from native headers.
* `modules/extract/src/main/kotlin`

Module dependencies: the core & llvm modules  
Compile dependencies: Kotlin runtime

# INSTALLATION
Requirements:
* JDK 8 or newer
* Ant 1.9.3 or newer

Step-by-step:

* `git clone https://github.com/LWJGL/lwjgl3.git`
* `cd lwjgl3`
* `ant init`
* `ant init-wiki` (optional, only required if you work on the wiki)

At this point you're ready to follow the build process explained below.

LWJGL comes with a preconfigured **IntelliJ IDEA** project. You can use the Community Edition with the Kotlin and Ant plugins and, optionally, the TestNG and Copyright plugins.
* File &gt; Open &gt; choose the folder that contains the cloned LWJGL repository
* File &gt; Project Structure &gt; Project &gt; choose or create the Project SDK
* If you haven't used the init-wiki target, either ignore the VCS errors, or go to Settings &gt; Version Control &gt; remove the missing directories from the list of VCS roots.

LWJGL also comes with an **Eclipse** project. Copy the project files from the [eclipse](https://github.com/LWJGL/lwjgl3/tree/master/config/ide/eclipse) folder into the root directory and open it as an Eclipse file. There's also a Kotlin plugin for Eclipse available now, see [Getting Started with Eclipse](http://kotlinlang.org/docs/tutorials/getting-started-eclipse.html).

LWJGL does also provide a project for **Netbeans**. You have to copy the *nbproject* folder into the root directory. Afterwards you can open it as NetBeans project.

# BUILD PROCESS
LWJGL uses Ant for the build process, which goes like so:
* `ant compile-templates` (compiles the Generator and Template modules)
* `ant generate` (runs the Generator)
* `ant compile` (compiles the Java source code)
* `ant compile-native` (compiles the native code for the target platform)
* `ant tests` (runs the test suite)
* `ant demo -Dclass=<classpath to demo>` (runs the demo specified by the *class* property)

# GENERATOR
LWJGL uses the **Generator** to automatically generate native code bindings. The Generator uses template files as input. Both the Generator itself and the template files are written in Kotlin, which is a new JVM-based language, more info [here](http://kotlinlang.org/). The Generator defines a handy DSL that the templates use to define the native code structure.

* Generator source: `modules/generator/src/main/kotlin/org/lwjgl/generator`
* Template configuration: `modules/lwjgl/<module>/src/templates/kotlin/<module>`
* Template source: `modules/lwjgl/<module>/src/templates/kotlin/<module>/templates`

The Generator is very aggressive with skipping work during the generation process. It does that by comparing timestamps of the input template source and the output Java source files. The output file timestamp is also compared against the timestamp of the latest change in the Generator source. Even when all attemps to skip generation fail, the generation happens in-memory and the output file contents are compared against the new content. Only when something has changed is the file overwritten.

The benefit of all that is reduced native code compilation times. If, for any reason, the incremental generation causes problems, use one or more of the ant clean-* targets.

# BUILD CONFIGURATION
The config folder contains the LWJGL configuration.
* ANT
    - `config/build-assets.xml`: Demo assets
    - `config/build-bindings.xml`: Bindings configuration
    - `config/build-definitions.xml`: Reusable definitions and utilities
    - `config/<platform>/build.xml`: Platform-specific definitions
* TestNG
    - `config/tests.xml`
    - a `config/tests_<platform>.xml` per platform

The ANT build can be configured with the following environment variables:
* `LWJGL_BUILD_TYPE` (optional)
    This is used as the source of binary dependencies. Valid values:
   - *nightly*
       the latest successful build. Dependency repos can be found [here](https://github.com/LWJGL-CI). This is the default.
   - *stable*
       the latest nightly build that has been verified to work with LWJGL.
   - *release/latest*
       the latest stable build that has been promoted to an official LWJGL release.
   - *release/{build.version}*
       a specific previously released build.
* `LWJGL_BUILD_ARCH` (optional)
    The target native architecture. Must be one of: `x64`, `x86`, `arm64`, `arm32`. By default, the `os.arch` of the JVM that runs ANT is used, but this can be overridden for cross-compiling to another architecture.
* `LWJGL_BUILD_OFFLINE` (optional)
    Offline build flag. This is useful when working offline, or when custom binary dependencies are used (so they are not overridden). Set to one of true/on/yes to enable.
* `LWJGL_BUILD_OUTPUT` (optional)
    Overrides the default output directory. By default, the directories /bin, /generated and /release will be created in the same directory as the main build script. These 3 directories will contain thousands of tiny files, so you may want to override their location due to performance characteristics of the storage hardware.
Note that when this property is set, the directories /bin, /generated and /release will be symlinks to the corresponding directories in LWJGL_BUILD_OUTPUT. The ant scripts and IDE projects always work with paths relative to the project root.

# RUNTIME CONFIGURATION
LWJGL can be configured at runtime with system properties. There are two types of properties:
* `STATIC`
    They are read once per JVM process, usually during class initialization. Their values are stored in "static final" variables and usually related to statically turn features on or off.
* `DYNAMIC`
    These may be read once or more times, changing LWJGL's behavior dynamically.

The supported options can be found in the [Configuration](https://github.com/LWJGL/lwjgl3/blob/master/modules/lwjgl/core/src/main/java/org/lwjgl/system/Configuration.java) class. This class can also be used to set the option values programmatically.

# LIBRARY DEPENDENCIES
* Kotlin
    - `bin/libs/kotlinc`
* TestNG
    - `bin/libs/java/testng.jar`
    - `bin/libs/java/jcommander.jar`

# CODE STYLE
Tab-size: 4 spaces
Right margin: 160 chars

# COMMIT STYLE
As of May 2017, LWJGL commit messages loosely follow the [Conventional Commits](http://conventionalcommits.org/) structure.

A commit should have a type prefix and an appropriate scope. The scope in particular is especially helpful when browsing LWJGL's commit history, given the variety of modules and library bindings in the repository.

Other than that, there's no intention to be overly strict about this. There will be a lot of flexibility on the allowed types and scopes, as well as the exact message formatting.

Contributors are encouraged but not required to submit PRs using these guidelines. Commit messages will be changed during review or when a patch is rebased, as needed.

# ADDING A NEW BINDING

When starting a new binding, it is recommended to copy the structure of an existing binding under `modules/lwjgl/`. LWJGL includes bindings with different styles of definition and configuration, depending on the nature of the library. Search for an existing binding that is similar to the new one.

Besides adding the appropriate files under `modules/lwjgl/<binding>/`, a few other places must be editted to correctly support the new binding. These are listed below.

In the `lwjgl3` repository:

- `build.xml`
    * `compile`: add `compileBinding` tag for the binding
    * `compile-tests`: add demo packages (if applicable)
    * `release`: add `release-module` tag for the binding
- `config/build-bindings.xml`
    * Add `binding.<name>` property so that the binding can be conditionally enabled.
    * Update the `forEachBinding` macro definition to include the binding.
- `config/<platform>/build.xml`
    * Add `build` definition to the applicable platforms.
- `config/tests.xml`
    * Add test package for the binding. (if applicable)
- `modules/generator/src/main/kotlin/org/lwjgl/generator/Generator.kt`
    * Add to the `Binding` enum.
- `README.MD`
    * Add to the `List of Supported Bindings`.
- `doc/notes/<version>.md`
    * Add to the next version release notes.
- `build.gradle`
    * Add to the `Artifacts` enum.
- IDEA project (optional)
    * `.idea/modules.xml`: add the Java and Kotlin modules
    * The Java module should be stored at `.idea/modules/lwjgl`
    * The Kotlin module should be stored at `.idea/modules/templates`
    
In the `lwjgl3-www` repository:

- `client/routes/customize/BuildConfigurator/lwjgl/nightly.js` (`lwjgl3-www` repository)
    * Add definition for the binding.
