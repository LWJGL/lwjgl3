/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
module org.lwjgl {
    requires jdk.unsupported;

    requires static org.lwjgl.natives;

    exports org.lwjgl;
    exports org.lwjgl.system;
    exports org.lwjgl.system.dyncall;
    exports org.lwjgl.system.jni;
    exports org.lwjgl.system.libc;
    exports org.lwjgl.system.linux;
    exports org.lwjgl.system.macosx;
    exports org.lwjgl.system.windows;
}