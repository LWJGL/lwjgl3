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
 * struct VkPhysicalDeviceMaintenance5Properties {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 earlyFragmentMultisampleCoverageAfterSampleCounting;
 *     VkBool32 earlyFragmentSampleMaskTestBeforeSampleCounting;
 *     VkBool32 depthStencilSwizzleOneSupport;
 *     VkBool32 polygonModePointSize;
 *     VkBool32 nonStrictSinglePixelWideLinesUseParallelogram;
 *     VkBool32 nonStrictWideLinesUseParallelogram;
 * }}</pre>
 */
public class VkPhysicalDeviceMaintenance5Properties extends Struct<VkPhysicalDeviceMaintenance5Properties> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        EARLYFRAGMENTMULTISAMPLECOVERAGEAFTERSAMPLECOUNTING,
        EARLYFRAGMENTSAMPLEMASKTESTBEFORESAMPLECOUNTING,
        DEPTHSTENCILSWIZZLEONESUPPORT,
        POLYGONMODEPOINTSIZE,
        NONSTRICTSINGLEPIXELWIDELINESUSEPARALLELOGRAM,
        NONSTRICTWIDELINESUSEPARALLELOGRAM;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        EARLYFRAGMENTMULTISAMPLECOVERAGEAFTERSAMPLECOUNTING = layout.offsetof(2);
        EARLYFRAGMENTSAMPLEMASKTESTBEFORESAMPLECOUNTING = layout.offsetof(3);
        DEPTHSTENCILSWIZZLEONESUPPORT = layout.offsetof(4);
        POLYGONMODEPOINTSIZE = layout.offsetof(5);
        NONSTRICTSINGLEPIXELWIDELINESUSEPARALLELOGRAM = layout.offsetof(6);
        NONSTRICTWIDELINESUSEPARALLELOGRAM = layout.offsetof(7);
    }

    protected VkPhysicalDeviceMaintenance5Properties(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceMaintenance5Properties create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceMaintenance5Properties(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMaintenance5Properties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMaintenance5Properties(ByteBuffer container) {
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
    /** @return the value of the {@code earlyFragmentMultisampleCoverageAfterSampleCounting} field. */
    @NativeType("VkBool32")
    public boolean earlyFragmentMultisampleCoverageAfterSampleCounting() { return nearlyFragmentMultisampleCoverageAfterSampleCounting(address()) != 0; }
    /** @return the value of the {@code earlyFragmentSampleMaskTestBeforeSampleCounting} field. */
    @NativeType("VkBool32")
    public boolean earlyFragmentSampleMaskTestBeforeSampleCounting() { return nearlyFragmentSampleMaskTestBeforeSampleCounting(address()) != 0; }
    /** @return the value of the {@code depthStencilSwizzleOneSupport} field. */
    @NativeType("VkBool32")
    public boolean depthStencilSwizzleOneSupport() { return ndepthStencilSwizzleOneSupport(address()) != 0; }
    /** @return the value of the {@code polygonModePointSize} field. */
    @NativeType("VkBool32")
    public boolean polygonModePointSize() { return npolygonModePointSize(address()) != 0; }
    /** @return the value of the {@code nonStrictSinglePixelWideLinesUseParallelogram} field. */
    @NativeType("VkBool32")
    public boolean nonStrictSinglePixelWideLinesUseParallelogram() { return nnonStrictSinglePixelWideLinesUseParallelogram(address()) != 0; }
    /** @return the value of the {@code nonStrictWideLinesUseParallelogram} field. */
    @NativeType("VkBool32")
    public boolean nonStrictWideLinesUseParallelogram() { return nnonStrictWideLinesUseParallelogram(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceMaintenance5Properties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES} value to the {@code sType} field. */
    public VkPhysicalDeviceMaintenance5Properties sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceMaintenance5Properties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMaintenance5Properties set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceMaintenance5Properties set(VkPhysicalDeviceMaintenance5Properties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMaintenance5Properties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMaintenance5Properties malloc() {
        return new VkPhysicalDeviceMaintenance5Properties(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance5Properties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMaintenance5Properties calloc() {
        return new VkPhysicalDeviceMaintenance5Properties(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance5Properties} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMaintenance5Properties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMaintenance5Properties(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance5Properties} instance for the specified memory address. */
    public static VkPhysicalDeviceMaintenance5Properties create(long address) {
        return new VkPhysicalDeviceMaintenance5Properties(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceMaintenance5Properties createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceMaintenance5Properties(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance5Properties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance5Properties.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance5Properties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance5Properties.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance5Properties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance5Properties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceMaintenance5Properties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance5Properties.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceMaintenance5Properties.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMaintenance5Properties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMaintenance5Properties malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance5Properties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMaintenance5Properties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMaintenance5Properties calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance5Properties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance5Properties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance5Properties.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance5Properties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance5Properties.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceMaintenance5Properties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMaintenance5Properties.PNEXT); }
    /** Unsafe version of {@link #earlyFragmentMultisampleCoverageAfterSampleCounting}. */
    public static int nearlyFragmentMultisampleCoverageAfterSampleCounting(long struct) { return memGetInt(struct + VkPhysicalDeviceMaintenance5Properties.EARLYFRAGMENTMULTISAMPLECOVERAGEAFTERSAMPLECOUNTING); }
    /** Unsafe version of {@link #earlyFragmentSampleMaskTestBeforeSampleCounting}. */
    public static int nearlyFragmentSampleMaskTestBeforeSampleCounting(long struct) { return memGetInt(struct + VkPhysicalDeviceMaintenance5Properties.EARLYFRAGMENTSAMPLEMASKTESTBEFORESAMPLECOUNTING); }
    /** Unsafe version of {@link #depthStencilSwizzleOneSupport}. */
    public static int ndepthStencilSwizzleOneSupport(long struct) { return memGetInt(struct + VkPhysicalDeviceMaintenance5Properties.DEPTHSTENCILSWIZZLEONESUPPORT); }
    /** Unsafe version of {@link #polygonModePointSize}. */
    public static int npolygonModePointSize(long struct) { return memGetInt(struct + VkPhysicalDeviceMaintenance5Properties.POLYGONMODEPOINTSIZE); }
    /** Unsafe version of {@link #nonStrictSinglePixelWideLinesUseParallelogram}. */
    public static int nnonStrictSinglePixelWideLinesUseParallelogram(long struct) { return memGetInt(struct + VkPhysicalDeviceMaintenance5Properties.NONSTRICTSINGLEPIXELWIDELINESUSEPARALLELOGRAM); }
    /** Unsafe version of {@link #nonStrictWideLinesUseParallelogram}. */
    public static int nnonStrictWideLinesUseParallelogram(long struct) { return memGetInt(struct + VkPhysicalDeviceMaintenance5Properties.NONSTRICTWIDELINESUSEPARALLELOGRAM); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceMaintenance5Properties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMaintenance5Properties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMaintenance5Properties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMaintenance5Properties, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMaintenance5Properties ELEMENT_FACTORY = VkPhysicalDeviceMaintenance5Properties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMaintenance5Properties.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMaintenance5Properties#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceMaintenance5Properties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMaintenance5Properties.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMaintenance5Properties.npNext(address()); }
        /** @return the value of the {@code earlyFragmentMultisampleCoverageAfterSampleCounting} field. */
        @NativeType("VkBool32")
        public boolean earlyFragmentMultisampleCoverageAfterSampleCounting() { return VkPhysicalDeviceMaintenance5Properties.nearlyFragmentMultisampleCoverageAfterSampleCounting(address()) != 0; }
        /** @return the value of the {@code earlyFragmentSampleMaskTestBeforeSampleCounting} field. */
        @NativeType("VkBool32")
        public boolean earlyFragmentSampleMaskTestBeforeSampleCounting() { return VkPhysicalDeviceMaintenance5Properties.nearlyFragmentSampleMaskTestBeforeSampleCounting(address()) != 0; }
        /** @return the value of the {@code depthStencilSwizzleOneSupport} field. */
        @NativeType("VkBool32")
        public boolean depthStencilSwizzleOneSupport() { return VkPhysicalDeviceMaintenance5Properties.ndepthStencilSwizzleOneSupport(address()) != 0; }
        /** @return the value of the {@code polygonModePointSize} field. */
        @NativeType("VkBool32")
        public boolean polygonModePointSize() { return VkPhysicalDeviceMaintenance5Properties.npolygonModePointSize(address()) != 0; }
        /** @return the value of the {@code nonStrictSinglePixelWideLinesUseParallelogram} field. */
        @NativeType("VkBool32")
        public boolean nonStrictSinglePixelWideLinesUseParallelogram() { return VkPhysicalDeviceMaintenance5Properties.nnonStrictSinglePixelWideLinesUseParallelogram(address()) != 0; }
        /** @return the value of the {@code nonStrictWideLinesUseParallelogram} field. */
        @NativeType("VkBool32")
        public boolean nonStrictWideLinesUseParallelogram() { return VkPhysicalDeviceMaintenance5Properties.nnonStrictWideLinesUseParallelogram(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceMaintenance5Properties.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMaintenance5Properties.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES} value to the {@code sType} field. */
        public VkPhysicalDeviceMaintenance5Properties.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceMaintenance5Properties.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMaintenance5Properties.npNext(address(), value); return this; }

    }

}