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
 * struct XrSpatialCapabilityConfigurationArucoMarkerEXT {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpatialCapabilityEXT capability;
 *     uint32_t enabledComponentCount;
 *     XrSpatialComponentTypeEXT const * enabledComponents;
 *     XrSpatialMarkerArucoDictEXT arUcoDict;
 * }}</pre>
 */
public class XrSpatialCapabilityConfigurationArucoMarkerEXT extends Struct<XrSpatialCapabilityConfigurationArucoMarkerEXT> implements NativeResource {

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
        ARUCODICT;

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
        ARUCODICT = layout.offsetof(5);
    }

    protected XrSpatialCapabilityConfigurationArucoMarkerEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialCapabilityConfigurationArucoMarkerEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialCapabilityConfigurationArucoMarkerEXT(address, container);
    }

    /**
     * Creates a {@code XrSpatialCapabilityConfigurationArucoMarkerEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialCapabilityConfigurationArucoMarkerEXT(ByteBuffer container) {
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
    /** @return the value of the {@code arUcoDict} field. */
    @NativeType("XrSpatialMarkerArucoDictEXT")
    public int arUcoDict() { return narUcoDict(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialCapabilityConfigurationArucoMarkerEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialMarkerTracking#XR_TYPE_SPATIAL_CAPABILITY_CONFIGURATION_ARUCO_MARKER_EXT TYPE_SPATIAL_CAPABILITY_CONFIGURATION_ARUCO_MARKER_EXT} value to the {@code type} field. */
    public XrSpatialCapabilityConfigurationArucoMarkerEXT type$Default() { return type(EXTSpatialMarkerTracking.XR_TYPE_SPATIAL_CAPABILITY_CONFIGURATION_ARUCO_MARKER_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialCapabilityConfigurationArucoMarkerEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrSpatialMarkerSizeEXT} value to the {@code next} chain. */
    public XrSpatialCapabilityConfigurationArucoMarkerEXT next(XrSpatialMarkerSizeEXT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSpatialMarkerStaticOptimizationEXT} value to the {@code next} chain. */
    public XrSpatialCapabilityConfigurationArucoMarkerEXT next(XrSpatialMarkerStaticOptimizationEXT value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@code capability} field. */
    public XrSpatialCapabilityConfigurationArucoMarkerEXT capability(@NativeType("XrSpatialCapabilityEXT") int value) { ncapability(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code enabledComponents} field. */
    public XrSpatialCapabilityConfigurationArucoMarkerEXT enabledComponents(@NativeType("XrSpatialComponentTypeEXT const *") IntBuffer value) { nenabledComponents(address(), value); return this; }
    /** Sets the specified value to the {@code arUcoDict} field. */
    public XrSpatialCapabilityConfigurationArucoMarkerEXT arUcoDict(@NativeType("XrSpatialMarkerArucoDictEXT") int value) { narUcoDict(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialCapabilityConfigurationArucoMarkerEXT set(
        int type,
        long next,
        int capability,
        IntBuffer enabledComponents,
        int arUcoDict
    ) {
        type(type);
        next(next);
        capability(capability);
        enabledComponents(enabledComponents);
        arUcoDict(arUcoDict);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialCapabilityConfigurationArucoMarkerEXT set(XrSpatialCapabilityConfigurationArucoMarkerEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialCapabilityConfigurationArucoMarkerEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialCapabilityConfigurationArucoMarkerEXT malloc() {
        return new XrSpatialCapabilityConfigurationArucoMarkerEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialCapabilityConfigurationArucoMarkerEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialCapabilityConfigurationArucoMarkerEXT calloc() {
        return new XrSpatialCapabilityConfigurationArucoMarkerEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialCapabilityConfigurationArucoMarkerEXT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialCapabilityConfigurationArucoMarkerEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialCapabilityConfigurationArucoMarkerEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialCapabilityConfigurationArucoMarkerEXT} instance for the specified memory address. */
    public static XrSpatialCapabilityConfigurationArucoMarkerEXT create(long address) {
        return new XrSpatialCapabilityConfigurationArucoMarkerEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialCapabilityConfigurationArucoMarkerEXT createSafe(long address) {
        return address == NULL ? null : new XrSpatialCapabilityConfigurationArucoMarkerEXT(address, null);
    }

    /** Downcasts the specified {@code XrSpatialCapabilityConfigurationBaseHeaderEXT} instance to {@code XrSpatialCapabilityConfigurationArucoMarkerEXT}. */
    public static XrSpatialCapabilityConfigurationArucoMarkerEXT create(XrSpatialCapabilityConfigurationBaseHeaderEXT value) {
        return new XrSpatialCapabilityConfigurationArucoMarkerEXT(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrSpatialCapabilityConfigurationArucoMarkerEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationArucoMarkerEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialCapabilityConfigurationArucoMarkerEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationArucoMarkerEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialCapabilityConfigurationArucoMarkerEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationArucoMarkerEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialCapabilityConfigurationArucoMarkerEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationArucoMarkerEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialCapabilityConfigurationArucoMarkerEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer} instance to {@code XrSpatialCapabilityConfigurationArucoMarkerEXT.Buffer}. */
    public static XrSpatialCapabilityConfigurationArucoMarkerEXT.Buffer create(XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer value) {
        return new XrSpatialCapabilityConfigurationArucoMarkerEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrSpatialCapabilityConfigurationArucoMarkerEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialCapabilityConfigurationArucoMarkerEXT malloc(MemoryStack stack) {
        return new XrSpatialCapabilityConfigurationArucoMarkerEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialCapabilityConfigurationArucoMarkerEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialCapabilityConfigurationArucoMarkerEXT calloc(MemoryStack stack) {
        return new XrSpatialCapabilityConfigurationArucoMarkerEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialCapabilityConfigurationArucoMarkerEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationArucoMarkerEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialCapabilityConfigurationArucoMarkerEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationArucoMarkerEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialCapabilityConfigurationArucoMarkerEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialCapabilityConfigurationArucoMarkerEXT.NEXT); }
    /** Unsafe version of {@link #capability}. */
    public static int ncapability(long struct) { return memGetInt(struct + XrSpatialCapabilityConfigurationArucoMarkerEXT.CAPABILITY); }
    /** Unsafe version of {@link #enabledComponentCount}. */
    public static int nenabledComponentCount(long struct) { return memGetInt(struct + XrSpatialCapabilityConfigurationArucoMarkerEXT.ENABLEDCOMPONENTCOUNT); }
    /** Unsafe version of {@link #enabledComponents() enabledComponents}. */
    public static IntBuffer nenabledComponents(long struct) { return memIntBuffer(memGetAddress(struct + XrSpatialCapabilityConfigurationArucoMarkerEXT.ENABLEDCOMPONENTS), nenabledComponentCount(struct)); }
    /** Unsafe version of {@link #arUcoDict}. */
    public static int narUcoDict(long struct) { return memGetInt(struct + XrSpatialCapabilityConfigurationArucoMarkerEXT.ARUCODICT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialCapabilityConfigurationArucoMarkerEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialCapabilityConfigurationArucoMarkerEXT.NEXT, value); }
    /** Unsafe version of {@link #capability(int) capability}. */
    public static void ncapability(long struct, int value) { memPutInt(struct + XrSpatialCapabilityConfigurationArucoMarkerEXT.CAPABILITY, value); }
    /** Sets the specified value to the {@code enabledComponentCount} field of the specified {@code struct}. */
    public static void nenabledComponentCount(long struct, int value) { memPutInt(struct + XrSpatialCapabilityConfigurationArucoMarkerEXT.ENABLEDCOMPONENTCOUNT, value); }
    /** Unsafe version of {@link #enabledComponents(IntBuffer) enabledComponents}. */
    public static void nenabledComponents(long struct, IntBuffer value) { memPutAddress(struct + XrSpatialCapabilityConfigurationArucoMarkerEXT.ENABLEDCOMPONENTS, memAddress(value)); nenabledComponentCount(struct, value.remaining()); }
    /** Unsafe version of {@link #arUcoDict(int) arUcoDict}. */
    public static void narUcoDict(long struct, int value) { memPutInt(struct + XrSpatialCapabilityConfigurationArucoMarkerEXT.ARUCODICT, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialCapabilityConfigurationArucoMarkerEXT.ENABLEDCOMPONENTS));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialCapabilityConfigurationArucoMarkerEXT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialCapabilityConfigurationArucoMarkerEXT, Buffer> implements NativeResource {

        private static final XrSpatialCapabilityConfigurationArucoMarkerEXT ELEMENT_FACTORY = XrSpatialCapabilityConfigurationArucoMarkerEXT.create(-1L);

        /**
         * Creates a new {@code XrSpatialCapabilityConfigurationArucoMarkerEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialCapabilityConfigurationArucoMarkerEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialCapabilityConfigurationArucoMarkerEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialCapabilityConfigurationArucoMarkerEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialCapabilityConfigurationArucoMarkerEXT.nnext(address()); }
        /** @return the value of the {@code capability} field. */
        @NativeType("XrSpatialCapabilityEXT")
        public int capability() { return XrSpatialCapabilityConfigurationArucoMarkerEXT.ncapability(address()); }
        /** @return the value of the {@code enabledComponentCount} field. */
        @NativeType("uint32_t")
        public int enabledComponentCount() { return XrSpatialCapabilityConfigurationArucoMarkerEXT.nenabledComponentCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code enabledComponents} field. */
        @NativeType("XrSpatialComponentTypeEXT const *")
        public IntBuffer enabledComponents() { return XrSpatialCapabilityConfigurationArucoMarkerEXT.nenabledComponents(address()); }
        /** @return the value of the {@code arUcoDict} field. */
        @NativeType("XrSpatialMarkerArucoDictEXT")
        public int arUcoDict() { return XrSpatialCapabilityConfigurationArucoMarkerEXT.narUcoDict(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialCapabilityConfigurationArucoMarkerEXT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialCapabilityConfigurationArucoMarkerEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialMarkerTracking#XR_TYPE_SPATIAL_CAPABILITY_CONFIGURATION_ARUCO_MARKER_EXT TYPE_SPATIAL_CAPABILITY_CONFIGURATION_ARUCO_MARKER_EXT} value to the {@code type} field. */
        public XrSpatialCapabilityConfigurationArucoMarkerEXT.Buffer type$Default() { return type(EXTSpatialMarkerTracking.XR_TYPE_SPATIAL_CAPABILITY_CONFIGURATION_ARUCO_MARKER_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialCapabilityConfigurationArucoMarkerEXT.Buffer next(@NativeType("void const *") long value) { XrSpatialCapabilityConfigurationArucoMarkerEXT.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrSpatialMarkerSizeEXT} value to the {@code next} chain. */
        public XrSpatialCapabilityConfigurationArucoMarkerEXT.Buffer next(XrSpatialMarkerSizeEXT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSpatialMarkerStaticOptimizationEXT} value to the {@code next} chain. */
        public XrSpatialCapabilityConfigurationArucoMarkerEXT.Buffer next(XrSpatialMarkerStaticOptimizationEXT value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@code capability} field. */
        public XrSpatialCapabilityConfigurationArucoMarkerEXT.Buffer capability(@NativeType("XrSpatialCapabilityEXT") int value) { XrSpatialCapabilityConfigurationArucoMarkerEXT.ncapability(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code enabledComponents} field. */
        public XrSpatialCapabilityConfigurationArucoMarkerEXT.Buffer enabledComponents(@NativeType("XrSpatialComponentTypeEXT const *") IntBuffer value) { XrSpatialCapabilityConfigurationArucoMarkerEXT.nenabledComponents(address(), value); return this; }
        /** Sets the specified value to the {@code arUcoDict} field. */
        public XrSpatialCapabilityConfigurationArucoMarkerEXT.Buffer arUcoDict(@NativeType("XrSpatialMarkerArucoDictEXT") int value) { XrSpatialCapabilityConfigurationArucoMarkerEXT.narUcoDict(address(), value); return this; }

    }

}