/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_query_resource_tag = "NVQueryResourceTag".nativeClassGL("NV_query_resource_tag", postfix = NV) {
    void(
        "GenQueryResourceTagNV",

        AutoSize("tagIds")..GLsizei("n"),
        ReturnParam..GLuint.p("tagIds")
    )

    void(
        "DeleteQueryResourceTagNV",

        AutoSize("tagIds")..GLsizei("n"),
        SingleValue("tagId")..GLuint.const.p("tagIds")
    )

    void(
        "QueryResourceTagNV",

        GLuint("tagId"),
        GLcharASCII.const.p("tagString")
    )
}