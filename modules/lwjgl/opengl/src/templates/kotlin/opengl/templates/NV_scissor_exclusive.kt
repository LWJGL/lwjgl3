/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_scissor_exclusive = "NVScissorExclusive".nativeClassGL("NV_scissor_exclusive", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        In unextended OpenGL, applications can enable a per-viewport scissor test (#SCISSOR_TEST) where fragments are discarded if their (x,y) coordinates lie
        outside the corresponding scissor rectangle. In this extension, we provide a separate per-viewport exclusive scissor test, where fragments are
        discarded if their (x,y) coordinates lie <b>inside</b> the corresponding exclusive scissor rectangle.

        The regular (inclusive) scissor test and exclusive scissor test are orthogonal; applications can enable either or both tests for each viewport. If both
        tests are enabled, fragments will be discarded unless their (x,y) coordinates are both inside the regular scissor rectangle and outside the exclusive
        scissor rectangle.

        Requires ${GL45.core}.
        """

    IntConstant(
        """
        Accepted by the {@code cap} parameter of #Enable(), #Disable(), and #IsEnabled(), by the {@code target} parameter of #Enablei(), #Disablei(),
        #IsEnabledi(), #EnableIndexedEXT(), #DisableIndexedEXT(), and #IsEnabledIndexedEXT(), and by the {@code pname} parameter of #GetBooleanv(),
        #GetIntegerv(), #GetInteger64v(), #GetFloatv(), #GetDoublev(), #GetDoubleIndexedvEXT(), #GetBooleani_v(), #GetIntegeri_v(), #GetInteger64i_v(),
        #GetFloati_v(), #GetDoublei_v(), #GetBooleanIndexedvEXT(), #GetIntegerIndexedvEXT(), and #GetFloatIndexedvEXT().
        """,

        "SCISSOR_TEST_EXCLUSIVE_NV"..0x9555
    )

    IntConstant(
        """
        Accepted by the {@code pname} parameter of #GetBooleanv(), #GetIntegerv(), #GetInteger64v(), #GetFloatv(), #GetDoublev(), #GetBooleani_v(),
        #GetIntegeri_v(), #GetInteger64i_v(), #GetFloati_v(), #GetDoublei_v(), #GetDoubleIndexedvEXT(), #GetBooleanIndexedvEXT(), #GetIntegerIndexedvEXT(), and
        #GetFloatIndexedvEXT().
        """,

        "SCISSOR_BOX_EXCLUSIVE_NV"..0x9556
    )

    void(
        "ScissorExclusiveArrayvNV",
        "",

        GLuint("first", ""),
        AutoSize(4, "v")..GLsizei("count", ""),
        GLint.const.p("v", "")
    )

    void(
        "ScissorExclusiveNV",
        "",

        GLint("x", ""),
        GLint("y", ""),
        GLsizei("width", ""),
        GLsizei("height", "")
    )
}