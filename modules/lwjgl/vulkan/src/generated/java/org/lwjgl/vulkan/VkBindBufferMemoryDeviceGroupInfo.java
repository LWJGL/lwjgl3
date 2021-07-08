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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying device within a group to bind to.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link VkBindBufferMemoryDeviceGroupInfo} structure is defined as:</p>
 * 
 * <ul>
 * <li>{@code sType} is the type of this structure.</li>
 * <li>{@code pNext} is {@code NULL} or a pointer to a structure extending this structure.</li>
 * <li>{@code deviceIndexCount} is the number of elements in {@code pDeviceIndices}.</li>
 * <li>{@code pDeviceIndices} is a pointer to an array of device indices.</li>
 * </ul>
 * 
 * <p>If {@code deviceIndexCount} is greater than zero, then on device index <code>i</code> the buffer is attached to the instance of {@code memory} on the physical device with device index <code>pDeviceIndices[i]</code>.</p>
 * 
 * <p>If {@code deviceIndexCount} is zero and {@code memory} comes from a memory heap with the {@link VK11#VK_MEMORY_HEAP_MULTI_INSTANCE_BIT MEMORY_HEAP_MULTI_INSTANCE_BIT} bit set, then it is as if {@code pDeviceIndices} contains consecutive indices from zero to the number of physical devices in the logical device, minus one. In other words, by default each physical device attaches to its own instance of {@code memory}.</p>
 * 
 * <p>If {@code deviceIndexCount} is zero and {@code memory} comes from a memory heap without the {@link VK11#VK_MEMORY_HEAP_MULTI_INSTANCE_BIT MEMORY_HEAP_MULTI_INSTANCE_BIT} bit set, then it is as if {@code pDeviceIndices} contains an array of zeros. In other words, by default each physical device attaches to instance zero.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code deviceIndexCount} <b>must</b> either be zero or equal to the number of physical devices in the logical device</li>
 * <li>All elements of {@code pDeviceIndices} <b>must</b> be valid device indices</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO}</li>
 * <li>If {@code deviceIndexCount} is not 0, {@code pDeviceIndices} <b>must</b> be a valid pointer to an array of {@code deviceIndexCount} {@code uint32_t} values</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBindBufferMemoryDeviceGroupInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t deviceIndexCount;
 *     uint32_t const * pDeviceIndices;
 * }</code></pre>
 */
public class VkBindBufferMemoryDeviceGroupInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEVICEINDEXCOUNT,
        PDEVICEINDICES;

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
        DEVICEINDEXCOUNT = layout.offsetof(2);
        PDEVICEINDICES = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkBindBufferMemoryDeviceGroupInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindBufferMemoryDeviceGroupInfo(ByteBuffer container) {
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
    /** @return the value of the {@code deviceIndexCount} field. */
    @NativeType("uint32_t")
    public int deviceIndexCount() { return ndeviceIndexCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pDeviceIndices} field. */
    @Nullable
    @NativeType("uint32_t const *")
    public IntBuffer pDeviceIndices() { return npDeviceIndices(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkBindBufferMemoryDeviceGroupInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkBindBufferMemoryDeviceGroupInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pDeviceIndices} field. */
    public VkBindBufferMemoryDeviceGroupInfo pDeviceIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npDeviceIndices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBindBufferMemoryDeviceGroupInfo set(
        int sType,
        long pNext,
        @Nullable IntBuffer pDeviceIndices
    ) {
        sType(sType);
        pNext(pNext);
        pDeviceIndices(pDeviceIndices);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindBufferMemoryDeviceGroupInfo set(VkBindBufferMemoryDeviceGroupInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBindBufferMemoryDeviceGroupInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindBufferMemoryDeviceGroupInfo malloc() {
        return wrap(VkBindBufferMemoryDeviceGroupInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkBindBufferMemoryDeviceGroupInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindBufferMemoryDeviceGroupInfo calloc() {
        return wrap(VkBindBufferMemoryDeviceGroupInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkBindBufferMemoryDeviceGroupInfo} instance allocated with {@link BufferUtils}. */
    public static VkBindBufferMemoryDeviceGroupInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkBindBufferMemoryDeviceGroupInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkBindBufferMemoryDeviceGroupInfo} instance for the specified memory address. */
    public static VkBindBufferMemoryDeviceGroupInfo create(long address) {
        return wrap(VkBindBufferMemoryDeviceGroupInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindBufferMemoryDeviceGroupInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkBindBufferMemoryDeviceGroupInfo.class, address);
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryDeviceGroupInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryDeviceGroupInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryDeviceGroupInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkBindBufferMemoryDeviceGroupInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryDeviceGroupInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindBufferMemoryDeviceGroupInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkBindBufferMemoryDeviceGroupInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkBindBufferMemoryDeviceGroupInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkBindBufferMemoryDeviceGroupInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkBindBufferMemoryDeviceGroupInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkBindBufferMemoryDeviceGroupInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindBufferMemoryDeviceGroupInfo mallocStack(MemoryStack stack) {
        return wrap(VkBindBufferMemoryDeviceGroupInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkBindBufferMemoryDeviceGroupInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindBufferMemoryDeviceGroupInfo callocStack(MemoryStack stack) {
        return wrap(VkBindBufferMemoryDeviceGroupInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryDeviceGroupInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryDeviceGroupInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryDeviceGroupInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryDeviceGroupInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkBindBufferMemoryDeviceGroupInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBindBufferMemoryDeviceGroupInfo.PNEXT); }
    /** Unsafe version of {@link #deviceIndexCount}. */
    public static int ndeviceIndexCount(long struct) { return UNSAFE.getInt(null, struct + VkBindBufferMemoryDeviceGroupInfo.DEVICEINDEXCOUNT); }
    /** Unsafe version of {@link #pDeviceIndices() pDeviceIndices}. */
    @Nullable public static IntBuffer npDeviceIndices(long struct) { return memIntBufferSafe(memGetAddress(struct + VkBindBufferMemoryDeviceGroupInfo.PDEVICEINDICES), ndeviceIndexCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkBindBufferMemoryDeviceGroupInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBindBufferMemoryDeviceGroupInfo.PNEXT, value); }
    /** Sets the specified value to the {@code deviceIndexCount} field of the specified {@code struct}. */
    public static void ndeviceIndexCount(long struct, int value) { UNSAFE.putInt(null, struct + VkBindBufferMemoryDeviceGroupInfo.DEVICEINDEXCOUNT, value); }
    /** Unsafe version of {@link #pDeviceIndices(IntBuffer) pDeviceIndices}. */
    public static void npDeviceIndices(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkBindBufferMemoryDeviceGroupInfo.PDEVICEINDICES, memAddressSafe(value)); ndeviceIndexCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (ndeviceIndexCount(struct) != 0) {
            check(memGetAddress(struct + VkBindBufferMemoryDeviceGroupInfo.PDEVICEINDICES));
        }
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkBindBufferMemoryDeviceGroupInfo} structs. */
    public static class Buffer extends StructBuffer<VkBindBufferMemoryDeviceGroupInfo, Buffer> implements NativeResource {

        private static final VkBindBufferMemoryDeviceGroupInfo ELEMENT_FACTORY = VkBindBufferMemoryDeviceGroupInfo.create(-1L);

        /**
         * Creates a new {@code VkBindBufferMemoryDeviceGroupInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindBufferMemoryDeviceGroupInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkBindBufferMemoryDeviceGroupInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBindBufferMemoryDeviceGroupInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBindBufferMemoryDeviceGroupInfo.npNext(address()); }
        /** @return the value of the {@code deviceIndexCount} field. */
        @NativeType("uint32_t")
        public int deviceIndexCount() { return VkBindBufferMemoryDeviceGroupInfo.ndeviceIndexCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pDeviceIndices} field. */
        @Nullable
        @NativeType("uint32_t const *")
        public IntBuffer pDeviceIndices() { return VkBindBufferMemoryDeviceGroupInfo.npDeviceIndices(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkBindBufferMemoryDeviceGroupInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkBindBufferMemoryDeviceGroupInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkBindBufferMemoryDeviceGroupInfo.Buffer pNext(@NativeType("void const *") long value) { VkBindBufferMemoryDeviceGroupInfo.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pDeviceIndices} field. */
        public VkBindBufferMemoryDeviceGroupInfo.Buffer pDeviceIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkBindBufferMemoryDeviceGroupInfo.npDeviceIndices(address(), value); return this; }

    }

}