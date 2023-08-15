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
 * Structure specifying the codec video format.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoQueue#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_FORMAT_INFO_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_FORMAT_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkVideoProfileListInfoKHR}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code imageUsage} <b>must</b> be a valid combination of {@code VkImageUsageFlagBits} values</li>
 * <li>{@code imageUsage} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRVideoQueue#vkGetPhysicalDeviceVideoFormatPropertiesKHR GetPhysicalDeviceVideoFormatPropertiesKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceVideoFormatInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkImageUsageFlags {@link #imageUsage};
 * }</code></pre>
 */
public class VkPhysicalDeviceVideoFormatInfoKHR extends Struct<VkPhysicalDeviceVideoFormatInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGEUSAGE;

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
        IMAGEUSAGE = layout.offsetof(2);
    }

    protected VkPhysicalDeviceVideoFormatInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceVideoFormatInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceVideoFormatInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceVideoFormatInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVideoFormatInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkImageUsageFlagBits} specifying the intended usage of the video images. */
    @NativeType("VkImageUsageFlags")
    public int imageUsage() { return nimageUsage(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceVideoFormatInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_FORMAT_INFO_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_FORMAT_INFO_KHR} value to the {@link #sType} field. */
    public VkPhysicalDeviceVideoFormatInfoKHR sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_FORMAT_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceVideoFormatInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkVideoProfileListInfoKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceVideoFormatInfoKHR pNext(VkVideoProfileListInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #imageUsage} field. */
    public VkPhysicalDeviceVideoFormatInfoKHR imageUsage(@NativeType("VkImageUsageFlags") int value) { nimageUsage(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceVideoFormatInfoKHR set(
        int sType,
        long pNext,
        int imageUsage
    ) {
        sType(sType);
        pNext(pNext);
        imageUsage(imageUsage);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceVideoFormatInfoKHR set(VkPhysicalDeviceVideoFormatInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVideoFormatInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVideoFormatInfoKHR malloc() {
        return new VkPhysicalDeviceVideoFormatInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVideoFormatInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVideoFormatInfoKHR calloc() {
        return new VkPhysicalDeviceVideoFormatInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVideoFormatInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVideoFormatInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVideoFormatInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVideoFormatInfoKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceVideoFormatInfoKHR create(long address) {
        return new VkPhysicalDeviceVideoFormatInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVideoFormatInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceVideoFormatInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVideoFormatInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoFormatInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVideoFormatInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoFormatInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVideoFormatInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoFormatInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceVideoFormatInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoFormatInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVideoFormatInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVideoFormatInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVideoFormatInfoKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVideoFormatInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVideoFormatInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVideoFormatInfoKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVideoFormatInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVideoFormatInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoFormatInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVideoFormatInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoFormatInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVideoFormatInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVideoFormatInfoKHR.PNEXT); }
    /** Unsafe version of {@link #imageUsage}. */
    public static int nimageUsage(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVideoFormatInfoKHR.IMAGEUSAGE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVideoFormatInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVideoFormatInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #imageUsage(int) imageUsage}. */
    public static void nimageUsage(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVideoFormatInfoKHR.IMAGEUSAGE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVideoFormatInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVideoFormatInfoKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceVideoFormatInfoKHR ELEMENT_FACTORY = VkPhysicalDeviceVideoFormatInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVideoFormatInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVideoFormatInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceVideoFormatInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceVideoFormatInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceVideoFormatInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVideoFormatInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPhysicalDeviceVideoFormatInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVideoFormatInfoKHR#imageUsage} field. */
        @NativeType("VkImageUsageFlags")
        public int imageUsage() { return VkPhysicalDeviceVideoFormatInfoKHR.nimageUsage(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceVideoFormatInfoKHR#sType} field. */
        public VkPhysicalDeviceVideoFormatInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVideoFormatInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_FORMAT_INFO_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_FORMAT_INFO_KHR} value to the {@link VkPhysicalDeviceVideoFormatInfoKHR#sType} field. */
        public VkPhysicalDeviceVideoFormatInfoKHR.Buffer sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_FORMAT_INFO_KHR); }
        /** Sets the specified value to the {@link VkPhysicalDeviceVideoFormatInfoKHR#pNext} field. */
        public VkPhysicalDeviceVideoFormatInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkPhysicalDeviceVideoFormatInfoKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkVideoProfileListInfoKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceVideoFormatInfoKHR.Buffer pNext(VkVideoProfileListInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkPhysicalDeviceVideoFormatInfoKHR#imageUsage} field. */
        public VkPhysicalDeviceVideoFormatInfoKHR.Buffer imageUsage(@NativeType("VkImageUsageFlags") int value) { VkPhysicalDeviceVideoFormatInfoKHR.nimageUsage(address(), value); return this; }

    }

}