/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_sparse_buffer = "ARBSparseBuffer".nativeClassGL("ARB_sparse_buffer", postfix = ARB) {
    IntConstant(
        "SPARSE_STORAGE_BIT_ARB"..0x0400
    )

    IntConstant(
        "SPARSE_BUFFER_PAGE_SIZE_ARB"..0x82F8
    )

    void(
        "BufferPageCommitmentARB",

        GLenum("target"),
        GLintptr("offset"),
        GLsizeiptr("size"),
        GLboolean("commit")
    )

    DependsOn("GL_EXT_direct_state_access")..IgnoreMissing..void(
        "NamedBufferPageCommitmentEXT",

        GLuint("buffer"),
        GLintptr("offset"),
        GLsizeiptr("size"),
        GLboolean("commit")
    )

    DependsOn("GL_ARB_direct_state_access")..IgnoreMissing..void(
        "NamedBufferPageCommitmentARB",

        GLuint("buffer"),
        GLintptr("offset"),
        GLsizeiptr("size"),
        GLboolean("commit")
    )
}