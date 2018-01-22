/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
module org.lwjgl.par {
    requires transitive org.lwjgl;
    requires static org.lwjgl.par.natives;

    exports org.lwjgl.util.par;
}