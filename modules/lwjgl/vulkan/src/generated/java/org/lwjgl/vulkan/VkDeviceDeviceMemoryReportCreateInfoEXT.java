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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkDeviceDeviceMemoryReportCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDeviceMemoryReportFlagsEXT flags;
 *     {@link VkDeviceMemoryReportCallbackEXTI PFN_vkDeviceMemoryReportCallbackEXT} pfnUserCallback;
 *     void * pUserData;
 * }}</pre>
 */
public class VkDeviceDeviceMemoryReportCreateInfoEXT extends Struct<VkDeviceDeviceMemoryReportCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        PFNUSERCALLBACK,
        PUSERDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        PFNUSERCALLBACK = layout.offsetof(3);
        PUSERDATA = layout.offsetof(4);
    }

    protected VkDeviceDeviceMemoryReportCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceDeviceMemoryReportCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceDeviceMemoryReportCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkDeviceDeviceMemoryReportCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceDeviceMemoryReportCreateInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkDeviceMemoryReportFlagsEXT")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code pfnUserCallback} field. */
    @NativeType("PFN_vkDeviceMemoryReportCallbackEXT")
    public VkDeviceMemoryReportCallbackEXT pfnUserCallback() { return npfnUserCallback(address()); }
    /** @return the value of the {@code pUserData} field. */
    @NativeType("void *")
    public long pUserData() { return npUserData(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDeviceDeviceMemoryReportCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDeviceMemoryReport#VK_STRUCTURE_TYPE_DEVICE_DEVICE_MEMORY_REPORT_CREATE_INFO_EXT STRUCTURE_TYPE_DEVICE_DEVICE_MEMORY_REPORT_CREATE_INFO_EXT} value to the {@code sType} field. */
    public VkDeviceDeviceMemoryReportCreateInfoEXT sType$Default() { return sType(EXTDeviceMemoryReport.VK_STRUCTURE_TYPE_DEVICE_DEVICE_MEMORY_REPORT_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDeviceDeviceMemoryReportCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkDeviceDeviceMemoryReportCreateInfoEXT flags(@NativeType("VkDeviceMemoryReportFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code pfnUserCallback} field. */
    public VkDeviceDeviceMemoryReportCreateInfoEXT pfnUserCallback(@NativeType("PFN_vkDeviceMemoryReportCallbackEXT") VkDeviceMemoryReportCallbackEXTI value) { npfnUserCallback(address(), value); return this; }
    /** Sets the specified value to the {@code pUserData} field. */
    public VkDeviceDeviceMemoryReportCreateInfoEXT pUserData(@NativeType("void *") long value) { npUserData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceDeviceMemoryReportCreateInfoEXT set(
        int sType,
        long pNext,
        int flags,
        VkDeviceMemoryReportCallbackEXTI pfnUserCallback,
        long pUserData
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pfnUserCallback(pfnUserCallback);
        pUserData(pUserData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceDeviceMemoryReportCreateInfoEXT set(VkDeviceDeviceMemoryReportCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceDeviceMemoryReportCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceDeviceMemoryReportCreateInfoEXT malloc() {
        return new VkDeviceDeviceMemoryReportCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceDeviceMemoryReportCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceDeviceMemoryReportCreateInfoEXT calloc() {
        return new VkDeviceDeviceMemoryReportCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceDeviceMemoryReportCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDeviceDeviceMemoryReportCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceDeviceMemoryReportCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceDeviceMemoryReportCreateInfoEXT} instance for the specified memory address. */
    public static VkDeviceDeviceMemoryReportCreateInfoEXT create(long address) {
        return new VkDeviceDeviceMemoryReportCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDeviceDeviceMemoryReportCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkDeviceDeviceMemoryReportCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDeviceDeviceMemoryReportCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceDeviceMemoryReportCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceDeviceMemoryReportCreateInfoEXT malloc(MemoryStack stack) {
        return new VkDeviceDeviceMemoryReportCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceDeviceMemoryReportCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceDeviceMemoryReportCreateInfoEXT calloc(MemoryStack stack) {
        return new VkDeviceDeviceMemoryReportCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDeviceDeviceMemoryReportCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceDeviceMemoryReportCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkDeviceDeviceMemoryReportCreateInfoEXT.FLAGS); }
    /** Unsafe version of {@link #pfnUserCallback}. */
    public static VkDeviceMemoryReportCallbackEXT npfnUserCallback(long struct) { return VkDeviceMemoryReportCallbackEXT.create(memGetAddress(struct + VkDeviceDeviceMemoryReportCreateInfoEXT.PFNUSERCALLBACK)); }
    /** Unsafe version of {@link #pUserData}. */
    public static long npUserData(long struct) { return memGetAddress(struct + VkDeviceDeviceMemoryReportCreateInfoEXT.PUSERDATA); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDeviceDeviceMemoryReportCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceDeviceMemoryReportCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkDeviceDeviceMemoryReportCreateInfoEXT.FLAGS, value); }
    /** Unsafe version of {@link #pfnUserCallback(VkDeviceMemoryReportCallbackEXTI) pfnUserCallback}. */
    public static void npfnUserCallback(long struct, VkDeviceMemoryReportCallbackEXTI value) { memPutAddress(struct + VkDeviceDeviceMemoryReportCreateInfoEXT.PFNUSERCALLBACK, value.address()); }
    /** Unsafe version of {@link #pUserData(long) pUserData}. */
    public static void npUserData(long struct, long value) { memPutAddress(struct + VkDeviceDeviceMemoryReportCreateInfoEXT.PUSERDATA, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkDeviceDeviceMemoryReportCreateInfoEXT.PFNUSERCALLBACK));
        check(memGetAddress(struct + VkDeviceDeviceMemoryReportCreateInfoEXT.PUSERDATA));
    }

    // -----------------------------------

    /** An array of {@link VkDeviceDeviceMemoryReportCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkDeviceDeviceMemoryReportCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkDeviceDeviceMemoryReportCreateInfoEXT ELEMENT_FACTORY = VkDeviceDeviceMemoryReportCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceDeviceMemoryReportCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDeviceDeviceMemoryReportCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceDeviceMemoryReportCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceDeviceMemoryReportCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkDeviceMemoryReportFlagsEXT")
        public int flags() { return VkDeviceDeviceMemoryReportCreateInfoEXT.nflags(address()); }
        /** @return the value of the {@code pfnUserCallback} field. */
        @NativeType("PFN_vkDeviceMemoryReportCallbackEXT")
        public VkDeviceMemoryReportCallbackEXT pfnUserCallback() { return VkDeviceDeviceMemoryReportCreateInfoEXT.npfnUserCallback(address()); }
        /** @return the value of the {@code pUserData} field. */
        @NativeType("void *")
        public long pUserData() { return VkDeviceDeviceMemoryReportCreateInfoEXT.npUserData(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceDeviceMemoryReportCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDeviceMemoryReport#VK_STRUCTURE_TYPE_DEVICE_DEVICE_MEMORY_REPORT_CREATE_INFO_EXT STRUCTURE_TYPE_DEVICE_DEVICE_MEMORY_REPORT_CREATE_INFO_EXT} value to the {@code sType} field. */
        public VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer sType$Default() { return sType(EXTDeviceMemoryReport.VK_STRUCTURE_TYPE_DEVICE_DEVICE_MEMORY_REPORT_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkDeviceDeviceMemoryReportCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer flags(@NativeType("VkDeviceMemoryReportFlagsEXT") int value) { VkDeviceDeviceMemoryReportCreateInfoEXT.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code pfnUserCallback} field. */
        public VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer pfnUserCallback(@NativeType("PFN_vkDeviceMemoryReportCallbackEXT") VkDeviceMemoryReportCallbackEXTI value) { VkDeviceDeviceMemoryReportCreateInfoEXT.npfnUserCallback(address(), value); return this; }
        /** Sets the specified value to the {@code pUserData} field. */
        public VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer pUserData(@NativeType("void *") long value) { VkDeviceDeviceMemoryReportCreateInfoEXT.npUserData(address(), value); return this; }

    }

}