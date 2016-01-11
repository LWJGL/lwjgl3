## LWJGL - Lightweight Java Game Library 3

This repository hosts **LWJGL 3**, the complete rewrite and next major version of [LWJGL](http://www.lwjgl.org). Everything you need to know about the project can be found in the [Wiki](https://github.com/LWJGL/lwjgl3-wiki/wiki). Other useful links:

- Forum - http://forum.lwjgl.org
- JavaDoc - http://javadoc.lwjgl.org
- Blog - http://blog.lwjgl.org
- Twitter - [@LWJGL](https://twitter.com/LWJGL)

For a quick overview of the project structure, installation instructions and configuration options, see [doc/README](https://github.com/LWJGL/lwjgl3/tree/master/doc).

For migrating LWJGL 2 code to LWJGL 3, see the [Migration Guide](https://github.com/LWJGL/lwjgl3-wiki/wiki/2.6.6-LWJGL3-migration).

LWJGL 3 can be used with **Maven/Gradle/Ivy**, with the following dependencies:

```
org.lwjgl:lwjgl:${version}
org.lwjgl:lwjgl-platform:${version}:natives-windows
org.lwjgl:lwjgl-platform:${version}:natives-linux
org.lwjgl:lwjgl-platform:${version}:natives-osx
```

where `${version}` is a version (e.g. `3.0.0b`) released on Maven Central. **Nightly builds** are also available from the *Sonatype Nexus* [repository](https://oss.sonatype.org/content/repositories/snapshots), with a snapshot build version (e.g. `3.0.0-SNAPSHOT`).

Example code:

- [Test suite](https://github.com/LWJGL/lwjgl3/tree/master/modules/core/src/test/java/org/lwjgl/demo) (simple samples covering basic usage of LWJGL bindings)
- [Demo suite](https://github.com/LWJGL/lwjgl3-demos) (includes advanced OpenGL usage)
- [Wiki tutorials](https://github.com/LWJGL/lwjgl3-wiki/wiki/2.6.-Tutorial-Index)
