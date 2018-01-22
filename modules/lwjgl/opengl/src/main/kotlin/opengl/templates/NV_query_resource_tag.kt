/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

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

        AutoSize("tagIds")..GLsizei.IN("n", ""),
        ReturnParam..GLuint_p.OUT("tagIds", "")
    )

    void(
        "DeleteQueryResourceTagNV",
        "",

        AutoSize("tagIds")..GLsizei.IN("n", ""),
        SingleValue("tagId")..const..GLuint_p.IN("tagIds", "")
    )

    void(
        "QueryResourceTagNV",
        "",

        GLuint.IN("tagId", ""),
        const..GLcharASCII_p.IN("tagString", "")
    )
}