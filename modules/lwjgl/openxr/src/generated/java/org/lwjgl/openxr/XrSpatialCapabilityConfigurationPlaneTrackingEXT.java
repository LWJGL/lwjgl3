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
 * struct XrSpatialCapabilityConfigurationPlaneTrackingEXT {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpatialCapabilityEXT capability;
 *     uint32_t enabledComponentCount;
 *     XrSpatialComponentTypeEXT const * enabledComponents;
 * }}</pre>
 */
public class XrSpatialCapabilityConfigurationPlaneTrackingEXT extends Struct<XrSpatialCapabilityConfigurationPlaneTrackingEXT> implements NativeResource {

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
        ENABLEDCOMPONENTS;

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
        CAPABILITY = layout.offsetof(2);
        ENABLEDCOMPONENTCOUNT = layout.offsetof(3);
        ENABLEDCOMPONENTS = layout.offsetof(4);
    }

    protected XrSpatialCapabilityConfigurationPlaneTrackingEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialCapabilityConfigurationPlaneTrackingEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialCapabilityConfigurationPlaneTrackingEXT(address, container);
    }

    /**
     * Creates a {@code XrSpatialCapabilityConfigurationPlaneTrackingEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialCapabilityConfigurationPlaneTrackingEXT(ByteBuffer container) {
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

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialCapabilityConfigurationPlaneTrackingEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialPlaneTracking#XR_TYPE_SPATIAL_CAPABILITY_CONFIGURATION_PLANE_TRACKING_EXT TYPE_SPATIAL_CAPABILITY_CONFIGURATION_PLANE_TRACKING_EXT} value to the {@code type} field. */
    public XrSpatialCapabilityConfigurationPlaneTrackingEXT type$Default() { return type(EXTSpatialPlaneTracking.XR_TYPE_SPATIAL_CAPABILITY_CONFIGURATION_PLANE_TRACKING_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialCapabilityConfigurationPlaneTrackingEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code capability} field. */
    public XrSpatialCapabilityConfigurationPlaneTrackingEXT capability(@NativeType("XrSpatialCapabilityEXT") int value) { ncapability(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code enabledComponents} field. */
    public XrSpatialCapabilityConfigurationPlaneTrackingEXT enabledComponents(@NativeType("XrSpatialComponentTypeEXT const *") IntBuffer value) { nenabledComponents(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialCapabilityConfigurationPlaneTrackingEXT set(
        int type,
        long next,
        int capability,
        IntBuffer enabledComponents
    ) {
        type(type);
        next(next);
        capability(capability);
        enabledComponents(enabledComponents);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialCapabilityConfigurationPlaneTrackingEXT set(XrSpatialCapabilityConfigurationPlaneTrackingEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialCapabilityConfigurationPlaneTrackingEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialCapabilityConfigurationPlaneTrackingEXT malloc() {
        return new XrSpatialCapabilityConfigurationPlaneTrackingEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialCapabilityConfigurationPlaneTrackingEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialCapabilityConfigurationPlaneTrackingEXT calloc() {
        return new XrSpatialCapabilityConfigurationPlaneTrackingEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialCapabilityConfigurationPlaneTrackingEXT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialCapabilityConfigurationPlaneTrackingEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialCapabilityConfigurationPlaneTrackingEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialCapabilityConfigurationPlaneTrackingEXT} instance for the specified memory address. */
    public static XrSpatialCapabilityConfigurationPlaneTrackingEXT create(long address) {
        return new XrSpatialCapabilityConfigurationPlaneTrackingEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialCapabilityConfigurationPlaneTrackingEXT createSafe(long address) {
        return address == NULL ? null : new XrSpatialCapabilityConfigurationPlaneTrackingEXT(address, null);
    }

    /** Downcasts the specified {@code XrSpatialCapabilityConfigurationBaseHeaderEXT} instance to {@code XrSpatialCapabilityConfigurationPlaneTrackingEXT}. */
    public static XrSpatialCapabilityConfigurationPlaneTrackingEXT create(XrSpatialCapabilityConfigurationBaseHeaderEXT value) {
        return new XrSpatialCapabilityConfigurationPlaneTrackingEXT(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrSpatialCapabilityConfigurationPlaneTrackingEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationPlaneTrackingEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialCapabilityConfigurationPlaneTrackingEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationPlaneTrackingEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialCapabilityConfigurationPlaneTrackingEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationPlaneTrackingEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialCapabilityConfigurationPlaneTrackingEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationPlaneTrackingEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialCapabilityConfigurationPlaneTrackingEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer} instance to {@code XrSpatialCapabilityConfigurationPlaneTrackingEXT.Buffer}. */
    public static XrSpatialCapabilityConfigurationPlaneTrackingEXT.Buffer create(XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer value) {
        return new XrSpatialCapabilityConfigurationPlaneTrackingEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrSpatialCapabilityConfigurationPlaneTrackingEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialCapabilityConfigurationPlaneTrackingEXT malloc(MemoryStack stack) {
        return new XrSpatialCapabilityConfigurationPlaneTrackingEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialCapabilityConfigurationPlaneTrackingEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialCapabilityConfigurationPlaneTrackingEXT calloc(MemoryStack stack) {
        return new XrSpatialCapabilityConfigurationPlaneTrackingEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialCapabilityConfigurationPlaneTrackingEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationPlaneTrackingEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialCapabilityConfigurationPlaneTrackingEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationPlaneTrackingEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialCapabilityConfigurationPlaneTrackingEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialCapabilityConfigurationPlaneTrackingEXT.NEXT); }
    /** Unsafe version of {@link #capability}. */
    public static int ncapability(long struct) { return memGetInt(struct + XrSpatialCapabilityConfigurationPlaneTrackingEXT.CAPABILITY); }
    /** Unsafe version of {@link #enabledComponentCount}. */
    public static int nenabledComponentCount(long struct) { return memGetInt(struct + XrSpatialCapabilityConfigurationPlaneTrackingEXT.ENABLEDCOMPONENTCOUNT); }
    /** Unsafe version of {@link #enabledComponents() enabledComponents}. */
    public static IntBuffer nenabledComponents(long struct) { return memIntBuffer(memGetAddress(struct + XrSpatialCapabilityConfigurationPlaneTrackingEXT.ENABLEDCOMPONENTS), nenabledComponentCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialCapabilityConfigurationPlaneTrackingEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialCapabilityConfigurationPlaneTrackingEXT.NEXT, value); }
    /** Unsafe version of {@link #capability(int) capability}. */
    public static void ncapability(long struct, int value) { memPutInt(struct + XrSpatialCapabilityConfigurationPlaneTrackingEXT.CAPABILITY, value); }
    /** Sets the specified value to the {@code enabledComponentCount} field of the specified {@code struct}. */
    public static void nenabledComponentCount(long struct, int value) { memPutInt(struct + XrSpatialCapabilityConfigurationPlaneTrackingEXT.ENABLEDCOMPONENTCOUNT, value); }
    /** Unsafe version of {@link #enabledComponents(IntBuffer) enabledComponents}. */
    public static void nenabledComponents(long struct, IntBuffer value) { memPutAddress(struct + XrSpatialCapabilityConfigurationPlaneTrackingEXT.ENABLEDCOMPONENTS, memAddress(value)); nenabledComponentCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialCapabilityConfigurationPlaneTrackingEXT.ENABLEDCOMPONENTS));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialCapabilityConfigurationPlaneTrackingEXT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialCapabilityConfigurationPlaneTrackingEXT, Buffer> implements NativeResource {

        private static final XrSpatialCapabilityConfigurationPlaneTrackingEXT ELEMENT_FACTORY = XrSpatialCapabilityConfigurationPlaneTrackingEXT.create(-1L);

        /**
         * Creates a new {@code XrSpatialCapabilityConfigurationPlaneTrackingEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialCapabilityConfigurationPlaneTrackingEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialCapabilityConfigurationPlaneTrackingEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialCapabilityConfigurationPlaneTrackingEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialCapabilityConfigurationPlaneTrackingEXT.nnext(address()); }
        /** @return the value of the {@code capability} field. */
        @NativeType("XrSpatialCapabilityEXT")
        public int capability() { return XrSpatialCapabilityConfigurationPlaneTrackingEXT.ncapability(address()); }
        /** @return the value of the {@code enabledComponentCount} field. */
        @NativeType("uint32_t")
        public int enabledComponentCount() { return XrSpatialCapabilityConfigurationPlaneTrackingEXT.nenabledComponentCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code enabledComponents} field. */
        @NativeType("XrSpatialComponentTypeEXT const *")
        public IntBuffer enabledComponents() { return XrSpatialCapabilityConfigurationPlaneTrackingEXT.nenabledComponents(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialCapabilityConfigurationPlaneTrackingEXT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialCapabilityConfigurationPlaneTrackingEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialPlaneTracking#XR_TYPE_SPATIAL_CAPABILITY_CONFIGURATION_PLANE_TRACKING_EXT TYPE_SPATIAL_CAPABILITY_CONFIGURATION_PLANE_TRACKING_EXT} value to the {@code type} field. */
        public XrSpatialCapabilityConfigurationPlaneTrackingEXT.Buffer type$Default() { return type(EXTSpatialPlaneTracking.XR_TYPE_SPATIAL_CAPABILITY_CONFIGURATION_PLANE_TRACKING_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialCapabilityConfigurationPlaneTrackingEXT.Buffer next(@NativeType("void const *") long value) { XrSpatialCapabilityConfigurationPlaneTrackingEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code capability} field. */
        public XrSpatialCapabilityConfigurationPlaneTrackingEXT.Buffer capability(@NativeType("XrSpatialCapabilityEXT") int value) { XrSpatialCapabilityConfigurationPlaneTrackingEXT.ncapability(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code enabledComponents} field. */
        public XrSpatialCapabilityConfigurationPlaneTrackingEXT.Buffer enabledComponents(@NativeType("XrSpatialComponentTypeEXT const *") IntBuffer value) { XrSpatialCapabilityConfigurationPlaneTrackingEXT.nenabledComponents(address(), value); return this; }

    }

}