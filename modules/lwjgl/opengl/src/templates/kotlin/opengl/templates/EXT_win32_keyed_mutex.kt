/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import opengl.*

val EXT_win32_keyed_mutex = "EXTWin32KeyedMutex".nativeClassGL("EXT_win32_keyed_mutex", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Direct3D image objects may have a built-in synchronization primitive associated with them that can be used to synchronize access to their contents
        across process and API boundaries. This extension provides access to that synchronization primitive via two new commands that operate on GL memory
        objects.

        Requires ${EXT_memory_object.link}.
        """

    GLboolean(
        "AcquireKeyedMutexWin32EXT",
        "Blocks GL command processing until a keyed mutex is acquired.",

        GLuint("memory", "identifies which keyed mutex to acquire"),
        GLuint64("key", "is the mutex value to wait for"),
        GLuint("timeout", "the time, in milliseconds, to wait before failing the acquire operation")
    )

    GLboolean(
        "ReleaseKeyedMutexWin32EXT",
        "Releases a keyed mutex after all prior GL command processing has completed.",

        GLuint("memory", "identifies the keyed mutex to release"),
        GLuint64("key", "the mutex value set by the release operation")
    )
}