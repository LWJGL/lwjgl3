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
 * Structure specifying the maximum number of inline uniform block bindings of a newly created descriptor pool.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTInlineUniformBlock#VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO_EXT STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDescriptorPoolInlineUniformBlockCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #maxInlineUniformBlockBindings};
 * }</code></pre>
 */
public class VkDescriptorPoolInlineUniformBlockCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXINLINEUNIFORMBLOCKBINDINGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXINLINEUNIFORMBLOCKBINDINGS = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkDescriptorPoolInlineUniformBlockCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorPoolInlineUniformBlockCreateInfoEXT(ByteBuffer container) {
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
    /** the number of inline uniform block bindings to allocate. */
    @NativeType("uint32_t")
    public int maxInlineUniformBlockBindings() { return nmaxInlineUniformBlockBindings(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDescriptorPoolInlineUniformBlockCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDescriptorPoolInlineUniformBlockCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #maxInlineUniformBlockBindings} field. */
    public VkDescriptorPoolInlineUniformBlockCreateInfoEXT maxInlineUniformBlockBindings(@NativeType("uint32_t") int value) { nmaxInlineUniformBlockBindings(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorPoolInlineUniformBlockCreateInfoEXT set(
        int sType,
        long pNext,
        int maxInlineUniformBlockBindings
    ) {
        sType(sType);
        pNext(pNext);
        maxInlineUniformBlockBindings(maxInlineUniformBlockBindings);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorPoolInlineUniformBlockCreateInfoEXT set(VkDescriptorPoolInlineUniformBlockCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorPoolInlineUniformBlockCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT malloc() {
        return wrap(VkDescriptorPoolInlineUniformBlockCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDescriptorPoolInlineUniformBlockCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT calloc() {
        return wrap(VkDescriptorPoolInlineUniformBlockCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDescriptorPoolInlineUniformBlockCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDescriptorPoolInlineUniformBlockCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorPoolInlineUniformBlockCreateInfoEXT} instance for the specified memory address. */
    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT create(long address) {
        return wrap(VkDescriptorPoolInlineUniformBlockCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkDescriptorPoolInlineUniformBlockCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDescriptorPoolInlineUniformBlockCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkDescriptorPoolInlineUniformBlockCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDescriptorPoolInlineUniformBlockCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkDescriptorPoolInlineUniformBlockCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorPoolInlineUniformBlockCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDescriptorPoolInlineUniformBlockCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #maxInlineUniformBlockBindings}. */
    public static int nmaxInlineUniformBlockBindings(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorPoolInlineUniformBlockCreateInfoEXT.MAXINLINEUNIFORMBLOCKBINDINGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorPoolInlineUniformBlockCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDescriptorPoolInlineUniformBlockCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #maxInlineUniformBlockBindings(int) maxInlineUniformBlockBindings}. */
    public static void nmaxInlineUniformBlockBindings(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorPoolInlineUniformBlockCreateInfoEXT.MAXINLINEUNIFORMBLOCKBINDINGS, value); }

    // -----------------------------------

    /** An array of {@link VkDescriptorPoolInlineUniformBlockCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorPoolInlineUniformBlockCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkDescriptorPoolInlineUniformBlockCreateInfoEXT ELEMENT_FACTORY = VkDescriptorPoolInlineUniformBlockCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorPoolInlineUniformBlockCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkDescriptorPoolInlineUniformBlockCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDescriptorPoolInlineUniformBlockCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDescriptorPoolInlineUniformBlockCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkDescriptorPoolInlineUniformBlockCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDescriptorPoolInlineUniformBlockCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkDescriptorPoolInlineUniformBlockCreateInfoEXT#maxInlineUniformBlockBindings} field. */
        @NativeType("uint32_t")
        public int maxInlineUniformBlockBindings() { return VkDescriptorPoolInlineUniformBlockCreateInfoEXT.nmaxInlineUniformBlockBindings(address()); }

        /** Sets the specified value to the {@link VkDescriptorPoolInlineUniformBlockCreateInfoEXT#sType} field. */
        public VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorPoolInlineUniformBlockCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@link VkDescriptorPoolInlineUniformBlockCreateInfoEXT#pNext} field. */
        public VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkDescriptorPoolInlineUniformBlockCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkDescriptorPoolInlineUniformBlockCreateInfoEXT#maxInlineUniformBlockBindings} field. */
        public VkDescriptorPoolInlineUniformBlockCreateInfoEXT.Buffer maxInlineUniformBlockBindings(@NativeType("uint32_t") int value) { VkDescriptorPoolInlineUniformBlockCreateInfoEXT.nmaxInlineUniformBlockBindings(address(), value); return this; }

    }

}