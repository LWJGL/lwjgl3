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
 * <pre><code>
 * struct VkExternalTensorPropertiesARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkExternalMemoryProperties VkExternalMemoryProperties} externalMemoryProperties;
 * }</code></pre>
 */
public class VkExternalTensorPropertiesARM extends Struct<VkExternalTensorPropertiesARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        EXTERNALMEMORYPROPERTIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkExternalMemoryProperties.SIZEOF, VkExternalMemoryProperties.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        EXTERNALMEMORYPROPERTIES = layout.offsetof(2);
    }

    protected VkExternalTensorPropertiesARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkExternalTensorPropertiesARM create(long address, @Nullable ByteBuffer container) {
        return new VkExternalTensorPropertiesARM(address, container);
    }

    /**
     * Creates a {@code VkExternalTensorPropertiesARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExternalTensorPropertiesARM(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return a {@link VkExternalMemoryProperties} view of the {@code externalMemoryProperties} field. */
    public VkExternalMemoryProperties externalMemoryProperties() { return nexternalMemoryProperties(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkExternalTensorPropertiesARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_EXTERNAL_TENSOR_PROPERTIES_ARM STRUCTURE_TYPE_EXTERNAL_TENSOR_PROPERTIES_ARM} value to the {@code sType} field. */
    public VkExternalTensorPropertiesARM sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_EXTERNAL_TENSOR_PROPERTIES_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkExternalTensorPropertiesARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkExternalMemoryProperties} to the {@code externalMemoryProperties} field. */
    public VkExternalTensorPropertiesARM externalMemoryProperties(VkExternalMemoryProperties value) { nexternalMemoryProperties(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkExternalTensorPropertiesARM set(
        int sType,
        long pNext,
        VkExternalMemoryProperties externalMemoryProperties
    ) {
        sType(sType);
        pNext(pNext);
        externalMemoryProperties(externalMemoryProperties);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkExternalTensorPropertiesARM set(VkExternalTensorPropertiesARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExternalTensorPropertiesARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExternalTensorPropertiesARM malloc() {
        return new VkExternalTensorPropertiesARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkExternalTensorPropertiesARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExternalTensorPropertiesARM calloc() {
        return new VkExternalTensorPropertiesARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkExternalTensorPropertiesARM} instance allocated with {@link BufferUtils}. */
    public static VkExternalTensorPropertiesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExternalTensorPropertiesARM(memAddress(container), container);
    }

    /** Returns a new {@code VkExternalTensorPropertiesARM} instance for the specified memory address. */
    public static VkExternalTensorPropertiesARM create(long address) {
        return new VkExternalTensorPropertiesARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkExternalTensorPropertiesARM createSafe(long address) {
        return address == NULL ? null : new VkExternalTensorPropertiesARM(address, null);
    }

    /**
     * Returns a new {@link VkExternalTensorPropertiesARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalTensorPropertiesARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExternalTensorPropertiesARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalTensorPropertiesARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalTensorPropertiesARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalTensorPropertiesARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkExternalTensorPropertiesARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExternalTensorPropertiesARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkExternalTensorPropertiesARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkExternalTensorPropertiesARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalTensorPropertiesARM malloc(MemoryStack stack) {
        return new VkExternalTensorPropertiesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkExternalTensorPropertiesARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalTensorPropertiesARM calloc(MemoryStack stack) {
        return new VkExternalTensorPropertiesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkExternalTensorPropertiesARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalTensorPropertiesARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalTensorPropertiesARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalTensorPropertiesARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkExternalTensorPropertiesARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExternalTensorPropertiesARM.PNEXT); }
    /** Unsafe version of {@link #externalMemoryProperties}. */
    public static VkExternalMemoryProperties nexternalMemoryProperties(long struct) { return VkExternalMemoryProperties.create(struct + VkExternalTensorPropertiesARM.EXTERNALMEMORYPROPERTIES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkExternalTensorPropertiesARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExternalTensorPropertiesARM.PNEXT, value); }
    /** Unsafe version of {@link #externalMemoryProperties(VkExternalMemoryProperties) externalMemoryProperties}. */
    public static void nexternalMemoryProperties(long struct, VkExternalMemoryProperties value) { memCopy(value.address(), struct + VkExternalTensorPropertiesARM.EXTERNALMEMORYPROPERTIES, VkExternalMemoryProperties.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkExternalTensorPropertiesARM} structs. */
    public static class Buffer extends StructBuffer<VkExternalTensorPropertiesARM, Buffer> implements NativeResource {

        private static final VkExternalTensorPropertiesARM ELEMENT_FACTORY = VkExternalTensorPropertiesARM.create(-1L);

        /**
         * Creates a new {@code VkExternalTensorPropertiesARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExternalTensorPropertiesARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkExternalTensorPropertiesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExternalTensorPropertiesARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkExternalTensorPropertiesARM.npNext(address()); }
        /** @return a {@link VkExternalMemoryProperties} view of the {@code externalMemoryProperties} field. */
        public VkExternalMemoryProperties externalMemoryProperties() { return VkExternalTensorPropertiesARM.nexternalMemoryProperties(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkExternalTensorPropertiesARM.Buffer sType(@NativeType("VkStructureType") int value) { VkExternalTensorPropertiesARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_EXTERNAL_TENSOR_PROPERTIES_ARM STRUCTURE_TYPE_EXTERNAL_TENSOR_PROPERTIES_ARM} value to the {@code sType} field. */
        public VkExternalTensorPropertiesARM.Buffer sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_EXTERNAL_TENSOR_PROPERTIES_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkExternalTensorPropertiesARM.Buffer pNext(@NativeType("void const *") long value) { VkExternalTensorPropertiesARM.npNext(address(), value); return this; }
        /** Copies the specified {@link VkExternalMemoryProperties} to the {@code externalMemoryProperties} field. */
        public VkExternalTensorPropertiesARM.Buffer externalMemoryProperties(VkExternalMemoryProperties value) { VkExternalTensorPropertiesARM.nexternalMemoryProperties(address(), value); return this; }

    }

}