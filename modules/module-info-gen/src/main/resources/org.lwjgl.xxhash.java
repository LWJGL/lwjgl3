/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
module org.lwjgl.xxhash {
    requires transitive org.lwjgl;
    requires static org.lwjgl.xxhash.natives;

    exports org.lwjgl.util.xxhash;
}