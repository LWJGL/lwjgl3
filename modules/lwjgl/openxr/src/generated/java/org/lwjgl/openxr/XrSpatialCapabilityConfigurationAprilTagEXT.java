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
 * struct XrSpatialCapabilityConfigurationAprilTagEXT {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpatialCapabilityEXT capability;
 *     uint32_t enabledComponentCount;
 *     XrSpatialComponentTypeEXT const * enabledComponents;
 *     XrSpatialMarkerAprilTagDictEXT aprilDict;
 * }}</pre>
 */
public class XrSpatialCapabilityConfigurationAprilTagEXT extends Struct<XrSpatialCapabilityConfigurationAprilTagEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        CAPABILITY,
        ENABLEDCOMPONENTCOUNT,
        ENABLEDCOMPONENTS,
        APRILDICT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        CAPABILITY = layout.offsetof(2);
        ENABLEDCOMPONENTCOUNT = layout.offsetof(3);
        ENABLEDCOMPONENTS = layout.offsetof(4);
        APRILDICT = layout.offsetof(5);
    }

    protected XrSpatialCapabilityConfigurationAprilTagEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialCapabilityConfigurationAprilTagEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialCapabilityConfigurationAprilTagEXT(address, container);
    }

    /**
     * Creates a {@code XrSpatialCapabilityConfigurationAprilTagEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialCapabilityConfigurationAprilTagEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code capability} field. */
    @NativeType("XrSpatialCapabilityEXT")
    public int capability() { return ncapability(address()); }
    /** @return the value of the {@code enabledComponentCount} field. */
    @NativeType("uint32_t")
    public int enabledComponentCount() { return nenabledComponentCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code enabledComponents} field. */
    @NativeType("XrSpatialComponentTypeEXT const *")
    public IntBuffer enabledComponents() { return nenabledComponents(address()); }
    /** @return the value of the {@code aprilDict} field. */
    @NativeType("XrSpatialMarkerAprilTagDictEXT")
    public int aprilDict() { return naprilDict(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialCapabilityConfigurationAprilTagEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialMarkerTracking#XR_TYPE_SPATIAL_CAPABILITY_CONFIGURATION_APRIL_TAG_EXT TYPE_SPATIAL_CAPABILITY_CONFIGURATION_APRIL_TAG_EXT} value to the {@code type} field. */
    public XrSpatialCapabilityConfigurationAprilTagEXT type$Default() { return type(EXTSpatialMarkerTracking.XR_TYPE_SPATIAL_CAPABILITY_CONFIGURATION_APRIL_TAG_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialCapabilityConfigurationAprilTagEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrSpatialMarkerSizeEXT} value to the {@code next} chain. */
    public XrSpatialCapabilityConfigurationAprilTagEXT next(XrSpatialMarkerSizeEXT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSpatialMarkerStaticOptimizationEXT} value to the {@code next} chain. */
    public XrSpatialCapabilityConfigurationAprilTagEXT next(XrSpatialMarkerStaticOptimizationEXT value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@code capability} field. */
    public XrSpatialCapabilityConfigurationAprilTagEXT capability(@NativeType("XrSpatialCapabilityEXT") int value) { ncapability(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code enabledComponents} field. */
    public XrSpatialCapabilityConfigurationAprilTagEXT enabledComponents(@NativeType("XrSpatialComponentTypeEXT const *") IntBuffer value) { nenabledComponents(address(), value); return this; }
    /** Sets the specified value to the {@code aprilDict} field. */
    public XrSpatialCapabilityConfigurationAprilTagEXT aprilDict(@NativeType("XrSpatialMarkerAprilTagDictEXT") int value) { naprilDict(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialCapabilityConfigurationAprilTagEXT set(
        int type,
        long next,
        int capability,
        IntBuffer enabledComponents,
        int aprilDict
    ) {
        type(type);
        next(next);
        capability(capability);
        enabledComponents(enabledComponents);
        aprilDict(aprilDict);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialCapabilityConfigurationAprilTagEXT set(XrSpatialCapabilityConfigurationAprilTagEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialCapabilityConfigurationAprilTagEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialCapabilityConfigurationAprilTagEXT malloc() {
        return new XrSpatialCapabilityConfigurationAprilTagEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialCapabilityConfigurationAprilTagEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialCapabilityConfigurationAprilTagEXT calloc() {
        return new XrSpatialCapabilityConfigurationAprilTagEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialCapabilityConfigurationAprilTagEXT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialCapabilityConfigurationAprilTagEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialCapabilityConfigurationAprilTagEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialCapabilityConfigurationAprilTagEXT} instance for the specified memory address. */
    public static XrSpatialCapabilityConfigurationAprilTagEXT create(long address) {
        return new XrSpatialCapabilityConfigurationAprilTagEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialCapabilityConfigurationAprilTagEXT createSafe(long address) {
        return address == NULL ? null : new XrSpatialCapabilityConfigurationAprilTagEXT(address, null);
    }

    /** Downcasts the specified {@code XrSpatialCapabilityConfigurationBaseHeaderEXT} instance to {@code XrSpatialCapabilityConfigurationAprilTagEXT}. */
    public static XrSpatialCapabilityConfigurationAprilTagEXT create(XrSpatialCapabilityConfigurationBaseHeaderEXT value) {
        return new XrSpatialCapabilityConfigurationAprilTagEXT(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrSpatialCapabilityConfigurationAprilTagEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationAprilTagEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialCapabilityConfigurationAprilTagEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationAprilTagEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialCapabilityConfigurationAprilTagEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationAprilTagEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialCapabilityConfigurationAprilTagEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationAprilTagEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialCapabilityConfigurationAprilTagEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer} instance to {@code XrSpatialCapabilityConfigurationAprilTagEXT.Buffer}. */
    public static XrSpatialCapabilityConfigurationAprilTagEXT.Buffer create(XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer value) {
        return new XrSpatialCapabilityConfigurationAprilTagEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrSpatialCapabilityConfigurationAprilTagEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialCapabilityConfigurationAprilTagEXT malloc(MemoryStack stack) {
        return new XrSpatialCapabilityConfigurationAprilTagEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialCapabilityConfigurationAprilTagEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialCapabilityConfigurationAprilTagEXT calloc(MemoryStack stack) {
        return new XrSpatialCapabilityConfigurationAprilTagEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialCapabilityConfigurationAprilTagEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationAprilTagEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialCapabilityConfigurationAprilTagEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationAprilTagEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialCapabilityConfigurationAprilTagEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialCapabilityConfigurationAprilTagEXT.NEXT); }
    /** Unsafe version of {@link #capability}. */
    public static int ncapability(long struct) { return memGetInt(struct + XrSpatialCapabilityConfigurationAprilTagEXT.CAPABILITY); }
    /** Unsafe version of {@link #enabledComponentCount}. */
    public static int nenabledComponentCount(long struct) { return memGetInt(struct + XrSpatialCapabilityConfigurationAprilTagEXT.ENABLEDCOMPONENTCOUNT); }
    /** Unsafe version of {@link #enabledComponents() enabledComponents}. */
    public static IntBuffer nenabledComponents(long struct) { return memIntBuffer(memGetAddress(struct + XrSpatialCapabilityConfigurationAprilTagEXT.ENABLEDCOMPONENTS), nenabledComponentCount(struct)); }
    /** Unsafe version of {@link #aprilDict}. */
    public static int naprilDict(long struct) { return memGetInt(struct + XrSpatialCapabilityConfigurationAprilTagEXT.APRILDICT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialCapabilityConfigurationAprilTagEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialCapabilityConfigurationAprilTagEXT.NEXT, value); }
    /** Unsafe version of {@link #capability(int) capability}. */
    public static void ncapability(long struct, int value) { memPutInt(struct + XrSpatialCapabilityConfigurationAprilTagEXT.CAPABILITY, value); }
    /** Sets the specified value to the {@code enabledComponentCount} field of the specified {@code struct}. */
    public static void nenabledComponentCount(long struct, int value) { memPutInt(struct + XrSpatialCapabilityConfigurationAprilTagEXT.ENABLEDCOMPONENTCOUNT, value); }
    /** Unsafe version of {@link #enabledComponents(IntBuffer) enabledComponents}. */
    public static void nenabledComponents(long struct, IntBuffer value) { memPutAddress(struct + XrSpatialCapabilityConfigurationAprilTagEXT.ENABLEDCOMPONENTS, memAddress(value)); nenabledComponentCount(struct, value.remaining()); }
    /** Unsafe version of {@link #aprilDict(int) aprilDict}. */
    public static void naprilDict(long struct, int value) { memPutInt(struct + XrSpatialCapabilityConfigurationAprilTagEXT.APRILDICT, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialCapabilityConfigurationAprilTagEXT.ENABLEDCOMPONENTS));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialCapabilityConfigurationAprilTagEXT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialCapabilityConfigurationAprilTagEXT, Buffer> implements NativeResource {

        private static final XrSpatialCapabilityConfigurationAprilTagEXT ELEMENT_FACTORY = XrSpatialCapabilityConfigurationAprilTagEXT.create(-1L);

        /**
         * Creates a new {@code XrSpatialCapabilityConfigurationAprilTagEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialCapabilityConfigurationAprilTagEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialCapabilityConfigurationAprilTagEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialCapabilityConfigurationAprilTagEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialCapabilityConfigurationAprilTagEXT.nnext(address()); }
        /** @return the value of the {@code capability} field. */
        @NativeType("XrSpatialCapabilityEXT")
        public int capability() { return XrSpatialCapabilityConfigurationAprilTagEXT.ncapability(address()); }
        /** @return the value of the {@code enabledComponentCount} field. */
        @NativeType("uint32_t")
        public int enabledComponentCount() { return XrSpatialCapabilityConfigurationAprilTagEXT.nenabledComponentCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code enabledComponents} field. */
        @NativeType("XrSpatialComponentTypeEXT const *")
        public IntBuffer enabledComponents() { return XrSpatialCapabilityConfigurationAprilTagEXT.nenabledComponents(address()); }
        /** @return the value of the {@code aprilDict} field. */
        @NativeType("XrSpatialMarkerAprilTagDictEXT")
        public int aprilDict() { return XrSpatialCapabilityConfigurationAprilTagEXT.naprilDict(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialCapabilityConfigurationAprilTagEXT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialCapabilityConfigurationAprilTagEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialMarkerTracking#XR_TYPE_SPATIAL_CAPABILITY_CONFIGURATION_APRIL_TAG_EXT TYPE_SPATIAL_CAPABILITY_CONFIGURATION_APRIL_TAG_EXT} value to the {@code type} field. */
        public XrSpatialCapabilityConfigurationAprilTagEXT.Buffer type$Default() { return type(EXTSpatialMarkerTracking.XR_TYPE_SPATIAL_CAPABILITY_CONFIGURATION_APRIL_TAG_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialCapabilityConfigurationAprilTagEXT.Buffer next(@NativeType("void const *") long value) { XrSpatialCapabilityConfigurationAprilTagEXT.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrSpatialMarkerSizeEXT} value to the {@code next} chain. */
        public XrSpatialCapabilityConfigurationAprilTagEXT.Buffer next(XrSpatialMarkerSizeEXT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSpatialMarkerStaticOptimizationEXT} value to the {@code next} chain. */
        public XrSpatialCapabilityConfigurationAprilTagEXT.Buffer next(XrSpatialMarkerStaticOptimizationEXT value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@code capability} field. */
        public XrSpatialCapabilityConfigurationAprilTagEXT.Buffer capability(@NativeType("XrSpatialCapabilityEXT") int value) { XrSpatialCapabilityConfigurationAprilTagEXT.ncapability(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code enabledComponents} field. */
        public XrSpatialCapabilityConfigurationAprilTagEXT.Buffer enabledComponents(@NativeType("XrSpatialComponentTypeEXT const *") IntBuffer value) { XrSpatialCapabilityConfigurationAprilTagEXT.nenabledComponents(address(), value); return this; }
        /** Sets the specified value to the {@code aprilDict} field. */
        public XrSpatialCapabilityConfigurationAprilTagEXT.Buffer aprilDict(@NativeType("XrSpatialMarkerAprilTagDictEXT") int value) { XrSpatialCapabilityConfigurationAprilTagEXT.naprilDict(address(), value); return this; }

    }

}