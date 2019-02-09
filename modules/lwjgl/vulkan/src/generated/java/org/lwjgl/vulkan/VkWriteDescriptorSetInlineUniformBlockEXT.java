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
 * <li>{@code sType} <b>must</b> be {@link EXTInlineUniformBlock#VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK_EXT STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK_EXT}</li>
 * <li>{@code pData} <b>must</b> be a valid pointer to an array of {@code dataSize} bytes</li>
 * <li>{@code dataSize} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code dataSize} &ndash; the number of bytes of inline uniform block data pointed to by {@code pData}.</li>
 * <li>{@code pData} &ndash; a pointer to {@code dataSize} number of bytes of data to write to the inline uniform block.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkWriteDescriptorSetInlineUniformBlockEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t dataSize;
 *     void const * pData;
 * }</code></pre>
 */
public class VkWriteDescriptorSetInlineUniformBlockEXT extends Struct implements NativeResource {

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
     * Creates a {@code VkWriteDescriptorSetInlineUniformBlockEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkWriteDescriptorSetInlineUniformBlockEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code dataSize} field. */
    @NativeType("uint32_t")
    public int dataSize() { return ndataSize(address()); }
    /** Returns a {@link ByteBuffer} view of the data pointed to by the {@code pData} field. */
    @NativeType("void const *")
    public ByteBuffer pData() { return npData(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkWriteDescriptorSetInlineUniformBlockEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkWriteDescriptorSetInlineUniformBlockEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code pData} field. */
    public VkWriteDescriptorSetInlineUniformBlockEXT pData(@NativeType("void const *") ByteBuffer value) { npData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkWriteDescriptorSetInlineUniformBlockEXT set(
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
    public VkWriteDescriptorSetInlineUniformBlockEXT set(VkWriteDescriptorSetInlineUniformBlockEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkWriteDescriptorSetInlineUniformBlockEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkWriteDescriptorSetInlineUniformBlockEXT malloc() {
        return wrap(VkWriteDescriptorSetInlineUniformBlockEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkWriteDescriptorSetInlineUniformBlockEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkWriteDescriptorSetInlineUniformBlockEXT calloc() {
        return wrap(VkWriteDescriptorSetInlineUniformBlockEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkWriteDescriptorSetInlineUniformBlockEXT} instance allocated with {@link BufferUtils}. */
    public static VkWriteDescriptorSetInlineUniformBlockEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkWriteDescriptorSetInlineUniformBlockEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkWriteDescriptorSetInlineUniformBlockEXT} instance for the specified memory address. */
    public static VkWriteDescriptorSetInlineUniformBlockEXT create(long address) {
        return wrap(VkWriteDescriptorSetInlineUniformBlockEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkWriteDescriptorSetInlineUniformBlockEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkWriteDescriptorSetInlineUniformBlockEXT.class, address);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetInlineUniformBlockEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetInlineUniformBlockEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetInlineUniformBlockEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetInlineUniformBlockEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetInlineUniformBlockEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetInlineUniformBlockEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkWriteDescriptorSetInlineUniformBlockEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetInlineUniformBlockEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkWriteDescriptorSetInlineUniformBlockEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkWriteDescriptorSetInlineUniformBlockEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkWriteDescriptorSetInlineUniformBlockEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkWriteDescriptorSetInlineUniformBlockEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkWriteDescriptorSetInlineUniformBlockEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkWriteDescriptorSetInlineUniformBlockEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkWriteDescriptorSetInlineUniformBlockEXT mallocStack(MemoryStack stack) {
        return wrap(VkWriteDescriptorSetInlineUniformBlockEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkWriteDescriptorSetInlineUniformBlockEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkWriteDescriptorSetInlineUniformBlockEXT callocStack(MemoryStack stack) {
        return wrap(VkWriteDescriptorSetInlineUniformBlockEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetInlineUniformBlockEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetInlineUniformBlockEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetInlineUniformBlockEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetInlineUniformBlockEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetInlineUniformBlockEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetInlineUniformBlockEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetInlineUniformBlockEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetInlineUniformBlockEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkWriteDescriptorSetInlineUniformBlockEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkWriteDescriptorSetInlineUniformBlockEXT.PNEXT); }
    /** Unsafe version of {@link #dataSize}. */
    public static int ndataSize(long struct) { return UNSAFE.getInt(null, struct + VkWriteDescriptorSetInlineUniformBlockEXT.DATASIZE); }
    /** Unsafe version of {@link #pData() pData}. */
    public static ByteBuffer npData(long struct) { return memByteBuffer(memGetAddress(struct + VkWriteDescriptorSetInlineUniformBlockEXT.PDATA), ndataSize(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkWriteDescriptorSetInlineUniformBlockEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkWriteDescriptorSetInlineUniformBlockEXT.PNEXT, value); }
    /** Sets the specified value to the {@code dataSize} field of the specified {@code struct}. */
    public static void ndataSize(long struct, int value) { UNSAFE.putInt(null, struct + VkWriteDescriptorSetInlineUniformBlockEXT.DATASIZE, value); }
    /** Unsafe version of {@link #pData(ByteBuffer) pData}. */
    public static void npData(long struct, ByteBuffer value) { memPutAddress(struct + VkWriteDescriptorSetInlineUniformBlockEXT.PDATA, memAddress(value)); ndataSize(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkWriteDescriptorSetInlineUniformBlockEXT.PDATA));
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

    /** An array of {@link VkWriteDescriptorSetInlineUniformBlockEXT} structs. */
    public static class Buffer extends StructBuffer<VkWriteDescriptorSetInlineUniformBlockEXT, Buffer> implements NativeResource {

        private static final VkWriteDescriptorSetInlineUniformBlockEXT ELEMENT_FACTORY = VkWriteDescriptorSetInlineUniformBlockEXT.create(-1L);

        /**
         * Creates a new {@code VkWriteDescriptorSetInlineUniformBlockEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkWriteDescriptorSetInlineUniformBlockEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkWriteDescriptorSetInlineUniformBlockEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkWriteDescriptorSetInlineUniformBlockEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkWriteDescriptorSetInlineUniformBlockEXT.npNext(address()); }
        /** Returns the value of the {@code dataSize} field. */
        @NativeType("uint32_t")
        public int dataSize() { return VkWriteDescriptorSetInlineUniformBlockEXT.ndataSize(address()); }
        /** Returns a {@link ByteBuffer} view of the data pointed to by the {@code pData} field. */
        @NativeType("void const *")
        public ByteBuffer pData() { return VkWriteDescriptorSetInlineUniformBlockEXT.npData(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkWriteDescriptorSetInlineUniformBlockEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkWriteDescriptorSetInlineUniformBlockEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkWriteDescriptorSetInlineUniformBlockEXT.Buffer pNext(@NativeType("void const *") long value) { VkWriteDescriptorSetInlineUniformBlockEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code pData} field. */
        public VkWriteDescriptorSetInlineUniformBlockEXT.Buffer pData(@NativeType("void const *") ByteBuffer value) { VkWriteDescriptorSetInlineUniformBlockEXT.npData(address(), value); return this; }

    }

}