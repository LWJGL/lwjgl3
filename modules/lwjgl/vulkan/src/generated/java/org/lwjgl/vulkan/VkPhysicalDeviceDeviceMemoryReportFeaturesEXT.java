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
 * struct VkPhysicalDeviceDeviceMemoryReportFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 deviceMemoryReport;
 * }}</pre>
 */
public class VkPhysicalDeviceDeviceMemoryReportFeaturesEXT extends Struct<VkPhysicalDeviceDeviceMemoryReportFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEVICEMEMORYREPORT;

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
        DEVICEMEMORYREPORT = layout.offsetof(2);
    }

    protected VkPhysicalDeviceDeviceMemoryReportFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceDeviceMemoryReportFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceDeviceMemoryReportFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDeviceMemoryReportFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code deviceMemoryReport} field. */
    @NativeType("VkBool32")
    public boolean deviceMemoryReport() { return ndeviceMemoryReport(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDeviceMemoryReport#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_MEMORY_REPORT_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_MEMORY_REPORT_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT sType$Default() { return sType(EXTDeviceMemoryReport.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_MEMORY_REPORT_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code deviceMemoryReport} field. */
    public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT deviceMemoryReport(@NativeType("VkBool32") boolean value) { ndeviceMemoryReport(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT set(
        int sType,
        long pNext,
        boolean deviceMemoryReport
    ) {
        sType(sType);
        pNext(pNext);
        deviceMemoryReport(deviceMemoryReport);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT set(VkPhysicalDeviceDeviceMemoryReportFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDeviceMemoryReportFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDeviceMemoryReportFeaturesEXT malloc() {
        return new VkPhysicalDeviceDeviceMemoryReportFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDeviceMemoryReportFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDeviceMemoryReportFeaturesEXT calloc() {
        return new VkPhysicalDeviceDeviceMemoryReportFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDeviceMemoryReportFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDeviceMemoryReportFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDeviceMemoryReportFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDeviceMemoryReportFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceDeviceMemoryReportFeaturesEXT create(long address) {
        return new VkPhysicalDeviceDeviceMemoryReportFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceDeviceMemoryReportFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceDeviceMemoryReportFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDeviceMemoryReportFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDeviceMemoryReportFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDeviceMemoryReportFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDeviceMemoryReportFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDeviceMemoryReportFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDeviceMemoryReportFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #deviceMemoryReport}. */
    public static int ndeviceMemoryReport(long struct) { return memGetInt(struct + VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.DEVICEMEMORYREPORT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #deviceMemoryReport(boolean) deviceMemoryReport}. */
    public static void ndeviceMemoryReport(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.DEVICEMEMORYREPORT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDeviceMemoryReportFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDeviceMemoryReportFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDeviceMemoryReportFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDeviceMemoryReportFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceDeviceMemoryReportFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code deviceMemoryReport} field. */
        @NativeType("VkBool32")
        public boolean deviceMemoryReport() { return VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.ndeviceMemoryReport(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDeviceMemoryReport#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_MEMORY_REPORT_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_MEMORY_REPORT_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.Buffer sType$Default() { return sType(EXTDeviceMemoryReport.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_MEMORY_REPORT_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code deviceMemoryReport} field. */
        public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.Buffer deviceMemoryReport(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.ndeviceMemoryReport(address(), value ? 1 : 0); return this; }

    }

}