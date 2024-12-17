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
 * struct VkAccelerationStructureBuildGeometryInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkAccelerationStructureTypeKHR type;
 *     VkBuildAccelerationStructureFlagsKHR flags;
 *     VkBuildAccelerationStructureModeKHR mode;
 *     VkAccelerationStructureKHR srcAccelerationStructure;
 *     VkAccelerationStructureKHR dstAccelerationStructure;
 *     uint32_t geometryCount;
 *     {@link VkAccelerationStructureGeometryKHR VkAccelerationStructureGeometryKHR} const * pGeometries;
 *     {@link VkAccelerationStructureGeometryKHR VkAccelerationStructureGeometryKHR} const * const * ppGeometries;
 *     {@link VkDeviceOrHostAddressKHR VkDeviceOrHostAddressKHR} scratchData;
 * }}</pre>
 */
public class VkAccelerationStructureBuildGeometryInfoKHR extends Struct<VkAccelerationStructureBuildGeometryInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TYPE,
        FLAGS,
        MODE,
        SRCACCELERATIONSTRUCTURE,
        DSTACCELERATIONSTRUCTURE,
        GEOMETRYCOUNT,
        PGEOMETRIES,
        PPGEOMETRIES,
        SCRATCHDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(8),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(VkDeviceOrHostAddressKHR.SIZEOF, VkDeviceOrHostAddressKHR.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
        MODE = layout.offsetof(4);
        SRCACCELERATIONSTRUCTURE = layout.offsetof(5);
        DSTACCELERATIONSTRUCTURE = layout.offsetof(6);
        GEOMETRYCOUNT = layout.offsetof(7);
        PGEOMETRIES = layout.offsetof(8);
        PPGEOMETRIES = layout.offsetof(9);
        SCRATCHDATA = layout.offsetof(10);
    }

    protected VkAccelerationStructureBuildGeometryInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAccelerationStructureBuildGeometryInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkAccelerationStructureBuildGeometryInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkAccelerationStructureBuildGeometryInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureBuildGeometryInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code type} field. */
    @NativeType("VkAccelerationStructureTypeKHR")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkBuildAccelerationStructureFlagsKHR")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code mode} field. */
    @NativeType("VkBuildAccelerationStructureModeKHR")
    public int mode() { return nmode(address()); }
    /** @return the value of the {@code srcAccelerationStructure} field. */
    @NativeType("VkAccelerationStructureKHR")
    public long srcAccelerationStructure() { return nsrcAccelerationStructure(address()); }
    /** @return the value of the {@code dstAccelerationStructure} field. */
    @NativeType("VkAccelerationStructureKHR")
    public long dstAccelerationStructure() { return ndstAccelerationStructure(address()); }
    /** @return the value of the {@code geometryCount} field. */
    @NativeType("uint32_t")
    public int geometryCount() { return ngeometryCount(address()); }
    /** @return a {@link VkAccelerationStructureGeometryKHR.Buffer} view of the struct array pointed to by the {@code pGeometries} field. */
    @NativeType("VkAccelerationStructureGeometryKHR const *")
    public VkAccelerationStructureGeometryKHR.@Nullable Buffer pGeometries() { return npGeometries(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code ppGeometries} field. */
    @NativeType("VkAccelerationStructureGeometryKHR const * const *")
    public @Nullable PointerBuffer ppGeometries() { return nppGeometries(address()); }
    /** @return a {@link VkDeviceOrHostAddressKHR} view of the {@code scratchData} field. */
    public VkDeviceOrHostAddressKHR scratchData() { return nscratchData(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkAccelerationStructureBuildGeometryInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO_KHR} value to the {@code sType} field. */
    public VkAccelerationStructureBuildGeometryInfoKHR sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkAccelerationStructureBuildGeometryInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code type} field. */
    public VkAccelerationStructureBuildGeometryInfoKHR type(@NativeType("VkAccelerationStructureTypeKHR") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkAccelerationStructureBuildGeometryInfoKHR flags(@NativeType("VkBuildAccelerationStructureFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code mode} field. */
    public VkAccelerationStructureBuildGeometryInfoKHR mode(@NativeType("VkBuildAccelerationStructureModeKHR") int value) { nmode(address(), value); return this; }
    /** Sets the specified value to the {@code srcAccelerationStructure} field. */
    public VkAccelerationStructureBuildGeometryInfoKHR srcAccelerationStructure(@NativeType("VkAccelerationStructureKHR") long value) { nsrcAccelerationStructure(address(), value); return this; }
    /** Sets the specified value to the {@code dstAccelerationStructure} field. */
    public VkAccelerationStructureBuildGeometryInfoKHR dstAccelerationStructure(@NativeType("VkAccelerationStructureKHR") long value) { ndstAccelerationStructure(address(), value); return this; }
    /** Sets the specified value to the {@code geometryCount} field. */
    public VkAccelerationStructureBuildGeometryInfoKHR geometryCount(@NativeType("uint32_t") int value) { ngeometryCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkAccelerationStructureGeometryKHR.Buffer} to the {@code pGeometries} field. */
    public VkAccelerationStructureBuildGeometryInfoKHR pGeometries(@NativeType("VkAccelerationStructureGeometryKHR const *") VkAccelerationStructureGeometryKHR.@Nullable Buffer value) { npGeometries(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code ppGeometries} field. */
    public VkAccelerationStructureBuildGeometryInfoKHR ppGeometries(@Nullable @NativeType("VkAccelerationStructureGeometryKHR const * const *") PointerBuffer value) { nppGeometries(address(), value); return this; }
    /** Copies the specified {@link VkDeviceOrHostAddressKHR} to the {@code scratchData} field. */
    public VkAccelerationStructureBuildGeometryInfoKHR scratchData(VkDeviceOrHostAddressKHR value) { nscratchData(address(), value); return this; }
    /** Passes the {@code scratchData} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureBuildGeometryInfoKHR scratchData(java.util.function.Consumer<VkDeviceOrHostAddressKHR> consumer) { consumer.accept(scratchData()); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureBuildGeometryInfoKHR set(
        int sType,
        long pNext,
        int type,
        int flags,
        int mode,
        long srcAccelerationStructure,
        long dstAccelerationStructure,
        int geometryCount,
        VkAccelerationStructureGeometryKHR.@Nullable Buffer pGeometries,
        @Nullable PointerBuffer ppGeometries,
        VkDeviceOrHostAddressKHR scratchData
    ) {
        sType(sType);
        pNext(pNext);
        type(type);
        flags(flags);
        mode(mode);
        srcAccelerationStructure(srcAccelerationStructure);
        dstAccelerationStructure(dstAccelerationStructure);
        geometryCount(geometryCount);
        pGeometries(pGeometries);
        ppGeometries(ppGeometries);
        scratchData(scratchData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureBuildGeometryInfoKHR set(VkAccelerationStructureBuildGeometryInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureBuildGeometryInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureBuildGeometryInfoKHR malloc() {
        return new VkAccelerationStructureBuildGeometryInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureBuildGeometryInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureBuildGeometryInfoKHR calloc() {
        return new VkAccelerationStructureBuildGeometryInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureBuildGeometryInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureBuildGeometryInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureBuildGeometryInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureBuildGeometryInfoKHR} instance for the specified memory address. */
    public static VkAccelerationStructureBuildGeometryInfoKHR create(long address) {
        return new VkAccelerationStructureBuildGeometryInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAccelerationStructureBuildGeometryInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkAccelerationStructureBuildGeometryInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureBuildGeometryInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildGeometryInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureBuildGeometryInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildGeometryInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureBuildGeometryInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildGeometryInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAccelerationStructureBuildGeometryInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildGeometryInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAccelerationStructureBuildGeometryInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAccelerationStructureBuildGeometryInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureBuildGeometryInfoKHR malloc(MemoryStack stack) {
        return new VkAccelerationStructureBuildGeometryInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAccelerationStructureBuildGeometryInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureBuildGeometryInfoKHR calloc(MemoryStack stack) {
        return new VkAccelerationStructureBuildGeometryInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureBuildGeometryInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildGeometryInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureBuildGeometryInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildGeometryInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkAccelerationStructureBuildGeometryInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAccelerationStructureBuildGeometryInfoKHR.PNEXT); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + VkAccelerationStructureBuildGeometryInfoKHR.TYPE); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkAccelerationStructureBuildGeometryInfoKHR.FLAGS); }
    /** Unsafe version of {@link #mode}. */
    public static int nmode(long struct) { return memGetInt(struct + VkAccelerationStructureBuildGeometryInfoKHR.MODE); }
    /** Unsafe version of {@link #srcAccelerationStructure}. */
    public static long nsrcAccelerationStructure(long struct) { return memGetLong(struct + VkAccelerationStructureBuildGeometryInfoKHR.SRCACCELERATIONSTRUCTURE); }
    /** Unsafe version of {@link #dstAccelerationStructure}. */
    public static long ndstAccelerationStructure(long struct) { return memGetLong(struct + VkAccelerationStructureBuildGeometryInfoKHR.DSTACCELERATIONSTRUCTURE); }
    /** Unsafe version of {@link #geometryCount}. */
    public static int ngeometryCount(long struct) { return memGetInt(struct + VkAccelerationStructureBuildGeometryInfoKHR.GEOMETRYCOUNT); }
    /** Unsafe version of {@link #pGeometries}. */
    public static VkAccelerationStructureGeometryKHR.@Nullable Buffer npGeometries(long struct) { return VkAccelerationStructureGeometryKHR.createSafe(memGetAddress(struct + VkAccelerationStructureBuildGeometryInfoKHR.PGEOMETRIES), ngeometryCount(struct)); }
    /** Unsafe version of {@link #ppGeometries() ppGeometries}. */
    public static @Nullable PointerBuffer nppGeometries(long struct) { return memPointerBufferSafe(memGetAddress(struct + VkAccelerationStructureBuildGeometryInfoKHR.PPGEOMETRIES), ngeometryCount(struct)); }
    /** Unsafe version of {@link #scratchData}. */
    public static VkDeviceOrHostAddressKHR nscratchData(long struct) { return VkDeviceOrHostAddressKHR.create(struct + VkAccelerationStructureBuildGeometryInfoKHR.SCRATCHDATA); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkAccelerationStructureBuildGeometryInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAccelerationStructureBuildGeometryInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + VkAccelerationStructureBuildGeometryInfoKHR.TYPE, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkAccelerationStructureBuildGeometryInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #mode(int) mode}. */
    public static void nmode(long struct, int value) { memPutInt(struct + VkAccelerationStructureBuildGeometryInfoKHR.MODE, value); }
    /** Unsafe version of {@link #srcAccelerationStructure(long) srcAccelerationStructure}. */
    public static void nsrcAccelerationStructure(long struct, long value) { memPutLong(struct + VkAccelerationStructureBuildGeometryInfoKHR.SRCACCELERATIONSTRUCTURE, value); }
    /** Unsafe version of {@link #dstAccelerationStructure(long) dstAccelerationStructure}. */
    public static void ndstAccelerationStructure(long struct, long value) { memPutLong(struct + VkAccelerationStructureBuildGeometryInfoKHR.DSTACCELERATIONSTRUCTURE, value); }
    /** Sets the specified value to the {@code geometryCount} field of the specified {@code struct}. */
    public static void ngeometryCount(long struct, int value) { memPutInt(struct + VkAccelerationStructureBuildGeometryInfoKHR.GEOMETRYCOUNT, value); }
    /** Unsafe version of {@link #pGeometries(VkAccelerationStructureGeometryKHR.Buffer) pGeometries}. */
    public static void npGeometries(long struct, VkAccelerationStructureGeometryKHR.@Nullable Buffer value) { memPutAddress(struct + VkAccelerationStructureBuildGeometryInfoKHR.PGEOMETRIES, memAddressSafe(value)); }
    /** Unsafe version of {@link #ppGeometries(PointerBuffer) ppGeometries}. */
    public static void nppGeometries(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + VkAccelerationStructureBuildGeometryInfoKHR.PPGEOMETRIES, memAddressSafe(value)); }
    /** Unsafe version of {@link #scratchData(VkDeviceOrHostAddressKHR) scratchData}. */
    public static void nscratchData(long struct, VkDeviceOrHostAddressKHR value) { memCopy(value.address(), struct + VkAccelerationStructureBuildGeometryInfoKHR.SCRATCHDATA, VkDeviceOrHostAddressKHR.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureBuildGeometryInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureBuildGeometryInfoKHR, Buffer> implements NativeResource {

        private static final VkAccelerationStructureBuildGeometryInfoKHR ELEMENT_FACTORY = VkAccelerationStructureBuildGeometryInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureBuildGeometryInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureBuildGeometryInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAccelerationStructureBuildGeometryInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAccelerationStructureBuildGeometryInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAccelerationStructureBuildGeometryInfoKHR.npNext(address()); }
        /** @return the value of the {@code type} field. */
        @NativeType("VkAccelerationStructureTypeKHR")
        public int type() { return VkAccelerationStructureBuildGeometryInfoKHR.ntype(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkBuildAccelerationStructureFlagsKHR")
        public int flags() { return VkAccelerationStructureBuildGeometryInfoKHR.nflags(address()); }
        /** @return the value of the {@code mode} field. */
        @NativeType("VkBuildAccelerationStructureModeKHR")
        public int mode() { return VkAccelerationStructureBuildGeometryInfoKHR.nmode(address()); }
        /** @return the value of the {@code srcAccelerationStructure} field. */
        @NativeType("VkAccelerationStructureKHR")
        public long srcAccelerationStructure() { return VkAccelerationStructureBuildGeometryInfoKHR.nsrcAccelerationStructure(address()); }
        /** @return the value of the {@code dstAccelerationStructure} field. */
        @NativeType("VkAccelerationStructureKHR")
        public long dstAccelerationStructure() { return VkAccelerationStructureBuildGeometryInfoKHR.ndstAccelerationStructure(address()); }
        /** @return the value of the {@code geometryCount} field. */
        @NativeType("uint32_t")
        public int geometryCount() { return VkAccelerationStructureBuildGeometryInfoKHR.ngeometryCount(address()); }
        /** @return a {@link VkAccelerationStructureGeometryKHR.Buffer} view of the struct array pointed to by the {@code pGeometries} field. */
        @NativeType("VkAccelerationStructureGeometryKHR const *")
        public VkAccelerationStructureGeometryKHR.@Nullable Buffer pGeometries() { return VkAccelerationStructureBuildGeometryInfoKHR.npGeometries(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code ppGeometries} field. */
        @NativeType("VkAccelerationStructureGeometryKHR const * const *")
        public @Nullable PointerBuffer ppGeometries() { return VkAccelerationStructureBuildGeometryInfoKHR.nppGeometries(address()); }
        /** @return a {@link VkDeviceOrHostAddressKHR} view of the {@code scratchData} field. */
        public VkDeviceOrHostAddressKHR scratchData() { return VkAccelerationStructureBuildGeometryInfoKHR.nscratchData(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkAccelerationStructureBuildGeometryInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkAccelerationStructureBuildGeometryInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO_KHR} value to the {@code sType} field. */
        public VkAccelerationStructureBuildGeometryInfoKHR.Buffer sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkAccelerationStructureBuildGeometryInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkAccelerationStructureBuildGeometryInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code type} field. */
        public VkAccelerationStructureBuildGeometryInfoKHR.Buffer type(@NativeType("VkAccelerationStructureTypeKHR") int value) { VkAccelerationStructureBuildGeometryInfoKHR.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkAccelerationStructureBuildGeometryInfoKHR.Buffer flags(@NativeType("VkBuildAccelerationStructureFlagsKHR") int value) { VkAccelerationStructureBuildGeometryInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code mode} field. */
        public VkAccelerationStructureBuildGeometryInfoKHR.Buffer mode(@NativeType("VkBuildAccelerationStructureModeKHR") int value) { VkAccelerationStructureBuildGeometryInfoKHR.nmode(address(), value); return this; }
        /** Sets the specified value to the {@code srcAccelerationStructure} field. */
        public VkAccelerationStructureBuildGeometryInfoKHR.Buffer srcAccelerationStructure(@NativeType("VkAccelerationStructureKHR") long value) { VkAccelerationStructureBuildGeometryInfoKHR.nsrcAccelerationStructure(address(), value); return this; }
        /** Sets the specified value to the {@code dstAccelerationStructure} field. */
        public VkAccelerationStructureBuildGeometryInfoKHR.Buffer dstAccelerationStructure(@NativeType("VkAccelerationStructureKHR") long value) { VkAccelerationStructureBuildGeometryInfoKHR.ndstAccelerationStructure(address(), value); return this; }
        /** Sets the specified value to the {@code geometryCount} field. */
        public VkAccelerationStructureBuildGeometryInfoKHR.Buffer geometryCount(@NativeType("uint32_t") int value) { VkAccelerationStructureBuildGeometryInfoKHR.ngeometryCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkAccelerationStructureGeometryKHR.Buffer} to the {@code pGeometries} field. */
        public VkAccelerationStructureBuildGeometryInfoKHR.Buffer pGeometries(@NativeType("VkAccelerationStructureGeometryKHR const *") VkAccelerationStructureGeometryKHR.@Nullable Buffer value) { VkAccelerationStructureBuildGeometryInfoKHR.npGeometries(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code ppGeometries} field. */
        public VkAccelerationStructureBuildGeometryInfoKHR.Buffer ppGeometries(@Nullable @NativeType("VkAccelerationStructureGeometryKHR const * const *") PointerBuffer value) { VkAccelerationStructureBuildGeometryInfoKHR.nppGeometries(address(), value); return this; }
        /** Copies the specified {@link VkDeviceOrHostAddressKHR} to the {@code scratchData} field. */
        public VkAccelerationStructureBuildGeometryInfoKHR.Buffer scratchData(VkDeviceOrHostAddressKHR value) { VkAccelerationStructureBuildGeometryInfoKHR.nscratchData(address(), value); return this; }
        /** Passes the {@code scratchData} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureBuildGeometryInfoKHR.Buffer scratchData(java.util.function.Consumer<VkDeviceOrHostAddressKHR> consumer) { consumer.accept(scratchData()); return this; }

    }

}