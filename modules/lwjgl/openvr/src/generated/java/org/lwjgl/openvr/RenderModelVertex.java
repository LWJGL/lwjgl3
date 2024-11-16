/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * A single vertex in a render model.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct RenderModel_Vertex_t {
 *     {@link HmdVector3 HmdVector3_t} {@link #vPosition};
 *     {@link HmdVector3 HmdVector3_t} vNormal;
 *     float rfTextureCoord[2];
 * }</code></pre>
 */
@NativeType("struct RenderModel_Vertex_t")
public class RenderModelVertex extends Struct<RenderModelVertex> {

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

    protected RenderModelVertex(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected RenderModelVertex create(long address, @Nullable ByteBuffer container) {
        return new RenderModelVertex(address, container);
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

    /** position in meters in device space */
    @NativeType("HmdVector3_t")
    public HmdVector3 vPosition() { return nvPosition(address()); }
    /** @return a {@link HmdVector3} view of the {@code vNormal} field. */
    @NativeType("HmdVector3_t")
    public HmdVector3 vNormal() { return nvNormal(address()); }
    /** @return a {@link FloatBuffer} view of the {@code rfTextureCoord} field. */
    @NativeType("float[2]")
    public FloatBuffer rfTextureCoord() { return nrfTextureCoord(address()); }
    /** @return the value at the specified index of the {@code rfTextureCoord} field. */
    public float rfTextureCoord(int index) { return nrfTextureCoord(address(), index); }

    // -----------------------------------

    /** Returns a new {@code RenderModelVertex} instance for the specified memory address. */
    public static RenderModelVertex create(long address) {
        return new RenderModelVertex(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable RenderModelVertex createSafe(long address) {
        return address == NULL ? null : new RenderModelVertex(address, null);
    }

    /**
     * Create a {@link RenderModelVertex.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static RenderModelVertex.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static RenderModelVertex.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
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
        return memGetFloat(struct + RenderModelVertex.RFTEXTURECOORD + check(index, 2) * 4);
    }

    // -----------------------------------

    /** An array of {@link RenderModelVertex} structs. */
    public static class Buffer extends StructBuffer<RenderModelVertex, Buffer> {

        private static final RenderModelVertex ELEMENT_FACTORY = RenderModelVertex.create(-1L);

        /**
         * Creates a new {@code RenderModelVertex.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link RenderModelVertex#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected RenderModelVertex getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link HmdVector3} view of the {@link RenderModelVertex#vPosition} field. */
        @NativeType("HmdVector3_t")
        public HmdVector3 vPosition() { return RenderModelVertex.nvPosition(address()); }
        /** @return a {@link HmdVector3} view of the {@code vNormal} field. */
        @NativeType("HmdVector3_t")
        public HmdVector3 vNormal() { return RenderModelVertex.nvNormal(address()); }
        /** @return a {@link FloatBuffer} view of the {@code rfTextureCoord} field. */
        @NativeType("float[2]")
        public FloatBuffer rfTextureCoord() { return RenderModelVertex.nrfTextureCoord(address()); }
        /** @return the value at the specified index of the {@code rfTextureCoord} field. */
        public float rfTextureCoord(int index) { return RenderModelVertex.nrfTextureCoord(address(), index); }

    }

}