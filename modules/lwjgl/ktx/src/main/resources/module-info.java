/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
module org.lwjgl.ktx {
    requires transitive org.lwjgl;

    requires static org.lwjgl.vulkan;

    exports org.lwjgl.util.ktx;
}