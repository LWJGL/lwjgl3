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
 * struct XrSpatialCapabilityConfigurationDepthRaycastANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpatialCapabilityEXT capability;
 *     uint32_t enabledComponentCount;
 *     XrSpatialComponentTypeEXT const * enabledComponents;
 * }}</pre>
 */
public class XrSpatialCapabilityConfigurationDepthRaycastANDROID extends Struct<XrSpatialCapabilityConfigurationDepthRaycastANDROID> implements NativeResource {

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

    protected XrSpatialCapabilityConfigurationDepthRaycastANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialCapabilityConfigurationDepthRaycastANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialCapabilityConfigurationDepthRaycastANDROID(address, container);
    }

    /**
     * Creates a {@code XrSpatialCapabilityConfigurationDepthRaycastANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialCapabilityConfigurationDepthRaycastANDROID(ByteBuffer container) {
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
    public XrSpatialCapabilityConfigurationDepthRaycastANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDSpatialDiscoveryRaycast#XR_TYPE_SPATIAL_CAPABILITY_CONFIGURATION_DEPTH_RAYCAST_ANDROID TYPE_SPATIAL_CAPABILITY_CONFIGURATION_DEPTH_RAYCAST_ANDROID} value to the {@code type} field. */
    public XrSpatialCapabilityConfigurationDepthRaycastANDROID type$Default() { return type(ANDROIDSpatialDiscoveryRaycast.XR_TYPE_SPATIAL_CAPABILITY_CONFIGURATION_DEPTH_RAYCAST_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialCapabilityConfigurationDepthRaycastANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code capability} field. */
    public XrSpatialCapabilityConfigurationDepthRaycastANDROID capability(@NativeType("XrSpatialCapabilityEXT") int value) { ncapability(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code enabledComponents} field. */
    public XrSpatialCapabilityConfigurationDepthRaycastANDROID enabledComponents(@NativeType("XrSpatialComponentTypeEXT const *") IntBuffer value) { nenabledComponents(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialCapabilityConfigurationDepthRaycastANDROID set(
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
    public XrSpatialCapabilityConfigurationDepthRaycastANDROID set(XrSpatialCapabilityConfigurationDepthRaycastANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialCapabilityConfigurationDepthRaycastANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialCapabilityConfigurationDepthRaycastANDROID malloc() {
        return new XrSpatialCapabilityConfigurationDepthRaycastANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialCapabilityConfigurationDepthRaycastANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialCapabilityConfigurationDepthRaycastANDROID calloc() {
        return new XrSpatialCapabilityConfigurationDepthRaycastANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialCapabilityConfigurationDepthRaycastANDROID} instance allocated with {@link BufferUtils}. */
    public static XrSpatialCapabilityConfigurationDepthRaycastANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialCapabilityConfigurationDepthRaycastANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialCapabilityConfigurationDepthRaycastANDROID} instance for the specified memory address. */
    public static XrSpatialCapabilityConfigurationDepthRaycastANDROID create(long address) {
        return new XrSpatialCapabilityConfigurationDepthRaycastANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialCapabilityConfigurationDepthRaycastANDROID createSafe(long address) {
        return address == NULL ? null : new XrSpatialCapabilityConfigurationDepthRaycastANDROID(address, null);
    }

    /** Downcasts the specified {@code XrSpatialCapabilityConfigurationBaseHeaderEXT} instance to {@code XrSpatialCapabilityConfigurationDepthRaycastANDROID}. */
    public static XrSpatialCapabilityConfigurationDepthRaycastANDROID create(XrSpatialCapabilityConfigurationBaseHeaderEXT value) {
        return new XrSpatialCapabilityConfigurationDepthRaycastANDROID(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrSpatialCapabilityConfigurationDepthRaycastANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationDepthRaycastANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialCapabilityConfigurationDepthRaycastANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationDepthRaycastANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialCapabilityConfigurationDepthRaycastANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationDepthRaycastANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialCapabilityConfigurationDepthRaycastANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationDepthRaycastANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialCapabilityConfigurationDepthRaycastANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer} instance to {@code XrSpatialCapabilityConfigurationDepthRaycastANDROID.Buffer}. */
    public static XrSpatialCapabilityConfigurationDepthRaycastANDROID.Buffer create(XrSpatialCapabilityConfigurationBaseHeaderEXT.Buffer value) {
        return new XrSpatialCapabilityConfigurationDepthRaycastANDROID.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrSpatialCapabilityConfigurationDepthRaycastANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialCapabilityConfigurationDepthRaycastANDROID malloc(MemoryStack stack) {
        return new XrSpatialCapabilityConfigurationDepthRaycastANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialCapabilityConfigurationDepthRaycastANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialCapabilityConfigurationDepthRaycastANDROID calloc(MemoryStack stack) {
        return new XrSpatialCapabilityConfigurationDepthRaycastANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialCapabilityConfigurationDepthRaycastANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationDepthRaycastANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialCapabilityConfigurationDepthRaycastANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialCapabilityConfigurationDepthRaycastANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialCapabilityConfigurationDepthRaycastANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialCapabilityConfigurationDepthRaycastANDROID.NEXT); }
    /** Unsafe version of {@link #capability}. */
    public static int ncapability(long struct) { return memGetInt(struct + XrSpatialCapabilityConfigurationDepthRaycastANDROID.CAPABILITY); }
    /** Unsafe version of {@link #enabledComponentCount}. */
    public static int nenabledComponentCount(long struct) { return memGetInt(struct + XrSpatialCapabilityConfigurationDepthRaycastANDROID.ENABLEDCOMPONENTCOUNT); }
    /** Unsafe version of {@link #enabledComponents() enabledComponents}. */
    public static IntBuffer nenabledComponents(long struct) { return memIntBuffer(memGetAddress(struct + XrSpatialCapabilityConfigurationDepthRaycastANDROID.ENABLEDCOMPONENTS), nenabledComponentCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialCapabilityConfigurationDepthRaycastANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialCapabilityConfigurationDepthRaycastANDROID.NEXT, value); }
    /** Unsafe version of {@link #capability(int) capability}. */
    public static void ncapability(long struct, int value) { memPutInt(struct + XrSpatialCapabilityConfigurationDepthRaycastANDROID.CAPABILITY, value); }
    /** Sets the specified value to the {@code enabledComponentCount} field of the specified {@code struct}. */
    public static void nenabledComponentCount(long struct, int value) { memPutInt(struct + XrSpatialCapabilityConfigurationDepthRaycastANDROID.ENABLEDCOMPONENTCOUNT, value); }
    /** Unsafe version of {@link #enabledComponents(IntBuffer) enabledComponents}. */
    public static void nenabledComponents(long struct, IntBuffer value) { memPutAddress(struct + XrSpatialCapabilityConfigurationDepthRaycastANDROID.ENABLEDCOMPONENTS, memAddress(value)); nenabledComponentCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialCapabilityConfigurationDepthRaycastANDROID.ENABLEDCOMPONENTS));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialCapabilityConfigurationDepthRaycastANDROID} structs. */
    public static class Buffer extends StructBuffer<XrSpatialCapabilityConfigurationDepthRaycastANDROID, Buffer> implements NativeResource {

        private static final XrSpatialCapabilityConfigurationDepthRaycastANDROID ELEMENT_FACTORY = XrSpatialCapabilityConfigurationDepthRaycastANDROID.create(-1L);

        /**
         * Creates a new {@code XrSpatialCapabilityConfigurationDepthRaycastANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialCapabilityConfigurationDepthRaycastANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialCapabilityConfigurationDepthRaycastANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialCapabilityConfigurationDepthRaycastANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialCapabilityConfigurationDepthRaycastANDROID.nnext(address()); }
        /** @return the value of the {@code capability} field. */
        @NativeType("XrSpatialCapabilityEXT")
        public int capability() { return XrSpatialCapabilityConfigurationDepthRaycastANDROID.ncapability(address()); }
        /** @return the value of the {@code enabledComponentCount} field. */
        @NativeType("uint32_t")
        public int enabledComponentCount() { return XrSpatialCapabilityConfigurationDepthRaycastANDROID.nenabledComponentCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code enabledComponents} field. */
        @NativeType("XrSpatialComponentTypeEXT const *")
        public IntBuffer enabledComponents() { return XrSpatialCapabilityConfigurationDepthRaycastANDROID.nenabledComponents(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialCapabilityConfigurationDepthRaycastANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialCapabilityConfigurationDepthRaycastANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDSpatialDiscoveryRaycast#XR_TYPE_SPATIAL_CAPABILITY_CONFIGURATION_DEPTH_RAYCAST_ANDROID TYPE_SPATIAL_CAPABILITY_CONFIGURATION_DEPTH_RAYCAST_ANDROID} value to the {@code type} field. */
        public XrSpatialCapabilityConfigurationDepthRaycastANDROID.Buffer type$Default() { return type(ANDROIDSpatialDiscoveryRaycast.XR_TYPE_SPATIAL_CAPABILITY_CONFIGURATION_DEPTH_RAYCAST_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialCapabilityConfigurationDepthRaycastANDROID.Buffer next(@NativeType("void const *") long value) { XrSpatialCapabilityConfigurationDepthRaycastANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code capability} field. */
        public XrSpatialCapabilityConfigurationDepthRaycastANDROID.Buffer capability(@NativeType("XrSpatialCapabilityEXT") int value) { XrSpatialCapabilityConfigurationDepthRaycastANDROID.ncapability(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code enabledComponents} field. */
        public XrSpatialCapabilityConfigurationDepthRaycastANDROID.Buffer enabledComponents(@NativeType("XrSpatialComponentTypeEXT const *") IntBuffer value) { XrSpatialCapabilityConfigurationDepthRaycastANDROID.nenabledComponents(address(), value); return this; }

    }

}