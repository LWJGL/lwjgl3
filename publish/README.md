# LWJGL Publishing

LWJGL uses Gradle to publish its platform (maven BOM) and modules.

### build-logic

A composite Gradle build containing shared build logic.

### modules

The parent project for all module projects.

### lwjgl-bom

The platform (maven BOM) for the modules.

## Gradle Migration

If LWJGL ever decide to completly migrate to Gradle,
the contents of this folder should be moved to the root.
Currently, the root modules folder
also contains other projects like tools.
These should be moved out to the root folder and be prefixed
with `lwjgl-` to match the scheme used by the current gradle projects.
The two modules folders can then be merged
as they both contain all the modules (bindings + core).
With the merge, the modules now contains source code.
This means that the ad hoc setup currently used to manually
create configurations and a software component can be replaced
with the java-library plugin.
The build-logic composite build should also be used for
the new Gradle projects so that it becomes
the only source of shared build logic.

This is the proposed folder structure:

```
build-logic/
    lwjgl-convention/
    lwjgl-plugins/
        ...
    lwjgl-utils/
lwjgl-bom/
lwjgl-modules/
    lwjgl-core/
    ...
lwjgl-extract/
lwjgl-generator/
lwjgl-samples/
```

## Module Design

Ideally, we'd have the following structure:

```
lwjgl
    lwjgl-windows (depends on lwjgl)
glfw (depends on lwjgl)
    glfw-windows (depends on glfw & lwjgl-windows)
stb (depends on lwjgl)
    stb-windows (depends on stb & lwjgl-windows)
```

If a user wanted to use GLFW + stb in their project, running on
the Windows platform, they'd only have to define glfw-windows
and stb-windows as dependencies. This would automatically
resolve stb, glfw, lwjgl and lwjgl-windows as transitive
dependencies. Unfortunately, it is not possible to define such
a relationship between Maven artifacts when using classifiers.
A method to make this work is make the natives-<arch> classified
JARs separate artifacts. We do not do it for aesthetic reasons.
Instead, we assume that a tool is available (on the LWJGL website)
that automatically generates POM/Gradle dependency structures for
projects wanting to use LWJGL. The output is going to be verbose;
the above example is going to look like this in kotlin Gradle:

```kotlin
implementation(platform("org.lwjgl:lwjgl-bom:$lwjglVersion"))

implementation("org.lwjgl:lwjgl") // NOTE: this is optional, all binding artifacts have a dependency on lwjgl
implementation("org.lwjgl:lwjgl::natives-$lwjglPlatform")

implementation("org.lwjgl:lwjgl-glfw")
implementation("org.lwjgl:lwjgl-glfw::natives-$lwjglPlatform")

implementation("org.lwjgl:lwjgl-stb")
implementation("org.lwjgl:lwjgl-stb:natives-$lwjglPlatform")
```

and a whole lot more verbose in Maven. Hopefully, the automation
is going to alleviate the pain. With gradle module metadata
and the setting of the os and arch attributes,
the above will condense to:

```kotlin
implementation(platform("org.lwjgl:lwjgl-bom:$lwjglVersion"))

implementation("org.lwjgl:lwjgl")
implementation("org.lwjgl:lwjgl-glfw")
implementation("org.lwjgl:lwjgl-stb")
```

To set the attributes to 64-bit windows in kotlin Gradle,
the following can be used:

```kotlin
configurations.matching(Configuration::isCanBeResolved).configureEach {
    attributes {
        attribute(
            OperatingSystemFamily.OPERATING_SYSTEM_ATTRIBUTE,
            objects.named("windows")
        )
        attribute(
            MachineArchitecture.ARCHITECTURE_ATTRIBUTE,
            objects.named("x64")
        )
    }
}
```