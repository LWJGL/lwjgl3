/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_representative_fragment_test = "NVRepresentativeFragmentTest".nativeClassGLES("NV_representative_fragment_test", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides a new <em>representative fragment test</em> that allows implementations to reduce the amount of rasterization and fragment
        processing work performed for each point, line, or triangle primitive. For any primitive that produces one or more fragments that pass all other early
        fragment tests, the implementation is permitted to choose one or more "representative" fragments for processing and discard all other fragments. For
        draw calls rendering multiple points, lines, or triangles arranged in lists, strips, or fans, the representative fragment test is performed
        independently for each of those primitives.

        This extension is useful for applications that use an early render pass to determine the full set of primitives that would be visible in the final
        scene. In this render pass, such applications would set up a fragment shader that enables early fragment tests and writes to an image or shader storage
        buffer to record the ID of the primitive that generated the fragment. Without this extension, the shader would record the ID separately for each
        visible fragment of each primitive. With this extension, fewer stores will be performed, particularly for large primitives.

        The representative fragment test has no effect if early fragment tests are not enabled via the fragment shader. The set of fragments discarded by the
        representative fragment test is implementation-dependent and may vary from frame to frame. In some cases, the representative fragment test may not
        discard any fragments for a given primitive.

        Requires ${GLES32.core}.
        """

    IntConstant(
        """
        Accepted by the {@code cap} parameter of #Enable(), #Disable(), and #IsEnabled(), and by the {@code pname} parameter of #GetBooleanv(), #GetIntegerv()
        and #GetFloatv().
        """,

        "REPRESENTATIVE_FRAGMENT_TEST_NV"..0x937F
    )
}