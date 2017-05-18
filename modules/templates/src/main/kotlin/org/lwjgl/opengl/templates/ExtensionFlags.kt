/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB = "ARB"
val EXT = "EXT"
val KHR = "KHR"

val AMD = "AMD"
val ATI = "ATI"

val INTEL = "INTEL"

val NV = "NV"
val NVX = "NVX"

val OVR = "OVR"

val SGI = "SGI"
val SGIX = "SGIX"

private val NativeClass.cap: String get() = "{@link \\#$capName $templateName}"

val ARB_arrays_of_arrays = EXT_FLAG.nativeClassGL("ARB_arrays_of_arrays", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension removes the restriction that arrays cannot be formed into arrays, allowing arrays of arrays to be declared.

        Requires GLSL 1.2. ${GL43.promoted}
        """
}
val ARB_compatibility = EXT_FLAG.nativeClassGL("ARB_compatibility", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension restores features deprecated by ${GL30.core}.
        """
}
val ARB_conservative_depth = EXT_FLAG.nativeClassGL("ARB_conservative_depth", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        There is a common optimization for hardware accelerated implementation of OpenGL which relies on an early depth test to be run before the fragment
        shader so that the shader evaluation can be skipped if the fragment ends up being discarded because it is occluded.

        This optimization does not affect the final rendering, and is typically possible when the fragment does not change the depth programmatically. (i.e.: it
        does not write to the built-in gl_FragDepth output). There are, however a class of operations on the depth in the shader which could still be performed
        while allowing the early depth test to operate.

        This extension allows the application to pass enough information to the GL implementation to activate such optimizations safely.

        Requires ${GL30.core}. ${GL42.promoted}
        """
}
val ARB_derivative_control = EXT_FLAG.nativeClassGL("ARB_derivative_control", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension provides control over the spacial granularity at which the underlying implementation computes derivatives.

        For example, for the coarse-granularity derivative, a single x derivative could be computed for each 2x2 group of pixels, using that same derivative
        value for all 4 pixels. For the fine-granularity derivative, two derivatives could be computed for each 2x2 group of pixels; one for the top row and one
        for the bottom row. Implementations vary somewhat on how this is done.

        To select the coarse derivative, use:
        ${codeBlock("""
dFdxCoarse(p)
dFdyCoarse(p)
fwidthCoarse(p)""")}
        To select the fine derivative, use:
        ${codeBlock("""
dFdxFine(p)
dFdyFine(p)
fwidthFine(p)""")}
        To select which ever is "better" (based on performance, API hints, or other factors), use:
        ${codeBlock("""
dFdx(p)
dFdy(p)
fwidth(p)""")}
        This last set is the set of previously existing built-ins for derivatives, and continues to work in a backward compatible way.

        Requires ${GL40.core} and GLSL 4.00. ${GL45.promoted}
        """
}
val ARB_explicit_attrib_location = EXT_FLAG.nativeClassGL("ARB_explicit_attrib_location", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension provides a method to pre-assign attribute locations to named vertex shader inputs and color numbers to named fragment shader outputs.
        This allows applications to globally assign a particular semantic meaning, such as diffuse color or vertex normal, to a particular attribute location
        without knowing how that attribute will be named in any particular shader.

        Requires ${GL20.core} or ${ARB_vertex_shader.cap}. ${GL33.promoted}
        """
}
val ARB_fragment_coord_conventions = EXT_FLAG.nativeClassGL("ARB_fragment_coord_conventions", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension provides alternative conventions for the fragment coordinate XY location available for programmable fragment processing.

        The scope of this extension deals *only* with how the fragment coordinate XY location appears during programming fragment processing. Beyond the scope
        of this extension are coordinate conventions used for rasterization or transformation.

        In the case of the coordinate conventions for rasterization and transformation, some combination of the viewport, depth range, culling state, and
        projection matrix state can be reconfigured to adopt other arbitrary clip-space and window-space coordinate space conventions. Adopting other clip-space
        and window-space conventions involves adjusting existing OpenGL state. However it is non-trivial to massage an arbitrary fragment shader or program to
        adopt a different window-space coordinate system because such shaders are encoded in various textual representations.

        The dominant 2D and 3D rendering APIs make two basic choices of convention when locating fragments in window space. The two choices are:
        ${ol(
            "Is the origin nearest the lower-left- or upper-left-most pixel of the window?",
            "Is the (x,y) location of the pixel nearest the origin at (0,0) or (0.5,0.5)?"
        )}
        OpenGL assumes a lower-left origin for window coordinates and assumes pixel centers are located at half-pixel coordinates. This means the XY location
        (0.5,0.5) corresponds to the lower-left-most pixel in a window.

        Other window coordinate conventions exist for other rendering APIs. X11, GDI, and Direct3D version through DirectX 9 assume an upper-left window origin
        and locate pixel centers at integer XY values. By this alternative convention, the XY location (0,0) corresponds to the upper-left-most pixel in a window.

        Direct3D for DirectX 10 assumes an upper-left origin (as do prior DirectX versions) yet assumes half-pixel coordinates (unlike prior DirectX versions).
        By the DirectX 10 convention, the XY location (0.5,0.5) corresponds to the upper-left-most pixel in a window.

        Fragment shaders can directly access the location of a given processed fragment in window space. We call this location the "fragment coordinate".

        This extension provides a means for fragment shaders written in GLSL or OpenGL assembly extensions to specify alternative conventions for determining
        the fragment coordinate value accessed during programmable fragment processing.

        The motivation for this extension is to provide an easy, efficient means for fragment shaders accessing a fragment's window-space location to adopt the
        fragment coordinate convention for which the shader was originally written.

        ${GL32.promoted}
        """
}
val ARB_fragment_layer_viewport = EXT_FLAG.nativeClassGL("ARB_fragment_layer_viewport", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        The geometry shader has the special built-in variables gl_Layer and gl_ViewportIndex that specify which layer and viewport primitives are rendered to.
        Currently the fragment shader does not know which layer or viewport the fragments are being written to without the application implementing their own
        interface variables between the geometry and fragment shaders.

        This extension specifies that the gl_Layer and gl_ViewportIndex built-in variables are also available to the fragment shader so the application doesn't
        need to implement these manually.

        Requires ${GL30.core} and ${ARB_geometry_shader4.cap}, or ${GL32.core}. ${GL43.promoted}
        """
}
val ARB_fragment_program_shadow = EXT_FLAG.nativeClassGL("ARB_fragment_program_shadow", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension extends ARB_fragment_program to remove the interaction with ARB_shadow and defines the program option "ARB_fragment_program_shadow".

        Requires ${ARB_fragment_program.cap} and ${ARB_shadow.cap}.
        """
}
val ARB_fragment_shader_interlock = EXT_FLAG.nativeClassGL("ARB_fragment_shader_interlock", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        In unextended OpenGL 4.5, applications may produce a large number of fragment shader invocations that perform loads and stores to memory using image
        uniforms, atomic counter uniforms, buffer variables, or pointers. The order in which loads and stores to common addresses are performed by different
        fragment shader invocations is largely undefined. For algorithms that use shader writes and touch the same pixels more than once, one or more of the
        following techniques may be required to ensure proper execution ordering:
        ${ul(
            "inserting Finish or WaitSync commands to drain the pipeline between different \"passes\" or \"layers\";",
            "using only atomic memory operations to write to shader memory (which may be relatively slow and limits how memory may be updated); or",
            "injecting spin loops into shaders to prevent multiple shader invocations from touching the same memory concurrently."
        )}
        This extension provides new GLSL built-in functions beginInvocationInterlockARB() and endInvocationInterlockARB() that delimit a critical section of
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

        Requires ${GL42.core} or ${ARB_shader_image_load_store.link}.
        """
}
val ARB_post_depth_coverage = EXT_FLAG.nativeClassGL("ARB_post_depth_coverage", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension allows the fragment shader to control whether values in {@code gl_SampleMaskIn[]} reflect the coverage after application of the early
        depth and stencil tests. This feature can be enabled with the following layout qualifier in the fragment shader:
        ${codeBlock("""
        layout(post_depth_coverage) in;""")}
        Use of this feature implicitly enables early fragment tests.
        """
}
val ARB_robust_buffer_access_behavior = EXT_FLAG.nativeClassGL("ARB_robust_buffer_access_behavior", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension specifies the behavior of out-of-bounds buffer and array accesses. This is an improvement over the existing ARB_robustness extension
        which stated that the application should not crash, but the behavior is otherwise undefined. This extension specifies the access protection provided by
        the GL to ensure that out-of-bounds accesses cannot read from or write to data not owned by the application. All accesses are contained within the
        buffer object and program area they reference. These additional robustness guarantees apply to contexts created with the
        {@code CONTEXT_FLAG_ROBUST_ACCESS_BIT_ARB} feature enabled.

        Requires ${ARB_robustness.link}. ${GL43.promoted}
        """
}
val ARB_robustness_isolation = EXT_FLAG.nativeClassGL("ARB_robustness_isolation", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        ${ARB_robustness.link} and supporting window system extensions allow creating an OpenGL context supporting graphics reset notification behavior. This
        extension provides stronger guarantees about the possible side-effects of a graphics reset.

        It is expected that there may be a performance cost associated with isolating an application or share group from other contexts on the GPU. For this
        reason, ARB_robustness_isolation is phrased as an opt-in mechanism, with a new context creation bit defined in the window system bindings. It is
        expected that implementations might only advertise the strings in this extension if both the implementation supports the desired isolation properties,
        and the context was created with the appropriate reset isolation bit.

        Requires ${ARB_robustness.link}. ${GL43.promoted}
        """
}
val ARB_shader_atomic_counter_ops = EXT_FLAG.nativeClassGL("ARB_shader_atomic_counter_ops", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        The ${ARB_shader_atomic_counters.link} extension introduced atomic counters, but it limits list of potential operations that can be performed on them
        to increment, decrement, and query. This extension extends the list of GLSL built-in functions that can operate on atomic counters. The list of new
        operations include:
        ${ul(
            "Addition and subtraction",
            "Minimum and maximum",
            "Bitwise operators (AND, OR, XOR, etc.)",
            "Exchange, and compare and exchange operators"
        )}
        Requires ${GL42.core} or ${ARB_shader_atomic_counters.link}.
        """
}
val ARB_shader_ballot = EXT_FLAG.nativeClassGL("ARB_shader_ballot", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension provides the ability for a group of invocations which execute in lockstep to do limited forms of cross-invocation communication via a
        group broadcast of a invocation value, or broadcast of a bitarray representing a predicate value from each invocation in the group.

        Requires ${ARB_gpu_shader_int64.link}.
        """
}
val ARB_shader_bit_encoding = EXT_FLAG.nativeClassGL("ARB_shader_bit_encoding", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension trivially adds built-in functions for getting/setting the bit encoding for floating-point values in the OpenGL Shading Language.

        ${GL33.promoted}
        """
}
val ARB_shader_clock = EXT_FLAG.nativeClassGL("ARB_shader_clock", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension exposes a 64-bit monotonically incrementing shader counter which may be used to derive local timing information within a single shader
        invocation.
        """
}
val ARB_shader_draw_parameters = EXT_FLAG.nativeClassGL("ARB_shader_draw_parameters", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        In unextended GL, vertex shaders have inputs named {@code gl_VertexID} and {@code gl_InstanceID}, which contain, respectively the index of the vertex
        and instance. The value of {@code gl_VertexID} is the implicitly passed index of the vertex being processed, which includes the value of baseVertex, for
        those commands that accept it. Meanwhile, {@code gl_InstanceID} is the integer index of the current instance being processed, but, even for commands
        that accept a baseInstance parameter, it does not include the value of this argument. Furthermore, the equivalents to these variables in other graphics
        APIs do not necessarily follow these conventions. The reason for this inconsistency is that there are legitimate use cases for both inclusion and
        exclusion of the baseVertex or baseInstance parameters in {@code gl_VertexID} and {@code gl_InstanceID}, respectively.

        Rather than change the semantics of either built-in variable, this extension adds two new built-in variables to the GL shading language,
        {@code gl_BaseVertexARB} and {@code gl_BaseInstanceARB}, which contain the values passed in the baseVertex and baseInstance parameters, respectively.
        Shaders provided by the application may use these variables to offset {@code gl_VertexID} or {@code gl_InstanceID} if desired, or use them for any other
        purpose.

        Additionally, this extension adds a further built-in variable, {@code gl_DrawID} to the shading language. This variable contains the index of the draw
        currently being processed by a Multi* variant of a drawing command (such as #MultiDrawElements() or #MultiDrawArraysIndirect()).

        Requires ${GL31.core}. ${GL33.promoted}
        """
}
val ARB_shader_group_vote = EXT_FLAG.nativeClassGL("ARB_shader_group_vote", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension provides new built-in functions to compute the composite of a set of boolean conditions across a group of shader invocations. These
        composite results may be used to execute shaders more efficiently on a single-instruction multiple-data (SIMD) processor. The set of shader invocations
        across which boolean conditions are evaluated is implementation-dependent, and this extension provides no guarantee over how individual shader
        invocations are assigned to such sets. In particular, the set of shader invocations has no necessary relationship with the compute shader local work
        group -- a pair of shader invocations in a single compute shader work group may end up in different sets used by these built-ins.

        Compute shaders operate on an explicitly specified group of threads (a local work group), but many implementations of OpenGL 4.3 will even group
        non-compute shader invocations and execute them in a SIMD fashion. When executing code like
        ${codeBlock("""
if (condition) {
    result = do_fast_path();
} else {
    result = do_general_path();
}""")}
        where {@code condition} diverges between invocations, a SIMD implementation might first call do_fast_path() for the invocations where {@code condition}
        is true and leave the other invocations dormant. Once do_fast_path() returns, it might call do_general_path() for invocations where {@code condition} is
        false and leave the other invocations dormant. In this case, the shader executes *both* the fast and the general path and might be better off just using
        the general path for all invocations.

        This extension provides the ability to avoid divergent execution by evaluting a condition across an entire SIMD invocation group using code like:
        ${codeBlock("""
if (allInvocationsARB(condition)) {
    result = do_fast_path();
} else {
    result = do_general_path();
}""")}
        The built-in function allInvocationsARB() will return the same value for all invocations in the group, so the group will either execute do_fast_path()
        or do_general_path(), but never both. For example, shader code might want to evaluate a complex function iteratively by starting with an approximation
        of the result and then refining the approximation. Some input values may require a small number of iterations to generate an accurate result
        (do_fast_path) while others require a larger number (do_general_path). In another example, shader code might want to evaluate a complex function
        (do_general_path) that can be greatly simplified when assuming a specific value for one of its inputs (do_fast_path).

        Requires ${GL43.core} or ${ARB_compute_shader.link}.
        """
}
val ARB_shader_image_size = EXT_FLAG.nativeClassGL("ARB_shader_image_size", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension provides GLSL built-in functions allowing shaders to query the size of an image.

        Requires ${GL42.core} and GLSL 4.20. ${GL43.promoted}
        """
}
val ARB_shader_precision = EXT_FLAG.nativeClassGL("ARB_shader_precision", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension more clearly restricts the precision requirements of implementations of the GLSL specification. These include precision of arithmetic
        operations (operators '+', '/', ...), transcendentals (log, exp, pow, reciprocal sqrt, ...), when NaNs (not a number) and INFs (infinities) will be
        supported and generated, and denorm flushing behavior.  Trigonometric built-ins and some other categories of built-ins are not addressed.

        Requires ${GL40.core}. ${GL41.promoted}
        """
}
val ARB_shader_stencil_export = EXT_FLAG.nativeClassGL("ARB_shader_stencil_export", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        In OpenGL, the stencil test is a powerful mechanism to selectively discard fragments based on the content of the stencil buffer. However, facilites to
        update the content of the stencil buffer are limited to operations such as incrementing the existing value, or overwriting with a fixed reference value.

        This extension provides a mechanism whereby a shader may generate the stencil reference value per invocation. When stencil testing is enabled, this
        allows the test to be performed against the value generated in the shader. When the stencil operation is set to #REPLACE, this allows a value generated
        in the shader to be written to the stencil buffer directly.

        Requires ${ARB_fragment_shader.cap}.
        """
}
val ARB_shader_texture_image_samples = EXT_FLAG.nativeClassGL("ARB_shader_texture_image_samples", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension provides GLSL built-in functions allowing shaders to query the number of samples of a texture.

        Requires GLSL 1.50 or ${ARB_texture_multisample.link}.
        """
}
val ARB_shader_texture_lod = EXT_FLAG.nativeClassGL("ARB_shader_texture_lod", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension adds additional texture functions to the OpenGL Shading Language which provide the shader writer with explicit control of LOD.

        Mipmap texture fetches and anisotropic texture fetches require an implicit derivatives to calculate rho, lambda and/or the line of anisotropy. These
        implicit derivatives will be undefined for texture fetches occurring inside non-uniform control flow or for vertex shader texture fetches, resulting in
        undefined texels.

        The additional texture functions introduced with this extension provide explict control of LOD (isotropic texture functions) or provide explicit
        derivatives (anisotropic texture functions).

        Anisotropic texture functions return defined texels for mipmap texture fetches or anisotropic texture fetches, even inside non-uniform control flow.
        Isotropic texture functions return defined texels for mipmap texture fetches, even inside non-uniform control flow. However, isotropic texture functions
        return undefined texels for anisotropic texture fetches.

        The existing isotropic vertex texture functions:
        ${codeBlock("""
texture1DLod,   texture1DProjLod,
texture2DLod,   texture2DProjLod,
texture3DLod,   texture3DProjLod,
textureCubeLod,
shadow1DLod,    shadow1DProjLod,
shadow2DLod,    shadow2DProjLod""")}

        are added to the built-in functions for fragment shaders.

        New anisotropic texture functions, providing explicit derivatives:
        ${codeBlock("""
texture1DGradARB(
    sampler1D sampler,
    float P, float dPdx, float dPdy);
texture1DProjGradARB(
    sampler1D sampler,
    vec2 P, float dPdx, float dPdy);
texture1DProjGradARB(
    sampler1D sampler,
    vec4 P, float dPdx, float dPdy);
texture2DGradARB(
    sampler2D sampler,
    vec2 P, vec2 dPdx, vec2 dPdy);
texture2DProjGradARB(
    sampler2D sampler,
    vec3 P, vec2 dPdx, vec2 dPdy);
texture2DProjGradARB(
    sampler2D sampler,
    vec4 P, vec2 dPdx, vec2 dPdy);
texture3DGradARB(
    sampler3D sampler,
    vec3 P, vec3 dPdx, vec3 dPdy);
texture3DProjGradARB(
    sampler3D sampler,
    vec4 P, vec3 dPdx, vec3 dPdy);
textureCubeGradARB(
    samplerCube sampler,
    vec3 P, vec3 dPdx, vec3 dPdy);

shadow1DGradARB(
    sampler1DShadow sampler,
    vec3 P, float dPdx, float dPdy);
shadow1DProjGradARB(
    sampler1DShadow sampler,
    vec4 P, float dPdx, float dPdy);
shadow2DGradARB(
    sampler2DShadow sampler,
    vec3 P, vec2 dPdx, vec2 dPdy);
shadow2DProjGradARB(
    sampler2DShadow sampler,
    vec4 P, vec2 dPdx, vec2 dPdy);

texture2DRectGradARB(
    sampler2DRect sampler,
    vec2 P, vec2 dPdx, vec2 dPdy);
texture2DRectProjGradARB(
    sampler2DRect sampler,
    vec3 P, vec2 dPdx, vec2 dPdy);
texture2DRectProjGradARB(
    sampler2DRect sampler,
    vec4 P, vec2 dPdx, vec2 dPdy);

shadow2DRectGradARB(
    sampler2DRectShadow sampler,
    vec3 P, vec2 dPdx, vec2 dPdy);
shadow2DRectProjGradARB(
    sampler2DRectShadow sampler,
    vec4 P, vec2 dPdx, vec2 dPdy);""")}

        are added to the built-in functions for vertex shaders and fragment shaders.

        Requires ${ARB_shader_objects.cap}. ${GL30.promoted}
        """
}
val ARB_shader_viewport_layer_array = EXT_FLAG.nativeClassGL("ARB_shader_viewport_layer_array", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        The gl_ViewportIndex and gl_Layer built-in variables were introduced by the in OpenGL 4.1. These variables are available in un-extended OpenGL only to
        the geometry shader. When written in the geometry shader, they cause geometry to be directed to one of an array of several independent viewport
        rectangles or framebuffer attachment layers, respectively.

        In order to use any viewport or attachment layer other than zero, a geometry shader must be present. Geometry shaders introduce processing overhead and
        potential performance issues. The AMD_vertex_shader_layer and AMD_vertex_shader_viewport_index extensions allowed the gl_Layer and gl_ViewportIndex
        outputs to be written directly from the vertex shader with no geometry shader present.

        This extension effectively merges the AMD_vertex_shader_layer and AMD_vertex_shader_viewport_index extensions together and extends them further to
        allow both outputs to be written from tessellation evaluation shaders.

        Requires ${GL41.core}.
        """
}
val ARB_shading_language_420pack = EXT_FLAG.nativeClassGL("ARB_shading_language_420pack", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This is a language feature only extension formed from changes made to version 4.20 of GLSL. It includes:
        ${ul(
            "Add line-continuation using '\', as in C++.",
            "Change from ASCII to UTF-8 for the language character set and also allow any characters inside comments.",
            "Allow implicit conversions of return values to the declared type of the function.",
            "The *const* keyword can be used to declare variables within a function body with initializer expressions that are not constant expressions.",
            """
            Qualifiers on variable declarations no longer have to follow a strict order. The layout qualifier can be used multiple times, and multiple parameter
            qualifiers can be used. However, this is not as straightforward as saying declarations have arbitrary lists of initializers. Typically, one
            qualifier from each class of qualifiers is allowed, so care is now taken to classify them and say so. Then, of these, order restrictions are removed.
            """,
            """
            Add layout qualifier identifier "binding" to bind the location of a uniform block. This requires version 1.4 of GLSL. If this extension is used with
            an earlier version than 1.4, this feature is not present.
            """,
            "Add layout qualifier identifier \"binding\" to bind units to sampler and image variable declarations.",
            "Add C-style curly brace initializer lists syntax for initializers. Full initialization of aggregates is required when these are used.",
            "Allow \".length()\" to be applied to vectors and matrices, returning the number of components or columns.",
            "Allow swizzle operations on scalars.",
            "Built-in constants for {@code gl_MinProgramTexelOffset} and {@code gl_MaxProgramTexelOffset}."
        )}
        Requires GLSL 1.30. Requires GLSL 1.40 for uniform block bindings. ${GL42.promoted}
        """
}
val ARB_shading_language_packing = EXT_FLAG.nativeClassGL("ARB_shading_language_packing", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension provides the GLSL built-in functions to convert a 32-bit unsigned integer holding a pair of 16-bit floating-point values to or from a
        two-component floating-point vector (vec2).

        This mechanism allows GLSL shaders to read and write 16-bit floating-point encodings (via 32-bit unsigned integers) without introducing a full set of
        16-bit floating-point data types.

        This extension also adds the GLSL built-in packing functions included in GLSL version 4.00 and the ARB_gpu_shader5 extension which pack and unpack
        vectors of small fixed-point data types into a larger scalar. By putting these packing functions in this separate extension it allows implementations to
        provide these functions in hardware that supports them independent of the other ${ARB_gpu_shader5.cap} features.

        In addition to the packing functions from ARB_gpu_shader5 this extension also adds the missing {@code [un]packSnorm2x16} for completeness.

        ${GL42.promoted}
        """
}
val ARB_sparse_texture2 = EXT_FLAG.nativeClassGL("ARB_sparse_texture2", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension builds on the ${ARB_sparse_texture.link} extension, providing the following new functionality:
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
            be requested by leaving #VIRTUAL_PAGE_SIZE_INDEX_ARB at its initial value (0).
            """,
            """
            Support for creating sparse multisample and multisample array textures is added. However, the virtual page sizes for such textures remain fully
            implementation-dependent.
            """
        )}
        Requires ${ARB_sparse_texture.link}
        """
}
val ARB_sparse_texture_clamp = EXT_FLAG.nativeClassGL("ARB_sparse_texture_clamp", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension builds on the ${ARB_sparse_texture2.cap} extension, providing the following new functionality:

        New built-in GLSL texture lookup functions are provided that specify a minimum level of detail to use for lookups where the level of detail is
        computed automatically. This allows shaders to avoid accessing unpopulated portions of high-resolution levels of detail when it knows that the memory
        accessed is unpopulated, either from a priori knowledge or from feedback provided by the return value of previously executed "sparse" texture lookup
        functions.

        Requires ${ARB_sparse_texture2.cap}
        """
}
val ARB_texture_buffer_object_rgb32 = EXT_FLAG.nativeClassGL("ARB_texture_buffer_object_rgb32", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension adds three new buffer texture formats - RGB32F, RGB32I, and RGB32UI. This partially addresses one of the limitations of buffer textures
        in the original ${EXT_texture_buffer_object.cap} extension and in ${GL31.core}, which provide no support for three-component formats.

        ${GL40.promoted}
        """
}
val ARB_texture_env_add = EXT_FLAG.nativeClassGL("ARB_texture_env_add", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension adds a new texture environment function: ADD.

        ${GL13.promoted}
        """
}
val ARB_texture_env_crossbar = EXT_FLAG.nativeClassGL("ARB_texture_env_crossbar", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension adds the capability to use the texture color from other texture units as sources to the #COMBINE_ARB environment
        function. The ${ARB_texture_env_combine.link} extension defined texture environment functions which could use the color from the current texture unit
        as a source. This extension adds the ability to use the color from any texture unit as a source.

        Requires ${ARB_multitexture.cap} and ${ARB_texture_env_combine.link}. ${GL14.promoted}
        """
}
val ARB_texture_non_power_of_two = EXT_FLAG.nativeClassGL("ARB_texture_non_power_of_two", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        Conventional OpenGL texturing is limited to images with power-of-two dimensions and an optional 1-texel border. This extension relaxes the size
        restrictions for the 1D, 2D, cube map, and 3D texture targets.

        ${GL20.promoted}
        """
}
val ARB_texture_query_levels = EXT_FLAG.nativeClassGL("ARB_texture_query_levels", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension provides a new set of texture functions ({@code textureQueryLevels}) in the OpenGL Shading Language that exposes the number of accessible
        mipmap levels in the texture associated with a GLSL sampler variable. The set of accessible levels includes all the levels of the texture defined either
        through TexImage*, TexStorage*, or TextureView* (${ARB_texture_view.link}) APIs that are not below the #TEXTURE_BASE_LEVEL or above the
        #TEXTURE_MAX_LEVEL parameters. For textures defined with TexImage*, the set of resident levels is somewhat implementation-dependent. For fully
        defined results, applications should use TexStorage*&#47;TextureView unless the texture has a full mipmap chain and is used with a mipmapped minification
        filter.

        These functions means that shaders are not required to manually recompute, approximate, or maintain a uniform holding a pre-computed level count, since
        the true level count is already available to the implementation. This value can be used to avoid black or leaking pixel artifacts for rendering methods
        which are using texture images as memory pages (eg: virtual textures); methods that can't only rely on the fixed pipeline texture functions which take
        advantage of #TEXTURE_MAX_LEVEL for their sampling.

        Requires ${GL30.core} and GLSL 1.30. ${GL43.promoted}
        """
}
val ARB_texture_query_lod = EXT_FLAG.nativeClassGL("ARB_texture_query_lod", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension provides a new set of fragment shader texture functions ({@code textureLOD}) that return the results of automatic level-of-detail
        computations that would be performed if a texture lookup were performed.

        Requires ${GL20.core}, ${EXT_gpu_shader4.cap}, ${EXT_texture_array.cap} and GLSL 1.30. ${GL40.promoted}
        """
}
val ARB_texture_stencil8 = EXT_FLAG.nativeClassGL("ARB_texture_stencil8") {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension accepts #STENCIL_INDEX8 as a texture internal format, and adds STENCIL_INDEX8 to the required internal format list. This removes the
        need to use renderbuffers if a stencil-only format is desired.

        ${GL44.promoted}
        """
}
val ARB_vertex_type_10f_11f_11f_rev = EXT_FLAG.nativeClassGL("ARB_vertex_type_10f_11f_11f_rev") {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension a new vertex attribute data format: a packed 11.11.10 unsigned float vertex data format. This vertex data format can be used to describe
        a compressed 3 component stream of values that can be represented by 10- or 11-bit unsigned floating point values.

        The #UNSIGNED_INT_10F_11F_11F_REV vertex attribute type is equivalent to the #R11F_G11F_B10F texture internal format.

        Requires ${GL30.core} and ${ARB_vertex_type_2_10_10_10_rev.link}. ${GL44.promoted}
        """
}

val EXT_post_depth_coverage = EXT_FLAG.nativeClassGL("EXT_post_depth_coverage", postfix = EXT) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension allows the fragment shader to control whether values in {@code gl_SampleMaskIn[]} reflect the coverage after application of the early
        depth and stencil tests.  This feature can be enabled with the following layout qualifier in the fragment shader:
        ${codeBlock("""
layout(post_depth_coverage) in;""")}
        To use this feature, early fragment tests must also be enabled in the fragment shader via:
        ${codeBlock("""
layout(early_fragment_tests) in;""")}
        """
}

val EXT_shader_image_load_formatted = EXT_FLAG.nativeClassGL("EXT_shader_image_load_formatted", postfix = EXT) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        ${ARB_shader_image_load_store.link} (and OpenGL 4.2) added support for random access load and store from/to texture images, but due to hardware
        limitations, loads were required to declare the image format in the shader source. This extension relaxes that requirement, and the return values from
        {@code imageLoad} can be format-converted based on the format of the image binding.
        """
}

val EXT_shader_integer_mix = "EXTShaderIntegerMix".nativeClassGL("EXT_shader_integer_mix", postfix = EXT) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        GLSL 1.30 (and GLSL ES 3.00) expanded the mix() built-in function to operate on a boolean third argument that does not interpolate but selects. This
        extension extends mix() to select between int, uint, and bool components.

        Requires ${GL30.core}.
        """
}

