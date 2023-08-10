/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_pixel_buffer_object.txt">ARB_pixel_buffer_object</a> extension.
 * 
 * <p>This extension expands on the interface provided by the {@link ARBVertexBufferObject ARB_vertex_buffer_object} extension (and later integrated into {@link GL15 OpenGL 1.5}) in order to
 * permit buffer objects to be used not only with vertex array data, but also with pixel data. The intent is to provide more acceleration opportunities
 * for OpenGL pixel commands.</p>
 * 
 * <p>While a single buffer object can be bound for both vertex arrays and pixel commands, we use the designations vertex buffer object (VBO) and pixel buffer
 * object (PBO) to indicate their particular usage in a given situation.</p>
 * 
 * <p>Recall that buffer objects conceptually are nothing more than arrays of bytes, just like any chunk of memory. {@link ARBVertexBufferObject ARB_vertex_buffer_object} allows GL
 * commands to source data from a buffer object by binding the buffer object to a given target and then overloading a certain set of GL commands' pointer
 * arguments to refer to offsets inside the buffer, rather than pointers to user memory. An offset is encoded in a pointer by adding the offset to a null
 * pointer.</p>
 * 
 * <p>This extension does not add any new functionality to buffer objects themselves.  It simply adds two new targets to which buffer objects can be bound:
 * {@link #GL_PIXEL_PACK_BUFFER_ARB PIXEL_PACK_BUFFER_ARB} and {@link #GL_PIXEL_UNPACK_BUFFER_ARB PIXEL_UNPACK_BUFFER_ARB}. When a buffer object is bound to the {@link #GL_PIXEL_PACK_BUFFER_ARB PIXEL_PACK_BUFFER_ARB} target, commands such as
 * {@link GL11C#glReadPixels ReadPixels} pack (write) their data into a buffer object. When a buffer object is bound to the {@link #GL_PIXEL_UNPACK_BUFFER_ARB PIXEL_UNPACK_BUFFER_ARB} target, commands such as
 * {@link GL11#glDrawPixels DrawPixels} and {@link GL11C#glTexImage2D TexImage2D} unpack (read) their data from a buffer object.</p>
 * 
 * <p>There are a several approaches to improve graphics performance with PBOs. Some of the most interesting approaches are:</p>
 * 
 * <ul>
 * <li>Streaming texture updates: If the application uses {@link GL15C#glMapBuffer MapBuffer}/{@link GL15C#glUnmapBuffer UnmapBuffer} to write its data for glTexSubImage into a buffer object, at
 * least one of the data copies usually required to download a texture can be eliminated, significantly increasing texture download performance.</li>
 * <li>Streaming draw pixels: When {@link GL11#glDrawPixels DrawPixels} sources client memory, OpenGL says the client memory can be modified immediately after the
 * glDrawPixels command returns without disturbing the drawn image. This typically necessitates unpacking and copying the image prior to glDrawPixels
 * returning. However, when using glDrawPixels with a pixel pack buffer object, glDrawPixels may return prior to image unpacking because future
 * modification of the buffer data requires explicit commands ({@link GL15C#glMapBuffer MapBuffer}, {@link GL15C#glBufferData BufferData}, or {@link GL15C#glBufferSubData BufferSubData}).</li>
 * <li>Asynchronous {@link GL11C#glReadPixels ReadPixels}: If an application needs to read back a number of images and process them with the CPU, the existing GL interface
 * makes it nearly impossible to pipeline this operation. The driver will typically send the hardware a readback command when glReadPixels is called,
 * and then wait for all of the data to be available before returning control to the application. Then, the application can either process the data
 * immediately or call glReadPixels again; in neither case will the readback overlap with the processing. If the application issues several readbacks
 * into several buffer objects, however, and then maps each one to process its data, then the readbacks can proceed in parallel with the data processing.</li>
 * <li>Render to vertex array: The application can use a fragment program to render some image into one of its buffers, then read this image out into a
 * buffer object via {@link GL11C#glReadPixels ReadPixels}. Then, it can use this buffer object as a source of vertex data.</li>
 * </ul>
 * 
 * <p>Requires {@link GL15 OpenGL 1.5} or {@link ARBVertexBufferObject ARB_vertex_buffer_object}. Promoted to core in {@link GL21 OpenGL 2.1}.</p>
 */
public final class ARBPixelBufferObject {

    /**
     * Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferParameteriv, and
     * GetBufferPointerv.
     */
    public static final int
        GL_PIXEL_PACK_BUFFER_ARB   = 0x88EB,
        GL_PIXEL_UNPACK_BUFFER_ARB = 0x88EC;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_PIXEL_PACK_BUFFER_BINDING_ARB   = 0x88ED,
        GL_PIXEL_UNPACK_BUFFER_BINDING_ARB = 0x88EF;

    private ARBPixelBufferObject() {}

}