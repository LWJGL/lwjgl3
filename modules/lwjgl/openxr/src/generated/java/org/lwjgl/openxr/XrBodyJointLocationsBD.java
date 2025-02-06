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
 * struct XrBodyJointLocationsBD {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 allJointPosesTracked;
 *     uint32_t jointLocationCount;
 *     {@link XrBodyJointLocationBD XrBodyJointLocationBD} * jointLocations;
 * }}</pre>
 */
public class XrBodyJointLocationsBD extends Struct<XrBodyJointLocationsBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ALLJOINTPOSESTRACKED,
        JOINTLOCATIONCOUNT,
        JOINTLOCATIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ALLJOINTPOSESTRACKED = layout.offsetof(2);
        JOINTLOCATIONCOUNT = layout.offsetof(3);
        JOINTLOCATIONS = layout.offsetof(4);
    }

    protected XrBodyJointLocationsBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrBodyJointLocationsBD create(long address, @Nullable ByteBuffer container) {
        return new XrBodyJointLocationsBD(address, container);
    }

    /**
     * Creates a {@code XrBodyJointLocationsBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBodyJointLocationsBD(ByteBuffer container) {
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
    /** @return the value of the {@code allJointPosesTracked} field. */
    @NativeType("XrBool32")
    public boolean allJointPosesTracked() { return nallJointPosesTracked(address()) != 0; }
    /** @return the value of the {@code jointLocationCount} field. */
    @NativeType("uint32_t")
    public int jointLocationCount() { return njointLocationCount(address()); }
    /** @return a {@link XrBodyJointLocationBD.Buffer} view of the struct array pointed to by the {@code jointLocations} field. */
    @NativeType("XrBodyJointLocationBD *")
    public XrBodyJointLocationBD.Buffer jointLocations() { return njointLocations(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrBodyJointLocationsBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDBodyTracking#XR_TYPE_BODY_JOINT_LOCATIONS_BD TYPE_BODY_JOINT_LOCATIONS_BD} value to the {@code type} field. */
    public XrBodyJointLocationsBD type$Default() { return type(BDBodyTracking.XR_TYPE_BODY_JOINT_LOCATIONS_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrBodyJointLocationsBD next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code allJointPosesTracked} field. */
    public XrBodyJointLocationsBD allJointPosesTracked(@NativeType("XrBool32") boolean value) { nallJointPosesTracked(address(), value ? 1 : 0); return this; }
    /** Sets the address of the specified {@link XrBodyJointLocationBD.Buffer} to the {@code jointLocations} field. */
    public XrBodyJointLocationsBD jointLocations(@NativeType("XrBodyJointLocationBD *") XrBodyJointLocationBD.Buffer value) { njointLocations(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrBodyJointLocationsBD set(
        int type,
        long next,
        boolean allJointPosesTracked,
        XrBodyJointLocationBD.Buffer jointLocations
    ) {
        type(type);
        next(next);
        allJointPosesTracked(allJointPosesTracked);
        jointLocations(jointLocations);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrBodyJointLocationsBD set(XrBodyJointLocationsBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBodyJointLocationsBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBodyJointLocationsBD malloc() {
        return new XrBodyJointLocationsBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrBodyJointLocationsBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBodyJointLocationsBD calloc() {
        return new XrBodyJointLocationsBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrBodyJointLocationsBD} instance allocated with {@link BufferUtils}. */
    public static XrBodyJointLocationsBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrBodyJointLocationsBD(memAddress(container), container);
    }

    /** Returns a new {@code XrBodyJointLocationsBD} instance for the specified memory address. */
    public static XrBodyJointLocationsBD create(long address) {
        return new XrBodyJointLocationsBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrBodyJointLocationsBD createSafe(long address) {
        return address == NULL ? null : new XrBodyJointLocationsBD(address, null);
    }

    /**
     * Returns a new {@link XrBodyJointLocationsBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationsBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointLocationsBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationsBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointLocationsBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationsBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrBodyJointLocationsBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationsBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrBodyJointLocationsBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrBodyJointLocationsBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyJointLocationsBD malloc(MemoryStack stack) {
        return new XrBodyJointLocationsBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrBodyJointLocationsBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyJointLocationsBD calloc(MemoryStack stack) {
        return new XrBodyJointLocationsBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrBodyJointLocationsBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationsBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointLocationsBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationsBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrBodyJointLocationsBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrBodyJointLocationsBD.NEXT); }
    /** Unsafe version of {@link #allJointPosesTracked}. */
    public static int nallJointPosesTracked(long struct) { return memGetInt(struct + XrBodyJointLocationsBD.ALLJOINTPOSESTRACKED); }
    /** Unsafe version of {@link #jointLocationCount}. */
    public static int njointLocationCount(long struct) { return memGetInt(struct + XrBodyJointLocationsBD.JOINTLOCATIONCOUNT); }
    /** Unsafe version of {@link #jointLocations}. */
    public static XrBodyJointLocationBD.Buffer njointLocations(long struct) { return XrBodyJointLocationBD.create(memGetAddress(struct + XrBodyJointLocationsBD.JOINTLOCATIONS), njointLocationCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrBodyJointLocationsBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrBodyJointLocationsBD.NEXT, value); }
    /** Unsafe version of {@link #allJointPosesTracked(boolean) allJointPosesTracked}. */
    public static void nallJointPosesTracked(long struct, int value) { memPutInt(struct + XrBodyJointLocationsBD.ALLJOINTPOSESTRACKED, value); }
    /** Sets the specified value to the {@code jointLocationCount} field of the specified {@code struct}. */
    public static void njointLocationCount(long struct, int value) { memPutInt(struct + XrBodyJointLocationsBD.JOINTLOCATIONCOUNT, value); }
    /** Unsafe version of {@link #jointLocations(XrBodyJointLocationBD.Buffer) jointLocations}. */
    public static void njointLocations(long struct, XrBodyJointLocationBD.Buffer value) { memPutAddress(struct + XrBodyJointLocationsBD.JOINTLOCATIONS, value.address()); njointLocationCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrBodyJointLocationsBD.JOINTLOCATIONS));
    }

    // -----------------------------------

    /** An array of {@link XrBodyJointLocationsBD} structs. */
    public static class Buffer extends StructBuffer<XrBodyJointLocationsBD, Buffer> implements NativeResource {

        private static final XrBodyJointLocationsBD ELEMENT_FACTORY = XrBodyJointLocationsBD.create(-1L);

        /**
         * Creates a new {@code XrBodyJointLocationsBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBodyJointLocationsBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrBodyJointLocationsBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrBodyJointLocationsBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrBodyJointLocationsBD.nnext(address()); }
        /** @return the value of the {@code allJointPosesTracked} field. */
        @NativeType("XrBool32")
        public boolean allJointPosesTracked() { return XrBodyJointLocationsBD.nallJointPosesTracked(address()) != 0; }
        /** @return the value of the {@code jointLocationCount} field. */
        @NativeType("uint32_t")
        public int jointLocationCount() { return XrBodyJointLocationsBD.njointLocationCount(address()); }
        /** @return a {@link XrBodyJointLocationBD.Buffer} view of the struct array pointed to by the {@code jointLocations} field. */
        @NativeType("XrBodyJointLocationBD *")
        public XrBodyJointLocationBD.Buffer jointLocations() { return XrBodyJointLocationsBD.njointLocations(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrBodyJointLocationsBD.Buffer type(@NativeType("XrStructureType") int value) { XrBodyJointLocationsBD.ntype(address(), value); return this; }
        /** Sets the {@link BDBodyTracking#XR_TYPE_BODY_JOINT_LOCATIONS_BD TYPE_BODY_JOINT_LOCATIONS_BD} value to the {@code type} field. */
        public XrBodyJointLocationsBD.Buffer type$Default() { return type(BDBodyTracking.XR_TYPE_BODY_JOINT_LOCATIONS_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrBodyJointLocationsBD.Buffer next(@NativeType("void *") long value) { XrBodyJointLocationsBD.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code allJointPosesTracked} field. */
        public XrBodyJointLocationsBD.Buffer allJointPosesTracked(@NativeType("XrBool32") boolean value) { XrBodyJointLocationsBD.nallJointPosesTracked(address(), value ? 1 : 0); return this; }
        /** Sets the address of the specified {@link XrBodyJointLocationBD.Buffer} to the {@code jointLocations} field. */
        public XrBodyJointLocationsBD.Buffer jointLocations(@NativeType("XrBodyJointLocationBD *") XrBodyJointLocationBD.Buffer value) { XrBodyJointLocationsBD.njointLocations(address(), value); return this; }

    }

}