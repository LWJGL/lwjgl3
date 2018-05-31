/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GLX14 = "GLX14".nativeClassGLX("GLX14") {
    extends = GLX13
    documentation = "Native bindings to GLX 1.4."

    IntConstant(
        "Added in GLX 1.4.",

        "SAMPLE_BUFFERS"..0x186a0,
        "SAMPLES"..0x186a1
    )

    opaque_p(
        "GetProcAddress",
        """
        Returns the address of the extension function named by {@code procName}. The pointer returned should be cast to a function pointer type matching the
        extension function's definition in that extension specification. A return value of #NULL indicates that the specified function does not exist for the
        implementation.

        A non-#NULL return value for {@code glXGetProcAddress} does not guarantee that an extension function is actually supported at runtime. The client must
        also query #GetString()(GL11#GL_EXTENSIONS) or #QueryExtensionsString() to determine if an extension is supported by a particular context.

        GL function pointers returned by {@code glXGetProcAddress} are independent of the currently bound context and may be used by any context which supports
        the extension.

        {@code glXGetProcAddress} may be queried for all of the following functions:
        ${ul(
            "All GL and GLX extension functions supported by the implementation (whether those extensions are supported by the current context or not).",
            """
            All core (non-extension) functions in GL and GLX from version 1.0 up to and including the versions of those specifications supported by the
            implementation, as determined by #GetString()(GL11#GL_VERSION) and #QueryVersion() queries.
            """
        )}
        """,

        GLcharASCII.const.p.IN("procName", "the function name to query")
    )

}