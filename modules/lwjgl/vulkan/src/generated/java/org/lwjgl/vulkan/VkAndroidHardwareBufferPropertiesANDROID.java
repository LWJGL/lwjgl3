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
 * Properties of External Memory Android Hardware Buffers.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_PROPERTIES_ANDROID STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_PROPERTIES_ANDROID}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkAndroidHardwareBufferFormatProperties2ANDROID} or {@link VkAndroidHardwareBufferFormatPropertiesANDROID}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link ANDROIDExternalMemoryAndroidHardwareBuffer#vkGetAndroidHardwareBufferPropertiesANDROID GetAndroidHardwareBufferPropertiesANDROID}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAndroidHardwareBufferPropertiesANDROID {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkDeviceSize {@link #allocationSize};
 *     uint32_t {@link #memoryTypeBits};
 * }</code></pre>
 */
public class VkAndroidHardwareBufferPropertiesANDROID extends Struct<VkAndroidHardwareBufferPropertiesANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ALLOCATIONSIZE,
        MEMORYTYPEBITS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ALLOCATIONSIZE = layout.offsetof(2);
        MEMORYTYPEBITS = layout.offsetof(3);
    }

    protected VkAndroidHardwareBufferPropertiesANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAndroidHardwareBufferPropertiesANDROID create(long address, @Nullable ByteBuffer container) {
        return new VkAndroidHardwareBufferPropertiesANDROID(address, container);
    }

    /**
     * Creates a {@code VkAndroidHardwareBufferPropertiesANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAndroidHardwareBufferPropertiesANDROID(ByteBuffer container) {
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
    /** the size of the external memory */
    @NativeType("VkDeviceSize")
    public long allocationSize() { return nallocationSize(address()); }
    /** a bitmask containing one bit set for every memory type which the specified Android hardware buffer <b>can</b> be imported as. */
    @NativeType("uint32_t")
    public int memoryTypeBits() { return nmemoryTypeBits(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkAndroidHardwareBufferPropertiesANDROID sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_PROPERTIES_ANDROID STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_PROPERTIES_ANDROID} value to the {@link #sType} field. */
    public VkAndroidHardwareBufferPropertiesANDROID sType$Default() { return sType(ANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_PROPERTIES_ANDROID); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkAndroidHardwareBufferPropertiesANDROID pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkAndroidHardwareBufferFormatProperties2ANDROID} value to the {@code pNext} chain. */
    public VkAndroidHardwareBufferPropertiesANDROID pNext(VkAndroidHardwareBufferFormatProperties2ANDROID value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkAndroidHardwareBufferFormatPropertiesANDROID} value to the {@code pNext} chain. */
    public VkAndroidHardwareBufferPropertiesANDROID pNext(VkAndroidHardwareBufferFormatPropertiesANDROID value) { return this.pNext(value.pNext(this.pNext()).address()); }

    /** Initializes this struct with the specified values. */
    public VkAndroidHardwareBufferPropertiesANDROID set(
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
    public VkAndroidHardwareBufferPropertiesANDROID set(VkAndroidHardwareBufferPropertiesANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAndroidHardwareBufferPropertiesANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAndroidHardwareBufferPropertiesANDROID malloc() {
        return new VkAndroidHardwareBufferPropertiesANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAndroidHardwareBufferPropertiesANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAndroidHardwareBufferPropertiesANDROID calloc() {
        return new VkAndroidHardwareBufferPropertiesANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAndroidHardwareBufferPropertiesANDROID} instance allocated with {@link BufferUtils}. */
    public static VkAndroidHardwareBufferPropertiesANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAndroidHardwareBufferPropertiesANDROID(memAddress(container), container);
    }

    /** Returns a new {@code VkAndroidHardwareBufferPropertiesANDROID} instance for the specified memory address. */
    public static VkAndroidHardwareBufferPropertiesANDROID create(long address) {
        return new VkAndroidHardwareBufferPropertiesANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAndroidHardwareBufferPropertiesANDROID createSafe(long address) {
        return address == NULL ? null : new VkAndroidHardwareBufferPropertiesANDROID(address, null);
    }

    /**
     * Returns a new {@link VkAndroidHardwareBufferPropertiesANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAndroidHardwareBufferPropertiesANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAndroidHardwareBufferPropertiesANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAndroidHardwareBufferPropertiesANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAndroidHardwareBufferPropertiesANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAndroidHardwareBufferPropertiesANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAndroidHardwareBufferPropertiesANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAndroidHardwareBufferPropertiesANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAndroidHardwareBufferPropertiesANDROID.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAndroidHardwareBufferPropertiesANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAndroidHardwareBufferPropertiesANDROID malloc(MemoryStack stack) {
        return new VkAndroidHardwareBufferPropertiesANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAndroidHardwareBufferPropertiesANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAndroidHardwareBufferPropertiesANDROID calloc(MemoryStack stack) {
        return new VkAndroidHardwareBufferPropertiesANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAndroidHardwareBufferPropertiesANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAndroidHardwareBufferPropertiesANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAndroidHardwareBufferPropertiesANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAndroidHardwareBufferPropertiesANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkAndroidHardwareBufferPropertiesANDROID.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAndroidHardwareBufferPropertiesANDROID.PNEXT); }
    /** Unsafe version of {@link #allocationSize}. */
    public static long nallocationSize(long struct) { return UNSAFE.getLong(null, struct + VkAndroidHardwareBufferPropertiesANDROID.ALLOCATIONSIZE); }
    /** Unsafe version of {@link #memoryTypeBits}. */
    public static int nmemoryTypeBits(long struct) { return UNSAFE.getInt(null, struct + VkAndroidHardwareBufferPropertiesANDROID.MEMORYTYPEBITS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkAndroidHardwareBufferPropertiesANDROID.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAndroidHardwareBufferPropertiesANDROID.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkAndroidHardwareBufferPropertiesANDROID} structs. */
    public static class Buffer extends StructBuffer<VkAndroidHardwareBufferPropertiesANDROID, Buffer> implements NativeResource {

        private static final VkAndroidHardwareBufferPropertiesANDROID ELEMENT_FACTORY = VkAndroidHardwareBufferPropertiesANDROID.create(-1L);

        /**
         * Creates a new {@code VkAndroidHardwareBufferPropertiesANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAndroidHardwareBufferPropertiesANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAndroidHardwareBufferPropertiesANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkAndroidHardwareBufferPropertiesANDROID#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAndroidHardwareBufferPropertiesANDROID.nsType(address()); }
        /** @return the value of the {@link VkAndroidHardwareBufferPropertiesANDROID#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkAndroidHardwareBufferPropertiesANDROID.npNext(address()); }
        /** @return the value of the {@link VkAndroidHardwareBufferPropertiesANDROID#allocationSize} field. */
        @NativeType("VkDeviceSize")
        public long allocationSize() { return VkAndroidHardwareBufferPropertiesANDROID.nallocationSize(address()); }
        /** @return the value of the {@link VkAndroidHardwareBufferPropertiesANDROID#memoryTypeBits} field. */
        @NativeType("uint32_t")
        public int memoryTypeBits() { return VkAndroidHardwareBufferPropertiesANDROID.nmemoryTypeBits(address()); }

        /** Sets the specified value to the {@link VkAndroidHardwareBufferPropertiesANDROID#sType} field. */
        public VkAndroidHardwareBufferPropertiesANDROID.Buffer sType(@NativeType("VkStructureType") int value) { VkAndroidHardwareBufferPropertiesANDROID.nsType(address(), value); return this; }
        /** Sets the {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_PROPERTIES_ANDROID STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_PROPERTIES_ANDROID} value to the {@link VkAndroidHardwareBufferPropertiesANDROID#sType} field. */
        public VkAndroidHardwareBufferPropertiesANDROID.Buffer sType$Default() { return sType(ANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_PROPERTIES_ANDROID); }
        /** Sets the specified value to the {@link VkAndroidHardwareBufferPropertiesANDROID#pNext} field. */
        public VkAndroidHardwareBufferPropertiesANDROID.Buffer pNext(@NativeType("void *") long value) { VkAndroidHardwareBufferPropertiesANDROID.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkAndroidHardwareBufferFormatProperties2ANDROID} value to the {@code pNext} chain. */
        public VkAndroidHardwareBufferPropertiesANDROID.Buffer pNext(VkAndroidHardwareBufferFormatProperties2ANDROID value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkAndroidHardwareBufferFormatPropertiesANDROID} value to the {@code pNext} chain. */
        public VkAndroidHardwareBufferPropertiesANDROID.Buffer pNext(VkAndroidHardwareBufferFormatPropertiesANDROID value) { return this.pNext(value.pNext(this.pNext()).address()); }

    }

}