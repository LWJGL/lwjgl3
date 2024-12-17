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
 * struct XrScenePlanesMSFT {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t scenePlaneCount;
 *     {@link XrScenePlaneMSFT XrScenePlaneMSFT} * scenePlanes;
 * }}</pre>
 */
public class XrScenePlanesMSFT extends Struct<XrScenePlanesMSFT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SCENEPLANECOUNT,
        SCENEPLANES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SCENEPLANECOUNT = layout.offsetof(2);
        SCENEPLANES = layout.offsetof(3);
    }

    protected XrScenePlanesMSFT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrScenePlanesMSFT create(long address, @Nullable ByteBuffer container) {
        return new XrScenePlanesMSFT(address, container);
    }

    /**
     * Creates a {@code XrScenePlanesMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrScenePlanesMSFT(ByteBuffer container) {
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
    /** @return the value of the {@code scenePlaneCount} field. */
    @NativeType("uint32_t")
    public int scenePlaneCount() { return nscenePlaneCount(address()); }
    /** @return a {@link XrScenePlaneMSFT.Buffer} view of the struct array pointed to by the {@code scenePlanes} field. */
    @NativeType("XrScenePlaneMSFT *")
    public XrScenePlaneMSFT.@Nullable Buffer scenePlanes() { return nscenePlanes(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrScenePlanesMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSceneUnderstanding#XR_TYPE_SCENE_PLANES_MSFT TYPE_SCENE_PLANES_MSFT} value to the {@code type} field. */
    public XrScenePlanesMSFT type$Default() { return type(MSFTSceneUnderstanding.XR_TYPE_SCENE_PLANES_MSFT); }
    /** Sets the specified value to the {@code next} field. */
    public XrScenePlanesMSFT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code scenePlaneCount} field. */
    public XrScenePlanesMSFT scenePlaneCount(@NativeType("uint32_t") int value) { nscenePlaneCount(address(), value); return this; }
    /** Sets the address of the specified {@link XrScenePlaneMSFT.Buffer} to the {@code scenePlanes} field. */
    public XrScenePlanesMSFT scenePlanes(@NativeType("XrScenePlaneMSFT *") XrScenePlaneMSFT.@Nullable Buffer value) { nscenePlanes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrScenePlanesMSFT set(
        int type,
        long next,
        int scenePlaneCount,
        XrScenePlaneMSFT.@Nullable Buffer scenePlanes
    ) {
        type(type);
        next(next);
        scenePlaneCount(scenePlaneCount);
        scenePlanes(scenePlanes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrScenePlanesMSFT set(XrScenePlanesMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrScenePlanesMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrScenePlanesMSFT malloc() {
        return new XrScenePlanesMSFT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrScenePlanesMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrScenePlanesMSFT calloc() {
        return new XrScenePlanesMSFT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrScenePlanesMSFT} instance allocated with {@link BufferUtils}. */
    public static XrScenePlanesMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrScenePlanesMSFT(memAddress(container), container);
    }

    /** Returns a new {@code XrScenePlanesMSFT} instance for the specified memory address. */
    public static XrScenePlanesMSFT create(long address) {
        return new XrScenePlanesMSFT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrScenePlanesMSFT createSafe(long address) {
        return address == NULL ? null : new XrScenePlanesMSFT(address, null);
    }

    /**
     * Returns a new {@link XrScenePlanesMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrScenePlanesMSFT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrScenePlanesMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrScenePlanesMSFT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrScenePlanesMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrScenePlanesMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrScenePlanesMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrScenePlanesMSFT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrScenePlanesMSFT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrScenePlanesMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrScenePlanesMSFT malloc(MemoryStack stack) {
        return new XrScenePlanesMSFT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrScenePlanesMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrScenePlanesMSFT calloc(MemoryStack stack) {
        return new XrScenePlanesMSFT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrScenePlanesMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrScenePlanesMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrScenePlanesMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrScenePlanesMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrScenePlanesMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrScenePlanesMSFT.NEXT); }
    /** Unsafe version of {@link #scenePlaneCount}. */
    public static int nscenePlaneCount(long struct) { return memGetInt(struct + XrScenePlanesMSFT.SCENEPLANECOUNT); }
    /** Unsafe version of {@link #scenePlanes}. */
    public static XrScenePlaneMSFT.@Nullable Buffer nscenePlanes(long struct) { return XrScenePlaneMSFT.createSafe(memGetAddress(struct + XrScenePlanesMSFT.SCENEPLANES), nscenePlaneCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrScenePlanesMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrScenePlanesMSFT.NEXT, value); }
    /** Sets the specified value to the {@code scenePlaneCount} field of the specified {@code struct}. */
    public static void nscenePlaneCount(long struct, int value) { memPutInt(struct + XrScenePlanesMSFT.SCENEPLANECOUNT, value); }
    /** Unsafe version of {@link #scenePlanes(XrScenePlaneMSFT.Buffer) scenePlanes}. */
    public static void nscenePlanes(long struct, XrScenePlaneMSFT.@Nullable Buffer value) { memPutAddress(struct + XrScenePlanesMSFT.SCENEPLANES, memAddressSafe(value)); if (value != null) { nscenePlaneCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrScenePlanesMSFT} structs. */
    public static class Buffer extends StructBuffer<XrScenePlanesMSFT, Buffer> implements NativeResource {

        private static final XrScenePlanesMSFT ELEMENT_FACTORY = XrScenePlanesMSFT.create(-1L);

        /**
         * Creates a new {@code XrScenePlanesMSFT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrScenePlanesMSFT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrScenePlanesMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrScenePlanesMSFT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrScenePlanesMSFT.nnext(address()); }
        /** @return the value of the {@code scenePlaneCount} field. */
        @NativeType("uint32_t")
        public int scenePlaneCount() { return XrScenePlanesMSFT.nscenePlaneCount(address()); }
        /** @return a {@link XrScenePlaneMSFT.Buffer} view of the struct array pointed to by the {@code scenePlanes} field. */
        @NativeType("XrScenePlaneMSFT *")
        public XrScenePlaneMSFT.@Nullable Buffer scenePlanes() { return XrScenePlanesMSFT.nscenePlanes(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrScenePlanesMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrScenePlanesMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSceneUnderstanding#XR_TYPE_SCENE_PLANES_MSFT TYPE_SCENE_PLANES_MSFT} value to the {@code type} field. */
        public XrScenePlanesMSFT.Buffer type$Default() { return type(MSFTSceneUnderstanding.XR_TYPE_SCENE_PLANES_MSFT); }
        /** Sets the specified value to the {@code next} field. */
        public XrScenePlanesMSFT.Buffer next(@NativeType("void *") long value) { XrScenePlanesMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code scenePlaneCount} field. */
        public XrScenePlanesMSFT.Buffer scenePlaneCount(@NativeType("uint32_t") int value) { XrScenePlanesMSFT.nscenePlaneCount(address(), value); return this; }
        /** Sets the address of the specified {@link XrScenePlaneMSFT.Buffer} to the {@code scenePlanes} field. */
        public XrScenePlanesMSFT.Buffer scenePlanes(@NativeType("XrScenePlaneMSFT *") XrScenePlaneMSFT.@Nullable Buffer value) { XrScenePlanesMSFT.nscenePlanes(address(), value); return this; }

    }

}