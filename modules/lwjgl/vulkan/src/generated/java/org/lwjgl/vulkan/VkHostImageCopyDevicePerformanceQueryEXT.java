/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Struct containing information about optimality of device access.
 * 
 * <h5>Description</h5>
 * 
 * <p>The implementation <b>may</b> return {@link VK10#VK_FALSE FALSE} in {@code optimalDeviceAccess} if {@code identicalMemoryLayout} is {@link VK10#VK_FALSE FALSE}. If {@code identicalMemoryLayout} is {@link VK10#VK_TRUE TRUE}, {@code optimalDeviceAccess} <b>must</b> be {@link VK10#VK_TRUE TRUE}.</p>
 * 
 * <p>The implementation <b>may</b> return {@link VK10#VK_TRUE TRUE} in {@code optimalDeviceAccess} while {@code identicalMemoryLayout} is {@link VK10#VK_FALSE FALSE}. In this situation, any device performance impact <b>should</b> not be measurable.</p>
 * 
 * <p>If {@link VkPhysicalDeviceImageFormatInfo2}{@code ::format} is a block-compressed format and {@link VK11#vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2} returns {@link VK10#VK_SUCCESS SUCCESS}, the implementation <b>must</b> return {@link VK10#VK_TRUE TRUE} in {@code optimalDeviceAccess}.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Applications can make use of {@code optimalDeviceAccess} to determine their resource copying strategy. If a resource is expected to be accessed more on device than on the host, and the implementation considers the resource sub-optimally accessed, it is likely better to use device copies instead.</p>
 * </div>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Layout not being identical yet still considered optimal for device access could happen if the implementation has different memory layout patterns, some of which are easier to access on the host.</p>
 * </div>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The most practical reason for {@code optimalDeviceAccess} to be {@link VK10#VK_FALSE FALSE} is that host image access may disable framebuffer compression where it would otherwise have been enabled. This represents far more efficient host image access since no compression algorithm is required to read or write to the image, but it would impact device access performance. Some implementations may only set {@code optimalDeviceAccess} to {@link VK10#VK_FALSE FALSE} if certain conditions are met, such as specific image usage flags or creation flags.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTHostImageCopy#VK_STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY_EXT STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkHostImageCopyDevicePerformanceQueryEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #optimalDeviceAccess};
 *     VkBool32 {@link #identicalMemoryLayout};
 * }</code></pre>
 */
public class VkHostImageCopyDevicePerformanceQueryEXT extends Struct<VkHostImageCopyDevicePerformanceQueryEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        OPTIMALDEVICEACCESS,
        IDENTICALMEMORYLAYOUT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        OPTIMALDEVICEACCESS = layout.offsetof(2);
        IDENTICALMEMORYLAYOUT = layout.offsetof(3);
    }

    protected VkHostImageCopyDevicePerformanceQueryEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkHostImageCopyDevicePerformanceQueryEXT create(long address, @Nullable ByteBuffer container) {
        return new VkHostImageCopyDevicePerformanceQueryEXT(address, container);
    }

    /**
     * Creates a {@code VkHostImageCopyDevicePerformanceQueryEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkHostImageCopyDevicePerformanceQueryEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** returns {@link VK10#VK_TRUE TRUE} if use of host image copy has no adverse effect on device access performance, compared to an image that is created with exact same creation parameters, and bound to the same {@code VkDeviceMemory}, except that {@link EXTHostImageCopy#VK_IMAGE_USAGE_HOST_TRANSFER_BIT_EXT IMAGE_USAGE_HOST_TRANSFER_BIT_EXT} is replaced with {@link VK10#VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT} and {@link VK10#VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT}. */
    @NativeType("VkBool32")
    public boolean optimalDeviceAccess() { return noptimalDeviceAccess(address()) != 0; }
    /** returns {@link VK10#VK_TRUE TRUE} if use of host image copy has no impact on memory layout compared to an image that is created with exact same creation parameters, and bound to the same {@code VkDeviceMemory}, except that {@link EXTHostImageCopy#VK_IMAGE_USAGE_HOST_TRANSFER_BIT_EXT IMAGE_USAGE_HOST_TRANSFER_BIT_EXT} is replaced with {@link VK10#VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT} and {@link VK10#VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT}. */
    @NativeType("VkBool32")
    public boolean identicalMemoryLayout() { return nidenticalMemoryLayout(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkHostImageCopyDevicePerformanceQueryEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTHostImageCopy#VK_STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY_EXT STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY_EXT} value to the {@link #sType} field. */
    public VkHostImageCopyDevicePerformanceQueryEXT sType$Default() { return sType(EXTHostImageCopy.VK_STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkHostImageCopyDevicePerformanceQueryEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkHostImageCopyDevicePerformanceQueryEXT set(
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
    public VkHostImageCopyDevicePerformanceQueryEXT set(VkHostImageCopyDevicePerformanceQueryEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkHostImageCopyDevicePerformanceQueryEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkHostImageCopyDevicePerformanceQueryEXT malloc() {
        return new VkHostImageCopyDevicePerformanceQueryEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkHostImageCopyDevicePerformanceQueryEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkHostImageCopyDevicePerformanceQueryEXT calloc() {
        return new VkHostImageCopyDevicePerformanceQueryEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkHostImageCopyDevicePerformanceQueryEXT} instance allocated with {@link BufferUtils}. */
    public static VkHostImageCopyDevicePerformanceQueryEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkHostImageCopyDevicePerformanceQueryEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkHostImageCopyDevicePerformanceQueryEXT} instance for the specified memory address. */
    public static VkHostImageCopyDevicePerformanceQueryEXT create(long address) {
        return new VkHostImageCopyDevicePerformanceQueryEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkHostImageCopyDevicePerformanceQueryEXT createSafe(long address) {
        return address == NULL ? null : new VkHostImageCopyDevicePerformanceQueryEXT(address, null);
    }

    /**
     * Returns a new {@link VkHostImageCopyDevicePerformanceQueryEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkHostImageCopyDevicePerformanceQueryEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkHostImageCopyDevicePerformanceQueryEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkHostImageCopyDevicePerformanceQueryEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkHostImageCopyDevicePerformanceQueryEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkHostImageCopyDevicePerformanceQueryEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkHostImageCopyDevicePerformanceQueryEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkHostImageCopyDevicePerformanceQueryEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkHostImageCopyDevicePerformanceQueryEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkHostImageCopyDevicePerformanceQueryEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkHostImageCopyDevicePerformanceQueryEXT malloc(MemoryStack stack) {
        return new VkHostImageCopyDevicePerformanceQueryEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkHostImageCopyDevicePerformanceQueryEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkHostImageCopyDevicePerformanceQueryEXT calloc(MemoryStack stack) {
        return new VkHostImageCopyDevicePerformanceQueryEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkHostImageCopyDevicePerformanceQueryEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkHostImageCopyDevicePerformanceQueryEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkHostImageCopyDevicePerformanceQueryEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkHostImageCopyDevicePerformanceQueryEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkHostImageCopyDevicePerformanceQueryEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkHostImageCopyDevicePerformanceQueryEXT.PNEXT); }
    /** Unsafe version of {@link #optimalDeviceAccess}. */
    public static int noptimalDeviceAccess(long struct) { return UNSAFE.getInt(null, struct + VkHostImageCopyDevicePerformanceQueryEXT.OPTIMALDEVICEACCESS); }
    /** Unsafe version of {@link #identicalMemoryLayout}. */
    public static int nidenticalMemoryLayout(long struct) { return UNSAFE.getInt(null, struct + VkHostImageCopyDevicePerformanceQueryEXT.IDENTICALMEMORYLAYOUT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkHostImageCopyDevicePerformanceQueryEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkHostImageCopyDevicePerformanceQueryEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkHostImageCopyDevicePerformanceQueryEXT} structs. */
    public static class Buffer extends StructBuffer<VkHostImageCopyDevicePerformanceQueryEXT, Buffer> implements NativeResource {

        private static final VkHostImageCopyDevicePerformanceQueryEXT ELEMENT_FACTORY = VkHostImageCopyDevicePerformanceQueryEXT.create(-1L);

        /**
         * Creates a new {@code VkHostImageCopyDevicePerformanceQueryEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkHostImageCopyDevicePerformanceQueryEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkHostImageCopyDevicePerformanceQueryEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkHostImageCopyDevicePerformanceQueryEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkHostImageCopyDevicePerformanceQueryEXT.nsType(address()); }
        /** @return the value of the {@link VkHostImageCopyDevicePerformanceQueryEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkHostImageCopyDevicePerformanceQueryEXT.npNext(address()); }
        /** @return the value of the {@link VkHostImageCopyDevicePerformanceQueryEXT#optimalDeviceAccess} field. */
        @NativeType("VkBool32")
        public boolean optimalDeviceAccess() { return VkHostImageCopyDevicePerformanceQueryEXT.noptimalDeviceAccess(address()) != 0; }
        /** @return the value of the {@link VkHostImageCopyDevicePerformanceQueryEXT#identicalMemoryLayout} field. */
        @NativeType("VkBool32")
        public boolean identicalMemoryLayout() { return VkHostImageCopyDevicePerformanceQueryEXT.nidenticalMemoryLayout(address()) != 0; }

        /** Sets the specified value to the {@link VkHostImageCopyDevicePerformanceQueryEXT#sType} field. */
        public VkHostImageCopyDevicePerformanceQueryEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkHostImageCopyDevicePerformanceQueryEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTHostImageCopy#VK_STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY_EXT STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY_EXT} value to the {@link VkHostImageCopyDevicePerformanceQueryEXT#sType} field. */
        public VkHostImageCopyDevicePerformanceQueryEXT.Buffer sType$Default() { return sType(EXTHostImageCopy.VK_STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY_EXT); }
        /** Sets the specified value to the {@link VkHostImageCopyDevicePerformanceQueryEXT#pNext} field. */
        public VkHostImageCopyDevicePerformanceQueryEXT.Buffer pNext(@NativeType("void *") long value) { VkHostImageCopyDevicePerformanceQueryEXT.npNext(address(), value); return this; }

    }

}