/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
module org.lwjgl.tinyfd {
    requires transitive org.lwjgl;
    requires static org.lwjgl.tinyfd.natives;

    exports org.lwjgl.util.tinyfd;
}