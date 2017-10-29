/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
module org.lwjgl.rpmalloc {
    requires transitive org.lwjgl;
    requires transitive org.lwjgl.rpmalloc.natives;

    exports org.lwjgl.system.rpmalloc;
}