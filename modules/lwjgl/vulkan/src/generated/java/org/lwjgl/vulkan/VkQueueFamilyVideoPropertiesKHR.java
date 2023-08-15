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
 * Structure describing video codec operations supported by a queue family.
 * 
 * <h5>Description</h5>
 * 
 * <p>If this structure is included in the {@code pNext} chain of the {@link VkQueueFamilyProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceQueueFamilyProperties2 GetPhysicalDeviceQueueFamilyProperties2}, then it is filled with the set of video codec operations supported by the specified queue family.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoQueue#VK_STRUCTURE_TYPE_QUEUE_FAMILY_VIDEO_PROPERTIES_KHR STRUCTURE_TYPE_QUEUE_FAMILY_VIDEO_PROPERTIES_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkQueueFamilyVideoPropertiesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkVideoCodecOperationFlagsKHR {@link #videoCodecOperations};
 * }</code></pre>
 */
public class VkQueueFamilyVideoPropertiesKHR extends Struct<VkQueueFamilyVideoPropertiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VIDEOCODECOPERATIONS;

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
        VIDEOCODECOPERATIONS = layout.offsetof(2);
    }

    protected VkQueueFamilyVideoPropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkQueueFamilyVideoPropertiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkQueueFamilyVideoPropertiesKHR(address, container);
    }

    /**
     * Creates a {@code VkQueueFamilyVideoPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkQueueFamilyVideoPropertiesKHR(ByteBuffer container) {
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
    /** a bitmask of {@code VkVideoCodecOperationFlagBitsKHR} that indicates the set of video codec operations supported by the queue family. */
    @NativeType("VkVideoCodecOperationFlagsKHR")
    public int videoCodecOperations() { return nvideoCodecOperations(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkQueueFamilyVideoPropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_QUEUE_FAMILY_VIDEO_PROPERTIES_KHR STRUCTURE_TYPE_QUEUE_FAMILY_VIDEO_PROPERTIES_KHR} value to the {@link #sType} field. */
    public VkQueueFamilyVideoPropertiesKHR sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_QUEUE_FAMILY_VIDEO_PROPERTIES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkQueueFamilyVideoPropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkQueueFamilyVideoPropertiesKHR set(
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
    public VkQueueFamilyVideoPropertiesKHR set(VkQueueFamilyVideoPropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkQueueFamilyVideoPropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkQueueFamilyVideoPropertiesKHR malloc() {
        return new VkQueueFamilyVideoPropertiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkQueueFamilyVideoPropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkQueueFamilyVideoPropertiesKHR calloc() {
        return new VkQueueFamilyVideoPropertiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkQueueFamilyVideoPropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkQueueFamilyVideoPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkQueueFamilyVideoPropertiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkQueueFamilyVideoPropertiesKHR} instance for the specified memory address. */
    public static VkQueueFamilyVideoPropertiesKHR create(long address) {
        return new VkQueueFamilyVideoPropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkQueueFamilyVideoPropertiesKHR createSafe(long address) {
        return address == NULL ? null : new VkQueueFamilyVideoPropertiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkQueueFamilyVideoPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyVideoPropertiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyVideoPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyVideoPropertiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyVideoPropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyVideoPropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkQueueFamilyVideoPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyVideoPropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkQueueFamilyVideoPropertiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkQueueFamilyVideoPropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueueFamilyVideoPropertiesKHR malloc(MemoryStack stack) {
        return new VkQueueFamilyVideoPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkQueueFamilyVideoPropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueueFamilyVideoPropertiesKHR calloc(MemoryStack stack) {
        return new VkQueueFamilyVideoPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkQueueFamilyVideoPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyVideoPropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyVideoPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyVideoPropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkQueueFamilyVideoPropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkQueueFamilyVideoPropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #videoCodecOperations}. */
    public static int nvideoCodecOperations(long struct) { return UNSAFE.getInt(null, struct + VkQueueFamilyVideoPropertiesKHR.VIDEOCODECOPERATIONS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkQueueFamilyVideoPropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkQueueFamilyVideoPropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkQueueFamilyVideoPropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkQueueFamilyVideoPropertiesKHR, Buffer> implements NativeResource {

        private static final VkQueueFamilyVideoPropertiesKHR ELEMENT_FACTORY = VkQueueFamilyVideoPropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkQueueFamilyVideoPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkQueueFamilyVideoPropertiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkQueueFamilyVideoPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkQueueFamilyVideoPropertiesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkQueueFamilyVideoPropertiesKHR.nsType(address()); }
        /** @return the value of the {@link VkQueueFamilyVideoPropertiesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkQueueFamilyVideoPropertiesKHR.npNext(address()); }
        /** @return the value of the {@link VkQueueFamilyVideoPropertiesKHR#videoCodecOperations} field. */
        @NativeType("VkVideoCodecOperationFlagsKHR")
        public int videoCodecOperations() { return VkQueueFamilyVideoPropertiesKHR.nvideoCodecOperations(address()); }

        /** Sets the specified value to the {@link VkQueueFamilyVideoPropertiesKHR#sType} field. */
        public VkQueueFamilyVideoPropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkQueueFamilyVideoPropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_QUEUE_FAMILY_VIDEO_PROPERTIES_KHR STRUCTURE_TYPE_QUEUE_FAMILY_VIDEO_PROPERTIES_KHR} value to the {@link VkQueueFamilyVideoPropertiesKHR#sType} field. */
        public VkQueueFamilyVideoPropertiesKHR.Buffer sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_QUEUE_FAMILY_VIDEO_PROPERTIES_KHR); }
        /** Sets the specified value to the {@link VkQueueFamilyVideoPropertiesKHR#pNext} field. */
        public VkQueueFamilyVideoPropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkQueueFamilyVideoPropertiesKHR.npNext(address(), value); return this; }

    }

}