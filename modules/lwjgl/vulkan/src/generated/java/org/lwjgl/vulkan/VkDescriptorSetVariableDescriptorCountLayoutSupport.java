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
 * Structure returning information about whether a descriptor set layout can be supported.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkDescriptorSetLayoutCreateInfo} structure specified in {@link VK11#vkGetDescriptorSetLayoutSupport GetDescriptorSetLayoutSupport}{@code ::pCreateInfo} includes a variable-sized descriptor, then {@code supported} is determined assuming the requested size of the variable-sized descriptor, and {@code maxVariableDescriptorCount} is set to the maximum size of that descriptor that <b>can</b> be successfully created (which is greater than or equal to the requested size passed in). If the {@link VkDescriptorSetLayoutCreateInfo} structure does not include a variable-sized descriptor, or if the {@link VkPhysicalDeviceDescriptorIndexingFeatures}{@code ::descriptorBindingVariableDescriptorCount} feature is not enabled, then {@code maxVariableDescriptorCount} is set to zero. For the purposes of this command, a variable-sized descriptor binding with a {@code descriptorCount} of zero is treated as if the {@code descriptorCount} is one, and thus the binding is not ignored and the maximum descriptor count will be returned. If the layout is not supported, then the value written to {@code maxVariableDescriptorCount} is undefined.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDescriptorSetVariableDescriptorCountLayoutSupport {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #maxVariableDescriptorCount};
 * }</code></pre>
 */
public class VkDescriptorSetVariableDescriptorCountLayoutSupport extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXVARIABLEDESCRIPTORCOUNT;

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
        MAXVARIABLEDESCRIPTORCOUNT = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkDescriptorSetVariableDescriptorCountLayoutSupport} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorSetVariableDescriptorCountLayoutSupport(ByteBuffer container) {
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
    /** indicates the maximum number of descriptors supported in the highest numbered binding of the layout, if that binding is variable-sized. If the highest numbered binding of the layout has a descriptor type of {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK} then {@code maxVariableDescriptorCount} indicates the maximum byte size supported for the binding, if that binding is variable-sized. */
    @NativeType("uint32_t")
    public int maxVariableDescriptorCount() { return nmaxVariableDescriptorCount(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDescriptorSetVariableDescriptorCountLayoutSupport sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT} value to the {@link #sType} field. */
    public VkDescriptorSetVariableDescriptorCountLayoutSupport sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDescriptorSetVariableDescriptorCountLayoutSupport pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorSetVariableDescriptorCountLayoutSupport set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorSetVariableDescriptorCountLayoutSupport set(VkDescriptorSetVariableDescriptorCountLayoutSupport src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorSetVariableDescriptorCountLayoutSupport} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetVariableDescriptorCountLayoutSupport malloc() {
        return wrap(VkDescriptorSetVariableDescriptorCountLayoutSupport.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDescriptorSetVariableDescriptorCountLayoutSupport} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetVariableDescriptorCountLayoutSupport calloc() {
        return wrap(VkDescriptorSetVariableDescriptorCountLayoutSupport.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDescriptorSetVariableDescriptorCountLayoutSupport} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorSetVariableDescriptorCountLayoutSupport create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDescriptorSetVariableDescriptorCountLayoutSupport.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorSetVariableDescriptorCountLayoutSupport} instance for the specified memory address. */
    public static VkDescriptorSetVariableDescriptorCountLayoutSupport create(long address) {
        return wrap(VkDescriptorSetVariableDescriptorCountLayoutSupport.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorSetVariableDescriptorCountLayoutSupport createSafe(long address) {
        return address == NULL ? null : wrap(VkDescriptorSetVariableDescriptorCountLayoutSupport.class, address);
    }

    /**
     * Returns a new {@link VkDescriptorSetVariableDescriptorCountLayoutSupport.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetVariableDescriptorCountLayoutSupport.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetVariableDescriptorCountLayoutSupport.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetVariableDescriptorCountLayoutSupport.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetVariableDescriptorCountLayoutSupport.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetVariableDescriptorCountLayoutSupport.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDescriptorSetVariableDescriptorCountLayoutSupport.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetVariableDescriptorCountLayoutSupport.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorSetVariableDescriptorCountLayoutSupport.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkDescriptorSetVariableDescriptorCountLayoutSupport} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetVariableDescriptorCountLayoutSupport malloc(MemoryStack stack) {
        return wrap(VkDescriptorSetVariableDescriptorCountLayoutSupport.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDescriptorSetVariableDescriptorCountLayoutSupport} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetVariableDescriptorCountLayoutSupport calloc(MemoryStack stack) {
        return wrap(VkDescriptorSetVariableDescriptorCountLayoutSupport.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDescriptorSetVariableDescriptorCountLayoutSupport.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetVariableDescriptorCountLayoutSupport.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetVariableDescriptorCountLayoutSupport.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetVariableDescriptorCountLayoutSupport.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorSetVariableDescriptorCountLayoutSupport.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDescriptorSetVariableDescriptorCountLayoutSupport.PNEXT); }
    /** Unsafe version of {@link #maxVariableDescriptorCount}. */
    public static int nmaxVariableDescriptorCount(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorSetVariableDescriptorCountLayoutSupport.MAXVARIABLEDESCRIPTORCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorSetVariableDescriptorCountLayoutSupport.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDescriptorSetVariableDescriptorCountLayoutSupport.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkDescriptorSetVariableDescriptorCountLayoutSupport} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorSetVariableDescriptorCountLayoutSupport, Buffer> implements NativeResource {

        private static final VkDescriptorSetVariableDescriptorCountLayoutSupport ELEMENT_FACTORY = VkDescriptorSetVariableDescriptorCountLayoutSupport.create(-1L);

        /**
         * Creates a new {@code VkDescriptorSetVariableDescriptorCountLayoutSupport.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorSetVariableDescriptorCountLayoutSupport#SIZEOF}, and its mark will be undefined.
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
        protected VkDescriptorSetVariableDescriptorCountLayoutSupport getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDescriptorSetVariableDescriptorCountLayoutSupport#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDescriptorSetVariableDescriptorCountLayoutSupport.nsType(address()); }
        /** @return the value of the {@link VkDescriptorSetVariableDescriptorCountLayoutSupport#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDescriptorSetVariableDescriptorCountLayoutSupport.npNext(address()); }
        /** @return the value of the {@link VkDescriptorSetVariableDescriptorCountLayoutSupport#maxVariableDescriptorCount} field. */
        @NativeType("uint32_t")
        public int maxVariableDescriptorCount() { return VkDescriptorSetVariableDescriptorCountLayoutSupport.nmaxVariableDescriptorCount(address()); }

        /** Sets the specified value to the {@link VkDescriptorSetVariableDescriptorCountLayoutSupport#sType} field. */
        public VkDescriptorSetVariableDescriptorCountLayoutSupport.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorSetVariableDescriptorCountLayoutSupport.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT} value to the {@link VkDescriptorSetVariableDescriptorCountLayoutSupport#sType} field. */
        public VkDescriptorSetVariableDescriptorCountLayoutSupport.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT); }
        /** Sets the specified value to the {@link VkDescriptorSetVariableDescriptorCountLayoutSupport#pNext} field. */
        public VkDescriptorSetVariableDescriptorCountLayoutSupport.Buffer pNext(@NativeType("void *") long value) { VkDescriptorSetVariableDescriptorCountLayoutSupport.npNext(address(), value); return this; }

    }

}