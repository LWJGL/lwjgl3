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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.KHRPipelineBinary.*;

/**
 * Structure specifying a key to a pipeline binary.
 * 
 * <h5>Description</h5>
 * 
 * <p>Any returned values beyond the first {@code keySize} bytes are undefined. Implementations <b>must</b> return a {@code keySize} greater than 0, and less-or-equal to {@link KHRPipelineBinary#VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR MAX_PIPELINE_BINARY_KEY_SIZE_KHR}.</p>
 * 
 * <p>Two keys are considered equal if {@code keySize} is equal and the first {@code keySize} bytes of {@code key} compare equal.</p>
 * 
 * <p>Implementations <b>may</b> return a different {@code keySize} for different binaries.</p>
 * 
 * <p>Implementations <b>should</b> ensure that {@code keySize} is large enough to uniquely identify a pipeline binary.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRPipelineBinary#VK_STRUCTURE_TYPE_PIPELINE_BINARY_KEY_KHR STRUCTURE_TYPE_PIPELINE_BINARY_KEY_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPipelineBinaryKeysAndDataKHR}, {@link KHRPipelineBinary#vkGetPipelineBinaryDataKHR GetPipelineBinaryDataKHR}, {@link KHRPipelineBinary#vkGetPipelineKeyKHR GetPipelineKeyKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineBinaryKeyKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #keySize};
 *     uint8_t {@link #key}[VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR];
 * }</code></pre>
 */
