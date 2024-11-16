/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Event buffer.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link XrEventDataBuffer} is a structure passed to {@link XR10#xrPollEvent PollEvent} large enough to contain any returned event data element. The maximum size is specified by {@link XR10#XR_MAX_EVENT_DATA_SIZE MAX_EVENT_DATA_SIZE}.</p>
 * 
 * <p>An application <b>can</b> set (or reset) only the {@code type} member and clear the {@code next} member of an {@link XrEventDataBuffer} before passing it as an input to {@link XR10#xrPollEvent PollEvent}. The runtime <b>must</b> ignore the contents of the {@code varying} field and overwrite it without reading it.</p>
 * 
 * <p>A pointer to an {@link XrEventDataBuffer} <b>may</b> be type-cast to an {@link XrEventDataBaseHeader} pointer, or a pointer to any other appropriate event data based on the {@code type} parameter.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link XR10#XR_TYPE_EVENT_DATA_BUFFER TYPE_EVENT_DATA_BUFFER}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrEventDataBaseHeader}, {@link XR10#xrPollEvent PollEvent}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrEventDataBuffer {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     uint8_t {@link #varying}[4000];
 * }</code></pre>
 */
public class XrEventDataBuffer extends Struct<XrEventDataBuffer> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        VARYING;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(1, 4000)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        VARYING = layout.offsetof(2);
    }

    protected XrEventDataBuffer(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataBuffer create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataBuffer(address, container);
    }

    /**
     * Creates a {@code XrEventDataBuffer} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataBuffer(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** a fixed sized output buffer big enough to hold returned data elements for all specified event data types. */
    @NativeType("uint8_t[4000]")
    public ByteBuffer varying() { return nvarying(address()); }
    /** a fixed sized output buffer big enough to hold returned data elements for all specified event data types. */
    @NativeType("uint8_t")
    public byte varying(int index) { return nvarying(address(), index); }

    /** Sets the specified value to the {@link #type} field. */
    public XrEventDataBuffer type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_EVENT_DATA_BUFFER TYPE_EVENT_DATA_BUFFER} value to the {@link #type} field. */
    public XrEventDataBuffer type$Default() { return type(XR10.XR_TYPE_EVENT_DATA_BUFFER); }
    /** Sets the specified value to the {@link #next} field. */
    public XrEventDataBuffer next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@link #varying} field. */
    public XrEventDataBuffer varying(@NativeType("uint8_t[4000]") ByteBuffer value) { nvarying(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #varying} field. */
    public XrEventDataBuffer varying(int index, @NativeType("uint8_t") byte value) { nvarying(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataBuffer set(
        int type,
        long next,
        ByteBuffer varying
    ) {
        type(type);
        next(next);
        varying(varying);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEventDataBuffer set(XrEventDataBuffer src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataBuffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataBuffer malloc() {
        return new XrEventDataBuffer(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataBuffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataBuffer calloc() {
        return new XrEventDataBuffer(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataBuffer} instance allocated with {@link BufferUtils}. */
    public static XrEventDataBuffer create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataBuffer(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataBuffer} instance for the specified memory address. */
    public static XrEventDataBuffer create(long address) {
        return new XrEventDataBuffer(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataBuffer createSafe(long address) {
        return address == NULL ? null : new XrEventDataBuffer(address, null);
    }

    /**
     * Returns a new {@link XrEventDataBuffer.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataBuffer.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataBuffer.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataBuffer.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataBuffer.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataBuffer.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataBuffer.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataBuffer.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataBuffer.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrEventDataBuffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataBuffer malloc(MemoryStack stack) {
        return new XrEventDataBuffer(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataBuffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataBuffer calloc(MemoryStack stack) {
        return new XrEventDataBuffer(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataBuffer.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataBuffer.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataBuffer.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataBuffer.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataBuffer.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataBuffer.NEXT); }
    /** Unsafe version of {@link #varying}. */
    public static ByteBuffer nvarying(long struct) { return memByteBuffer(struct + XrEventDataBuffer.VARYING, 4000); }
    /** Unsafe version of {@link #varying(int) varying}. */
    public static byte nvarying(long struct, int index) {
        return memGetByte(struct + XrEventDataBuffer.VARYING + check(index, 4000) * 1);
    }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataBuffer.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataBuffer.NEXT, value); }
    /** Unsafe version of {@link #varying(ByteBuffer) varying}. */
    public static void nvarying(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 4000); }
        memCopy(memAddress(value), struct + XrEventDataBuffer.VARYING, value.remaining() * 1);
    }
    /** Unsafe version of {@link #varying(int, byte) varying}. */
    public static void nvarying(long struct, int index, byte value) {
        memPutByte(struct + XrEventDataBuffer.VARYING + check(index, 4000) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link XrEventDataBuffer} structs. */
    public static class Buffer extends StructBuffer<XrEventDataBuffer, Buffer> implements NativeResource {

        private static final XrEventDataBuffer ELEMENT_FACTORY = XrEventDataBuffer.create(-1L);

        /**
         * Creates a new {@code XrEventDataBuffer.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataBuffer#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataBuffer getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrEventDataBuffer#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataBuffer.ntype(address()); }
        /** @return the value of the {@link XrEventDataBuffer#next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataBuffer.nnext(address()); }
        /** @return a {@link ByteBuffer} view of the {@link XrEventDataBuffer#varying} field. */
        @NativeType("uint8_t[4000]")
        public ByteBuffer varying() { return XrEventDataBuffer.nvarying(address()); }
        /** @return the value at the specified index of the {@link XrEventDataBuffer#varying} field. */
        @NativeType("uint8_t")
        public byte varying(int index) { return XrEventDataBuffer.nvarying(address(), index); }

        /** Sets the specified value to the {@link XrEventDataBuffer#type} field. */
        public XrEventDataBuffer.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataBuffer.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_EVENT_DATA_BUFFER TYPE_EVENT_DATA_BUFFER} value to the {@link XrEventDataBuffer#type} field. */
        public XrEventDataBuffer.Buffer type$Default() { return type(XR10.XR_TYPE_EVENT_DATA_BUFFER); }
        /** Sets the specified value to the {@link XrEventDataBuffer#next} field. */
        public XrEventDataBuffer.Buffer next(@NativeType("void const *") long value) { XrEventDataBuffer.nnext(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@link XrEventDataBuffer#varying} field. */
        public XrEventDataBuffer.Buffer varying(@NativeType("uint8_t[4000]") ByteBuffer value) { XrEventDataBuffer.nvarying(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link XrEventDataBuffer#varying} field. */
        public XrEventDataBuffer.Buffer varying(int index, @NativeType("uint8_t") byte value) { XrEventDataBuffer.nvarying(address(), index, value); return this; }

    }

}