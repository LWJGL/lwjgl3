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
 * struct XrSpatialCapabilityComponentTypesEXT {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t componentTypeCapacityInput;
 *     uint32_t componentTypeCountOutput;
 *     XrSpatialComponentTypeEXT * componentTypes;
 * }}</pre>
 */
public class XrSpatialCapabilityComponentTypesEXT extends Struct<XrSpatialCapabilityComponentTypesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        COMPONENTTYPECAPACITYINPUT,
        COMPONENTTYPECOUNTOUTPUT,
        COMPONENTTYPES;

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
        COMPONENTTYPECAPACITYINPUT = layout.offsetof(2);
        COMPONENTTYPECOUNTOUTPUT = layout.offsetof(3);
        COMPONENTTYPES = layout.offsetof(4);
    }

    protected XrSpatialCapabilityComponentTypesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialCapabilityComponentTypesEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialCapabilityComponentTypesEXT(address, container);
    }

    /**
     * Creates a {@code XrSpatialCapabilityComponentTypesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialCapabilityComponentTypesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code componentTypeCapacityInput} field. */
    @NativeType("uint32_t")
    public int componentTypeCapacityInput() { return ncomponentTypeCapacityInput(address()); }
    /** @return the value of the {@code componentTypeCountOutput} field. */
    @NativeType("uint32_t")
    public int componentTypeCountOutput() { return ncomponentTypeCountOutput(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code componentTypes} field. */
    @NativeType("XrSpatialComponentTypeEXT *")
    public @Nullable IntBuffer componentTypes() { return ncomponentTypes(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialCapabilityComponentTypesEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialEntity#XR_TYPE_SPATIAL_CAPABILITY_COMPONENT_TYPES_EXT TYPE_SPATIAL_CAPABILITY_COMPONENT_TYPES_EXT} value to the {@code type} field. */
    public XrSpatialCapabilityComponentTypesEXT type$Default() { return type(EXTSpatialEntity.XR_TYPE_SPATIAL_CAPABILITY_COMPONENT_TYPES_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialCapabilityComponentTypesEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code componentTypeCapacityInput} field. */
    public XrSpatialCapabilityComponentTypesEXT componentTypeCapacityInput(@NativeType("uint32_t") int value) { ncomponentTypeCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@code componentTypeCountOutput} field. */
    public XrSpatialCapabilityComponentTypesEXT componentTypeCountOutput(@NativeType("uint32_t") int value) { ncomponentTypeCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code componentTypes} field. */
    public XrSpatialCapabilityComponentTypesEXT componentTypes(@Nullable @NativeType("XrSpatialComponentTypeEXT *") IntBuffer value) { ncomponentTypes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialCapabilityComponentTypesEXT set(
        int type,
        long next,
        int componentTypeCapacityInput,
        int componentTypeCountOutput,
        @Nullable IntBuffer componentTypes
    ) {
        type(type);
        next(next);
        componentTypeCapacityInput(componentTypeCapacityInput);
        componentTypeCountOutput(componentTypeCountOutput);
        componentTypes(componentTypes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialCapabilityComponentTypesEXT set(XrSpatialCapabilityComponentTypesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialCapabilityComponentTypesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialCapabilityComponentTypesEXT malloc() {
        return new XrSpatialCapabilityComponentTypesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialCapabilityComponentTypesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialCapabilityComponentTypesEXT calloc() {
        return new XrSpatialCapabilityComponentTypesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialCapabilityComponentTypesEXT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialCapabilityComponentTypesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialCapabilityComponentTypesEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialCapabilityComponentTypesEXT} instance for the specified memory address. */
    public static XrSpatialCapabilityComponentTypesEXT create(long address) {
        return new XrSpatialCapabilityComponentTypesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialCapabilityComponentTypesEXT createSafe(long address) {
        return address == NULL ? null : new XrSpatialCapabilityComponentTypesEXT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialCapabilityComponentTypesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityComponentTypesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialCapabilityComponentTypesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityComponentTypesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialCapabilityComponentTypesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityComponentTypesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialCapabilityComponentTypesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityComponentTypesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialCapabilityComponentTypesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialCapabilityComponentTypesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialCapabilityComponentTypesEXT malloc(MemoryStack stack) {
        return new XrSpatialCapabilityComponentTypesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialCapabilityComponentTypesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialCapabilityComponentTypesEXT calloc(MemoryStack stack) {
        return new XrSpatialCapabilityComponentTypesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialCapabilityComponentTypesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityComponentTypesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialCapabilityComponentTypesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityComponentTypesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialCapabilityComponentTypesEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialCapabilityComponentTypesEXT.NEXT); }
    /** Unsafe version of {@link #componentTypeCapacityInput}. */
    public static int ncomponentTypeCapacityInput(long struct) { return memGetInt(struct + XrSpatialCapabilityComponentTypesEXT.COMPONENTTYPECAPACITYINPUT); }
    /** Unsafe version of {@link #componentTypeCountOutput}. */
    public static int ncomponentTypeCountOutput(long struct) { return memGetInt(struct + XrSpatialCapabilityComponentTypesEXT.COMPONENTTYPECOUNTOUTPUT); }
    /** Unsafe version of {@link #componentTypes() componentTypes}. */
    public static @Nullable IntBuffer ncomponentTypes(long struct) { return memIntBufferSafe(memGetAddress(struct + XrSpatialCapabilityComponentTypesEXT.COMPONENTTYPES), ncomponentTypeCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialCapabilityComponentTypesEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialCapabilityComponentTypesEXT.NEXT, value); }
    /** Sets the specified value to the {@code componentTypeCapacityInput} field of the specified {@code struct}. */
    public static void ncomponentTypeCapacityInput(long struct, int value) { memPutInt(struct + XrSpatialCapabilityComponentTypesEXT.COMPONENTTYPECAPACITYINPUT, value); }
    /** Unsafe version of {@link #componentTypeCountOutput(int) componentTypeCountOutput}. */
    public static void ncomponentTypeCountOutput(long struct, int value) { memPutInt(struct + XrSpatialCapabilityComponentTypesEXT.COMPONENTTYPECOUNTOUTPUT, value); }
    /** Unsafe version of {@link #componentTypes(IntBuffer) componentTypes}. */
    public static void ncomponentTypes(long struct, @Nullable IntBuffer value) { memPutAddress(struct + XrSpatialCapabilityComponentTypesEXT.COMPONENTTYPES, memAddressSafe(value)); if (value != null) { ncomponentTypeCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrSpatialCapabilityComponentTypesEXT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialCapabilityComponentTypesEXT, Buffer> implements NativeResource {

        private static final XrSpatialCapabilityComponentTypesEXT ELEMENT_FACTORY = XrSpatialCapabilityComponentTypesEXT.create(-1L);

        /**
         * Creates a new {@code XrSpatialCapabilityComponentTypesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialCapabilityComponentTypesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialCapabilityComponentTypesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialCapabilityComponentTypesEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSpatialCapabilityComponentTypesEXT.nnext(address()); }
        /** @return the value of the {@code componentTypeCapacityInput} field. */
        @NativeType("uint32_t")
        public int componentTypeCapacityInput() { return XrSpatialCapabilityComponentTypesEXT.ncomponentTypeCapacityInput(address()); }
        /** @return the value of the {@code componentTypeCountOutput} field. */
        @NativeType("uint32_t")
        public int componentTypeCountOutput() { return XrSpatialCapabilityComponentTypesEXT.ncomponentTypeCountOutput(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code componentTypes} field. */
        @NativeType("XrSpatialComponentTypeEXT *")
        public @Nullable IntBuffer componentTypes() { return XrSpatialCapabilityComponentTypesEXT.ncomponentTypes(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialCapabilityComponentTypesEXT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialCapabilityComponentTypesEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialEntity#XR_TYPE_SPATIAL_CAPABILITY_COMPONENT_TYPES_EXT TYPE_SPATIAL_CAPABILITY_COMPONENT_TYPES_EXT} value to the {@code type} field. */
        public XrSpatialCapabilityComponentTypesEXT.Buffer type$Default() { return type(EXTSpatialEntity.XR_TYPE_SPATIAL_CAPABILITY_COMPONENT_TYPES_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialCapabilityComponentTypesEXT.Buffer next(@NativeType("void *") long value) { XrSpatialCapabilityComponentTypesEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code componentTypeCapacityInput} field. */
        public XrSpatialCapabilityComponentTypesEXT.Buffer componentTypeCapacityInput(@NativeType("uint32_t") int value) { XrSpatialCapabilityComponentTypesEXT.ncomponentTypeCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@code componentTypeCountOutput} field. */
        public XrSpatialCapabilityComponentTypesEXT.Buffer componentTypeCountOutput(@NativeType("uint32_t") int value) { XrSpatialCapabilityComponentTypesEXT.ncomponentTypeCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code componentTypes} field. */
        public XrSpatialCapabilityComponentTypesEXT.Buffer componentTypes(@Nullable @NativeType("XrSpatialComponentTypeEXT *") IntBuffer value) { XrSpatialCapabilityComponentTypesEXT.ncomponentTypes(address(), value); return this; }

    }

}