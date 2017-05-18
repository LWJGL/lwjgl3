/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT = "EXT"
val KHR = "KHR"

val AMD = "AMD"
val ANDROID = "ANDROID"
val ANGLE = "ANGLE"
val APPLE = "APPLE"
val ARM = "ARM"
val DMP = "DMP"
val FJ = "FJ"
val IMG = "IMG"
val INTEL = "INTEL"
val NV = "NV"
val NVX = "NVX"
val OES = "OES"
val OVR = "OVR"
val QCOM = "QCOM"
val VIV = "VIV"

private val NativeClass.cap: String get() = "{@link \\#$capName $templateName}"

val ANDROID_extension_pack_es31a = EXT_FLAG.nativeClassGLES("ANDROID_extension_pack_es31a", postfix = ANDROID) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension changes little functionality directly. Instead it serves to roll up the 20 extensions it requires, allowing applications to check for
        all of them at once, and enable all of their shading language features with a single \#extension statement. The Android platform provides special
        support outside of OpenGL ES to help applications target this set of extensions.

        In addition, this extension ensures support for images, shader storage buffers, and atomic counters in fragment shaders. In unextended OpenGL ES the
        minimum value of the relevant implementation-defined limits is zero; this extension raises these minimums to match the minimums for compute shaders.

        Requires ${GLES31.core}.
        """
}

val APPLE_color_buffer_packed_float = EXT_FLAG.nativeClassGLES("APPLE_color_buffer_packed_float", postfix = APPLE) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension allows two packed floating point formats R11F_G11F_B10F and as RGB9_E5 defined in APPLE_texture_packed_float or OpenGL ES 3.0 or to be
        rendered to via framebuffer objects.

        Requires ${EXT_color_buffer_half_float.link} and ${GLES30.core} or ${APPLE_texture_packed_float.link}.
        """
}

val ARM_rgba8 = EXT_FLAG.nativeClassGLES("ARM_rgba8", postfix = ARM) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension enables a RGBA8 renderbuffer storage format. It is similar to OES_rgb8_rgba8, but only exposes RGBA8.

        Requires ${GLES20.core}.
        """
}

val ARM_shader_framebuffer_fetch_depth_stencil = EXT_FLAG.nativeClassGLES("ARM_shader_framebuffer_fetch_depth_stencil", postfix = ARM) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        Existing extensions, such as EXT_shader_framebuffer_fetch, allow fragment shaders to read existing framebuffer color data as input. This enables
        use-cases such as programmable blending, and other operations that may not be possible to implement with fixed-function blending.

        This extension adds similar capabilities for depth and stencil values.

        One use-case for this is soft depth-blending of particles. Normally, this would require two render passes: one that writes out the depth values of the
        background geometry to a depth texture, and one that renders the particles while reading from the depth texture to do the blending. This extension
        allows this to be done in a single pass.

        Requires ${GLES20.core}.
        """
}

val EXT_color_buffer_float = EXT_FLAG.nativeClassGLES("EXT_color_buffer_float", postfix = EXT) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension allows a variety of floating point formats to be rendered to via framebuffer objects.

        Requires ${GLES30.core}.
        """
}

val EXT_conservative_depth = EXT_FLAG.nativeClassGLES("EXT_conservative_depth", postfix = EXT) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        There is a common optimization for hardware accelerated implementation of OpenGL ES which relies on an early depth test to be run before the fragment
        shader so that the shader evaluation can be skipped if the fragment ends up being discarded because it is occluded.

        This optimization does not affect the final rendering, and is typically possible when the fragment does not change the depth programmatically. (i.e.:
        it does not write to the built-in {@code gl_FragDepth} output). There are, however a class of operations on the depth in the shader which could still
        be performed while allowing the early depth test to operate.

        This extension allows the application to pass enough information to the GL implementation to activate such optimizations safely.

        Requires ${GLES30.core}.
        """
}

val EXT_EGL_image_array = EXT_FLAG.nativeClassGLES("EXT_EGL_image_array", postfix = EXT) {
    documentation =
        """
        This extension adds functionality to that provided by ${OES_EGL_image.link} in order to support EGLImage 2D arrays. It extends the existing
        {@code EGLImageTargetTexture2DOES} entry point from {@code OES_EGL_image}. Render buffers are not extended to include array support.

        {@code EGLImage} 2D arrays are created using {@code eglCreateImageKHR} as defined in the {@code EGL_EXT_gl_texture_2D_image_array} extension.
        """
}

