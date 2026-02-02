/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.shaderc;

import org.jspecify.annotations.*;
import org.lwjgl.*;
import org.lwjgl.system.*;
import org.testng.annotations.*;

import java.nio.*;
import java.util.*;
import java.util.function.*;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.util.shaderc.GLSLang.*;
import static org.lwjgl.util.shaderc.GLSLangResourceLimits.*;
import static org.lwjgl.util.shaderc.SPV.*;
import static org.lwjgl.util.shaderc.SPVOptimizer.*;
import static org.lwjgl.util.shaderc.Shaderc.*;
import static org.testng.Assert.*;

@Test
public class ShadercTest {

    private static final String PROGRAM =
        "#version 450 core\n" +
        "layout(location = 0) in highp vec4 vtxColor;" +
        "layout(location = 0) out highp vec4 outColor;" +
        "void main() {" +
        "  outColor = vtxColor * vec4(1.0);" + // no-op multiplication to test optimizer
        "}";

    public void testShadercCompile() {
        IntBuffer a = compileWithShaderc(shaderc_optimization_level_performance, null);
        IntBuffer b = compileWithShaderc(shaderc_optimization_level_zero, ShadercTest::optimizeWithSPIRVTools);

        assertEquals(
            binaryToTextWithSPVTools(a),
            binaryToTextWithSPVTools(b)
        );

        memFree(b);
        memFree(a);
    }

    public void testGLSLangCompile() {
        glslang_initialize_process();

        IntBuffer a = compileWithGLSLang(false, null);
        IntBuffer b = compileWithGLSLang(true, ShadercTest::optimizeWithSPIRVTools);

        glslang_finalize_process();

        assertEquals(
            binaryToTextWithSPVTools(a),
            binaryToTextWithSPVTools(b)
        );

        memFree(b);
        memFree(a);
    }

    private static IntBuffer compileWithShaderc(int optimizationLevel, @Nullable Function<IntBuffer, IntBuffer> optimizer) {
        long compiler = shaderc_compiler_initialize();
        assertNotEquals(compiler, NULL);

        long options = shaderc_compile_options_initialize();
        assertNotEquals(compiler, NULL);

        shaderc_compile_options_set_source_language(options, shaderc_source_language_glsl);
        shaderc_compile_options_set_target_env(options, shaderc_target_env_opengl, shaderc_env_version_opengl_4_5);
        shaderc_compile_options_set_target_spirv(options, shaderc_spirv_version_1_0);
        shaderc_compile_options_set_optimization_level(options, optimizationLevel);
        shaderc_compile_options_set_generate_debug_info(options);

        long result = shaderc_compile_into_spv(
            compiler,
            PROGRAM,
            shaderc_glsl_fragment_shader,
            "a.glsl",
            "main",
            options
        );
        assertNotEquals(result, NULL);

        shaderc_compile_options_release(options);
        shaderc_compiler_release(compiler);

        assertEquals(shaderc_result_get_compilation_status(result), shaderc_compilation_status_success);

        long resultLength = shaderc_result_get_length(result);
        assertNotEquals(resultLength, 0L);

        ByteBuffer bb = Objects.requireNonNull(shaderc_result_get_bytes(result));
        assertEquals(bb.remaining(), resultLength);

        IntBuffer spirv;

        if (optimizer != null) {
            spirv = optimizer.apply(bb.asIntBuffer());
        } else {
            spirv = memAllocInt(bb.remaining() / Integer.BYTES);
            spirv
                .put(bb.asIntBuffer())
                .flip();
        }

        shaderc_result_release(result);

        return spirv;
    }

