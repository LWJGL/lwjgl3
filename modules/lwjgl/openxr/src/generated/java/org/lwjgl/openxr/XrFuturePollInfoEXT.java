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
 * Input for xrPollFutureEXT.
 * 
 * <h5>Description</h5>
 * 
 * <p>An {@link XrFuturePollInfoEXT} structure is used to pass {@code future} to {@link EXTFuture#xrPollFutureEXT PollFutureEXT}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link EXTFuture XR_EXT_future} extension <b>must</b> be enabled prior to using {@link XrFuturePollInfoEXT}</li>
 * <li>{@code type} <b>must</b> be {@link EXTFuture#XR_TYPE_FUTURE_POLL_INFO_EXT TYPE_FUTURE_POLL_INFO_EXT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTFuture#xrPollFutureEXT PollFutureEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrFuturePollInfoEXT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrFutureEXT {@link #future};
 * }</code></pre>
 */
public class XrFuturePollInfoEXT extends Struct<XrFuturePollInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FUTURE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FUTURE = layout.offsetof(2);
    }

    protected XrFuturePollInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFuturePollInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new XrFuturePollInfoEXT(address, container);
    }

    /**
     * Creates a {@code XrFuturePollInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFuturePollInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** the {@code XrFutureEXT} future being polled. */
    @NativeType("XrFutureEXT")
    public long future() { return nfuture(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrFuturePollInfoEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTFuture#XR_TYPE_FUTURE_POLL_INFO_EXT TYPE_FUTURE_POLL_INFO_EXT} value to the {@link #type} field. */
    public XrFuturePollInfoEXT type$Default() { return type(EXTFuture.XR_TYPE_FUTURE_POLL_INFO_EXT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrFuturePollInfoEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #future} field. */
    public XrFuturePollInfoEXT future(@NativeType("XrFutureEXT") long value) { nfuture(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFuturePollInfoEXT set(
        int type,
        long next,
        long future
    ) {
        type(type);
        next(next);
        future(future);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFuturePollInfoEXT set(XrFuturePollInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFuturePollInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFuturePollInfoEXT malloc() {
        return new XrFuturePollInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFuturePollInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFuturePollInfoEXT calloc() {
        return new XrFuturePollInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFuturePollInfoEXT} instance allocated with {@link BufferUtils}. */
    public static XrFuturePollInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFuturePollInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrFuturePollInfoEXT} instance for the specified memory address. */
    public static XrFuturePollInfoEXT create(long address) {
        return new XrFuturePollInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrFuturePollInfoEXT createSafe(long address) {
        return address == NULL ? null : new XrFuturePollInfoEXT(address, null);
    }

    /**
     * Returns a new {@link XrFuturePollInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFuturePollInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFuturePollInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFuturePollInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFuturePollInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFuturePollInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFuturePollInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFuturePollInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrFuturePollInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFuturePollInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFuturePollInfoEXT malloc(MemoryStack stack) {
        return new XrFuturePollInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFuturePollInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFuturePollInfoEXT calloc(MemoryStack stack) {
        return new XrFuturePollInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFuturePollInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFuturePollInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFuturePollInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFuturePollInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrFuturePollInfoEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFuturePollInfoEXT.NEXT); }
    /** Unsafe version of {@link #future}. */
    public static long nfuture(long struct) { return UNSAFE.getLong(null, struct + XrFuturePollInfoEXT.FUTURE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrFuturePollInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFuturePollInfoEXT.NEXT, value); }
    /** Unsafe version of {@link #future(long) future}. */
    public static void nfuture(long struct, long value) { UNSAFE.putLong(null, struct + XrFuturePollInfoEXT.FUTURE, value); }

    // -----------------------------------

    /** An array of {@link XrFuturePollInfoEXT} structs. */
    public static class Buffer extends StructBuffer<XrFuturePollInfoEXT, Buffer> implements NativeResource {

        private static final XrFuturePollInfoEXT ELEMENT_FACTORY = XrFuturePollInfoEXT.create(-1L);

        /**
         * Creates a new {@code XrFuturePollInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFuturePollInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFuturePollInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrFuturePollInfoEXT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFuturePollInfoEXT.ntype(address()); }
        /** @return the value of the {@link XrFuturePollInfoEXT#next} field. */
        @NativeType("void const *")
        public long next() { return XrFuturePollInfoEXT.nnext(address()); }
        /** @return the value of the {@link XrFuturePollInfoEXT#future} field. */
        @NativeType("XrFutureEXT")
        public long future() { return XrFuturePollInfoEXT.nfuture(address()); }

        /** Sets the specified value to the {@link XrFuturePollInfoEXT#type} field. */
        public XrFuturePollInfoEXT.Buffer type(@NativeType("XrStructureType") int value) { XrFuturePollInfoEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTFuture#XR_TYPE_FUTURE_POLL_INFO_EXT TYPE_FUTURE_POLL_INFO_EXT} value to the {@link XrFuturePollInfoEXT#type} field. */
        public XrFuturePollInfoEXT.Buffer type$Default() { return type(EXTFuture.XR_TYPE_FUTURE_POLL_INFO_EXT); }
        /** Sets the specified value to the {@link XrFuturePollInfoEXT#next} field. */
        public XrFuturePollInfoEXT.Buffer next(@NativeType("void const *") long value) { XrFuturePollInfoEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrFuturePollInfoEXT#future} field. */
        public XrFuturePollInfoEXT.Buffer future(@NativeType("XrFutureEXT") long value) { XrFuturePollInfoEXT.nfuture(address(), value); return this; }

    }

}