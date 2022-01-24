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
 * Structure describing features supported by VK_KHR_8bit_storage.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDevice8BitStorageFeatures} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDevice8BitStorageFeatures} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDevice8BitStorageFeatures {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #storageBuffer8BitAccess};
 *     VkBool32 {@link #uniformAndStorageBuffer8BitAccess};
 *     VkBool32 {@link #storagePushConstant8};
 * }</code></pre>
 */
public class VkPhysicalDevice8BitStorageFeatures extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STORAGEBUFFER8BITACCESS,
        UNIFORMANDSTORAGEBUFFER8BITACCESS,
        STORAGEPUSHCONSTANT8;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STORAGEBUFFER8BITACCESS = layout.offsetof(2);
        UNIFORMANDSTORAGEBUFFER8BITACCESS = layout.offsetof(3);
        STORAGEPUSHCONSTANT8 = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkPhysicalDevice8BitStorageFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevice8BitStorageFeatures(ByteBuffer container) {
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
    /** indicates whether objects in the {@code StorageBuffer}, {@code ShaderRecordBufferKHR}, or {@code PhysicalStorageBuffer} storage class with the {@code Block} decoration <b>can</b> have 8-bit integer members. If this feature is not enabled, 8-bit integer members <b>must</b> not be used in such objects. This also indicates whether shader modules <b>can</b> declare the {@code StorageBuffer8BitAccess} capability. */
    @NativeType("VkBool32")
    public boolean storageBuffer8BitAccess() { return nstorageBuffer8BitAccess(address()) != 0; }
    /** indicates whether objects in the {@code Uniform} storage class with the {@code Block} decoration <b>can</b> have 8-bit integer members. If this feature is not enabled, 8-bit integer members <b>must</b> not be used in such objects. This also indicates whether shader modules <b>can</b> declare the {@code UniformAndStorageBuffer8BitAccess} capability. */
    @NativeType("VkBool32")
    public boolean uniformAndStorageBuffer8BitAccess() { return nuniformAndStorageBuffer8BitAccess(address()) != 0; }
    /** indicates whether objects in the {@code PushConstant} storage class <b>can</b> have 8-bit integer members. If this feature is not enabled, 8-bit integer members <b>must</b> not be used in such objects. This also indicates whether shader modules <b>can</b> declare the {@code StoragePushConstant8} capability. */
    @NativeType("VkBool32")
    public boolean storagePushConstant8() { return nstoragePushConstant8(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDevice8BitStorageFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES} value to the {@link #sType} field. */
    public VkPhysicalDevice8BitStorageFeatures sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDevice8BitStorageFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #storageBuffer8BitAccess} field. */
    public VkPhysicalDevice8BitStorageFeatures storageBuffer8BitAccess(@NativeType("VkBool32") boolean value) { nstorageBuffer8BitAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #uniformAndStorageBuffer8BitAccess} field. */
    public VkPhysicalDevice8BitStorageFeatures uniformAndStorageBuffer8BitAccess(@NativeType("VkBool32") boolean value) { nuniformAndStorageBuffer8BitAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #storagePushConstant8} field. */
    public VkPhysicalDevice8BitStorageFeatures storagePushConstant8(@NativeType("VkBool32") boolean value) { nstoragePushConstant8(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevice8BitStorageFeatures set(
        int sType,
        long pNext,
        boolean storageBuffer8BitAccess,
        boolean uniformAndStorageBuffer8BitAccess,
        boolean storagePushConstant8
    ) {
        sType(sType);
        pNext(pNext);
        storageBuffer8BitAccess(storageBuffer8BitAccess);
        uniformAndStorageBuffer8BitAccess(uniformAndStorageBuffer8BitAccess);
        storagePushConstant8(storagePushConstant8);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevice8BitStorageFeatures set(VkPhysicalDevice8BitStorageFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevice8BitStorageFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevice8BitStorageFeatures malloc() {
        return wrap(VkPhysicalDevice8BitStorageFeatures.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDevice8BitStorageFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevice8BitStorageFeatures calloc() {
        return wrap(VkPhysicalDevice8BitStorageFeatures.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDevice8BitStorageFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevice8BitStorageFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDevice8BitStorageFeatures.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevice8BitStorageFeatures} instance for the specified memory address. */
    public static VkPhysicalDevice8BitStorageFeatures create(long address) {
        return wrap(VkPhysicalDevice8BitStorageFeatures.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevice8BitStorageFeatures createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDevice8BitStorageFeatures.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDevice8BitStorageFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice8BitStorageFeatures.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevice8BitStorageFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice8BitStorageFeatures.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevice8BitStorageFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice8BitStorageFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDevice8BitStorageFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice8BitStorageFeatures.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevice8BitStorageFeatures.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevice8BitStorageFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevice8BitStorageFeatures malloc(MemoryStack stack) {
        return wrap(VkPhysicalDevice8BitStorageFeatures.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDevice8BitStorageFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevice8BitStorageFeatures calloc(MemoryStack stack) {
        return wrap(VkPhysicalDevice8BitStorageFeatures.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDevice8BitStorageFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice8BitStorageFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevice8BitStorageFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice8BitStorageFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevice8BitStorageFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevice8BitStorageFeatures.PNEXT); }
    /** Unsafe version of {@link #storageBuffer8BitAccess}. */
    public static int nstorageBuffer8BitAccess(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevice8BitStorageFeatures.STORAGEBUFFER8BITACCESS); }
    /** Unsafe version of {@link #uniformAndStorageBuffer8BitAccess}. */
    public static int nuniformAndStorageBuffer8BitAccess(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevice8BitStorageFeatures.UNIFORMANDSTORAGEBUFFER8BITACCESS); }
    /** Unsafe version of {@link #storagePushConstant8}. */
    public static int nstoragePushConstant8(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevice8BitStorageFeatures.STORAGEPUSHCONSTANT8); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevice8BitStorageFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevice8BitStorageFeatures.PNEXT, value); }
    /** Unsafe version of {@link #storageBuffer8BitAccess(boolean) storageBuffer8BitAccess}. */
    public static void nstorageBuffer8BitAccess(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevice8BitStorageFeatures.STORAGEBUFFER8BITACCESS, value); }
    /** Unsafe version of {@link #uniformAndStorageBuffer8BitAccess(boolean) uniformAndStorageBuffer8BitAccess}. */
    public static void nuniformAndStorageBuffer8BitAccess(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevice8BitStorageFeatures.UNIFORMANDSTORAGEBUFFER8BITACCESS, value); }
    /** Unsafe version of {@link #storagePushConstant8(boolean) storagePushConstant8}. */
    public static void nstoragePushConstant8(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevice8BitStorageFeatures.STORAGEPUSHCONSTANT8, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevice8BitStorageFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevice8BitStorageFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDevice8BitStorageFeatures ELEMENT_FACTORY = VkPhysicalDevice8BitStorageFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevice8BitStorageFeatures.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevice8BitStorageFeatures#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDevice8BitStorageFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDevice8BitStorageFeatures#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevice8BitStorageFeatures.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDevice8BitStorageFeatures#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevice8BitStorageFeatures.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDevice8BitStorageFeatures#storageBuffer8BitAccess} field. */
        @NativeType("VkBool32")
        public boolean storageBuffer8BitAccess() { return VkPhysicalDevice8BitStorageFeatures.nstorageBuffer8BitAccess(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDevice8BitStorageFeatures#uniformAndStorageBuffer8BitAccess} field. */
        @NativeType("VkBool32")
        public boolean uniformAndStorageBuffer8BitAccess() { return VkPhysicalDevice8BitStorageFeatures.nuniformAndStorageBuffer8BitAccess(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDevice8BitStorageFeatures#storagePushConstant8} field. */
        @NativeType("VkBool32")
        public boolean storagePushConstant8() { return VkPhysicalDevice8BitStorageFeatures.nstoragePushConstant8(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDevice8BitStorageFeatures#sType} field. */
        public VkPhysicalDevice8BitStorageFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevice8BitStorageFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES} value to the {@link VkPhysicalDevice8BitStorageFeatures#sType} field. */
        public VkPhysicalDevice8BitStorageFeatures.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES); }
        /** Sets the specified value to the {@link VkPhysicalDevice8BitStorageFeatures#pNext} field. */
        public VkPhysicalDevice8BitStorageFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevice8BitStorageFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDevice8BitStorageFeatures#storageBuffer8BitAccess} field. */
        public VkPhysicalDevice8BitStorageFeatures.Buffer storageBuffer8BitAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDevice8BitStorageFeatures.nstorageBuffer8BitAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDevice8BitStorageFeatures#uniformAndStorageBuffer8BitAccess} field. */
        public VkPhysicalDevice8BitStorageFeatures.Buffer uniformAndStorageBuffer8BitAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDevice8BitStorageFeatures.nuniformAndStorageBuffer8BitAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDevice8BitStorageFeatures#storagePushConstant8} field. */
        public VkPhysicalDevice8BitStorageFeatures.Buffer storagePushConstant8(@NativeType("VkBool32") boolean value) { VkPhysicalDevice8BitStorageFeatures.nstoragePushConstant8(address(), value ? 1 : 0); return this; }

    }

}