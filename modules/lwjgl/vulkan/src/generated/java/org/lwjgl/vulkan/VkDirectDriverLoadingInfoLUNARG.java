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
 * Structure specifying the information required to load an additional driver.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link LUNARGDirectDriverLoading#VK_STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_INFO_LUNARG STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_INFO_LUNARG}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDirectDriverLoadingListLUNARG}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDirectDriverLoadingInfoLUNARG {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkDirectDriverLoadingFlagsLUNARG {@link #flags};
 *     PFN_vkGetInstanceProcAddrLUNARG {@link #pfnGetInstanceProcAddr};
 * }</code></pre>
 */
public class VkDirectDriverLoadingInfoLUNARG extends Struct<VkDirectDriverLoadingInfoLUNARG> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        PFNGETINSTANCEPROCADDR;

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
        FLAGS = layout.offsetof(2);
        PFNGETINSTANCEPROCADDR = layout.offsetof(3);
    }

    protected VkDirectDriverLoadingInfoLUNARG(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDirectDriverLoadingInfoLUNARG create(long address, @Nullable ByteBuffer container) {
        return new VkDirectDriverLoadingInfoLUNARG(address, container);
    }

    /**
     * Creates a {@code VkDirectDriverLoadingInfoLUNARG} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDirectDriverLoadingInfoLUNARG(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** reserved for future use. */
    @NativeType("VkDirectDriverLoadingFlagsLUNARG")
    public int flags() { return nflags(address()); }
    /** a {@code PFN_vkGetInstanceProcAddrLUNARG} pointer to the driver {@link VK10#vkGetInstanceProcAddr GetInstanceProcAddr} function. */
    @NativeType("PFN_vkGetInstanceProcAddrLUNARG")
    public long pfnGetInstanceProcAddr() { return npfnGetInstanceProcAddr(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDirectDriverLoadingInfoLUNARG sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link LUNARGDirectDriverLoading#VK_STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_INFO_LUNARG STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_INFO_LUNARG} value to the {@link #sType} field. */
    public VkDirectDriverLoadingInfoLUNARG sType$Default() { return sType(LUNARGDirectDriverLoading.VK_STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_INFO_LUNARG); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDirectDriverLoadingInfoLUNARG pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkDirectDriverLoadingInfoLUNARG flags(@NativeType("VkDirectDriverLoadingFlagsLUNARG") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #pfnGetInstanceProcAddr} field. */
    public VkDirectDriverLoadingInfoLUNARG pfnGetInstanceProcAddr(@NativeType("PFN_vkGetInstanceProcAddrLUNARG") long value) { npfnGetInstanceProcAddr(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDirectDriverLoadingInfoLUNARG set(
        int sType,
        long pNext,
        int flags,
        long pfnGetInstanceProcAddr
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pfnGetInstanceProcAddr(pfnGetInstanceProcAddr);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDirectDriverLoadingInfoLUNARG set(VkDirectDriverLoadingInfoLUNARG src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDirectDriverLoadingInfoLUNARG} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDirectDriverLoadingInfoLUNARG malloc() {
        return new VkDirectDriverLoadingInfoLUNARG(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDirectDriverLoadingInfoLUNARG} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDirectDriverLoadingInfoLUNARG calloc() {
        return new VkDirectDriverLoadingInfoLUNARG(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDirectDriverLoadingInfoLUNARG} instance allocated with {@link BufferUtils}. */
    public static VkDirectDriverLoadingInfoLUNARG create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDirectDriverLoadingInfoLUNARG(memAddress(container), container);
    }

    /** Returns a new {@code VkDirectDriverLoadingInfoLUNARG} instance for the specified memory address. */
    public static VkDirectDriverLoadingInfoLUNARG create(long address) {
        return new VkDirectDriverLoadingInfoLUNARG(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDirectDriverLoadingInfoLUNARG createSafe(long address) {
        return address == NULL ? null : new VkDirectDriverLoadingInfoLUNARG(address, null);
    }

    /**
     * Returns a new {@link VkDirectDriverLoadingInfoLUNARG.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDirectDriverLoadingInfoLUNARG.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDirectDriverLoadingInfoLUNARG.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDirectDriverLoadingInfoLUNARG.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDirectDriverLoadingInfoLUNARG.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDirectDriverLoadingInfoLUNARG.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDirectDriverLoadingInfoLUNARG.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDirectDriverLoadingInfoLUNARG.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDirectDriverLoadingInfoLUNARG.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDirectDriverLoadingInfoLUNARG} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDirectDriverLoadingInfoLUNARG malloc(MemoryStack stack) {
        return new VkDirectDriverLoadingInfoLUNARG(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDirectDriverLoadingInfoLUNARG} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDirectDriverLoadingInfoLUNARG calloc(MemoryStack stack) {
        return new VkDirectDriverLoadingInfoLUNARG(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDirectDriverLoadingInfoLUNARG.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDirectDriverLoadingInfoLUNARG.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDirectDriverLoadingInfoLUNARG.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDirectDriverLoadingInfoLUNARG.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDirectDriverLoadingInfoLUNARG.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDirectDriverLoadingInfoLUNARG.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkDirectDriverLoadingInfoLUNARG.FLAGS); }
    /** Unsafe version of {@link #pfnGetInstanceProcAddr}. */
    public static long npfnGetInstanceProcAddr(long struct) { return memGetAddress(struct + VkDirectDriverLoadingInfoLUNARG.PFNGETINSTANCEPROCADDR); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDirectDriverLoadingInfoLUNARG.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDirectDriverLoadingInfoLUNARG.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkDirectDriverLoadingInfoLUNARG.FLAGS, value); }
    /** Unsafe version of {@link #pfnGetInstanceProcAddr(long) pfnGetInstanceProcAddr}. */
    public static void npfnGetInstanceProcAddr(long struct, long value) { memPutAddress(struct + VkDirectDriverLoadingInfoLUNARG.PFNGETINSTANCEPROCADDR, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkDirectDriverLoadingInfoLUNARG.PFNGETINSTANCEPROCADDR));
    }

    // -----------------------------------

    /** An array of {@link VkDirectDriverLoadingInfoLUNARG} structs. */
    public static class Buffer extends StructBuffer<VkDirectDriverLoadingInfoLUNARG, Buffer> implements NativeResource {

        private static final VkDirectDriverLoadingInfoLUNARG ELEMENT_FACTORY = VkDirectDriverLoadingInfoLUNARG.create(-1L);

        /**
         * Creates a new {@code VkDirectDriverLoadingInfoLUNARG.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDirectDriverLoadingInfoLUNARG#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDirectDriverLoadingInfoLUNARG getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDirectDriverLoadingInfoLUNARG#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDirectDriverLoadingInfoLUNARG.nsType(address()); }
        /** @return the value of the {@link VkDirectDriverLoadingInfoLUNARG#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDirectDriverLoadingInfoLUNARG.npNext(address()); }
        /** @return the value of the {@link VkDirectDriverLoadingInfoLUNARG#flags} field. */
        @NativeType("VkDirectDriverLoadingFlagsLUNARG")
        public int flags() { return VkDirectDriverLoadingInfoLUNARG.nflags(address()); }
        /** @return the value of the {@link VkDirectDriverLoadingInfoLUNARG#pfnGetInstanceProcAddr} field. */
        @NativeType("PFN_vkGetInstanceProcAddrLUNARG")
        public long pfnGetInstanceProcAddr() { return VkDirectDriverLoadingInfoLUNARG.npfnGetInstanceProcAddr(address()); }

        /** Sets the specified value to the {@link VkDirectDriverLoadingInfoLUNARG#sType} field. */
        public VkDirectDriverLoadingInfoLUNARG.Buffer sType(@NativeType("VkStructureType") int value) { VkDirectDriverLoadingInfoLUNARG.nsType(address(), value); return this; }
        /** Sets the {@link LUNARGDirectDriverLoading#VK_STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_INFO_LUNARG STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_INFO_LUNARG} value to the {@link VkDirectDriverLoadingInfoLUNARG#sType} field. */
        public VkDirectDriverLoadingInfoLUNARG.Buffer sType$Default() { return sType(LUNARGDirectDriverLoading.VK_STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_INFO_LUNARG); }
        /** Sets the specified value to the {@link VkDirectDriverLoadingInfoLUNARG#pNext} field. */
        public VkDirectDriverLoadingInfoLUNARG.Buffer pNext(@NativeType("void *") long value) { VkDirectDriverLoadingInfoLUNARG.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkDirectDriverLoadingInfoLUNARG#flags} field. */
        public VkDirectDriverLoadingInfoLUNARG.Buffer flags(@NativeType("VkDirectDriverLoadingFlagsLUNARG") int value) { VkDirectDriverLoadingInfoLUNARG.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkDirectDriverLoadingInfoLUNARG#pfnGetInstanceProcAddr} field. */
        public VkDirectDriverLoadingInfoLUNARG.Buffer pfnGetInstanceProcAddr(@NativeType("PFN_vkGetInstanceProcAddrLUNARG") long value) { VkDirectDriverLoadingInfoLUNARG.npfnGetInstanceProcAddr(address(), value); return this; }

    }

}