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
 * Stub description of VkCuLaunchInfoNVX.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVXBinaryImport#VK_STRUCTURE_TYPE_CU_LAUNCH_INFO_NVX STRUCTURE_TYPE_CU_LAUNCH_INFO_NVX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code function} <b>must</b> be a valid {@code VkCuFunctionNVX} handle</li>
 * <li>If {@code paramCount} is not 0, {@code pParams} <b>must</b> be a valid pointer to an array of {@code paramCount} bytes</li>
 * <li>If {@code extraCount} is not 0, {@code pExtras} <b>must</b> be a valid pointer to an array of {@code extraCount} bytes</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link NVXBinaryImport#vkCmdCuLaunchKernelNVX CmdCuLaunchKernelNVX}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCuLaunchInfoNVX {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkCuFunctionNVX function;
 *     uint32_t gridDimX;
 *     uint32_t gridDimY;
 *     uint32_t gridDimZ;
 *     uint32_t blockDimX;
 *     uint32_t blockDimY;
 *     uint32_t blockDimZ;
 *     uint32_t sharedMemBytes;
 *     size_t paramCount;
 *     void const * const * pParams;
 *     size_t extraCount;
 *     void const * const * pExtras;
 * }</code></pre>
 */
public class VkCuLaunchInfoNVX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FUNCTION,
        GRIDDIMX,
        GRIDDIMY,
        GRIDDIMZ,
        BLOCKDIMX,
        BLOCKDIMY,
        BLOCKDIMZ,
        SHAREDMEMBYTES,
        PARAMCOUNT,
        PPARAMS,
        EXTRACOUNT,
        PEXTRAS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FUNCTION = layout.offsetof(2);
        GRIDDIMX = layout.offsetof(3);
        GRIDDIMY = layout.offsetof(4);
        GRIDDIMZ = layout.offsetof(5);
        BLOCKDIMX = layout.offsetof(6);
        BLOCKDIMY = layout.offsetof(7);
        BLOCKDIMZ = layout.offsetof(8);
        SHAREDMEMBYTES = layout.offsetof(9);
        PARAMCOUNT = layout.offsetof(10);
        PPARAMS = layout.offsetof(11);
        EXTRACOUNT = layout.offsetof(12);
        PEXTRAS = layout.offsetof(13);
    }

    /**
     * Creates a {@code VkCuLaunchInfoNVX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCuLaunchInfoNVX(ByteBuffer container) {
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
    /** @return the value of the {@code function} field. */
    @NativeType("VkCuFunctionNVX")
    public long function() { return nfunction(address()); }
    /** @return the value of the {@code gridDimX} field. */
    @NativeType("uint32_t")
    public int gridDimX() { return ngridDimX(address()); }
    /** @return the value of the {@code gridDimY} field. */
    @NativeType("uint32_t")
    public int gridDimY() { return ngridDimY(address()); }
    /** @return the value of the {@code gridDimZ} field. */
    @NativeType("uint32_t")
    public int gridDimZ() { return ngridDimZ(address()); }
    /** @return the value of the {@code blockDimX} field. */
    @NativeType("uint32_t")
    public int blockDimX() { return nblockDimX(address()); }
    /** @return the value of the {@code blockDimY} field. */
    @NativeType("uint32_t")
    public int blockDimY() { return nblockDimY(address()); }
    /** @return the value of the {@code blockDimZ} field. */
    @NativeType("uint32_t")
    public int blockDimZ() { return nblockDimZ(address()); }
    /** @return the value of the {@code sharedMemBytes} field. */
    @NativeType("uint32_t")
    public int sharedMemBytes() { return nsharedMemBytes(address()); }
    /** @return the value of the {@code paramCount} field. */
    @NativeType("size_t")
    public long paramCount() { return nparamCount(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code pParams} field. */
    @Nullable
    @NativeType("void const * const *")
    public PointerBuffer pParams() { return npParams(address()); }
    /** @return the value of the {@code extraCount} field. */
    @NativeType("size_t")
    public long extraCount() { return nextraCount(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code pExtras} field. */
    @Nullable
    @NativeType("void const * const *")
    public PointerBuffer pExtras() { return npExtras(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkCuLaunchInfoNVX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVXBinaryImport#VK_STRUCTURE_TYPE_CU_LAUNCH_INFO_NVX STRUCTURE_TYPE_CU_LAUNCH_INFO_NVX} value to the {@code sType} field. */
    public VkCuLaunchInfoNVX sType$Default() { return sType(NVXBinaryImport.VK_STRUCTURE_TYPE_CU_LAUNCH_INFO_NVX); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCuLaunchInfoNVX pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code function} field. */
    public VkCuLaunchInfoNVX function(@NativeType("VkCuFunctionNVX") long value) { nfunction(address(), value); return this; }
    /** Sets the specified value to the {@code gridDimX} field. */
    public VkCuLaunchInfoNVX gridDimX(@NativeType("uint32_t") int value) { ngridDimX(address(), value); return this; }
    /** Sets the specified value to the {@code gridDimY} field. */
    public VkCuLaunchInfoNVX gridDimY(@NativeType("uint32_t") int value) { ngridDimY(address(), value); return this; }
    /** Sets the specified value to the {@code gridDimZ} field. */
    public VkCuLaunchInfoNVX gridDimZ(@NativeType("uint32_t") int value) { ngridDimZ(address(), value); return this; }
    /** Sets the specified value to the {@code blockDimX} field. */
    public VkCuLaunchInfoNVX blockDimX(@NativeType("uint32_t") int value) { nblockDimX(address(), value); return this; }
    /** Sets the specified value to the {@code blockDimY} field. */
    public VkCuLaunchInfoNVX blockDimY(@NativeType("uint32_t") int value) { nblockDimY(address(), value); return this; }
    /** Sets the specified value to the {@code blockDimZ} field. */
    public VkCuLaunchInfoNVX blockDimZ(@NativeType("uint32_t") int value) { nblockDimZ(address(), value); return this; }
    /** Sets the specified value to the {@code sharedMemBytes} field. */
    public VkCuLaunchInfoNVX sharedMemBytes(@NativeType("uint32_t") int value) { nsharedMemBytes(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code pParams} field. */
    public VkCuLaunchInfoNVX pParams(@Nullable @NativeType("void const * const *") PointerBuffer value) { npParams(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code pExtras} field. */
    public VkCuLaunchInfoNVX pExtras(@Nullable @NativeType("void const * const *") PointerBuffer value) { npExtras(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCuLaunchInfoNVX set(
        int sType,
        long pNext,
        long function,
        int gridDimX,
        int gridDimY,
        int gridDimZ,
        int blockDimX,
        int blockDimY,
        int blockDimZ,
        int sharedMemBytes,
        @Nullable PointerBuffer pParams,
        @Nullable PointerBuffer pExtras
    ) {
        sType(sType);
        pNext(pNext);
        function(function);
        gridDimX(gridDimX);
        gridDimY(gridDimY);
        gridDimZ(gridDimZ);
        blockDimX(blockDimX);
        blockDimY(blockDimY);
        blockDimZ(blockDimZ);
        sharedMemBytes(sharedMemBytes);
        pParams(pParams);
        pExtras(pExtras);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCuLaunchInfoNVX set(VkCuLaunchInfoNVX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCuLaunchInfoNVX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCuLaunchInfoNVX malloc() {
        return wrap(VkCuLaunchInfoNVX.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkCuLaunchInfoNVX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCuLaunchInfoNVX calloc() {
        return wrap(VkCuLaunchInfoNVX.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkCuLaunchInfoNVX} instance allocated with {@link BufferUtils}. */
    public static VkCuLaunchInfoNVX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkCuLaunchInfoNVX.class, memAddress(container), container);
    }

    /** Returns a new {@code VkCuLaunchInfoNVX} instance for the specified memory address. */
    public static VkCuLaunchInfoNVX create(long address) {
        return wrap(VkCuLaunchInfoNVX.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCuLaunchInfoNVX createSafe(long address) {
        return address == NULL ? null : wrap(VkCuLaunchInfoNVX.class, address);
    }

    /**
     * Returns a new {@link VkCuLaunchInfoNVX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCuLaunchInfoNVX.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCuLaunchInfoNVX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCuLaunchInfoNVX.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCuLaunchInfoNVX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCuLaunchInfoNVX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkCuLaunchInfoNVX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCuLaunchInfoNVX.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCuLaunchInfoNVX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkCuLaunchInfoNVX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCuLaunchInfoNVX malloc(MemoryStack stack) {
        return wrap(VkCuLaunchInfoNVX.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkCuLaunchInfoNVX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCuLaunchInfoNVX calloc(MemoryStack stack) {
        return wrap(VkCuLaunchInfoNVX.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkCuLaunchInfoNVX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCuLaunchInfoNVX.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCuLaunchInfoNVX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCuLaunchInfoNVX.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkCuLaunchInfoNVX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCuLaunchInfoNVX.PNEXT); }
    /** Unsafe version of {@link #function}. */
    public static long nfunction(long struct) { return UNSAFE.getLong(null, struct + VkCuLaunchInfoNVX.FUNCTION); }
    /** Unsafe version of {@link #gridDimX}. */
    public static int ngridDimX(long struct) { return UNSAFE.getInt(null, struct + VkCuLaunchInfoNVX.GRIDDIMX); }
    /** Unsafe version of {@link #gridDimY}. */
    public static int ngridDimY(long struct) { return UNSAFE.getInt(null, struct + VkCuLaunchInfoNVX.GRIDDIMY); }
    /** Unsafe version of {@link #gridDimZ}. */
    public static int ngridDimZ(long struct) { return UNSAFE.getInt(null, struct + VkCuLaunchInfoNVX.GRIDDIMZ); }
    /** Unsafe version of {@link #blockDimX}. */
    public static int nblockDimX(long struct) { return UNSAFE.getInt(null, struct + VkCuLaunchInfoNVX.BLOCKDIMX); }
    /** Unsafe version of {@link #blockDimY}. */
    public static int nblockDimY(long struct) { return UNSAFE.getInt(null, struct + VkCuLaunchInfoNVX.BLOCKDIMY); }
    /** Unsafe version of {@link #blockDimZ}. */
    public static int nblockDimZ(long struct) { return UNSAFE.getInt(null, struct + VkCuLaunchInfoNVX.BLOCKDIMZ); }
    /** Unsafe version of {@link #sharedMemBytes}. */
    public static int nsharedMemBytes(long struct) { return UNSAFE.getInt(null, struct + VkCuLaunchInfoNVX.SHAREDMEMBYTES); }
    /** Unsafe version of {@link #paramCount}. */
    public static long nparamCount(long struct) { return memGetAddress(struct + VkCuLaunchInfoNVX.PARAMCOUNT); }
    /** Unsafe version of {@link #pParams() pParams}. */
    @Nullable public static PointerBuffer npParams(long struct) { return memPointerBufferSafe(memGetAddress(struct + VkCuLaunchInfoNVX.PPARAMS), (int)nparamCount(struct)); }
    /** Unsafe version of {@link #extraCount}. */
    public static long nextraCount(long struct) { return memGetAddress(struct + VkCuLaunchInfoNVX.EXTRACOUNT); }
    /** Unsafe version of {@link #pExtras() pExtras}. */
    @Nullable public static PointerBuffer npExtras(long struct) { return memPointerBufferSafe(memGetAddress(struct + VkCuLaunchInfoNVX.PEXTRAS), (int)nextraCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkCuLaunchInfoNVX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCuLaunchInfoNVX.PNEXT, value); }
    /** Unsafe version of {@link #function(long) function}. */
    public static void nfunction(long struct, long value) { UNSAFE.putLong(null, struct + VkCuLaunchInfoNVX.FUNCTION, value); }
    /** Unsafe version of {@link #gridDimX(int) gridDimX}. */
    public static void ngridDimX(long struct, int value) { UNSAFE.putInt(null, struct + VkCuLaunchInfoNVX.GRIDDIMX, value); }
    /** Unsafe version of {@link #gridDimY(int) gridDimY}. */
    public static void ngridDimY(long struct, int value) { UNSAFE.putInt(null, struct + VkCuLaunchInfoNVX.GRIDDIMY, value); }
    /** Unsafe version of {@link #gridDimZ(int) gridDimZ}. */
    public static void ngridDimZ(long struct, int value) { UNSAFE.putInt(null, struct + VkCuLaunchInfoNVX.GRIDDIMZ, value); }
    /** Unsafe version of {@link #blockDimX(int) blockDimX}. */
    public static void nblockDimX(long struct, int value) { UNSAFE.putInt(null, struct + VkCuLaunchInfoNVX.BLOCKDIMX, value); }
    /** Unsafe version of {@link #blockDimY(int) blockDimY}. */
    public static void nblockDimY(long struct, int value) { UNSAFE.putInt(null, struct + VkCuLaunchInfoNVX.BLOCKDIMY, value); }
    /** Unsafe version of {@link #blockDimZ(int) blockDimZ}. */
    public static void nblockDimZ(long struct, int value) { UNSAFE.putInt(null, struct + VkCuLaunchInfoNVX.BLOCKDIMZ, value); }
    /** Unsafe version of {@link #sharedMemBytes(int) sharedMemBytes}. */
    public static void nsharedMemBytes(long struct, int value) { UNSAFE.putInt(null, struct + VkCuLaunchInfoNVX.SHAREDMEMBYTES, value); }
    /** Sets the specified value to the {@code paramCount} field of the specified {@code struct}. */
    public static void nparamCount(long struct, long value) { memPutAddress(struct + VkCuLaunchInfoNVX.PARAMCOUNT, value); }
    /** Unsafe version of {@link #pParams(PointerBuffer) pParams}. */
    public static void npParams(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + VkCuLaunchInfoNVX.PPARAMS, memAddressSafe(value)); nparamCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code extraCount} field of the specified {@code struct}. */
    public static void nextraCount(long struct, long value) { memPutAddress(struct + VkCuLaunchInfoNVX.EXTRACOUNT, value); }
    /** Unsafe version of {@link #pExtras(PointerBuffer) pExtras}. */
    public static void npExtras(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + VkCuLaunchInfoNVX.PEXTRAS, memAddressSafe(value)); nextraCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nparamCount(struct) != 0) {
            check(memGetAddress(struct + VkCuLaunchInfoNVX.PPARAMS));
        }
        if (nextraCount(struct) != 0) {
            check(memGetAddress(struct + VkCuLaunchInfoNVX.PEXTRAS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkCuLaunchInfoNVX} structs. */
    public static class Buffer extends StructBuffer<VkCuLaunchInfoNVX, Buffer> implements NativeResource {

        private static final VkCuLaunchInfoNVX ELEMENT_FACTORY = VkCuLaunchInfoNVX.create(-1L);

        /**
         * Creates a new {@code VkCuLaunchInfoNVX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCuLaunchInfoNVX#SIZEOF}, and its mark will be undefined.
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
        protected VkCuLaunchInfoNVX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCuLaunchInfoNVX.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCuLaunchInfoNVX.npNext(address()); }
        /** @return the value of the {@code function} field. */
        @NativeType("VkCuFunctionNVX")
        public long function() { return VkCuLaunchInfoNVX.nfunction(address()); }
        /** @return the value of the {@code gridDimX} field. */
        @NativeType("uint32_t")
        public int gridDimX() { return VkCuLaunchInfoNVX.ngridDimX(address()); }
        /** @return the value of the {@code gridDimY} field. */
        @NativeType("uint32_t")
        public int gridDimY() { return VkCuLaunchInfoNVX.ngridDimY(address()); }
        /** @return the value of the {@code gridDimZ} field. */
        @NativeType("uint32_t")
        public int gridDimZ() { return VkCuLaunchInfoNVX.ngridDimZ(address()); }
        /** @return the value of the {@code blockDimX} field. */
        @NativeType("uint32_t")
        public int blockDimX() { return VkCuLaunchInfoNVX.nblockDimX(address()); }
        /** @return the value of the {@code blockDimY} field. */
        @NativeType("uint32_t")
        public int blockDimY() { return VkCuLaunchInfoNVX.nblockDimY(address()); }
        /** @return the value of the {@code blockDimZ} field. */
        @NativeType("uint32_t")
        public int blockDimZ() { return VkCuLaunchInfoNVX.nblockDimZ(address()); }
        /** @return the value of the {@code sharedMemBytes} field. */
        @NativeType("uint32_t")
        public int sharedMemBytes() { return VkCuLaunchInfoNVX.nsharedMemBytes(address()); }
        /** @return the value of the {@code paramCount} field. */
        @NativeType("size_t")
        public long paramCount() { return VkCuLaunchInfoNVX.nparamCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code pParams} field. */
        @Nullable
        @NativeType("void const * const *")
        public PointerBuffer pParams() { return VkCuLaunchInfoNVX.npParams(address()); }
        /** @return the value of the {@code extraCount} field. */
        @NativeType("size_t")
        public long extraCount() { return VkCuLaunchInfoNVX.nextraCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code pExtras} field. */
        @Nullable
        @NativeType("void const * const *")
        public PointerBuffer pExtras() { return VkCuLaunchInfoNVX.npExtras(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkCuLaunchInfoNVX.Buffer sType(@NativeType("VkStructureType") int value) { VkCuLaunchInfoNVX.nsType(address(), value); return this; }
        /** Sets the {@link NVXBinaryImport#VK_STRUCTURE_TYPE_CU_LAUNCH_INFO_NVX STRUCTURE_TYPE_CU_LAUNCH_INFO_NVX} value to the {@code sType} field. */
        public VkCuLaunchInfoNVX.Buffer sType$Default() { return sType(NVXBinaryImport.VK_STRUCTURE_TYPE_CU_LAUNCH_INFO_NVX); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCuLaunchInfoNVX.Buffer pNext(@NativeType("void const *") long value) { VkCuLaunchInfoNVX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code function} field. */
        public VkCuLaunchInfoNVX.Buffer function(@NativeType("VkCuFunctionNVX") long value) { VkCuLaunchInfoNVX.nfunction(address(), value); return this; }
        /** Sets the specified value to the {@code gridDimX} field. */
        public VkCuLaunchInfoNVX.Buffer gridDimX(@NativeType("uint32_t") int value) { VkCuLaunchInfoNVX.ngridDimX(address(), value); return this; }
        /** Sets the specified value to the {@code gridDimY} field. */
        public VkCuLaunchInfoNVX.Buffer gridDimY(@NativeType("uint32_t") int value) { VkCuLaunchInfoNVX.ngridDimY(address(), value); return this; }
        /** Sets the specified value to the {@code gridDimZ} field. */
        public VkCuLaunchInfoNVX.Buffer gridDimZ(@NativeType("uint32_t") int value) { VkCuLaunchInfoNVX.ngridDimZ(address(), value); return this; }
        /** Sets the specified value to the {@code blockDimX} field. */
        public VkCuLaunchInfoNVX.Buffer blockDimX(@NativeType("uint32_t") int value) { VkCuLaunchInfoNVX.nblockDimX(address(), value); return this; }
        /** Sets the specified value to the {@code blockDimY} field. */
        public VkCuLaunchInfoNVX.Buffer blockDimY(@NativeType("uint32_t") int value) { VkCuLaunchInfoNVX.nblockDimY(address(), value); return this; }
        /** Sets the specified value to the {@code blockDimZ} field. */
        public VkCuLaunchInfoNVX.Buffer blockDimZ(@NativeType("uint32_t") int value) { VkCuLaunchInfoNVX.nblockDimZ(address(), value); return this; }
        /** Sets the specified value to the {@code sharedMemBytes} field. */
        public VkCuLaunchInfoNVX.Buffer sharedMemBytes(@NativeType("uint32_t") int value) { VkCuLaunchInfoNVX.nsharedMemBytes(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code pParams} field. */
        public VkCuLaunchInfoNVX.Buffer pParams(@Nullable @NativeType("void const * const *") PointerBuffer value) { VkCuLaunchInfoNVX.npParams(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code pExtras} field. */
        public VkCuLaunchInfoNVX.Buffer pExtras(@Nullable @NativeType("void const * const *") PointerBuffer value) { VkCuLaunchInfoNVX.npExtras(address(), value); return this; }

    }

}