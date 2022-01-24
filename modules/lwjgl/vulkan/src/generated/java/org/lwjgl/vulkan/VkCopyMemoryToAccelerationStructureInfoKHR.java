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
 * Parameters for deserializing an acceleration structure.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The source memory pointed to by {@code src} <b>must</b> contain data previously serialized using {@link KHRAccelerationStructure#vkCmdCopyAccelerationStructureToMemoryKHR CmdCopyAccelerationStructureToMemoryKHR}, potentially modified to relocate acceleration structure references as described in that command</li>
 * <li>{@code mode} <b>must</b> be {@link KHRAccelerationStructure#VK_COPY_ACCELERATION_STRUCTURE_MODE_DESERIALIZE_KHR COPY_ACCELERATION_STRUCTURE_MODE_DESERIALIZE_KHR}</li>
 * <li>The data in {@code src} <b>must</b> have a format compatible with the destination physical device as returned by {@link KHRAccelerationStructure#vkGetDeviceAccelerationStructureCompatibilityKHR GetDeviceAccelerationStructureCompatibilityKHR}</li>
 * <li>{@code dst} <b>must</b> have been created with a {@code size} greater than or equal to that used to serialize the data in {@code src}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO_KHR STRUCTURE_TYPE_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code dst} <b>must</b> be a valid {@code VkAccelerationStructureKHR} handle</li>
 * <li>{@code mode} <b>must</b> be a valid {@code VkCopyAccelerationStructureModeKHR} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDeviceOrHostAddressConstKHR}, {@link KHRAccelerationStructure#vkCmdCopyMemoryToAccelerationStructureKHR CmdCopyMemoryToAccelerationStructureKHR}, {@link KHRAccelerationStructure#vkCopyMemoryToAccelerationStructureKHR CopyMemoryToAccelerationStructureKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCopyMemoryToAccelerationStructureInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link VkDeviceOrHostAddressConstKHR VkDeviceOrHostAddressConstKHR} {@link #src};
 *     VkAccelerationStructureKHR {@link #dst};
 *     VkCopyAccelerationStructureModeKHR {@link #mode};
 * }</code></pre>
 */
public class VkCopyMemoryToAccelerationStructureInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRC,
        DST,
        MODE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRC = layout.offsetof(2);
        DST = layout.offsetof(3);
        MODE = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkCopyMemoryToAccelerationStructureInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyMemoryToAccelerationStructureInfoKHR(ByteBuffer container) {
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
    /** the device or host address to memory containing the source data for the copy. */
    public VkDeviceOrHostAddressConstKHR src() { return nsrc(address()); }
    /** the target acceleration structure for the copy. */
    @NativeType("VkAccelerationStructureKHR")
    public long dst() { return ndst(address()); }
    /** a {@code VkCopyAccelerationStructureModeKHR} value specifying additional operations to perform during the copy. */
    @NativeType("VkCopyAccelerationStructureModeKHR")
    public int mode() { return nmode(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkCopyMemoryToAccelerationStructureInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO_KHR STRUCTURE_TYPE_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO_KHR} value to the {@link #sType} field. */
    public VkCopyMemoryToAccelerationStructureInfoKHR sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkCopyMemoryToAccelerationStructureInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@link #src} field. */
    public VkCopyMemoryToAccelerationStructureInfoKHR src(VkDeviceOrHostAddressConstKHR value) { nsrc(address(), value); return this; }
    /** Passes the {@link #src} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkCopyMemoryToAccelerationStructureInfoKHR src(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(src()); return this; }
    /** Sets the specified value to the {@link #dst} field. */
    public VkCopyMemoryToAccelerationStructureInfoKHR dst(@NativeType("VkAccelerationStructureKHR") long value) { ndst(address(), value); return this; }
    /** Sets the specified value to the {@link #mode} field. */
    public VkCopyMemoryToAccelerationStructureInfoKHR mode(@NativeType("VkCopyAccelerationStructureModeKHR") int value) { nmode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCopyMemoryToAccelerationStructureInfoKHR set(
        int sType,
        long pNext,
        VkDeviceOrHostAddressConstKHR src,
        long dst,
        int mode
    ) {
        sType(sType);
        pNext(pNext);
        src(src);
        dst(dst);
        mode(mode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCopyMemoryToAccelerationStructureInfoKHR set(VkCopyMemoryToAccelerationStructureInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyMemoryToAccelerationStructureInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyMemoryToAccelerationStructureInfoKHR malloc() {
        return wrap(VkCopyMemoryToAccelerationStructureInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkCopyMemoryToAccelerationStructureInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyMemoryToAccelerationStructureInfoKHR calloc() {
        return wrap(VkCopyMemoryToAccelerationStructureInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkCopyMemoryToAccelerationStructureInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkCopyMemoryToAccelerationStructureInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkCopyMemoryToAccelerationStructureInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkCopyMemoryToAccelerationStructureInfoKHR} instance for the specified memory address. */
    public static VkCopyMemoryToAccelerationStructureInfoKHR create(long address) {
        return wrap(VkCopyMemoryToAccelerationStructureInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCopyMemoryToAccelerationStructureInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkCopyMemoryToAccelerationStructureInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkCopyMemoryToAccelerationStructureInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToAccelerationStructureInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryToAccelerationStructureInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToAccelerationStructureInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryToAccelerationStructureInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToAccelerationStructureInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkCopyMemoryToAccelerationStructureInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToAccelerationStructureInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCopyMemoryToAccelerationStructureInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkCopyMemoryToAccelerationStructureInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyMemoryToAccelerationStructureInfoKHR malloc(MemoryStack stack) {
        return wrap(VkCopyMemoryToAccelerationStructureInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkCopyMemoryToAccelerationStructureInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyMemoryToAccelerationStructureInfoKHR calloc(MemoryStack stack) {
        return wrap(VkCopyMemoryToAccelerationStructureInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkCopyMemoryToAccelerationStructureInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToAccelerationStructureInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryToAccelerationStructureInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToAccelerationStructureInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkCopyMemoryToAccelerationStructureInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCopyMemoryToAccelerationStructureInfoKHR.PNEXT); }
    /** Unsafe version of {@link #src}. */
    public static VkDeviceOrHostAddressConstKHR nsrc(long struct) { return VkDeviceOrHostAddressConstKHR.create(struct + VkCopyMemoryToAccelerationStructureInfoKHR.SRC); }
    /** Unsafe version of {@link #dst}. */
    public static long ndst(long struct) { return UNSAFE.getLong(null, struct + VkCopyMemoryToAccelerationStructureInfoKHR.DST); }
    /** Unsafe version of {@link #mode}. */
    public static int nmode(long struct) { return UNSAFE.getInt(null, struct + VkCopyMemoryToAccelerationStructureInfoKHR.MODE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyMemoryToAccelerationStructureInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCopyMemoryToAccelerationStructureInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #src(VkDeviceOrHostAddressConstKHR) src}. */
    public static void nsrc(long struct, VkDeviceOrHostAddressConstKHR value) { memCopy(value.address(), struct + VkCopyMemoryToAccelerationStructureInfoKHR.SRC, VkDeviceOrHostAddressConstKHR.SIZEOF); }
    /** Unsafe version of {@link #dst(long) dst}. */
    public static void ndst(long struct, long value) { UNSAFE.putLong(null, struct + VkCopyMemoryToAccelerationStructureInfoKHR.DST, value); }
    /** Unsafe version of {@link #mode(int) mode}. */
    public static void nmode(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyMemoryToAccelerationStructureInfoKHR.MODE, value); }

    // -----------------------------------

    /** An array of {@link VkCopyMemoryToAccelerationStructureInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkCopyMemoryToAccelerationStructureInfoKHR, Buffer> implements NativeResource {

        private static final VkCopyMemoryToAccelerationStructureInfoKHR ELEMENT_FACTORY = VkCopyMemoryToAccelerationStructureInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkCopyMemoryToAccelerationStructureInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyMemoryToAccelerationStructureInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkCopyMemoryToAccelerationStructureInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCopyMemoryToAccelerationStructureInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCopyMemoryToAccelerationStructureInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkCopyMemoryToAccelerationStructureInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCopyMemoryToAccelerationStructureInfoKHR.npNext(address()); }
        /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@link VkCopyMemoryToAccelerationStructureInfoKHR#src} field. */
        public VkDeviceOrHostAddressConstKHR src() { return VkCopyMemoryToAccelerationStructureInfoKHR.nsrc(address()); }
        /** @return the value of the {@link VkCopyMemoryToAccelerationStructureInfoKHR#dst} field. */
        @NativeType("VkAccelerationStructureKHR")
        public long dst() { return VkCopyMemoryToAccelerationStructureInfoKHR.ndst(address()); }
        /** @return the value of the {@link VkCopyMemoryToAccelerationStructureInfoKHR#mode} field. */
        @NativeType("VkCopyAccelerationStructureModeKHR")
        public int mode() { return VkCopyMemoryToAccelerationStructureInfoKHR.nmode(address()); }

        /** Sets the specified value to the {@link VkCopyMemoryToAccelerationStructureInfoKHR#sType} field. */
        public VkCopyMemoryToAccelerationStructureInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyMemoryToAccelerationStructureInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO_KHR STRUCTURE_TYPE_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO_KHR} value to the {@link VkCopyMemoryToAccelerationStructureInfoKHR#sType} field. */
        public VkCopyMemoryToAccelerationStructureInfoKHR.Buffer sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO_KHR); }
        /** Sets the specified value to the {@link VkCopyMemoryToAccelerationStructureInfoKHR#pNext} field. */
        public VkCopyMemoryToAccelerationStructureInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkCopyMemoryToAccelerationStructureInfoKHR.npNext(address(), value); return this; }
        /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@link VkCopyMemoryToAccelerationStructureInfoKHR#src} field. */
        public VkCopyMemoryToAccelerationStructureInfoKHR.Buffer src(VkDeviceOrHostAddressConstKHR value) { VkCopyMemoryToAccelerationStructureInfoKHR.nsrc(address(), value); return this; }
        /** Passes the {@link VkCopyMemoryToAccelerationStructureInfoKHR#src} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkCopyMemoryToAccelerationStructureInfoKHR.Buffer src(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(src()); return this; }
        /** Sets the specified value to the {@link VkCopyMemoryToAccelerationStructureInfoKHR#dst} field. */
        public VkCopyMemoryToAccelerationStructureInfoKHR.Buffer dst(@NativeType("VkAccelerationStructureKHR") long value) { VkCopyMemoryToAccelerationStructureInfoKHR.ndst(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyMemoryToAccelerationStructureInfoKHR#mode} field. */
        public VkCopyMemoryToAccelerationStructureInfoKHR.Buffer mode(@NativeType("VkCopyAccelerationStructureModeKHR") int value) { VkCopyMemoryToAccelerationStructureInfoKHR.nmode(address(), value); return this; }

    }

}