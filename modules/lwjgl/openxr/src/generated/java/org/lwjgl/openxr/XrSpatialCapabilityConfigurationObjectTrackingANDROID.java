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
 * struct XrSpatialCapabilityConfigurationObjectTrackingANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpatialCapabilityEXT capability;
 *     uint32_t enabledComponentCount;
 *     XrSpatialComponentTypeEXT const * enabledComponents;
 *     uint32_t activeSemanticLabelCount;
 *     XrSpatialObjectSemanticLabelANDROID const * activeSemanticLabels;
 * }}</pre>
 */
public class XrSpatialCapabilityConfigurationObjectTrackingANDROID extends Struct<XrSpatialCapabilityConfigurationObjectTrackingANDROID> implements NativeResource {

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
        ACTIVESEMANTICLABELCOUNT,
        ACTIVESEMANTICLABELS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
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
        ACTIVESEMANTICLABELCOUNT = layout.offsetof(5);
        ACTIVESEMANTICLABELS = layout.offsetof(6);
    }

    protected XrSpatialCapabilityConfigurationObjectTrackingANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialCapabilityConfigurationObjectTrackingANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialCapabilityConfigurationObjectTrackingANDROID(address, container);
    }

    /**
     * Creates a {@code XrSpatialCapabilityConfigurationObjectTrackingANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialCapabilityConfigurationObjectTrackingANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code activeSemanticLabelCount} field. */
    @NativeType("uint32_t")
    public int activeSemanticLabelCount() { return nactiveSemanticLabelCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code activeSemanticLabels} field. */
    @NativeType("XrSpatialObjectSemanticLabelANDROID const *")
    public IntBuffer activeSemanticLabels() { return nactiveSemanticLabels(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialCapabilityConfigurationObjectTrackingANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDSpatialObjectTracking#XR_TYPE_SPATIAL_CAPABILITY_CONFIGURATION_OBJECT_TRACKING_ANDROID TYPE_SPATIAL_CAPABILITY_CONFIGURATION_OBJECT_TRACKING_ANDROID} value to the {@code type} field. */
    public XrSpatialCapabilityConfigurationObjectTrackingANDROID type$Default() { return type(ANDROIDSpatialObjectTracking.XR_TYPE_SPATIAL_CAPABILITY_CONFIGURATION_OBJECT_TRACKING_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialCapabilityConfigurationObjectTrackingANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code capability} field. */
    public XrSpatialCapabilityConfigurationObjectTrackingANDROID capability(@NativeType("XrSpatialCapabilityEXT") int value) { ncapability(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code enabledComponents} field. */
    public XrSpatialCapabilityConfigurationObjectTrackingANDROID enabledComponents(@NativeType("XrSpatialComponentTypeEXT const *") IntBuffer value) { nenabledComponents(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code activeSemanticLabels} field. */
    public XrSpatialCapabilityConfigurationObjectTrackingANDROID activeSemanticLabels(@NativeType("XrSpatialObjectSemanticLabelANDROID const *") IntBuffer value) { nactiveSemanticLabels(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialCapabilityConfigurationObjectTrackingANDROID set(
        int type,
        long next,
        int capability,
        IntBuffer enabledComponents,
        IntBuffer activeSemanticLabels
    ) {
        type(type);
        next(next);
        capability(capability);
        enabledComponents(enabledComponents);
        activeSemanticLabels(activeSemanticLabels);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialCapabilityConfigurationObjectTrackingANDROID set(XrSpatialCapabilityConfigurationObjectTrackingANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialCapabilityConfigurationObjectTrackingANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialCapabilityConfigurationObjectTrackingANDROID malloc() {
        return new XrSpatialCapabilityConfigurationObjectTrackingANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialCapabilityConfigurationObjectTrackingANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialCapabilityConfigurationObjectTrackingANDROID calloc() {
        return new XrSpatialCapabilityConfigurationObjectTrackingANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialCapabilityConfigurationObjectTrackingANDROID} instance allocated with {@link BufferUtils}. */
    public static XrSpatialCapabilityConfigurationObjectTrackingANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialCapabilityConfigurationObjectTrackingANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialCapabilityConfigurationObjectTrackingANDROID} instance for the specified memory address. */
    public static XrSpatialCapabilityConfigurationObjectTrackingANDROID create(long address) {
        return new XrSpatialCapabilityConfigurationObjectTrackingANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialCapabilityConfigurationObjectTrackingANDROID createSafe(long address) {
        return address == NULL ? null : new XrSpatialCapabilityConfigurationObjectTrackingANDROID(address, null);
    }

    /** Downcasts the specified {@code XrSpatialCapabilityConfigurationBaseHeaderEXT} instance to {@code XrSpatialCapabilityConfigurationObjectTrackingANDROID}. */
    public static XrSpatialCapabilityConfigurationObjectTrackingANDROID create(XrSpatialCapabilityConfigurationBaseHeaderEXT value) {
        return new XrSpatialCapabilityConfigurationObjectTrackingANDROID(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrSpatialCapabilityConfigurationObjectTrackingANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationObjectTrackingANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialCapabilityConfigurationObjectTrackingANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationObjectTrackingANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialCapabilityConfigurationObjectTrackingANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationObjectTrackingANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialCapabilityConfigurationObjectTrackingANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationObjectTrackingANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialCapabilityConfigurationObjectTrackingANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer} instance to {@code XrSpatialCapabilityConfigurationObjectTrackingANDROID.Buffer}. */
    public static XrSpatialCapabilityConfigurationObjectTrackingANDROID.Buffer create(XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer value) {
        return new XrSpatialCapabilityConfigurationObjectTrackingANDROID.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrSpatialCapabilityConfigurationObjectTrackingANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialCapabilityConfigurationObjectTrackingANDROID malloc(MemoryStack stack) {
        return new XrSpatialCapabilityConfigurationObjectTrackingANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialCapabilityConfigurationObjectTrackingANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialCapabilityConfigurationObjectTrackingANDROID calloc(MemoryStack stack) {
        return new XrSpatialCapabilityConfigurationObjectTrackingANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialCapabilityConfigurationObjectTrackingANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationObjectTrackingANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialCapabilityConfigurationObjectTrackingANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationObjectTrackingANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialCapabilityConfigurationObjectTrackingANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialCapabilityConfigurationObjectTrackingANDROID.NEXT); }
    /** Unsafe version of {@link #capability}. */
    public static int ncapability(long struct) { return memGetInt(struct + XrSpatialCapabilityConfigurationObjectTrackingANDROID.CAPABILITY); }
    /** Unsafe version of {@link #enabledComponentCount}. */
    public static int nenabledComponentCount(long struct) { return memGetInt(struct + XrSpatialCapabilityConfigurationObjectTrackingANDROID.ENABLEDCOMPONENTCOUNT); }
    /** Unsafe version of {@link #enabledComponents() enabledComponents}. */
    public static IntBuffer nenabledComponents(long struct) { return memIntBuffer(memGetAddress(struct + XrSpatialCapabilityConfigurationObjectTrackingANDROID.ENABLEDCOMPONENTS), nenabledComponentCount(struct)); }
    /** Unsafe version of {@link #activeSemanticLabelCount}. */
    public static int nactiveSemanticLabelCount(long struct) { return memGetInt(struct + XrSpatialCapabilityConfigurationObjectTrackingANDROID.ACTIVESEMANTICLABELCOUNT); }
    /** Unsafe version of {@link #activeSemanticLabels() activeSemanticLabels}. */
    public static IntBuffer nactiveSemanticLabels(long struct) { return memIntBuffer(memGetAddress(struct + XrSpatialCapabilityConfigurationObjectTrackingANDROID.ACTIVESEMANTICLABELS), nactiveSemanticLabelCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialCapabilityConfigurationObjectTrackingANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialCapabilityConfigurationObjectTrackingANDROID.NEXT, value); }
    /** Unsafe version of {@link #capability(int) capability}. */
    public static void ncapability(long struct, int value) { memPutInt(struct + XrSpatialCapabilityConfigurationObjectTrackingANDROID.CAPABILITY, value); }
    /** Sets the specified value to the {@code enabledComponentCount} field of the specified {@code struct}. */
    public static void nenabledComponentCount(long struct, int value) { memPutInt(struct + XrSpatialCapabilityConfigurationObjectTrackingANDROID.ENABLEDCOMPONENTCOUNT, value); }
    /** Unsafe version of {@link #enabledComponents(IntBuffer) enabledComponents}. */
    public static void nenabledComponents(long struct, IntBuffer value) { memPutAddress(struct + XrSpatialCapabilityConfigurationObjectTrackingANDROID.ENABLEDCOMPONENTS, memAddress(value)); nenabledComponentCount(struct, value.remaining()); }
    /** Sets the specified value to the {@code activeSemanticLabelCount} field of the specified {@code struct}. */
    public static void nactiveSemanticLabelCount(long struct, int value) { memPutInt(struct + XrSpatialCapabilityConfigurationObjectTrackingANDROID.ACTIVESEMANTICLABELCOUNT, value); }
    /** Unsafe version of {@link #activeSemanticLabels(IntBuffer) activeSemanticLabels}. */
    public static void nactiveSemanticLabels(long struct, IntBuffer value) { memPutAddress(struct + XrSpatialCapabilityConfigurationObjectTrackingANDROID.ACTIVESEMANTICLABELS, memAddress(value)); nactiveSemanticLabelCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialCapabilityConfigurationObjectTrackingANDROID.ENABLEDCOMPONENTS));
        check(memGetAddress(struct + XrSpatialCapabilityConfigurationObjectTrackingANDROID.ACTIVESEMANTICLABELS));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialCapabilityConfigurationObjectTrackingANDROID} structs. */
    public static class Buffer extends StructBuffer<XrSpatialCapabilityConfigurationObjectTrackingANDROID, Buffer> implements NativeResource {

        private static final XrSpatialCapabilityConfigurationObjectTrackingANDROID ELEMENT_FACTORY = XrSpatialCapabilityConfigurationObjectTrackingANDROID.create(-1L);

        /**
         * Creates a new {@code XrSpatialCapabilityConfigurationObjectTrackingANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialCapabilityConfigurationObjectTrackingANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialCapabilityConfigurationObjectTrackingANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialCapabilityConfigurationObjectTrackingANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialCapabilityConfigurationObjectTrackingANDROID.nnext(address()); }
        /** @return the value of the {@code capability} field. */
        @NativeType("XrSpatialCapabilityEXT")
        public int capability() { return XrSpatialCapabilityConfigurationObjectTrackingANDROID.ncapability(address()); }
        /** @return the value of the {@code enabledComponentCount} field. */
        @NativeType("uint32_t")
        public int enabledComponentCount() { return XrSpatialCapabilityConfigurationObjectTrackingANDROID.nenabledComponentCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code enabledComponents} field. */
        @NativeType("XrSpatialComponentTypeEXT const *")
        public IntBuffer enabledComponents() { return XrSpatialCapabilityConfigurationObjectTrackingANDROID.nenabledComponents(address()); }
        /** @return the value of the {@code activeSemanticLabelCount} field. */
        @NativeType("uint32_t")
        public int activeSemanticLabelCount() { return XrSpatialCapabilityConfigurationObjectTrackingANDROID.nactiveSemanticLabelCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code activeSemanticLabels} field. */
        @NativeType("XrSpatialObjectSemanticLabelANDROID const *")
        public IntBuffer activeSemanticLabels() { return XrSpatialCapabilityConfigurationObjectTrackingANDROID.nactiveSemanticLabels(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialCapabilityConfigurationObjectTrackingANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialCapabilityConfigurationObjectTrackingANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDSpatialObjectTracking#XR_TYPE_SPATIAL_CAPABILITY_CONFIGURATION_OBJECT_TRACKING_ANDROID TYPE_SPATIAL_CAPABILITY_CONFIGURATION_OBJECT_TRACKING_ANDROID} value to the {@code type} field. */
        public XrSpatialCapabilityConfigurationObjectTrackingANDROID.Buffer type$Default() { return type(ANDROIDSpatialObjectTracking.XR_TYPE_SPATIAL_CAPABILITY_CONFIGURATION_OBJECT_TRACKING_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialCapabilityConfigurationObjectTrackingANDROID.Buffer next(@NativeType("void const *") long value) { XrSpatialCapabilityConfigurationObjectTrackingANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code capability} field. */
        public XrSpatialCapabilityConfigurationObjectTrackingANDROID.Buffer capability(@NativeType("XrSpatialCapabilityEXT") int value) { XrSpatialCapabilityConfigurationObjectTrackingANDROID.ncapability(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code enabledComponents} field. */
        public XrSpatialCapabilityConfigurationObjectTrackingANDROID.Buffer enabledComponents(@NativeType("XrSpatialComponentTypeEXT const *") IntBuffer value) { XrSpatialCapabilityConfigurationObjectTrackingANDROID.nenabledComponents(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code activeSemanticLabels} field. */
        public XrSpatialCapabilityConfigurationObjectTrackingANDROID.Buffer activeSemanticLabels(@NativeType("XrSpatialObjectSemanticLabelANDROID const *") IntBuffer value) { XrSpatialCapabilityConfigurationObjectTrackingANDROID.nactiveSemanticLabels(address(), value); return this; }

    }

}