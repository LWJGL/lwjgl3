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
 * Parameters for serializing an acceleration structure.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The source acceleration structure {@code src} <b>must</b> have been constructed prior to the execution of this command</li>
 * <li>The memory pointed to by {@code dst} <b>must</b> be at least as large as the serialization size of {@code src}, as reported by {@link KHRAccelerationStructure#vkWriteAccelerationStructuresPropertiesKHR WriteAccelerationStructuresPropertiesKHR} or {@link KHRAccelerationStructure#vkCmdWriteAccelerationStructuresPropertiesKHR CmdWriteAccelerationStructuresPropertiesKHR} with a query type of {@link KHRAccelerationStructure#VK_QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR}</li>
 * <li>{@code mode} <b>must</b> be {@link KHRAccelerationStructure#VK_COPY_ACCELERATION_STRUCTURE_MODE_SERIALIZE_KHR COPY_ACCELERATION_STRUCTURE_MODE_SERIALIZE_KHR}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO_KHR STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code src} <b>must</b> be a valid {@code VkAccelerationStructureKHR} handle</li>
 * <li>{@code mode} <b>must</b> be a valid {@code VkCopyAccelerationStructureModeKHR} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDeviceOrHostAddressKHR}, {@link KHRAccelerationStructure#vkCmdCopyAccelerationStructureToMemoryKHR CmdCopyAccelerationStructureToMemoryKHR}, {@link KHRAccelerationStructure#vkCopyAccelerationStructureToMemoryKHR CopyAccelerationStructureToMemoryKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCopyAccelerationStructureToMemoryInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkAccelerationStructureKHR {@link #src};
 *     {@link VkDeviceOrHostAddressKHR VkDeviceOrHostAddressKHR} {@link #dst};
 *     VkCopyAccelerationStructureModeKHR {@link #mode};
 * }</code></pre>
 */
public class VkCopyAccelerationStructureToMemoryInfoKHR extends Struct implements NativeResource {

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
            __member(8),
            __member(VkDeviceOrHostAddressKHR.SIZEOF, VkDeviceOrHostAddressKHR.ALIGNOF),
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
     * Creates a {@code VkCopyAccelerationStructureToMemoryInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyAccelerationStructureToMemoryInfoKHR(ByteBuffer container) {
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
    /** the source acceleration structure for the copy */
    @NativeType("VkAccelerationStructureKHR")
    public long src() { return nsrc(address()); }
    /** the device or host address to memory which is the target for the copy */
    public VkDeviceOrHostAddressKHR dst() { return ndst(address()); }
    /** a {@code VkCopyAccelerationStructureModeKHR} value specifying additional operations to perform during the copy. */
    @NativeType("VkCopyAccelerationStructureModeKHR")
    public int mode() { return nmode(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkCopyAccelerationStructureToMemoryInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO_KHR STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO_KHR} value to the {@link #sType} field. */
    public VkCopyAccelerationStructureToMemoryInfoKHR sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkCopyAccelerationStructureToMemoryInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #src} field. */
    public VkCopyAccelerationStructureToMemoryInfoKHR src(@NativeType("VkAccelerationStructureKHR") long value) { nsrc(address(), value); return this; }
    /** Copies the specified {@link VkDeviceOrHostAddressKHR} to the {@link #dst} field. */
    public VkCopyAccelerationStructureToMemoryInfoKHR dst(VkDeviceOrHostAddressKHR value) { ndst(address(), value); return this; }
    /** Passes the {@link #dst} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkCopyAccelerationStructureToMemoryInfoKHR dst(java.util.function.Consumer<VkDeviceOrHostAddressKHR> consumer) { consumer.accept(dst()); return this; }
    /** Sets the specified value to the {@link #mode} field. */
    public VkCopyAccelerationStructureToMemoryInfoKHR mode(@NativeType("VkCopyAccelerationStructureModeKHR") int value) { nmode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCopyAccelerationStructureToMemoryInfoKHR set(
        int sType,
        long pNext,
        long src,
        VkDeviceOrHostAddressKHR dst,
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
    public VkCopyAccelerationStructureToMemoryInfoKHR set(VkCopyAccelerationStructureToMemoryInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyAccelerationStructureToMemoryInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyAccelerationStructureToMemoryInfoKHR malloc() {
        return wrap(VkCopyAccelerationStructureToMemoryInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkCopyAccelerationStructureToMemoryInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyAccelerationStructureToMemoryInfoKHR calloc() {
        return wrap(VkCopyAccelerationStructureToMemoryInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkCopyAccelerationStructureToMemoryInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkCopyAccelerationStructureToMemoryInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkCopyAccelerationStructureToMemoryInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkCopyAccelerationStructureToMemoryInfoKHR} instance for the specified memory address. */
    public static VkCopyAccelerationStructureToMemoryInfoKHR create(long address) {
        return wrap(VkCopyAccelerationStructureToMemoryInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCopyAccelerationStructureToMemoryInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkCopyAccelerationStructureToMemoryInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkCopyAccelerationStructureToMemoryInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyAccelerationStructureToMemoryInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyAccelerationStructureToMemoryInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyAccelerationStructureToMemoryInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyAccelerationStructureToMemoryInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyAccelerationStructureToMemoryInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkCopyAccelerationStructureToMemoryInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyAccelerationStructureToMemoryInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCopyAccelerationStructureToMemoryInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkCopyAccelerationStructureToMemoryInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyAccelerationStructureToMemoryInfoKHR malloc(MemoryStack stack) {
        return wrap(VkCopyAccelerationStructureToMemoryInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkCopyAccelerationStructureToMemoryInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyAccelerationStructureToMemoryInfoKHR calloc(MemoryStack stack) {
        return wrap(VkCopyAccelerationStructureToMemoryInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkCopyAccelerationStructureToMemoryInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyAccelerationStructureToMemoryInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyAccelerationStructureToMemoryInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyAccelerationStructureToMemoryInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkCopyAccelerationStructureToMemoryInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCopyAccelerationStructureToMemoryInfoKHR.PNEXT); }
    /** Unsafe version of {@link #src}. */
    public static long nsrc(long struct) { return UNSAFE.getLong(null, struct + VkCopyAccelerationStructureToMemoryInfoKHR.SRC); }
    /** Unsafe version of {@link #dst}. */
    public static VkDeviceOrHostAddressKHR ndst(long struct) { return VkDeviceOrHostAddressKHR.create(struct + VkCopyAccelerationStructureToMemoryInfoKHR.DST); }
    /** Unsafe version of {@link #mode}. */
    public static int nmode(long struct) { return UNSAFE.getInt(null, struct + VkCopyAccelerationStructureToMemoryInfoKHR.MODE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyAccelerationStructureToMemoryInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCopyAccelerationStructureToMemoryInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #src(long) src}. */
    public static void nsrc(long struct, long value) { UNSAFE.putLong(null, struct + VkCopyAccelerationStructureToMemoryInfoKHR.SRC, value); }
    /** Unsafe version of {@link #dst(VkDeviceOrHostAddressKHR) dst}. */
    public static void ndst(long struct, VkDeviceOrHostAddressKHR value) { memCopy(value.address(), struct + VkCopyAccelerationStructureToMemoryInfoKHR.DST, VkDeviceOrHostAddressKHR.SIZEOF); }
    /** Unsafe version of {@link #mode(int) mode}. */
    public static void nmode(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyAccelerationStructureToMemoryInfoKHR.MODE, value); }

    // -----------------------------------

    /** An array of {@link VkCopyAccelerationStructureToMemoryInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkCopyAccelerationStructureToMemoryInfoKHR, Buffer> implements NativeResource {

        private static final VkCopyAccelerationStructureToMemoryInfoKHR ELEMENT_FACTORY = VkCopyAccelerationStructureToMemoryInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkCopyAccelerationStructureToMemoryInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyAccelerationStructureToMemoryInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkCopyAccelerationStructureToMemoryInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCopyAccelerationStructureToMemoryInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCopyAccelerationStructureToMemoryInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkCopyAccelerationStructureToMemoryInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCopyAccelerationStructureToMemoryInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkCopyAccelerationStructureToMemoryInfoKHR#src} field. */
        @NativeType("VkAccelerationStructureKHR")
        public long src() { return VkCopyAccelerationStructureToMemoryInfoKHR.nsrc(address()); }
        /** @return a {@link VkDeviceOrHostAddressKHR} view of the {@link VkCopyAccelerationStructureToMemoryInfoKHR#dst} field. */
        public VkDeviceOrHostAddressKHR dst() { return VkCopyAccelerationStructureToMemoryInfoKHR.ndst(address()); }
        /** @return the value of the {@link VkCopyAccelerationStructureToMemoryInfoKHR#mode} field. */
        @NativeType("VkCopyAccelerationStructureModeKHR")
        public int mode() { return VkCopyAccelerationStructureToMemoryInfoKHR.nmode(address()); }

        /** Sets the specified value to the {@link VkCopyAccelerationStructureToMemoryInfoKHR#sType} field. */
        public VkCopyAccelerationStructureToMemoryInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyAccelerationStructureToMemoryInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO_KHR STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO_KHR} value to the {@link VkCopyAccelerationStructureToMemoryInfoKHR#sType} field. */
        public VkCopyAccelerationStructureToMemoryInfoKHR.Buffer sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO_KHR); }
        /** Sets the specified value to the {@link VkCopyAccelerationStructureToMemoryInfoKHR#pNext} field. */
        public VkCopyAccelerationStructureToMemoryInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkCopyAccelerationStructureToMemoryInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyAccelerationStructureToMemoryInfoKHR#src} field. */
        public VkCopyAccelerationStructureToMemoryInfoKHR.Buffer src(@NativeType("VkAccelerationStructureKHR") long value) { VkCopyAccelerationStructureToMemoryInfoKHR.nsrc(address(), value); return this; }
        /** Copies the specified {@link VkDeviceOrHostAddressKHR} to the {@link VkCopyAccelerationStructureToMemoryInfoKHR#dst} field. */
        public VkCopyAccelerationStructureToMemoryInfoKHR.Buffer dst(VkDeviceOrHostAddressKHR value) { VkCopyAccelerationStructureToMemoryInfoKHR.ndst(address(), value); return this; }
        /** Passes the {@link VkCopyAccelerationStructureToMemoryInfoKHR#dst} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkCopyAccelerationStructureToMemoryInfoKHR.Buffer dst(java.util.function.Consumer<VkDeviceOrHostAddressKHR> consumer) { consumer.accept(dst()); return this; }
        /** Sets the specified value to the {@link VkCopyAccelerationStructureToMemoryInfoKHR#mode} field. */
        public VkCopyAccelerationStructureToMemoryInfoKHR.Buffer mode(@NativeType("VkCopyAccelerationStructureModeKHR") int value) { VkCopyAccelerationStructureToMemoryInfoKHR.nmode(address(), value); return this; }

    }

}