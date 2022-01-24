/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.video;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct StdVideoDecodeH264Mvc {
 *     uint32_t viewId0;
 *     uint32_t mvcElementCount;
 *     {@link StdVideoDecodeH264MvcElement StdVideoDecodeH264MvcElement} * pMvcElements;
 * }</code></pre>
 */
public class StdVideoDecodeH264Mvc extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VIEWID0,
        MVCELEMENTCOUNT,
        PMVCELEMENTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VIEWID0 = layout.offsetof(0);
        MVCELEMENTCOUNT = layout.offsetof(1);
        PMVCELEMENTS = layout.offsetof(2);
    }

    /**
     * Creates a {@code StdVideoDecodeH264Mvc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoDecodeH264Mvc(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code viewId0} field. */
    @NativeType("uint32_t")
    public int viewId0() { return nviewId0(address()); }
    /** @return the value of the {@code mvcElementCount} field. */
    @NativeType("uint32_t")
    public int mvcElementCount() { return nmvcElementCount(address()); }
    /** @return a {@link StdVideoDecodeH264MvcElement} view of the struct pointed to by the {@code pMvcElements} field. */
    @NativeType("StdVideoDecodeH264MvcElement *")
    public StdVideoDecodeH264MvcElement pMvcElements() { return npMvcElements(address()); }

    /** Sets the specified value to the {@code viewId0} field. */
    public StdVideoDecodeH264Mvc viewId0(@NativeType("uint32_t") int value) { nviewId0(address(), value); return this; }
    /** Sets the specified value to the {@code mvcElementCount} field. */
    public StdVideoDecodeH264Mvc mvcElementCount(@NativeType("uint32_t") int value) { nmvcElementCount(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoDecodeH264MvcElement} to the {@code pMvcElements} field. */
    public StdVideoDecodeH264Mvc pMvcElements(@NativeType("StdVideoDecodeH264MvcElement *") StdVideoDecodeH264MvcElement value) { npMvcElements(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoDecodeH264Mvc set(
        int viewId0,
        int mvcElementCount,
        StdVideoDecodeH264MvcElement pMvcElements
    ) {
        viewId0(viewId0);
        mvcElementCount(mvcElementCount);
        pMvcElements(pMvcElements);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoDecodeH264Mvc set(StdVideoDecodeH264Mvc src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoDecodeH264Mvc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeH264Mvc malloc() {
        return wrap(StdVideoDecodeH264Mvc.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoDecodeH264Mvc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeH264Mvc calloc() {
        return wrap(StdVideoDecodeH264Mvc.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoDecodeH264Mvc} instance allocated with {@link BufferUtils}. */
    public static StdVideoDecodeH264Mvc create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoDecodeH264Mvc.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoDecodeH264Mvc} instance for the specified memory address. */
    public static StdVideoDecodeH264Mvc create(long address) {
        return wrap(StdVideoDecodeH264Mvc.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoDecodeH264Mvc createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoDecodeH264Mvc.class, address);
    }

    /**
     * Returns a new {@link StdVideoDecodeH264Mvc.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264Mvc.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeH264Mvc.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264Mvc.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeH264Mvc.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264Mvc.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoDecodeH264Mvc.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264Mvc.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoDecodeH264Mvc.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoDecodeH264Mvc} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeH264Mvc malloc(MemoryStack stack) {
        return wrap(StdVideoDecodeH264Mvc.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoDecodeH264Mvc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeH264Mvc calloc(MemoryStack stack) {
        return wrap(StdVideoDecodeH264Mvc.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoDecodeH264Mvc.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264Mvc.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeH264Mvc.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264Mvc.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #viewId0}. */
    public static int nviewId0(long struct) { return UNSAFE.getInt(null, struct + StdVideoDecodeH264Mvc.VIEWID0); }
    /** Unsafe version of {@link #mvcElementCount}. */
    public static int nmvcElementCount(long struct) { return UNSAFE.getInt(null, struct + StdVideoDecodeH264Mvc.MVCELEMENTCOUNT); }
    /** Unsafe version of {@link #pMvcElements}. */
    public static StdVideoDecodeH264MvcElement npMvcElements(long struct) { return StdVideoDecodeH264MvcElement.create(memGetAddress(struct + StdVideoDecodeH264Mvc.PMVCELEMENTS)); }

    /** Unsafe version of {@link #viewId0(int) viewId0}. */
    public static void nviewId0(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoDecodeH264Mvc.VIEWID0, value); }
    /** Unsafe version of {@link #mvcElementCount(int) mvcElementCount}. */
    public static void nmvcElementCount(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoDecodeH264Mvc.MVCELEMENTCOUNT, value); }
    /** Unsafe version of {@link #pMvcElements(StdVideoDecodeH264MvcElement) pMvcElements}. */
    public static void npMvcElements(long struct, StdVideoDecodeH264MvcElement value) { memPutAddress(struct + StdVideoDecodeH264Mvc.PMVCELEMENTS, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + StdVideoDecodeH264Mvc.PMVCELEMENTS));
    }

    // -----------------------------------

    /** An array of {@link StdVideoDecodeH264Mvc} structs. */
    public static class Buffer extends StructBuffer<StdVideoDecodeH264Mvc, Buffer> implements NativeResource {

        private static final StdVideoDecodeH264Mvc ELEMENT_FACTORY = StdVideoDecodeH264Mvc.create(-1L);

        /**
         * Creates a new {@code StdVideoDecodeH264Mvc.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoDecodeH264Mvc#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoDecodeH264Mvc getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code viewId0} field. */
        @NativeType("uint32_t")
        public int viewId0() { return StdVideoDecodeH264Mvc.nviewId0(address()); }
        /** @return the value of the {@code mvcElementCount} field. */
        @NativeType("uint32_t")
        public int mvcElementCount() { return StdVideoDecodeH264Mvc.nmvcElementCount(address()); }
        /** @return a {@link StdVideoDecodeH264MvcElement} view of the struct pointed to by the {@code pMvcElements} field. */
        @NativeType("StdVideoDecodeH264MvcElement *")
        public StdVideoDecodeH264MvcElement pMvcElements() { return StdVideoDecodeH264Mvc.npMvcElements(address()); }

        /** Sets the specified value to the {@code viewId0} field. */
        public StdVideoDecodeH264Mvc.Buffer viewId0(@NativeType("uint32_t") int value) { StdVideoDecodeH264Mvc.nviewId0(address(), value); return this; }
        /** Sets the specified value to the {@code mvcElementCount} field. */
        public StdVideoDecodeH264Mvc.Buffer mvcElementCount(@NativeType("uint32_t") int value) { StdVideoDecodeH264Mvc.nmvcElementCount(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoDecodeH264MvcElement} to the {@code pMvcElements} field. */
        public StdVideoDecodeH264Mvc.Buffer pMvcElements(@NativeType("StdVideoDecodeH264MvcElement *") StdVideoDecodeH264MvcElement value) { StdVideoDecodeH264Mvc.npMvcElements(address(), value); return this; }

    }

}