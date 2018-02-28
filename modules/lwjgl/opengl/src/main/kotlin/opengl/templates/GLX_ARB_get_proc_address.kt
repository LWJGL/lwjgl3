/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GLX_ARB_get_proc_address = "GLXARBGetProcAddress".nativeClassGLX("GLX_ARB_get_proc_address", ARB) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds a function to return the address of GLX and GL extension functions, given the function name. This is necessary with (for example)
        heterogenous implementations where hardware drivers may implement extension functions not known to the link library; a similar situation on Windows
        implementations resulted in the {@code wglGetProcAddress} function.
        """

    opaque_p(
        "GetProcAddressARB",
        """
        Returns the address of the extension function named by procName. The pointer returned should be cast to a function pointer type matching the extension
        function's definition in that extension specification. A return value of #NULL indicates that the specified function does not exist for the
        implementation.

        A non-#NULL return value for {@code glXGetProcAddressARB} does not guarantee that an extension function is actually supported at runtime. The client
        must must also query #GetString()(GL11#GL_EXTENSIONS) or #QueryExtensionsString() to determine if an extension is supported by a particular
        context.

        GL function pointers returned by {@code glXGetProcAddressARB} are independent of the currently bound context and may be used by any context which
        supports the extension.

        {@code glXGetProcAddressARB} may be queried for all of the following functions:
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