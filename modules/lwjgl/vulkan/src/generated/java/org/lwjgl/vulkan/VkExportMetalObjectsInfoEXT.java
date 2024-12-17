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
 * struct VkExportMetalObjectsInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 * }}</pre>
 */
public class VkExportMetalObjectsInfoEXT extends Struct<VkExportMetalObjectsInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
    }

    protected VkExportMetalObjectsInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkExportMetalObjectsInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkExportMetalObjectsInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkExportMetalObjectsInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExportMetalObjectsInfoEXT(ByteBuffer container) {
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

    /** Sets the specified value to the {@code sType} field. */
    public VkExportMetalObjectsInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMetalObjects#VK_STRUCTURE_TYPE_EXPORT_METAL_OBJECTS_INFO_EXT STRUCTURE_TYPE_EXPORT_METAL_OBJECTS_INFO_EXT} value to the {@code sType} field. */
    public VkExportMetalObjectsInfoEXT sType$Default() { return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_OBJECTS_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkExportMetalObjectsInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkExportMetalBufferInfoEXT} value to the {@code pNext} chain. */
    public VkExportMetalObjectsInfoEXT pNext(VkExportMetalBufferInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExportMetalCommandQueueInfoEXT} value to the {@code pNext} chain. */
    public VkExportMetalObjectsInfoEXT pNext(VkExportMetalCommandQueueInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExportMetalDeviceInfoEXT} value to the {@code pNext} chain. */
    public VkExportMetalObjectsInfoEXT pNext(VkExportMetalDeviceInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExportMetalIOSurfaceInfoEXT} value to the {@code pNext} chain. */
    public VkExportMetalObjectsInfoEXT pNext(VkExportMetalIOSurfaceInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExportMetalSharedEventInfoEXT} value to the {@code pNext} chain. */
    public VkExportMetalObjectsInfoEXT pNext(VkExportMetalSharedEventInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExportMetalTextureInfoEXT} value to the {@code pNext} chain. */
    public VkExportMetalObjectsInfoEXT pNext(VkExportMetalTextureInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }

    /** Initializes this struct with the specified values. */
    public VkExportMetalObjectsInfoEXT set(
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
    public VkExportMetalObjectsInfoEXT set(VkExportMetalObjectsInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExportMetalObjectsInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExportMetalObjectsInfoEXT malloc() {
        return new VkExportMetalObjectsInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkExportMetalObjectsInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExportMetalObjectsInfoEXT calloc() {
        return new VkExportMetalObjectsInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkExportMetalObjectsInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkExportMetalObjectsInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExportMetalObjectsInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkExportMetalObjectsInfoEXT} instance for the specified memory address. */
    public static VkExportMetalObjectsInfoEXT create(long address) {
        return new VkExportMetalObjectsInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkExportMetalObjectsInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkExportMetalObjectsInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkExportMetalObjectsInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMetalObjectsInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExportMetalObjectsInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMetalObjectsInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMetalObjectsInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMetalObjectsInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkExportMetalObjectsInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExportMetalObjectsInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkExportMetalObjectsInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkExportMetalObjectsInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMetalObjectsInfoEXT malloc(MemoryStack stack) {
        return new VkExportMetalObjectsInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkExportMetalObjectsInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMetalObjectsInfoEXT calloc(MemoryStack stack) {
        return new VkExportMetalObjectsInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkExportMetalObjectsInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportMetalObjectsInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMetalObjectsInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportMetalObjectsInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkExportMetalObjectsInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExportMetalObjectsInfoEXT.PNEXT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkExportMetalObjectsInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExportMetalObjectsInfoEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkExportMetalObjectsInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkExportMetalObjectsInfoEXT, Buffer> implements NativeResource {

        private static final VkExportMetalObjectsInfoEXT ELEMENT_FACTORY = VkExportMetalObjectsInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkExportMetalObjectsInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExportMetalObjectsInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkExportMetalObjectsInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExportMetalObjectsInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkExportMetalObjectsInfoEXT.npNext(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkExportMetalObjectsInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkExportMetalObjectsInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTMetalObjects#VK_STRUCTURE_TYPE_EXPORT_METAL_OBJECTS_INFO_EXT STRUCTURE_TYPE_EXPORT_METAL_OBJECTS_INFO_EXT} value to the {@code sType} field. */
        public VkExportMetalObjectsInfoEXT.Buffer sType$Default() { return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_OBJECTS_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkExportMetalObjectsInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkExportMetalObjectsInfoEXT.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkExportMetalBufferInfoEXT} value to the {@code pNext} chain. */
        public VkExportMetalObjectsInfoEXT.Buffer pNext(VkExportMetalBufferInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExportMetalCommandQueueInfoEXT} value to the {@code pNext} chain. */
        public VkExportMetalObjectsInfoEXT.Buffer pNext(VkExportMetalCommandQueueInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExportMetalDeviceInfoEXT} value to the {@code pNext} chain. */
        public VkExportMetalObjectsInfoEXT.Buffer pNext(VkExportMetalDeviceInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExportMetalIOSurfaceInfoEXT} value to the {@code pNext} chain. */
        public VkExportMetalObjectsInfoEXT.Buffer pNext(VkExportMetalIOSurfaceInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExportMetalSharedEventInfoEXT} value to the {@code pNext} chain. */
        public VkExportMetalObjectsInfoEXT.Buffer pNext(VkExportMetalSharedEventInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExportMetalTextureInfoEXT} value to the {@code pNext} chain. */
        public VkExportMetalObjectsInfoEXT.Buffer pNext(VkExportMetalTextureInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }

    }

}