val EXT_float_blend = EXT_FLAG.nativeClassGLES("EXT_float_blend", postfix = EXT) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension expands upon the EXT_color_buffer_float extension to allow support for blending with 32-bit floating-point color buffers.

        Requires ${EXT_color_buffer_float.cap}.
        """
}

val EXT_gpu_shader5 = EXT_FLAG.nativeClassGLES("EXT_gpu_shader5", postfix = EXT) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension provides a set of new features to the OpenGL ES Shading Language and related APIs to support capabilities of new GPUs, extending the
        capabilities of version 3.10 of the OpenGL ES Shading Language. Shaders using the new functionality provided by this extension should enable this
        functionality via the construct
        ${codeBlock("""
    \#extension GL_EXT_gpu_shader5 : require (or enable)""")}
        This extension provides a variety of new features for all shader types, including:
        ${ul(
            "support for indexing into arrays of opaque types (samplers, and atomic counters) using dynamically uniform integer expressions;",
            "support for indexing into arrays of images and shader storage blocks using only constant integral expressions;",
            "extending the uniform block capability to allow shaders to index into an array of uniform blocks;",
            """
            a "precise" qualifier allowing computations to be carried out exactly as specified in the shader source to avoid optimization-induced invariance
            issues (which might cause cracking in tessellation);
            """,
            """
            new built-in functions supporting:
            ${ul(
                "fused floating-point multiply-add operations;"
            )}
            """,
            """
            extending the textureGather() built-in functions provided by OpenGL ES Shading Language 3.10:
            ${ul(
                "allowing shaders to use arbitrary offsets computed at run-time to select a 2x2 footprint to gather from; and",
                "allowing shaders to use separate independent offsets for each of the four texels returned, instead of requiring a fixed 2x2 footprint."
            )}
            """
        )}

        Requires ${GLES31.core}.
        """
}

val EXT_multisampled_render_to_texture2 = EXT_FLAG.nativeClassGLES("EXT_multisampled_render_to_texture2", postfix = EXT) {
    documentation =
        """
        The {@code attachment} parameters for #FramebufferTexture2DMultisampleEXT() is no longer required to be #COLOR_ATTACHMENT0. The attachment parameter
        now matches what is allowed in #FramebufferTexture2D(). This means values like {@code GL_COLOR_ATTACHMENTi}, #DEPTH_ATTACHMENT, #STENCIL_ATTACHMENT, or
        #DEPTH_STENCIL_ATTACHMENT may be used. After the application has rendered into the mutisampled buffer, the application should be careful to not
        trigger an implicit flush by performing a client side read of the buffer (readpixels, copyteximage, blitframebuffer, etc) before any subsequent
        rendering which uses the contents of the buffer. This may cause the attachment to be downsampled before the following draw, which would potentially
        cause corruption.
        """
}

val EXT_post_depth_coverage = EXT_FLAG.nativeClassGLES("EXT_post_depth_coverage", postfix = EXT) {
    documentation =
        """
        When true, the ${registryLink("EXT", "post_depth_coverage")} extension is supported.

        This extension allows the fragment shader to control whether values in gl_SampleMaskIn[] reflect the coverage after application of the early depth and
        stencil tests. This feature can be enabled with the following layout qualifier in the fragment shader:
        ${codeBlock("""
    layout(post_depth_coverage) in;""")}
        To use this feature, early fragment tests must also be enabled in the fragment shader via:
        ${codeBlock("""
    layout(early_fragment_tests) in;""")}
        Requires {@link \#GL_OES_sample_variables OES_sample_variables}.
        """
}

val EXT_shader_group_vote = EXT_FLAG.nativeClassGLES("EXT_shader_group_vote", postfix = EXT) {
    documentation =
        """
        This extension provides new built-in functions to compute the composite of a set of boolean conditions across a group of shader invocations. These
        composite results may be used to execute shaders more efficiently on a single-instruction multiple-data (SIMD) processor. The set of shader invocations
        across which boolean conditions are evaluated is implementation-dependent, and this extension provides no guarantee over how individual shader
        invocations are assigned to such sets. In particular, the set of shader invocations has no necessary relationship with the compute shader local work
        group -- a pair of shader invocations in a single compute shader work group may end up in different sets used by these built-ins.

        Compute shaders operate on an explicitly specified group of threads (a local work group), but many implementations of OpenGL ES 3.0 will even group
        non-compute shader invocations and execute them in a SIMD fashion. When executing code like
        ${codeBlock("""
if (condition) {
    result = do_fast_path();
} else {
    result = do_general_path();
}""")}
        where {@code condition} diverges between invocations, a SIMD implementation might first call do_fast_path() for the invocations where {@code condition}
        is true and leave the other invocations dormant. Once do_fast_path() returns, it might call do_general_path() for invocations where {@code condition}
        is false and leave the other invocations dormant. In this case, the shader executes *both* the fast and the general path and might be better off just
        using the general path for all invocations.

        This extension provides the ability to avoid divergent execution by evaluting a condition across an entire SIMD invocation group using code like:
        ${codeBlock("""
if (allInvocationsEXT(condition)) {
    result = do_fast_path();
} else {
    result = do_general_path();
}""")}
        The built-in function allInvocationsEXT() will return the same value for all invocations in the group, so the group will either execute do_fast_path()
        or do_general_path(), but never both. For example, shader code might want to evaluate a complex function iteratively by starting with an approximation
        of the result and then refining the approximation. Some input values may require a small number of iterations to generate an accurate result
        (do_fast_path) while others require a larger number (do_general_path). In another example, shader code might want to evaluate a complex function
        (do_general_path) that can be greatly simplified when assuming a specific value for one of its inputs (do_fast_path).
        """
}

val EXT_shader_implicit_conversions = EXT_FLAG.nativeClassGLES("EXT_shader_implicit_conversions", postfix = EXT) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension provides support for implicitly converting signed integer types to unsigned types, as well as more general implicit conversion and
        function overloading infrastructure to support new data types introduced by other extensions.

        Requires ${GLES31.core}.
        """
}

