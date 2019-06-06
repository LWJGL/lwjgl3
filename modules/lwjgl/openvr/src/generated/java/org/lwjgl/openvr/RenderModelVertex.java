/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * A single vertex in a render model.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code vPosition} &ndash; position in meters in device space</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct RenderModel_Vertex_t {
 *     {@link HmdVector3 HmdVector3_t} vPosition;
 *     {@link HmdVector3 HmdVector3_t} vNormal;
 *     float rfTextureCoord[2];
 * }</code></pre>
 */
@NativeType("struct RenderModel_Vertex_t")
public class RenderModelVertex extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VPOSITION,
        VNORMAL,
        RFTEXTURECOORD;

    static {
        Layout layout = __struct(
            __member(HmdVector3.SIZEOF, HmdVector3.ALIGNOF),
            __member(HmdVector3.SIZEOF, HmdVector3.ALIGNOF),
            __array(4, 2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VPOSITION = layout.offsetof(0);
        VNORMAL = layout.offsetof(1);
        RFTEXTURECOORD = layout.offsetof(2);
    }

    /**
     * Creates a {@code RenderModelVertex} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public RenderModelVertex(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link HmdVector3} view of the {@code vPosition} field. */
    @NativeType("HmdVector3_t")
    public HmdVector3 vPosition() { return nvPosition(address()); }
    /** Returns a {@link HmdVector3} view of the {@code vNormal} field. */
    @NativeType("HmdVector3_t")
    public HmdVector3 vNormal() { return nvNormal(address()); }
    /** Returns a {@link FloatBuffer} view of the {@code rfTextureCoord} field. */
    @NativeType("float[2]")
    public FloatBuffer rfTextureCoord() { return nrfTextureCoord(address()); }
    /** Returns the value at the specified index of the {@code rfTextureCoord} field. */
    public float rfTextureCoord(int index) { return nrfTextureCoord(address(), index); }

    // -----------------------------------

    /** Returns a new {@code RenderModelVertex} instance for the specified memory address. */
    public static RenderModelVertex create(long address) {
        return wrap(RenderModelVertex.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static RenderModelVertex createSafe(long address) {
        return address == NULL ? null : wrap(RenderModelVertex.class, address);
    }

    /**
     * Create a {@link RenderModelVertex.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static RenderModelVertex.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static RenderModelVertex.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #vPosition}. */
    public static HmdVector3 nvPosition(long struct) { return HmdVector3.create(struct + RenderModelVertex.VPOSITION); }
    /** Unsafe version of {@link #vNormal}. */
    public static HmdVector3 nvNormal(long struct) { return HmdVector3.create(struct + RenderModelVertex.VNORMAL); }
    /** Unsafe version of {@link #rfTextureCoord}. */
    public static FloatBuffer nrfTextureCoord(long struct) { return memFloatBuffer(struct + RenderModelVertex.RFTEXTURECOORD, 2); }
    /** Unsafe version of {@link #rfTextureCoord(int) rfTextureCoord}. */
    public static float nrfTextureCoord(long struct, int index) {
        return UNSAFE.getFloat(null, struct + RenderModelVertex.RFTEXTURECOORD + check(index, 2) * 4);
    }

    // -----------------------------------

    /** An array of {@link RenderModelVertex} structs. */
    public static class Buffer extends StructBuffer<RenderModelVertex, Buffer> {

        private static final RenderModelVertex ELEMENT_FACTORY = RenderModelVertex.create(-1L);

        /**
         * Creates a new {@code RenderModelVertex.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link RenderModelVertex#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected RenderModelVertex getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link HmdVector3} view of the {@code vPosition} field. */
        @NativeType("HmdVector3_t")
        public HmdVector3 vPosition() { return RenderModelVertex.nvPosition(address()); }
        /** Returns a {@link HmdVector3} view of the {@code vNormal} field. */
        @NativeType("HmdVector3_t")
        public HmdVector3 vNormal() { return RenderModelVertex.nvNormal(address()); }
        /** Returns a {@link FloatBuffer} view of the {@code rfTextureCoord} field. */
        @NativeType("float[2]")
        public FloatBuffer rfTextureCoord() { return RenderModelVertex.nrfTextureCoord(address()); }
        /** Returns the value at the specified index of the {@code rfTextureCoord} field. */
        public float rfTextureCoord(int index) { return RenderModelVertex.nrfTextureCoord(address(), index); }

    }

}