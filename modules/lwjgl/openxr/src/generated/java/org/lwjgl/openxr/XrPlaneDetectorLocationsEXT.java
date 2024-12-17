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
 * struct XrPlaneDetectorLocationsEXT {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t planeLocationCapacityInput;
 *     uint32_t planeLocationCountOutput;
 *     {@link XrPlaneDetectorLocationEXT XrPlaneDetectorLocationEXT} * planeLocations;
 * }}</pre>
 */
public class XrPlaneDetectorLocationsEXT extends Struct<XrPlaneDetectorLocationsEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        PLANELOCATIONCAPACITYINPUT,
        PLANELOCATIONCOUNTOUTPUT,
        PLANELOCATIONS;

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
        PLANELOCATIONCAPACITYINPUT = layout.offsetof(2);
        PLANELOCATIONCOUNTOUTPUT = layout.offsetof(3);
        PLANELOCATIONS = layout.offsetof(4);
    }

    protected XrPlaneDetectorLocationsEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrPlaneDetectorLocationsEXT create(long address, @Nullable ByteBuffer container) {
        return new XrPlaneDetectorLocationsEXT(address, container);
    }

    /**
     * Creates a {@code XrPlaneDetectorLocationsEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrPlaneDetectorLocationsEXT(ByteBuffer container) {
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
    /** @return the value of the {@code planeLocationCapacityInput} field. */
    @NativeType("uint32_t")
    public int planeLocationCapacityInput() { return nplaneLocationCapacityInput(address()); }
    /** @return the value of the {@code planeLocationCountOutput} field. */
    @NativeType("uint32_t")
    public int planeLocationCountOutput() { return nplaneLocationCountOutput(address()); }
    /** @return a {@link XrPlaneDetectorLocationEXT.Buffer} view of the struct array pointed to by the {@code planeLocations} field. */
    @NativeType("XrPlaneDetectorLocationEXT *")
    public XrPlaneDetectorLocationEXT.@Nullable Buffer planeLocations() { return nplaneLocations(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrPlaneDetectorLocationsEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTPlaneDetection#XR_TYPE_PLANE_DETECTOR_LOCATIONS_EXT TYPE_PLANE_DETECTOR_LOCATIONS_EXT} value to the {@code type} field. */
    public XrPlaneDetectorLocationsEXT type$Default() { return type(EXTPlaneDetection.XR_TYPE_PLANE_DETECTOR_LOCATIONS_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrPlaneDetectorLocationsEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code planeLocationCapacityInput} field. */
    public XrPlaneDetectorLocationsEXT planeLocationCapacityInput(@NativeType("uint32_t") int value) { nplaneLocationCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@code planeLocationCountOutput} field. */
    public XrPlaneDetectorLocationsEXT planeLocationCountOutput(@NativeType("uint32_t") int value) { nplaneLocationCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link XrPlaneDetectorLocationEXT.Buffer} to the {@code planeLocations} field. */
    public XrPlaneDetectorLocationsEXT planeLocations(@NativeType("XrPlaneDetectorLocationEXT *") XrPlaneDetectorLocationEXT.@Nullable Buffer value) { nplaneLocations(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrPlaneDetectorLocationsEXT set(
        int type,
        long next,
        int planeLocationCapacityInput,
        int planeLocationCountOutput,
        XrPlaneDetectorLocationEXT.@Nullable Buffer planeLocations
    ) {
        type(type);
        next(next);
        planeLocationCapacityInput(planeLocationCapacityInput);
        planeLocationCountOutput(planeLocationCountOutput);
        planeLocations(planeLocations);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrPlaneDetectorLocationsEXT set(XrPlaneDetectorLocationsEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrPlaneDetectorLocationsEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrPlaneDetectorLocationsEXT malloc() {
        return new XrPlaneDetectorLocationsEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrPlaneDetectorLocationsEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrPlaneDetectorLocationsEXT calloc() {
        return new XrPlaneDetectorLocationsEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrPlaneDetectorLocationsEXT} instance allocated with {@link BufferUtils}. */
    public static XrPlaneDetectorLocationsEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrPlaneDetectorLocationsEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrPlaneDetectorLocationsEXT} instance for the specified memory address. */
    public static XrPlaneDetectorLocationsEXT create(long address) {
        return new XrPlaneDetectorLocationsEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrPlaneDetectorLocationsEXT createSafe(long address) {
        return address == NULL ? null : new XrPlaneDetectorLocationsEXT(address, null);
    }

    /**
     * Returns a new {@link XrPlaneDetectorLocationsEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorLocationsEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrPlaneDetectorLocationsEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorLocationsEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPlaneDetectorLocationsEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorLocationsEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrPlaneDetectorLocationsEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorLocationsEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrPlaneDetectorLocationsEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrPlaneDetectorLocationsEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPlaneDetectorLocationsEXT malloc(MemoryStack stack) {
        return new XrPlaneDetectorLocationsEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrPlaneDetectorLocationsEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPlaneDetectorLocationsEXT calloc(MemoryStack stack) {
        return new XrPlaneDetectorLocationsEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrPlaneDetectorLocationsEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorLocationsEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPlaneDetectorLocationsEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorLocationsEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrPlaneDetectorLocationsEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrPlaneDetectorLocationsEXT.NEXT); }
    /** Unsafe version of {@link #planeLocationCapacityInput}. */
    public static int nplaneLocationCapacityInput(long struct) { return memGetInt(struct + XrPlaneDetectorLocationsEXT.PLANELOCATIONCAPACITYINPUT); }
    /** Unsafe version of {@link #planeLocationCountOutput}. */
    public static int nplaneLocationCountOutput(long struct) { return memGetInt(struct + XrPlaneDetectorLocationsEXT.PLANELOCATIONCOUNTOUTPUT); }
    /** Unsafe version of {@link #planeLocations}. */
    public static XrPlaneDetectorLocationEXT.@Nullable Buffer nplaneLocations(long struct) { return XrPlaneDetectorLocationEXT.createSafe(memGetAddress(struct + XrPlaneDetectorLocationsEXT.PLANELOCATIONS), nplaneLocationCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrPlaneDetectorLocationsEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrPlaneDetectorLocationsEXT.NEXT, value); }
    /** Sets the specified value to the {@code planeLocationCapacityInput} field of the specified {@code struct}. */
    public static void nplaneLocationCapacityInput(long struct, int value) { memPutInt(struct + XrPlaneDetectorLocationsEXT.PLANELOCATIONCAPACITYINPUT, value); }
    /** Unsafe version of {@link #planeLocationCountOutput(int) planeLocationCountOutput}. */
    public static void nplaneLocationCountOutput(long struct, int value) { memPutInt(struct + XrPlaneDetectorLocationsEXT.PLANELOCATIONCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #planeLocations(XrPlaneDetectorLocationEXT.Buffer) planeLocations}. */
    public static void nplaneLocations(long struct, XrPlaneDetectorLocationEXT.@Nullable Buffer value) { memPutAddress(struct + XrPlaneDetectorLocationsEXT.PLANELOCATIONS, memAddressSafe(value)); if (value != null) { nplaneLocationCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrPlaneDetectorLocationsEXT} structs. */
    public static class Buffer extends StructBuffer<XrPlaneDetectorLocationsEXT, Buffer> implements NativeResource {

        private static final XrPlaneDetectorLocationsEXT ELEMENT_FACTORY = XrPlaneDetectorLocationsEXT.create(-1L);

        /**
         * Creates a new {@code XrPlaneDetectorLocationsEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrPlaneDetectorLocationsEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrPlaneDetectorLocationsEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrPlaneDetectorLocationsEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrPlaneDetectorLocationsEXT.nnext(address()); }
        /** @return the value of the {@code planeLocationCapacityInput} field. */
        @NativeType("uint32_t")
        public int planeLocationCapacityInput() { return XrPlaneDetectorLocationsEXT.nplaneLocationCapacityInput(address()); }
        /** @return the value of the {@code planeLocationCountOutput} field. */
        @NativeType("uint32_t")
        public int planeLocationCountOutput() { return XrPlaneDetectorLocationsEXT.nplaneLocationCountOutput(address()); }
        /** @return a {@link XrPlaneDetectorLocationEXT.Buffer} view of the struct array pointed to by the {@code planeLocations} field. */
        @NativeType("XrPlaneDetectorLocationEXT *")
        public XrPlaneDetectorLocationEXT.@Nullable Buffer planeLocations() { return XrPlaneDetectorLocationsEXT.nplaneLocations(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrPlaneDetectorLocationsEXT.Buffer type(@NativeType("XrStructureType") int value) { XrPlaneDetectorLocationsEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTPlaneDetection#XR_TYPE_PLANE_DETECTOR_LOCATIONS_EXT TYPE_PLANE_DETECTOR_LOCATIONS_EXT} value to the {@code type} field. */
        public XrPlaneDetectorLocationsEXT.Buffer type$Default() { return type(EXTPlaneDetection.XR_TYPE_PLANE_DETECTOR_LOCATIONS_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrPlaneDetectorLocationsEXT.Buffer next(@NativeType("void *") long value) { XrPlaneDetectorLocationsEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code planeLocationCapacityInput} field. */
        public XrPlaneDetectorLocationsEXT.Buffer planeLocationCapacityInput(@NativeType("uint32_t") int value) { XrPlaneDetectorLocationsEXT.nplaneLocationCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@code planeLocationCountOutput} field. */
        public XrPlaneDetectorLocationsEXT.Buffer planeLocationCountOutput(@NativeType("uint32_t") int value) { XrPlaneDetectorLocationsEXT.nplaneLocationCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link XrPlaneDetectorLocationEXT.Buffer} to the {@code planeLocations} field. */
        public XrPlaneDetectorLocationsEXT.Buffer planeLocations(@NativeType("XrPlaneDetectorLocationEXT *") XrPlaneDetectorLocationEXT.@Nullable Buffer value) { XrPlaneDetectorLocationsEXT.nplaneLocations(address(), value); return this; }

    }

}