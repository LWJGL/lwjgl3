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
 * struct VkSurfacePresentModeCompatibilityKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t presentModeCount;
 *     VkPresentModeKHR * pPresentModes;
 * }}</pre>
 */
public class VkSurfacePresentModeCompatibilityKHR extends Struct<VkSurfacePresentModeCompatibilityKHR> implements NativeResource {

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

    protected VkSurfacePresentModeCompatibilityKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSurfacePresentModeCompatibilityKHR create(long address, @Nullable ByteBuffer container) {
        return new VkSurfacePresentModeCompatibilityKHR(address, container);
    }

    /**
     * Creates a {@code VkSurfacePresentModeCompatibilityKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSurfacePresentModeCompatibilityKHR(ByteBuffer container) {
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
    public VkSurfacePresentModeCompatibilityKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRSurfaceMaintenance1#VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_COMPATIBILITY_KHR STRUCTURE_TYPE_SURFACE_PRESENT_MODE_COMPATIBILITY_KHR} value to the {@code sType} field. */
    public VkSurfacePresentModeCompatibilityKHR sType$Default() { return sType(KHRSurfaceMaintenance1.VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_COMPATIBILITY_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSurfacePresentModeCompatibilityKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code presentModeCount} field. */
    public VkSurfacePresentModeCompatibilityKHR presentModeCount(@NativeType("uint32_t") int value) { npresentModeCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pPresentModes} field. */
    public VkSurfacePresentModeCompatibilityKHR pPresentModes(@Nullable @NativeType("VkPresentModeKHR *") IntBuffer value) { npPresentModes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSurfacePresentModeCompatibilityKHR set(
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
    public VkSurfacePresentModeCompatibilityKHR set(VkSurfacePresentModeCompatibilityKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSurfacePresentModeCompatibilityKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSurfacePresentModeCompatibilityKHR malloc() {
        return new VkSurfacePresentModeCompatibilityKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSurfacePresentModeCompatibilityKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSurfacePresentModeCompatibilityKHR calloc() {
        return new VkSurfacePresentModeCompatibilityKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSurfacePresentModeCompatibilityKHR} instance allocated with {@link BufferUtils}. */
    public static VkSurfacePresentModeCompatibilityKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSurfacePresentModeCompatibilityKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkSurfacePresentModeCompatibilityKHR} instance for the specified memory address. */
    public static VkSurfacePresentModeCompatibilityKHR create(long address) {
        return new VkSurfacePresentModeCompatibilityKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSurfacePresentModeCompatibilityKHR createSafe(long address) {
        return address == NULL ? null : new VkSurfacePresentModeCompatibilityKHR(address, null);
    }

    /**
     * Returns a new {@link VkSurfacePresentModeCompatibilityKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeCompatibilityKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSurfacePresentModeCompatibilityKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeCompatibilityKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfacePresentModeCompatibilityKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeCompatibilityKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSurfacePresentModeCompatibilityKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeCompatibilityKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSurfacePresentModeCompatibilityKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSurfacePresentModeCompatibilityKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfacePresentModeCompatibilityKHR malloc(MemoryStack stack) {
        return new VkSurfacePresentModeCompatibilityKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSurfacePresentModeCompatibilityKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfacePresentModeCompatibilityKHR calloc(MemoryStack stack) {
        return new VkSurfacePresentModeCompatibilityKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSurfacePresentModeCompatibilityKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeCompatibilityKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfacePresentModeCompatibilityKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeCompatibilityKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSurfacePresentModeCompatibilityKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSurfacePresentModeCompatibilityKHR.PNEXT); }
    /** Unsafe version of {@link #presentModeCount}. */
    public static int npresentModeCount(long struct) { return memGetInt(struct + VkSurfacePresentModeCompatibilityKHR.PRESENTMODECOUNT); }
    /** Unsafe version of {@link #pPresentModes() pPresentModes}. */
    public static @Nullable IntBuffer npPresentModes(long struct) { return memIntBufferSafe(memGetAddress(struct + VkSurfacePresentModeCompatibilityKHR.PPRESENTMODES), npresentModeCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSurfacePresentModeCompatibilityKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSurfacePresentModeCompatibilityKHR.PNEXT, value); }
    /** Sets the specified value to the {@code presentModeCount} field of the specified {@code struct}. */
    public static void npresentModeCount(long struct, int value) { memPutInt(struct + VkSurfacePresentModeCompatibilityKHR.PRESENTMODECOUNT, value); }
    /** Unsafe version of {@link #pPresentModes(IntBuffer) pPresentModes}. */
    public static void npPresentModes(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkSurfacePresentModeCompatibilityKHR.PPRESENTMODES, memAddressSafe(value)); if (value != null) { npresentModeCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkSurfacePresentModeCompatibilityKHR} structs. */
    public static class Buffer extends StructBuffer<VkSurfacePresentModeCompatibilityKHR, Buffer> implements NativeResource {

        private static final VkSurfacePresentModeCompatibilityKHR ELEMENT_FACTORY = VkSurfacePresentModeCompatibilityKHR.create(-1L);

        /**
         * Creates a new {@code VkSurfacePresentModeCompatibilityKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSurfacePresentModeCompatibilityKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSurfacePresentModeCompatibilityKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSurfacePresentModeCompatibilityKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSurfacePresentModeCompatibilityKHR.npNext(address()); }
        /** @return the value of the {@code presentModeCount} field. */
        @NativeType("uint32_t")
        public int presentModeCount() { return VkSurfacePresentModeCompatibilityKHR.npresentModeCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pPresentModes} field. */
        @NativeType("VkPresentModeKHR *")
        public @Nullable IntBuffer pPresentModes() { return VkSurfacePresentModeCompatibilityKHR.npPresentModes(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSurfacePresentModeCompatibilityKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSurfacePresentModeCompatibilityKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRSurfaceMaintenance1#VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_COMPATIBILITY_KHR STRUCTURE_TYPE_SURFACE_PRESENT_MODE_COMPATIBILITY_KHR} value to the {@code sType} field. */
        public VkSurfacePresentModeCompatibilityKHR.Buffer sType$Default() { return sType(KHRSurfaceMaintenance1.VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_COMPATIBILITY_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSurfacePresentModeCompatibilityKHR.Buffer pNext(@NativeType("void *") long value) { VkSurfacePresentModeCompatibilityKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code presentModeCount} field. */
        public VkSurfacePresentModeCompatibilityKHR.Buffer presentModeCount(@NativeType("uint32_t") int value) { VkSurfacePresentModeCompatibilityKHR.npresentModeCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pPresentModes} field. */
        public VkSurfacePresentModeCompatibilityKHR.Buffer pPresentModes(@Nullable @NativeType("VkPresentModeKHR *") IntBuffer value) { VkSurfacePresentModeCompatibilityKHR.npPresentModes(address(), value); return this; }

    }

}