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
 * struct XrBodySkeletonHTC {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t jointCount;
 *     {@link XrBodySkeletonJointHTC XrBodySkeletonJointHTC} * joints;
 * }}</pre>
 */
public class XrBodySkeletonHTC extends Struct<XrBodySkeletonHTC> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        JOINTCOUNT,
        JOINTS;

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
        JOINTCOUNT = layout.offsetof(2);
        JOINTS = layout.offsetof(3);
    }

    protected XrBodySkeletonHTC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrBodySkeletonHTC create(long address, @Nullable ByteBuffer container) {
        return new XrBodySkeletonHTC(address, container);
    }

    /**
     * Creates a {@code XrBodySkeletonHTC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBodySkeletonHTC(ByteBuffer container) {
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
    /** @return the value of the {@code jointCount} field. */
    @NativeType("uint32_t")
    public int jointCount() { return njointCount(address()); }
    /** @return a {@link XrBodySkeletonJointHTC.Buffer} view of the struct array pointed to by the {@code joints} field. */
    @NativeType("XrBodySkeletonJointHTC *")
    public XrBodySkeletonJointHTC.Buffer joints() { return njoints(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrBodySkeletonHTC type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link HTCBodyTracking#XR_TYPE_BODY_SKELETON_HTC TYPE_BODY_SKELETON_HTC} value to the {@code type} field. */
    public XrBodySkeletonHTC type$Default() { return type(HTCBodyTracking.XR_TYPE_BODY_SKELETON_HTC); }
    /** Sets the specified value to the {@code next} field. */
    public XrBodySkeletonHTC next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrBodySkeletonJointHTC.Buffer} to the {@code joints} field. */
    public XrBodySkeletonHTC joints(@NativeType("XrBodySkeletonJointHTC *") XrBodySkeletonJointHTC.Buffer value) { njoints(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrBodySkeletonHTC set(
        int type,
        long next,
        XrBodySkeletonJointHTC.Buffer joints
    ) {
        type(type);
        next(next);
        joints(joints);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrBodySkeletonHTC set(XrBodySkeletonHTC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBodySkeletonHTC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBodySkeletonHTC malloc() {
        return new XrBodySkeletonHTC(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrBodySkeletonHTC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBodySkeletonHTC calloc() {
        return new XrBodySkeletonHTC(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrBodySkeletonHTC} instance allocated with {@link BufferUtils}. */
    public static XrBodySkeletonHTC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrBodySkeletonHTC(memAddress(container), container);
    }

    /** Returns a new {@code XrBodySkeletonHTC} instance for the specified memory address. */
    public static XrBodySkeletonHTC create(long address) {
        return new XrBodySkeletonHTC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrBodySkeletonHTC createSafe(long address) {
        return address == NULL ? null : new XrBodySkeletonHTC(address, null);
    }

    /**
     * Returns a new {@link XrBodySkeletonHTC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodySkeletonHTC.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBodySkeletonHTC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodySkeletonHTC.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodySkeletonHTC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodySkeletonHTC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrBodySkeletonHTC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBodySkeletonHTC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrBodySkeletonHTC.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrBodySkeletonHTC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodySkeletonHTC malloc(MemoryStack stack) {
        return new XrBodySkeletonHTC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrBodySkeletonHTC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodySkeletonHTC calloc(MemoryStack stack) {
        return new XrBodySkeletonHTC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrBodySkeletonHTC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodySkeletonHTC.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodySkeletonHTC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodySkeletonHTC.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrBodySkeletonHTC.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrBodySkeletonHTC.NEXT); }
    /** Unsafe version of {@link #jointCount}. */
    public static int njointCount(long struct) { return memGetInt(struct + XrBodySkeletonHTC.JOINTCOUNT); }
    /** Unsafe version of {@link #joints}. */
    public static XrBodySkeletonJointHTC.Buffer njoints(long struct) { return XrBodySkeletonJointHTC.create(memGetAddress(struct + XrBodySkeletonHTC.JOINTS), njointCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrBodySkeletonHTC.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrBodySkeletonHTC.NEXT, value); }
    /** Sets the specified value to the {@code jointCount} field of the specified {@code struct}. */
    public static void njointCount(long struct, int value) { memPutInt(struct + XrBodySkeletonHTC.JOINTCOUNT, value); }
    /** Unsafe version of {@link #joints(XrBodySkeletonJointHTC.Buffer) joints}. */
    public static void njoints(long struct, XrBodySkeletonJointHTC.Buffer value) { memPutAddress(struct + XrBodySkeletonHTC.JOINTS, value.address()); njointCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrBodySkeletonHTC.JOINTS));
    }

    // -----------------------------------

    /** An array of {@link XrBodySkeletonHTC} structs. */
    public static class Buffer extends StructBuffer<XrBodySkeletonHTC, Buffer> implements NativeResource {

        private static final XrBodySkeletonHTC ELEMENT_FACTORY = XrBodySkeletonHTC.create(-1L);

        /**
         * Creates a new {@code XrBodySkeletonHTC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBodySkeletonHTC#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrBodySkeletonHTC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrBodySkeletonHTC.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrBodySkeletonHTC.nnext(address()); }
        /** @return the value of the {@code jointCount} field. */
        @NativeType("uint32_t")
        public int jointCount() { return XrBodySkeletonHTC.njointCount(address()); }
        /** @return a {@link XrBodySkeletonJointHTC.Buffer} view of the struct array pointed to by the {@code joints} field. */
        @NativeType("XrBodySkeletonJointHTC *")
        public XrBodySkeletonJointHTC.Buffer joints() { return XrBodySkeletonHTC.njoints(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrBodySkeletonHTC.Buffer type(@NativeType("XrStructureType") int value) { XrBodySkeletonHTC.ntype(address(), value); return this; }
        /** Sets the {@link HTCBodyTracking#XR_TYPE_BODY_SKELETON_HTC TYPE_BODY_SKELETON_HTC} value to the {@code type} field. */
        public XrBodySkeletonHTC.Buffer type$Default() { return type(HTCBodyTracking.XR_TYPE_BODY_SKELETON_HTC); }
        /** Sets the specified value to the {@code next} field. */
        public XrBodySkeletonHTC.Buffer next(@NativeType("void *") long value) { XrBodySkeletonHTC.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrBodySkeletonJointHTC.Buffer} to the {@code joints} field. */
        public XrBodySkeletonHTC.Buffer joints(@NativeType("XrBodySkeletonJointHTC *") XrBodySkeletonJointHTC.Buffer value) { XrBodySkeletonHTC.njoints(address(), value); return this; }

    }

}