val EXT_shader_integer_mix = EXT_FLAG.nativeClassGLES("EXT_shader_integer_mix", postfix = EXT) {
    documentation =
        """
        When true, the ${registryLink("EXT", "shader_integer_mix")} extension is supported.

        GLSL 1.30 (and GLSL ES 3.00) expanded the mix() built-in function to operate on a boolean third argument that does not interpolate but selects. This
        extension extends mix() to select between int, uint, and bool components.

        Requires ${GLES30.core}.
        """
}

val EXT_shader_io_blocks = EXT_FLAG.nativeClassGLES("EXT_shader_io_blocks", postfix = EXT) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension extends the functionality of interface blocks to support input and output interfaces in the OpenGL ES Shading Language.

        Input and output interface blocks are used for forming the interfaces between vertex, tessellation control, tessellation evaluation, geometry and
        fragment shaders. This accommodates passing arrays between stages, which otherwise would require multi-dimensional array support for tessellation
        control outputs and for tessellation control, tessellation evaluation, and geometry shader inputs.

        This extension provides support for application defined interface blocks which are used for passing application-specific information between shader
        stages.

        This extension moves the built-in "per-vertex" in/out variables to a new built-in gl_PerVertex block. This is necessary for tessellation and geometry
        shaders which require a separate instance for each vertex, but it can also be useful for vertex shaders.

        Finally, this extension allows the redeclaration of the gl_PerVertex block in order to reduce the set of variables that must be passed between shaders.

        Requires ${GLES31.core}.
        """
}

val EXT_shader_non_constant_global_initializers = EXT_FLAG.nativeClassGLES("EXT_shader_non_constant_global_initializers", postfix = EXT) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension adds the ability to use non-constant initializers for global variables in the OpenGL ES Shading Language specifications. This
        functionality is already present in the OpenGL Shading language specification.
        """
}

