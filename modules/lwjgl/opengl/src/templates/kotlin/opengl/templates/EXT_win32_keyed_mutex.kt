/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import opengl.*

val EXT_win32_keyed_mutex = "EXTWin32KeyedMutex".nativeClassGL("EXT_win32_keyed_mutex", postfix = EXT) {
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