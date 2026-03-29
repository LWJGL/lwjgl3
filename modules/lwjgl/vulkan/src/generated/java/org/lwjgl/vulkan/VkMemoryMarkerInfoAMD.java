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
 * struct VkMemoryMarkerInfoAMD {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineStageFlags2KHR stage;
 *     {@link VkDeviceAddressRangeKHR VkDeviceAddressRangeKHR} dstRange;
 *     VkAddressCommandFlagsKHR dstFlags;
 *     uint32_t marker;
 * }</code></pre>
 */
public class VkMemoryMarkerInfoAMD extends Struct<VkMemoryMarkerInfoAMD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STAGE,
        DSTRANGE,
        DSTFLAGS,
        MARKER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(VkDeviceAddressRangeKHR.SIZEOF, VkDeviceAddressRangeKHR.ALIGNOF),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STAGE = layout.offsetof(2);
        DSTRANGE = layout.offsetof(3);
        DSTFLAGS = layout.offsetof(4);
        MARKER = layout.offsetof(5);
    }

    protected VkMemoryMarkerInfoAMD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMemoryMarkerInfoAMD create(long address, @Nullable ByteBuffer container) {
        return new VkMemoryMarkerInfoAMD(address, container);
    }

    /**
     * Creates a {@code VkMemoryMarkerInfoAMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryMarkerInfoAMD(ByteBuffer container) {
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
    /** @return the value of the {@code stage} field. */
    @NativeType("VkPipelineStageFlags2KHR")
    public long stage() { return nstage(address()); }
    /** @return a {@link VkDeviceAddressRangeKHR} view of the {@code dstRange} field. */
    public VkDeviceAddressRangeKHR dstRange() { return ndstRange(address()); }
    /** @return the value of the {@code dstFlags} field. */
    @NativeType("VkAddressCommandFlagsKHR")
    public int dstFlags() { return ndstFlags(address()); }
    /** @return the value of the {@code marker} field. */
    @NativeType("uint32_t")
    public int marker() { return nmarker(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkMemoryMarkerInfoAMD sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRDeviceAddressCommands#VK_STRUCTURE_TYPE_MEMORY_MARKER_INFO_AMD STRUCTURE_TYPE_MEMORY_MARKER_INFO_AMD} value to the {@code sType} field. */
    public VkMemoryMarkerInfoAMD sType$Default() { return sType(KHRDeviceAddressCommands.VK_STRUCTURE_TYPE_MEMORY_MARKER_INFO_AMD); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkMemoryMarkerInfoAMD pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code stage} field. */
    public VkMemoryMarkerInfoAMD stage(@NativeType("VkPipelineStageFlags2KHR") long value) { nstage(address(), value); return this; }
    /** Copies the specified {@link VkDeviceAddressRangeKHR} to the {@code dstRange} field. */
    public VkMemoryMarkerInfoAMD dstRange(VkDeviceAddressRangeKHR value) { ndstRange(address(), value); return this; }
    /** Passes the {@code dstRange} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkMemoryMarkerInfoAMD dstRange(java.util.function.Consumer<VkDeviceAddressRangeKHR> consumer) { consumer.accept(dstRange()); return this; }
    /** Sets the specified value to the {@code dstFlags} field. */
    public VkMemoryMarkerInfoAMD dstFlags(@NativeType("VkAddressCommandFlagsKHR") int value) { ndstFlags(address(), value); return this; }
    /** Sets the specified value to the {@code marker} field. */
    public VkMemoryMarkerInfoAMD marker(@NativeType("uint32_t") int value) { nmarker(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryMarkerInfoAMD set(
        int sType,
        long pNext,
        long stage,
        VkDeviceAddressRangeKHR dstRange,
        int dstFlags,
        int marker
    ) {
        sType(sType);
        pNext(pNext);
        stage(stage);
        dstRange(dstRange);
        dstFlags(dstFlags);
        marker(marker);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryMarkerInfoAMD set(VkMemoryMarkerInfoAMD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryMarkerInfoAMD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryMarkerInfoAMD malloc() {
        return new VkMemoryMarkerInfoAMD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryMarkerInfoAMD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryMarkerInfoAMD calloc() {
        return new VkMemoryMarkerInfoAMD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryMarkerInfoAMD} instance allocated with {@link BufferUtils}. */
    public static VkMemoryMarkerInfoAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryMarkerInfoAMD(memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryMarkerInfoAMD} instance for the specified memory address. */
    public static VkMemoryMarkerInfoAMD create(long address) {
        return new VkMemoryMarkerInfoAMD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkMemoryMarkerInfoAMD createSafe(long address) {
        return address == NULL ? null : new VkMemoryMarkerInfoAMD(address, null);
    }

    /**
     * Returns a new {@link VkMemoryMarkerInfoAMD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryMarkerInfoAMD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryMarkerInfoAMD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryMarkerInfoAMD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryMarkerInfoAMD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryMarkerInfoAMD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMemoryMarkerInfoAMD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryMarkerInfoAMD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkMemoryMarkerInfoAMD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkMemoryMarkerInfoAMD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryMarkerInfoAMD malloc(MemoryStack stack) {
        return new VkMemoryMarkerInfoAMD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMemoryMarkerInfoAMD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryMarkerInfoAMD calloc(MemoryStack stack) {
        return new VkMemoryMarkerInfoAMD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMemoryMarkerInfoAMD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryMarkerInfoAMD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryMarkerInfoAMD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryMarkerInfoAMD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkMemoryMarkerInfoAMD.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryMarkerInfoAMD.PNEXT); }
    /** Unsafe version of {@link #stage}. */
    public static long nstage(long struct) { return memGetLong(struct + VkMemoryMarkerInfoAMD.STAGE); }
    /** Unsafe version of {@link #dstRange}. */
    public static VkDeviceAddressRangeKHR ndstRange(long struct) { return VkDeviceAddressRangeKHR.create(struct + VkMemoryMarkerInfoAMD.DSTRANGE); }
    /** Unsafe version of {@link #dstFlags}. */
    public static int ndstFlags(long struct) { return memGetInt(struct + VkMemoryMarkerInfoAMD.DSTFLAGS); }
    /** Unsafe version of {@link #marker}. */
    public static int nmarker(long struct) { return memGetInt(struct + VkMemoryMarkerInfoAMD.MARKER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkMemoryMarkerInfoAMD.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryMarkerInfoAMD.PNEXT, value); }
    /** Unsafe version of {@link #stage(long) stage}. */
    public static void nstage(long struct, long value) { memPutLong(struct + VkMemoryMarkerInfoAMD.STAGE, value); }
    /** Unsafe version of {@link #dstRange(VkDeviceAddressRangeKHR) dstRange}. */
    public static void ndstRange(long struct, VkDeviceAddressRangeKHR value) { memCopy(value.address(), struct + VkMemoryMarkerInfoAMD.DSTRANGE, VkDeviceAddressRangeKHR.SIZEOF); }
    /** Unsafe version of {@link #dstFlags(int) dstFlags}. */
    public static void ndstFlags(long struct, int value) { memPutInt(struct + VkMemoryMarkerInfoAMD.DSTFLAGS, value); }
    /** Unsafe version of {@link #marker(int) marker}. */
    public static void nmarker(long struct, int value) { memPutInt(struct + VkMemoryMarkerInfoAMD.MARKER, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryMarkerInfoAMD} structs. */
    public static class Buffer extends StructBuffer<VkMemoryMarkerInfoAMD, Buffer> implements NativeResource {

        private static final VkMemoryMarkerInfoAMD ELEMENT_FACTORY = VkMemoryMarkerInfoAMD.create(-1L);

        /**
         * Creates a new {@code VkMemoryMarkerInfoAMD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryMarkerInfoAMD#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMemoryMarkerInfoAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryMarkerInfoAMD.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMemoryMarkerInfoAMD.npNext(address()); }
        /** @return the value of the {@code stage} field. */
        @NativeType("VkPipelineStageFlags2KHR")
        public long stage() { return VkMemoryMarkerInfoAMD.nstage(address()); }
        /** @return a {@link VkDeviceAddressRangeKHR} view of the {@code dstRange} field. */
        public VkDeviceAddressRangeKHR dstRange() { return VkMemoryMarkerInfoAMD.ndstRange(address()); }
        /** @return the value of the {@code dstFlags} field. */
        @NativeType("VkAddressCommandFlagsKHR")
        public int dstFlags() { return VkMemoryMarkerInfoAMD.ndstFlags(address()); }
        /** @return the value of the {@code marker} field. */
        @NativeType("uint32_t")
        public int marker() { return VkMemoryMarkerInfoAMD.nmarker(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkMemoryMarkerInfoAMD.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryMarkerInfoAMD.nsType(address(), value); return this; }
        /** Sets the {@link KHRDeviceAddressCommands#VK_STRUCTURE_TYPE_MEMORY_MARKER_INFO_AMD STRUCTURE_TYPE_MEMORY_MARKER_INFO_AMD} value to the {@code sType} field. */
        public VkMemoryMarkerInfoAMD.Buffer sType$Default() { return sType(KHRDeviceAddressCommands.VK_STRUCTURE_TYPE_MEMORY_MARKER_INFO_AMD); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkMemoryMarkerInfoAMD.Buffer pNext(@NativeType("void const *") long value) { VkMemoryMarkerInfoAMD.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code stage} field. */
        public VkMemoryMarkerInfoAMD.Buffer stage(@NativeType("VkPipelineStageFlags2KHR") long value) { VkMemoryMarkerInfoAMD.nstage(address(), value); return this; }
        /** Copies the specified {@link VkDeviceAddressRangeKHR} to the {@code dstRange} field. */
        public VkMemoryMarkerInfoAMD.Buffer dstRange(VkDeviceAddressRangeKHR value) { VkMemoryMarkerInfoAMD.ndstRange(address(), value); return this; }
        /** Passes the {@code dstRange} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkMemoryMarkerInfoAMD.Buffer dstRange(java.util.function.Consumer<VkDeviceAddressRangeKHR> consumer) { consumer.accept(dstRange()); return this; }
        /** Sets the specified value to the {@code dstFlags} field. */
        public VkMemoryMarkerInfoAMD.Buffer dstFlags(@NativeType("VkAddressCommandFlagsKHR") int value) { VkMemoryMarkerInfoAMD.ndstFlags(address(), value); return this; }
        /** Sets the specified value to the {@code marker} field. */
        public VkMemoryMarkerInfoAMD.Buffer marker(@NativeType("uint32_t") int value) { VkMemoryMarkerInfoAMD.nmarker(address(), value); return this; }

    }

}