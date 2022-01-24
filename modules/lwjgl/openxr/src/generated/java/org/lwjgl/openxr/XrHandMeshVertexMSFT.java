/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * The vertex of hand mesh.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTHandTrackingMesh XR_MSFT_hand_tracking_mesh} extension <b>must</b> be enabled prior to using {@link XrHandMeshVertexMSFT}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrHandMeshVertexBufferMSFT}, {@link XrVector3f}, {@link MSFTHandTrackingMesh#xrUpdateHandMeshMSFT UpdateHandMeshMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrHandMeshVertexMSFT {
 *     {@link XrVector3f XrVector3f} {@link #position$ position};
 *     {@link XrVector3f XrVector3f} {@link #normal};
 * }</code></pre>
 */
public class XrHandMeshVertexMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        POSITION,
        NORMAL;

    static {
        Layout layout = __struct(
            __member(XrVector3f.SIZEOF, XrVector3f.ALIGNOF),
            __member(XrVector3f.SIZEOF, XrVector3f.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        POSITION = layout.offsetof(0);
        NORMAL = layout.offsetof(1);
    }

    /**
     * Creates a {@code XrHandMeshVertexMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHandMeshVertexMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** an {@link XrVector3f} structure representing the position of the vertex in the hand mesh space, measured in meters. */
    public XrVector3f position$() { return nposition$(address()); }
    /** an {@link XrVector3f} structure representing the unweighted normal of the triangle surface at the vertex as a unit vector in hand mesh space. */
    public XrVector3f normal() { return nnormal(address()); }

    /** Copies the specified {@link XrVector3f} to the {@link #position$} field. */
    public XrHandMeshVertexMSFT position$(XrVector3f value) { nposition$(address(), value); return this; }
    /** Passes the {@link #position$} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrHandMeshVertexMSFT position$(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(position$()); return this; }
    /** Copies the specified {@link XrVector3f} to the {@link #normal} field. */
    public XrHandMeshVertexMSFT normal(XrVector3f value) { nnormal(address(), value); return this; }
    /** Passes the {@link #normal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrHandMeshVertexMSFT normal(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(normal()); return this; }

    /** Initializes this struct with the specified values. */
    public XrHandMeshVertexMSFT set(
        XrVector3f position$,
        XrVector3f normal
    ) {
        position$(position$);
        normal(normal);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrHandMeshVertexMSFT set(XrHandMeshVertexMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHandMeshVertexMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHandMeshVertexMSFT malloc() {
        return wrap(XrHandMeshVertexMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrHandMeshVertexMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHandMeshVertexMSFT calloc() {
        return wrap(XrHandMeshVertexMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrHandMeshVertexMSFT} instance allocated with {@link BufferUtils}. */
    public static XrHandMeshVertexMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrHandMeshVertexMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrHandMeshVertexMSFT} instance for the specified memory address. */
    public static XrHandMeshVertexMSFT create(long address) {
        return wrap(XrHandMeshVertexMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandMeshVertexMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrHandMeshVertexMSFT.class, address);
    }

    /**
     * Returns a new {@link XrHandMeshVertexMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshVertexMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHandMeshVertexMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshVertexMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandMeshVertexMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshVertexMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrHandMeshVertexMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHandMeshVertexMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandMeshVertexMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrHandMeshVertexMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandMeshVertexMSFT malloc(MemoryStack stack) {
        return wrap(XrHandMeshVertexMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrHandMeshVertexMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandMeshVertexMSFT calloc(MemoryStack stack) {
        return wrap(XrHandMeshVertexMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrHandMeshVertexMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandMeshVertexMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandMeshVertexMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandMeshVertexMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #position$}. */
    public static XrVector3f nposition$(long struct) { return XrVector3f.create(struct + XrHandMeshVertexMSFT.POSITION); }
    /** Unsafe version of {@link #normal}. */
    public static XrVector3f nnormal(long struct) { return XrVector3f.create(struct + XrHandMeshVertexMSFT.NORMAL); }

    /** Unsafe version of {@link #position$(XrVector3f) position$}. */
    public static void nposition$(long struct, XrVector3f value) { memCopy(value.address(), struct + XrHandMeshVertexMSFT.POSITION, XrVector3f.SIZEOF); }
    /** Unsafe version of {@link #normal(XrVector3f) normal}. */
    public static void nnormal(long struct, XrVector3f value) { memCopy(value.address(), struct + XrHandMeshVertexMSFT.NORMAL, XrVector3f.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrHandMeshVertexMSFT} structs. */
    public static class Buffer extends StructBuffer<XrHandMeshVertexMSFT, Buffer> implements NativeResource {

        private static final XrHandMeshVertexMSFT ELEMENT_FACTORY = XrHandMeshVertexMSFT.create(-1L);

        /**
         * Creates a new {@code XrHandMeshVertexMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHandMeshVertexMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrHandMeshVertexMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link XrVector3f} view of the {@link XrHandMeshVertexMSFT#position$} field. */
        public XrVector3f position$() { return XrHandMeshVertexMSFT.nposition$(address()); }
        /** @return a {@link XrVector3f} view of the {@link XrHandMeshVertexMSFT#normal} field. */
        public XrVector3f normal() { return XrHandMeshVertexMSFT.nnormal(address()); }

        /** Copies the specified {@link XrVector3f} to the {@link XrHandMeshVertexMSFT#position$} field. */
        public XrHandMeshVertexMSFT.Buffer position$(XrVector3f value) { XrHandMeshVertexMSFT.nposition$(address(), value); return this; }
        /** Passes the {@link XrHandMeshVertexMSFT#position$} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrHandMeshVertexMSFT.Buffer position$(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(position$()); return this; }
        /** Copies the specified {@link XrVector3f} to the {@link XrHandMeshVertexMSFT#normal} field. */
        public XrHandMeshVertexMSFT.Buffer normal(XrVector3f value) { XrHandMeshVertexMSFT.nnormal(address(), value); return this; }
        /** Passes the {@link XrHandMeshVertexMSFT#normal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrHandMeshVertexMSFT.Buffer normal(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(normal()); return this; }

    }

}