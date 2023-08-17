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
 * Struct containing Android hardware buffer usage flags.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@code androidHardwareBufferUsage} field <b>must</b> include Android hardware buffer usage flags listed in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#memory-external-android-hardware-buffer-usage">AHardwareBuffer Usage Equivalence</a> table when the corresponding Vulkan image usage or image creation flags are included in the {@code usage} or {@code flags} fields of {@link VkPhysicalDeviceImageFormatInfo2}. It <b>must</b> include at least one GPU usage flag ({@code AHARDWAREBUFFER_USAGE_GPU_*}), even if none of the corresponding Vulkan usages or flags are requested.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Requiring at least one GPU usage flag ensures that Android hardware buffer memory will be allocated in a memory pool accessible to the Vulkan implementation, and that specializing the memory layout based on usage flags does not prevent it from being compatible with Vulkan. Implementations <b>may</b> avoid unnecessary restrictions caused by this requirement by using vendor usage flags to indicate that only the Vulkan uses indicated in {@link VkImageFormatProperties2} are required.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_USAGE_ANDROID STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_USAGE_ANDROID}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAndroidHardwareBufferUsageANDROID {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint64_t {@link #androidHardwareBufferUsage};
 * }</code></pre>
 */
public class VkAndroidHardwareBufferUsageANDROID extends Struct<VkAndroidHardwareBufferUsageANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ANDROIDHARDWAREBUFFERUSAGE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ANDROIDHARDWAREBUFFERUSAGE = layout.offsetof(2);
    }

    protected VkAndroidHardwareBufferUsageANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAndroidHardwareBufferUsageANDROID create(long address, @Nullable ByteBuffer container) {
        return new VkAndroidHardwareBufferUsageANDROID(address, container);
    }

    /**
     * Creates a {@code VkAndroidHardwareBufferUsageANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAndroidHardwareBufferUsageANDROID(ByteBuffer container) {
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
    /** returns the Android hardware buffer usage flags. */
    @NativeType("uint64_t")
    public long androidHardwareBufferUsage() { return nandroidHardwareBufferUsage(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkAndroidHardwareBufferUsageANDROID sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_USAGE_ANDROID STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_USAGE_ANDROID} value to the {@link #sType} field. */
    public VkAndroidHardwareBufferUsageANDROID sType$Default() { return sType(ANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_USAGE_ANDROID); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkAndroidHardwareBufferUsageANDROID pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAndroidHardwareBufferUsageANDROID set(
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
    public VkAndroidHardwareBufferUsageANDROID set(VkAndroidHardwareBufferUsageANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAndroidHardwareBufferUsageANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAndroidHardwareBufferUsageANDROID malloc() {
        return new VkAndroidHardwareBufferUsageANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAndroidHardwareBufferUsageANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAndroidHardwareBufferUsageANDROID calloc() {
        return new VkAndroidHardwareBufferUsageANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAndroidHardwareBufferUsageANDROID} instance allocated with {@link BufferUtils}. */
    public static VkAndroidHardwareBufferUsageANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAndroidHardwareBufferUsageANDROID(memAddress(container), container);
    }

    /** Returns a new {@code VkAndroidHardwareBufferUsageANDROID} instance for the specified memory address. */
    public static VkAndroidHardwareBufferUsageANDROID create(long address) {
        return new VkAndroidHardwareBufferUsageANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAndroidHardwareBufferUsageANDROID createSafe(long address) {
        return address == NULL ? null : new VkAndroidHardwareBufferUsageANDROID(address, null);
    }

    /**
     * Returns a new {@link VkAndroidHardwareBufferUsageANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAndroidHardwareBufferUsageANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAndroidHardwareBufferUsageANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAndroidHardwareBufferUsageANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAndroidHardwareBufferUsageANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAndroidHardwareBufferUsageANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAndroidHardwareBufferUsageANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAndroidHardwareBufferUsageANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAndroidHardwareBufferUsageANDROID.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAndroidHardwareBufferUsageANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAndroidHardwareBufferUsageANDROID malloc(MemoryStack stack) {
        return new VkAndroidHardwareBufferUsageANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAndroidHardwareBufferUsageANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAndroidHardwareBufferUsageANDROID calloc(MemoryStack stack) {
        return new VkAndroidHardwareBufferUsageANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAndroidHardwareBufferUsageANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAndroidHardwareBufferUsageANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAndroidHardwareBufferUsageANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAndroidHardwareBufferUsageANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkAndroidHardwareBufferUsageANDROID.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAndroidHardwareBufferUsageANDROID.PNEXT); }
    /** Unsafe version of {@link #androidHardwareBufferUsage}. */
    public static long nandroidHardwareBufferUsage(long struct) { return UNSAFE.getLong(null, struct + VkAndroidHardwareBufferUsageANDROID.ANDROIDHARDWAREBUFFERUSAGE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkAndroidHardwareBufferUsageANDROID.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAndroidHardwareBufferUsageANDROID.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkAndroidHardwareBufferUsageANDROID} structs. */
    public static class Buffer extends StructBuffer<VkAndroidHardwareBufferUsageANDROID, Buffer> implements NativeResource {

        private static final VkAndroidHardwareBufferUsageANDROID ELEMENT_FACTORY = VkAndroidHardwareBufferUsageANDROID.create(-1L);

        /**
         * Creates a new {@code VkAndroidHardwareBufferUsageANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAndroidHardwareBufferUsageANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAndroidHardwareBufferUsageANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkAndroidHardwareBufferUsageANDROID#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAndroidHardwareBufferUsageANDROID.nsType(address()); }
        /** @return the value of the {@link VkAndroidHardwareBufferUsageANDROID#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkAndroidHardwareBufferUsageANDROID.npNext(address()); }
        /** @return the value of the {@link VkAndroidHardwareBufferUsageANDROID#androidHardwareBufferUsage} field. */
        @NativeType("uint64_t")
        public long androidHardwareBufferUsage() { return VkAndroidHardwareBufferUsageANDROID.nandroidHardwareBufferUsage(address()); }

        /** Sets the specified value to the {@link VkAndroidHardwareBufferUsageANDROID#sType} field. */
        public VkAndroidHardwareBufferUsageANDROID.Buffer sType(@NativeType("VkStructureType") int value) { VkAndroidHardwareBufferUsageANDROID.nsType(address(), value); return this; }
        /** Sets the {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_USAGE_ANDROID STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_USAGE_ANDROID} value to the {@link VkAndroidHardwareBufferUsageANDROID#sType} field. */
        public VkAndroidHardwareBufferUsageANDROID.Buffer sType$Default() { return sType(ANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_USAGE_ANDROID); }
        /** Sets the specified value to the {@link VkAndroidHardwareBufferUsageANDROID#pNext} field. */
        public VkAndroidHardwareBufferUsageANDROID.Buffer pNext(@NativeType("void *") long value) { VkAndroidHardwareBufferUsageANDROID.npNext(address(), value); return this; }

    }

}