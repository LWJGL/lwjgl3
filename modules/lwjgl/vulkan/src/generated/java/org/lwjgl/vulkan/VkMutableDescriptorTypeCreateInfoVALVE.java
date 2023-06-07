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
 * See {@link VkMutableDescriptorTypeCreateInfoEXT}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMutableDescriptorTypeCreateInfoVALVE {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t mutableDescriptorTypeListCount;
 *     {@link VkMutableDescriptorTypeListEXT VkMutableDescriptorTypeListEXT} const * pMutableDescriptorTypeLists;
 * }</code></pre>
 */
public class VkMutableDescriptorTypeCreateInfoVALVE extends VkMutableDescriptorTypeCreateInfoEXT {

    protected VkMutableDescriptorTypeCreateInfoVALVE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMutableDescriptorTypeCreateInfoVALVE create(long address, @Nullable ByteBuffer container) {
        return new VkMutableDescriptorTypeCreateInfoVALVE(address, container);
    }

    /**
     * Creates a {@code VkMutableDescriptorTypeCreateInfoVALVE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMutableDescriptorTypeCreateInfoVALVE(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkMutableDescriptorTypeCreateInfoVALVE sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMutableDescriptorType#VK_STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_EXT STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_EXT} value to the {@code sType} field. */
    @Override
    public VkMutableDescriptorTypeCreateInfoVALVE sType$Default() { return sType(EXTMutableDescriptorType.VK_STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkMutableDescriptorTypeCreateInfoVALVE pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkMutableDescriptorTypeListEXT.Buffer} to the {@code pMutableDescriptorTypeLists} field. */
    @Override
    public VkMutableDescriptorTypeCreateInfoVALVE pMutableDescriptorTypeLists(@Nullable @NativeType("VkMutableDescriptorTypeListEXT const *") VkMutableDescriptorTypeListEXT.Buffer value) { npMutableDescriptorTypeLists(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkMutableDescriptorTypeCreateInfoVALVE set(
        int sType,
        long pNext,
        @Nullable VkMutableDescriptorTypeListEXT.Buffer pMutableDescriptorTypeLists
    ) {
        sType(sType);
        pNext(pNext);
        pMutableDescriptorTypeLists(pMutableDescriptorTypeLists);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMutableDescriptorTypeCreateInfoVALVE set(VkMutableDescriptorTypeCreateInfoVALVE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMutableDescriptorTypeCreateInfoVALVE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMutableDescriptorTypeCreateInfoVALVE malloc() {
        return new VkMutableDescriptorTypeCreateInfoVALVE(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMutableDescriptorTypeCreateInfoVALVE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMutableDescriptorTypeCreateInfoVALVE calloc() {
        return new VkMutableDescriptorTypeCreateInfoVALVE(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMutableDescriptorTypeCreateInfoVALVE} instance allocated with {@link BufferUtils}. */
    public static VkMutableDescriptorTypeCreateInfoVALVE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMutableDescriptorTypeCreateInfoVALVE(memAddress(container), container);
    }

    /** Returns a new {@code VkMutableDescriptorTypeCreateInfoVALVE} instance for the specified memory address. */
    public static VkMutableDescriptorTypeCreateInfoVALVE create(long address) {
        return new VkMutableDescriptorTypeCreateInfoVALVE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMutableDescriptorTypeCreateInfoVALVE createSafe(long address) {
        return address == NULL ? null : new VkMutableDescriptorTypeCreateInfoVALVE(address, null);
    }

    /**
     * Returns a new {@link VkMutableDescriptorTypeCreateInfoVALVE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeCreateInfoVALVE.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMutableDescriptorTypeCreateInfoVALVE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeCreateInfoVALVE.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMutableDescriptorTypeCreateInfoVALVE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeCreateInfoVALVE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMutableDescriptorTypeCreateInfoVALVE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeCreateInfoVALVE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMutableDescriptorTypeCreateInfoVALVE.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkMutableDescriptorTypeCreateInfoVALVE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMutableDescriptorTypeCreateInfoVALVE malloc(MemoryStack stack) {
        return new VkMutableDescriptorTypeCreateInfoVALVE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMutableDescriptorTypeCreateInfoVALVE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMutableDescriptorTypeCreateInfoVALVE calloc(MemoryStack stack) {
        return new VkMutableDescriptorTypeCreateInfoVALVE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMutableDescriptorTypeCreateInfoVALVE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeCreateInfoVALVE.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMutableDescriptorTypeCreateInfoVALVE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeCreateInfoVALVE.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkMutableDescriptorTypeCreateInfoVALVE} structs. */
    public static class Buffer extends VkMutableDescriptorTypeCreateInfoEXT.Buffer {

        private static final VkMutableDescriptorTypeCreateInfoVALVE ELEMENT_FACTORY = VkMutableDescriptorTypeCreateInfoVALVE.create(-1L);

        /**
         * Creates a new {@code VkMutableDescriptorTypeCreateInfoVALVE.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMutableDescriptorTypeCreateInfoVALVE#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container);
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
        protected VkMutableDescriptorTypeCreateInfoVALVE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkMutableDescriptorTypeCreateInfoVALVE.Buffer sType(@NativeType("VkStructureType") int value) { VkMutableDescriptorTypeCreateInfoVALVE.nsType(address(), value); return this; }
        /** Sets the {@link EXTMutableDescriptorType#VK_STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_EXT STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_EXT} value to the {@code sType} field. */
        @Override
        public VkMutableDescriptorTypeCreateInfoVALVE.Buffer sType$Default() { return sType(EXTMutableDescriptorType.VK_STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkMutableDescriptorTypeCreateInfoVALVE.Buffer pNext(@NativeType("void const *") long value) { VkMutableDescriptorTypeCreateInfoVALVE.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkMutableDescriptorTypeListEXT.Buffer} to the {@code pMutableDescriptorTypeLists} field. */
        @Override
        public VkMutableDescriptorTypeCreateInfoVALVE.Buffer pMutableDescriptorTypeLists(@Nullable @NativeType("VkMutableDescriptorTypeListEXT const *") VkMutableDescriptorTypeListEXT.Buffer value) { VkMutableDescriptorTypeCreateInfoVALVE.npMutableDescriptorTypeLists(address(), value); return this; }

    }

}