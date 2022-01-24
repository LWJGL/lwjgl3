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
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoProfilesKHR}, {@link KHRVideoQueue#vkGetPhysicalDeviceVideoFormatPropertiesKHR GetPhysicalDeviceVideoFormatPropertiesKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceVideoFormatInfoKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkImageUsageFlags {@link #imageUsage};
 *     {@link VkVideoProfilesKHR VkVideoProfilesKHR} const * {@link #pVideoProfiles};
 * }</code></pre>
 */
public class VkPhysicalDeviceVideoFormatInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGEUSAGE,
        PVIDEOPROFILES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGEUSAGE = layout.offsetof(2);
        PVIDEOPROFILES = layout.offsetof(3);
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

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkImageUsageFlagBits} specifying intended video image usages. */
    @NativeType("VkImageUsageFlags")
    public int imageUsage() { return nimageUsage(address()); }
    /** a pointer to a {@link VkVideoProfilesKHR} structure providing the video profile(s) of video session(s) that will use the image. For most use cases, the image is used by a single video session and a single video profile is provided. For a use case such as transcode, where a decode session output image <b>may</b> be used as encode input for one or more encode sessions, multiple video profiles representing the video sessions that will share the image <b>may</b> be provided. */
    @NativeType("VkVideoProfilesKHR const *")
    public VkVideoProfilesKHR pVideoProfiles() { return npVideoProfiles(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceVideoFormatInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_FORMAT_INFO_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_FORMAT_INFO_KHR} value to the {@link #sType} field. */
    public VkPhysicalDeviceVideoFormatInfoKHR sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_FORMAT_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceVideoFormatInfoKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceVideoFormatInfoKHR set(
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
    public VkPhysicalDeviceVideoFormatInfoKHR set(VkPhysicalDeviceVideoFormatInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVideoFormatInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVideoFormatInfoKHR malloc() {
        return wrap(VkPhysicalDeviceVideoFormatInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceVideoFormatInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVideoFormatInfoKHR calloc() {
        return wrap(VkPhysicalDeviceVideoFormatInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceVideoFormatInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVideoFormatInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceVideoFormatInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVideoFormatInfoKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceVideoFormatInfoKHR create(long address) {
        return wrap(VkPhysicalDeviceVideoFormatInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVideoFormatInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceVideoFormatInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVideoFormatInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoFormatInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVideoFormatInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoFormatInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVideoFormatInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoFormatInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceVideoFormatInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoFormatInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVideoFormatInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVideoFormatInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVideoFormatInfoKHR malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceVideoFormatInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVideoFormatInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVideoFormatInfoKHR calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceVideoFormatInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVideoFormatInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoFormatInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVideoFormatInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoFormatInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVideoFormatInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVideoFormatInfoKHR.PNEXT); }
    /** Unsafe version of {@link #imageUsage}. */
    public static int nimageUsage(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVideoFormatInfoKHR.IMAGEUSAGE); }
    /** Unsafe version of {@link #pVideoProfiles}. */
    public static VkVideoProfilesKHR npVideoProfiles(long struct) { return VkVideoProfilesKHR.create(memGetAddress(struct + VkPhysicalDeviceVideoFormatInfoKHR.PVIDEOPROFILES)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVideoFormatInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVideoFormatInfoKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVideoFormatInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVideoFormatInfoKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceVideoFormatInfoKHR ELEMENT_FACTORY = VkPhysicalDeviceVideoFormatInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVideoFormatInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVideoFormatInfoKHR#SIZEOF}, and its mark will be undefined.
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
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceVideoFormatInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVideoFormatInfoKHR#imageUsage} field. */
        @NativeType("VkImageUsageFlags")
        public int imageUsage() { return VkPhysicalDeviceVideoFormatInfoKHR.nimageUsage(address()); }
        /** @return a {@link VkVideoProfilesKHR} view of the struct pointed to by the {@link VkPhysicalDeviceVideoFormatInfoKHR#pVideoProfiles} field. */
        @NativeType("VkVideoProfilesKHR const *")
        public VkVideoProfilesKHR pVideoProfiles() { return VkPhysicalDeviceVideoFormatInfoKHR.npVideoProfiles(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceVideoFormatInfoKHR#sType} field. */
        public VkPhysicalDeviceVideoFormatInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVideoFormatInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_FORMAT_INFO_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_FORMAT_INFO_KHR} value to the {@link VkPhysicalDeviceVideoFormatInfoKHR#sType} field. */
        public VkPhysicalDeviceVideoFormatInfoKHR.Buffer sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_FORMAT_INFO_KHR); }
        /** Sets the specified value to the {@link VkPhysicalDeviceVideoFormatInfoKHR#pNext} field. */
        public VkPhysicalDeviceVideoFormatInfoKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVideoFormatInfoKHR.npNext(address(), value); return this; }

    }

}