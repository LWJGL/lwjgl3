/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import opengles.*

val EXT_win32_keyed_mutex = "EXTWin32KeyedMutex".nativeClassGLES("EXT_win32_keyed_mutex", postfix = EXT) {
    GLboolean(
        "AcquireKeyedMutexWin32EXT",

        GLuint("memory"),
        GLuint64("key"),
        GLuint("timeout")
    )

    GLboolean(
        "ReleaseKeyedMutexWin32EXT",

        GLuint("memory"),
        GLuint64("key")
    )
}