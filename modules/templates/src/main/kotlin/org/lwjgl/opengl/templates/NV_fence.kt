/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_fence = "NVFence".nativeClassGL("NV_fence", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The goal of this extension is provide a finer granularity of synchronizing GL command completion than offered by standard OpenGL, which offers only two
        mechanisms for synchronization: Flush and Finish. Since Flush merely assures the user that the commands complete in a finite (though undetermined)
        amount of time, it is, thus, of only modest utility. Finish, on the other hand, stalls CPU execution until all pending GL commands have completed. This
        extension offers a middle ground - the ability to "finish" a subset of the command stream, and the ability to determine whether a given command has
        completed or not.

        This extension introduces the concept of a "fence" to the OpenGL command stream. Once the fence is inserted into the command stream, it can be queried
        for a given condition - typically, its completion. Moreover, the application may also request a partial Finish -- that is, all commands prior to the
        fence will be forced to complete until control is returned to the calling process. These new mechanisms allow for synchronization between the host CPU
        and the GPU, which may be accessing the same resources (typically memory).

        This extension is useful in conjunction with NV_vertex_array_range to determine when vertex information has been pulled from the vertex array range.
        Once a fence has been tested TRUE or finished, all vertex indices issued before the fence must have been pulled. This ensures that the vertex data
        memory corresponding to the issued vertex indices can be safely modified (assuming no other outstanding vertex indices are issued subsequent to the
        fence).
        """

    IntConstant(
        "Accepted by the {@code condition} parameter of SetFenceNV.",

        "ALL_COMPLETED_NV"..0x84F2
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetFenceivNV.",

        "FENCE_STATUS_NV"..0x84F3,
        "FENCE_CONDITION_NV"..0x84F4
    )

    void(
        "DeleteFencesNV",
        "",

        AutoSize("fences")..GLsizei.IN("n", ""),
        SingleValue("fence")..const..GLuint_p.IN("fences", "")
    )

    void(
        "GenFencesNV",
        "",

        AutoSize("fences")..GLsizei.IN("n", ""),
        ReturnParam..GLuint_p.OUT("fences", "")
    )

    GLboolean(
        "IsFenceNV",
        "",

        GLuint.IN("fence", "")
    )

    GLboolean(
        "TestFenceNV",
        "",

        GLuint.IN("fence", "")
    )

    void(
        "GetFenceivNV",
        "",

        GLuint.IN("fence", ""),
        GLenum.IN("pname", ""),
        Check(1)..ReturnParam..GLint_p.OUT("params", "")
    )

    void(
        "FinishFenceNV",
        "",

        GLuint.IN("fence", "")
    )

    void(
        "SetFenceNV",
        "",

        GLuint.IN("fence", ""),
        GLenum.IN("condition", "")
    )
}