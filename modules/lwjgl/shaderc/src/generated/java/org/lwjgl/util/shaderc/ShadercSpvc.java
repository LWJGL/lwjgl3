/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.shaderc;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the libshaderc_spvc C API of the <a target="_blank" href="https://github.com/google/shaderc/">shaderc</a> library. */
public class ShadercSpvc {

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #shaderc_spvc_msl_platform_ios msl_platform_ios}</li>
     * <li>{@link #shaderc_spvc_msl_platform_macos msl_platform_macos}</li>
     * </ul>
     */
    public static final int
        shaderc_spvc_msl_platform_ios   = 0,
        shaderc_spvc_msl_platform_macos = 1;

    protected ShadercSpvc() {
        throw new UnsupportedOperationException();
    }

    private static final SharedLibrary SHADERC = Library.loadNative(ShadercSpvc.class, "org.lwjgl.shaderc", Configuration.SHADERC_SPVC_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("shaderc_spvc")), true);

    /** Contains the function pointers loaded from the shaderc {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            compiler_initialize                                 = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compiler_initialize"),
            compiler_release                                    = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compiler_release"),
            compile_options_initialize                          = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_initialize"),
            compile_options_clone                               = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_clone"),
            compile_options_release                             = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_release"),
            compile_options_set_entry_point                     = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_entry_point"),
            compile_options_set_remove_unused_variables         = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_remove_unused_variables"),
            compile_options_set_robust_buffer_access_pass       = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_robust_buffer_access_pass"),
            compile_options_set_source_env                      = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_source_env"),
            compile_options_set_target_env                      = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_target_env"),
            compile_options_set_vulkan_semantics                = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_vulkan_semantics"),
            compile_options_set_separate_shader_objects         = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_separate_shader_objects"),
            compile_options_set_flatten_ubo                     = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_flatten_ubo"),
            compile_options_set_glsl_language_version           = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_glsl_language_version"),
            compile_options_set_flatten_multidimensional_arrays = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_flatten_multidimensional_arrays"),
            compile_options_set_es                              = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_es"),
            compile_options_set_glsl_emit_push_constant_as_ubo  = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_glsl_emit_push_constant_as_ubo"),
            compile_options_set_msl_language_version            = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_msl_language_version"),
            compile_options_set_msl_swizzle_texture_samples     = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_msl_swizzle_texture_samples"),
            compile_options_set_msl_platform                    = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_msl_platform"),
            compile_options_set_msl_pad_fragment_output         = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_msl_pad_fragment_output"),
            compile_options_set_msl_capture                     = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_msl_capture"),
            compile_options_set_msl_domain_lower_left           = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_msl_domain_lower_left"),
            compile_options_set_msl_argument_buffers            = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_msl_argument_buffers"),
            compile_options_set_msl_discrete_descriptor_sets    = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_msl_discrete_descriptor_sets"),
            compile_options_set_hlsl_shader_model               = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_hlsl_shader_model"),
            compile_options_set_hlsl_point_size_compat          = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_hlsl_point_size_compat"),
            compile_options_set_hlsl_point_coord_compat         = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_hlsl_point_coord_compat"),
            compile_options_set_fixup_clipspace                 = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_fixup_clipspace"),
            compile_options_set_flip_vert_y                     = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_flip_vert_y"),
            compile_options_set_validate                        = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_validate"),
            compile_options_set_optimize                        = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_optimize"),
            compile_options_set_for_fuzzing                     = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_for_fuzzing"),
            compile_into_glsl                                   = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_into_glsl"),
            compile_into_hlsl                                   = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_into_hlsl"),
            compile_into_msl                                    = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_into_msl"),
            compile_into_vulkan                                 = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_into_vulkan"),
            result_release                                      = apiGetFunctionAddress(SHADERC, "shaderc_spvc_result_release"),
            result_get_status                                   = apiGetFunctionAddress(SHADERC, "shaderc_spvc_result_get_status"),
            result_get_messages                                 = apiGetFunctionAddress(SHADERC, "shaderc_spvc_result_get_messages"),
            result_get_string_output                            = apiGetFunctionAddress(SHADERC, "shaderc_spvc_result_get_string_output"),
            result_get_binary_output                            = apiGetFunctionAddress(SHADERC, "shaderc_spvc_result_get_binary_output"),
            result_get_binary_length                            = apiGetFunctionAddress(SHADERC, "shaderc_spvc_result_get_binary_length");

    }

    /** Returns the shaderc {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return SHADERC;
    }

    // --- [ shaderc_spvc_compiler_initialize ] ---

    /**
     * Create a compiler.
     * 
     * <p>A return of {@code NULL} indicates that there was an error. Any function operating on a {@code *_compiler_t} must offer the <a target="_blank" href="http://herbsutter.com/2014/01/13/gotw-95-solution-thread-safety-and-synchronization/">basic thread-safety guarantee</a>. That is: concurrent invocation of these functions on DIFFERENT objects needs no synchronization; concurrent invocation of these functions on the
     * SAME object requires synchronization IF AND ONLY IF some of them take a non-const argument.</p>
     */
    @NativeType("shaderc_spvc_compiler_t")
    public static long shaderc_spvc_compiler_initialize() {
        long __functionAddress = Functions.compiler_initialize;
        return invokeP(__functionAddress);
    }

