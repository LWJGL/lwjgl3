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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Result of xrPollFutureEXT.
 * 
 * <h5>Description</h5>
 * 
 * <p>An {@link XrFuturePollResultEXT} structure is used to return the result of {@link EXTFuture#xrPollFutureEXT PollFutureEXT}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link EXTFuture XR_EXT_future} extension <b>must</b> be enabled prior to using {@link XrFuturePollResultEXT}</li>
 * <li>{@code type} <b>must</b> be {@link EXTFuture#XR_TYPE_FUTURE_POLL_RESULT_EXT TYPE_FUTURE_POLL_RESULT_EXT}</li>
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
 * struct XrFuturePollResultEXT {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrFutureStateEXT {@link #state};
 * }</code></pre>
 */
public class XrFuturePollResultEXT extends Struct<XrFuturePollResultEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        STATE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        STATE = layout.offsetof(2);
    }

    protected XrFuturePollResultEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFuturePollResultEXT create(long address, @Nullable ByteBuffer container) {
        return new XrFuturePollResultEXT(address, container);
    }

    /**
     * Creates a {@code XrFuturePollResultEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFuturePollResultEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** the {@code XrFutureStateEXT} of the {@code XrFutureEXT} passed to {@link EXTFuture#xrPollFutureEXT PollFutureEXT}. */
    @NativeType("XrFutureStateEXT")
    public int state() { return nstate(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrFuturePollResultEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTFuture#XR_TYPE_FUTURE_POLL_RESULT_EXT TYPE_FUTURE_POLL_RESULT_EXT} value to the {@link #type} field. */
    public XrFuturePollResultEXT type$Default() { return type(EXTFuture.XR_TYPE_FUTURE_POLL_RESULT_EXT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrFuturePollResultEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFuturePollResultEXT set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFuturePollResultEXT set(XrFuturePollResultEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFuturePollResultEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFuturePollResultEXT malloc() {
        return new XrFuturePollResultEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFuturePollResultEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFuturePollResultEXT calloc() {
        return new XrFuturePollResultEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFuturePollResultEXT} instance allocated with {@link BufferUtils}. */
    public static XrFuturePollResultEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFuturePollResultEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrFuturePollResultEXT} instance for the specified memory address. */
    public static XrFuturePollResultEXT create(long address) {
        return new XrFuturePollResultEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrFuturePollResultEXT createSafe(long address) {
        return address == NULL ? null : new XrFuturePollResultEXT(address, null);
    }

    /**
     * Returns a new {@link XrFuturePollResultEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFuturePollResultEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFuturePollResultEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFuturePollResultEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFuturePollResultEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFuturePollResultEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFuturePollResultEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFuturePollResultEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrFuturePollResultEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFuturePollResultEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFuturePollResultEXT malloc(MemoryStack stack) {
        return new XrFuturePollResultEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFuturePollResultEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFuturePollResultEXT calloc(MemoryStack stack) {
        return new XrFuturePollResultEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFuturePollResultEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFuturePollResultEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFuturePollResultEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFuturePollResultEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrFuturePollResultEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFuturePollResultEXT.NEXT); }
    /** Unsafe version of {@link #state}. */
    public static int nstate(long struct) { return memGetInt(struct + XrFuturePollResultEXT.STATE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrFuturePollResultEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFuturePollResultEXT.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrFuturePollResultEXT} structs. */
    public static class Buffer extends StructBuffer<XrFuturePollResultEXT, Buffer> implements NativeResource {

        private static final XrFuturePollResultEXT ELEMENT_FACTORY = XrFuturePollResultEXT.create(-1L);

        /**
         * Creates a new {@code XrFuturePollResultEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFuturePollResultEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFuturePollResultEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrFuturePollResultEXT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFuturePollResultEXT.ntype(address()); }
        /** @return the value of the {@link XrFuturePollResultEXT#next} field. */
        @NativeType("void *")
        public long next() { return XrFuturePollResultEXT.nnext(address()); }
        /** @return the value of the {@link XrFuturePollResultEXT#state} field. */
        @NativeType("XrFutureStateEXT")
        public int state() { return XrFuturePollResultEXT.nstate(address()); }

        /** Sets the specified value to the {@link XrFuturePollResultEXT#type} field. */
        public XrFuturePollResultEXT.Buffer type(@NativeType("XrStructureType") int value) { XrFuturePollResultEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTFuture#XR_TYPE_FUTURE_POLL_RESULT_EXT TYPE_FUTURE_POLL_RESULT_EXT} value to the {@link XrFuturePollResultEXT#type} field. */
        public XrFuturePollResultEXT.Buffer type$Default() { return type(EXTFuture.XR_TYPE_FUTURE_POLL_RESULT_EXT); }
        /** Sets the specified value to the {@link XrFuturePollResultEXT#next} field. */
        public XrFuturePollResultEXT.Buffer next(@NativeType("void *") long value) { XrFuturePollResultEXT.nnext(address(), value); return this; }

    }

}