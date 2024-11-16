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
 * Structure describing inline uniform block features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceInlineUniformBlockFeatures} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceInlineUniformBlockFeatures} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceInlineUniformBlockFeatures {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #inlineUniformBlock};
 *     VkBool32 {@link #descriptorBindingInlineUniformBlockUpdateAfterBind};
 * }</code></pre>
 */
public class VkPhysicalDeviceInlineUniformBlockFeatures extends Struct<VkPhysicalDeviceInlineUniformBlockFeatures> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        INLINEUNIFORMBLOCK,
        DESCRIPTORBINDINGINLINEUNIFORMBLOCKUPDATEAFTERBIND;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        INLINEUNIFORMBLOCK = layout.offsetof(2);
        DESCRIPTORBINDINGINLINEUNIFORMBLOCKUPDATEAFTERBIND = layout.offsetof(3);
    }

    protected VkPhysicalDeviceInlineUniformBlockFeatures(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceInlineUniformBlockFeatures create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceInlineUniformBlockFeatures(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceInlineUniformBlockFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceInlineUniformBlockFeatures(ByteBuffer container) {
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
    /** indicates whether the implementation supports inline uniform block descriptors. If this feature is not enabled, {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK} <b>must</b> not be used. */
    @NativeType("VkBool32")
    public boolean inlineUniformBlock() { return ninlineUniformBlock(address()) != 0; }
    /** indicates whether the implementation supports updating inline uniform block descriptors after a set is bound. If this feature is not enabled, {@link VK12#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT} <b>must</b> not be used with {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK}. */
    @NativeType("VkBool32")
    public boolean descriptorBindingInlineUniformBlockUpdateAfterBind() { return ndescriptorBindingInlineUniformBlockUpdateAfterBind(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceInlineUniformBlockFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES} value to the {@link #sType} field. */
    public VkPhysicalDeviceInlineUniformBlockFeatures sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceInlineUniformBlockFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #inlineUniformBlock} field. */
    public VkPhysicalDeviceInlineUniformBlockFeatures inlineUniformBlock(@NativeType("VkBool32") boolean value) { ninlineUniformBlock(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #descriptorBindingInlineUniformBlockUpdateAfterBind} field. */
    public VkPhysicalDeviceInlineUniformBlockFeatures descriptorBindingInlineUniformBlockUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingInlineUniformBlockUpdateAfterBind(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceInlineUniformBlockFeatures set(
        int sType,
        long pNext,
        boolean inlineUniformBlock,
        boolean descriptorBindingInlineUniformBlockUpdateAfterBind
    ) {
        sType(sType);
        pNext(pNext);
        inlineUniformBlock(inlineUniformBlock);
        descriptorBindingInlineUniformBlockUpdateAfterBind(descriptorBindingInlineUniformBlockUpdateAfterBind);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceInlineUniformBlockFeatures set(VkPhysicalDeviceInlineUniformBlockFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceInlineUniformBlockFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceInlineUniformBlockFeatures malloc() {
        return new VkPhysicalDeviceInlineUniformBlockFeatures(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceInlineUniformBlockFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceInlineUniformBlockFeatures calloc() {
        return new VkPhysicalDeviceInlineUniformBlockFeatures(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceInlineUniformBlockFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceInlineUniformBlockFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceInlineUniformBlockFeatures(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceInlineUniformBlockFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceInlineUniformBlockFeatures create(long address) {
        return new VkPhysicalDeviceInlineUniformBlockFeatures(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceInlineUniformBlockFeatures createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceInlineUniformBlockFeatures(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockFeatures.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockFeatures.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceInlineUniformBlockFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockFeatures.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceInlineUniformBlockFeatures.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceInlineUniformBlockFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceInlineUniformBlockFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceInlineUniformBlockFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceInlineUniformBlockFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceInlineUniformBlockFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceInlineUniformBlockFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceInlineUniformBlockFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceInlineUniformBlockFeatures.PNEXT); }
    /** Unsafe version of {@link #inlineUniformBlock}. */
    public static int ninlineUniformBlock(long struct) { return memGetInt(struct + VkPhysicalDeviceInlineUniformBlockFeatures.INLINEUNIFORMBLOCK); }
    /** Unsafe version of {@link #descriptorBindingInlineUniformBlockUpdateAfterBind}. */
    public static int ndescriptorBindingInlineUniformBlockUpdateAfterBind(long struct) { return memGetInt(struct + VkPhysicalDeviceInlineUniformBlockFeatures.DESCRIPTORBINDINGINLINEUNIFORMBLOCKUPDATEAFTERBIND); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceInlineUniformBlockFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceInlineUniformBlockFeatures.PNEXT, value); }
    /** Unsafe version of {@link #inlineUniformBlock(boolean) inlineUniformBlock}. */
    public static void ninlineUniformBlock(long struct, int value) { memPutInt(struct + VkPhysicalDeviceInlineUniformBlockFeatures.INLINEUNIFORMBLOCK, value); }
    /** Unsafe version of {@link #descriptorBindingInlineUniformBlockUpdateAfterBind(boolean) descriptorBindingInlineUniformBlockUpdateAfterBind}. */
    public static void ndescriptorBindingInlineUniformBlockUpdateAfterBind(long struct, int value) { memPutInt(struct + VkPhysicalDeviceInlineUniformBlockFeatures.DESCRIPTORBINDINGINLINEUNIFORMBLOCKUPDATEAFTERBIND, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceInlineUniformBlockFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceInlineUniformBlockFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceInlineUniformBlockFeatures ELEMENT_FACTORY = VkPhysicalDeviceInlineUniformBlockFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceInlineUniformBlockFeatures.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceInlineUniformBlockFeatures#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceInlineUniformBlockFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceInlineUniformBlockFeatures#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceInlineUniformBlockFeatures.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceInlineUniformBlockFeatures#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceInlineUniformBlockFeatures.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceInlineUniformBlockFeatures#inlineUniformBlock} field. */
        @NativeType("VkBool32")
        public boolean inlineUniformBlock() { return VkPhysicalDeviceInlineUniformBlockFeatures.ninlineUniformBlock(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceInlineUniformBlockFeatures#descriptorBindingInlineUniformBlockUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingInlineUniformBlockUpdateAfterBind() { return VkPhysicalDeviceInlineUniformBlockFeatures.ndescriptorBindingInlineUniformBlockUpdateAfterBind(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceInlineUniformBlockFeatures#sType} field. */
        public VkPhysicalDeviceInlineUniformBlockFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceInlineUniformBlockFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES} value to the {@link VkPhysicalDeviceInlineUniformBlockFeatures#sType} field. */
        public VkPhysicalDeviceInlineUniformBlockFeatures.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceInlineUniformBlockFeatures#pNext} field. */
        public VkPhysicalDeviceInlineUniformBlockFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceInlineUniformBlockFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceInlineUniformBlockFeatures#inlineUniformBlock} field. */
        public VkPhysicalDeviceInlineUniformBlockFeatures.Buffer inlineUniformBlock(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceInlineUniformBlockFeatures.ninlineUniformBlock(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceInlineUniformBlockFeatures#descriptorBindingInlineUniformBlockUpdateAfterBind} field. */
        public VkPhysicalDeviceInlineUniformBlockFeatures.Buffer descriptorBindingInlineUniformBlockUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceInlineUniformBlockFeatures.ndescriptorBindingInlineUniformBlockUpdateAfterBind(address(), value ? 1 : 0); return this; }

    }

}