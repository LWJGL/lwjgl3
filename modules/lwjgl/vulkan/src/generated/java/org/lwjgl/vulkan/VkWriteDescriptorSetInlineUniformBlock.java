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
 * Structure specifying inline uniform block data.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code dataSize} <b>must</b> be an integer multiple of 4</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK}</li>
 * <li>{@code pData} <b>must</b> be a valid pointer to an array of {@code dataSize} bytes</li>
 * <li>{@code dataSize} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkWriteDescriptorSetInlineUniformBlock {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #dataSize};
 *     void const * {@link #pData};
 * }</code></pre>
 */
public class VkWriteDescriptorSetInlineUniformBlock extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DATASIZE,
        PDATA;

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
        DATASIZE = layout.offsetof(2);
        PDATA = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkWriteDescriptorSetInlineUniformBlock} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkWriteDescriptorSetInlineUniformBlock(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the number of bytes of inline uniform block data pointed to by {@code pData}. */
    @NativeType("uint32_t")
    public int dataSize() { return ndataSize(address()); }
    /** a pointer to {@code dataSize} number of bytes of data to write to the inline uniform block. */
    @NativeType("void const *")
    public ByteBuffer pData() { return npData(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkWriteDescriptorSetInlineUniformBlock sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK} value to the {@link #sType} field. */
    public VkWriteDescriptorSetInlineUniformBlock sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkWriteDescriptorSetInlineUniformBlock pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@link #pData} field. */
    public VkWriteDescriptorSetInlineUniformBlock pData(@NativeType("void const *") ByteBuffer value) { npData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkWriteDescriptorSetInlineUniformBlock set(
        int sType,
        long pNext,
        ByteBuffer pData
    ) {
        sType(sType);
        pNext(pNext);
        pData(pData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkWriteDescriptorSetInlineUniformBlock set(VkWriteDescriptorSetInlineUniformBlock src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkWriteDescriptorSetInlineUniformBlock} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkWriteDescriptorSetInlineUniformBlock malloc() {
        return wrap(VkWriteDescriptorSetInlineUniformBlock.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkWriteDescriptorSetInlineUniformBlock} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkWriteDescriptorSetInlineUniformBlock calloc() {
        return wrap(VkWriteDescriptorSetInlineUniformBlock.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkWriteDescriptorSetInlineUniformBlock} instance allocated with {@link BufferUtils}. */
    public static VkWriteDescriptorSetInlineUniformBlock create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkWriteDescriptorSetInlineUniformBlock.class, memAddress(container), container);
    }

    /** Returns a new {@code VkWriteDescriptorSetInlineUniformBlock} instance for the specified memory address. */
    public static VkWriteDescriptorSetInlineUniformBlock create(long address) {
        return wrap(VkWriteDescriptorSetInlineUniformBlock.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkWriteDescriptorSetInlineUniformBlock createSafe(long address) {
        return address == NULL ? null : wrap(VkWriteDescriptorSetInlineUniformBlock.class, address);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetInlineUniformBlock.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetInlineUniformBlock.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetInlineUniformBlock.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetInlineUniformBlock.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetInlineUniformBlock.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetInlineUniformBlock.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkWriteDescriptorSetInlineUniformBlock.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetInlineUniformBlock.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkWriteDescriptorSetInlineUniformBlock.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkWriteDescriptorSetInlineUniformBlock} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkWriteDescriptorSetInlineUniformBlock malloc(MemoryStack stack) {
        return wrap(VkWriteDescriptorSetInlineUniformBlock.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkWriteDescriptorSetInlineUniformBlock} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkWriteDescriptorSetInlineUniformBlock calloc(MemoryStack stack) {
        return wrap(VkWriteDescriptorSetInlineUniformBlock.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetInlineUniformBlock.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetInlineUniformBlock.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetInlineUniformBlock.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetInlineUniformBlock.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkWriteDescriptorSetInlineUniformBlock.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkWriteDescriptorSetInlineUniformBlock.PNEXT); }
    /** Unsafe version of {@link #dataSize}. */
    public static int ndataSize(long struct) { return UNSAFE.getInt(null, struct + VkWriteDescriptorSetInlineUniformBlock.DATASIZE); }
    /** Unsafe version of {@link #pData() pData}. */
    public static ByteBuffer npData(long struct) { return memByteBuffer(memGetAddress(struct + VkWriteDescriptorSetInlineUniformBlock.PDATA), ndataSize(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkWriteDescriptorSetInlineUniformBlock.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkWriteDescriptorSetInlineUniformBlock.PNEXT, value); }
    /** Sets the specified value to the {@code dataSize} field of the specified {@code struct}. */
    public static void ndataSize(long struct, int value) { UNSAFE.putInt(null, struct + VkWriteDescriptorSetInlineUniformBlock.DATASIZE, value); }
    /** Unsafe version of {@link #pData(ByteBuffer) pData}. */
    public static void npData(long struct, ByteBuffer value) { memPutAddress(struct + VkWriteDescriptorSetInlineUniformBlock.PDATA, memAddress(value)); ndataSize(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkWriteDescriptorSetInlineUniformBlock.PDATA));
    }

    // -----------------------------------

    /** An array of {@link VkWriteDescriptorSetInlineUniformBlock} structs. */
    public static class Buffer extends StructBuffer<VkWriteDescriptorSetInlineUniformBlock, Buffer> implements NativeResource {

        private static final VkWriteDescriptorSetInlineUniformBlock ELEMENT_FACTORY = VkWriteDescriptorSetInlineUniformBlock.create(-1L);

        /**
         * Creates a new {@code VkWriteDescriptorSetInlineUniformBlock.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkWriteDescriptorSetInlineUniformBlock#SIZEOF}, and its mark will be undefined.
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
        protected VkWriteDescriptorSetInlineUniformBlock getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkWriteDescriptorSetInlineUniformBlock#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkWriteDescriptorSetInlineUniformBlock.nsType(address()); }
        /** @return the value of the {@link VkWriteDescriptorSetInlineUniformBlock#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkWriteDescriptorSetInlineUniformBlock.npNext(address()); }
        /** @return the value of the {@link VkWriteDescriptorSetInlineUniformBlock#dataSize} field. */
        @NativeType("uint32_t")
        public int dataSize() { return VkWriteDescriptorSetInlineUniformBlock.ndataSize(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@link VkWriteDescriptorSetInlineUniformBlock#pData} field. */
        @NativeType("void const *")
        public ByteBuffer pData() { return VkWriteDescriptorSetInlineUniformBlock.npData(address()); }

        /** Sets the specified value to the {@link VkWriteDescriptorSetInlineUniformBlock#sType} field. */
        public VkWriteDescriptorSetInlineUniformBlock.Buffer sType(@NativeType("VkStructureType") int value) { VkWriteDescriptorSetInlineUniformBlock.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK} value to the {@link VkWriteDescriptorSetInlineUniformBlock#sType} field. */
        public VkWriteDescriptorSetInlineUniformBlock.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK); }
        /** Sets the specified value to the {@link VkWriteDescriptorSetInlineUniformBlock#pNext} field. */
        public VkWriteDescriptorSetInlineUniformBlock.Buffer pNext(@NativeType("void const *") long value) { VkWriteDescriptorSetInlineUniformBlock.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@link VkWriteDescriptorSetInlineUniformBlock#pData} field. */
        public VkWriteDescriptorSetInlineUniformBlock.Buffer pData(@NativeType("void const *") ByteBuffer value) { VkWriteDescriptorSetInlineUniformBlock.npData(address(), value); return this; }

    }

}