/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
module org.lwjgl.zstd {
    requires transitive org.lwjgl;
    requires static org.lwjgl.zstd.natives;

    exports org.lwjgl.util.zstd;
}