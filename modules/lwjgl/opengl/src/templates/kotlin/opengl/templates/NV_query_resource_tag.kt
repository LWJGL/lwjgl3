/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_query_resource_tag = "NVQueryResourceTag".nativeClassGL("NV_query_resource_tag", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds the capability to associate a tag with one or more memory resource allocations. This tag can be reported back during
        {@code queryResource} operations and also be used to limit resource reporting to only those allocations with the specified tag. A tag is a previously
        reserved id and an optional text string.

        Requires ${GL20.core} and ${NV_query_resource.link}.
        """

    void(
        "GenQueryResourceTagNV",
        "",

        AutoSize("tagIds")..GLsizei("n", ""),
        ReturnParam..GLuint.p("tagIds", "")
    )

    void(
        "DeleteQueryResourceTagNV",
        "",

        AutoSize("tagIds")..GLsizei("n", ""),
        SingleValue("tagId")..GLuint.const.p("tagIds", "")
    )

    void(
        "QueryResourceTagNV",
        "",

        GLuint("tagId", ""),
        GLcharASCII.const.p("tagString", "")
    )
}