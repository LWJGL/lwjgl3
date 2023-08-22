/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
module org.lwjgl.nanovg {
    requires transitive org.lwjgl;

    requires static transitive org.lwjgl.bgfx;
    requires static transitive org.lwjgl.opengl;
    requires static transitive org.lwjgl.opengles;

    exports org.lwjgl.nanovg;
}