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
 * struct VkPhysicalDeviceImageProcessing3FeaturesQCOM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 imageGatherLinear;
 *     VkBool32 imageGatherExtendedModes;
 *     VkBool32 blockMatchExtendedClampToEdge;
 * }}</pre>
 */
public class VkPhysicalDeviceImageProcessing3FeaturesQCOM extends Struct<VkPhysicalDeviceImageProcessing3FeaturesQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGEGATHERLINEAR,
        IMAGEGATHEREXTENDEDMODES,
        BLOCKMATCHEXTENDEDCLAMPTOEDGE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGEGATHERLINEAR = layout.offsetof(2);
        IMAGEGATHEREXTENDEDMODES = layout.offsetof(3);
        BLOCKMATCHEXTENDEDCLAMPTOEDGE = layout.offsetof(4);
    }

    protected VkPhysicalDeviceImageProcessing3FeaturesQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceImageProcessing3FeaturesQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceImageProcessing3FeaturesQCOM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceImageProcessing3FeaturesQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceImageProcessing3FeaturesQCOM(ByteBuffer container) {
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
    /** @return the value of the {@code imageGatherLinear} field. */
    @NativeType("VkBool32")
    public boolean imageGatherLinear() { return nimageGatherLinear(address()) != 0; }
    /** @return the value of the {@code imageGatherExtendedModes} field. */
    @NativeType("VkBool32")
    public boolean imageGatherExtendedModes() { return nimageGatherExtendedModes(address()) != 0; }
    /** @return the value of the {@code blockMatchExtendedClampToEdge} field. */
    @NativeType("VkBool32")
    public boolean blockMatchExtendedClampToEdge() { return nblockMatchExtendedClampToEdge(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceImageProcessing3FeaturesQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMImageProcessing3#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_3_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_3_FEATURES_QCOM} value to the {@code sType} field. */
    public VkPhysicalDeviceImageProcessing3FeaturesQCOM sType$Default() { return sType(QCOMImageProcessing3.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_3_FEATURES_QCOM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceImageProcessing3FeaturesQCOM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code imageGatherLinear} field. */
    public VkPhysicalDeviceImageProcessing3FeaturesQCOM imageGatherLinear(@NativeType("VkBool32") boolean value) { nimageGatherLinear(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code imageGatherExtendedModes} field. */
    public VkPhysicalDeviceImageProcessing3FeaturesQCOM imageGatherExtendedModes(@NativeType("VkBool32") boolean value) { nimageGatherExtendedModes(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code blockMatchExtendedClampToEdge} field. */
    public VkPhysicalDeviceImageProcessing3FeaturesQCOM blockMatchExtendedClampToEdge(@NativeType("VkBool32") boolean value) { nblockMatchExtendedClampToEdge(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceImageProcessing3FeaturesQCOM set(
        int sType,
        long pNext,
        boolean imageGatherLinear,
        boolean imageGatherExtendedModes,
        boolean blockMatchExtendedClampToEdge
    ) {
        sType(sType);
        pNext(pNext);
        imageGatherLinear(imageGatherLinear);
        imageGatherExtendedModes(imageGatherExtendedModes);
        blockMatchExtendedClampToEdge(blockMatchExtendedClampToEdge);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceImageProcessing3FeaturesQCOM set(VkPhysicalDeviceImageProcessing3FeaturesQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceImageProcessing3FeaturesQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageProcessing3FeaturesQCOM malloc() {
        return new VkPhysicalDeviceImageProcessing3FeaturesQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceImageProcessing3FeaturesQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageProcessing3FeaturesQCOM calloc() {
        return new VkPhysicalDeviceImageProcessing3FeaturesQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceImageProcessing3FeaturesQCOM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceImageProcessing3FeaturesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceImageProcessing3FeaturesQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceImageProcessing3FeaturesQCOM} instance for the specified memory address. */
    public static VkPhysicalDeviceImageProcessing3FeaturesQCOM create(long address) {
        return new VkPhysicalDeviceImageProcessing3FeaturesQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceImageProcessing3FeaturesQCOM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceImageProcessing3FeaturesQCOM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageProcessing3FeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageProcessing3FeaturesQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageProcessing3FeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageProcessing3FeaturesQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageProcessing3FeaturesQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageProcessing3FeaturesQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceImageProcessing3FeaturesQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageProcessing3FeaturesQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceImageProcessing3FeaturesQCOM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImageProcessing3FeaturesQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageProcessing3FeaturesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageProcessing3FeaturesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImageProcessing3FeaturesQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageProcessing3FeaturesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageProcessing3FeaturesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageProcessing3FeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageProcessing3FeaturesQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageProcessing3FeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageProcessing3FeaturesQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceImageProcessing3FeaturesQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceImageProcessing3FeaturesQCOM.PNEXT); }
    /** Unsafe version of {@link #imageGatherLinear}. */
    public static int nimageGatherLinear(long struct) { return memGetInt(struct + VkPhysicalDeviceImageProcessing3FeaturesQCOM.IMAGEGATHERLINEAR); }
    /** Unsafe version of {@link #imageGatherExtendedModes}. */
    public static int nimageGatherExtendedModes(long struct) { return memGetInt(struct + VkPhysicalDeviceImageProcessing3FeaturesQCOM.IMAGEGATHEREXTENDEDMODES); }
    /** Unsafe version of {@link #blockMatchExtendedClampToEdge}. */
    public static int nblockMatchExtendedClampToEdge(long struct) { return memGetInt(struct + VkPhysicalDeviceImageProcessing3FeaturesQCOM.BLOCKMATCHEXTENDEDCLAMPTOEDGE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageProcessing3FeaturesQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceImageProcessing3FeaturesQCOM.PNEXT, value); }
    /** Unsafe version of {@link #imageGatherLinear(boolean) imageGatherLinear}. */
    public static void nimageGatherLinear(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageProcessing3FeaturesQCOM.IMAGEGATHERLINEAR, value); }
    /** Unsafe version of {@link #imageGatherExtendedModes(boolean) imageGatherExtendedModes}. */
    public static void nimageGatherExtendedModes(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageProcessing3FeaturesQCOM.IMAGEGATHEREXTENDEDMODES, value); }
    /** Unsafe version of {@link #blockMatchExtendedClampToEdge(boolean) blockMatchExtendedClampToEdge}. */
    public static void nblockMatchExtendedClampToEdge(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageProcessing3FeaturesQCOM.BLOCKMATCHEXTENDEDCLAMPTOEDGE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceImageProcessing3FeaturesQCOM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImageProcessing3FeaturesQCOM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceImageProcessing3FeaturesQCOM ELEMENT_FACTORY = VkPhysicalDeviceImageProcessing3FeaturesQCOM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceImageProcessing3FeaturesQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceImageProcessing3FeaturesQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceImageProcessing3FeaturesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceImageProcessing3FeaturesQCOM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceImageProcessing3FeaturesQCOM.npNext(address()); }
        /** @return the value of the {@code imageGatherLinear} field. */
        @NativeType("VkBool32")
        public boolean imageGatherLinear() { return VkPhysicalDeviceImageProcessing3FeaturesQCOM.nimageGatherLinear(address()) != 0; }
        /** @return the value of the {@code imageGatherExtendedModes} field. */
        @NativeType("VkBool32")
        public boolean imageGatherExtendedModes() { return VkPhysicalDeviceImageProcessing3FeaturesQCOM.nimageGatherExtendedModes(address()) != 0; }
        /** @return the value of the {@code blockMatchExtendedClampToEdge} field. */
        @NativeType("VkBool32")
        public boolean blockMatchExtendedClampToEdge() { return VkPhysicalDeviceImageProcessing3FeaturesQCOM.nblockMatchExtendedClampToEdge(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceImageProcessing3FeaturesQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceImageProcessing3FeaturesQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMImageProcessing3#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_3_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_3_FEATURES_QCOM} value to the {@code sType} field. */
        public VkPhysicalDeviceImageProcessing3FeaturesQCOM.Buffer sType$Default() { return sType(QCOMImageProcessing3.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_3_FEATURES_QCOM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceImageProcessing3FeaturesQCOM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceImageProcessing3FeaturesQCOM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code imageGatherLinear} field. */
        public VkPhysicalDeviceImageProcessing3FeaturesQCOM.Buffer imageGatherLinear(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceImageProcessing3FeaturesQCOM.nimageGatherLinear(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code imageGatherExtendedModes} field. */
        public VkPhysicalDeviceImageProcessing3FeaturesQCOM.Buffer imageGatherExtendedModes(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceImageProcessing3FeaturesQCOM.nimageGatherExtendedModes(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code blockMatchExtendedClampToEdge} field. */
        public VkPhysicalDeviceImageProcessing3FeaturesQCOM.Buffer blockMatchExtendedClampToEdge(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceImageProcessing3FeaturesQCOM.nblockMatchExtendedClampToEdge(address(), value ? 1 : 0); return this; }

    }

}