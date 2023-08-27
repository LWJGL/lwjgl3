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
 * Structure specifying additional drivers to load.
 * 
 * <h5>Description</h5>
 * 
 * <p>When creating a Vulkan instance for which additional drivers are to be included, add a {@link VkDirectDriverLoadingListLUNARG} structure to the pNext chain of the {@link VkInstanceCreateInfo} structure, and include in it the list of {@link VkDirectDriverLoadingInfoLUNARG} structures which contain the information necessary to load additional drivers.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link LUNARGDirectDriverLoading#VK_STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_LIST_LUNARG STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_LIST_LUNARG}</li>
 * <li>{@code mode} <b>must</b> be a valid {@code VkDirectDriverLoadingModeLUNARG} value</li>
 * <li>{@code pDrivers} <b>must</b> be a valid pointer to an array of {@code driverCount} valid {@link VkDirectDriverLoadingInfoLUNARG} structures</li>
 * <li>{@code driverCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDirectDriverLoadingInfoLUNARG}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDirectDriverLoadingListLUNARG {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkDirectDriverLoadingModeLUNARG {@link #mode};
 *     uint32_t {@link #driverCount};
 *     {@link VkDirectDriverLoadingInfoLUNARG VkDirectDriverLoadingInfoLUNARG} const * {@link #pDrivers};
 * }</code></pre>
 */
public class VkDirectDriverLoadingListLUNARG extends Struct<VkDirectDriverLoadingListLUNARG> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MODE,
        DRIVERCOUNT,
        PDRIVERS;

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
        DRIVERCOUNT = layout.offsetof(3);
        PDRIVERS = layout.offsetof(4);
    }

    protected VkDirectDriverLoadingListLUNARG(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDirectDriverLoadingListLUNARG create(long address, @Nullable ByteBuffer container) {
        return new VkDirectDriverLoadingListLUNARG(address, container);
    }

    /**
     * Creates a {@code VkDirectDriverLoadingListLUNARG} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDirectDriverLoadingListLUNARG(ByteBuffer container) {
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
    /** controls the mode in which to load the provided drivers. */
    @NativeType("VkDirectDriverLoadingModeLUNARG")
    public int mode() { return nmode(address()); }
    /** the number of driver manifest paths. */
    @NativeType("uint32_t")
    public int driverCount() { return ndriverCount(address()); }
    /** a pointer to an array of {@code driverCount} {@link VkDirectDriverLoadingInfoLUNARG} structures. */
    @NativeType("VkDirectDriverLoadingInfoLUNARG const *")
    public VkDirectDriverLoadingInfoLUNARG.Buffer pDrivers() { return npDrivers(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDirectDriverLoadingListLUNARG sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link LUNARGDirectDriverLoading#VK_STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_LIST_LUNARG STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_LIST_LUNARG} value to the {@link #sType} field. */
    public VkDirectDriverLoadingListLUNARG sType$Default() { return sType(LUNARGDirectDriverLoading.VK_STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_LIST_LUNARG); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDirectDriverLoadingListLUNARG pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #mode} field. */
    public VkDirectDriverLoadingListLUNARG mode(@NativeType("VkDirectDriverLoadingModeLUNARG") int value) { nmode(address(), value); return this; }
    /** Sets the address of the specified {@link VkDirectDriverLoadingInfoLUNARG.Buffer} to the {@link #pDrivers} field. */
    public VkDirectDriverLoadingListLUNARG pDrivers(@NativeType("VkDirectDriverLoadingInfoLUNARG const *") VkDirectDriverLoadingInfoLUNARG.Buffer value) { npDrivers(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDirectDriverLoadingListLUNARG set(
        int sType,
        long pNext,
        int mode,
        VkDirectDriverLoadingInfoLUNARG.Buffer pDrivers
    ) {
        sType(sType);
        pNext(pNext);
        mode(mode);
        pDrivers(pDrivers);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDirectDriverLoadingListLUNARG set(VkDirectDriverLoadingListLUNARG src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDirectDriverLoadingListLUNARG} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDirectDriverLoadingListLUNARG malloc() {
        return new VkDirectDriverLoadingListLUNARG(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDirectDriverLoadingListLUNARG} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDirectDriverLoadingListLUNARG calloc() {
        return new VkDirectDriverLoadingListLUNARG(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDirectDriverLoadingListLUNARG} instance allocated with {@link BufferUtils}. */
    public static VkDirectDriverLoadingListLUNARG create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDirectDriverLoadingListLUNARG(memAddress(container), container);
    }

    /** Returns a new {@code VkDirectDriverLoadingListLUNARG} instance for the specified memory address. */
    public static VkDirectDriverLoadingListLUNARG create(long address) {
        return new VkDirectDriverLoadingListLUNARG(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDirectDriverLoadingListLUNARG createSafe(long address) {
        return address == NULL ? null : new VkDirectDriverLoadingListLUNARG(address, null);
    }

    /**
     * Returns a new {@link VkDirectDriverLoadingListLUNARG.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDirectDriverLoadingListLUNARG.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDirectDriverLoadingListLUNARG.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDirectDriverLoadingListLUNARG.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDirectDriverLoadingListLUNARG.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDirectDriverLoadingListLUNARG.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDirectDriverLoadingListLUNARG.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDirectDriverLoadingListLUNARG.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDirectDriverLoadingListLUNARG.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDirectDriverLoadingListLUNARG} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDirectDriverLoadingListLUNARG malloc(MemoryStack stack) {
        return new VkDirectDriverLoadingListLUNARG(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDirectDriverLoadingListLUNARG} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDirectDriverLoadingListLUNARG calloc(MemoryStack stack) {
        return new VkDirectDriverLoadingListLUNARG(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDirectDriverLoadingListLUNARG.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDirectDriverLoadingListLUNARG.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDirectDriverLoadingListLUNARG.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDirectDriverLoadingListLUNARG.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDirectDriverLoadingListLUNARG.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDirectDriverLoadingListLUNARG.PNEXT); }
    /** Unsafe version of {@link #mode}. */
    public static int nmode(long struct) { return UNSAFE.getInt(null, struct + VkDirectDriverLoadingListLUNARG.MODE); }
    /** Unsafe version of {@link #driverCount}. */
    public static int ndriverCount(long struct) { return UNSAFE.getInt(null, struct + VkDirectDriverLoadingListLUNARG.DRIVERCOUNT); }
    /** Unsafe version of {@link #pDrivers}. */
    public static VkDirectDriverLoadingInfoLUNARG.Buffer npDrivers(long struct) { return VkDirectDriverLoadingInfoLUNARG.create(memGetAddress(struct + VkDirectDriverLoadingListLUNARG.PDRIVERS), ndriverCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDirectDriverLoadingListLUNARG.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDirectDriverLoadingListLUNARG.PNEXT, value); }
    /** Unsafe version of {@link #mode(int) mode}. */
    public static void nmode(long struct, int value) { UNSAFE.putInt(null, struct + VkDirectDriverLoadingListLUNARG.MODE, value); }
    /** Sets the specified value to the {@code driverCount} field of the specified {@code struct}. */
    public static void ndriverCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDirectDriverLoadingListLUNARG.DRIVERCOUNT, value); }
    /** Unsafe version of {@link #pDrivers(VkDirectDriverLoadingInfoLUNARG.Buffer) pDrivers}. */
    public static void npDrivers(long struct, VkDirectDriverLoadingInfoLUNARG.Buffer value) { memPutAddress(struct + VkDirectDriverLoadingListLUNARG.PDRIVERS, value.address()); ndriverCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int driverCount = ndriverCount(struct);
        long pDrivers = memGetAddress(struct + VkDirectDriverLoadingListLUNARG.PDRIVERS);
        check(pDrivers);
        validate(pDrivers, driverCount, VkDirectDriverLoadingInfoLUNARG.SIZEOF, VkDirectDriverLoadingInfoLUNARG::validate);
    }

    // -----------------------------------

    /** An array of {@link VkDirectDriverLoadingListLUNARG} structs. */
    public static class Buffer extends StructBuffer<VkDirectDriverLoadingListLUNARG, Buffer> implements NativeResource {

        private static final VkDirectDriverLoadingListLUNARG ELEMENT_FACTORY = VkDirectDriverLoadingListLUNARG.create(-1L);

        /**
         * Creates a new {@code VkDirectDriverLoadingListLUNARG.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDirectDriverLoadingListLUNARG#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDirectDriverLoadingListLUNARG getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDirectDriverLoadingListLUNARG#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDirectDriverLoadingListLUNARG.nsType(address()); }
        /** @return the value of the {@link VkDirectDriverLoadingListLUNARG#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDirectDriverLoadingListLUNARG.npNext(address()); }
        /** @return the value of the {@link VkDirectDriverLoadingListLUNARG#mode} field. */
        @NativeType("VkDirectDriverLoadingModeLUNARG")
        public int mode() { return VkDirectDriverLoadingListLUNARG.nmode(address()); }
        /** @return the value of the {@link VkDirectDriverLoadingListLUNARG#driverCount} field. */
        @NativeType("uint32_t")
        public int driverCount() { return VkDirectDriverLoadingListLUNARG.ndriverCount(address()); }
        /** @return a {@link VkDirectDriverLoadingInfoLUNARG.Buffer} view of the struct array pointed to by the {@link VkDirectDriverLoadingListLUNARG#pDrivers} field. */
        @NativeType("VkDirectDriverLoadingInfoLUNARG const *")
        public VkDirectDriverLoadingInfoLUNARG.Buffer pDrivers() { return VkDirectDriverLoadingListLUNARG.npDrivers(address()); }

        /** Sets the specified value to the {@link VkDirectDriverLoadingListLUNARG#sType} field. */
        public VkDirectDriverLoadingListLUNARG.Buffer sType(@NativeType("VkStructureType") int value) { VkDirectDriverLoadingListLUNARG.nsType(address(), value); return this; }
        /** Sets the {@link LUNARGDirectDriverLoading#VK_STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_LIST_LUNARG STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_LIST_LUNARG} value to the {@link VkDirectDriverLoadingListLUNARG#sType} field. */
        public VkDirectDriverLoadingListLUNARG.Buffer sType$Default() { return sType(LUNARGDirectDriverLoading.VK_STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_LIST_LUNARG); }
        /** Sets the specified value to the {@link VkDirectDriverLoadingListLUNARG#pNext} field. */
        public VkDirectDriverLoadingListLUNARG.Buffer pNext(@NativeType("void *") long value) { VkDirectDriverLoadingListLUNARG.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkDirectDriverLoadingListLUNARG#mode} field. */
        public VkDirectDriverLoadingListLUNARG.Buffer mode(@NativeType("VkDirectDriverLoadingModeLUNARG") int value) { VkDirectDriverLoadingListLUNARG.nmode(address(), value); return this; }
        /** Sets the address of the specified {@link VkDirectDriverLoadingInfoLUNARG.Buffer} to the {@link VkDirectDriverLoadingListLUNARG#pDrivers} field. */
        public VkDirectDriverLoadingListLUNARG.Buffer pDrivers(@NativeType("VkDirectDriverLoadingInfoLUNARG const *") VkDirectDriverLoadingInfoLUNARG.Buffer value) { VkDirectDriverLoadingListLUNARG.npDrivers(address(), value); return this; }

    }

}