val EXT_shader_texture_lod = EXT_FLAG.nativeClassGLES("EXT_shader_texture_lod", postfix = EXT) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension adds additional texture functions to the OpenGL ES Shading Language which provide the shader writer with explicit control of LOD.

        Mipmap texture fetches and anisotropic texture fetches require implicit derivatives to calculate rho, lambda and/or the line of anisotropy. These
        implicit derivatives will be undefined for texture fetches occurring inside non-uniform control flow or for vertex shader texture fetches, resulting in
        undefined texels.

        The additional texture functions introduced with this extension provide explicit control of LOD (isotropic texture functions) or provide explicit
        derivatives (anisotropic texture functions).

        Anisotropic texture functions return defined texels for mipmap texture fetches or anisotropic texture fetches, even inside non-uniform control flow.
        Isotropic texture functions return defined texels for mipmap texture fetches, even inside non-uniform control flow. However, isotropic texture
        functions return undefined texels for anisotropic texture fetches.

        The existing isotropic vertex texture functions:
        ${codeBlock("""
    vec4 texture2DLodEXT(sampler2D sampler,
                         vec2 coord,
                         float lod);
    vec4 texture2DProjLodEXT(sampler2D sampler,
                             vec3 coord,
                             float lod);
    vec4 texture2DProjLodEXT(sampler2D sampler,
                             vec4 coord,
                             float lod);

    vec4 textureCubeLodEXT(samplerCube sampler,
                           vec3 coord,
                           float lod);""")}
        are added to the built-in functions for fragment shaders with "EXT" suffix appended.

        New anisotropic texture functions, providing explicit derivatives:
        ${codeBlock("""
    vec4 texture2DGradEXT(sampler2D sampler,
                          vec2 P,
                          vec2 dPdx,
                          vec2  dPdy);
    vec4 texture2DProjGradEXT(sampler2D sampler,
                              vec3 P,
                              vec2 dPdx,
                              vec2 dPdy);
    vec4 texture2DProjGradEXT(sampler2D sampler,
                              vec4 P,
                              vec2 dPdx,
                              vec2 dPdy);

    vec4 textureCubeGradEXT(samplerCube sampler,
                            vec3 P,
                            vec3 dPdx,
                            vec3 dPdy);""")}
        are added to the built-in functions for vertex shaders and fragment shaders.
        """
}

val EXT_sparse_texture2 = EXT_FLAG.nativeClassGLES("EXT_sparse_texture2", postfix = EXT) {
    documentation =
        """
        This extension builds on the EXT_sparse_texture extension, providing the following new functionality:
        ${ul(
            """
            New built-in GLSL texture lookup and image load functions are provided that return information on whether the texels accessed for the texture
            lookup accessed uncommitted texture memory.
            """,
            """
            New built-in GLSL texture lookup functions are provided that specify a minimum level of detail to use for lookups where the level of detail is
            computed automatically. This allows shaders to avoid accessing unpopulated portions of high-resolution levels of detail when it knows that the
            memory accessed is unpopulated, either from a priori knowledge or from feedback provided by the return value of previously executed "sparse"
            texture lookup functions.
            """,
            """
            Reads of uncommitted texture memory will act as though such memory were filled with zeroes; previously, the values returned by reads were
            undefined.
            """,
            """
            Standard implementation-independent virtual page sizes for internal formats required to be supported with sparse textures. These standard sizes can
            be requested by leaving #VIRTUAL_PAGE_SIZE_INDEX_EXT at its initial value (0).
            """,
            """
            Support for creating sparse multisample and multisample array textures is added. However, the virtual page sizes for such textures remain fully
            implementation-dependent.
            """
        )}

        Requires ${EXT_sparse_texture.link}.
        """
}

val EXT_texture_compression_astc_decode_mode_rgb9e5 = EXT_FLAG.nativeClassGLES("GL_EXT_texture_compression_astc_decode_mode_rgb9e5", postfix = EXT) {
    documentation = "See ${EXT_texture_compression_astc_decode_mode.link}."
}

val KHR_robust_buffer_access_behavior = EXT_FLAG.nativeClassGLES("KHR_robust_buffer_access_behavior", postfix = KHR) {
    documentation =
        """
        When true, the ${registryLink("KHR", "robust_buffer_access_behavior")} extension is supported.

        This extension specifies the behavior of out-of-bounds buffer and array accesses. This is an improvement over the existing KHR_robustness extension
        which states that the application should not crash, but that behavior is otherwise undefined. This extension specifies the access protection provided
        by the GL to ensure that out-of-bounds accesses cannot read from or write to data not owned by the application. All accesses are contained within the
        buffer object and program area they reference. These additional robustness guarantees apply to contexts created with the robust access flag set.

        Requires ${GLES20.core} and ${KHR_robustness.link}.
        """
}

val KHR_texture_compression_astc_sliced_3d = EXT_FLAG.nativeClassGLES("KHR_texture_compression_astc_sliced_3d", postfix = KHR) {
    documentation =
        """
        When true, the ${registryLink("KHR", "texture_compression_astc_sliced_3d")} extension is supported.

        Adaptive Scalable Texture Compression (ASTC) is a new texture compression technology that offers unprecendented flexibility, while producing better or
        comparable results than existing texture compressions at all bit rates. It includes support for 2D and slice-based 3D textures, with low and high
        dynamic range, at bitrates from below 1 bit/pixel up to 8 bits/pixel in fine steps.

        This extension extends the functionality of ${KHR_texture_compression_astc_ldr.link} to include slice-based 3D textures for textures using the LDR
        profile in the same way as the HDR profile allows slice-based 3D textures.

        Requires ${KHR_texture_compression_astc_ldr.link}.
        """
}

val NV_explicit_attrib_location = EXT_FLAG.nativeClassGLES("NV_explicit_attrib_location", postfix = NV) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension provides a method to pre-assign attribute locations to named vertex shader inputs. This allows applications to globally assign a
        particular semantic meaning, such as diffuse color or vertex normal, to a particular attribute location without knowing how that attribute will be
        named in any particular shader.

        Requires ${GLES20.core}.
        """
}

