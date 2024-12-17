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
 * struct VkLatencySurfaceCapabilitiesNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t presentModeCount;
 *     VkPresentModeKHR * pPresentModes;
 * }}</pre>
 */
public class VkLatencySurfaceCapabilitiesNV extends Struct<VkLatencySurfaceCapabilitiesNV> implements NativeResource {

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

    protected VkLatencySurfaceCapabilitiesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkLatencySurfaceCapabilitiesNV create(long address, @Nullable ByteBuffer container) {
        return new VkLatencySurfaceCapabilitiesNV(address, container);
    }

    /**
     * Creates a {@code VkLatencySurfaceCapabilitiesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkLatencySurfaceCapabilitiesNV(ByteBuffer container) {
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
    /** @return the value of the {@code presentModeCount} field. */
    @NativeType("uint32_t")
    public int presentModeCount() { return npresentModeCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pPresentModes} field. */
    @NativeType("VkPresentModeKHR *")
    public @Nullable IntBuffer pPresentModes() { return npPresentModes(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkLatencySurfaceCapabilitiesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVLowLatency2#VK_STRUCTURE_TYPE_LATENCY_SURFACE_CAPABILITIES_NV STRUCTURE_TYPE_LATENCY_SURFACE_CAPABILITIES_NV} value to the {@code sType} field. */
    public VkLatencySurfaceCapabilitiesNV sType$Default() { return sType(NVLowLatency2.VK_STRUCTURE_TYPE_LATENCY_SURFACE_CAPABILITIES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkLatencySurfaceCapabilitiesNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code presentModeCount} field. */
    public VkLatencySurfaceCapabilitiesNV presentModeCount(@NativeType("uint32_t") int value) { npresentModeCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pPresentModes} field. */
    public VkLatencySurfaceCapabilitiesNV pPresentModes(@Nullable @NativeType("VkPresentModeKHR *") IntBuffer value) { npPresentModes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkLatencySurfaceCapabilitiesNV set(
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
    public VkLatencySurfaceCapabilitiesNV set(VkLatencySurfaceCapabilitiesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkLatencySurfaceCapabilitiesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkLatencySurfaceCapabilitiesNV malloc() {
        return new VkLatencySurfaceCapabilitiesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkLatencySurfaceCapabilitiesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkLatencySurfaceCapabilitiesNV calloc() {
        return new VkLatencySurfaceCapabilitiesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkLatencySurfaceCapabilitiesNV} instance allocated with {@link BufferUtils}. */
    public static VkLatencySurfaceCapabilitiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkLatencySurfaceCapabilitiesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkLatencySurfaceCapabilitiesNV} instance for the specified memory address. */
    public static VkLatencySurfaceCapabilitiesNV create(long address) {
        return new VkLatencySurfaceCapabilitiesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkLatencySurfaceCapabilitiesNV createSafe(long address) {
        return address == NULL ? null : new VkLatencySurfaceCapabilitiesNV(address, null);
    }

    /**
     * Returns a new {@link VkLatencySurfaceCapabilitiesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkLatencySurfaceCapabilitiesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkLatencySurfaceCapabilitiesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkLatencySurfaceCapabilitiesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkLatencySurfaceCapabilitiesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkLatencySurfaceCapabilitiesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkLatencySurfaceCapabilitiesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkLatencySurfaceCapabilitiesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkLatencySurfaceCapabilitiesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkLatencySurfaceCapabilitiesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkLatencySurfaceCapabilitiesNV malloc(MemoryStack stack) {
        return new VkLatencySurfaceCapabilitiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkLatencySurfaceCapabilitiesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkLatencySurfaceCapabilitiesNV calloc(MemoryStack stack) {
        return new VkLatencySurfaceCapabilitiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkLatencySurfaceCapabilitiesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkLatencySurfaceCapabilitiesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkLatencySurfaceCapabilitiesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkLatencySurfaceCapabilitiesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkLatencySurfaceCapabilitiesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkLatencySurfaceCapabilitiesNV.PNEXT); }
    /** Unsafe version of {@link #presentModeCount}. */
    public static int npresentModeCount(long struct) { return memGetInt(struct + VkLatencySurfaceCapabilitiesNV.PRESENTMODECOUNT); }
    /** Unsafe version of {@link #pPresentModes() pPresentModes}. */
    public static @Nullable IntBuffer npPresentModes(long struct) { return memIntBufferSafe(memGetAddress(struct + VkLatencySurfaceCapabilitiesNV.PPRESENTMODES), npresentModeCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkLatencySurfaceCapabilitiesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkLatencySurfaceCapabilitiesNV.PNEXT, value); }
    /** Sets the specified value to the {@code presentModeCount} field of the specified {@code struct}. */
    public static void npresentModeCount(long struct, int value) { memPutInt(struct + VkLatencySurfaceCapabilitiesNV.PRESENTMODECOUNT, value); }
    /** Unsafe version of {@link #pPresentModes(IntBuffer) pPresentModes}. */
    public static void npPresentModes(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkLatencySurfaceCapabilitiesNV.PPRESENTMODES, memAddressSafe(value)); if (value != null) { npresentModeCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkLatencySurfaceCapabilitiesNV} structs. */
    public static class Buffer extends StructBuffer<VkLatencySurfaceCapabilitiesNV, Buffer> implements NativeResource {

        private static final VkLatencySurfaceCapabilitiesNV ELEMENT_FACTORY = VkLatencySurfaceCapabilitiesNV.create(-1L);

        /**
         * Creates a new {@code VkLatencySurfaceCapabilitiesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkLatencySurfaceCapabilitiesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkLatencySurfaceCapabilitiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkLatencySurfaceCapabilitiesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkLatencySurfaceCapabilitiesNV.npNext(address()); }
        /** @return the value of the {@code presentModeCount} field. */
        @NativeType("uint32_t")
        public int presentModeCount() { return VkLatencySurfaceCapabilitiesNV.npresentModeCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pPresentModes} field. */
        @NativeType("VkPresentModeKHR *")
        public @Nullable IntBuffer pPresentModes() { return VkLatencySurfaceCapabilitiesNV.npPresentModes(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkLatencySurfaceCapabilitiesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkLatencySurfaceCapabilitiesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVLowLatency2#VK_STRUCTURE_TYPE_LATENCY_SURFACE_CAPABILITIES_NV STRUCTURE_TYPE_LATENCY_SURFACE_CAPABILITIES_NV} value to the {@code sType} field. */
        public VkLatencySurfaceCapabilitiesNV.Buffer sType$Default() { return sType(NVLowLatency2.VK_STRUCTURE_TYPE_LATENCY_SURFACE_CAPABILITIES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkLatencySurfaceCapabilitiesNV.Buffer pNext(@NativeType("void const *") long value) { VkLatencySurfaceCapabilitiesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code presentModeCount} field. */
        public VkLatencySurfaceCapabilitiesNV.Buffer presentModeCount(@NativeType("uint32_t") int value) { VkLatencySurfaceCapabilitiesNV.npresentModeCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pPresentModes} field. */
        public VkLatencySurfaceCapabilitiesNV.Buffer pPresentModes(@Nullable @NativeType("VkPresentModeKHR *") IntBuffer value) { VkLatencySurfaceCapabilitiesNV.npPresentModes(address(), value); return this; }

    }

}