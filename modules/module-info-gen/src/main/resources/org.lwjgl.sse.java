/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
module org.lwjgl.sse {
    requires transitive org.lwjgl;
    requires static org.lwjgl.sse.natives;

    exports org.lwjgl.util.simd;
}