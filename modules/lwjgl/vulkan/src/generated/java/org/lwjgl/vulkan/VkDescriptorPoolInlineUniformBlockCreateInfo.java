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
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDescriptorPoolInlineUniformBlockCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #maxInlineUniformBlockBindings};
 * }</code></pre>
 */
public class VkDescriptorPoolInlineUniformBlockCreateInfo extends Struct implements NativeResource {

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
     * Creates a {@code VkDescriptorPoolInlineUniformBlockCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorPoolInlineUniformBlockCreateInfo(ByteBuffer container) {
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
    public VkDescriptorPoolInlineUniformBlockCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO} value to the {@link #sType} field. */
    public VkDescriptorPoolInlineUniformBlockCreateInfo sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDescriptorPoolInlineUniformBlockCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #maxInlineUniformBlockBindings} field. */
    public VkDescriptorPoolInlineUniformBlockCreateInfo maxInlineUniformBlockBindings(@NativeType("uint32_t") int value) { nmaxInlineUniformBlockBindings(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorPoolInlineUniformBlockCreateInfo set(
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
    public VkDescriptorPoolInlineUniformBlockCreateInfo set(VkDescriptorPoolInlineUniformBlockCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorPoolInlineUniformBlockCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorPoolInlineUniformBlockCreateInfo malloc() {
        return wrap(VkDescriptorPoolInlineUniformBlockCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDescriptorPoolInlineUniformBlockCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorPoolInlineUniformBlockCreateInfo calloc() {
        return wrap(VkDescriptorPoolInlineUniformBlockCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDescriptorPoolInlineUniformBlockCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorPoolInlineUniformBlockCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDescriptorPoolInlineUniformBlockCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorPoolInlineUniformBlockCreateInfo} instance for the specified memory address. */
    public static VkDescriptorPoolInlineUniformBlockCreateInfo create(long address) {
        return wrap(VkDescriptorPoolInlineUniformBlockCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorPoolInlineUniformBlockCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkDescriptorPoolInlineUniformBlockCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkDescriptorPoolInlineUniformBlockCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorPoolInlineUniformBlockCreateInfo malloc(MemoryStack stack) {
        return wrap(VkDescriptorPoolInlineUniformBlockCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDescriptorPoolInlineUniformBlockCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorPoolInlineUniformBlockCreateInfo calloc(MemoryStack stack) {
        return wrap(VkDescriptorPoolInlineUniformBlockCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorPoolInlineUniformBlockCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDescriptorPoolInlineUniformBlockCreateInfo.PNEXT); }
    /** Unsafe version of {@link #maxInlineUniformBlockBindings}. */
    public static int nmaxInlineUniformBlockBindings(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorPoolInlineUniformBlockCreateInfo.MAXINLINEUNIFORMBLOCKBINDINGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorPoolInlineUniformBlockCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDescriptorPoolInlineUniformBlockCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #maxInlineUniformBlockBindings(int) maxInlineUniformBlockBindings}. */
    public static void nmaxInlineUniformBlockBindings(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorPoolInlineUniformBlockCreateInfo.MAXINLINEUNIFORMBLOCKBINDINGS, value); }

    // -----------------------------------

    /** An array of {@link VkDescriptorPoolInlineUniformBlockCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorPoolInlineUniformBlockCreateInfo, Buffer> implements NativeResource {

        private static final VkDescriptorPoolInlineUniformBlockCreateInfo ELEMENT_FACTORY = VkDescriptorPoolInlineUniformBlockCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorPoolInlineUniformBlockCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkDescriptorPoolInlineUniformBlockCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDescriptorPoolInlineUniformBlockCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDescriptorPoolInlineUniformBlockCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkDescriptorPoolInlineUniformBlockCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDescriptorPoolInlineUniformBlockCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkDescriptorPoolInlineUniformBlockCreateInfo#maxInlineUniformBlockBindings} field. */
        @NativeType("uint32_t")
        public int maxInlineUniformBlockBindings() { return VkDescriptorPoolInlineUniformBlockCreateInfo.nmaxInlineUniformBlockBindings(address()); }

        /** Sets the specified value to the {@link VkDescriptorPoolInlineUniformBlockCreateInfo#sType} field. */
        public VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorPoolInlineUniformBlockCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO} value to the {@link VkDescriptorPoolInlineUniformBlockCreateInfo#sType} field. */
        public VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO); }
        /** Sets the specified value to the {@link VkDescriptorPoolInlineUniformBlockCreateInfo#pNext} field. */
        public VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkDescriptorPoolInlineUniformBlockCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkDescriptorPoolInlineUniformBlockCreateInfo#maxInlineUniformBlockBindings} field. */
        public VkDescriptorPoolInlineUniformBlockCreateInfo.Buffer maxInlineUniformBlockBindings(@NativeType("uint32_t") int value) { VkDescriptorPoolInlineUniformBlockCreateInfo.nmaxInlineUniformBlockBindings(address(), value); return this; }

    }

}