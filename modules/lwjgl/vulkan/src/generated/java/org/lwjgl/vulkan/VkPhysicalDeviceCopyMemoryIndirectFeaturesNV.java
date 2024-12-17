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
 * <pre>{@code
 * struct VkPhysicalDeviceCopyMemoryIndirectFeaturesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 indirectCopy;
 * }}</pre>
 */
public class VkPhysicalDeviceCopyMemoryIndirectFeaturesNV extends Struct<VkPhysicalDeviceCopyMemoryIndirectFeaturesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        INDIRECTCOPY;

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
        INDIRECTCOPY = layout.offsetof(2);
    }

    protected VkPhysicalDeviceCopyMemoryIndirectFeaturesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceCopyMemoryIndirectFeaturesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceCopyMemoryIndirectFeaturesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceCopyMemoryIndirectFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code indirectCopy} field. */
    @NativeType("VkBool32")
    public boolean indirectCopy() { return nindirectCopy(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVCopyMemoryIndirect#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_FEATURES_NV} value to the {@code sType} field. */
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV sType$Default() { return sType(NVCopyMemoryIndirect.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_FEATURES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code indirectCopy} field. */
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV indirectCopy(@NativeType("VkBool32") boolean value) { nindirectCopy(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV set(
        int sType,
        long pNext,
        boolean indirectCopy
    ) {
        sType(sType);
        pNext(pNext);
        indirectCopy(indirectCopy);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV set(VkPhysicalDeviceCopyMemoryIndirectFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceCopyMemoryIndirectFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesNV malloc() {
        return new VkPhysicalDeviceCopyMemoryIndirectFeaturesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCopyMemoryIndirectFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesNV calloc() {
        return new VkPhysicalDeviceCopyMemoryIndirectFeaturesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCopyMemoryIndirectFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceCopyMemoryIndirectFeaturesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceCopyMemoryIndirectFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesNV create(long address) {
        return new VkPhysicalDeviceCopyMemoryIndirectFeaturesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceCopyMemoryIndirectFeaturesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceCopyMemoryIndirectFeaturesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCopyMemoryIndirectFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCopyMemoryIndirectFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCopyMemoryIndirectFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceCopyMemoryIndirectFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCopyMemoryIndirectFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceCopyMemoryIndirectFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCopyMemoryIndirectFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceCopyMemoryIndirectFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCopyMemoryIndirectFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCopyMemoryIndirectFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceCopyMemoryIndirectFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceCopyMemoryIndirectFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #indirectCopy}. */
    public static int nindirectCopy(long struct) { return memGetInt(struct + VkPhysicalDeviceCopyMemoryIndirectFeaturesNV.INDIRECTCOPY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCopyMemoryIndirectFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceCopyMemoryIndirectFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #indirectCopy(boolean) indirectCopy}. */
    public static void nindirectCopy(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCopyMemoryIndirectFeaturesNV.INDIRECTCOPY, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceCopyMemoryIndirectFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCopyMemoryIndirectFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceCopyMemoryIndirectFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceCopyMemoryIndirectFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceCopyMemoryIndirectFeaturesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceCopyMemoryIndirectFeaturesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceCopyMemoryIndirectFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceCopyMemoryIndirectFeaturesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceCopyMemoryIndirectFeaturesNV.npNext(address()); }
        /** @return the value of the {@code indirectCopy} field. */
        @NativeType("VkBool32")
        public boolean indirectCopy() { return VkPhysicalDeviceCopyMemoryIndirectFeaturesNV.nindirectCopy(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceCopyMemoryIndirectFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVCopyMemoryIndirect#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_FEATURES_NV} value to the {@code sType} field. */
        public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV.Buffer sType$Default() { return sType(NVCopyMemoryIndirect.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_FEATURES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceCopyMemoryIndirectFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code indirectCopy} field. */
        public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV.Buffer indirectCopy(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceCopyMemoryIndirectFeaturesNV.nindirectCopy(address(), value ? 1 : 0); return this; }

    }

}