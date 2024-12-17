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
 * struct XrBodySkeletonJointFB {
 *     int32_t joint;
 *     int32_t parentJoint;
 *     {@link XrPosef XrPosef} pose;
 * }}</pre>
 */
public class XrBodySkeletonJointFB extends Struct<XrBodySkeletonJointFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        JOINT,
        PARENTJOINT,
        POSE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        JOINT = layout.offsetof(0);
        PARENTJOINT = layout.offsetof(1);
        POSE = layout.offsetof(2);
    }

    protected XrBodySkeletonJointFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrBodySkeletonJointFB create(long address, @Nullable ByteBuffer container) {
        return new XrBodySkeletonJointFB(address, container);
    }

    /**
     * Creates a {@code XrBodySkeletonJointFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBodySkeletonJointFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code joint} field. */
    @NativeType("int32_t")
    public int joint() { return njoint(address()); }
    /** @return the value of the {@code parentJoint} field. */
    @NativeType("int32_t")
    public int parentJoint() { return nparentJoint(address()); }
    /** @return a {@link XrPosef} view of the {@code pose} field. */
    public XrPosef pose() { return npose(address()); }

    /** Sets the specified value to the {@code joint} field. */
    public XrBodySkeletonJointFB joint(@NativeType("int32_t") int value) { njoint(address(), value); return this; }
    /** Sets the specified value to the {@code parentJoint} field. */
    public XrBodySkeletonJointFB parentJoint(@NativeType("int32_t") int value) { nparentJoint(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@code pose} field. */
    public XrBodySkeletonJointFB pose(XrPosef value) { npose(address(), value); return this; }
    /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrBodySkeletonJointFB pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }

    /** Initializes this struct with the specified values. */
    public XrBodySkeletonJointFB set(
        int joint,
        int parentJoint,
        XrPosef pose
    ) {
        joint(joint);
        parentJoint(parentJoint);
        pose(pose);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrBodySkeletonJointFB set(XrBodySkeletonJointFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBodySkeletonJointFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBodySkeletonJointFB malloc() {
        return new XrBodySkeletonJointFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrBodySkeletonJointFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBodySkeletonJointFB calloc() {
        return new XrBodySkeletonJointFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrBodySkeletonJointFB} instance allocated with {@link BufferUtils}. */
    public static XrBodySkeletonJointFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrBodySkeletonJointFB(memAddress(container), container);
    }

    /** Returns a new {@code XrBodySkeletonJointFB} instance for the specified memory address. */
    public static XrBodySkeletonJointFB create(long address) {
        return new XrBodySkeletonJointFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrBodySkeletonJointFB createSafe(long address) {
        return address == NULL ? null : new XrBodySkeletonJointFB(address, null);
    }

    /**
     * Returns a new {@link XrBodySkeletonJointFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodySkeletonJointFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBodySkeletonJointFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodySkeletonJointFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodySkeletonJointFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodySkeletonJointFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrBodySkeletonJointFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBodySkeletonJointFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrBodySkeletonJointFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrBodySkeletonJointFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodySkeletonJointFB malloc(MemoryStack stack) {
        return new XrBodySkeletonJointFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrBodySkeletonJointFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodySkeletonJointFB calloc(MemoryStack stack) {
        return new XrBodySkeletonJointFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrBodySkeletonJointFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodySkeletonJointFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodySkeletonJointFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodySkeletonJointFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #joint}. */
    public static int njoint(long struct) { return memGetInt(struct + XrBodySkeletonJointFB.JOINT); }
    /** Unsafe version of {@link #parentJoint}. */
    public static int nparentJoint(long struct) { return memGetInt(struct + XrBodySkeletonJointFB.PARENTJOINT); }
    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrBodySkeletonJointFB.POSE); }

    /** Unsafe version of {@link #joint(int) joint}. */
    public static void njoint(long struct, int value) { memPutInt(struct + XrBodySkeletonJointFB.JOINT, value); }
    /** Unsafe version of {@link #parentJoint(int) parentJoint}. */
    public static void nparentJoint(long struct, int value) { memPutInt(struct + XrBodySkeletonJointFB.PARENTJOINT, value); }
    /** Unsafe version of {@link #pose(XrPosef) pose}. */
    public static void npose(long struct, XrPosef value) { memCopy(value.address(), struct + XrBodySkeletonJointFB.POSE, XrPosef.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrBodySkeletonJointFB} structs. */
    public static class Buffer extends StructBuffer<XrBodySkeletonJointFB, Buffer> implements NativeResource {

        private static final XrBodySkeletonJointFB ELEMENT_FACTORY = XrBodySkeletonJointFB.create(-1L);

        /**
         * Creates a new {@code XrBodySkeletonJointFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBodySkeletonJointFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrBodySkeletonJointFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code joint} field. */
        @NativeType("int32_t")
        public int joint() { return XrBodySkeletonJointFB.njoint(address()); }
        /** @return the value of the {@code parentJoint} field. */
        @NativeType("int32_t")
        public int parentJoint() { return XrBodySkeletonJointFB.nparentJoint(address()); }
        /** @return a {@link XrPosef} view of the {@code pose} field. */
        public XrPosef pose() { return XrBodySkeletonJointFB.npose(address()); }

        /** Sets the specified value to the {@code joint} field. */
        public XrBodySkeletonJointFB.Buffer joint(@NativeType("int32_t") int value) { XrBodySkeletonJointFB.njoint(address(), value); return this; }
        /** Sets the specified value to the {@code parentJoint} field. */
        public XrBodySkeletonJointFB.Buffer parentJoint(@NativeType("int32_t") int value) { XrBodySkeletonJointFB.nparentJoint(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@code pose} field. */
        public XrBodySkeletonJointFB.Buffer pose(XrPosef value) { XrBodySkeletonJointFB.npose(address(), value); return this; }
        /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrBodySkeletonJointFB.Buffer pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }

    }

}