/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
module org.lwjgl.openxr {
    requires transitive org.lwjgl;

    requires static org.lwjgl.egl;
    requires static org.lwjgl.opengl;
    requires static org.lwjgl.vulkan;

    exports org.lwjgl.openxr;
}