val EXT_shadow_funcs = EXT_FLAG.nativeClassGL("EXT_shadow_funcs", postfix = EXT) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension generalizes the ${ARB_shadow.cap} extension to support all eight binary texture comparison functions rather than just #LEQUAL and
        #GEQUAL.

        Requires ${ARB_depth_texture.cap} and ${ARB_shadow.cap}.
        """
}

val EXT_sparse_texture2 = EXT_FLAG.nativeClassGL("EXT_sparse_texture2", postfix = EXT) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension builds on the ${ARB_sparse_texture.link} extension, providing the following new functionality:
        ${ul(
            """
            New built-in GLSL texture lookup and image load functions are provided that return information on whether the texels accessed for the texture
            lookup accessed uncommitted texture memory.

            New built-in GLSL texture lookup functions are provided that specify a minimum level of detail to use for lookups where the level of detail is
            computed automatically. This allows shaders to avoid accessing unpopulated portions of high-resolution levels of detail when it knows that the
            memory accessed is unpopulated, either from a priori knowledge or from feedback provided by the return value of previously executed "sparse"
            texture lookup functions.

            Reads of uncommitted texture memory will act as though such memory were filled with zeroes; previously, the values returned by reads were undefined.

            Standard implementation-independent virtual page sizes for internal formats required to be supported with sparse textures. These standard sizes can
            be requested by leaving #VIRTUAL_PAGE_SIZE_INDEX_ARB at its initial value (0).

            Support for creating sparse multisample and multisample array textures is added. However, the virtual page sizes for such textures remain fully
            implementation-dependent.
            """
        )}

        Requires ${ARB_sparse_texture.link}.
        """
}