val NV_fragment_shader_interlock = EXT_FLAG.nativeClassGLES("NV_fragment_shader_interlock", postfix = NV) {
    documentation =
        """
        When true, the ${registryLink("NV", "fragment_shader_interlock")} extension is supported.

        In unextended OpenGL 4.3 or OpenGL ES 3.1, applications may produce a large number of fragment shader invocations that perform loads and stores to
        memory using image uniforms, atomic counter uniforms, buffer variables, or pointers. The order in which loads and stores to common addresses are
        performed by different fragment shader invocations is largely undefined. For algorithms that use shader writes and touch the same pixels more than
        once, one or more of the following techniques may be required to ensure proper execution ordering:
        ${ul(
            "inserting Finish or WaitSync commands to drain the pipeline between different \"passes\" or \"layers\";",
            "using only atomic memory operations to write to shader memory (which may be relatively slow and limits how memory may be updated); or",
            "injecting spin loops into shaders to prevent multiple shader invocations from touching the same memory concurrently."
        )}
        This extension provides new GLSL built-in functions beginInvocationInterlockNV() and endInvocationInterlockNV() that delimit a critical section of
        fragment shader code. For pairs of shader invocations with "overlapping" coverage in a given pixel, the OpenGL implementation will guarantee that the
        critical section of the fragment shader will be executed for only one fragment at a time.

        There are four different interlock modes supported by this extension, which are identified by layout qualifiers. The qualifiers
        "pixel_interlock_ordered" and "pixel_interlock_unordered" provides mutual exclusion in the critical section for any pair of fragments corresponding to
        the same pixel. When using multisampling, the qualifiers "sample_interlock_ordered" and "sample_interlock_unordered" only provide mutual exclusion for
        pairs of fragments that both cover at least one common sample in the same pixel; these are recommended for performance if shaders use per-sample data
        structures.

        Additionally, when the "pixel_interlock_ordered" or "sample_interlock_ordered" layout qualifier is used, the interlock also guarantees that the
        critical section for multiple shader invocations with "overlapping" coverage will be executed in the order in which the primitives were processed by
        the GL. Such a guarantee is useful for applications like blending in the fragment shader, where an application requires that fragment values to be
        composited in the framebuffer in primitive order.

        This extension can be useful for algorithms that need to access per-pixel data structures via shader loads and stores. Such algorithms using this
        extension can access such data structures in the critical section without worrying about other invocations for the same pixel accessing the data
        structures concurrently. Additionally, the ordering guarantees are useful for cases where the API ordering of fragments is meaningful. For example,
        applications may be able to execute programmable blending operations in the fragment shader, where the destination buffer is read via image loads and
        the final value is written via image stores.

        Requires ${GLES31.core}.
        """
}

val NV_generate_mipmap_sRGB = EXT_FLAG.nativeClassGLES("NV_generate_mipmap_sRGB", postfix = NV) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        EXT_sRGB requires GenerateMipmap() to throw INVALID_OPERATION on textures with sRGB encoding. NV_generate_mipmap_sRGB lifts this restriction.

        Requires ${EXT_sRGB.link}.
        """
}

val NV_geometry_shader_passthrough = EXT_FLAG.nativeClassGLES("NV_geometry_shader_passthrough", postfix = NV) {
    documentation =
        """
        When true, the ${registryLink("NV", "geometry_shader_passthrough")} extension is supported.

        Geometry shaders provide the ability for applications to process each primitive sent through the GL using a programmable shader. While geometry shaders
        can be used to perform a number of different operations, including subdividing primitives and changing primitive type, one common use case treats
        geometry shaders as largely "passthrough". In this use case, the bulk of the geometry shader code simply copies inputs from each vertex of the input
        primitive to corresponding outputs in the vertices of the output primitive. Such shaders might also compute values for additional built-in or
        user-defined per-primitive attributes (e.g., gl_Layer) to be assigned to all the vertices of the output primitive.

        This extension provides a shading language abstraction to express such shaders without requiring explicit logic to manually copy attributes from input
        vertices to output vertices. For example, consider the following simple geometry shader in unextended OpenGL:
        ${codeBlock("""
      layout(triangles) in;
      layout(triangle_strip) out;
      layout(max_vertices=3) out;

      in Inputs {
        vec2 texcoord;
        vec4 baseColor;
      } v_in[];
      out Outputs {
        vec2 texcoord;
        vec4 baseColor;
      };

      void main()
      {
        int layer = compute_layer();
        for (int i = 0; i < 3; i++) {
          gl_Position = gl_in[i].gl_Position;
          texcoord = v_in[i].texcoord;
          baseColor = v_in[i].baseColor;
          gl_Layer = layer;
          EmitVertex();
        }
      }""")}
        In this shader, the inputs "gl_Position", "Inputs.texcoord", and "Inputs.baseColor" are simply copied from the input vertex to the corresponding output
        vertex. The only "interesting" work done by the geometry shader is computing and emitting a gl_Layer value for the primitive.

        The following geometry shader, using this extension, is equivalent:
        ${codeBlock("""
      \#extension GL_NV_geometry_shader_passthrough : require

      layout(triangles) in;
      // No output primitive layout qualifiers required.

      // Redeclare gl_PerVertex to pass through "gl_Position".
      layout(passthrough) in gl_PerVertex {
        vec4 gl_Position;
      };

      // Declare "Inputs" with "passthrough" to automatically copy members.
      layout(passthrough) in Inputs {
        vec2 texcoord;
        vec4 baseColor;
      };

      // No output block declaration required.

      void main()
      {
        // The shader simply computes and writes gl_Layer.  We don't
        // loop over three vertices or call EmitVertex().
        gl_Layer = compute_layer();
      }""")}
        Requires ${GLES31.core}.
        """
}

val NV_image_formats = EXT_FLAG.nativeClassGLES("NV_image_formats", postfix = NV) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        OpenGL ES 3.1 specifies a variety of formats required to be usable with texture images. This extension introduces the texture image formats missing for
        parity with OpenGL 4.4.

        Requires ${GLES31.core}.
        """
}

