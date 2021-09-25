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
 * Structure describing features supported by VK_KHR_16bit_storage.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDevice16BitStorageFeatures} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDevice16BitStorageFeatures} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDevice16BitStorageFeatures {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #storageBuffer16BitAccess};
 *     VkBool32 {@link #uniformAndStorageBuffer16BitAccess};
 *     VkBool32 {@link #storagePushConstant16};
 *     VkBool32 {@link #storageInputOutput16};
 * }</code></pre>
 */
public class VkPhysicalDevice16BitStorageFeatures extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STORAGEBUFFER16BITACCESS,
        UNIFORMANDSTORAGEBUFFER16BITACCESS,
        STORAGEPUSHCONSTANT16,
        STORAGEINPUTOUTPUT16;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STORAGEBUFFER16BITACCESS = layout.offsetof(2);
        UNIFORMANDSTORAGEBUFFER16BITACCESS = layout.offsetof(3);
        STORAGEPUSHCONSTANT16 = layout.offsetof(4);
        STORAGEINPUTOUTPUT16 = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkPhysicalDevice16BitStorageFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevice16BitStorageFeatures(ByteBuffer container) {
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
    /** specifies whether objects in the {@code StorageBuffer}, {@code ShaderRecordBufferKHR}, or {@code PhysicalStorageBuffer} storage class with the {@code Block} decoration <b>can</b> have 16-bit integer and 16-bit floating-point members. If this feature is not enabled, 16-bit integer or 16-bit floating-point members <b>must</b> not be used in such objects. This also specifies whether shader modules <b>can</b> declare the {@code StorageBuffer16BitAccess} capability. */
    @NativeType("VkBool32")
    public boolean storageBuffer16BitAccess() { return nstorageBuffer16BitAccess(address()) != 0; }
    /** specifies whether objects in the {@code Uniform} storage class with the {@code Block} decoration <b>can</b> have 16-bit integer and 16-bit floating-point members. If this feature is not enabled, 16-bit integer or 16-bit floating-point members <b>must</b> not be used in such objects. This also specifies whether shader modules <b>can</b> declare the {@code UniformAndStorageBuffer16BitAccess} capability. */
    @NativeType("VkBool32")
    public boolean uniformAndStorageBuffer16BitAccess() { return nuniformAndStorageBuffer16BitAccess(address()) != 0; }
    /** specifies whether objects in the {@code PushConstant} storage class <b>can</b> have 16-bit integer and 16-bit floating-point members. If this feature is not enabled, 16-bit integer or floating-point members <b>must</b> not be used in such objects. This also specifies whether shader modules <b>can</b> declare the {@code StoragePushConstant16} capability. */
    @NativeType("VkBool32")
    public boolean storagePushConstant16() { return nstoragePushConstant16(address()) != 0; }
    /** specifies whether objects in the {@code Input} and {@code Output} storage classes <b>can</b> have 16-bit integer and 16-bit floating-point members. If this feature is not enabled, 16-bit integer or 16-bit floating-point members <b>must</b> not be used in such objects. This also specifies whether shader modules <b>can</b> declare the {@code StorageInputOutput16} capability. */
    @NativeType("VkBool32")
    public boolean storageInputOutput16() { return nstorageInputOutput16(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDevice16BitStorageFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES} value to the {@link #sType} field. */
    public VkPhysicalDevice16BitStorageFeatures sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDevice16BitStorageFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #storageBuffer16BitAccess} field. */
    public VkPhysicalDevice16BitStorageFeatures storageBuffer16BitAccess(@NativeType("VkBool32") boolean value) { nstorageBuffer16BitAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #uniformAndStorageBuffer16BitAccess} field. */
    public VkPhysicalDevice16BitStorageFeatures uniformAndStorageBuffer16BitAccess(@NativeType("VkBool32") boolean value) { nuniformAndStorageBuffer16BitAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #storagePushConstant16} field. */
    public VkPhysicalDevice16BitStorageFeatures storagePushConstant16(@NativeType("VkBool32") boolean value) { nstoragePushConstant16(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #storageInputOutput16} field. */
    public VkPhysicalDevice16BitStorageFeatures storageInputOutput16(@NativeType("VkBool32") boolean value) { nstorageInputOutput16(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevice16BitStorageFeatures set(
        int sType,
        long pNext,
        boolean storageBuffer16BitAccess,
        boolean uniformAndStorageBuffer16BitAccess,
        boolean storagePushConstant16,
        boolean storageInputOutput16
    ) {
        sType(sType);
        pNext(pNext);
        storageBuffer16BitAccess(storageBuffer16BitAccess);
        uniformAndStorageBuffer16BitAccess(uniformAndStorageBuffer16BitAccess);
        storagePushConstant16(storagePushConstant16);
        storageInputOutput16(storageInputOutput16);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevice16BitStorageFeatures set(VkPhysicalDevice16BitStorageFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevice16BitStorageFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevice16BitStorageFeatures malloc() {
        return wrap(VkPhysicalDevice16BitStorageFeatures.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDevice16BitStorageFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevice16BitStorageFeatures calloc() {
        return wrap(VkPhysicalDevice16BitStorageFeatures.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDevice16BitStorageFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevice16BitStorageFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDevice16BitStorageFeatures.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevice16BitStorageFeatures} instance for the specified memory address. */
    public static VkPhysicalDevice16BitStorageFeatures create(long address) {
        return wrap(VkPhysicalDevice16BitStorageFeatures.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevice16BitStorageFeatures createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDevice16BitStorageFeatures.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDevice16BitStorageFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice16BitStorageFeatures.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevice16BitStorageFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice16BitStorageFeatures.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevice16BitStorageFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice16BitStorageFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDevice16BitStorageFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice16BitStorageFeatures.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevice16BitStorageFeatures.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevice16BitStorageFeatures mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevice16BitStorageFeatures callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevice16BitStorageFeatures mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevice16BitStorageFeatures callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevice16BitStorageFeatures.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevice16BitStorageFeatures.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevice16BitStorageFeatures.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevice16BitStorageFeatures.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDevice16BitStorageFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevice16BitStorageFeatures malloc(MemoryStack stack) {
        return wrap(VkPhysicalDevice16BitStorageFeatures.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDevice16BitStorageFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevice16BitStorageFeatures calloc(MemoryStack stack) {
        return wrap(VkPhysicalDevice16BitStorageFeatures.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDevice16BitStorageFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice16BitStorageFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevice16BitStorageFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice16BitStorageFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevice16BitStorageFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevice16BitStorageFeatures.PNEXT); }
    /** Unsafe version of {@link #storageBuffer16BitAccess}. */
    public static int nstorageBuffer16BitAccess(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevice16BitStorageFeatures.STORAGEBUFFER16BITACCESS); }
    /** Unsafe version of {@link #uniformAndStorageBuffer16BitAccess}. */
    public static int nuniformAndStorageBuffer16BitAccess(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevice16BitStorageFeatures.UNIFORMANDSTORAGEBUFFER16BITACCESS); }
    /** Unsafe version of {@link #storagePushConstant16}. */
    public static int nstoragePushConstant16(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevice16BitStorageFeatures.STORAGEPUSHCONSTANT16); }
    /** Unsafe version of {@link #storageInputOutput16}. */
    public static int nstorageInputOutput16(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevice16BitStorageFeatures.STORAGEINPUTOUTPUT16); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevice16BitStorageFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevice16BitStorageFeatures.PNEXT, value); }
    /** Unsafe version of {@link #storageBuffer16BitAccess(boolean) storageBuffer16BitAccess}. */
    public static void nstorageBuffer16BitAccess(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevice16BitStorageFeatures.STORAGEBUFFER16BITACCESS, value); }
    /** Unsafe version of {@link #uniformAndStorageBuffer16BitAccess(boolean) uniformAndStorageBuffer16BitAccess}. */
    public static void nuniformAndStorageBuffer16BitAccess(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevice16BitStorageFeatures.UNIFORMANDSTORAGEBUFFER16BITACCESS, value); }
    /** Unsafe version of {@link #storagePushConstant16(boolean) storagePushConstant16}. */
    public static void nstoragePushConstant16(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevice16BitStorageFeatures.STORAGEPUSHCONSTANT16, value); }
    /** Unsafe version of {@link #storageInputOutput16(boolean) storageInputOutput16}. */
    public static void nstorageInputOutput16(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevice16BitStorageFeatures.STORAGEINPUTOUTPUT16, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevice16BitStorageFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevice16BitStorageFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDevice16BitStorageFeatures ELEMENT_FACTORY = VkPhysicalDevice16BitStorageFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevice16BitStorageFeatures.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevice16BitStorageFeatures#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDevice16BitStorageFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDevice16BitStorageFeatures#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevice16BitStorageFeatures.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDevice16BitStorageFeatures#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevice16BitStorageFeatures.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDevice16BitStorageFeatures#storageBuffer16BitAccess} field. */
        @NativeType("VkBool32")
        public boolean storageBuffer16BitAccess() { return VkPhysicalDevice16BitStorageFeatures.nstorageBuffer16BitAccess(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDevice16BitStorageFeatures#uniformAndStorageBuffer16BitAccess} field. */
        @NativeType("VkBool32")
        public boolean uniformAndStorageBuffer16BitAccess() { return VkPhysicalDevice16BitStorageFeatures.nuniformAndStorageBuffer16BitAccess(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDevice16BitStorageFeatures#storagePushConstant16} field. */
        @NativeType("VkBool32")
        public boolean storagePushConstant16() { return VkPhysicalDevice16BitStorageFeatures.nstoragePushConstant16(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDevice16BitStorageFeatures#storageInputOutput16} field. */
        @NativeType("VkBool32")
        public boolean storageInputOutput16() { return VkPhysicalDevice16BitStorageFeatures.nstorageInputOutput16(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDevice16BitStorageFeatures#sType} field. */
        public VkPhysicalDevice16BitStorageFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevice16BitStorageFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES} value to the {@link VkPhysicalDevice16BitStorageFeatures#sType} field. */
        public VkPhysicalDevice16BitStorageFeatures.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES); }
        /** Sets the specified value to the {@link VkPhysicalDevice16BitStorageFeatures#pNext} field. */
        public VkPhysicalDevice16BitStorageFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevice16BitStorageFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDevice16BitStorageFeatures#storageBuffer16BitAccess} field. */
        public VkPhysicalDevice16BitStorageFeatures.Buffer storageBuffer16BitAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDevice16BitStorageFeatures.nstorageBuffer16BitAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDevice16BitStorageFeatures#uniformAndStorageBuffer16BitAccess} field. */
        public VkPhysicalDevice16BitStorageFeatures.Buffer uniformAndStorageBuffer16BitAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDevice16BitStorageFeatures.nuniformAndStorageBuffer16BitAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDevice16BitStorageFeatures#storagePushConstant16} field. */
        public VkPhysicalDevice16BitStorageFeatures.Buffer storagePushConstant16(@NativeType("VkBool32") boolean value) { VkPhysicalDevice16BitStorageFeatures.nstoragePushConstant16(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDevice16BitStorageFeatures#storageInputOutput16} field. */
        public VkPhysicalDevice16BitStorageFeatures.Buffer storageInputOutput16(@NativeType("VkBool32") boolean value) { VkPhysicalDevice16BitStorageFeatures.nstorageInputOutput16(address(), value ? 1 : 0); return this; }

    }

}