val EXT_vertex_array_bgra = EXT_FLAG.nativeClassGL("EXT_vertex_array_bgra", postfix = EXT) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension provides a single new component format for vertex arrays to read 4-component unsigned byte vertex attributes with a BGRA component
        ordering.

        OpenGL expects vertex arrays containing 4 unsigned bytes per element to be in the RGBA, STRQ, or XYZW order (reading components left-to-right in their
        lower address to higher address order). Essentially the order the components appear in memory is the order the components appear in the resulting
        vertex attribute vector.

        However Direct3D has color (diffuse and specular) vertex arrays containing 4 unsigned bytes per element that are in a BGRA order (again reading
        components left-to-right in their lower address to higher address order). Direct3D calls this "ARGB" reading the components in the opposite order
        (reading components left-to-right in their higher address to lower address order). This ordering is generalized in the DirectX 10 by the
        DXGI_FORMAT_B8G8R8A8_UNORM format.

        For an OpenGL application to source color data from a vertex buffer formatted for Direct3D's color array format conventions, the application is forced
        to either:
        ${ol(
            "Rely on a vertex program or shader to swizzle the color components from the BGRA to conventional RGBA order.",
            "Re-order the color data components in the vertex buffer from Direct3D's native BGRA order to OpenGL's native RGBA order."
        )}
        Neither option is entirely satisfactory.

        Option 1 means vertex shaders have to be re-written to source colors differently. If the same vertex shader is used with vertex arrays configured to
        source the color as 4 floating-point color components, the swizzle for BGRA colors stored as 4 unsigned bytes is no longer appropriate. The shader's
        swizzling of colors becomes dependent on the type and number of color components. Ideally the vertex shader should be independent from the format and
        component ordering of the data it sources.

        Option 2 is expensive because vertex buffers may have to be reformatted prior to use. OpenGL treats the memory for vertex arrays (whether client-side
        memory or buffer objects) as essentially untyped memory and vertex arrays can be stored separately, interleaved, or even interwoven (where multiple
        arrays overlap with differing strides and formats).

        Rather than force a re-ordering of either vertex array components in memory or a vertex array format-dependent re-ordering of vertex shader inputs,
        OpenGL can simply provide a vertex array format that matches the Direct3D color component ordering.

        This approach mimics that of the EXT_bgra extension for pixel and texel formats except for vertex instead of image data.
        """
}

val AMD_conservative_depth = EXT_FLAG.nativeClassGL("AMD_conservative_depth", postfix = AMD) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        There is a common optimization for hardware accelerated implementation of OpenGL which relies on an early depth test to be run before the fragment
        shader so that the shader evaluation can be skipped if the fragment ends up being discarded because it is occluded.

        This optimization does not affect the final rendering, and is typically possible when the fragment does not change the depth programmatically. (i.e.: it
        does not write to the built-in {@code gl_FragDepth} output). There are, however a class of operations on the depth in the shader which could still be
        performed while allowing the early depth test to operate.

        This extension allows the application to pass enough information to the GL implementation to activate such optimizations safely.

        Requires ${GL30.core}. ${GL42.promoted}
        """
}
val AMD_gcn_shader = EXT_FLAG.nativeClassGL("AMD_gcn_shader", postfix = AMD) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension exposes miscellaneous features of the AMD "Graphics Core Next" shader architecture that do not cleanly fit into other extensions
        and are not significant enough alone to warrant their own extensions. This includes cross-SIMD lane ballots, cube map query functions and a
        functionality to query the elapsed shader core time.

        Requires ${AMD_gpu_shader_int64.cap} or ${NV_gpu_shader5.cap}.
        """
}
val AMD_shader_atomic_counter_ops = EXT_FLAG.nativeClassGL("AMD_shader_atomic_counter_ops", postfix = AMD) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension is written against the OpenGL 4.3 (core) specification and the GLSL 4.30.7 specification.

        Requires ${GL42.core} or ${ARB_shader_atomic_counters.cap}.
        """
}
val AMD_shader_ballot = EXT_FLAG.nativeClassGL("AMD_shader_ballot", postfix = AMD) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        The extensions {@code ARB_shader_group_vote} and {@code ARB_shader_ballot} introduced the concept of sub-groups and a set of operations that allow data
        exchange across shader invocations within a sub-group.

        This extension further extends the capabilities of these extensions with additional sub-group operations.

        Requires ${ARB_shader_group_vote.cap}, ${ARB_shader_ballot.cap} and ${ARB_gpu_shader_int64.link} or ${AMD_gpu_shader_int64.link}.
        """
}
val AMD_shader_explicit_vertex_parameter = EXT_FLAG.nativeClassGL("AMD_shader_explicit_vertex_parameter", postfix = AMD) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        Unextended GLSL provides a set of fixed function interpolation modes and even those are limited to certain types of interpolants (for example,
        interpolation of integer and double isn't supported).

        This extension introduces new built-in functions allowing access to vertex parameters explicitly in the fragment shader. It also exposes barycentric
        coordinates as new built-in variables, which can be used to implement custom interpolation algorithms using shader code.

        Requires ${GL20.core} or ${ARB_shader_objects.link}.
        """
}
val AMD_shader_stencil_export = EXT_FLAG.nativeClassGL("AMD_shader_stencil_export", postfix = AMD) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        In OpenGL, the stencil test is a powerful mechanism to selectively discard fragments based on the content of the stencil buffer. However, facilites to
        update the content of the stencil buffer are limited to operations such as incrementing the existing value, or overwriting with a fixed reference value.

        This extension provides a mechanism whereby a shader may generate the stencil reference value per invocation. When stencil testing is enabled, this
        allows the test to be performed against the value generated in the shader. When the stencil operation is set to #REPLACE, this allows a value generated
        in the shader to be written to the stencil buffer directly.

        Requires ${ARB_fragment_shader.cap}.
        """
}
val AMD_shader_trinary_minmax = EXT_FLAG.nativeClassGL("AMD_shader_trinary_minmax", postfix = AMD) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension introduces three new trinary built-in functions to the OpenGL Shading Languages. These functions allow the minimum, maximum or median of
        three inputs to be found with a single function call. These operations may be useful for sorting and filtering operations, for example. By explicitly
        performing a trinary operation with a single built-in function, shader compilers and optimizers may be able to generate better instruction sequences for
        perform sorting and other multi-input functions.

        Requires ${GL20.core} or ${ARB_shader_objects.cap}.
        """
}
val AMD_texture_gather_bias_lod = EXT_FLAG.nativeClassGL("AMD_texture_gather_bias_lod", postfix = AMD) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension was developed based on existing built-in texture gather functions to allow implementations supporting bias of implicit level of detail
        and explicit control of level of detail in texture gather operations.
        """
}
val AMD_texture_texture4 = EXT_FLAG.nativeClassGL("AMD_texture_texture4", postfix = AMD) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension adds new shading language built-in texture functions to the shading language.

        These texture functions may be used to access one component textures.

        The {@code texture4} built-in function returns a texture value derived from a 2x2 set of texels in the image array of level levelbase is selected. These
        texels are selected in the same way as when the value of #TEXTURE_MIN_FILTER is #LINEAR, but instead of these texels being filtered to generate the
        texture value, the R, G, B and A texture values are derived directly from these four texels.
        """
}
val AMD_transform_feedback3_lines_triangles = "AMDTransformFeedback3LinesTriangles".nativeClassGL("AMD_transform_feedback3_lines_triangles", postfix = AMD) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        OpenGL 4.0 introduced the ability to record primitives into multiple output streams using transform feedback. However, the restriction that all streams
        must output #POINT primitives when more than one output stream is active was also introduced. This extension simply removes that restriction, allowing
        the same set of primitives to be used with multiple transform feedback streams as with a single stream.

        Requires ${GL40.core} or ${ARB_transform_feedback3.link}.
        """
}
val AMD_vertex_shader_layer = EXT_FLAG.nativeClassGL("AMD_vertex_shader_layer", postfix = AMD) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        The {@code gl_Layer} built-in shading language variable was introduced with the ${ARB_geometry_shader4.cap} extension and subsequently promoted to core
        OpenGL in version 3.2. This variable is an output from the geometry shader stage that allows rendering to be directed to a specific layer of an array
        texture, slice of a 3D texture or face of a cube map or cube map array attachment of the framebuffer. Thus, this extremely useful functionality is only
        available if a geometry shader is present - even if the geometry shader is not otherwise required by the application. This adds overhead to the graphics
        processing pipeline, and complexity to applications. It also precludes implementations that cannot support geometry shaders from supporting rendering to
        layered framebuffer attachments.

        This extension exposes the {@code gl_Layer} built-in variable in the vertex shader, allowing rendering to be directed to layered framebuffer attachments
        with only a vertex and fragment shader present. Combined with features such as instancing, or static vertex attributes and so on, this allows a wide
        variety of techniques to be implemented without the requirement for a geometry shader to be present.

        Requires ${GL30.core} or ${EXT_texture_array.cap}.
        """
}
val AMD_vertex_shader_viewport_index = EXT_FLAG.nativeClassGL("AMD_vertex_shader_viewport_index", postfix = AMD) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        The {@code gl_ViewportIndex} built-in variable was introduced by the ${ARB_viewport_array.cap} extension and ${GL41.core}. This variable is available
        in un-extended OpenGL only to the geometry shader. When written in the geometry shader, it causes geometry to be directed to one of an array of several
        independent viewport rectangles.

        In order to use any viewport other than zero, a geometry shader must be present. Geometry shaders introduce processing overhead and potential
        performance issues. This extension exposes the {@code gl_ViewportIndex} built-in variable to the vertex shader, allowing the functionality introduced by
        ARB_viewport_array to be accessed without requiring a geometry shader to be present.

        Requires ${GL41.core} or ${ARB_viewport_array.cap}.
        """
}

val ATI_shader_texture_lod = EXT_FLAG.nativeClassGL("ATI_shader_texture_lod", postfix = ATI) { documentation = "When true, the $registryLink extension is supported." }

val INTEL_fragment_shader_ordering = EXT_FLAG.nativeClassGL("INTEL_fragment_shader_ordering", postfix = ATI) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        Graphics devices may execute in parallel fragment shaders referring to the same window xy coordinates. Framebuffer writes are guaranteed to be
        processed in primitive rasterization order, but there is no order guarantee for other instructions and image or buffer object accesses in particular.

        The extension introduces a new GLSL built-in function, beginFragmentShaderOrderingINTEL(), which blocks execution of a fragment shader invocation until
        invocations from previous primitives that map to the same xy window coordinates (and same sample when per-sample shading is active) complete their
        execution. All memory transactions from previous fragment shader invocations are made visible to the fragment shader invocation that called
        beginFragmentShaderOrderingINTEL() when the function returns.
        """
}

