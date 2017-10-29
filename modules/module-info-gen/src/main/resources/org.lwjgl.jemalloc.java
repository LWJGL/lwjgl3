/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
module org.lwjgl.jemalloc {
    requires transitive org.lwjgl;
    requires transitive org.lwjgl.jemalloc.natives;

    exports org.lwjgl.system.jemalloc;
}