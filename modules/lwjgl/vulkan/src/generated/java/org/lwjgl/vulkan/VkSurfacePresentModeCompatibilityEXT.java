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
 * struct VkSurfacePresentModeCompatibilityEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t presentModeCount;
 *     VkPresentModeKHR * pPresentModes;
 * }}</pre>
 */
public class VkSurfacePresentModeCompatibilityEXT extends Struct<VkSurfacePresentModeCompatibilityEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRESENTMODECOUNT,
        PPRESENTMODES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRESENTMODECOUNT = layout.offsetof(2);
        PPRESENTMODES = layout.offsetof(3);
    }

    protected VkSurfacePresentModeCompatibilityEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSurfacePresentModeCompatibilityEXT create(long address, @Nullable ByteBuffer container) {
        return new VkSurfacePresentModeCompatibilityEXT(address, container);
    }

    /**
     * Creates a {@code VkSurfacePresentModeCompatibilityEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSurfacePresentModeCompatibilityEXT(ByteBuffer container) {
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
    /** @return the value of the {@code presentModeCount} field. */
    @NativeType("uint32_t")
    public int presentModeCount() { return npresentModeCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pPresentModes} field. */
    @NativeType("VkPresentModeKHR *")
    public @Nullable IntBuffer pPresentModes() { return npPresentModes(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSurfacePresentModeCompatibilityEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTSurfaceMaintenance1#VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_COMPATIBILITY_EXT STRUCTURE_TYPE_SURFACE_PRESENT_MODE_COMPATIBILITY_EXT} value to the {@code sType} field. */
    public VkSurfacePresentModeCompatibilityEXT sType$Default() { return sType(EXTSurfaceMaintenance1.VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_COMPATIBILITY_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSurfacePresentModeCompatibilityEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code presentModeCount} field. */
    public VkSurfacePresentModeCompatibilityEXT presentModeCount(@NativeType("uint32_t") int value) { npresentModeCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pPresentModes} field. */
    public VkSurfacePresentModeCompatibilityEXT pPresentModes(@Nullable @NativeType("VkPresentModeKHR *") IntBuffer value) { npPresentModes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSurfacePresentModeCompatibilityEXT set(
        int sType,
        long pNext,
        int presentModeCount,
        @Nullable IntBuffer pPresentModes
    ) {
        sType(sType);
        pNext(pNext);
        presentModeCount(presentModeCount);
        pPresentModes(pPresentModes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSurfacePresentModeCompatibilityEXT set(VkSurfacePresentModeCompatibilityEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSurfacePresentModeCompatibilityEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSurfacePresentModeCompatibilityEXT malloc() {
        return new VkSurfacePresentModeCompatibilityEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSurfacePresentModeCompatibilityEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSurfacePresentModeCompatibilityEXT calloc() {
        return new VkSurfacePresentModeCompatibilityEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSurfacePresentModeCompatibilityEXT} instance allocated with {@link BufferUtils}. */
    public static VkSurfacePresentModeCompatibilityEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSurfacePresentModeCompatibilityEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkSurfacePresentModeCompatibilityEXT} instance for the specified memory address. */
    public static VkSurfacePresentModeCompatibilityEXT create(long address) {
        return new VkSurfacePresentModeCompatibilityEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSurfacePresentModeCompatibilityEXT createSafe(long address) {
        return address == NULL ? null : new VkSurfacePresentModeCompatibilityEXT(address, null);
    }

    /**
     * Returns a new {@link VkSurfacePresentModeCompatibilityEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeCompatibilityEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSurfacePresentModeCompatibilityEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeCompatibilityEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfacePresentModeCompatibilityEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeCompatibilityEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSurfacePresentModeCompatibilityEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeCompatibilityEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSurfacePresentModeCompatibilityEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSurfacePresentModeCompatibilityEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfacePresentModeCompatibilityEXT malloc(MemoryStack stack) {
        return new VkSurfacePresentModeCompatibilityEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSurfacePresentModeCompatibilityEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfacePresentModeCompatibilityEXT calloc(MemoryStack stack) {
        return new VkSurfacePresentModeCompatibilityEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSurfacePresentModeCompatibilityEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeCompatibilityEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfacePresentModeCompatibilityEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeCompatibilityEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSurfacePresentModeCompatibilityEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSurfacePresentModeCompatibilityEXT.PNEXT); }
    /** Unsafe version of {@link #presentModeCount}. */
    public static int npresentModeCount(long struct) { return memGetInt(struct + VkSurfacePresentModeCompatibilityEXT.PRESENTMODECOUNT); }
    /** Unsafe version of {@link #pPresentModes() pPresentModes}. */
    public static @Nullable IntBuffer npPresentModes(long struct) { return memIntBufferSafe(memGetAddress(struct + VkSurfacePresentModeCompatibilityEXT.PPRESENTMODES), npresentModeCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSurfacePresentModeCompatibilityEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSurfacePresentModeCompatibilityEXT.PNEXT, value); }
    /** Sets the specified value to the {@code presentModeCount} field of the specified {@code struct}. */
    public static void npresentModeCount(long struct, int value) { memPutInt(struct + VkSurfacePresentModeCompatibilityEXT.PRESENTMODECOUNT, value); }
    /** Unsafe version of {@link #pPresentModes(IntBuffer) pPresentModes}. */
    public static void npPresentModes(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkSurfacePresentModeCompatibilityEXT.PPRESENTMODES, memAddressSafe(value)); if (value != null) { npresentModeCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkSurfacePresentModeCompatibilityEXT} structs. */
    public static class Buffer extends StructBuffer<VkSurfacePresentModeCompatibilityEXT, Buffer> implements NativeResource {

        private static final VkSurfacePresentModeCompatibilityEXT ELEMENT_FACTORY = VkSurfacePresentModeCompatibilityEXT.create(-1L);

        /**
         * Creates a new {@code VkSurfacePresentModeCompatibilityEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSurfacePresentModeCompatibilityEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSurfacePresentModeCompatibilityEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSurfacePresentModeCompatibilityEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSurfacePresentModeCompatibilityEXT.npNext(address()); }
        /** @return the value of the {@code presentModeCount} field. */
        @NativeType("uint32_t")
        public int presentModeCount() { return VkSurfacePresentModeCompatibilityEXT.npresentModeCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pPresentModes} field. */
        @NativeType("VkPresentModeKHR *")
        public @Nullable IntBuffer pPresentModes() { return VkSurfacePresentModeCompatibilityEXT.npPresentModes(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSurfacePresentModeCompatibilityEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSurfacePresentModeCompatibilityEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTSurfaceMaintenance1#VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_COMPATIBILITY_EXT STRUCTURE_TYPE_SURFACE_PRESENT_MODE_COMPATIBILITY_EXT} value to the {@code sType} field. */
        public VkSurfacePresentModeCompatibilityEXT.Buffer sType$Default() { return sType(EXTSurfaceMaintenance1.VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_COMPATIBILITY_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSurfacePresentModeCompatibilityEXT.Buffer pNext(@NativeType("void *") long value) { VkSurfacePresentModeCompatibilityEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code presentModeCount} field. */
        public VkSurfacePresentModeCompatibilityEXT.Buffer presentModeCount(@NativeType("uint32_t") int value) { VkSurfacePresentModeCompatibilityEXT.npresentModeCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pPresentModes} field. */
        public VkSurfacePresentModeCompatibilityEXT.Buffer pPresentModes(@Nullable @NativeType("VkPresentModeKHR *") IntBuffer value) { VkSurfacePresentModeCompatibilityEXT.npPresentModes(address(), value); return this; }

    }

}