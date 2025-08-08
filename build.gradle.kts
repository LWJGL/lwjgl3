/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
import java.net.*

plugins {
    `maven-publish`
    signing
}

/*
Ideally, we'd have the following structure:
-------------------------------------------
lwjgl
    lwjgl-windows (depends on lwjgl)
glfw (depends on lwjgl)
    glfw-windows (depends on glfw & lwjgl-windows)
stb (depends on lwjgl)
    stb-windows (depends on stb & lwjgl-windows)
-------------------------------------------
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
the above example is going to look like this in Gradle:
-------------------------------------------
compile 'org.lwjgl:lwjgl:$lwjglVersion' // NOTE: this is optional, all binding artifacts have a dependency on lwjgl
    compile 'org.lwjgl:lwjgl:$lwjglVersion:natives-$lwjglArch'
compile 'org.lwjgl:lwjgl-glfw:$lwjglVersion'
    compile 'org.lwjgl:lwjgl-glfw:$lwjglVersion:natives-$lwjglArch'
compile 'org.lwjgl:lwjgl-stb:$lwjglVersion'
    compile 'org.lwjgl:lwjgl-stb:$lwjglVersion:natives-$lwjglArch'
-------------------------------------------
and a whole lot more verbose in Maven. Hopefully, the automation
is going to alleviate the pain.
 */

/*
val copyArchives = tasks.create<Copy>("copyArchives") {
    from("bin/RELEASE")
    include("**")
    destinationDir = buildDir
}

tasks.withType<Sign> {
    dependsOn(copyArchives)
}
*/