/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkPhysicalDevice8BitStorageFeatures {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 storageBuffer8BitAccess;
 *     VkBool32 uniformAndStorageBuffer8BitAccess;
 *     VkBool32 storagePushConstant8;
 * }}</pre>
 */
public class VkPhysicalDevice8BitStorageFeatures extends Struct<VkPhysicalDevice8BitStorageFeatures> implements NativeResource {

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

    protected VkPhysicalDevice8BitStorageFeatures(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDevice8BitStorageFeatures create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDevice8BitStorageFeatures(address, container);
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

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code storageBuffer8BitAccess} field. */
    @NativeType("VkBool32")
    public boolean storageBuffer8BitAccess() { return nstorageBuffer8BitAccess(address()) != 0; }
    /** @return the value of the {@code uniformAndStorageBuffer8BitAccess} field. */
    @NativeType("VkBool32")
    public boolean uniformAndStorageBuffer8BitAccess() { return nuniformAndStorageBuffer8BitAccess(address()) != 0; }
    /** @return the value of the {@code storagePushConstant8} field. */
    @NativeType("VkBool32")
    public boolean storagePushConstant8() { return nstoragePushConstant8(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDevice8BitStorageFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES} value to the {@code sType} field. */
    public VkPhysicalDevice8BitStorageFeatures sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDevice8BitStorageFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code storageBuffer8BitAccess} field. */
    public VkPhysicalDevice8BitStorageFeatures storageBuffer8BitAccess(@NativeType("VkBool32") boolean value) { nstorageBuffer8BitAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code uniformAndStorageBuffer8BitAccess} field. */
    public VkPhysicalDevice8BitStorageFeatures uniformAndStorageBuffer8BitAccess(@NativeType("VkBool32") boolean value) { nuniformAndStorageBuffer8BitAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code storagePushConstant8} field. */
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
        return new VkPhysicalDevice8BitStorageFeatures(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevice8BitStorageFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevice8BitStorageFeatures calloc() {
        return new VkPhysicalDevice8BitStorageFeatures(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevice8BitStorageFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevice8BitStorageFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevice8BitStorageFeatures(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevice8BitStorageFeatures} instance for the specified memory address. */
    public static VkPhysicalDevice8BitStorageFeatures create(long address) {
        return new VkPhysicalDevice8BitStorageFeatures(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDevice8BitStorageFeatures createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDevice8BitStorageFeatures(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDevice8BitStorageFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice8BitStorageFeatures.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevice8BitStorageFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice8BitStorageFeatures.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevice8BitStorageFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice8BitStorageFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDevice8BitStorageFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice8BitStorageFeatures.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDevice8BitStorageFeatures.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevice8BitStorageFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevice8BitStorageFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDevice8BitStorageFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDevice8BitStorageFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevice8BitStorageFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDevice8BitStorageFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDevice8BitStorageFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice8BitStorageFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevice8BitStorageFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice8BitStorageFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDevice8BitStorageFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevice8BitStorageFeatures.PNEXT); }
    /** Unsafe version of {@link #storageBuffer8BitAccess}. */
    public static int nstorageBuffer8BitAccess(long struct) { return memGetInt(struct + VkPhysicalDevice8BitStorageFeatures.STORAGEBUFFER8BITACCESS); }
    /** Unsafe version of {@link #uniformAndStorageBuffer8BitAccess}. */
    public static int nuniformAndStorageBuffer8BitAccess(long struct) { return memGetInt(struct + VkPhysicalDevice8BitStorageFeatures.UNIFORMANDSTORAGEBUFFER8BITACCESS); }
    /** Unsafe version of {@link #storagePushConstant8}. */
    public static int nstoragePushConstant8(long struct) { return memGetInt(struct + VkPhysicalDevice8BitStorageFeatures.STORAGEPUSHCONSTANT8); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDevice8BitStorageFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevice8BitStorageFeatures.PNEXT, value); }
    /** Unsafe version of {@link #storageBuffer8BitAccess(boolean) storageBuffer8BitAccess}. */
    public static void nstorageBuffer8BitAccess(long struct, int value) { memPutInt(struct + VkPhysicalDevice8BitStorageFeatures.STORAGEBUFFER8BITACCESS, value); }
    /** Unsafe version of {@link #uniformAndStorageBuffer8BitAccess(boolean) uniformAndStorageBuffer8BitAccess}. */
    public static void nuniformAndStorageBuffer8BitAccess(long struct, int value) { memPutInt(struct + VkPhysicalDevice8BitStorageFeatures.UNIFORMANDSTORAGEBUFFER8BITACCESS, value); }
    /** Unsafe version of {@link #storagePushConstant8(boolean) storagePushConstant8}. */
    public static void nstoragePushConstant8(long struct, int value) { memPutInt(struct + VkPhysicalDevice8BitStorageFeatures.STORAGEPUSHCONSTANT8, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevice8BitStorageFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevice8BitStorageFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDevice8BitStorageFeatures ELEMENT_FACTORY = VkPhysicalDevice8BitStorageFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevice8BitStorageFeatures.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevice8BitStorageFeatures#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkPhysicalDevice8BitStorageFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevice8BitStorageFeatures.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevice8BitStorageFeatures.npNext(address()); }
        /** @return the value of the {@code storageBuffer8BitAccess} field. */
        @NativeType("VkBool32")
        public boolean storageBuffer8BitAccess() { return VkPhysicalDevice8BitStorageFeatures.nstorageBuffer8BitAccess(address()) != 0; }
        /** @return the value of the {@code uniformAndStorageBuffer8BitAccess} field. */
        @NativeType("VkBool32")
        public boolean uniformAndStorageBuffer8BitAccess() { return VkPhysicalDevice8BitStorageFeatures.nuniformAndStorageBuffer8BitAccess(address()) != 0; }
        /** @return the value of the {@code storagePushConstant8} field. */
        @NativeType("VkBool32")
        public boolean storagePushConstant8() { return VkPhysicalDevice8BitStorageFeatures.nstoragePushConstant8(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDevice8BitStorageFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevice8BitStorageFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES} value to the {@code sType} field. */
        public VkPhysicalDevice8BitStorageFeatures.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDevice8BitStorageFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevice8BitStorageFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code storageBuffer8BitAccess} field. */
        public VkPhysicalDevice8BitStorageFeatures.Buffer storageBuffer8BitAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDevice8BitStorageFeatures.nstorageBuffer8BitAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code uniformAndStorageBuffer8BitAccess} field. */
        public VkPhysicalDevice8BitStorageFeatures.Buffer uniformAndStorageBuffer8BitAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDevice8BitStorageFeatures.nuniformAndStorageBuffer8BitAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code storagePushConstant8} field. */
        public VkPhysicalDevice8BitStorageFeatures.Buffer storagePushConstant8(@NativeType("VkBool32") boolean value) { VkPhysicalDevice8BitStorageFeatures.nstoragePushConstant8(address(), value ? 1 : 0); return this; }

    }

}