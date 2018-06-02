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

    RenderModelVertex(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link RenderModelVertex} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public RenderModelVertex(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link HmdVector3} view of the {@code vPosition} field. */
    @NativeType("HmdVector3_t")
    public HmdVector3 vPosition() { return nvPosition(address()); }
    /** Passes the {@code vPosition} field to the specified {@link java.util.function.Consumer Consumer}. */
    public RenderModelVertex vPosition(java.util.function.Consumer<HmdVector3> consumer) { consumer.accept(vPosition()); return this; }
    /** Returns a {@link HmdVector3} view of the {@code vNormal} field. */
    @NativeType("HmdVector3_t")
    public HmdVector3 vNormal() { return nvNormal(address()); }
    /** Passes the {@code vNormal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public RenderModelVertex vNormal(java.util.function.Consumer<HmdVector3> consumer) { consumer.accept(vNormal()); return this; }
    /** Returns a {@link FloatBuffer} view of the {@code rfTextureCoord} field. */
    @NativeType("float[2]")
    public FloatBuffer rfTextureCoord() { return nrfTextureCoord(address()); }
    /** Returns the value at the specified index of the {@code rfTextureCoord} field. */
    public float rfTextureCoord(int index) { return nrfTextureCoord(address(), index); }

    // -----------------------------------

    /** Returns a new {@link RenderModelVertex} instance for the specified memory address. */
    public static RenderModelVertex create(long address) {
        return new RenderModelVertex(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static RenderModelVertex createSafe(long address) {
        return address == NULL ? null : create(address);
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
    @Nullable
    public static RenderModelVertex.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
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

        /**
         * Creates a new {@link RenderModelVertex.Buffer} instance backed by the specified container.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected RenderModelVertex newInstance(long address) {
            return new RenderModelVertex(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link HmdVector3} view of the {@code vPosition} field. */
        @NativeType("HmdVector3_t")
        public HmdVector3 vPosition() { return RenderModelVertex.nvPosition(address()); }
        /** Passes the {@code vPosition} field to the specified {@link java.util.function.Consumer Consumer}. */
        public RenderModelVertex.Buffer vPosition(java.util.function.Consumer<HmdVector3> consumer) { consumer.accept(vPosition()); return this; }
        /** Returns a {@link HmdVector3} view of the {@code vNormal} field. */
        @NativeType("HmdVector3_t")
        public HmdVector3 vNormal() { return RenderModelVertex.nvNormal(address()); }
        /** Passes the {@code vNormal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public RenderModelVertex.Buffer vNormal(java.util.function.Consumer<HmdVector3> consumer) { consumer.accept(vNormal()); return this; }
        /** Returns a {@link FloatBuffer} view of the {@code rfTextureCoord} field. */
        @NativeType("float[2]")
        public FloatBuffer rfTextureCoord() { return RenderModelVertex.nrfTextureCoord(address()); }
        /** Returns the value at the specified index of the {@code rfTextureCoord} field. */
        public float rfTextureCoord(int index) { return RenderModelVertex.nrfTextureCoord(address(), index); }

    }

}