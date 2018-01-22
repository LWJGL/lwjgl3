/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
module org.lwjgl.tinyexr {
    requires transitive org.lwjgl;
    requires static org.lwjgl.tinyexr.natives;

    exports org.lwjgl.util.tinyexr;
}