    private static IntBuffer compileWithGLSLang(boolean disableOptimizer, @Nullable Function<IntBuffer, IntBuffer> optimizer) {
        ByteBuffer shaderSource = memUTF8(PROGRAM);

        GLSLangInput input = GLSLangInput.calloc()
            .language(GLSLANG_SOURCE_GLSL)
            .stage(GLSLANG_STAGE_FRAGMENT)
            .client(GLSLANG_CLIENT_OPENGL)
            .client_version(GLSLANG_TARGET_OPENGL_450)
            .target_language(GLSLANG_TARGET_SPV)
            .target_language_version(GLSLANG_TARGET_SPV_1_0)
            .code(shaderSource)
            .default_version(100)
            .default_profile(GLSLANG_NO_PROFILE)
            .force_default_version_and_profile(false)
            .forward_compatible(false)
            .messages(GLSLANG_MSG_DEFAULT_BIT)
            .resource(glslang_default_resource());

        long shader = glslang_shader_create(input);
        assertNotEquals(shader, NULL);

        assertTrue(glslang_shader_preprocess(shader, input));
        assertTrue(glslang_shader_parse(shader, input));

        memFree(shaderSource);
        input.free();

        long program = glslang_program_create();
        assertNotEquals(program, NULL);

        glslang_program_add_shader(program, shader);

        assertTrue(glslang_program_link(program, GLSLANG_MSG_SPV_RULES_BIT));

        GLSLangSPVOptions options = GLSLangSPVOptions.calloc()
            .validate(true)
            .disable_optimizer(disableOptimizer)
            .optimize_size(!disableOptimizer); // https://github.com/KhronosGroup/glslang/issues/1298

        glslang_program_SPIRV_generate_with_options(program, GLSLANG_STAGE_FRAGMENT, options);

        options.free();

        IntBuffer spirv = memAllocInt((int)glslang_program_SPIRV_get_size(program));
        glslang_program_SPIRV_get(program, spirv);

        assertNull(glslang_program_SPIRV_get_messages(program));

        glslang_program_delete(program);
        glslang_shader_delete(shader);

        if (optimizer != null) {
            try {
                return optimizer.apply(spirv);
            } finally {
                memFree(spirv);
            }
        }

        return spirv;
    }

    private static IntBuffer optimizeWithSPIRVTools(IntBuffer spirvUnoptimized) {
        long optimizer = spvOptimizerCreate(SPV_ENV_OPENGL_4_5);
        assertNotEquals(optimizer, NULL);

        spvOptimizerRegisterLegalizationPasses(optimizer);
        spvOptimizerRegisterPerformancePasses(optimizer);

        long options = spvOptimizerOptionsCreate();
        assertNotEquals(options, NULL);

        spvOptimizerOptionsSetRunValidator(options, true);

        SPVBinary spirvOptimized;
        try (MemoryStack stack = stackPush()) {
            PointerBuffer pp = stack.mallocPointer(1);

            int result = spvOptimizerRun(optimizer, spirvUnoptimized, pp, options);
            assertEquals(result, SPV_SUCCESS);

            spirvOptimized = SPVBinary.create(pp.get(0));
        }

        spvOptimizerOptionsDestroy(options);
        spvOptimizerDestroy(optimizer);

        IntBuffer spirv = memAllocInt((int)spirvOptimized.wordCount());
        spirv
            .put(spirvOptimized.code())
            .flip();

        spvBinaryDestroy(spirvOptimized);

        return spirv;
    }

    private static String binaryToTextWithSPVTools(IntBuffer spirv) {
        String spirvText;

        try (MemoryStack stack = stackPush()) {
            PointerBuffer pp = stack.callocPointer(1);

            long context = spvContextCreate(SPV_ENV_OPENGL_4_5);

            int result = spvBinaryToText(
                context,
                spirv,
                SPV_BINARY_TO_TEXT_OPTION_INDENT |
                SPV_BINARY_TO_TEXT_OPTION_NO_HEADER |
                SPV_BINARY_TO_TEXT_OPTION_FRIENDLY_NAMES |
                SPV_BINARY_TO_TEXT_OPTION_NESTED_INDENT |
                SPV_BINARY_TO_TEXT_OPTION_REORDER_BLOCKS,
                pp,
                null
            );
            assertEquals(result, SPV_SUCCESS);

            SPVText text = SPVText.create(pp.get(0));
            spirvText = text.strString();
            spvTextDestroy(text);

            spvContextDestroy(context);
        }

        return spirvText;
    }

}
