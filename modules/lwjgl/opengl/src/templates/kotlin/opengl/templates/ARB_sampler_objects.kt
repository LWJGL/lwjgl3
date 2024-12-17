/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_sampler_objects = "ARBSamplerObjects".nativeClassGL("ARB_sampler_objects") {
    IntConstant(
        "SAMPLER_BINDING"..0x8919
    )

    reuse(GL33C, "GenSamplers")
    reuse(GL33C, "DeleteSamplers")
    reuse(GL33C, "IsSampler")
    reuse(GL33C, "BindSampler")
    reuse(GL33C, "SamplerParameteri")
    reuse(GL33C, "SamplerParameterf")
    reuse(GL33C, "SamplerParameteriv")
    reuse(GL33C, "SamplerParameterfv")
    reuse(GL33C, "SamplerParameterIiv")
    reuse(GL33C, "SamplerParameterIuiv")
    reuse(GL33C, "GetSamplerParameteriv")
    reuse(GL33C, "GetSamplerParameterfv")
    reuse(GL33C, "GetSamplerParameterIiv")
    reuse(GL33C, "GetSamplerParameterIuiv")
}