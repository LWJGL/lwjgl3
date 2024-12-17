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
 * struct XrSpaceLocations {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t locationCount;
 *     {@link XrSpaceLocationData XrSpaceLocationData} * locations;
 * }}</pre>
 */
public class XrSpaceLocations extends Struct<XrSpaceLocations> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LOCATIONCOUNT,
        LOCATIONS;

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
        LOCATIONCOUNT = layout.offsetof(2);
        LOCATIONS = layout.offsetof(3);
    }

    protected XrSpaceLocations(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpaceLocations create(long address, @Nullable ByteBuffer container) {
        return new XrSpaceLocations(address, container);
    }

    /**
     * Creates a {@code XrSpaceLocations} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceLocations(ByteBuffer container) {
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
    /** @return the value of the {@code locationCount} field. */
    @NativeType("uint32_t")
    public int locationCount() { return nlocationCount(address()); }
    /** @return a {@link XrSpaceLocationData.Buffer} view of the struct array pointed to by the {@code locations} field. */
    @NativeType("XrSpaceLocationData *")
    public XrSpaceLocationData.Buffer locations() { return nlocations(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpaceLocations type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR11#XR_TYPE_SPACE_LOCATIONS TYPE_SPACE_LOCATIONS} value to the {@code type} field. */
    public XrSpaceLocations type$Default() { return type(XR11.XR_TYPE_SPACE_LOCATIONS); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpaceLocations next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrSpaceVelocities} value to the {@code next} chain. */
    public XrSpaceLocations next(XrSpaceVelocities value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSpaceVelocitiesKHR} value to the {@code next} chain. */
    public XrSpaceLocations next(XrSpaceVelocitiesKHR value) { return this.next(value.next(this.next()).address()); }
    /** Sets the address of the specified {@link XrSpaceLocationData.Buffer} to the {@code locations} field. */
    public XrSpaceLocations locations(@NativeType("XrSpaceLocationData *") XrSpaceLocationData.Buffer value) { nlocations(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpaceLocations set(
        int type,
        long next,
        XrSpaceLocationData.Buffer locations
    ) {
        type(type);
        next(next);
        locations(locations);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpaceLocations set(XrSpaceLocations src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpaceLocations} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpaceLocations malloc() {
        return new XrSpaceLocations(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceLocations} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpaceLocations calloc() {
        return new XrSpaceLocations(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceLocations} instance allocated with {@link BufferUtils}. */
    public static XrSpaceLocations create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpaceLocations(memAddress(container), container);
    }

    /** Returns a new {@code XrSpaceLocations} instance for the specified memory address. */
    public static XrSpaceLocations create(long address) {
        return new XrSpaceLocations(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpaceLocations createSafe(long address) {
        return address == NULL ? null : new XrSpaceLocations(address, null);
    }

    /**
     * Returns a new {@link XrSpaceLocations.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceLocations.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpaceLocations.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceLocations.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceLocations.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceLocations.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpaceLocations.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceLocations.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpaceLocations.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpaceLocations} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceLocations malloc(MemoryStack stack) {
        return new XrSpaceLocations(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpaceLocations} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceLocations calloc(MemoryStack stack) {
        return new XrSpaceLocations(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpaceLocations.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceLocations.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceLocations.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceLocations.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpaceLocations.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpaceLocations.NEXT); }
    /** Unsafe version of {@link #locationCount}. */
    public static int nlocationCount(long struct) { return memGetInt(struct + XrSpaceLocations.LOCATIONCOUNT); }
    /** Unsafe version of {@link #locations}. */
    public static XrSpaceLocationData.Buffer nlocations(long struct) { return XrSpaceLocationData.create(memGetAddress(struct + XrSpaceLocations.LOCATIONS), nlocationCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpaceLocations.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpaceLocations.NEXT, value); }
    /** Sets the specified value to the {@code locationCount} field of the specified {@code struct}. */
    public static void nlocationCount(long struct, int value) { memPutInt(struct + XrSpaceLocations.LOCATIONCOUNT, value); }
    /** Unsafe version of {@link #locations(XrSpaceLocationData.Buffer) locations}. */
    public static void nlocations(long struct, XrSpaceLocationData.Buffer value) { memPutAddress(struct + XrSpaceLocations.LOCATIONS, value.address()); nlocationCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpaceLocations.LOCATIONS));
    }

    // -----------------------------------

    /** An array of {@link XrSpaceLocations} structs. */
    public static class Buffer extends StructBuffer<XrSpaceLocations, Buffer> implements NativeResource {

        private static final XrSpaceLocations ELEMENT_FACTORY = XrSpaceLocations.create(-1L);

        /**
         * Creates a new {@code XrSpaceLocations.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceLocations#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpaceLocations getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpaceLocations.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSpaceLocations.nnext(address()); }
        /** @return the value of the {@code locationCount} field. */
        @NativeType("uint32_t")
        public int locationCount() { return XrSpaceLocations.nlocationCount(address()); }
        /** @return a {@link XrSpaceLocationData.Buffer} view of the struct array pointed to by the {@code locations} field. */
        @NativeType("XrSpaceLocationData *")
        public XrSpaceLocationData.Buffer locations() { return XrSpaceLocations.nlocations(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpaceLocations.Buffer type(@NativeType("XrStructureType") int value) { XrSpaceLocations.ntype(address(), value); return this; }
        /** Sets the {@link XR11#XR_TYPE_SPACE_LOCATIONS TYPE_SPACE_LOCATIONS} value to the {@code type} field. */
        public XrSpaceLocations.Buffer type$Default() { return type(XR11.XR_TYPE_SPACE_LOCATIONS); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpaceLocations.Buffer next(@NativeType("void *") long value) { XrSpaceLocations.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrSpaceVelocities} value to the {@code next} chain. */
        public XrSpaceLocations.Buffer next(XrSpaceVelocities value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSpaceVelocitiesKHR} value to the {@code next} chain. */
        public XrSpaceLocations.Buffer next(XrSpaceVelocitiesKHR value) { return this.next(value.next(this.next()).address()); }
        /** Sets the address of the specified {@link XrSpaceLocationData.Buffer} to the {@code locations} field. */
        public XrSpaceLocations.Buffer locations(@NativeType("XrSpaceLocationData *") XrSpaceLocationData.Buffer value) { XrSpaceLocations.nlocations(address(), value); return this; }

    }

}