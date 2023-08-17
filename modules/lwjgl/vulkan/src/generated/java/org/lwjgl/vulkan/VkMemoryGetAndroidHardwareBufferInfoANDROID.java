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
 * Structure describing an Android hardware buffer memory export operation.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID} <b>must</b> have been included in {@link VkExportMemoryAllocateInfo}{@code ::handleTypes} when {@code memory} was created</li>
 * <li>If the {@code pNext} chain of the {@link VkMemoryAllocateInfo} used to allocate {@code memory} included a {@link VkMemoryDedicatedAllocateInfo} with non-{@code NULL} {@code image} member, then that {@code image} <b>must</b> already be bound to {@code memory}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_STRUCTURE_TYPE_MEMORY_GET_ANDROID_HARDWARE_BUFFER_INFO_ANDROID STRUCTURE_TYPE_MEMORY_GET_ANDROID_HARDWARE_BUFFER_INFO_ANDROID}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link ANDROIDExternalMemoryAndroidHardwareBuffer#vkGetMemoryAndroidHardwareBufferANDROID GetMemoryAndroidHardwareBufferANDROID}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMemoryGetAndroidHardwareBufferInfoANDROID {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDeviceMemory {@link #memory};
 * }</code></pre>
 */
public class VkMemoryGetAndroidHardwareBufferInfoANDROID extends Struct<VkMemoryGetAndroidHardwareBufferInfoANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MEMORY;

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
        MEMORY = layout.offsetof(2);
    }

    protected VkMemoryGetAndroidHardwareBufferInfoANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMemoryGetAndroidHardwareBufferInfoANDROID create(long address, @Nullable ByteBuffer container) {
        return new VkMemoryGetAndroidHardwareBufferInfoANDROID(address, container);
    }

    /**
     * Creates a {@code VkMemoryGetAndroidHardwareBufferInfoANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryGetAndroidHardwareBufferInfoANDROID(ByteBuffer container) {
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
    /** the memory object from which the Android hardware buffer will be exported. */
    @NativeType("VkDeviceMemory")
    public long memory() { return nmemory(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkMemoryGetAndroidHardwareBufferInfoANDROID sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_STRUCTURE_TYPE_MEMORY_GET_ANDROID_HARDWARE_BUFFER_INFO_ANDROID STRUCTURE_TYPE_MEMORY_GET_ANDROID_HARDWARE_BUFFER_INFO_ANDROID} value to the {@link #sType} field. */
    public VkMemoryGetAndroidHardwareBufferInfoANDROID sType$Default() { return sType(ANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_MEMORY_GET_ANDROID_HARDWARE_BUFFER_INFO_ANDROID); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkMemoryGetAndroidHardwareBufferInfoANDROID pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #memory} field. */
    public VkMemoryGetAndroidHardwareBufferInfoANDROID memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryGetAndroidHardwareBufferInfoANDROID set(
        int sType,
        long pNext,
        long memory
    ) {
        sType(sType);
        pNext(pNext);
        memory(memory);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryGetAndroidHardwareBufferInfoANDROID set(VkMemoryGetAndroidHardwareBufferInfoANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryGetAndroidHardwareBufferInfoANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryGetAndroidHardwareBufferInfoANDROID malloc() {
        return new VkMemoryGetAndroidHardwareBufferInfoANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryGetAndroidHardwareBufferInfoANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryGetAndroidHardwareBufferInfoANDROID calloc() {
        return new VkMemoryGetAndroidHardwareBufferInfoANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryGetAndroidHardwareBufferInfoANDROID} instance allocated with {@link BufferUtils}. */
    public static VkMemoryGetAndroidHardwareBufferInfoANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryGetAndroidHardwareBufferInfoANDROID(memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryGetAndroidHardwareBufferInfoANDROID} instance for the specified memory address. */
    public static VkMemoryGetAndroidHardwareBufferInfoANDROID create(long address) {
        return new VkMemoryGetAndroidHardwareBufferInfoANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryGetAndroidHardwareBufferInfoANDROID createSafe(long address) {
        return address == NULL ? null : new VkMemoryGetAndroidHardwareBufferInfoANDROID(address, null);
    }

    /**
     * Returns a new {@link VkMemoryGetAndroidHardwareBufferInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryGetAndroidHardwareBufferInfoANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryGetAndroidHardwareBufferInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryGetAndroidHardwareBufferInfoANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryGetAndroidHardwareBufferInfoANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryGetAndroidHardwareBufferInfoANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMemoryGetAndroidHardwareBufferInfoANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryGetAndroidHardwareBufferInfoANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryGetAndroidHardwareBufferInfoANDROID.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkMemoryGetAndroidHardwareBufferInfoANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryGetAndroidHardwareBufferInfoANDROID malloc(MemoryStack stack) {
        return new VkMemoryGetAndroidHardwareBufferInfoANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMemoryGetAndroidHardwareBufferInfoANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryGetAndroidHardwareBufferInfoANDROID calloc(MemoryStack stack) {
        return new VkMemoryGetAndroidHardwareBufferInfoANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMemoryGetAndroidHardwareBufferInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryGetAndroidHardwareBufferInfoANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryGetAndroidHardwareBufferInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryGetAndroidHardwareBufferInfoANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkMemoryGetAndroidHardwareBufferInfoANDROID.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryGetAndroidHardwareBufferInfoANDROID.PNEXT); }
    /** Unsafe version of {@link #memory}. */
    public static long nmemory(long struct) { return UNSAFE.getLong(null, struct + VkMemoryGetAndroidHardwareBufferInfoANDROID.MEMORY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkMemoryGetAndroidHardwareBufferInfoANDROID.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryGetAndroidHardwareBufferInfoANDROID.PNEXT, value); }
    /** Unsafe version of {@link #memory(long) memory}. */
    public static void nmemory(long struct, long value) { UNSAFE.putLong(null, struct + VkMemoryGetAndroidHardwareBufferInfoANDROID.MEMORY, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryGetAndroidHardwareBufferInfoANDROID} structs. */
    public static class Buffer extends StructBuffer<VkMemoryGetAndroidHardwareBufferInfoANDROID, Buffer> implements NativeResource {

        private static final VkMemoryGetAndroidHardwareBufferInfoANDROID ELEMENT_FACTORY = VkMemoryGetAndroidHardwareBufferInfoANDROID.create(-1L);

        /**
         * Creates a new {@code VkMemoryGetAndroidHardwareBufferInfoANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryGetAndroidHardwareBufferInfoANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMemoryGetAndroidHardwareBufferInfoANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkMemoryGetAndroidHardwareBufferInfoANDROID#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryGetAndroidHardwareBufferInfoANDROID.nsType(address()); }
        /** @return the value of the {@link VkMemoryGetAndroidHardwareBufferInfoANDROID#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMemoryGetAndroidHardwareBufferInfoANDROID.npNext(address()); }
        /** @return the value of the {@link VkMemoryGetAndroidHardwareBufferInfoANDROID#memory} field. */
        @NativeType("VkDeviceMemory")
        public long memory() { return VkMemoryGetAndroidHardwareBufferInfoANDROID.nmemory(address()); }

        /** Sets the specified value to the {@link VkMemoryGetAndroidHardwareBufferInfoANDROID#sType} field. */
        public VkMemoryGetAndroidHardwareBufferInfoANDROID.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryGetAndroidHardwareBufferInfoANDROID.nsType(address(), value); return this; }
        /** Sets the {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_STRUCTURE_TYPE_MEMORY_GET_ANDROID_HARDWARE_BUFFER_INFO_ANDROID STRUCTURE_TYPE_MEMORY_GET_ANDROID_HARDWARE_BUFFER_INFO_ANDROID} value to the {@link VkMemoryGetAndroidHardwareBufferInfoANDROID#sType} field. */
        public VkMemoryGetAndroidHardwareBufferInfoANDROID.Buffer sType$Default() { return sType(ANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_MEMORY_GET_ANDROID_HARDWARE_BUFFER_INFO_ANDROID); }
        /** Sets the specified value to the {@link VkMemoryGetAndroidHardwareBufferInfoANDROID#pNext} field. */
        public VkMemoryGetAndroidHardwareBufferInfoANDROID.Buffer pNext(@NativeType("void const *") long value) { VkMemoryGetAndroidHardwareBufferInfoANDROID.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkMemoryGetAndroidHardwareBufferInfoANDROID#memory} field. */
        public VkMemoryGetAndroidHardwareBufferInfoANDROID.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkMemoryGetAndroidHardwareBufferInfoANDROID.nmemory(address(), value); return this; }

    }

}