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
 * Structure specifying build sizes for an acceleration structure.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_SIZES_INFO_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_SIZES_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRAccelerationStructure#vkGetAccelerationStructureBuildSizesKHR GetAccelerationStructureBuildSizesKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAccelerationStructureBuildSizesInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDeviceSize {@link #accelerationStructureSize};
 *     VkDeviceSize {@link #updateScratchSize};
 *     VkDeviceSize {@link #buildScratchSize};
 * }</code></pre>
 */
public class VkAccelerationStructureBuildSizesInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ACCELERATIONSTRUCTURESIZE,
        UPDATESCRATCHSIZE,
        BUILDSCRATCHSIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ACCELERATIONSTRUCTURESIZE = layout.offsetof(2);
        UPDATESCRATCHSIZE = layout.offsetof(3);
        BUILDSCRATCHSIZE = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkAccelerationStructureBuildSizesInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureBuildSizesInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the size in bytes required in a {@code VkAccelerationStructureKHR} for a build or update operation. */
    @NativeType("VkDeviceSize")
    public long accelerationStructureSize() { return naccelerationStructureSize(address()); }
    /** the size in bytes required in a scratch buffer for an update operation. */
    @NativeType("VkDeviceSize")
    public long updateScratchSize() { return nupdateScratchSize(address()); }
    /** the size in bytes required in a scratch buffer for a build operation. */
    @NativeType("VkDeviceSize")
    public long buildScratchSize() { return nbuildScratchSize(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkAccelerationStructureBuildSizesInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkAccelerationStructureBuildSizesInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #accelerationStructureSize} field. */
    public VkAccelerationStructureBuildSizesInfoKHR accelerationStructureSize(@NativeType("VkDeviceSize") long value) { naccelerationStructureSize(address(), value); return this; }
    /** Sets the specified value to the {@link #updateScratchSize} field. */
    public VkAccelerationStructureBuildSizesInfoKHR updateScratchSize(@NativeType("VkDeviceSize") long value) { nupdateScratchSize(address(), value); return this; }
    /** Sets the specified value to the {@link #buildScratchSize} field. */
    public VkAccelerationStructureBuildSizesInfoKHR buildScratchSize(@NativeType("VkDeviceSize") long value) { nbuildScratchSize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureBuildSizesInfoKHR set(
        int sType,
        long pNext,
        long accelerationStructureSize,
        long updateScratchSize,
        long buildScratchSize
    ) {
        sType(sType);
        pNext(pNext);
        accelerationStructureSize(accelerationStructureSize);
        updateScratchSize(updateScratchSize);
        buildScratchSize(buildScratchSize);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureBuildSizesInfoKHR set(VkAccelerationStructureBuildSizesInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureBuildSizesInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureBuildSizesInfoKHR malloc() {
        return wrap(VkAccelerationStructureBuildSizesInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkAccelerationStructureBuildSizesInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureBuildSizesInfoKHR calloc() {
        return wrap(VkAccelerationStructureBuildSizesInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkAccelerationStructureBuildSizesInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureBuildSizesInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkAccelerationStructureBuildSizesInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureBuildSizesInfoKHR} instance for the specified memory address. */
    public static VkAccelerationStructureBuildSizesInfoKHR create(long address) {
        return wrap(VkAccelerationStructureBuildSizesInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureBuildSizesInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkAccelerationStructureBuildSizesInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkAccelerationStructureBuildSizesInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildSizesInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureBuildSizesInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildSizesInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureBuildSizesInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildSizesInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkAccelerationStructureBuildSizesInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildSizesInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureBuildSizesInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureBuildSizesInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkAccelerationStructureBuildSizesInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkAccelerationStructureBuildSizesInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkAccelerationStructureBuildSizesInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkAccelerationStructureBuildSizesInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureBuildSizesInfoKHR mallocStack(MemoryStack stack) {
        return wrap(VkAccelerationStructureBuildSizesInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkAccelerationStructureBuildSizesInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureBuildSizesInfoKHR callocStack(MemoryStack stack) {
        return wrap(VkAccelerationStructureBuildSizesInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkAccelerationStructureBuildSizesInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildSizesInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkAccelerationStructureBuildSizesInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildSizesInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkAccelerationStructureBuildSizesInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildSizesInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureBuildSizesInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildSizesInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureBuildSizesInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAccelerationStructureBuildSizesInfoKHR.PNEXT); }
    /** Unsafe version of {@link #accelerationStructureSize}. */
    public static long naccelerationStructureSize(long struct) { return UNSAFE.getLong(null, struct + VkAccelerationStructureBuildSizesInfoKHR.ACCELERATIONSTRUCTURESIZE); }
    /** Unsafe version of {@link #updateScratchSize}. */
    public static long nupdateScratchSize(long struct) { return UNSAFE.getLong(null, struct + VkAccelerationStructureBuildSizesInfoKHR.UPDATESCRATCHSIZE); }
    /** Unsafe version of {@link #buildScratchSize}. */
    public static long nbuildScratchSize(long struct) { return UNSAFE.getLong(null, struct + VkAccelerationStructureBuildSizesInfoKHR.BUILDSCRATCHSIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureBuildSizesInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAccelerationStructureBuildSizesInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #accelerationStructureSize(long) accelerationStructureSize}. */
    public static void naccelerationStructureSize(long struct, long value) { UNSAFE.putLong(null, struct + VkAccelerationStructureBuildSizesInfoKHR.ACCELERATIONSTRUCTURESIZE, value); }
    /** Unsafe version of {@link #updateScratchSize(long) updateScratchSize}. */
    public static void nupdateScratchSize(long struct, long value) { UNSAFE.putLong(null, struct + VkAccelerationStructureBuildSizesInfoKHR.UPDATESCRATCHSIZE, value); }
    /** Unsafe version of {@link #buildScratchSize(long) buildScratchSize}. */
    public static void nbuildScratchSize(long struct, long value) { UNSAFE.putLong(null, struct + VkAccelerationStructureBuildSizesInfoKHR.BUILDSCRATCHSIZE, value); }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureBuildSizesInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureBuildSizesInfoKHR, Buffer> implements NativeResource {

        private static final VkAccelerationStructureBuildSizesInfoKHR ELEMENT_FACTORY = VkAccelerationStructureBuildSizesInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureBuildSizesInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureBuildSizesInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkAccelerationStructureBuildSizesInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkAccelerationStructureBuildSizesInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAccelerationStructureBuildSizesInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkAccelerationStructureBuildSizesInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAccelerationStructureBuildSizesInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkAccelerationStructureBuildSizesInfoKHR#accelerationStructureSize} field. */
        @NativeType("VkDeviceSize")
        public long accelerationStructureSize() { return VkAccelerationStructureBuildSizesInfoKHR.naccelerationStructureSize(address()); }
        /** @return the value of the {@link VkAccelerationStructureBuildSizesInfoKHR#updateScratchSize} field. */
        @NativeType("VkDeviceSize")
        public long updateScratchSize() { return VkAccelerationStructureBuildSizesInfoKHR.nupdateScratchSize(address()); }
        /** @return the value of the {@link VkAccelerationStructureBuildSizesInfoKHR#buildScratchSize} field. */
        @NativeType("VkDeviceSize")
        public long buildScratchSize() { return VkAccelerationStructureBuildSizesInfoKHR.nbuildScratchSize(address()); }

        /** Sets the specified value to the {@link VkAccelerationStructureBuildSizesInfoKHR#sType} field. */
        public VkAccelerationStructureBuildSizesInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkAccelerationStructureBuildSizesInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureBuildSizesInfoKHR#pNext} field. */
        public VkAccelerationStructureBuildSizesInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkAccelerationStructureBuildSizesInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureBuildSizesInfoKHR#accelerationStructureSize} field. */
        public VkAccelerationStructureBuildSizesInfoKHR.Buffer accelerationStructureSize(@NativeType("VkDeviceSize") long value) { VkAccelerationStructureBuildSizesInfoKHR.naccelerationStructureSize(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureBuildSizesInfoKHR#updateScratchSize} field. */
        public VkAccelerationStructureBuildSizesInfoKHR.Buffer updateScratchSize(@NativeType("VkDeviceSize") long value) { VkAccelerationStructureBuildSizesInfoKHR.nupdateScratchSize(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureBuildSizesInfoKHR#buildScratchSize} field. */
        public VkAccelerationStructureBuildSizesInfoKHR.Buffer buildScratchSize(@NativeType("VkDeviceSize") long value) { VkAccelerationStructureBuildSizesInfoKHR.nbuildScratchSize(address(), value); return this; }

    }

}