/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
module org.lwjgl.nfd {
    requires transitive org.lwjgl;
    requires static org.lwjgl.nfd.natives;

    exports org.lwjgl.util.nfd;
}