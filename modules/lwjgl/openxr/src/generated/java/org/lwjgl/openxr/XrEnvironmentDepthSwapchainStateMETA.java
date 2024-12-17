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
 * struct XrEnvironmentDepthSwapchainStateMETA {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t width;
 *     uint32_t height;
 * }}</pre>
 */
public class XrEnvironmentDepthSwapchainStateMETA extends Struct<XrEnvironmentDepthSwapchainStateMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        WIDTH,
        HEIGHT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        WIDTH = layout.offsetof(2);
        HEIGHT = layout.offsetof(3);
    }

    protected XrEnvironmentDepthSwapchainStateMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEnvironmentDepthSwapchainStateMETA create(long address, @Nullable ByteBuffer container) {
        return new XrEnvironmentDepthSwapchainStateMETA(address, container);
    }

    /**
     * Creates a {@code XrEnvironmentDepthSwapchainStateMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEnvironmentDepthSwapchainStateMETA(ByteBuffer container) {
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
    /** @return the value of the {@code width} field. */
    @NativeType("uint32_t")
    public int width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    @NativeType("uint32_t")
    public int height() { return nheight(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEnvironmentDepthSwapchainStateMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAEnvironmentDepth#XR_TYPE_ENVIRONMENT_DEPTH_SWAPCHAIN_STATE_META TYPE_ENVIRONMENT_DEPTH_SWAPCHAIN_STATE_META} value to the {@code type} field. */
    public XrEnvironmentDepthSwapchainStateMETA type$Default() { return type(METAEnvironmentDepth.XR_TYPE_ENVIRONMENT_DEPTH_SWAPCHAIN_STATE_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrEnvironmentDepthSwapchainStateMETA next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public XrEnvironmentDepthSwapchainStateMETA width(@NativeType("uint32_t") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public XrEnvironmentDepthSwapchainStateMETA height(@NativeType("uint32_t") int value) { nheight(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEnvironmentDepthSwapchainStateMETA set(
        int type,
        long next,
        int width,
        int height
    ) {
        type(type);
        next(next);
        width(width);
        height(height);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEnvironmentDepthSwapchainStateMETA set(XrEnvironmentDepthSwapchainStateMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEnvironmentDepthSwapchainStateMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEnvironmentDepthSwapchainStateMETA malloc() {
        return new XrEnvironmentDepthSwapchainStateMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEnvironmentDepthSwapchainStateMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEnvironmentDepthSwapchainStateMETA calloc() {
        return new XrEnvironmentDepthSwapchainStateMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEnvironmentDepthSwapchainStateMETA} instance allocated with {@link BufferUtils}. */
    public static XrEnvironmentDepthSwapchainStateMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEnvironmentDepthSwapchainStateMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrEnvironmentDepthSwapchainStateMETA} instance for the specified memory address. */
    public static XrEnvironmentDepthSwapchainStateMETA create(long address) {
        return new XrEnvironmentDepthSwapchainStateMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEnvironmentDepthSwapchainStateMETA createSafe(long address) {
        return address == NULL ? null : new XrEnvironmentDepthSwapchainStateMETA(address, null);
    }

    /**
     * Returns a new {@link XrEnvironmentDepthSwapchainStateMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthSwapchainStateMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEnvironmentDepthSwapchainStateMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthSwapchainStateMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEnvironmentDepthSwapchainStateMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthSwapchainStateMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEnvironmentDepthSwapchainStateMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthSwapchainStateMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEnvironmentDepthSwapchainStateMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrEnvironmentDepthSwapchainStateMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEnvironmentDepthSwapchainStateMETA malloc(MemoryStack stack) {
        return new XrEnvironmentDepthSwapchainStateMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEnvironmentDepthSwapchainStateMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEnvironmentDepthSwapchainStateMETA calloc(MemoryStack stack) {
        return new XrEnvironmentDepthSwapchainStateMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEnvironmentDepthSwapchainStateMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthSwapchainStateMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEnvironmentDepthSwapchainStateMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthSwapchainStateMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEnvironmentDepthSwapchainStateMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEnvironmentDepthSwapchainStateMETA.NEXT); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return memGetInt(struct + XrEnvironmentDepthSwapchainStateMETA.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return memGetInt(struct + XrEnvironmentDepthSwapchainStateMETA.HEIGHT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEnvironmentDepthSwapchainStateMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEnvironmentDepthSwapchainStateMETA.NEXT, value); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { memPutInt(struct + XrEnvironmentDepthSwapchainStateMETA.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { memPutInt(struct + XrEnvironmentDepthSwapchainStateMETA.HEIGHT, value); }

    // -----------------------------------

    /** An array of {@link XrEnvironmentDepthSwapchainStateMETA} structs. */
    public static class Buffer extends StructBuffer<XrEnvironmentDepthSwapchainStateMETA, Buffer> implements NativeResource {

        private static final XrEnvironmentDepthSwapchainStateMETA ELEMENT_FACTORY = XrEnvironmentDepthSwapchainStateMETA.create(-1L);

        /**
         * Creates a new {@code XrEnvironmentDepthSwapchainStateMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEnvironmentDepthSwapchainStateMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEnvironmentDepthSwapchainStateMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEnvironmentDepthSwapchainStateMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrEnvironmentDepthSwapchainStateMETA.nnext(address()); }
        /** @return the value of the {@code width} field. */
        @NativeType("uint32_t")
        public int width() { return XrEnvironmentDepthSwapchainStateMETA.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        @NativeType("uint32_t")
        public int height() { return XrEnvironmentDepthSwapchainStateMETA.nheight(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEnvironmentDepthSwapchainStateMETA.Buffer type(@NativeType("XrStructureType") int value) { XrEnvironmentDepthSwapchainStateMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAEnvironmentDepth#XR_TYPE_ENVIRONMENT_DEPTH_SWAPCHAIN_STATE_META TYPE_ENVIRONMENT_DEPTH_SWAPCHAIN_STATE_META} value to the {@code type} field. */
        public XrEnvironmentDepthSwapchainStateMETA.Buffer type$Default() { return type(METAEnvironmentDepth.XR_TYPE_ENVIRONMENT_DEPTH_SWAPCHAIN_STATE_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrEnvironmentDepthSwapchainStateMETA.Buffer next(@NativeType("void *") long value) { XrEnvironmentDepthSwapchainStateMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public XrEnvironmentDepthSwapchainStateMETA.Buffer width(@NativeType("uint32_t") int value) { XrEnvironmentDepthSwapchainStateMETA.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public XrEnvironmentDepthSwapchainStateMETA.Buffer height(@NativeType("uint32_t") int value) { XrEnvironmentDepthSwapchainStateMETA.nheight(address(), value); return this; }

    }

}