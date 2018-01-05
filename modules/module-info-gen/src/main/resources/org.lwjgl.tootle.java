/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
module org.lwjgl.tootle {
    requires transitive org.lwjgl;
    requires static org.lwjgl.tootle.natives;

    exports org.lwjgl.util.tootle;
}