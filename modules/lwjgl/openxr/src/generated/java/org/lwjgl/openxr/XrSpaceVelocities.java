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
 * struct XrSpaceVelocities {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t velocityCount;
 *     {@link XrSpaceVelocityData XrSpaceVelocityData} * velocities;
 * }}</pre>
 */
public class XrSpaceVelocities extends Struct<XrSpaceVelocities> implements NativeResource {

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

    protected XrSpaceVelocities(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpaceVelocities create(long address, @Nullable ByteBuffer container) {
        return new XrSpaceVelocities(address, container);
    }

    /**
     * Creates a {@code XrSpaceVelocities} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceVelocities(ByteBuffer container) {
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
    /** @return a {@link XrSpaceVelocityData.Buffer} view of the struct array pointed to by the {@code velocities} field. */
    @NativeType("XrSpaceVelocityData *")
    public XrSpaceVelocityData.Buffer velocities() { return nvelocities(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpaceVelocities type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR11#XR_TYPE_SPACE_VELOCITIES TYPE_SPACE_VELOCITIES} value to the {@code type} field. */
    public XrSpaceVelocities type$Default() { return type(XR11.XR_TYPE_SPACE_VELOCITIES); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpaceVelocities next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrSpaceVelocityData.Buffer} to the {@code velocities} field. */
    public XrSpaceVelocities velocities(@NativeType("XrSpaceVelocityData *") XrSpaceVelocityData.Buffer value) { nvelocities(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpaceVelocities set(
        int type,
        long next,
        XrSpaceVelocityData.Buffer velocities
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
    public XrSpaceVelocities set(XrSpaceVelocities src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpaceVelocities} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpaceVelocities malloc() {
        return new XrSpaceVelocities(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceVelocities} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpaceVelocities calloc() {
        return new XrSpaceVelocities(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceVelocities} instance allocated with {@link BufferUtils}. */
    public static XrSpaceVelocities create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpaceVelocities(memAddress(container), container);
    }

    /** Returns a new {@code XrSpaceVelocities} instance for the specified memory address. */
    public static XrSpaceVelocities create(long address) {
        return new XrSpaceVelocities(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpaceVelocities createSafe(long address) {
        return address == NULL ? null : new XrSpaceVelocities(address, null);
    }

    /**
     * Returns a new {@link XrSpaceVelocities.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceVelocities.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpaceVelocities.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceVelocities.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceVelocities.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceVelocities.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpaceVelocities.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceVelocities.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpaceVelocities.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpaceVelocities} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceVelocities malloc(MemoryStack stack) {
        return new XrSpaceVelocities(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpaceVelocities} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceVelocities calloc(MemoryStack stack) {
        return new XrSpaceVelocities(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpaceVelocities.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceVelocities.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceVelocities.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceVelocities.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpaceVelocities.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpaceVelocities.NEXT); }
    /** Unsafe version of {@link #velocityCount}. */
    public static int nvelocityCount(long struct) { return memGetInt(struct + XrSpaceVelocities.VELOCITYCOUNT); }
    /** Unsafe version of {@link #velocities}. */
    public static XrSpaceVelocityData.Buffer nvelocities(long struct) { return XrSpaceVelocityData.create(memGetAddress(struct + XrSpaceVelocities.VELOCITIES), nvelocityCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpaceVelocities.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpaceVelocities.NEXT, value); }
    /** Sets the specified value to the {@code velocityCount} field of the specified {@code struct}. */
    public static void nvelocityCount(long struct, int value) { memPutInt(struct + XrSpaceVelocities.VELOCITYCOUNT, value); }
    /** Unsafe version of {@link #velocities(XrSpaceVelocityData.Buffer) velocities}. */
    public static void nvelocities(long struct, XrSpaceVelocityData.Buffer value) { memPutAddress(struct + XrSpaceVelocities.VELOCITIES, value.address()); nvelocityCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpaceVelocities.VELOCITIES));
    }

    // -----------------------------------

    /** An array of {@link XrSpaceVelocities} structs. */
    public static class Buffer extends StructBuffer<XrSpaceVelocities, Buffer> implements NativeResource {

        private static final XrSpaceVelocities ELEMENT_FACTORY = XrSpaceVelocities.create(-1L);

        /**
         * Creates a new {@code XrSpaceVelocities.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceVelocities#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpaceVelocities getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpaceVelocities.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSpaceVelocities.nnext(address()); }
        /** @return the value of the {@code velocityCount} field. */
        @NativeType("uint32_t")
        public int velocityCount() { return XrSpaceVelocities.nvelocityCount(address()); }
        /** @return a {@link XrSpaceVelocityData.Buffer} view of the struct array pointed to by the {@code velocities} field. */
        @NativeType("XrSpaceVelocityData *")
        public XrSpaceVelocityData.Buffer velocities() { return XrSpaceVelocities.nvelocities(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpaceVelocities.Buffer type(@NativeType("XrStructureType") int value) { XrSpaceVelocities.ntype(address(), value); return this; }
        /** Sets the {@link XR11#XR_TYPE_SPACE_VELOCITIES TYPE_SPACE_VELOCITIES} value to the {@code type} field. */
        public XrSpaceVelocities.Buffer type$Default() { return type(XR11.XR_TYPE_SPACE_VELOCITIES); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpaceVelocities.Buffer next(@NativeType("void *") long value) { XrSpaceVelocities.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrSpaceVelocityData.Buffer} to the {@code velocities} field. */
        public XrSpaceVelocities.Buffer velocities(@NativeType("XrSpaceVelocityData *") XrSpaceVelocityData.Buffer value) { XrSpaceVelocities.nvelocities(address(), value); return this; }

    }

}