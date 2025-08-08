/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
plugins {
    id("lwjgl-module")
}

lwjglPlatforms {
    addSupport(ALL, NATIVE_REQUIRED)
}

lwjglPublication.create {
    title("LWJGL - LMDB bindings")
    description("A compact, fast, powerful, and robust database that implements a simplified variant of the BerkeleyDB (BDB) API.")
}