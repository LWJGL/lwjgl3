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
 * Structure describing inline uniform block features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceInlineUniformBlockFeaturesEXT} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceFeatures2}, it is filled with values indicating whether each feature is supported. {@link VkPhysicalDeviceInlineUniformBlockFeaturesEXT} <b>can</b> also be included in the {@code pNext} chain of {@link VkDeviceCreateInfo} to enable features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTInlineUniformBlock#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code inlineUniformBlock} &ndash; indicates whether the implementation supports inline uniform block descriptors. If this feature is not enabled, {@link EXTInlineUniformBlock#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK_EXT DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK_EXT} <b>must</b> not be used.</li>
 * <li>{@code descriptorBindingInlineUniformBlockUpdateAfterBind} &ndash; indicates whether the implementation supports updating inline uniform block descriptors after a set is bound. If this feature is not enabled, {@link VK12#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT} <b>must</b> not be used with {@link EXTInlineUniformBlock#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK_EXT DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK_EXT}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceInlineUniformBlockFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 inlineUniformBlock;
 *     VkBool32 descriptorBindingInlineUniformBlockUpdateAfterBind;
 * }</code></pre>
 */
public class VkPhysicalDeviceInlineUniformBlockFeaturesEXT extends Struct implements NativeResource {

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

    /**
     * Creates a {@code VkPhysicalDeviceInlineUniformBlockFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code inlineUniformBlock} field. */
    @NativeType("VkBool32")
    public boolean inlineUniformBlock() { return ninlineUniformBlock(address()) != 0; }
    /** Returns the value of the {@code descriptorBindingInlineUniformBlockUpdateAfterBind} field. */
    @NativeType("VkBool32")
    public boolean descriptorBindingInlineUniformBlockUpdateAfterBind() { return ndescriptorBindingInlineUniformBlockUpdateAfterBind(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code inlineUniformBlock} field. */
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT inlineUniformBlock(@NativeType("VkBool32") boolean value) { ninlineUniformBlock(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorBindingInlineUniformBlockUpdateAfterBind} field. */
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT descriptorBindingInlineUniformBlockUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingInlineUniformBlockUpdateAfterBind(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT set(
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
    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT set(VkPhysicalDeviceInlineUniformBlockFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceInlineUniformBlockFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT malloc() {
        return wrap(VkPhysicalDeviceInlineUniformBlockFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceInlineUniformBlockFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceInlineUniformBlockFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceInlineUniformBlockFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceInlineUniformBlockFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceInlineUniformBlockFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceInlineUniformBlockFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceInlineUniformBlockFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceInlineUniformBlockFeaturesEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceInlineUniformBlockFeaturesEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceInlineUniformBlockFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceInlineUniformBlockFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceInlineUniformBlockFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceInlineUniformBlockFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceInlineUniformBlockFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceInlineUniformBlockFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #inlineUniformBlock}. */
    public static int ninlineUniformBlock(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceInlineUniformBlockFeaturesEXT.INLINEUNIFORMBLOCK); }
    /** Unsafe version of {@link #descriptorBindingInlineUniformBlockUpdateAfterBind}. */
    public static int ndescriptorBindingInlineUniformBlockUpdateAfterBind(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceInlineUniformBlockFeaturesEXT.DESCRIPTORBINDINGINLINEUNIFORMBLOCKUPDATEAFTERBIND); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceInlineUniformBlockFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceInlineUniformBlockFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #inlineUniformBlock(boolean) inlineUniformBlock}. */
    public static void ninlineUniformBlock(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceInlineUniformBlockFeaturesEXT.INLINEUNIFORMBLOCK, value); }
    /** Unsafe version of {@link #descriptorBindingInlineUniformBlockUpdateAfterBind(boolean) descriptorBindingInlineUniformBlockUpdateAfterBind}. */
    public static void ndescriptorBindingInlineUniformBlockUpdateAfterBind(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceInlineUniformBlockFeaturesEXT.DESCRIPTORBINDINGINLINEUNIFORMBLOCKUPDATEAFTERBIND, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceInlineUniformBlockFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceInlineUniformBlockFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceInlineUniformBlockFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceInlineUniformBlockFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceInlineUniformBlockFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceInlineUniformBlockFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceInlineUniformBlockFeaturesEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceInlineUniformBlockFeaturesEXT.npNext(address()); }
        /** Returns the value of the {@code inlineUniformBlock} field. */
        @NativeType("VkBool32")
        public boolean inlineUniformBlock() { return VkPhysicalDeviceInlineUniformBlockFeaturesEXT.ninlineUniformBlock(address()) != 0; }
        /** Returns the value of the {@code descriptorBindingInlineUniformBlockUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingInlineUniformBlockUpdateAfterBind() { return VkPhysicalDeviceInlineUniformBlockFeaturesEXT.ndescriptorBindingInlineUniformBlockUpdateAfterBind(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceInlineUniformBlockFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceInlineUniformBlockFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code inlineUniformBlock} field. */
        public VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer inlineUniformBlock(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceInlineUniformBlockFeaturesEXT.ninlineUniformBlock(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorBindingInlineUniformBlockUpdateAfterBind} field. */
        public VkPhysicalDeviceInlineUniformBlockFeaturesEXT.Buffer descriptorBindingInlineUniformBlockUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceInlineUniformBlockFeaturesEXT.ndescriptorBindingInlineUniformBlockUpdateAfterBind(address(), value ? 1 : 0); return this; }

    }

}