val NV_sample_mask_override_coverage = EXT_FLAG.nativeClassGLES("NV_sample_mask_override_coverage", postfix = NV) {
    documentation =
        """
        When true, the ${registryLink("NV", "sample_mask_override_coverage")} extension is supported.

        This extension allows the fragment shader to control whether the gl_SampleMask output can enable samples that were not covered by the original
        primitive, or that failed the early depth/stencil tests. This can be enabled by redeclaring the gl_SampleMask output with the "override_coverage"
        layout qualifier:
        ${codeBlock("""
    layout(override_coverage) out int gl_SampleMask[];""")}
        Requires {@link \#GL_OES_sample_variables OES_sample_variables}.
        """
}

val NV_shader_atomic_fp16_vector = EXT_FLAG.nativeClassGLES("NV_shader_atomic_fp16_vector", postfix = NV) {
    documentation =
        """
        This extension provides GLSL built-in functions and assembly opcodes allowing shaders to perform a limited set of atomic read-modify-write operations
        to buffer or texture memory with 16-bit floating point vector surface formats.

        Requires ${NV_gpu_shader5.link}.
        """
}

val NV_shader_noperspective_interpolation = EXT_FLAG.nativeClassGLES("NV_shader_noperspective_interpolation", postfix = NV) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        In OpenGL 3.0 and later, and in other APIs, there are three types of interpolation qualifiers that are available for fragment shader inputs: flat,
        smooth, and noperspective. The 'flat' qualifier indicates that no interpolation should be used. This is mandatory for integer-type variables. The
        'smooth' qualifier indicates that interpolation should be performed in a perspective0correct manner. This is the default for floating-point type
        variables. The 'noperspective' qualifier indicates that interpolation should be performed linearly in screen space.

        While perspective-correct (smooth) and non-interpolated (flat) are the two types of interpolation that most commonly used, there are important use
        cases for linear (noperspective) interpolation. In particular, in some work loads where screen-space aligned geometry is common, the use of linear
        interpolation can result in performance and/or power improvements.

        The smooth and flat interpolation qualifiers are already supported in OpenGL ES 3.0 and later. This extension adds support for noperspective
        interpolation to OpenGL ES.

        Requires ${GLES30.core}.
        """
}

val NV_texture_compression_s3tc_update = EXT_FLAG.nativeClassGLES("NV_texture_compression_s3tc_update", postfix = NV) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension allows for full or partial image updates to a compressed 2D texture from an uncompressed texel data buffer using TexImage2D and
        TexSubImage2D. Consquently, if a compressed internal format is used, all the restrictions associated with compressed textures will apply. These include
        sub-image updates aligned to 4x4 pixel blocks and the restriction on usage as render targets.

        Requires ${NV_texture_compression_s3tc.link}.
        """
}

val NV_texture_npot_2D_mipmap = EXT_FLAG.nativeClassGLES("NV_texture_npot_2D_mipmap", postfix = NV) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        Conventional OpenGL ES 2.0 allows the use of non-power-of-two (NPOT) textures with the limitation that mipmap minification filters can not be used.
        This extension relaxes this restriction and adds limited mipmap support for 2D NPOT textures.

        With this extension, NPOT textures are specified and applied identically to mipmapped power-of-two 2D textures with the following limitations:
        ${ul(
            "The texture wrap modes must be CLAMP_TO_EDGE.",
            """
            Coordinates used for texture sampling on an NPOT texture using a mipmapped minification filter must lie within the range [0,1]. Coordinate clamping
            is not performed by the GL in this case, causing values outside this range to produce undefined results.
            """
        )}
        """
}

val NV_viewport_array2 = EXT_FLAG.nativeClassGLES("NV_viewport_array2", postfix = NV) {
    documentation =
        """
        When true, the ${registryLink("NV", "viewport_array2")} extension is supported.

        This extension provides new support allowing a single primitive to be broadcast to multiple viewports and/or multiple layers. A shader output
        gl_ViewportMask[] is provided, allowing a single primitive to be output to multiple viewports simultaneously. Also, a new shader option is provided to
        control whether the effective viewport index is added into gl_Layer. These capabilities allow a single primitive to be output to multiple layers
        simultaneously.

        The gl_ViewportMask[] output is available in vertex, tessellation control, tessellation evaluation, and geometry shaders. gl_ViewportIndex and gl_Layer
        are also made available in all these shader stages. The actual viewport index or mask and render target layer values are taken from the last active
        shader stage from this set of stages.

        This extension is a superset of the GL_AMD_vertex_shader_layer and GL_AMD_vertex_shader_viewport_index extensions, and thus those extension strings are
        expected to be exported if GL_NV_viewport_array2 is supported. This extension includes the edits for those extensions, recast against the reorganized
        OpenGL 4.3 specification.

        Requires ${NV_viewport_array.link}, ${EXT_geometry_shader.link} and ${EXT_shader_io_blocks.cap}.
        """
}
val NVX_blend_equation_advanced_multi_draw_buffers = EXT_FLAG.nativeClassGLES("NVX_blend_equation_advanced_multi_draw_buffers", postfix = NVX) {
    documentation =
        """
        When true, the ${registryLink("NVX", "nvx_blend_equation_advanced_multi_draw_buffers")} extension is supported.

        This extension adds support for using advanced blend equations introduced with ${NV_blend_equation_advanced.link} (and standardized by
        ${KHR_blend_equation_advanced.link}) in conjunction with multiple draw buffers. The NV_blend_equation_advanced extension supports advanced blending
        equations only when rending to a single color buffer using fragment color zero and throws and #INVALID_OPERATION error when multiple draw buffers are
        used. This extension removes this restriction.

        Requires either ${NV_blend_equation_advanced.link} or ${KHR_blend_equation_advanced.link}.
        """
}

val OES_compressed_ETC1_RGB8_sub_texture = EXT_FLAG.nativeClassGLES("OES_compressed_ETC1_RGB8_sub_texture", postfix = OES) {
    documentation =
        """
        When true, the $registryLink extension is supported.
        """
}

val OES_depth_texture = EXT_FLAG.nativeClassGLES("OES_depth_texture", postfix = OES) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension defines a new texture format that stores depth values in the texture. Depth texture images are widely used for shadow casting but can
        also be used for other effects such as image based rendering, displacement mapping etc.

        Requires ${GLES20.core}.
        """
}

