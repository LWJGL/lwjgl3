/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
module org.lwjgl.nanovg {
    requires transitive org.lwjgl;

    requires static org.lwjgl.bgfx;
    requires static org.lwjgl.opengl;
    requires static org.lwjgl.opengles;

    exports org.lwjgl.nanovg;
}