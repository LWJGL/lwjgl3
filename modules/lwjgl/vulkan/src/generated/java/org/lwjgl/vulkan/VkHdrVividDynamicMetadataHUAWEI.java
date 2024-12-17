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

/**
 * <pre>{@code
 * struct VkHdrVividDynamicMetadataHUAWEI {
 *     VkStructureType sType;
 *     void const * pNext;
 *     size_t dynamicMetadataSize;
 *     void const * pDynamicMetadata;
 * }}</pre>
 */
public class VkHdrVividDynamicMetadataHUAWEI extends Struct<VkHdrVividDynamicMetadataHUAWEI> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DYNAMICMETADATASIZE,
        PDYNAMICMETADATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DYNAMICMETADATASIZE = layout.offsetof(2);
        PDYNAMICMETADATA = layout.offsetof(3);
    }

    protected VkHdrVividDynamicMetadataHUAWEI(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkHdrVividDynamicMetadataHUAWEI create(long address, @Nullable ByteBuffer container) {
        return new VkHdrVividDynamicMetadataHUAWEI(address, container);
    }

    /**
     * Creates a {@code VkHdrVividDynamicMetadataHUAWEI} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkHdrVividDynamicMetadataHUAWEI(ByteBuffer container) {
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
    /** @return the value of the {@code dynamicMetadataSize} field. */
    @NativeType("size_t")
    public long dynamicMetadataSize() { return ndynamicMetadataSize(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pDynamicMetadata} field. */
    @NativeType("void const *")
    public ByteBuffer pDynamicMetadata() { return npDynamicMetadata(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkHdrVividDynamicMetadataHUAWEI sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link HUAWEIHdrVivid#VK_STRUCTURE_TYPE_HDR_VIVID_DYNAMIC_METADATA_HUAWEI STRUCTURE_TYPE_HDR_VIVID_DYNAMIC_METADATA_HUAWEI} value to the {@code sType} field. */
    public VkHdrVividDynamicMetadataHUAWEI sType$Default() { return sType(HUAWEIHdrVivid.VK_STRUCTURE_TYPE_HDR_VIVID_DYNAMIC_METADATA_HUAWEI); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkHdrVividDynamicMetadataHUAWEI pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code pDynamicMetadata} field. */
    public VkHdrVividDynamicMetadataHUAWEI pDynamicMetadata(@NativeType("void const *") ByteBuffer value) { npDynamicMetadata(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkHdrVividDynamicMetadataHUAWEI set(
        int sType,
        long pNext,
        ByteBuffer pDynamicMetadata
    ) {
        sType(sType);
        pNext(pNext);
        pDynamicMetadata(pDynamicMetadata);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkHdrVividDynamicMetadataHUAWEI set(VkHdrVividDynamicMetadataHUAWEI src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkHdrVividDynamicMetadataHUAWEI} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkHdrVividDynamicMetadataHUAWEI malloc() {
        return new VkHdrVividDynamicMetadataHUAWEI(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkHdrVividDynamicMetadataHUAWEI} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkHdrVividDynamicMetadataHUAWEI calloc() {
        return new VkHdrVividDynamicMetadataHUAWEI(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkHdrVividDynamicMetadataHUAWEI} instance allocated with {@link BufferUtils}. */
    public static VkHdrVividDynamicMetadataHUAWEI create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkHdrVividDynamicMetadataHUAWEI(memAddress(container), container);
    }

    /** Returns a new {@code VkHdrVividDynamicMetadataHUAWEI} instance for the specified memory address. */
    public static VkHdrVividDynamicMetadataHUAWEI create(long address) {
        return new VkHdrVividDynamicMetadataHUAWEI(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkHdrVividDynamicMetadataHUAWEI createSafe(long address) {
        return address == NULL ? null : new VkHdrVividDynamicMetadataHUAWEI(address, null);
    }

    /**
     * Returns a new {@link VkHdrVividDynamicMetadataHUAWEI.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkHdrVividDynamicMetadataHUAWEI.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkHdrVividDynamicMetadataHUAWEI.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkHdrVividDynamicMetadataHUAWEI.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkHdrVividDynamicMetadataHUAWEI.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkHdrVividDynamicMetadataHUAWEI.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkHdrVividDynamicMetadataHUAWEI.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkHdrVividDynamicMetadataHUAWEI.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkHdrVividDynamicMetadataHUAWEI.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkHdrVividDynamicMetadataHUAWEI} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkHdrVividDynamicMetadataHUAWEI malloc(MemoryStack stack) {
        return new VkHdrVividDynamicMetadataHUAWEI(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkHdrVividDynamicMetadataHUAWEI} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkHdrVividDynamicMetadataHUAWEI calloc(MemoryStack stack) {
        return new VkHdrVividDynamicMetadataHUAWEI(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkHdrVividDynamicMetadataHUAWEI.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkHdrVividDynamicMetadataHUAWEI.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkHdrVividDynamicMetadataHUAWEI.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkHdrVividDynamicMetadataHUAWEI.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkHdrVividDynamicMetadataHUAWEI.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkHdrVividDynamicMetadataHUAWEI.PNEXT); }
    /** Unsafe version of {@link #dynamicMetadataSize}. */
    public static long ndynamicMetadataSize(long struct) { return memGetAddress(struct + VkHdrVividDynamicMetadataHUAWEI.DYNAMICMETADATASIZE); }
    /** Unsafe version of {@link #pDynamicMetadata() pDynamicMetadata}. */
    public static ByteBuffer npDynamicMetadata(long struct) { return memByteBuffer(memGetAddress(struct + VkHdrVividDynamicMetadataHUAWEI.PDYNAMICMETADATA), (int)ndynamicMetadataSize(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkHdrVividDynamicMetadataHUAWEI.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkHdrVividDynamicMetadataHUAWEI.PNEXT, value); }
    /** Sets the specified value to the {@code dynamicMetadataSize} field of the specified {@code struct}. */
    public static void ndynamicMetadataSize(long struct, long value) { memPutAddress(struct + VkHdrVividDynamicMetadataHUAWEI.DYNAMICMETADATASIZE, value); }
    /** Unsafe version of {@link #pDynamicMetadata(ByteBuffer) pDynamicMetadata}. */
    public static void npDynamicMetadata(long struct, ByteBuffer value) { memPutAddress(struct + VkHdrVividDynamicMetadataHUAWEI.PDYNAMICMETADATA, memAddress(value)); ndynamicMetadataSize(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkHdrVividDynamicMetadataHUAWEI.PDYNAMICMETADATA));
    }

    // -----------------------------------

    /** An array of {@link VkHdrVividDynamicMetadataHUAWEI} structs. */
    public static class Buffer extends StructBuffer<VkHdrVividDynamicMetadataHUAWEI, Buffer> implements NativeResource {

        private static final VkHdrVividDynamicMetadataHUAWEI ELEMENT_FACTORY = VkHdrVividDynamicMetadataHUAWEI.create(-1L);

        /**
         * Creates a new {@code VkHdrVividDynamicMetadataHUAWEI.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkHdrVividDynamicMetadataHUAWEI#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkHdrVividDynamicMetadataHUAWEI getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkHdrVividDynamicMetadataHUAWEI.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkHdrVividDynamicMetadataHUAWEI.npNext(address()); }
        /** @return the value of the {@code dynamicMetadataSize} field. */
        @NativeType("size_t")
        public long dynamicMetadataSize() { return VkHdrVividDynamicMetadataHUAWEI.ndynamicMetadataSize(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pDynamicMetadata} field. */
        @NativeType("void const *")
        public ByteBuffer pDynamicMetadata() { return VkHdrVividDynamicMetadataHUAWEI.npDynamicMetadata(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkHdrVividDynamicMetadataHUAWEI.Buffer sType(@NativeType("VkStructureType") int value) { VkHdrVividDynamicMetadataHUAWEI.nsType(address(), value); return this; }
        /** Sets the {@link HUAWEIHdrVivid#VK_STRUCTURE_TYPE_HDR_VIVID_DYNAMIC_METADATA_HUAWEI STRUCTURE_TYPE_HDR_VIVID_DYNAMIC_METADATA_HUAWEI} value to the {@code sType} field. */
        public VkHdrVividDynamicMetadataHUAWEI.Buffer sType$Default() { return sType(HUAWEIHdrVivid.VK_STRUCTURE_TYPE_HDR_VIVID_DYNAMIC_METADATA_HUAWEI); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkHdrVividDynamicMetadataHUAWEI.Buffer pNext(@NativeType("void const *") long value) { VkHdrVividDynamicMetadataHUAWEI.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code pDynamicMetadata} field. */
        public VkHdrVividDynamicMetadataHUAWEI.Buffer pDynamicMetadata(@NativeType("void const *") ByteBuffer value) { VkHdrVividDynamicMetadataHUAWEI.npDynamicMetadata(address(), value); return this; }

    }

}