val OES_EGL_image_external_essl3 = EXT_FLAG.nativeClassGLES("OES_EGL_image_external_essl3", postfix = OES) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        OES_EGL_image_external provides a mechanism for creating EGLImage texture targets from EGLImages, but only specified language interactions for the
        OpenGL ES Shading Language version 1.0. This extension adds support for versions 3.x of the OpenGL ES Shading Language.

        Requires ${GLES30.link} and ${OES_EGL_image_external.link}.
        """
}

val OES_element_index_uint = EXT_FLAG.nativeClassGLES("OES_element_index_uint", postfix = OES) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        OpenGL ES 1.0 supports DrawElements with {@code type} value of UNSIGNED_BYTE and UNSIGNED_SHORT. This extension adds support for UNSIGNED_INT <type> values.
        """
}

val OES_fbo_render_mipmap = EXT_FLAG.nativeClassGLES("OES_fbo_render_mipmap", postfix = OES) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        OES_framebuffer_object allows rendering to the base level of a texture only. This extension removes this limitation by allowing implementations to
        support rendering to any mip-level of a texture(s) that is attached to a framebuffer object(s).

        If this extension is supported, FramebufferTexture2DOES, and FramebufferTexture3DOES can be used to render directly into any mip level of a texture
        image
        """
}

val OES_gpu_shader5 = EXT_FLAG.nativeClassGLES("OES_gpu_shader5", postfix = OES) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension provides a set of new features to the OpenGL ES Shading Language and related APIs to support capabilities of new GPUs, extending the
        capabilities of version 3.10 of the OpenGL ES Shading Language. Shaders using the new functionality provided by this extension should enable this
        functionality via the construct
        ${codeBlock("""
    \#extension GL_OES_gpu_shader5 : require (or enable)""")}
        This extension provides a variety of new features for all shader types, including:
        ${ul(
            "support for indexing into arrays of opaque types (samplers, and atomic counters) using dynamically uniform integer expressions;",
            "support for indexing into arrays of images and shader storage blocks using only constant integral expressions;",
            "extending the uniform block capability to allow shaders to index into an array of uniform blocks;",
            """
            a "precise" qualifier allowing computations to be carried out exactly as specified in the shader source to avoid optimization-induced invariance
            issues (which might cause cracking in tessellation);
            """,
            """
            new built-in functions supporting:
            ${ul("fused floating-point multiply-add operations;")}
            """,
            """
            extending the textureGather() built-in functions provided by OpenGL ES Shading Language 3.10:
            ${ul(
                "allowing shaders to use arbitrary offsets computed at run-time to select a 2x2 footprint to gather from; and",
                "allowing shaders to use separate independent offsets for each of the four texels returned, instead of requiring a fixed 2x2 footprint."
            )}
            """
        )}
        Requires ${GLES31.core}.
        """
}

val OES_sample_variables = EXT_FLAG.nativeClassGLES("OES_sample_variables", postfix = OES) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension allows fragment shaders more control over multisample rendering. The mask of samples covered by a fragment can be read by the shader and
        individual samples can be masked out. Additionally fragment shaders can be run on individual samples and the sample's ID and position read to allow
        better interaction with multisample resources such as textures.

        In multisample rendering, an implementation is allowed to assign the same sets of fragment shader input values to each sample, which then allows the
        optimization where the shader is only evaluated once and then distributed to the samples that have been determined to be covered by the primitive
        currently being rasterized. This extension does not change how values are interpolated, but it makes some details of the current sample available. This
        means that where these features are used (gl_SampleID and gl_SamplePosition), implementations must run the fragment shader for each sample.

        In order to obtain per-sample interpolation on fragment inputs, either OES_sample_shading or OES_shader_multisample_interpolation must be used in
        conjunction with the features from this extension.

        Requires ${GLES30.core}.
        """
}

