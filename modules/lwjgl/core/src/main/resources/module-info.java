/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
@SuppressWarnings({"requires-automatic", "requires-transitive-automatic"})
module org.lwjgl {
    requires transitive jdk.unsupported;

    requires static transitive jsr305;

    exports org.lwjgl;
    exports org.lwjgl.system;
    exports org.lwjgl.system.jni;
    exports org.lwjgl.system.libc;
    exports org.lwjgl.system.libffi;
    exports org.lwjgl.system.linux;
    exports org.lwjgl.system.macosx;
    exports org.lwjgl.system.windows;
}