/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.shaderc;

import org.testng.annotations.*;

import java.nio.*;
import java.util.*;

import static org.lwjgl.util.shaderc.Shaderc.*;
import static org.testng.Assert.*;

@Test
public class ShadercTest {

    private static final String PROGRAM =
        "#version 450 core\n" +
        "layout(location = 0) in highp vec4 vtxColor;" +
        "layout(location = 0) out highp vec4 outColor;" +
        "void main() {" +
        "  outColor = vtxColor;" +
        "}";

    public void testBasicCompile() {
        long compiler = shaderc_compiler_initialize();
        long options     = shaderc_compile_options_initialize();

        long result = shaderc_compile_into_spv(
            compiler,
            PROGRAM,
            shaderc_glsl_fragment_shader,
            "a.glsl",
            "main",
            options
        );

        shaderc_compile_options_release(options);
        shaderc_compiler_release(compiler);

        assertEquals(shaderc_result_get_compilation_status(result), shaderc_compilation_status_success);

        long resultLength = shaderc_result_get_length(result);
        assertNotEquals(resultLength, 0L);

        ByteBuffer bb = Objects.requireNonNull(shaderc_result_get_bytes(result));
        assertEquals(bb.remaining(), resultLength);

        shaderc_result_release(result);
    }

}
