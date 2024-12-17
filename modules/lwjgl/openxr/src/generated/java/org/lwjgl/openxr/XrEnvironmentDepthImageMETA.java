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
 * <pre>{@code
 * struct XrEnvironmentDepthImageMETA {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t swapchainIndex;
 *     float nearZ;
 *     float farZ;
 *     {@link XrEnvironmentDepthImageViewMETA XrEnvironmentDepthImageViewMETA} views[2];
 * }}</pre>
 */
public class XrEnvironmentDepthImageMETA extends Struct<XrEnvironmentDepthImageMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SWAPCHAININDEX,
        NEARZ,
        FARZ,
        VIEWS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __array(XrEnvironmentDepthImageViewMETA.SIZEOF, XrEnvironmentDepthImageViewMETA.ALIGNOF, 2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SWAPCHAININDEX = layout.offsetof(2);
        NEARZ = layout.offsetof(3);
        FARZ = layout.offsetof(4);
        VIEWS = layout.offsetof(5);
    }

    protected XrEnvironmentDepthImageMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEnvironmentDepthImageMETA create(long address, @Nullable ByteBuffer container) {
        return new XrEnvironmentDepthImageMETA(address, container);
    }

    /**
     * Creates a {@code XrEnvironmentDepthImageMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEnvironmentDepthImageMETA(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code swapchainIndex} field. */
    @NativeType("uint32_t")
    public int swapchainIndex() { return nswapchainIndex(address()); }
    /** @return the value of the {@code nearZ} field. */
    public float nearZ() { return nnearZ(address()); }
    /** @return the value of the {@code farZ} field. */
    public float farZ() { return nfarZ(address()); }
    /** @return a {@link XrEnvironmentDepthImageViewMETA}.Buffer view of the {@code views} field. */
    @NativeType("XrEnvironmentDepthImageViewMETA[2]")
    public XrEnvironmentDepthImageViewMETA.Buffer views() { return nviews(address()); }
    /** @return a {@link XrEnvironmentDepthImageViewMETA} view of the struct at the specified index of the {@code views} field. */
    public XrEnvironmentDepthImageViewMETA views(int index) { return nviews(address(), index); }

    /** Sets the specified value to the {@code type} field. */
    public XrEnvironmentDepthImageMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAEnvironmentDepth#XR_TYPE_ENVIRONMENT_DEPTH_IMAGE_META TYPE_ENVIRONMENT_DEPTH_IMAGE_META} value to the {@code type} field. */
    public XrEnvironmentDepthImageMETA type$Default() { return type(METAEnvironmentDepth.XR_TYPE_ENVIRONMENT_DEPTH_IMAGE_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrEnvironmentDepthImageMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code swapchainIndex} field. */
    public XrEnvironmentDepthImageMETA swapchainIndex(@NativeType("uint32_t") int value) { nswapchainIndex(address(), value); return this; }
    /** Sets the specified value to the {@code nearZ} field. */
    public XrEnvironmentDepthImageMETA nearZ(float value) { nnearZ(address(), value); return this; }
    /** Sets the specified value to the {@code farZ} field. */
    public XrEnvironmentDepthImageMETA farZ(float value) { nfarZ(address(), value); return this; }
    /** Copies the specified {@link XrEnvironmentDepthImageViewMETA.Buffer} to the {@code views} field. */
    public XrEnvironmentDepthImageMETA views(@NativeType("XrEnvironmentDepthImageViewMETA[2]") XrEnvironmentDepthImageViewMETA.Buffer value) { nviews(address(), value); return this; }
    /** Copies the specified {@link XrEnvironmentDepthImageViewMETA} at the specified index of the {@code views} field. */
    public XrEnvironmentDepthImageMETA views(int index, XrEnvironmentDepthImageViewMETA value) { nviews(address(), index, value); return this; }
    /** Passes the {@code views} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrEnvironmentDepthImageMETA views(java.util.function.Consumer<XrEnvironmentDepthImageViewMETA.Buffer> consumer) { consumer.accept(views()); return this; }
    /** Passes the element at {@code index} of the {@code views} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrEnvironmentDepthImageMETA views(int index, java.util.function.Consumer<XrEnvironmentDepthImageViewMETA> consumer) { consumer.accept(views(index)); return this; }

    /** Initializes this struct with the specified values. */
    public XrEnvironmentDepthImageMETA set(
        int type,
        long next,
        int swapchainIndex,
        float nearZ,
        float farZ,
        XrEnvironmentDepthImageViewMETA.Buffer views
    ) {
        type(type);
        next(next);
        swapchainIndex(swapchainIndex);
        nearZ(nearZ);
        farZ(farZ);
        views(views);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEnvironmentDepthImageMETA set(XrEnvironmentDepthImageMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEnvironmentDepthImageMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEnvironmentDepthImageMETA malloc() {
        return new XrEnvironmentDepthImageMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEnvironmentDepthImageMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEnvironmentDepthImageMETA calloc() {
        return new XrEnvironmentDepthImageMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEnvironmentDepthImageMETA} instance allocated with {@link BufferUtils}. */
    public static XrEnvironmentDepthImageMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEnvironmentDepthImageMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrEnvironmentDepthImageMETA} instance for the specified memory address. */
    public static XrEnvironmentDepthImageMETA create(long address) {
        return new XrEnvironmentDepthImageMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEnvironmentDepthImageMETA createSafe(long address) {
        return address == NULL ? null : new XrEnvironmentDepthImageMETA(address, null);
    }

    /**
     * Returns a new {@link XrEnvironmentDepthImageMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthImageMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEnvironmentDepthImageMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthImageMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEnvironmentDepthImageMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthImageMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEnvironmentDepthImageMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthImageMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEnvironmentDepthImageMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrEnvironmentDepthImageMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEnvironmentDepthImageMETA malloc(MemoryStack stack) {
        return new XrEnvironmentDepthImageMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEnvironmentDepthImageMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEnvironmentDepthImageMETA calloc(MemoryStack stack) {
        return new XrEnvironmentDepthImageMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEnvironmentDepthImageMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthImageMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEnvironmentDepthImageMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthImageMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEnvironmentDepthImageMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEnvironmentDepthImageMETA.NEXT); }
    /** Unsafe version of {@link #swapchainIndex}. */
    public static int nswapchainIndex(long struct) { return memGetInt(struct + XrEnvironmentDepthImageMETA.SWAPCHAININDEX); }
    /** Unsafe version of {@link #nearZ}. */
    public static float nnearZ(long struct) { return memGetFloat(struct + XrEnvironmentDepthImageMETA.NEARZ); }
    /** Unsafe version of {@link #farZ}. */
    public static float nfarZ(long struct) { return memGetFloat(struct + XrEnvironmentDepthImageMETA.FARZ); }
    /** Unsafe version of {@link #views}. */
    public static XrEnvironmentDepthImageViewMETA.Buffer nviews(long struct) { return XrEnvironmentDepthImageViewMETA.create(struct + XrEnvironmentDepthImageMETA.VIEWS, 2); }
    /** Unsafe version of {@link #views(int) views}. */
    public static XrEnvironmentDepthImageViewMETA nviews(long struct, int index) {
        return XrEnvironmentDepthImageViewMETA.create(struct + XrEnvironmentDepthImageMETA.VIEWS + check(index, 2) * XrEnvironmentDepthImageViewMETA.SIZEOF);
    }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEnvironmentDepthImageMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEnvironmentDepthImageMETA.NEXT, value); }
    /** Unsafe version of {@link #swapchainIndex(int) swapchainIndex}. */
    public static void nswapchainIndex(long struct, int value) { memPutInt(struct + XrEnvironmentDepthImageMETA.SWAPCHAININDEX, value); }
    /** Unsafe version of {@link #nearZ(float) nearZ}. */
    public static void nnearZ(long struct, float value) { memPutFloat(struct + XrEnvironmentDepthImageMETA.NEARZ, value); }
    /** Unsafe version of {@link #farZ(float) farZ}. */
    public static void nfarZ(long struct, float value) { memPutFloat(struct + XrEnvironmentDepthImageMETA.FARZ, value); }
    /** Unsafe version of {@link #views(XrEnvironmentDepthImageViewMETA.Buffer) views}. */
    public static void nviews(long struct, XrEnvironmentDepthImageViewMETA.Buffer value) {
        if (CHECKS) { checkGT(value, 2); }
        memCopy(value.address(), struct + XrEnvironmentDepthImageMETA.VIEWS, value.remaining() * XrEnvironmentDepthImageViewMETA.SIZEOF);
    }
    /** Unsafe version of {@link #views(int, XrEnvironmentDepthImageViewMETA) views}. */
    public static void nviews(long struct, int index, XrEnvironmentDepthImageViewMETA value) {
        memCopy(value.address(), struct + XrEnvironmentDepthImageMETA.VIEWS + check(index, 2) * XrEnvironmentDepthImageViewMETA.SIZEOF, XrEnvironmentDepthImageViewMETA.SIZEOF);
    }

    // -----------------------------------

    /** An array of {@link XrEnvironmentDepthImageMETA} structs. */
    public static class Buffer extends StructBuffer<XrEnvironmentDepthImageMETA, Buffer> implements NativeResource {

        private static final XrEnvironmentDepthImageMETA ELEMENT_FACTORY = XrEnvironmentDepthImageMETA.create(-1L);

        /**
         * Creates a new {@code XrEnvironmentDepthImageMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEnvironmentDepthImageMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEnvironmentDepthImageMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEnvironmentDepthImageMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEnvironmentDepthImageMETA.nnext(address()); }
        /** @return the value of the {@code swapchainIndex} field. */
        @NativeType("uint32_t")
        public int swapchainIndex() { return XrEnvironmentDepthImageMETA.nswapchainIndex(address()); }
        /** @return the value of the {@code nearZ} field. */
        public float nearZ() { return XrEnvironmentDepthImageMETA.nnearZ(address()); }
        /** @return the value of the {@code farZ} field. */
        public float farZ() { return XrEnvironmentDepthImageMETA.nfarZ(address()); }
        /** @return a {@link XrEnvironmentDepthImageViewMETA}.Buffer view of the {@code views} field. */
        @NativeType("XrEnvironmentDepthImageViewMETA[2]")
        public XrEnvironmentDepthImageViewMETA.Buffer views() { return XrEnvironmentDepthImageMETA.nviews(address()); }
        /** @return a {@link XrEnvironmentDepthImageViewMETA} view of the struct at the specified index of the {@code views} field. */
        public XrEnvironmentDepthImageViewMETA views(int index) { return XrEnvironmentDepthImageMETA.nviews(address(), index); }

        /** Sets the specified value to the {@code type} field. */
        public XrEnvironmentDepthImageMETA.Buffer type(@NativeType("XrStructureType") int value) { XrEnvironmentDepthImageMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAEnvironmentDepth#XR_TYPE_ENVIRONMENT_DEPTH_IMAGE_META TYPE_ENVIRONMENT_DEPTH_IMAGE_META} value to the {@code type} field. */
        public XrEnvironmentDepthImageMETA.Buffer type$Default() { return type(METAEnvironmentDepth.XR_TYPE_ENVIRONMENT_DEPTH_IMAGE_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrEnvironmentDepthImageMETA.Buffer next(@NativeType("void const *") long value) { XrEnvironmentDepthImageMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code swapchainIndex} field. */
        public XrEnvironmentDepthImageMETA.Buffer swapchainIndex(@NativeType("uint32_t") int value) { XrEnvironmentDepthImageMETA.nswapchainIndex(address(), value); return this; }
        /** Sets the specified value to the {@code nearZ} field. */
        public XrEnvironmentDepthImageMETA.Buffer nearZ(float value) { XrEnvironmentDepthImageMETA.nnearZ(address(), value); return this; }
        /** Sets the specified value to the {@code farZ} field. */
        public XrEnvironmentDepthImageMETA.Buffer farZ(float value) { XrEnvironmentDepthImageMETA.nfarZ(address(), value); return this; }
        /** Copies the specified {@link XrEnvironmentDepthImageViewMETA.Buffer} to the {@code views} field. */
        public XrEnvironmentDepthImageMETA.Buffer views(@NativeType("XrEnvironmentDepthImageViewMETA[2]") XrEnvironmentDepthImageViewMETA.Buffer value) { XrEnvironmentDepthImageMETA.nviews(address(), value); return this; }
        /** Copies the specified {@link XrEnvironmentDepthImageViewMETA} at the specified index of the {@code views} field. */
        public XrEnvironmentDepthImageMETA.Buffer views(int index, XrEnvironmentDepthImageViewMETA value) { XrEnvironmentDepthImageMETA.nviews(address(), index, value); return this; }
        /** Passes the {@code views} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrEnvironmentDepthImageMETA.Buffer views(java.util.function.Consumer<XrEnvironmentDepthImageViewMETA.Buffer> consumer) { consumer.accept(views()); return this; }
        /** Passes the element at {@code index} of the {@code views} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrEnvironmentDepthImageMETA.Buffer views(int index, java.util.function.Consumer<XrEnvironmentDepthImageViewMETA> consumer) { consumer.accept(views(index)); return this; }

    }

}