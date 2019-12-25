/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.shaderc;

import org.testng.annotations.*;

import java.nio.*;
import java.util.*;

import static org.lwjgl.util.shaderc.Shaderc.*;
import static org.lwjgl.util.shaderc.ShadercSpvc.*;
import static org.testng.Assert.*;

@Test
public class ShadercSpvcTest {

    private static final String PROGRAM =
        "#version 450 core\n" +
        "layout(location = 0) in highp vec4 vtxColor;" +
        "layout(location = 0) out highp vec4 outColor;" +
        "void main() {" +
        "  outColor = vtxColor;" +
        "}";

    public void testBasicCompile() {
        // shaderc

        long compiler = shaderc_compiler_initialize();
        long options  = shaderc_compile_options_initialize();

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

        ByteBuffer bb = Objects.requireNonNull(shaderc_result_get_bytes(result));

        // shaderc_spvc

        long spvc_result = shaderc_spvc_result_create();

        long spvc_context = shaderc_spvc_context_create();
        long spvc_options = shaderc_spvc_compile_options_create();

        assertEquals(shaderc_spvc_initialize_for_glsl(spvc_context, bb.asIntBuffer(), spvc_options), shaderc_spvc_status_success);
        assertEquals(shaderc_spvc_compile_shader(spvc_context, spvc_result), shaderc_spvc_status_success);

        shaderc_spvc_compile_options_destroy(spvc_options);
        shaderc_spvc_context_destroy(spvc_context);

        shaderc_result_release(result);

        String glsl = Objects.requireNonNull(shaderc_spvc_result_get_string_output(spvc_result));

        assertTrue(glsl.contains("#version 450"));
        assertTrue(glsl.contains("layout(location = 0) in vec4 vtxColor"));
        assertTrue(glsl.contains("layout(location = 0) out vec4 outColor"));
        assertTrue(glsl.contains("outColor = vtxColor"));

        shaderc_spvc_result_destroy(spvc_result);
    }

}