val KHR_robust_buffer_access_behavior = EXT_FLAG.nativeClassGL("KHR_robust_buffer_access_behavior", postfix = ARB) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension specifies the behavior of out-of-bounds buffer and array accesses. This is an improvement over the existing ${KHR_robustness.cap}
        extension which states that the application should not crash, but that behavior is otherwise undefined. This extension specifies the access protection
        provided by the GL to ensure that out-of-bounds accesses cannot read from or write to data not owned by the application. All accesses are contained
        within the buffer object and program area they reference. These additional robustness guarantees apply to contexts created with the robust access flag
        set.

        Requires ${GL32.core} and ${KHR_robustness.cap}.
        """
}

val KHR_texture_compression_astc_hdr = EXT_FLAG.nativeClassGL("KHR_texture_compression_astc_hdr", postfix = KHR) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension corresponds to the ASTC HDR Profile, see ${KHR_texture_compression_astc_ldr.link} for details.
        """
}

val KHR_texture_compression_astc_sliced_3d = EXT_FLAG.nativeClassGL("KHR_texture_compression_astc_sliced_3d", postfix = KHR) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        Adaptive Scalable Texture Compression (ASTC) is a new texture compression technology that offers unprecendented flexibility, while producing better or
        comparable results than existing texture compressions at all bit rates. It includes support for 2D and slice-based 3D textures, with low and high
        dynamic range, at bitrates from below 1 bit/pixel up to 8 bits/pixel in fine steps.

        This extension extends the functionality of ${KHR_texture_compression_astc_ldr.link} to include slice-based 3D textures for textures using the LDR
        profile in the same way as the HDR profile allows slice-based 3D textures.

        Requires ${KHR_texture_compression_astc_ldr.link}.
        """
}

val NV_blend_square = EXT_FLAG.nativeClassGL("NV_blend_square", postfix = NV) { documentation = "When true, the $registryLink extension is supported." }
val NV_ES3_1_compatibility = EXT_FLAG.nativeClassGL("NV_ES3_1_compatibility", postfix = NV) { documentation = "When true, the $registryLink extension is supported." }
val NV_fragment_program4 = EXT_FLAG.nativeClassGL("NV_fragment_program4", postfix = NV) { documentation = "When true, the $registryLink extension is supported." }
val NV_fragment_program_option = EXT_FLAG.nativeClassGL("NV_fragment_program_option", postfix = NV) { documentation = "When true, the $registryLink extension is supported." }
val NV_fragment_shader_interlock = EXT_FLAG.nativeClassGL("NV_fragment_shader_interlock", postfix = NV) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        In unextended OpenGL 4.3, applications may produce a large number of fragment shader invocations that perform loads and stores to memory using image
        uniforms, atomic counter uniforms, buffer variables, or pointers. The order in which loads and stores to common addresses are performed by different
        fragment shader invocations is largely undefined. For algorithms that use shader writes and touch the same pixels more than once, one or more of the
        following techniques may be required to ensure proper execution ordering:
        ${ul(
            """inserting Finish or WaitSync commands to drain the pipeline between different "passes" or "layers";""",
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

        Requires ${GL43.core} and GLSL 4.30.
        """
}

