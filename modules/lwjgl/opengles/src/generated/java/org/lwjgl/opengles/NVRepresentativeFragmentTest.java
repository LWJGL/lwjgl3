/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_representative_fragment_test.txt">NV_representative_fragment_test</a> extension.
 * 
 * <p>This extension provides a new <em>representative fragment test</em> that allows implementations to reduce the amount of rasterization and fragment
 * processing work performed for each point, line, or triangle primitive. For any primitive that produces one or more fragments that pass all other early
 * fragment tests, the implementation is permitted to choose one or more "representative" fragments for processing and discard all other fragments. For
 * draw calls rendering multiple points, lines, or triangles arranged in lists, strips, or fans, the representative fragment test is performed
 * independently for each of those primitives.</p>
 * 
 * <p>This extension is useful for applications that use an early render pass to determine the full set of primitives that would be visible in the final
 * scene. In this render pass, such applications would set up a fragment shader that enables early fragment tests and writes to an image or shader storage
 * buffer to record the ID of the primitive that generated the fragment. Without this extension, the shader would record the ID separately for each
 * visible fragment of each primitive. With this extension, fewer stores will be performed, particularly for large primitives.</p>
 * 
 * <p>The representative fragment test has no effect if early fragment tests are not enabled via the fragment shader. The set of fragments discarded by the
 * representative fragment test is implementation-dependent and may vary from frame to frame. In some cases, the representative fragment test may not
 * discard any fragments for a given primitive.</p>
 * 
 * <p>Requires {@link GLES32 GLES 3.2}.</p>
 */
public final class NVRepresentativeFragmentTest {

    /**
     * Accepted by the {@code cap} parameter of {@link GLES20#glEnable Enable}, {@link GLES20#glDisable Disable}, and {@link GLES20#glIsEnabled IsEnabled}, and by the {@code pname} parameter of {@link GLES20#glGetBooleanv GetBooleanv}, {@link GLES20#glGetIntegerv GetIntegerv}
     * and {@link GLES20#glGetFloatv GetFloatv}.
     */
    public static final int GL_REPRESENTATIVE_FRAGMENT_TEST_NV = 0x937F;

    private NVRepresentativeFragmentTest() {}

}