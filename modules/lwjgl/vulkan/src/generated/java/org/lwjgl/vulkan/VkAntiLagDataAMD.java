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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying the parameters for vkAntiLagUpdateAMD.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure specifies anti-lag parameters.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link AMDAntiLag#VK_STRUCTURE_TYPE_ANTI_LAG_DATA_AMD STRUCTURE_TYPE_ANTI_LAG_DATA_AMD}</li>
 * <li>{@code mode} <b>must</b> be a valid {@code VkAntiLagModeAMD} value</li>
 * <li>If {@code pPresentationInfo} is not {@code NULL}, {@code pPresentationInfo} <b>must</b> be a valid pointer to a valid {@link VkAntiLagPresentationInfoAMD} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAntiLagPresentationInfoAMD}, {@link AMDAntiLag#vkAntiLagUpdateAMD AntiLagUpdateAMD}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAntiLagDataAMD {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkAntiLagModeAMD {@link #mode};
 *     uint32_t {@link #maxFPS};
 *     {@link VkAntiLagPresentationInfoAMD VkAntiLagPresentationInfoAMD} const * {@link #pPresentationInfo};
 * }</code></pre>
 */
public class VkAntiLagDataAMD extends Struct<VkAntiLagDataAMD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MODE,
        MAXFPS,
        PPRESENTATIONINFO;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MODE = layout.offsetof(2);
        MAXFPS = layout.offsetof(3);
        PPRESENTATIONINFO = layout.offsetof(4);
    }

    protected VkAntiLagDataAMD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAntiLagDataAMD create(long address, @Nullable ByteBuffer container) {
        return new VkAntiLagDataAMD(address, container);
    }

    /**
     * Creates a {@code VkAntiLagDataAMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAntiLagDataAMD(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a {@code VkAntiLagModeAMD} value specifying the anti-lag status. */
    @NativeType("VkAntiLagModeAMD")
    public int mode() { return nmode(address()); }
    /** the framerate limit, in frames per second, used by the application. This limit will be imposed if anti-lag is enabled. If the application tries to render faster, the framerate will be reduced to match this limit. A value of 0 will disable the limit. */
    @NativeType("uint32_t")
    public int maxFPS() { return nmaxFPS(address()); }
    /** a pointer to a {@link VkAntiLagPresentationInfoAMD} structure containing information about the application stage. */
    @Nullable
    @NativeType("VkAntiLagPresentationInfoAMD const *")
    public VkAntiLagPresentationInfoAMD pPresentationInfo() { return npPresentationInfo(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkAntiLagDataAMD sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link AMDAntiLag#VK_STRUCTURE_TYPE_ANTI_LAG_DATA_AMD STRUCTURE_TYPE_ANTI_LAG_DATA_AMD} value to the {@link #sType} field. */
    public VkAntiLagDataAMD sType$Default() { return sType(AMDAntiLag.VK_STRUCTURE_TYPE_ANTI_LAG_DATA_AMD); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkAntiLagDataAMD pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #mode} field. */
    public VkAntiLagDataAMD mode(@NativeType("VkAntiLagModeAMD") int value) { nmode(address(), value); return this; }
    /** Sets the specified value to the {@link #maxFPS} field. */
    public VkAntiLagDataAMD maxFPS(@NativeType("uint32_t") int value) { nmaxFPS(address(), value); return this; }
    /** Sets the address of the specified {@link VkAntiLagPresentationInfoAMD} to the {@link #pPresentationInfo} field. */
    public VkAntiLagDataAMD pPresentationInfo(@Nullable @NativeType("VkAntiLagPresentationInfoAMD const *") VkAntiLagPresentationInfoAMD value) { npPresentationInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAntiLagDataAMD set(
        int sType,
        long pNext,
        int mode,
        int maxFPS,
        @Nullable VkAntiLagPresentationInfoAMD pPresentationInfo
    ) {
        sType(sType);
        pNext(pNext);
        mode(mode);
        maxFPS(maxFPS);
        pPresentationInfo(pPresentationInfo);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAntiLagDataAMD set(VkAntiLagDataAMD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAntiLagDataAMD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAntiLagDataAMD malloc() {
        return new VkAntiLagDataAMD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAntiLagDataAMD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAntiLagDataAMD calloc() {
        return new VkAntiLagDataAMD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAntiLagDataAMD} instance allocated with {@link BufferUtils}. */
    public static VkAntiLagDataAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAntiLagDataAMD(memAddress(container), container);
    }

    /** Returns a new {@code VkAntiLagDataAMD} instance for the specified memory address. */
    public static VkAntiLagDataAMD create(long address) {
        return new VkAntiLagDataAMD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAntiLagDataAMD createSafe(long address) {
        return address == NULL ? null : new VkAntiLagDataAMD(address, null);
    }

    /**
     * Returns a new {@link VkAntiLagDataAMD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAntiLagDataAMD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAntiLagDataAMD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAntiLagDataAMD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAntiLagDataAMD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAntiLagDataAMD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAntiLagDataAMD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAntiLagDataAMD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAntiLagDataAMD.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAntiLagDataAMD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAntiLagDataAMD malloc(MemoryStack stack) {
        return new VkAntiLagDataAMD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAntiLagDataAMD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAntiLagDataAMD calloc(MemoryStack stack) {
        return new VkAntiLagDataAMD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAntiLagDataAMD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAntiLagDataAMD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAntiLagDataAMD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAntiLagDataAMD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkAntiLagDataAMD.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAntiLagDataAMD.PNEXT); }
    /** Unsafe version of {@link #mode}. */
    public static int nmode(long struct) { return memGetInt(struct + VkAntiLagDataAMD.MODE); }
    /** Unsafe version of {@link #maxFPS}. */
    public static int nmaxFPS(long struct) { return memGetInt(struct + VkAntiLagDataAMD.MAXFPS); }
    /** Unsafe version of {@link #pPresentationInfo}. */
    @Nullable public static VkAntiLagPresentationInfoAMD npPresentationInfo(long struct) { return VkAntiLagPresentationInfoAMD.createSafe(memGetAddress(struct + VkAntiLagDataAMD.PPRESENTATIONINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkAntiLagDataAMD.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAntiLagDataAMD.PNEXT, value); }
    /** Unsafe version of {@link #mode(int) mode}. */
    public static void nmode(long struct, int value) { memPutInt(struct + VkAntiLagDataAMD.MODE, value); }
    /** Unsafe version of {@link #maxFPS(int) maxFPS}. */
    public static void nmaxFPS(long struct, int value) { memPutInt(struct + VkAntiLagDataAMD.MAXFPS, value); }
    /** Unsafe version of {@link #pPresentationInfo(VkAntiLagPresentationInfoAMD) pPresentationInfo}. */
    public static void npPresentationInfo(long struct, @Nullable VkAntiLagPresentationInfoAMD value) { memPutAddress(struct + VkAntiLagDataAMD.PPRESENTATIONINFO, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link VkAntiLagDataAMD} structs. */
    public static class Buffer extends StructBuffer<VkAntiLagDataAMD, Buffer> implements NativeResource {

        private static final VkAntiLagDataAMD ELEMENT_FACTORY = VkAntiLagDataAMD.create(-1L);

        /**
         * Creates a new {@code VkAntiLagDataAMD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAntiLagDataAMD#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAntiLagDataAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkAntiLagDataAMD#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAntiLagDataAMD.nsType(address()); }
        /** @return the value of the {@link VkAntiLagDataAMD#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAntiLagDataAMD.npNext(address()); }
        /** @return the value of the {@link VkAntiLagDataAMD#mode} field. */
        @NativeType("VkAntiLagModeAMD")
        public int mode() { return VkAntiLagDataAMD.nmode(address()); }
        /** @return the value of the {@link VkAntiLagDataAMD#maxFPS} field. */
        @NativeType("uint32_t")
        public int maxFPS() { return VkAntiLagDataAMD.nmaxFPS(address()); }
        /** @return a {@link VkAntiLagPresentationInfoAMD} view of the struct pointed to by the {@link VkAntiLagDataAMD#pPresentationInfo} field. */
        @Nullable
        @NativeType("VkAntiLagPresentationInfoAMD const *")
        public VkAntiLagPresentationInfoAMD pPresentationInfo() { return VkAntiLagDataAMD.npPresentationInfo(address()); }

        /** Sets the specified value to the {@link VkAntiLagDataAMD#sType} field. */
        public VkAntiLagDataAMD.Buffer sType(@NativeType("VkStructureType") int value) { VkAntiLagDataAMD.nsType(address(), value); return this; }
        /** Sets the {@link AMDAntiLag#VK_STRUCTURE_TYPE_ANTI_LAG_DATA_AMD STRUCTURE_TYPE_ANTI_LAG_DATA_AMD} value to the {@link VkAntiLagDataAMD#sType} field. */
        public VkAntiLagDataAMD.Buffer sType$Default() { return sType(AMDAntiLag.VK_STRUCTURE_TYPE_ANTI_LAG_DATA_AMD); }
        /** Sets the specified value to the {@link VkAntiLagDataAMD#pNext} field. */
        public VkAntiLagDataAMD.Buffer pNext(@NativeType("void const *") long value) { VkAntiLagDataAMD.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkAntiLagDataAMD#mode} field. */
        public VkAntiLagDataAMD.Buffer mode(@NativeType("VkAntiLagModeAMD") int value) { VkAntiLagDataAMD.nmode(address(), value); return this; }
        /** Sets the specified value to the {@link VkAntiLagDataAMD#maxFPS} field. */
        public VkAntiLagDataAMD.Buffer maxFPS(@NativeType("uint32_t") int value) { VkAntiLagDataAMD.nmaxFPS(address(), value); return this; }
        /** Sets the address of the specified {@link VkAntiLagPresentationInfoAMD} to the {@link VkAntiLagDataAMD#pPresentationInfo} field. */
        public VkAntiLagDataAMD.Buffer pPresentationInfo(@Nullable @NativeType("VkAntiLagPresentationInfoAMD const *") VkAntiLagPresentationInfoAMD value) { VkAntiLagDataAMD.npPresentationInfo(address(), value); return this; }

    }

}