val NV_geometry_shader4 = EXT_FLAG.nativeClassGL("NV_geometry_shader4", postfix = NV) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension builds upon the ${EXT_geometry_shader4.cap} specification to provide two additional capabilities:
        ${ul(
            """
            Support for QUADS, QUAD_STRIP, and POLYGON primitive types when geometry shaders are enabled.  Such primitives will be tessellated into individual
            triangles.
            """,
            """
            Setting the value of GEOMETRY_VERTICES_OUT_EXT will take effect immediately. It is not necessary to link the program object in order for this change
            to take effect, as is the case in the EXT version of this extension.
            """
        )}
        Requires ${EXT_geometry_shader4.cap}.
        """
}
val NV_geometry_shader_passthrough = EXT_FLAG.nativeClassGL("NV_geometry_shader_passthrough", postfix = NV) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension provides a shading language abstraction to express such shaders without requiring explicit logic to manually copy attributes from input
        vertices to output vertices.
        """
}
val NV_sample_mask_override_coverage = EXT_FLAG.nativeClassGL("NV_sample_mask_override_coverage", postfix = NV) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension allows the fragment shader to control whether the gl_SampleMask output can enable samples that were not covered by the original
        primitive, or that failed the early depth/stencil tests.
        """
}
val NV_shader_atomic_float = EXT_FLAG.nativeClassGL("NV_shader_atomic_float", postfix = NV) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension provides GLSL built-in functions and assembly opcodes allowing shaders to perform atomic read-modify-write operations to buffer or
        texture memory with floating-point components.  The set of atomic operations provided by this extension is limited to adds and exchanges. Providing
        atomic add support allows shaders to atomically accumulate the sum of floating-point values into buffer or texture memory across multiple (possibly
        concurrent) shader invocations.

        This extension provides GLSL support for atomics targeting image uniforms (if GLSL 4.20, ${ARB_shader_image_load_store.cap}, or
        ${EXT_shader_image_load_store.cap} is supported) or floating-point pointers (if ${NV_gpu_shader5.cap} is supported). Additionally, assembly opcodes
        for these operations is also provided if ${registryLink("NV", "gpu_program5")} is supported.
        """
}
val NV_shader_atomic_float64 = EXT_FLAG.nativeClassGL("NV_shader_atomic_float64", postfix = NV) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension provides GLSL built-in functions and assembly opcodes allowing shaders to perform atomic read-modify-write operations to buffer or
        shared memory with double-precision floating-point components.  The set of atomic operations provided by this extension is limited to adds and
        exchanges. Providing atomic add support allows shaders to atomically accumulate the sum of double-precision floating-point values into buffer memory
        across multiple (possibly concurrent) shader invocations.

        This extension provides GLSL support for atomics targeting double-precision floating-point pointers (if ${NV_gpu_shader5.link} is supported).
        Additionally, assembly opcodes for these operations are also provided if {@code NV_gpu_program5} is supported.

        Requires ${ARB_gpu_shader_fp64.link} or {@code NV_gpu_program_fp64}.
        """
}
val NV_shader_atomic_fp16_vector = EXT_FLAG.nativeClassGL("NV_shader_atomic_fp16_vector", postfix = NV) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension provides GLSL built-in functions and assembly opcodes allowing shaders to perform a limited set of atomic read-modify-write operations
        to buffer or texture memory with 16-bit floating point vector surface formats.

        Requires ${NV_gpu_shader5.cap}.
        """
}
val NV_shader_atomic_int64 = EXT_FLAG.nativeClassGL("NV_shader_atomic_int64", postfix = NV) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension provides additional GLSL built-in functions and assembly opcodes allowing shaders to perform additional atomic read-modify-write
        operations on 64-bit signed and unsigned integers stored in buffer object memory.
        """
}
val NV_shader_thread_shuffle = EXT_FLAG.nativeClassGL("NV_shader_thread_shuffle", postfix = NV) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        Implementations of the OpenGL Shading Language may, but are not required, to run multiple shader threads for a single stage as a SIMD thread group,
        where individual execution threads are assigned to thread groups in an undefined, implementation-dependent order.  This extension provides a set of
        new features to the OpenGL Shading Language to share data between multiple threads within a thread group.

        Requires ${GL43.core} and GLSL 4.3.
        """
}
val NV_stereo_view_rendering = EXT_FLAG.nativeClassGL("NV_stereo_view_rendering", postfix = NV) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        Virtual reality (VR) applications often render a single logical scene from multiple views corresponding to a pair of eyes. The views (eyes) are
        separated by a fixed offset in the X direction.

        Traditionally, multiple views are rendered via multiple rendering passes. This is expensive for the GPU because the objects in the scene must be
        transformed, rasterized, shaded, and fragment processed redundantly. This is expensive for the CPU because the scene graph needs to be visited multiple
        times and driver validation happens for each view. Rendering N passes tends to take N times longer than a single pass.

        This extension provides a mechanism to render binocular (stereo) views from a single stream of OpenGL rendering commands. Vertex, tessellation, and
        geometry (VTG) shaders can output two positions for each vertex corresponding to the two eye views. A built-in "gl_SecondaryPositionNV" is added to
        specify the second position. The positions from each view may be sent to different viewports and/or layers. A built-in "gl_SecondaryViewportMaskNV[]"
        is also added to specify the viewport mask for the second view. A new layout-qualifier "secondary_view_offset" is added for built-in output "gl_Layer"
        which allows for the geometry from each view to be sent to different layers for rendering.

        Requires {@link \#GL_NV_viewport_array2 NV_viewport_array2}.
        """
}
val NV_texture_compression_vtc = EXT_FLAG.nativeClassGL("NV_texture_compression_vtc", postfix = NV) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension adds support for the VTC 3D texture compression formats, which are analogous to the S3TC texture compression formats, with the addition
        of some retiling in the Z direction. VTC has the same compression ratio as S3TC and uses 4x4x1, 4x4x2, (4x4x3 when non-power-of-two textures are
        supported), or 4x4x4 blocks.
        """
}
val NV_viewport_array2 = EXT_FLAG.nativeClassGL("NV_viewport_array2", postfix = NV) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension provides new support allowing a single primitive to be broadcast to multiple viewports and/or multiple layers. A shader output
        gl_ViewportMask[] is provided, allowing a single primitive to be output to multiple viewports simultaneously. Also, a new shader option is provided to
        control whether the effective viewport index is added into gl_Layer. These capabilities allow a single primitive to be output to multiple layers
        simultaneously.

        The gl_ViewportMask[] output is available in vertex, tessellation control, tessellation evaluation, and geometry shaders. gl_ViewportIndex and gl_Layer
        are also made available in all these shader stages. The actual viewport index or mask and render target layer values are taken from the last active
        shader stage from this set of stages.

        This extension is a superset of the GL_AMD_vertex_shader_layer and GL_AMD_vertex_shader_viewport_index extensions, and thus those extension strings are
        expected to be exported if GL_NV_viewport_array2 is supported.
        """
}
val NVX_blend_equation_advanced_multi_draw_buffers = EXT_FLAG.nativeClassGL("NVX_blend_equation_advanced_multi_draw_buffers", postfix = NVX) {
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

val OVR_multiview2 = "OVRMultiview2".nativeClassGL("OVR_multiview2", postfix = OVR) {
    documentation =
        """
        When true, the $registryLink extension is supported.

        This extension relaxes the restriction in OVR_multiview that only {@code gl_Position} can depend on {@code ViewID} in the vertex shader.  With this
        change, view-dependent outputs like reflection vectors and similar are allowed.

        Requires ${GL30.core} and ${OVR_multiview.link}.
        """
}

// Platform-specific

val WGL_EXT_swap_control_tear = EXT_FLAG.nativeClassWGL("WGL_EXT_swap_control_tear", postfix = EXT) {
    documentation =
        """
        When true, the ${registryLink("EXT", "wgl_swap_control_tear")} extension is supported.

        This extension extends the existing ${WGL_EXT_swap_control.link} extension by allowing a negative {@code interval} parameter to
        WGLEXTSwapControl#wglSwapIntervalEXT(). The negative {@code interval} allows late swaps to occur without synchronization to the video frame. This
        reduces the visual stutter on late frames and reduces the stall on subsequent frames.
        """
}
val WGL_NV_DX_interop2 = EXT_FLAG.nativeClassWGL("WGL_NV_DX_interop2", postfix = NV) {
    documentation =
        """
        When true, the ${registryLink("NV", "DX_interop2")} extension is supported.

        This extension expands on the specification of ${registryLinkTo("NV", "DX_interop")} to add support for DirectX version 10, 10.1 and 11 resources.

        Requires ${GL20.core} and ${registryLinkTo("NV", "DX_interop")}.
        """
}