/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_vertex_type_2_10_10_10_rev = "ARBVertexType2_10_10_10_REV".nativeClassGL("ARB_vertex_type_2_10_10_10_rev") {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds two new vertex attribute data formats: a signed 2.10.10.10 and an unsigned 2.10.10.10 vertex data format. These vertex data formats
        describe a 4 component stream which can be used to store normals or other attributes in a quantized form. Normals, tangents, binormals and other vertex
        attributes can often be specified at reduced precision without introducing noticeable artifacts, reducing the amount of memory and memory bandwidth they consume.

        ${GL33.promoted}
        """

    IntConstant(
        """
        Accepted by the {@code type} parameter of VertexAttribPointer, VertexPointer, NormalPointer, ColorPointer, SecondaryColorPointer, TexCoordPointer,
        VertexAttribP{1234}ui, VertexP*, TexCoordP*, MultiTexCoordP*, NormalP3ui, ColorP*, SecondaryColorP and VertexAttribP*.
        """,

        "INT_2_10_10_10_REV"..0x8D9F
    )

    reuse(GL33, "VertexP2ui")
    reuse(GL33, "VertexP3ui")
    reuse(GL33, "VertexP4ui")
    reuse(GL33, "VertexP2uiv")
    reuse(GL33, "VertexP3uiv")
    reuse(GL33, "VertexP4uiv")
    reuse(GL33, "TexCoordP1ui")
    reuse(GL33, "TexCoordP2ui")
    reuse(GL33, "TexCoordP3ui")
    reuse(GL33, "TexCoordP4ui")
    reuse(GL33, "TexCoordP1uiv")
    reuse(GL33, "TexCoordP2uiv")
    reuse(GL33, "TexCoordP3uiv")
    reuse(GL33, "TexCoordP4uiv")
    reuse(GL33, "MultiTexCoordP1ui")
    reuse(GL33, "MultiTexCoordP2ui")
    reuse(GL33, "MultiTexCoordP3ui")
    reuse(GL33, "MultiTexCoordP4ui")
    reuse(GL33, "MultiTexCoordP1uiv")
    reuse(GL33, "MultiTexCoordP2uiv")
    reuse(GL33, "MultiTexCoordP3uiv")
    reuse(GL33, "MultiTexCoordP4uiv")
    reuse(GL33, "NormalP3ui")
    reuse(GL33, "NormalP3uiv")
    reuse(GL33, "ColorP3ui")
    reuse(GL33, "ColorP4ui")
    reuse(GL33, "ColorP3uiv")
    reuse(GL33, "ColorP4uiv")
    reuse(GL33, "SecondaryColorP3ui")
    reuse(GL33, "SecondaryColorP3uiv")
    reuse(GL33C, "VertexAttribP1ui")
    reuse(GL33C, "VertexAttribP2ui")
    reuse(GL33C, "VertexAttribP3ui")
    reuse(GL33C, "VertexAttribP4ui")
    reuse(GL33C, "VertexAttribP1uiv")
    reuse(GL33C, "VertexAttribP2uiv")
    reuse(GL33C, "VertexAttribP3uiv")
    reuse(GL33C, "VertexAttribP4uiv")
}