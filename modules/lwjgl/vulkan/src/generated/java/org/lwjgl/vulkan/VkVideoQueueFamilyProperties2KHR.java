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
 * Structure specifying the codec video operations.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_QUEUE_FAMILY_PROPERTIES_2_KHR STRUCTURE_TYPE_VIDEO_QUEUE_FAMILY_PROPERTIES_2_KHR}</li>
 * <li>{@code videoCodecOperations} <b>must</b> be a valid combination of {@code VkVideoCodecOperationFlagBitsKHR} values</li>
 * <li>{@code videoCodecOperations} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoQueueFamilyProperties2KHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkVideoCodecOperationFlagsKHR {@link #videoCodecOperations};
 * }</code></pre>
 */
public class VkVideoQueueFamilyProperties2KHR extends Struct implements NativeResource {

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

    /**
     * Creates a {@code VkVideoQueueFamilyProperties2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoQueueFamilyProperties2KHR(ByteBuffer container) {
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
    /** a bitmask of {@code VkVideoCodecOperationFlagBitsKHR} specifying supported video codec operation(s). */
    @NativeType("VkVideoCodecOperationFlagsKHR")
    public int videoCodecOperations() { return nvideoCodecOperations(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoQueueFamilyProperties2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_QUEUE_FAMILY_PROPERTIES_2_KHR STRUCTURE_TYPE_VIDEO_QUEUE_FAMILY_PROPERTIES_2_KHR} value to the {@link #sType} field. */
    public VkVideoQueueFamilyProperties2KHR sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_QUEUE_FAMILY_PROPERTIES_2_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoQueueFamilyProperties2KHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #videoCodecOperations} field. */
    public VkVideoQueueFamilyProperties2KHR videoCodecOperations(@NativeType("VkVideoCodecOperationFlagsKHR") int value) { nvideoCodecOperations(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoQueueFamilyProperties2KHR set(
        int sType,
        long pNext,
        int videoCodecOperations
    ) {
        sType(sType);
        pNext(pNext);
        videoCodecOperations(videoCodecOperations);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoQueueFamilyProperties2KHR set(VkVideoQueueFamilyProperties2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoQueueFamilyProperties2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoQueueFamilyProperties2KHR malloc() {
        return wrap(VkVideoQueueFamilyProperties2KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoQueueFamilyProperties2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoQueueFamilyProperties2KHR calloc() {
        return wrap(VkVideoQueueFamilyProperties2KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoQueueFamilyProperties2KHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoQueueFamilyProperties2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoQueueFamilyProperties2KHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoQueueFamilyProperties2KHR} instance for the specified memory address. */
    public static VkVideoQueueFamilyProperties2KHR create(long address) {
        return wrap(VkVideoQueueFamilyProperties2KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoQueueFamilyProperties2KHR createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoQueueFamilyProperties2KHR.class, address);
    }

    /**
     * Returns a new {@link VkVideoQueueFamilyProperties2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoQueueFamilyProperties2KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoQueueFamilyProperties2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoQueueFamilyProperties2KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoQueueFamilyProperties2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoQueueFamilyProperties2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoQueueFamilyProperties2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoQueueFamilyProperties2KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoQueueFamilyProperties2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoQueueFamilyProperties2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoQueueFamilyProperties2KHR malloc(MemoryStack stack) {
        return wrap(VkVideoQueueFamilyProperties2KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoQueueFamilyProperties2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoQueueFamilyProperties2KHR calloc(MemoryStack stack) {
        return wrap(VkVideoQueueFamilyProperties2KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoQueueFamilyProperties2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoQueueFamilyProperties2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoQueueFamilyProperties2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoQueueFamilyProperties2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoQueueFamilyProperties2KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoQueueFamilyProperties2KHR.PNEXT); }
    /** Unsafe version of {@link #videoCodecOperations}. */
    public static int nvideoCodecOperations(long struct) { return UNSAFE.getInt(null, struct + VkVideoQueueFamilyProperties2KHR.VIDEOCODECOPERATIONS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoQueueFamilyProperties2KHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoQueueFamilyProperties2KHR.PNEXT, value); }
    /** Unsafe version of {@link #videoCodecOperations(int) videoCodecOperations}. */
    public static void nvideoCodecOperations(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoQueueFamilyProperties2KHR.VIDEOCODECOPERATIONS, value); }

    // -----------------------------------

    /** An array of {@link VkVideoQueueFamilyProperties2KHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoQueueFamilyProperties2KHR, Buffer> implements NativeResource {

        private static final VkVideoQueueFamilyProperties2KHR ELEMENT_FACTORY = VkVideoQueueFamilyProperties2KHR.create(-1L);

        /**
         * Creates a new {@code VkVideoQueueFamilyProperties2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoQueueFamilyProperties2KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoQueueFamilyProperties2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoQueueFamilyProperties2KHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoQueueFamilyProperties2KHR.nsType(address()); }
        /** @return the value of the {@link VkVideoQueueFamilyProperties2KHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoQueueFamilyProperties2KHR.npNext(address()); }
        /** @return the value of the {@link VkVideoQueueFamilyProperties2KHR#videoCodecOperations} field. */
        @NativeType("VkVideoCodecOperationFlagsKHR")
        public int videoCodecOperations() { return VkVideoQueueFamilyProperties2KHR.nvideoCodecOperations(address()); }

        /** Sets the specified value to the {@link VkVideoQueueFamilyProperties2KHR#sType} field. */
        public VkVideoQueueFamilyProperties2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoQueueFamilyProperties2KHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_QUEUE_FAMILY_PROPERTIES_2_KHR STRUCTURE_TYPE_VIDEO_QUEUE_FAMILY_PROPERTIES_2_KHR} value to the {@link VkVideoQueueFamilyProperties2KHR#sType} field. */
        public VkVideoQueueFamilyProperties2KHR.Buffer sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_QUEUE_FAMILY_PROPERTIES_2_KHR); }
        /** Sets the specified value to the {@link VkVideoQueueFamilyProperties2KHR#pNext} field. */
        public VkVideoQueueFamilyProperties2KHR.Buffer pNext(@NativeType("void *") long value) { VkVideoQueueFamilyProperties2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoQueueFamilyProperties2KHR#videoCodecOperations} field. */
        public VkVideoQueueFamilyProperties2KHR.Buffer videoCodecOperations(@NativeType("VkVideoCodecOperationFlagsKHR") int value) { VkVideoQueueFamilyProperties2KHR.nvideoCodecOperations(address(), value); return this; }

    }

}