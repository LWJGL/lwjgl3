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
 * Structure describing a remote accessible address export operation.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code handleType} <b>must</b> have been included in {@link VkExportMemoryAllocateInfo}{@code ::handleTypes} when {@code memory} was created</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVExternalMemoryRdma#VK_STRUCTURE_TYPE_MEMORY_GET_REMOTE_ADDRESS_INFO_NV STRUCTURE_TYPE_MEMORY_GET_REMOTE_ADDRESS_INFO_NV}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
 * <li>{@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBits} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link NVExternalMemoryRdma#vkGetMemoryRemoteAddressNV GetMemoryRemoteAddressNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMemoryGetRemoteAddressInfoNV {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDeviceMemory {@link #memory};
 *     VkExternalMemoryHandleTypeFlagBits {@link #handleType};
 * }</code></pre>
 */
public class VkMemoryGetRemoteAddressInfoNV extends Struct<VkMemoryGetRemoteAddressInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MEMORY,
        HANDLETYPE;

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
        MEMORY = layout.offsetof(2);
        HANDLETYPE = layout.offsetof(3);
    }

    protected VkMemoryGetRemoteAddressInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMemoryGetRemoteAddressInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkMemoryGetRemoteAddressInfoNV(address, container);
    }

    /**
     * Creates a {@code VkMemoryGetRemoteAddressInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryGetRemoteAddressInfoNV(ByteBuffer container) {
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
    /** the memory object from which the remote accessible address will be exported. */
    @NativeType("VkDeviceMemory")
    public long memory() { return nmemory(address()); }
    /** the type of handle requested. */
    @NativeType("VkExternalMemoryHandleTypeFlagBits")
    public int handleType() { return nhandleType(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkMemoryGetRemoteAddressInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVExternalMemoryRdma#VK_STRUCTURE_TYPE_MEMORY_GET_REMOTE_ADDRESS_INFO_NV STRUCTURE_TYPE_MEMORY_GET_REMOTE_ADDRESS_INFO_NV} value to the {@link #sType} field. */
    public VkMemoryGetRemoteAddressInfoNV sType$Default() { return sType(NVExternalMemoryRdma.VK_STRUCTURE_TYPE_MEMORY_GET_REMOTE_ADDRESS_INFO_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkMemoryGetRemoteAddressInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #memory} field. */
    public VkMemoryGetRemoteAddressInfoNV memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }
    /** Sets the specified value to the {@link #handleType} field. */
    public VkMemoryGetRemoteAddressInfoNV handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) { nhandleType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryGetRemoteAddressInfoNV set(
        int sType,
        long pNext,
        long memory,
        int handleType
    ) {
        sType(sType);
        pNext(pNext);
        memory(memory);
        handleType(handleType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryGetRemoteAddressInfoNV set(VkMemoryGetRemoteAddressInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryGetRemoteAddressInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryGetRemoteAddressInfoNV malloc() {
        return new VkMemoryGetRemoteAddressInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryGetRemoteAddressInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryGetRemoteAddressInfoNV calloc() {
        return new VkMemoryGetRemoteAddressInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryGetRemoteAddressInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkMemoryGetRemoteAddressInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryGetRemoteAddressInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryGetRemoteAddressInfoNV} instance for the specified memory address. */
    public static VkMemoryGetRemoteAddressInfoNV create(long address) {
        return new VkMemoryGetRemoteAddressInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkMemoryGetRemoteAddressInfoNV createSafe(long address) {
        return address == NULL ? null : new VkMemoryGetRemoteAddressInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkMemoryGetRemoteAddressInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryGetRemoteAddressInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryGetRemoteAddressInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryGetRemoteAddressInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryGetRemoteAddressInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryGetRemoteAddressInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMemoryGetRemoteAddressInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryGetRemoteAddressInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkMemoryGetRemoteAddressInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkMemoryGetRemoteAddressInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryGetRemoteAddressInfoNV malloc(MemoryStack stack) {
        return new VkMemoryGetRemoteAddressInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMemoryGetRemoteAddressInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryGetRemoteAddressInfoNV calloc(MemoryStack stack) {
        return new VkMemoryGetRemoteAddressInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMemoryGetRemoteAddressInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryGetRemoteAddressInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryGetRemoteAddressInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryGetRemoteAddressInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkMemoryGetRemoteAddressInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryGetRemoteAddressInfoNV.PNEXT); }
    /** Unsafe version of {@link #memory}. */
    public static long nmemory(long struct) { return memGetLong(struct + VkMemoryGetRemoteAddressInfoNV.MEMORY); }
    /** Unsafe version of {@link #handleType}. */
    public static int nhandleType(long struct) { return memGetInt(struct + VkMemoryGetRemoteAddressInfoNV.HANDLETYPE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkMemoryGetRemoteAddressInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryGetRemoteAddressInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #memory(long) memory}. */
    public static void nmemory(long struct, long value) { memPutLong(struct + VkMemoryGetRemoteAddressInfoNV.MEMORY, value); }
    /** Unsafe version of {@link #handleType(int) handleType}. */
    public static void nhandleType(long struct, int value) { memPutInt(struct + VkMemoryGetRemoteAddressInfoNV.HANDLETYPE, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryGetRemoteAddressInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkMemoryGetRemoteAddressInfoNV, Buffer> implements NativeResource {

        private static final VkMemoryGetRemoteAddressInfoNV ELEMENT_FACTORY = VkMemoryGetRemoteAddressInfoNV.create(-1L);

        /**
         * Creates a new {@code VkMemoryGetRemoteAddressInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryGetRemoteAddressInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMemoryGetRemoteAddressInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkMemoryGetRemoteAddressInfoNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryGetRemoteAddressInfoNV.nsType(address()); }
        /** @return the value of the {@link VkMemoryGetRemoteAddressInfoNV#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMemoryGetRemoteAddressInfoNV.npNext(address()); }
        /** @return the value of the {@link VkMemoryGetRemoteAddressInfoNV#memory} field. */
        @NativeType("VkDeviceMemory")
        public long memory() { return VkMemoryGetRemoteAddressInfoNV.nmemory(address()); }
        /** @return the value of the {@link VkMemoryGetRemoteAddressInfoNV#handleType} field. */
        @NativeType("VkExternalMemoryHandleTypeFlagBits")
        public int handleType() { return VkMemoryGetRemoteAddressInfoNV.nhandleType(address()); }

        /** Sets the specified value to the {@link VkMemoryGetRemoteAddressInfoNV#sType} field. */
        public VkMemoryGetRemoteAddressInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryGetRemoteAddressInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVExternalMemoryRdma#VK_STRUCTURE_TYPE_MEMORY_GET_REMOTE_ADDRESS_INFO_NV STRUCTURE_TYPE_MEMORY_GET_REMOTE_ADDRESS_INFO_NV} value to the {@link VkMemoryGetRemoteAddressInfoNV#sType} field. */
        public VkMemoryGetRemoteAddressInfoNV.Buffer sType$Default() { return sType(NVExternalMemoryRdma.VK_STRUCTURE_TYPE_MEMORY_GET_REMOTE_ADDRESS_INFO_NV); }
        /** Sets the specified value to the {@link VkMemoryGetRemoteAddressInfoNV#pNext} field. */
        public VkMemoryGetRemoteAddressInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkMemoryGetRemoteAddressInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkMemoryGetRemoteAddressInfoNV#memory} field. */
        public VkMemoryGetRemoteAddressInfoNV.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkMemoryGetRemoteAddressInfoNV.nmemory(address(), value); return this; }
        /** Sets the specified value to the {@link VkMemoryGetRemoteAddressInfoNV#handleType} field. */
        public VkMemoryGetRemoteAddressInfoNV.Buffer handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) { VkMemoryGetRemoteAddressInfoNV.nhandleType(address(), value); return this; }

    }

}