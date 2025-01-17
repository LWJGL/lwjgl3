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
 * <pre>{@code
 * struct XrSwapchainImageBaseHeader {
 *     XrStructureType type;
 *     void * next;
 * }}</pre>
 */
public class XrSwapchainImageBaseHeader extends Struct<XrSwapchainImageBaseHeader> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
    }

    protected XrSwapchainImageBaseHeader(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSwapchainImageBaseHeader create(long address, @Nullable ByteBuffer container) {
        return new XrSwapchainImageBaseHeader(address, container);
    }

    /**
     * Creates a {@code XrSwapchainImageBaseHeader} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSwapchainImageBaseHeader(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSwapchainImageBaseHeader type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrSwapchainImageBaseHeader next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSwapchainImageBaseHeader set(
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
    public XrSwapchainImageBaseHeader set(XrSwapchainImageBaseHeader src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSwapchainImageBaseHeader} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSwapchainImageBaseHeader malloc() {
        return new XrSwapchainImageBaseHeader(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSwapchainImageBaseHeader} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSwapchainImageBaseHeader calloc() {
        return new XrSwapchainImageBaseHeader(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSwapchainImageBaseHeader} instance allocated with {@link BufferUtils}. */
    public static XrSwapchainImageBaseHeader create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSwapchainImageBaseHeader(memAddress(container), container);
    }

    /** Returns a new {@code XrSwapchainImageBaseHeader} instance for the specified memory address. */
    public static XrSwapchainImageBaseHeader create(long address) {
        return new XrSwapchainImageBaseHeader(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSwapchainImageBaseHeader createSafe(long address) {
        return address == NULL ? null : new XrSwapchainImageBaseHeader(address, null);
    }

    /** Upcasts the specified {@code XrSwapchainImageOpenGLKHR} instance to {@code XrSwapchainImageBaseHeader}. */
    public static XrSwapchainImageBaseHeader create(XrSwapchainImageOpenGLKHR value) {
        return new XrSwapchainImageBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrSwapchainImageVulkanKHR} instance to {@code XrSwapchainImageBaseHeader}. */
    public static XrSwapchainImageBaseHeader create(XrSwapchainImageVulkanKHR value) {
        return new XrSwapchainImageBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrSwapchainImageVulkan2KHR} instance to {@code XrSwapchainImageBaseHeader}. */
    public static XrSwapchainImageBaseHeader create(XrSwapchainImageVulkan2KHR value) {
        return new XrSwapchainImageBaseHeader(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrSwapchainImageBaseHeader.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageBaseHeader.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainImageBaseHeader.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageBaseHeader.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainImageBaseHeader.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageBaseHeader.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSwapchainImageBaseHeader.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageBaseHeader.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSwapchainImageBaseHeader.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Upcasts the specified {@code XrSwapchainImageOpenGLKHR.Buffer} instance to {@code XrSwapchainImageBaseHeader.Buffer}. */
    public static XrSwapchainImageBaseHeader.Buffer create(XrSwapchainImageOpenGLKHR.Buffer value) {
        return new XrSwapchainImageBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrSwapchainImageVulkanKHR.Buffer} instance to {@code XrSwapchainImageBaseHeader.Buffer}. */
    public static XrSwapchainImageBaseHeader.Buffer create(XrSwapchainImageVulkanKHR.Buffer value) {
        return new XrSwapchainImageBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrSwapchainImageVulkan2KHR.Buffer} instance to {@code XrSwapchainImageBaseHeader.Buffer}. */
    public static XrSwapchainImageBaseHeader.Buffer create(XrSwapchainImageVulkan2KHR.Buffer value) {
        return new XrSwapchainImageBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrSwapchainImageBaseHeader} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainImageBaseHeader malloc(MemoryStack stack) {
        return new XrSwapchainImageBaseHeader(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSwapchainImageBaseHeader} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainImageBaseHeader calloc(MemoryStack stack) {
        return new XrSwapchainImageBaseHeader(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSwapchainImageBaseHeader.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageBaseHeader.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainImageBaseHeader.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageBaseHeader.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSwapchainImageBaseHeader.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSwapchainImageBaseHeader.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSwapchainImageBaseHeader.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSwapchainImageBaseHeader.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSwapchainImageBaseHeader} structs. */
    public static class Buffer extends StructBuffer<XrSwapchainImageBaseHeader, Buffer> implements NativeResource {

        private static final XrSwapchainImageBaseHeader ELEMENT_FACTORY = XrSwapchainImageBaseHeader.create(-1L);

        /**
         * Creates a new {@code XrSwapchainImageBaseHeader.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSwapchainImageBaseHeader#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSwapchainImageBaseHeader getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSwapchainImageBaseHeader.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSwapchainImageBaseHeader.nnext(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSwapchainImageBaseHeader.Buffer type(@NativeType("XrStructureType") int value) { XrSwapchainImageBaseHeader.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrSwapchainImageBaseHeader.Buffer next(@NativeType("void *") long value) { XrSwapchainImageBaseHeader.nnext(address(), value); return this; }

    }

}