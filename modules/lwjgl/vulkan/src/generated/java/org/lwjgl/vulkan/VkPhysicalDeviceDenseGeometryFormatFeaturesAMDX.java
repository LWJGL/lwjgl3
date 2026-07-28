/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 denseGeometryFormat;
 * }}</pre>
 */
public class VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX extends Struct<VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DENSEGEOMETRYFORMAT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DENSEGEOMETRYFORMAT = layout.offsetof(2);
    }

    protected VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code denseGeometryFormat} field. */
    @NativeType("VkBool32")
    public boolean denseGeometryFormat() { return ndenseGeometryFormat(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link AMDXDenseGeometryFormat#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DENSE_GEOMETRY_FORMAT_FEATURES_AMDX STRUCTURE_TYPE_PHYSICAL_DEVICE_DENSE_GEOMETRY_FORMAT_FEATURES_AMDX} value to the {@code sType} field. */
    public VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX sType$Default() { return sType(AMDXDenseGeometryFormat.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DENSE_GEOMETRY_FORMAT_FEATURES_AMDX); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code denseGeometryFormat} field. */
    public VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX denseGeometryFormat(@NativeType("VkBool32") boolean value) { ndenseGeometryFormat(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX set(
        int sType,
        long pNext,
        boolean denseGeometryFormat
    ) {
        sType(sType);
        pNext(pNext);
        denseGeometryFormat(denseGeometryFormat);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX set(VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX malloc() {
        return new VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX calloc() {
        return new VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX} instance for the specified memory address. */
    public static VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX create(long address) {
        return new VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.PNEXT); }
    /** Unsafe version of {@link #denseGeometryFormat}. */
    public static int ndenseGeometryFormat(long struct) { return memGetInt(struct + VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.DENSEGEOMETRYFORMAT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.PNEXT, value); }
    /** Unsafe version of {@link #denseGeometryFormat(boolean) denseGeometryFormat}. */
    public static void ndenseGeometryFormat(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.DENSEGEOMETRYFORMAT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX ELEMENT_FACTORY = VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.npNext(address()); }
        /** @return the value of the {@code denseGeometryFormat} field. */
        @NativeType("VkBool32")
        public boolean denseGeometryFormat() { return VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.ndenseGeometryFormat(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.nsType(address(), value); return this; }
        /** Sets the {@link AMDXDenseGeometryFormat#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DENSE_GEOMETRY_FORMAT_FEATURES_AMDX STRUCTURE_TYPE_PHYSICAL_DEVICE_DENSE_GEOMETRY_FORMAT_FEATURES_AMDX} value to the {@code sType} field. */
        public VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.Buffer sType$Default() { return sType(AMDXDenseGeometryFormat.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DENSE_GEOMETRY_FORMAT_FEATURES_AMDX); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code denseGeometryFormat} field. */
        public VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.Buffer denseGeometryFormat(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX.ndenseGeometryFormat(address(), value ? 1 : 0); return this; }

    }

}