val OES_shader_image_atomic = EXT_FLAG.nativeClassGLES("OES_shader_image_atomic", postfix = OES) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension provides built-in functions allowing shaders to perform atomic read-modify-write operations to a single level of a texture object from
        any shader stage. These built-in functions are named imageAtomic*(), and accept integer texel coordinates to identify the texel accessed. These
        built-in functions extend the Images in ESSL 3.10.

        Requires ${GLES31.core}.
        """
}

val OES_shader_io_blocks = EXT_FLAG.nativeClassGLES("OES_shader_io_blocks", postfix = OES) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension extends the functionality of interface blocks to support input and output interfaces in the OpenGL ES Shading Language.

        Input and output interface blocks are used for forming the interfaces between vertex, tessellation control, tessellation evaluation, geometry and
        fragment shaders. This accommodates passing arrays between stages, which otherwise would require multi-dimensional array support for tessellation
        control outputs and for tessellation control, tessellation evaluation, and geometry shader inputs.

        This extension provides support for application defined interface blocks which are used for passing application-specific information between shader
        stages.

        This extension moves the built-in "per-vertex" in/out variables to a new built-in gl_PerVertex block. This is necessary for tessellation and geometry
        shaders which require a separate instance for each vertex, but it can also be useful for vertex shaders.

        Finally, this extension allows the redeclaration of the gl_PerVertex block in order to reduce the set of variables that must be passed between shaders.

        Requires ${GLES31.core}.
        """
}

val OES_texture_float_linear = EXT_FLAG.nativeClassGLES("OES_texture_float_linear", postfix = OES) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        These extensions expand upon the OES_texture_half_float and OES_texture_float extensions by allowing support for LINEAR magnification filter and
        LINEAR, NEAREST_MIPMAP_LINEAR, LINEAR_MIPMAP_NEAREST and LINEAR_MIPMAP_NEAREST minification filters.

        When implemented against OpenGL ES 3.0 or later versions, sized 32-bit floating-point formats become texture-filterable. This should be noted by, for
        example, checking the ``TF'' column of table 8.13 in the ES 3.1 Specification (``Correspondence of sized internal formats to base internal formats ...
        and use cases ...'') for the R32F, RG32F, RGB32F, and RGBA32F formats.

        Requires ${OES_texture_float.cap}.
        """
}

val OES_texture_half_float_linear = EXT_FLAG.nativeClassGLES("OES_texture_half_float_linear", postfix = OES) {
    documentation =
        """
        When true, the ${registryLink("OES", "OES_texture_float_linear")} extension is supported.

        These extensions expand upon the OES_texture_half_float and OES_texture_float extensions by allowing support for LINEAR magnification filter and
        LINEAR, NEAREST_MIPMAP_LINEAR, LINEAR_MIPMAP_NEAREST and LINEAR_MIPMAP_NEAREST minification filters.

        When implemented against OpenGL ES 3.0 or later versions, sized 32-bit floating-point formats become texture-filterable. This should be noted by, for
        example, checking the ``TF'' column of table 8.13 in the ES 3.1 Specification (``Correspondence of sized internal formats to base internal formats ...
        and use cases ...'') for the R32F, RG32F, RGB32F, and RGBA32F formats.

        Requires ${OES_texture_half_float.link}.
        """
}

val OES_texture_npot = EXT_FLAG.nativeClassGLES("OES_texture_npot", postfix = OES) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension adds support for the REPEAT and MIRRORED_REPEAT texture wrap modes and the minification filters supported for non-power of two 2D
        textures, cubemaps and for 3D textures, if the OES_texture_3D extension is supported.

        Section 3.8.2 of the OpenGL ES 2.0 specification describes rules for sampling from an incomplete texture. There were specific rules added for non-power
        of two textures i.e. if the texture wrap mode is not CLAMP_TO_EDGE or minification filter is not NEAREST or LINEAR and the texture is a
        non-power-of-two texture, then sampling the texture will return (0, 0, 0, 1).

        These rules are no longer applied by an implementation that supports this extension.
        """
}

val OES_texture_stencil8 = EXT_FLAG.nativeClassGLES("OES_texture_stencil8", postfix = OES) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension accepts STENCIL_INDEX8 as a texture internal format, and adds STENCIL_INDEX8 to the required internal format list. This removes the need
        to use renderbuffers if a stencil-only format is desired.
        """
}

val OVR_multiview2 = EXT_FLAG.nativeClassGLES("OVR_multiview2", postfix = OVR) {
    documentation =
        """
        When true, the ${registryLink("OVR", "multiview2")} extension is supported.

        This extension relaxes the restriction in OVR_multiview that only gl_Position can depend on ViewID in the vertex shader. With this change,
        view-dependent outputs like reflection vectors and similar are allowed.

        Requires ${GLES30.core} and ${OVR_multiview.link}.
        """
}