    // --- [ shaderc_spvc_compiler_release ] ---

    /**
     * Release resources.
     * 
     * <p>After this the handle cannot be used.</p>
     */
    public static void shaderc_spvc_compiler_release(@NativeType("shaderc_spvc_compiler_t") long compiler) {
        long __functionAddress = Functions.compiler_release;
        if (CHECKS) {
            check(compiler);
        }
        invokePV(compiler, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_initialize ] ---

    /**
     * Returns default compiler options.
     * 
     * <p>A return of {@code NULL} indicates that there was an error initializing the options. Any function operating on {@code shaderc_spvc_compile_options_t} must
     * offer the basic thread-safety guarantee.</p>
     */
    @NativeType("shaderc_spvc_compile_options_t")
    public static long shaderc_spvc_compile_options_initialize() {
        long __functionAddress = Functions.compile_options_initialize;
        return invokeP(__functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_clone ] ---

    /**
     * Returns a copy of the given options.
     * 
     * <p>If {@code NULL} is passed as the parameter the call is the same as {@link #shaderc_spvc_compile_options_initialize compile_options_initialize}.</p>
     */
    @NativeType("shaderc_spvc_compile_options_t")
    public static long shaderc_spvc_compile_options_clone(@NativeType("shaderc_spvc_compile_options_t const") long options) {
        long __functionAddress = Functions.compile_options_clone;
        return invokePP(options, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_release ] ---

    /**
     * Releases the compilation options.
     * 
     * <p>It is invalid to use the given option object in any future calls. It is safe to pass {@code NULL} to this function, and doing such will have no effect.</p>
     */
    public static void shaderc_spvc_compile_options_release(@NativeType("shaderc_spvc_compile_options_t") long options) {
        long __functionAddress = Functions.compile_options_release;
        invokePV(options, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_entry_point ] ---

    /** Unsafe version of: {@link #shaderc_spvc_compile_options_set_entry_point compile_options_set_entry_point} */
    public static void nshaderc_spvc_compile_options_set_entry_point(long options, long entry_point) {
        long __functionAddress = Functions.compile_options_set_entry_point;
        if (CHECKS) {
            check(options);
        }
        invokePPV(options, entry_point, __functionAddress);
    }

    /** Sets the entry point. */
    public static void shaderc_spvc_compile_options_set_entry_point(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("char const *") ByteBuffer entry_point) {
        if (CHECKS) {
            checkNT1(entry_point);
        }
        nshaderc_spvc_compile_options_set_entry_point(options, memAddress(entry_point));
    }

    /** Sets the entry point. */
    public static void shaderc_spvc_compile_options_set_entry_point(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("char const *") CharSequence entry_point) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(entry_point, true);
            long entry_pointEncoded = stack.getPointerAddress();
            nshaderc_spvc_compile_options_set_entry_point(options, entry_pointEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ shaderc_spvc_compile_options_set_remove_unused_variables ] ---

    /** If true, unused variables will not appear in the output. */
    public static void shaderc_spvc_compile_options_set_remove_unused_variables(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_remove_unused_variables;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_robust_buffer_access_pass ] ---

    /**
     * If true, enable robust buffer access pass in the spirv-opt, meaning:
     * 
     * <p>Inject code to clamp indexed accesses to buffers and internal arrays, providing guarantees satisfying Vulkan's {@code robustBufferAccess} rules. This
     * is useful when an implementation does not support robust-buffer access as a driver option.</p>
     */
    public static void shaderc_spvc_compile_options_set_robust_buffer_access_pass(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_robust_buffer_access_pass;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_source_env ] ---

    /**
     * Sets the source shader environment, affecting which warnings or errors will be issued during validation.
     * 
     * <p>Default value for environment is Vulkan 1.0.</p>
     */
    public static void shaderc_spvc_compile_options_set_source_env(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("shaderc_target_env") int env, @NativeType("shaderc_env_version") int version) {
        long __functionAddress = Functions.compile_options_set_source_env;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, env, version, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_target_env ] ---

    /**
     * Sets the target shader environment, if this is different from the source environment, then a transform between the environments will be performed if
     * possible.
     * 
     * <p>Currently only WebGPU &lt;-&gt; Vulkan 1.1 are defined. Default value for environment is Vulkan 1.0.</p>
     */
    public static void shaderc_spvc_compile_options_set_target_env(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("shaderc_target_env") int env, @NativeType("shaderc_env_version") int version) {
        long __functionAddress = Functions.compile_options_set_target_env;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, env, version, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_vulkan_semantics ] ---

    /** If true, Vulkan GLSL features are used instead of GL-compatible features. */
    public static void shaderc_spvc_compile_options_set_vulkan_semantics(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_vulkan_semantics;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_separate_shader_objects ] ---

    /**
     * If true, {@code gl_PerVertex} is explicitly redeclared in vertex, geometry and tessellation shaders.
     * 
     * <p>The members of {@code gl_PerVertex} is determined by which built-ins are declared by the shader.</p>
     */
    public static void shaderc_spvc_compile_options_set_separate_shader_objects(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_separate_shader_objects;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_flatten_ubo ] ---

    /** Flatten uniform or push constant variable into {@code (i|u)vec4} array. */
    public static void shaderc_spvc_compile_options_set_flatten_ubo(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_flatten_ubo;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_glsl_language_version ] ---

    /**
     * Set GLSL language version.
     * 
     * <p>Default is 450 (i.e. 4.5).</p>
     */
    public static void shaderc_spvc_compile_options_set_glsl_language_version(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("uint32_t") int version) {
        long __functionAddress = Functions.compile_options_set_glsl_language_version;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, version, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_flatten_multidimensional_arrays ] ---

    /** If true, flatten multidimensional arrays, e.g. {@code foo[a][b][c] -> foo[a*b*c]}. Default is false. */
    public static void shaderc_spvc_compile_options_set_flatten_multidimensional_arrays(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_flatten_multidimensional_arrays;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_es ] ---

    /** Force interpretion as ES, or not.  Default is to detect from source. */
    public static void shaderc_spvc_compile_options_set_es(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_es;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_glsl_emit_push_constant_as_ubo ] ---

    /** If true, emit push constants as uniform buffer objects.  Default is false. */
    public static void shaderc_spvc_compile_options_set_glsl_emit_push_constant_as_ubo(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_glsl_emit_push_constant_as_ubo;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_msl_language_version ] ---

    /**
     * Set MSL language version.
     * 
     * <p>Default is 10200 (i.e. 1.2).</p>
     */
    public static void shaderc_spvc_compile_options_set_msl_language_version(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("uint32_t") int version) {
        long __functionAddress = Functions.compile_options_set_msl_language_version;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, version, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_msl_swizzle_texture_samples ] ---

    /** If true, swizzle MSL texture samples.  Default is false. */
    public static void shaderc_spvc_compile_options_set_msl_swizzle_texture_samples(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_msl_swizzle_texture_samples;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_msl_platform ] ---

    /** Choose MSL platform.  Default is MacOS. */
    public static void shaderc_spvc_compile_options_set_msl_platform(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("shaderc_spvc_msl_platform") int platform) {
        long __functionAddress = Functions.compile_options_set_msl_platform;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, platform, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_msl_pad_fragment_output ] ---

    /** If true, pad MSL fragment output. Default is false. */
    public static void shaderc_spvc_compile_options_set_msl_pad_fragment_output(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_msl_pad_fragment_output;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_msl_capture ] ---

    /** If true, capture MSL output to buffer. Default is false. */
    public static void shaderc_spvc_compile_options_set_msl_capture(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_msl_capture;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_msl_domain_lower_left ] ---

    /** If true, flip the Y-coord of the built-in {@code TessCoord}. Default is top left. */
    public static void shaderc_spvc_compile_options_set_msl_domain_lower_left(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_msl_domain_lower_left;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_msl_argument_buffers ] ---

    /** Enable use of MSL 2.0 indirect argument buffers. Default is not to use them. */
    public static void shaderc_spvc_compile_options_set_msl_argument_buffers(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_msl_argument_buffers;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_msl_discrete_descriptor_sets ] ---

    /** Unsafe version of: {@link #shaderc_spvc_compile_options_set_msl_discrete_descriptor_sets compile_options_set_msl_discrete_descriptor_sets} */
    public static void nshaderc_spvc_compile_options_set_msl_discrete_descriptor_sets(long options, long descriptors, long num_descriptors) {
        long __functionAddress = Functions.compile_options_set_msl_discrete_descriptor_sets;
        if (CHECKS) {
            check(options);
        }
        invokePPPV(options, descriptors, num_descriptors, __functionAddress);
    }

    /**
     * When using MSL argument buffers, force "classic" MSL 1.0 binding for the given descriptor sets. This corresponds to {@code VK_KHR_push_descriptor} in
     * Vulkan.
     */
    public static void shaderc_spvc_compile_options_set_msl_discrete_descriptor_sets(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("uint32_t const *") IntBuffer descriptors) {
        nshaderc_spvc_compile_options_set_msl_discrete_descriptor_sets(options, memAddress(descriptors), descriptors.remaining());
    }

    // --- [ shaderc_spvc_compile_options_set_hlsl_shader_model ] ---

    /**
     * Set HLSL shader model.
     * 
     * <p>Default is 30.</p>
     */
    public static void shaderc_spvc_compile_options_set_hlsl_shader_model(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("uint32_t") int model) {
        long __functionAddress = Functions.compile_options_set_hlsl_shader_model;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, model, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_hlsl_point_size_compat ] ---

    /** If true, ignore {@code PointSize}. Default is false. */
    public static void shaderc_spvc_compile_options_set_hlsl_point_size_compat(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_hlsl_point_size_compat;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_hlsl_point_coord_compat ] ---

    /** If true, ignore {@code PointCoord}. Default is false. */
    public static void shaderc_spvc_compile_options_set_hlsl_point_coord_compat(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_hlsl_point_coord_compat;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_fixup_clipspace ] ---

    /**
     * If true (default is false):
     * 
     * <ul>
     * <li>GLSL: map depth from Vulkan/D3D style to GL style, i.e. {@code [ 0,w] -> [-w,w]}</li>
     * <li>MSL : map depth from GL style to Vulkan/D3D style, i.e. {@code [-w,w] -> [ 0,w]}</li>
     * <li>HLSL: map depth from GL style to Vulkan/D3D style, i.e. {@code [-w,w] -> [ 0,w]}</li>
     * </ul>
     */
    public static void shaderc_spvc_compile_options_set_fixup_clipspace(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_fixup_clipspace;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_flip_vert_y ] ---

    /**
     * If true invert {@code gl_Position.y} or equivalent.
     * 
     * <p>Default is false.</p>
     */
    public static void shaderc_spvc_compile_options_set_flip_vert_y(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_flip_vert_y;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_validate ] ---

    /** Set if validation should be performed. Default is true. */
    public static void shaderc_spvc_compile_options_set_validate(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_validate;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_optimize ] ---

    /** Set if optimization should be performed. Default is true. */
    public static void shaderc_spvc_compile_options_set_optimize(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_optimize;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_for_fuzzing ] ---

    /** Unsafe version of: {@link #shaderc_spvc_compile_options_set_for_fuzzing compile_options_set_for_fuzzing} */
    public static long nshaderc_spvc_compile_options_set_for_fuzzing(long options, long data, long size) {
        long __functionAddress = Functions.compile_options_set_for_fuzzing;
        if (CHECKS) {
            check(options);
        }
        return invokePPPP(options, data, size, __functionAddress);
    }

    /**
     * Fill options with given data.
     *
     * @return amount of data used, or zero if not enough data was given
     */
    @NativeType("size_t")
    public static long shaderc_spvc_compile_options_set_for_fuzzing(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("uint8_t const *") ByteBuffer data) {
        return nshaderc_spvc_compile_options_set_for_fuzzing(options, memAddress(data), data.remaining());
    }

    // --- [ shaderc_spvc_compile_into_glsl ] ---

    /** Unsafe version of: {@link #shaderc_spvc_compile_into_glsl compile_into_glsl} */
    public static long nshaderc_spvc_compile_into_glsl(long compiler, long source, long source_len, long options) {
        long __functionAddress = Functions.compile_into_glsl;
        if (CHECKS) {
            check(compiler);
            check(options);
        }
        return invokePPPPP(compiler, source, source_len, options, __functionAddress);
    }

    /** Takes SPIR-V as a sequence of 32-bit words, validates it, then compiles to GLSL. */
    @NativeType("shaderc_spvc_compilation_result_t")
    public static long shaderc_spvc_compile_into_glsl(@NativeType("shaderc_spvc_compiler_t const") long compiler, @NativeType("uint32_t const *") IntBuffer source, @NativeType("shaderc_spvc_compile_options_t") long options) {
        return nshaderc_spvc_compile_into_glsl(compiler, memAddress(source), source.remaining(), options);
    }

    // --- [ shaderc_spvc_compile_into_hlsl ] ---

    /** Unsafe version of: {@link #shaderc_spvc_compile_into_hlsl compile_into_hlsl} */
    public static long nshaderc_spvc_compile_into_hlsl(long compiler, long source, long source_len, long options) {
        long __functionAddress = Functions.compile_into_hlsl;
        if (CHECKS) {
            check(compiler);
            check(options);
        }
        return invokePPPPP(compiler, source, source_len, options, __functionAddress);
    }

    /** Takes SPIR-V as a sequence of 32-bit words, validates it, then compiles to HLSL. */
    @NativeType("shaderc_spvc_compilation_result_t")
    public static long shaderc_spvc_compile_into_hlsl(@NativeType("shaderc_spvc_compiler_t const") long compiler, @NativeType("uint32_t const *") IntBuffer source, @NativeType("shaderc_spvc_compile_options_t") long options) {
        return nshaderc_spvc_compile_into_hlsl(compiler, memAddress(source), source.remaining(), options);
    }

    // --- [ shaderc_spvc_compile_into_msl ] ---

    /** Unsafe version of: {@link #shaderc_spvc_compile_into_msl compile_into_msl} */
    public static long nshaderc_spvc_compile_into_msl(long compiler, long source, long source_len, long options) {
        long __functionAddress = Functions.compile_into_msl;
        if (CHECKS) {
            check(compiler);
            check(options);
        }
        return invokePPPPP(compiler, source, source_len, options, __functionAddress);
    }

    /** Takes SPIR-V as a sequence of 32-bit words, validates it, then compiles to MSL. */
    @NativeType("shaderc_spvc_compilation_result_t")
    public static long shaderc_spvc_compile_into_msl(@NativeType("shaderc_spvc_compiler_t const") long compiler, @NativeType("uint32_t const *") IntBuffer source, @NativeType("shaderc_spvc_compile_options_t") long options) {
        return nshaderc_spvc_compile_into_msl(compiler, memAddress(source), source.remaining(), options);
    }

    // --- [ shaderc_spvc_compile_into_vulkan ] ---

    /** Unsafe version of: {@link #shaderc_spvc_compile_into_vulkan compile_into_vulkan} */
    public static long nshaderc_spvc_compile_into_vulkan(long compiler, long source, long source_len, long options) {
        long __functionAddress = Functions.compile_into_vulkan;
        if (CHECKS) {
            check(compiler);
            check(options);
        }
        return invokePPPPP(compiler, source, source_len, options, __functionAddress);
    }

    /** Takes SPIR-V as a sequence of 32-bit words, validates it, then compiles to Vulkan specific SPIR-V. */
    @NativeType("shaderc_spvc_compilation_result_t")
    public static long shaderc_spvc_compile_into_vulkan(@NativeType("shaderc_spvc_compiler_t const") long compiler, @NativeType("uint32_t const *") IntBuffer source, @NativeType("shaderc_spvc_compile_options_t") long options) {
        return nshaderc_spvc_compile_into_vulkan(compiler, memAddress(source), source.remaining(), options);
    }

    // --- [ shaderc_spvc_result_release ] ---

    /**
     * Releases the resources held by the result object.
     * 
     * <p>It is invalid to use the result object for any further operations.</p>
     */
    public static void shaderc_spvc_result_release(@NativeType("shaderc_spvc_compilation_result_t") long result) {
        long __functionAddress = Functions.result_release;
        if (CHECKS) {
            check(result);
        }
        invokePV(result, __functionAddress);
    }

    // --- [ shaderc_spvc_result_get_status ] ---

    /**
     * Returns the compilation status, indicating whether the compilation succeeded, or failed due to some reasons, like invalid shader stage or compilation
     * errors.
     */
    @NativeType("shaderc_compilation_status")
    public static int shaderc_spvc_result_get_status(@NativeType("shaderc_spvc_compilation_result_t const") long result) {
        long __functionAddress = Functions.result_get_status;
        if (CHECKS) {
            check(result);
        }
        return invokePI(result, __functionAddress);
    }

    // --- [ shaderc_spvc_result_get_messages ] ---

    /** Unsafe version of: {@link #shaderc_spvc_result_get_messages result_get_messages} */
    public static long nshaderc_spvc_result_get_messages(long result) {
        long __functionAddress = Functions.result_get_messages;
        if (CHECKS) {
            check(result);
        }
        return invokePP(result, __functionAddress);
    }

    /** Get validation/compilation error or informational messages. */
    @Nullable
    @NativeType("char const *")
    public static String shaderc_spvc_result_get_messages(@NativeType("shaderc_spvc_compilation_result_t const") long result) {
        long __result = nshaderc_spvc_result_get_messages(result);
        return memUTF8Safe(__result);
    }

    // --- [ shaderc_spvc_result_get_string_output ] ---

    /** Unsafe version of: {@link #shaderc_spvc_result_get_string_output result_get_string_output} */
    public static long nshaderc_spvc_result_get_string_output(long result) {
        long __functionAddress = Functions.result_get_string_output;
        if (CHECKS) {
            check(result);
        }
        return invokePP(result, __functionAddress);
    }

    /**
     * Get validation/compilation result as a string.
     * 
     * <p>This is only supported compiling to GLSL, HSL, and MSL.</p>
     */
    @Nullable
    @NativeType("char const *")
    public static String shaderc_spvc_result_get_string_output(@NativeType("shaderc_spvc_compilation_result_t const") long result) {
        long __result = nshaderc_spvc_result_get_string_output(result);
        return memUTF8Safe(__result);
    }

    // --- [ shaderc_spvc_result_get_binary_output ] ---

    /** Unsafe version of: {@link #shaderc_spvc_result_get_binary_output result_get_binary_output} */
    public static long nshaderc_spvc_result_get_binary_output(long result) {
        long __functionAddress = Functions.result_get_binary_output;
        if (CHECKS) {
            check(result);
        }
        return invokePP(result, __functionAddress);
    }

    /**
     * Get validation/compilation result as a binary buffer.
     * 
     * <p>This is only supported compiling to Vulkan.</p>
     */
    @Nullable
    @NativeType("uint32_t const *")
    public static IntBuffer shaderc_spvc_result_get_binary_output(@NativeType("shaderc_spvc_compilation_result_t const") long result) {
        long __result = nshaderc_spvc_result_get_binary_output(result);
        return memIntBufferSafe(__result, shaderc_spvc_result_get_binary_length(result));
    }

    /**
     * Get validation/compilation result as a binary buffer.
     * 
     * <p>This is only supported compiling to Vulkan.</p>
     */
    @Nullable
    @NativeType("uint32_t const *")
    public static IntBuffer shaderc_spvc_result_get_binary_output(@NativeType("shaderc_spvc_compilation_result_t const") long result, long length) {
        long __result = nshaderc_spvc_result_get_binary_output(result);
        return memIntBufferSafe(__result, (int)length);
    }

    // --- [ shaderc_spvc_result_get_binary_length ] ---

    /**
     * Get length of validation/compilation result as a binary buffer.
     * 
     * <p>This is only supported compiling to Vulkan.</p>
     */
    @NativeType("uint32_t")
    public static int shaderc_spvc_result_get_binary_length(@NativeType("shaderc_spvc_compilation_result_t const") long result) {
        long __functionAddress = Functions.result_get_binary_length;
        if (CHECKS) {
            check(result);
        }
        return invokePI(result, __functionAddress);
    }

}