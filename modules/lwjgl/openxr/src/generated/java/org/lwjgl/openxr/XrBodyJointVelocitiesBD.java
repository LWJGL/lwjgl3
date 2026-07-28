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
 * <pre><code>
 * struct XrBodyJointVelocitiesBD {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t velocityCount;
 *     {@link XrBodyJointVelocityBD XrBodyJointVelocityBD} * velocities;
 * }</code></pre>
 */
public class XrBodyJointVelocitiesBD extends Struct<XrBodyJointVelocitiesBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        VELOCITYCOUNT,
        VELOCITIES;

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
        VELOCITYCOUNT = layout.offsetof(2);
        VELOCITIES = layout.offsetof(3);
    }

    protected XrBodyJointVelocitiesBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrBodyJointVelocitiesBD create(long address, @Nullable ByteBuffer container) {
        return new XrBodyJointVelocitiesBD(address, container);
    }

    /**
     * Creates a {@code XrBodyJointVelocitiesBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBodyJointVelocitiesBD(ByteBuffer container) {
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
    /** @return the value of the {@code velocityCount} field. */
    @NativeType("uint32_t")
    public int velocityCount() { return nvelocityCount(address()); }
    /** @return a {@link XrBodyJointVelocityBD.Buffer} view of the struct array pointed to by the {@code velocities} field. */
    @NativeType("XrBodyJointVelocityBD *")
    public XrBodyJointVelocityBD.Buffer velocities() { return nvelocities(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrBodyJointVelocitiesBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDBodyTrackingAuxiliaryMetrics#XR_TYPE_BODY_JOINT_VELOCITIES_BD TYPE_BODY_JOINT_VELOCITIES_BD} value to the {@code type} field. */
    public XrBodyJointVelocitiesBD type$Default() { return type(BDBodyTrackingAuxiliaryMetrics.XR_TYPE_BODY_JOINT_VELOCITIES_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrBodyJointVelocitiesBD next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrBodyJointVelocityBD.Buffer} to the {@code velocities} field. */
    public XrBodyJointVelocitiesBD velocities(@NativeType("XrBodyJointVelocityBD *") XrBodyJointVelocityBD.Buffer value) { nvelocities(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrBodyJointVelocitiesBD set(
        int type,
        long next,
        XrBodyJointVelocityBD.Buffer velocities
    ) {
        type(type);
        next(next);
        velocities(velocities);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrBodyJointVelocitiesBD set(XrBodyJointVelocitiesBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBodyJointVelocitiesBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBodyJointVelocitiesBD malloc() {
        return new XrBodyJointVelocitiesBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrBodyJointVelocitiesBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBodyJointVelocitiesBD calloc() {
        return new XrBodyJointVelocitiesBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrBodyJointVelocitiesBD} instance allocated with {@link BufferUtils}. */
    public static XrBodyJointVelocitiesBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrBodyJointVelocitiesBD(memAddress(container), container);
    }

    /** Returns a new {@code XrBodyJointVelocitiesBD} instance for the specified memory address. */
    public static XrBodyJointVelocitiesBD create(long address) {
        return new XrBodyJointVelocitiesBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrBodyJointVelocitiesBD createSafe(long address) {
        return address == NULL ? null : new XrBodyJointVelocitiesBD(address, null);
    }

    /**
     * Returns a new {@link XrBodyJointVelocitiesBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointVelocitiesBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointVelocitiesBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointVelocitiesBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointVelocitiesBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointVelocitiesBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrBodyJointVelocitiesBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBodyJointVelocitiesBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrBodyJointVelocitiesBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrBodyJointVelocitiesBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyJointVelocitiesBD malloc(MemoryStack stack) {
        return new XrBodyJointVelocitiesBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrBodyJointVelocitiesBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyJointVelocitiesBD calloc(MemoryStack stack) {
        return new XrBodyJointVelocitiesBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrBodyJointVelocitiesBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyJointVelocitiesBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointVelocitiesBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyJointVelocitiesBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrBodyJointVelocitiesBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrBodyJointVelocitiesBD.NEXT); }
    /** Unsafe version of {@link #velocityCount}. */
    public static int nvelocityCount(long struct) { return memGetInt(struct + XrBodyJointVelocitiesBD.VELOCITYCOUNT); }
    /** Unsafe version of {@link #velocities}. */
    public static XrBodyJointVelocityBD.Buffer nvelocities(long struct) { return XrBodyJointVelocityBD.create(memGetAddress(struct + XrBodyJointVelocitiesBD.VELOCITIES), nvelocityCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrBodyJointVelocitiesBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrBodyJointVelocitiesBD.NEXT, value); }
    /** Sets the specified value to the {@code velocityCount} field of the specified {@code struct}. */
    public static void nvelocityCount(long struct, int value) { memPutInt(struct + XrBodyJointVelocitiesBD.VELOCITYCOUNT, value); }
    /** Unsafe version of {@link #velocities(XrBodyJointVelocityBD.Buffer) velocities}. */
    public static void nvelocities(long struct, XrBodyJointVelocityBD.Buffer value) { memPutAddress(struct + XrBodyJointVelocitiesBD.VELOCITIES, value.address()); nvelocityCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrBodyJointVelocitiesBD.VELOCITIES));
    }

    // -----------------------------------

    /** An array of {@link XrBodyJointVelocitiesBD} structs. */
    public static class Buffer extends StructBuffer<XrBodyJointVelocitiesBD, Buffer> implements NativeResource {

        private static final XrBodyJointVelocitiesBD ELEMENT_FACTORY = XrBodyJointVelocitiesBD.create(-1L);

        /**
         * Creates a new {@code XrBodyJointVelocitiesBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBodyJointVelocitiesBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrBodyJointVelocitiesBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrBodyJointVelocitiesBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrBodyJointVelocitiesBD.nnext(address()); }
        /** @return the value of the {@code velocityCount} field. */
        @NativeType("uint32_t")
        public int velocityCount() { return XrBodyJointVelocitiesBD.nvelocityCount(address()); }
        /** @return a {@link XrBodyJointVelocityBD.Buffer} view of the struct array pointed to by the {@code velocities} field. */
        @NativeType("XrBodyJointVelocityBD *")
        public XrBodyJointVelocityBD.Buffer velocities() { return XrBodyJointVelocitiesBD.nvelocities(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrBodyJointVelocitiesBD.Buffer type(@NativeType("XrStructureType") int value) { XrBodyJointVelocitiesBD.ntype(address(), value); return this; }
        /** Sets the {@link BDBodyTrackingAuxiliaryMetrics#XR_TYPE_BODY_JOINT_VELOCITIES_BD TYPE_BODY_JOINT_VELOCITIES_BD} value to the {@code type} field. */
        public XrBodyJointVelocitiesBD.Buffer type$Default() { return type(BDBodyTrackingAuxiliaryMetrics.XR_TYPE_BODY_JOINT_VELOCITIES_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrBodyJointVelocitiesBD.Buffer next(@NativeType("void *") long value) { XrBodyJointVelocitiesBD.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrBodyJointVelocityBD.Buffer} to the {@code velocities} field. */
        public XrBodyJointVelocitiesBD.Buffer velocities(@NativeType("XrBodyJointVelocityBD *") XrBodyJointVelocityBD.Buffer value) { XrBodyJointVelocitiesBD.nvelocities(address(), value); return this; }

    }

}