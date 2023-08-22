/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
module org.lwjgl.ktx {
    requires transitive org.lwjgl;

    requires static transitive org.lwjgl.egl;
    requires static transitive org.lwjgl.opengl;
    requires static transitive org.lwjgl.vulkan;

    exports org.lwjgl.util.ktx;
}