public class VkPipelineBinaryKeyKHR extends Struct<VkPipelineBinaryKeyKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        KEYSIZE,
        KEY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __array(1, VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        KEYSIZE = layout.offsetof(2);
        KEY = layout.offsetof(3);
    }

    protected VkPipelineBinaryKeyKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineBinaryKeyKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineBinaryKeyKHR(address, container);
    }

    /**
     * Creates a {@code VkPipelineBinaryKeyKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineBinaryKeyKHR(ByteBuffer container) {
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
    /** the size, in bytes, of valid data returned in {@code key}. */
    @NativeType("uint32_t")
    public int keySize() { return nkeySize(address()); }
    /** a buffer of opaque data specifying a pipeline binary key. */
    @NativeType("uint8_t[VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR]")
    public ByteBuffer key() { return nkey(address()); }
    /** a buffer of opaque data specifying a pipeline binary key. */
    @NativeType("uint8_t")
    public byte key(int index) { return nkey(address(), index); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineBinaryKeyKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPipelineBinary#VK_STRUCTURE_TYPE_PIPELINE_BINARY_KEY_KHR STRUCTURE_TYPE_PIPELINE_BINARY_KEY_KHR} value to the {@link #sType} field. */
    public VkPipelineBinaryKeyKHR sType$Default() { return sType(KHRPipelineBinary.VK_STRUCTURE_TYPE_PIPELINE_BINARY_KEY_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineBinaryKeyKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #keySize} field. */
    public VkPipelineBinaryKeyKHR keySize(@NativeType("uint32_t") int value) { nkeySize(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@link #key} field. */
    public VkPipelineBinaryKeyKHR key(@NativeType("uint8_t[VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR]") ByteBuffer value) { nkey(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #key} field. */
    public VkPipelineBinaryKeyKHR key(int index, @NativeType("uint8_t") byte value) { nkey(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineBinaryKeyKHR set(
        int sType,
        long pNext,
        int keySize,
        ByteBuffer key
    ) {
        sType(sType);
        pNext(pNext);
        keySize(keySize);
        key(key);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineBinaryKeyKHR set(VkPipelineBinaryKeyKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineBinaryKeyKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineBinaryKeyKHR malloc() {
        return new VkPipelineBinaryKeyKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineBinaryKeyKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineBinaryKeyKHR calloc() {
        return new VkPipelineBinaryKeyKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineBinaryKeyKHR} instance allocated with {@link BufferUtils}. */
    public static VkPipelineBinaryKeyKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineBinaryKeyKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineBinaryKeyKHR} instance for the specified memory address. */
    public static VkPipelineBinaryKeyKHR create(long address) {
        return new VkPipelineBinaryKeyKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineBinaryKeyKHR createSafe(long address) {
        return address == NULL ? null : new VkPipelineBinaryKeyKHR(address, null);
    }

    /**
     * Returns a new {@link VkPipelineBinaryKeyKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryKeyKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineBinaryKeyKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryKeyKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineBinaryKeyKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryKeyKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineBinaryKeyKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryKeyKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineBinaryKeyKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineBinaryKeyKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineBinaryKeyKHR malloc(MemoryStack stack) {
        return new VkPipelineBinaryKeyKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineBinaryKeyKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineBinaryKeyKHR calloc(MemoryStack stack) {
        return new VkPipelineBinaryKeyKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineBinaryKeyKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryKeyKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineBinaryKeyKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryKeyKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineBinaryKeyKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineBinaryKeyKHR.PNEXT); }
    /** Unsafe version of {@link #keySize}. */
    public static int nkeySize(long struct) { return memGetInt(struct + VkPipelineBinaryKeyKHR.KEYSIZE); }
    /** Unsafe version of {@link #key}. */
    public static ByteBuffer nkey(long struct) { return memByteBuffer(struct + VkPipelineBinaryKeyKHR.KEY, VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR); }
    /** Unsafe version of {@link #key(int) key}. */
    public static byte nkey(long struct, int index) {
        return memGetByte(struct + VkPipelineBinaryKeyKHR.KEY + check(index, VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR) * 1);
    }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineBinaryKeyKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineBinaryKeyKHR.PNEXT, value); }
    /** Unsafe version of {@link #keySize(int) keySize}. */
    public static void nkeySize(long struct, int value) { memPutInt(struct + VkPipelineBinaryKeyKHR.KEYSIZE, value); }
    /** Unsafe version of {@link #key(ByteBuffer) key}. */
    public static void nkey(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR); }
        memCopy(memAddress(value), struct + VkPipelineBinaryKeyKHR.KEY, value.remaining() * 1);
    }
    /** Unsafe version of {@link #key(int, byte) key}. */
    public static void nkey(long struct, int index, byte value) {
        memPutByte(struct + VkPipelineBinaryKeyKHR.KEY + check(index, VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link VkPipelineBinaryKeyKHR} structs. */
    public static class Buffer extends StructBuffer<VkPipelineBinaryKeyKHR, Buffer> implements NativeResource {

        private static final VkPipelineBinaryKeyKHR ELEMENT_FACTORY = VkPipelineBinaryKeyKHR.create(-1L);

        /**
         * Creates a new {@code VkPipelineBinaryKeyKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineBinaryKeyKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineBinaryKeyKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineBinaryKeyKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineBinaryKeyKHR.nsType(address()); }
        /** @return the value of the {@link VkPipelineBinaryKeyKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPipelineBinaryKeyKHR.npNext(address()); }
        /** @return the value of the {@link VkPipelineBinaryKeyKHR#keySize} field. */
        @NativeType("uint32_t")
        public int keySize() { return VkPipelineBinaryKeyKHR.nkeySize(address()); }
        /** @return a {@link ByteBuffer} view of the {@link VkPipelineBinaryKeyKHR#key} field. */
        @NativeType("uint8_t[VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR]")
        public ByteBuffer key() { return VkPipelineBinaryKeyKHR.nkey(address()); }
        /** @return the value at the specified index of the {@link VkPipelineBinaryKeyKHR#key} field. */
        @NativeType("uint8_t")
        public byte key(int index) { return VkPipelineBinaryKeyKHR.nkey(address(), index); }

        /** Sets the specified value to the {@link VkPipelineBinaryKeyKHR#sType} field. */
        public VkPipelineBinaryKeyKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineBinaryKeyKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPipelineBinary#VK_STRUCTURE_TYPE_PIPELINE_BINARY_KEY_KHR STRUCTURE_TYPE_PIPELINE_BINARY_KEY_KHR} value to the {@link VkPipelineBinaryKeyKHR#sType} field. */
        public VkPipelineBinaryKeyKHR.Buffer sType$Default() { return sType(KHRPipelineBinary.VK_STRUCTURE_TYPE_PIPELINE_BINARY_KEY_KHR); }
        /** Sets the specified value to the {@link VkPipelineBinaryKeyKHR#pNext} field. */
        public VkPipelineBinaryKeyKHR.Buffer pNext(@NativeType("void *") long value) { VkPipelineBinaryKeyKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineBinaryKeyKHR#keySize} field. */
        public VkPipelineBinaryKeyKHR.Buffer keySize(@NativeType("uint32_t") int value) { VkPipelineBinaryKeyKHR.nkeySize(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@link VkPipelineBinaryKeyKHR#key} field. */
        public VkPipelineBinaryKeyKHR.Buffer key(@NativeType("uint8_t[VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR]") ByteBuffer value) { VkPipelineBinaryKeyKHR.nkey(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link VkPipelineBinaryKeyKHR#key} field. */
        public VkPipelineBinaryKeyKHR.Buffer key(int index, @NativeType("uint8_t") byte value) { VkPipelineBinaryKeyKHR.nkey(address(), index, value); return this; }

    }

}