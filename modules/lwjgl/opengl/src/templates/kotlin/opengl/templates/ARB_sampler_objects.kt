/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_sampler_objects = "ARBSamplerObjects".nativeClassGL("ARB_sampler_objects") {
    documentation =
        """
        Native bindings to the $registryLink extension.

        In unextended OpenGL textures are considered to be sets of image data (mip-chains, arrays, cube-map face sets, etc.) and sampling state (sampling mode,
        mip-mapping state, coordinate wrapping and clamping rules, etc.) combined into a single object. It is typical for an application to use many textures
        with a limited set of sampling states that are the same between them. In order to use textures in this way, an application must generate and configure
        many texture names, adding overhead both to applications and to implementations. Furthermore, should an application wish to sample from a texture in
        more than one way (with and without mip-mapping, for example) it must either modify the state of the texture or create two textures, each with a copy of
        the same image data. This can introduce runtime and memory costs to the application.

        This extension separates sampler state from texture image data. A new object type is introduced, the sampler (representing generic sampling parameters).
        The new sampler objects are represented by a new named type encapsulating the sampling parameters of a traditional texture object. Sampler objects may
        be bound to texture units to supplant the bound texture's sampling state. A single sampler may be bound to more than one texture unit simultaneously,
        allowing different textures to be accessed with a single set of shared sampling parameters. Also, by binding different sampler objects to texture units
        to which the same texture has been bound, the same texture image data may be sampled with different sampling parameters.

        ${GL33.promoted}
        """

    IntConstant(
        "Accepted by the {@code value} parameter of the GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv and GetDoublev functions.",

        "SAMPLER_BINDING"..0x8919
    )

    GL33C reuse "GenSamplers"
    GL33C reuse "DeleteSamplers"
    GL33C reuse "IsSampler"
    GL33C reuse "BindSampler"
    GL33C reuse "SamplerParameteri"
    GL33C reuse "SamplerParameterf"
    GL33C reuse "SamplerParameteriv"
    GL33C reuse "SamplerParameterfv"
    GL33C reuse "SamplerParameterIiv"
    GL33C reuse "SamplerParameterIuiv"
    GL33C reuse "GetSamplerParameteriv"
    GL33C reuse "GetSamplerParameterfv"
    GL33C reuse "GetSamplerParameterIiv"
    GL33C reuse "GetSamplerParameterIuiv"
}