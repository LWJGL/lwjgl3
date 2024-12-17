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
 * struct XrHandJointLocationsEXT {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 isActive;
 *     uint32_t jointCount;
 *     {@link XrHandJointLocationEXT XrHandJointLocationEXT} * jointLocations;
 * }}</pre>
 */
public class XrHandJointLocationsEXT extends Struct<XrHandJointLocationsEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ISACTIVE,
        JOINTCOUNT,
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
        ISACTIVE = layout.offsetof(2);
        JOINTCOUNT = layout.offsetof(3);
        JOINTLOCATIONS = layout.offsetof(4);
    }

    protected XrHandJointLocationsEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrHandJointLocationsEXT create(long address, @Nullable ByteBuffer container) {
        return new XrHandJointLocationsEXT(address, container);
    }

    /**
     * Creates a {@code XrHandJointLocationsEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHandJointLocationsEXT(ByteBuffer container) {
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
    /** @return the value of the {@code isActive} field. */
    @NativeType("XrBool32")
    public boolean isActive() { return nisActive(address()) != 0; }
    /** @return the value of the {@code jointCount} field. */
    @NativeType("uint32_t")
    public int jointCount() { return njointCount(address()); }
    /** @return a {@link XrHandJointLocationEXT.Buffer} view of the struct array pointed to by the {@code jointLocations} field. */
    @NativeType("XrHandJointLocationEXT *")
    public XrHandJointLocationEXT.Buffer jointLocations() { return njointLocations(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrHandJointLocationsEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTHandTracking#XR_TYPE_HAND_JOINT_LOCATIONS_EXT TYPE_HAND_JOINT_LOCATIONS_EXT} value to the {@code type} field. */
    public XrHandJointLocationsEXT type$Default() { return type(EXTHandTracking.XR_TYPE_HAND_JOINT_LOCATIONS_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrHandJointLocationsEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrHandJointVelocitiesEXT} value to the {@code next} chain. */
    public XrHandJointLocationsEXT next(XrHandJointVelocitiesEXT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrHandTrackingAimStateFB} value to the {@code next} chain. */
    public XrHandJointLocationsEXT next(XrHandTrackingAimStateFB value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrHandTrackingCapsulesStateFB} value to the {@code next} chain. */
    public XrHandJointLocationsEXT next(XrHandTrackingCapsulesStateFB value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrHandTrackingDataSourceStateEXT} value to the {@code next} chain. */
    public XrHandJointLocationsEXT next(XrHandTrackingDataSourceStateEXT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrHandTrackingScaleFB} value to the {@code next} chain. */
    public XrHandJointLocationsEXT next(XrHandTrackingScaleFB value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@code isActive} field. */
    public XrHandJointLocationsEXT isActive(@NativeType("XrBool32") boolean value) { nisActive(address(), value ? 1 : 0); return this; }
    /** Sets the address of the specified {@link XrHandJointLocationEXT.Buffer} to the {@code jointLocations} field. */
    public XrHandJointLocationsEXT jointLocations(@NativeType("XrHandJointLocationEXT *") XrHandJointLocationEXT.Buffer value) { njointLocations(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHandJointLocationsEXT set(
        int type,
        long next,
        boolean isActive,
        XrHandJointLocationEXT.Buffer jointLocations
    ) {
        type(type);
        next(next);
        isActive(isActive);
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
    public XrHandJointLocationsEXT set(XrHandJointLocationsEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHandJointLocationsEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHandJointLocationsEXT malloc() {
        return new XrHandJointLocationsEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrHandJointLocationsEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHandJointLocationsEXT calloc() {
        return new XrHandJointLocationsEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrHandJointLocationsEXT} instance allocated with {@link BufferUtils}. */
    public static XrHandJointLocationsEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrHandJointLocationsEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrHandJointLocationsEXT} instance for the specified memory address. */
    public static XrHandJointLocationsEXT create(long address) {
        return new XrHandJointLocationsEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrHandJointLocationsEXT createSafe(long address) {
        return address == NULL ? null : new XrHandJointLocationsEXT(address, null);
    }

    /**
     * Returns a new {@link XrHandJointLocationsEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointLocationsEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHandJointLocationsEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointLocationsEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandJointLocationsEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointLocationsEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrHandJointLocationsEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHandJointLocationsEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrHandJointLocationsEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrHandJointLocationsEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandJointLocationsEXT malloc(MemoryStack stack) {
        return new XrHandJointLocationsEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrHandJointLocationsEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandJointLocationsEXT calloc(MemoryStack stack) {
        return new XrHandJointLocationsEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrHandJointLocationsEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandJointLocationsEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandJointLocationsEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandJointLocationsEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrHandJointLocationsEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHandJointLocationsEXT.NEXT); }
    /** Unsafe version of {@link #isActive}. */
    public static int nisActive(long struct) { return memGetInt(struct + XrHandJointLocationsEXT.ISACTIVE); }
    /** Unsafe version of {@link #jointCount}. */
    public static int njointCount(long struct) { return memGetInt(struct + XrHandJointLocationsEXT.JOINTCOUNT); }
    /** Unsafe version of {@link #jointLocations}. */
    public static XrHandJointLocationEXT.Buffer njointLocations(long struct) { return XrHandJointLocationEXT.create(memGetAddress(struct + XrHandJointLocationsEXT.JOINTLOCATIONS), njointCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrHandJointLocationsEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHandJointLocationsEXT.NEXT, value); }
    /** Unsafe version of {@link #isActive(boolean) isActive}. */
    public static void nisActive(long struct, int value) { memPutInt(struct + XrHandJointLocationsEXT.ISACTIVE, value); }
    /** Sets the specified value to the {@code jointCount} field of the specified {@code struct}. */
    public static void njointCount(long struct, int value) { memPutInt(struct + XrHandJointLocationsEXT.JOINTCOUNT, value); }
    /** Unsafe version of {@link #jointLocations(XrHandJointLocationEXT.Buffer) jointLocations}. */
    public static void njointLocations(long struct, XrHandJointLocationEXT.Buffer value) { memPutAddress(struct + XrHandJointLocationsEXT.JOINTLOCATIONS, value.address()); njointCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrHandJointLocationsEXT.JOINTLOCATIONS));
    }

    // -----------------------------------

    /** An array of {@link XrHandJointLocationsEXT} structs. */
    public static class Buffer extends StructBuffer<XrHandJointLocationsEXT, Buffer> implements NativeResource {

        private static final XrHandJointLocationsEXT ELEMENT_FACTORY = XrHandJointLocationsEXT.create(-1L);

        /**
         * Creates a new {@code XrHandJointLocationsEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHandJointLocationsEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrHandJointLocationsEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHandJointLocationsEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrHandJointLocationsEXT.nnext(address()); }
        /** @return the value of the {@code isActive} field. */
        @NativeType("XrBool32")
        public boolean isActive() { return XrHandJointLocationsEXT.nisActive(address()) != 0; }
        /** @return the value of the {@code jointCount} field. */
        @NativeType("uint32_t")
        public int jointCount() { return XrHandJointLocationsEXT.njointCount(address()); }
        /** @return a {@link XrHandJointLocationEXT.Buffer} view of the struct array pointed to by the {@code jointLocations} field. */
        @NativeType("XrHandJointLocationEXT *")
        public XrHandJointLocationEXT.Buffer jointLocations() { return XrHandJointLocationsEXT.njointLocations(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrHandJointLocationsEXT.Buffer type(@NativeType("XrStructureType") int value) { XrHandJointLocationsEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTHandTracking#XR_TYPE_HAND_JOINT_LOCATIONS_EXT TYPE_HAND_JOINT_LOCATIONS_EXT} value to the {@code type} field. */
        public XrHandJointLocationsEXT.Buffer type$Default() { return type(EXTHandTracking.XR_TYPE_HAND_JOINT_LOCATIONS_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrHandJointLocationsEXT.Buffer next(@NativeType("void *") long value) { XrHandJointLocationsEXT.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrHandJointVelocitiesEXT} value to the {@code next} chain. */
        public XrHandJointLocationsEXT.Buffer next(XrHandJointVelocitiesEXT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrHandTrackingAimStateFB} value to the {@code next} chain. */
        public XrHandJointLocationsEXT.Buffer next(XrHandTrackingAimStateFB value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrHandTrackingCapsulesStateFB} value to the {@code next} chain. */
        public XrHandJointLocationsEXT.Buffer next(XrHandTrackingCapsulesStateFB value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrHandTrackingDataSourceStateEXT} value to the {@code next} chain. */
        public XrHandJointLocationsEXT.Buffer next(XrHandTrackingDataSourceStateEXT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrHandTrackingScaleFB} value to the {@code next} chain. */
        public XrHandJointLocationsEXT.Buffer next(XrHandTrackingScaleFB value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@code isActive} field. */
        public XrHandJointLocationsEXT.Buffer isActive(@NativeType("XrBool32") boolean value) { XrHandJointLocationsEXT.nisActive(address(), value ? 1 : 0); return this; }
        /** Sets the address of the specified {@link XrHandJointLocationEXT.Buffer} to the {@code jointLocations} field. */
        public XrHandJointLocationsEXT.Buffer jointLocations(@NativeType("XrHandJointLocationEXT *") XrHandJointLocationEXT.Buffer value) { XrHandJointLocationsEXT.njointLocations(address(), value); return this; }

    }

}